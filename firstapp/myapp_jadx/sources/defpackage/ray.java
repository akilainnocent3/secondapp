package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ray implements TextWatcher {
    public final /* synthetic */ qay a;
    public final /* synthetic */ ClearEditText b;

    public ray(qay qayVar, ClearEditText clearEditText) {
        this.a = qayVar;
        this.b = clearEditText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string;
        boolean z = (editable == null || (string = editable.toString()) == null || nae0.b(string).length() != 12) ? false : true;
        osa0.a(z, this.a.k0, null);
        ClearEditText clearEditText = this.b;
        if (z || editable == null || editable.length() == 0) {
            clearEditText.setError((String) null);
        } else {
            clearEditText.setError(sn5.c(clearEditText, R.string.page_payment__invalid_ott_voucher_pin_length, new Object[0]));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
