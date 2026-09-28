package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.c6f;

/* JADX INFO: loaded from: classes4.dex */
public class SimpleActionBar extends ConstraintLayout {
    public ImageButton F;
    public DoubleTextViewWithSeparator G;
    public TextView H;
    public TextView I;
    public ImageButton J;
    public ImageButton K;
    public ImageButton L;
    public View M;

    public SimpleActionBar(Context context) {
        super(context);
    }

    public TextView getTitleView() {
        return this.H;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        ImageButton imageButton = (ImageButton) findViewById(R.id.simple_action_bar_back);
        this.F = imageButton;
        imageButton.setVisibility(8);
        this.G = (DoubleTextViewWithSeparator) findViewById(R.id.double_text_view_with_separator);
        TextView textView = (TextView) findViewById(R.id.title);
        this.H = textView;
        textView.setVisibility(8);
        TextView textView2 = (TextView) findViewById(R.id.primary_action);
        this.I = textView2;
        textView2.setVisibility(8);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.primary_action_icon);
        this.J = imageButton2;
        imageButton2.setVisibility(8);
        View viewFindViewById = findViewById(R.id.divider_line);
        this.M = viewFindViewById;
        viewFindViewById.setVisibility(8);
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.search);
        this.K = imageButton3;
        imageButton3.setVisibility(8);
        ImageButton imageButton4 = (ImageButton) findViewById(R.id.home);
        this.L = imageButton4;
        imageButton4.setVisibility(8);
    }

    public void setBackButton(View.OnClickListener onClickListener) {
        this.F.setOnClickListener(onClickListener);
        this.F.setVisibility(0);
    }

    public void setDividerLineVisible(int i) {
        this.M.setVisibility(i);
    }

    public void setDoubleTextWithSeparatorTitle(String str, String str2, String str3) {
        this.H.setVisibility(8);
        this.G.setDoubleTextWithSeparator(new c6f(str, str3, str2));
        this.G.setVisibleWithFadeAnimation();
    }

    public void setHomeButton(View.OnClickListener onClickListener) {
        this.L.setOnClickListener(onClickListener);
        this.L.setVisibility(0);
    }

    public void setPrimaryActionButtonActivate(boolean z) {
        this.I.setActivated(z);
    }

    public void setPrimaryActionButtonBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        this.I.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public void setPrimaryActionButtonText(String str) {
        this.I.setText(str);
    }

    public void setPrimaryActionButtonVisible(int i) {
        this.I.setVisibility(i);
        this.M.setVisibility(i);
    }

    public void setPrimaryActionIconButton(Integer num, View.OnClickListener onClickListener) {
        this.J.setOnClickListener(onClickListener);
        this.J.setImageResource(num.intValue());
        this.J.setVisibility(0);
        this.I.setVisibility(8);
    }

    public void setPrimaryActionTextButton(String str, View.OnClickListener onClickListener) {
        this.I.setOnClickListener(onClickListener);
        this.I.setText(str);
    }

    public void setSearchActionButton(View.OnClickListener onClickListener) {
        this.K.setOnClickListener(onClickListener);
        this.K.setVisibility(0);
    }

    public void setTitle(String str) {
        this.H.setVisibility(0);
        this.H.setText(str);
    }

    public void setTitleWithFadeAnimation(String str) {
        this.G.setVisibility(8);
        this.H.setText(str);
        if (this.H.getVisibility() != 0) {
            this.H.setVisibility(0);
            this.H.setAlpha(0.0f);
            this.H.animate().alpha(1.0f).setDuration(300L).start();
        }
    }

    public SimpleActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SimpleActionBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
