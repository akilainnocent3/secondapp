package com.sportybet.plugin.webcontainer.activities;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.sportybet.android.gp.tz.R;
import defpackage.py1;

/* JADX INFO: loaded from: classes7.dex */
public class BaseActivity extends py1 {
    private LinearLayout customTitleView;
    protected CharSequence title;

    private void initTitleView() {
        this.customTitleView = (LinearLayout) findViewById(R.id.title_view);
    }

    public ImageButton getFirstRightTitleImageButton() {
        initTitleView();
        LinearLayout linearLayout = this.customTitleView;
        if (linearLayout != null) {
            return (ImageButton) linearLayout.findViewById(R.id.first_right_image_button);
        }
        return null;
    }

    public AppCompatImageView getLeftCloseButton() {
        initTitleView();
        LinearLayout linearLayout = this.customTitleView;
        if (linearLayout != null) {
            return (AppCompatImageView) linearLayout.findViewById(R.id.tv_close);
        }
        return null;
    }

    public Button getLeftTitleButton() {
        initTitleView();
        LinearLayout linearLayout = this.customTitleView;
        if (linearLayout != null) {
            return (Button) linearLayout.findViewById(R.id.btn_left);
        }
        return null;
    }

    public View getLeftTitleDivider() {
        initTitleView();
        LinearLayout linearLayout = this.customTitleView;
        if (linearLayout != null) {
            return linearLayout.findViewById(R.id.left_divider);
        }
        return null;
    }

    public View getRightButtonArrowUp() {
        initTitleView();
        LinearLayout linearLayout = this.customTitleView;
        if (linearLayout != null) {
            return linearLayout.findViewById(R.id.menu_arrow_up);
        }
        return null;
    }

    public Button getRightTitleButton() {
        initTitleView();
        LinearLayout linearLayout = this.customTitleView;
        if (linearLayout != null) {
            return (Button) linearLayout.findViewById(R.id.btn_right);
        }
        return null;
    }

    public AppCompatTextView getRightTitleText() {
        initTitleView();
        LinearLayout linearLayout = this.customTitleView;
        if (linearLayout != null) {
            return (AppCompatTextView) linearLayout.findViewById(R.id.right_text);
        }
        return null;
    }

    public ImageButton getSecondRightTitleImageButton() {
        initTitleView();
        LinearLayout linearLayout = this.customTitleView;
        if (linearLayout != null) {
            return (ImageButton) linearLayout.findViewById(R.id.second_right_image_button);
        }
        return null;
    }

    public TextView getTitleView() {
        initTitleView();
        LinearLayout linearLayout = this.customTitleView;
        if (linearLayout != null) {
            return (TextView) linearLayout.findViewById(R.id.title_text);
        }
        return null;
    }

    public void hideProgressBar() {
        initTitleView();
        LinearLayout linearLayout = this.customTitleView;
        if (linearLayout != null) {
            ((ProgressBar) linearLayout.findViewById(R.id.progress_bar)).setVisibility(8);
        }
    }

    @Override // android.app.Activity
    public void setTitle(int i) {
        initTitleView();
        if (this.customTitleView != null) {
            this.title = getCMSString(i, new Object[0]);
            TextView textView = (TextView) this.customTitleView.findViewById(R.id.title_text);
            CharSequence charSequence = this.title;
            if (charSequence != null) {
                textView.setText(charSequence);
            }
        }
    }

    public void setTitleBackgroundColor(int i) {
        initTitleView();
        LinearLayout linearLayout = this.customTitleView;
        if (linearLayout != null) {
            linearLayout.setBackgroundColor(i);
        }
    }

    public void setTitleTextSize(float f) {
        initTitleView();
        LinearLayout linearLayout = this.customTitleView;
        if (linearLayout != null) {
            ((TextView) linearLayout.findViewById(R.id.title_text)).setTextSize(f);
        }
    }

    public void showProgressBar() {
        initTitleView();
        LinearLayout linearLayout = this.customTitleView;
        if (linearLayout != null) {
            ((ProgressBar) linearLayout.findViewById(R.id.progress_bar)).setVisibility(0);
        }
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        initTitleView();
        if (this.customTitleView != null) {
            this.title = charSequence.toString();
            ((TextView) this.customTitleView.findViewById(R.id.title_text)).setText(charSequence);
        }
    }
}
