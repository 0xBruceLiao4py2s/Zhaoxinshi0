package com.example.dllo.homemycar.imageloader; /*
        quu..__
         $$$b  `---.__
          "$$b        `--.                          ___.---uuudP
           `$$b           `.__.------.__     __.---'      $$$$"              .
             "$b          -'            `-.-'            $$$"              .'|
               ".                                       d$"             _.'  |
                 `.   /                              ..."             .'     |
                   `./                           ..::-'            _.'       |
                    /                         .:::-'            .-'         .'
                   :                          ::''\          _.'            |
                  .' .-.             .-.           `.      .'               |
                  : /'$$|           .@"$\           `.   .'              _.-'
                 .'|$u$$|          |$$,$$|           |  <            _.-'
                 | `:$$:'          :$$$$$:           `.  `.       .-'
                 :                  `"--'             |    `-.     \
                :                |                |#'     `..'`..'          `                 \                                   xXX|     /    ./
                  \                                xXXX'|    /   ./
                  /`-.                                  `.  /   /
                 :    `-  ...........,                   | /  .'
                 |         ``:::::::'       .            |<    `.
                 |             ```          |           x| \ `.:``.
                 |                         .'    /'   xXX|  `:`M`M':.
                 |    |                    ;    /:' xXXX'|  -'MMMMM:'
                 `.  .'                   :    /:'       |-'MMMM.-'
                  |  |                   .'   /'        .'MMM.-'
                  `'`'                   :  ,'          |MMM<
                    |                     `'            |tbap\
                     \                                  :MM.-'
                      \                 |              .''
                       \.               `.            /
                        /     .:::::::.. :           /
                       |     .:::::::::::`.         /
                       |   .:::------------\       /
                      /   .''               >::'  /
                      `',:                 :    .'
                                           `:.:'

         
        */

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;

import com.android.volley.toolbox.ImageLoader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by dllo on 16/9/22.
 */
//????????????
public class DiskCache implements ImageLoader.ImageCache {

    private final File cacheDir;

    public DiskCache(Context context) {
        //??????????????????
        cacheDir = context.getCacheDir();
        if (!cacheDir.exists()) {//????????????????????????,????????????????????????
            //??????
            cacheDir.mkdir();


        }
    }

    @Override
    public Bitmap getBitmap(String url) {
        String name = MD5Util.getMD5String(url);
        File image = new File(cacheDir, name);
        if (image.exists()){
            return null;
        }
        //????????????????????????????????????
        Bitmap bitmap = BitmapFactory.decodeFile(image.getPath());
        return bitmap;
    }

    @Override
    public void putBitmap(String url, Bitmap bitmap) {

        //???url ??? MD5 ????????????
        String name = MD5Util.getMD5String(url);
        File image = new File(cacheDir, name);

        try {
            if (image.exists()) {
                //???????????????????????????,???????????????????????????

                image.createNewFile();

            }
            //??????????????????
            FileOutputStream fos = new FileOutputStream(image);
            //??????????????????????????????
            ByteArrayOutputStream byteArrayOutputStream = new
                    ByteArrayOutputStream();
            //????????????????????????????????????????????????
            bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
            byte[] bytes = byteArrayOutputStream.toByteArray();
            fos.write(bytes);
            byteArrayOutputStream.close();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
