package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import defpackage.sn5;

/* JADX INFO: loaded from: classes4.dex */
public class CountdownButton extends LinearLayout implements Runnable {
    public final Button a;
    public final TextView b;
    public final ProgressBar c;
    public boolean d;
    public int e;

    public CountdownButton(Context context) {
        super(context);
        this.d = false;
        this.e = 0;
        setOrientation(0);
        setGravity(1);
        View.inflate(getContext(), R.layout.resend_button, this);
        this.a = (Button) findViewById(R.id.countdown);
        this.b = (TextView) findViewById(R.id.time);
        this.c = (ProgressBar) findViewById(R.id.progress);
    }

    public final void a(int i) {
        this.c.setVisibility(8);
        Button button = this.a;
        button.setVisibility(0);
        if (this.d) {
            button.setText(sn5.c(this, R.string.common_otp_verify__regenerate_otp_code, new Object[0]));
        }
        if (i == 0) {
            button.setEnabled(true);
            this.e = 0;
            return;
        }
        int i2 = this.e;
        TextView textView = this.b;
        if (i2 != 0) {
            button.setEnabled(false);
            textView.setVisibility(0);
            if (this.d) {
                i--;
                this.e = i;
            } else {
                this.e = i;
            }
            textView.setText(sn5.c(this, R.string.register_login_int__countdown_sec, String.valueOf(i)));
            return;
        }
        button.setEnabled(false);
        textView.setVisibility(0);
        if (this.d) {
            i--;
            this.e = i;
        } else {
            this.e = i;
        }
        textView.setText(sn5.c(this, R.string.register_login_int__countdown_sec, String.valueOf(i)));
        textView.postDelayed(this, 1000L);
    }

    public final void b() {
        this.c.setVisibility(0);
        this.a.setVisibility(8);
        this.b.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.d;
        int i = this.e;
        TextView textView = this.b;
        Button button = this.a;
        if (z) {
            if (i == 0) {
                textView.setVisibility(8);
                button.setEnabled(true);
                button.setText(sn5.c(this, R.string.common_otp_verify__regenerate_otp_code, new Object[0]));
                button.setTextColor(getContext().getColor(R.color.brand_secondary));
                return;
            }
            int i2 = i - 1;
            this.e = i2;
            textView.setText(sn5.c(this, R.string.register_login_int__countdown_sec, String.valueOf(i2)));
            textView.postDelayed(this, 1000L);
            return;
        }
        int i3 = i - 1;
        this.e = i3;
        if (i3 != 0) {
            textView.setText(sn5.c(this, R.string.register_login_int__countdown_sec, String.valueOf(i3)));
            textView.postDelayed(this, 1000L);
            return;
        }
        textView.setVisibility(8);
        button.setEnabled(true);
        if (this.d) {
            button.setText(sn5.c(this, R.string.common_otp_verify__regenerate_otp_code, new Object[0]));
            button.setTextColor(getContext().getColor(R.color.brand_secondary));
        }
    }

    public void setIsOTP(boolean z) {
        this.d = z;
        if (z) {
            this.a.setText(sn5.c(this, R.string.common_otp_verify__regenerate_otp_code, new Object[0]));
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public void setOtpExpiredText() {
        String strC = sn5.c(this, R.string.common_otp_verify__otp_expired_regenerate, new Object[0]);
        Button button = this.a;
        button.setText(strC);
        button.setTextColor(getContext().getColor(R.color.brand_secondary));
        this.b.setVisibility(8);
        button.setEnabled(true);
    }

    public void setTextColor(int i) {
        this.a.setTextColor(i);
    }

    public void setTextSize(float f) {
        this.a.setTextSize(f);
    }

    public CountdownButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = false;
        this.e = 0;
        setOrientation(0);
        setGravity(1);
        View.inflate(getContext(), R.layout.resend_button, this);
        this.a = (Button) findViewById(R.id.countdown);
        this.b = (TextView) findViewById(R.id.time);
        this.c = (ProgressBar) findViewById(R.id.progress);
    }
}
