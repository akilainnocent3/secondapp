package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class evm implements TextWatcher {
    public final /* synthetic */ ztw a;

    public evm(ztw ztwVar) {
        this.a = ztwVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.setValue(Boolean.valueOf(!StringsKt.U(StringsKt.t0(String.valueOf(editable)).toString())));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
