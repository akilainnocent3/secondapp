package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.CountdownButton;
import com.sporty.android.common_ui.widgets.SmsInputView;

/* JADX INFO: loaded from: classes5.dex */
public final class tyi implements g6i0 {
    public final ConstraintLayout a;
    public final ImageButton b;
    public final TextView c;
    public final View d;
    public final ProgressBar e;
    public final TextView f;
    public final CountdownButton i;
    public final SmsInputView v;

    public tyi(ConstraintLayout constraintLayout, ImageButton imageButton, TextView textView, View view, ProgressBar progressBar, TextView textView2, CountdownButton countdownButton, SmsInputView smsInputView) {
        this.a = constraintLayout;
        this.b = imageButton;
        this.c = textView;
        this.d = view;
        this.e = progressBar;
        this.f = textView2;
        this.i = countdownButton;
        this.v = smsInputView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
