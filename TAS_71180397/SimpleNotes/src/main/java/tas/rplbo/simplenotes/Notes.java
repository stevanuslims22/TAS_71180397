package tas.rplbo.simplenotes;
import java.io.*;

public class Notes {
    private String notesName;


    public Notes(String notesName){
        this.notesName = notesName;
    }

    public Notes() {

    }

    public void addNotes(String notesName){
        System.out.println("========Menambahkan notes=========");

    }
    public void showNotes(){
        System.out.println("=======Menampilkan isi notes========");
        for (int i = 1; i <= 50;i++){
            System.out.println(i +"." + notesName);
        }
    }
    public static Notes loadNotes(String notesName) {
        Notes n = null;
        try {
            FileInputStream fileIn = new FileInputStream("/tmp/notes.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            n = (Notes) in.readObject();
            in.close();
            fileIn.close();
        } catch (NotesException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return n;
    }
    public void saveNotes(){
        Notes n = null;
        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/notes.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(n);
            out.close();
            fileOut.close();
            System.out.printf("data telah ter-serialisasi ke /tmp/notes.ser");
        } catch (NotesException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
