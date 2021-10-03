package ass04;

import java.io.*;
import java.sql.Array;
import java.util.ArrayList;

public class LoadHudDisplays implements LoadDisplayInterface {

    private String fileName;

    public LoadHudDisplays(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public ArrayList<String> load() {
        ArrayList<String> s = new ArrayList<>();
        try{
            //파일 객체 생성
            File file = new File(fileName);
            //입력 스트림 생성
            FileReader filereader = new FileReader(file);
            //입력 버퍼 생성
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";
            while((line = bufReader.readLine()) != null){
                s.add(line);
            }
            //.readLine()은 끝에 개행문자를 읽지 않는다.
            bufReader.close();

        }catch (FileNotFoundException e) {
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }


        return s;
    }
}
