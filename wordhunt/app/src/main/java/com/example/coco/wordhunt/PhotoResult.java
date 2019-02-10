package com.example.coco.wordhunt;

/*import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;

public class PhotoResult extends Activity{

    final static int CAMERA_RESULT = 0;//声明一个常量，代表结果码
    private Button button;//声明一个Button对象
    private ImageView imageView;//声明一个ImageView对象

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_result);//加载布局文件
        //button = (Button) findViewById(R.id.wrong2);//获取到布局管理器的Button控件
        imageView = (ImageView) findViewById(R.id.pic);//获取到布局管理器的ImageView控件
        //添加按钮点击事件监听器
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);//实例化Intent对象,使用MediaStore的ACTION_IMAGE_CAPTURE常量调用系统相机
                startActivityForResult(intent, CAMERA_RESULT);//开启相机，传入上面的Intent对象
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, intent);
        if(resultCode==RESULT_OK){
            Bundle extras=intent.getExtras();//从Intent中获取附加值
            Bitmap bitmap=(Bitmap) extras.get("data");//从附加值中获取返回的图像
            imageView.setImageBitmap(bitmap);//显示图像
        }
    }

}*/


import android.widget.Button;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.widget.ImageView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.File;

public class PhotoResult extends Activity{

    final static int CAMERA_RESULT = 0;//声明一个常量，代表结果码
    private Button button;//声明一个Button对象
    private ImageView imageView;//声明一个ImageView对象

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_result);//加载布局文件
        String path=getIntent().getStringExtra("picpath");//通过值"picpath"得到照片路径
        ImageView imageview=findViewById(R.id.pic);
        try{FileInputStream fis=new FileInputStream(path);//通过path把照片读到文件输入流中
            Bitmap bitmap=BitmapFactory.decodeStream(fis);//将输入流解码为bitmap
            Matrix matrix=new Matrix();//新建一个矩阵对象
            matrix.setRotate(270);//矩阵旋转操作让照片可以正对着你。但是还存在一个左右对称的问题
//新建位图，第2个参数至第5个参数表示位图的大小，matrix中是旋转后的位图信息，并使bitmap变量指向新的位图对象
            bitmap=Bitmap.createBitmap(bitmap,0,0,bitmap.getWidth(),bitmap.getHeight(),matrix,true);
            //将位图展示在imageview上
            imageview.setImageBitmap(bitmap);}
        catch (FileNotFoundException e){e.printStackTrace();}
        //Bitmap bitmap=BitmapFactory.decodeFile(path);
    }



}
