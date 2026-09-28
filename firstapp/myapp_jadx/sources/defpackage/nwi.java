package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.globalpay.customview.PaymentAccountView;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes5.dex */
public final class nwi implements g6i0 {
    public final ImageView A;
    public final TextView B;
    public final TextView C;
    public final AppCompatImageView D;
    public final TextView E;
    public final ScrollView a;
    public final HintView b;
    public final PaymentAccountView c;
    public final ClearEditText d;
    public final TextView e;
    public final TextView f;
    public final TextView i;
    public final TextView v;
    public final ProgressButton w;
    public final LinearLayout y;
    public final TextView z;

    public nwi(ScrollView scrollView, HintView hintView, PaymentAccountView paymentAccountView, ClearEditText clearEditText, TextView textView, TextView textView2, TextView textView3, TextView textView4, ProgressButton progressButton, LinearLayout linearLayout, TextView textView5, ImageView imageView, TextView textView6, TextView textView7, AppCompatImageView appCompatImageView, TextView textView8) {
        this.a = scrollView;
        this.b = hintView;
        this.c = paymentAccountView;
        this.d = clearEditText;
        this.e = textView;
        this.f = textView2;
        this.i = textView3;
        this.v = textView4;
        this.w = progressButton;
        this.y = linearLayout;
        this.z = textView5;
        this.A = imageView;
        this.B = textView6;
        this.C = textView7;
        this.D = appCompatImageView;
        this.E = textView8;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
