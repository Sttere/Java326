import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static void save(Human[] group, String filename)throws IOException
    {
        java.io.File file = new java.io.File(filename);
        System.out.println(file.getAbsoluteFile());
        file.delete();
        file.createNewFile();

        FileWriter writer = new FileWriter(file);

        for(int i = 0 ; i < group.length; i++)
        {
            writer.write(((Object)group[i]).getClass().getSimpleName() + ":\t" + group[i].toString() + ";");
            writer.write('\n');
        }
        writer.close(); //Потоки обязательно нужно закрывать

        String command = "C:\\Program Files\\Notepad++\\notepad++ " + filename;

        Process process = Runtime.getRuntime().exec(command);
    }
}
