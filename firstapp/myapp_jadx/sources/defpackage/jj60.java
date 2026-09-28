package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class jj60 implements TextWatcher {
    public final /* synthetic */ ij60 a;

    public jj60(ij60 ij60Var) {
        this.a = ij60Var;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (String.valueOf(charSequence).length() == 0) {
            return;
        }
        xi60.a aVar = this.a.d;
        if (aVar != null) {
            aVar.n = String.valueOf(charSequence);
        } else {
            Intrinsics.n("dataItem");
            throw null;
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
