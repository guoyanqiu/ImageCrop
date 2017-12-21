实现原理参考博客：http://blog.csdn.net/chunqiuwei/article/details/78858192

参考资料：https://github.com/edmodo/cropper
使用方法：


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
