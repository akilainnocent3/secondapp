package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.globalpay.customview.PaymentAccountView;

/* JADX INFO: loaded from: classes5.dex */
public final class x500 implements g6i0 {
    public final PaymentAccountView a;
    public final AppCompatImageView b;
    public final ClearEditText c;
    public final TextView d;

    public x500(PaymentAccountView paymentAccountView, AppCompatImageView appCompatImageView, ClearEditText clearEditText, TextView textView) {
        this.a = paymentAccountView;
        this.b = appCompatImageView;
        this.c = clearEditText;
        this.d = textView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
