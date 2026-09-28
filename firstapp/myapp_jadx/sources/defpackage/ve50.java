package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.account.international.resetpwd.ResetPwdConfirmFragment;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ve50 implements TextWatcher {
    public final /* synthetic */ ClearEditText a;
    public final /* synthetic */ ResetPwdConfirmFragment b;

    public ve50(ClearEditText clearEditText, ResetPwdConfirmFragment resetPwdConfirmFragment) {
        this.a = clearEditText;
        this.b = resetPwdConfirmFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.setError((String) null);
        wwd0 wwd0Var = this.b.y;
        Boolean boolValueOf = Boolean.valueOf(jzz.a.matcher(StringsKt.t0(String.valueOf(editable)).toString()).matches());
        wwd0Var.getClass();
        wwd0Var.k(null, boolValueOf);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
