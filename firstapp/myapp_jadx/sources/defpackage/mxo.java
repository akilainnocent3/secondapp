package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.account.international.widget.INTOTPInputView;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes5.dex */
public final class mxo implements g6i0 {
    public final ConstraintLayout a;
    public final ImageButton b;
    public final ImageButton c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final ProgressButton i;
    public final INTOTPInputView v;
    public final TextView w;
    public final TextView y;

    public mxo(ConstraintLayout constraintLayout, ImageButton imageButton, ImageButton imageButton2, TextView textView, TextView textView2, TextView textView3, ProgressButton progressButton, INTOTPInputView iNTOTPInputView, TextView textView4, TextView textView5) {
        this.a = constraintLayout;
        this.b = imageButton;
        this.c = imageButton2;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
        this.i = progressButton;
        this.v = iNTOTPInputView;
        this.w = textView4;
        this.y = textView5;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
