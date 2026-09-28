package defpackage;

import android.view.View;
import android.widget.TextView;
import com.sportybet.android.account.international.widget.INTOTPEditText;
import com.sportybet.android.account.international.widget.INTOTPInputView;

/* JADX INFO: loaded from: classes5.dex */
public final class kwo implements g6i0 {
    public final INTOTPInputView a;
    public final TextView b;
    public final INTOTPEditText c;
    public final INTOTPEditText d;
    public final INTOTPEditText e;
    public final INTOTPEditText f;
    public final INTOTPEditText i;
    public final INTOTPEditText v;

    public kwo(INTOTPInputView iNTOTPInputView, TextView textView, INTOTPEditText iNTOTPEditText, INTOTPEditText iNTOTPEditText2, INTOTPEditText iNTOTPEditText3, INTOTPEditText iNTOTPEditText4, INTOTPEditText iNTOTPEditText5, INTOTPEditText iNTOTPEditText6) {
        this.a = iNTOTPInputView;
        this.b = textView;
        this.c = iNTOTPEditText;
        this.d = iNTOTPEditText2;
        this.e = iNTOTPEditText3;
        this.f = iNTOTPEditText4;
        this.i = iNTOTPEditText5;
        this.v = iNTOTPEditText6;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
