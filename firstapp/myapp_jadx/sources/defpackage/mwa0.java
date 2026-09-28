package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.sporty.android.common_ui.widgets.ClearEditText;

/* JADX INFO: loaded from: classes5.dex */
public final class mwa0 implements TextWatcher {
    public final /* synthetic */ yva0 a;
    public final /* synthetic */ ClearEditText b;

    public mwa0(yva0 yva0Var, ClearEditText clearEditText) {
        this.a = yva0Var;
        this.b = clearEditText;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        yva0.a aVar = yva0.c0;
        zwa0 zwa0VarC1 = this.a.c1();
        Editable text = this.b.getText();
        String string = text != null ? text.toString() : null;
        if (string == null) {
            string = "";
        }
        zwa0VarC1.T = string;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
