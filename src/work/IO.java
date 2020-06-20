package work;

import java.io.*;

public class IO {
    public static void main(String[] args) throws FileNotFoundException {
        File from = new File("from.txt");
        File aim = new File("aim.txt");
        InputStream is = null;
        OutputStream os = null;
        BufferedOutputStream bos = null;
        BufferedInputStream bis = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(from));
            bos = new BufferedOutputStream(new FileOutputStream(aim));
            byte [] buffer=new byte[8192];
            int  cont=bis.read(buffer);
            if(cont!=-1){
                bos.write(buffer,0,cont);
                bos.flush();
                cont=bis.read(buffer);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();

        }
        catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                bis.close();
                bos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        System.out.println("复制成功");


    }
}
