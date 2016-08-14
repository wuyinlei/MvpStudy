package yinlei.com.mvpdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<TabItem> mTabItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    private class TabItem {
        //正常情况下显示的图片
        private int imageNormal;
        //选中情况下的显示的图片
        private int imagePress;
        //tab的名字
        private int title;

        private String titleString;

        private Class<? extends Fragment> fragmentClass;

        private View mView;

        private ImageView mImageView;
        private TextView mTextView;
        private Bundle mBundle;

        public TabItem(int imageNormal, int imagePress, int title, Class<? extends Fragment> fragmentClass) {
            this.imageNormal = imageNormal;
            this.imagePress = imagePress;
            this.title = title;
            this.fragmentClass = fragmentClass;
        }

        public Class<? extends Fragment> getFragmentClass() {
            return fragmentClass;
        }

        public int getImageNormal() {
            return imageNormal;
        }

        public int getImagePress() {
            return imagePress;
        }

        public int getTitle() {
            return title;
        }

        public String getTitleString() {
            return titleString;
        }

        public Bundle getBundle() {
            if (mBundle == null) {
                mBundle = new Bundle();
            }
            mBundle.putString("title", getTitleString());
            return mBundle;
        }

        public void setChecked(boolean isChecked) {
            if (mImageView != null) {
                if (isChecked) {
                    mImageView.setImageResource(imagePress);
                } else {
                    mImageView.setImageResource(imageNormal);
                }

                if (mTextView != null && title != 0) {
                    if (isChecked) {
                        mTextView.setTextColor(getResources().getColor(R.color.main_bottom_text_select));
                    } else {
                        mTextView.setTextColor(getResources().getColor(R.color.main_bottom_text_normal));
                    }
                }
            }
        }

        public View getView() {
            if (this.mView == null) {
                this.mView = getLayoutInflater().inflate(R.layout.view_tab_indicator, null);
                mImageView = (ImageView) mView.findViewById(R.id.iv_tab);
                mTextView = (TextView) mView.findViewById(R.id.tv_tab);
                if (this.title == 0) {
                    this.mTextView.setVisibility(View.GONE);
                } else {
                    this.mTextView.setVisibility(View.VISIBLE);
                    this.mTextView.setText(getTitleString());
                }
                this.mImageView.setImageResource(imageNormal);
            }
            return this.mView;
        }
    }
}
