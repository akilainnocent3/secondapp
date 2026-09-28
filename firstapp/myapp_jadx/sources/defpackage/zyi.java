package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.globalpay.customview.PaymentAccountView;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes5.dex */
public final class zyi implements g6i0 {
    public final ProgressButton A;
    public final TextView B;
    public final AppCompatImageView C;
    public final TextView D;
    public final ConstraintLayout a;
    public final HintView b;
    public final PaymentAccountView c;
    public final ClearEditText d;
    public final TextView e;
    public final TextView f;
    public final TextView i;
    public final TextView v;
    public final LinearLayout w;
    public final ImageView y;
    public final TextView z;

    public zyi(ConstraintLayout constraintLayout, HintView hintView, PaymentAccountView paymentAccountView, ClearEditText clearEditText, TextView textView, TextView textView2, TextView textView3, TextView textView4, LinearLayout linearLayout, ImageView imageView, TextView textView5, ProgressButton progressButton, TextView textView6, AppCompatImageView appCompatImageView, TextView textView7) {
        this.a = constraintLayout;
        this.b = hintView;
        this.c = paymentAccountView;
        this.d = clearEditText;
        this.e = textView;
        this.f = textView2;
        this.i = textView3;
        this.v = textView4;
        this.w = linearLayout;
        this.y = imageView;
        this.z = textView5;
        this.A = progressButton;
        this.B = textView6;
        this.C = appCompatImageView;
        this.D = textView7;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
