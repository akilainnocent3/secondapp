package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.sportybet.android.account.international.verify.INTVerifyFragment;
import com.sportybet.android.account.international.widget.INTOTPInputView;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class dxm implements TextWatcher {
    public final /* synthetic */ INTVerifyFragment a;
    public final /* synthetic */ INTOTPInputView b;

    public dxm(INTVerifyFragment iNTVerifyFragment, INTOTPInputView iNTOTPInputView) {
        this.a = iNTVerifyFragment;
        this.b = iNTOTPInputView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        wwd0 wwd0Var = this.a.D;
        Iterator<T> it = this.b.getInputList().iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((EditText) it.next()).getText().length();
        }
        osa0.a(length == 6, wwd0Var, null);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
