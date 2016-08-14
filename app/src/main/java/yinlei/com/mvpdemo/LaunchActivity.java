package yinlei.com.mvpdemo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * 在此写用途
 *
 * @version V1.0 <描述当前版本功能>
 * @FileName: LaunchActivity.java
 * @author: 若兰明月
 * @date: 2016-08-14 22:28
 */

public class LaunchActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        View target = findViewById(R.id.iv_bg);

        //第一个参数--target  你要对哪个view绑定动画时间
        //第二个参数--propetryName  你要执行的什么动画  动画的属性
        //第三个参数--动画的变化范围(比如缩放动画)
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(target,"alpha",0.0f,1.0f);
        objectAnimator.setDuration(2000);//动画执行的时间
        //启动动画
        objectAnimator.start();

//        objectAnimator.addListener(new Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(Animator animator) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animator) {
//
//            }
//
//            @Override
//            public void onAnimationCancel(Animator animator) {
//
//            }
//
//            @Override
//            public void onAnimationRepeat(Animator animator) {
//
//            }
//        });
//
        //由上面的可以看到   设配器模式  就是我们自己选择
        //我们需要实现的动画的开始   结束什么的
        //而不是需要我们去实现接口中的所有的方法
        objectAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                startActivity(new Intent(LaunchActivity.this,MainActivity.class));
                finish();
            }
        });
    }
}
