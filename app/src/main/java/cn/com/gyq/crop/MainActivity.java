package cn.com.gyq.crop;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cn.com.gyq.crop.view.CropImageView;

public class MainActivity extends Activity {

    CropImageView cropImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cropImageView = (CropImageView) findViewById(R.id.cropImageView);
        cropImageView.setImageResource(R.drawable.timg);

        findViewById(R.id.cropOk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //获取裁剪的图片
                Bitmap cropBitMap = cropImageView.getCroppedImage();
                cropImageView.setImageBitmap(cropBitMap);
            }
        });
    }
}
