package com.sportygames.sportysoccer.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import defpackage.bwx;
import defpackage.hpa0;
import defpackage.wij;

/* JADX INFO: loaded from: classes8.dex */
public class ButtonLayout extends RelativeLayout {
    public TextView a;
    public ImageView b;
    public View.OnClickListener c;
    public a d;

    public class a extends bwx {
        public a() {
        }

        @Override // defpackage.bwx
        public final void a(View view) {
            View.OnClickListener onClickListener = ButtonLayout.this.c;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            hpa0 hpa0Var = wij.a().c;
            if (hpa0Var != null) {
                hpa0Var.b();
            }
        }
    }

    public ButtonLayout(Context context) {
        super(context);
    }

    public final void a(int i, int i2, String str) {
        this.a.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.sg_button_layout_size_small));
        if (i == 100) {
            setBackgroundResource(R.drawable.sg_btn_bg_green);
        } else if (i == 101) {
            setBackgroundResource(R.drawable.sg_btn_bg_dark);
        }
        setText(str);
        ImageView imageView = this.b;
        if (i2 == -1) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            setImage(i2);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.ss_button_text);
        this.b = (ImageView) findViewById(R.id.ss_button_image);
        this.d = new a();
    }

    public void setImage(int i) {
        this.b.setImageResource(i);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.c = onClickListener;
        super.setOnClickListener(this.d);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public ButtonLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ButtonLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
