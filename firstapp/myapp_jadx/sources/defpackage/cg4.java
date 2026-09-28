package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class cg4 implements TextWatcher {
    public final /* synthetic */ bg4 a;
    public final /* synthetic */ ClearEditText b;

    public cg4(bg4 bg4Var, ClearEditText clearEditText) {
        this.a = bg4Var;
        this.b = clearEditText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z = (editable != null && editable.length() == 12) || (editable != null && editable.length() == 16);
        bg4 bg4Var = this.a;
        osa0.a(z, bg4Var.k0, null);
        ClearEditText clearEditText = this.b;
        if (z || editable == null || editable.length() == 0) {
            clearEditText.setError((String) null);
        } else {
            clearEditText.setError(sn5.d(bg4Var, R.string.page_payment__invalid_blu_voucher_pin_length_v2, new Object[0]));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
