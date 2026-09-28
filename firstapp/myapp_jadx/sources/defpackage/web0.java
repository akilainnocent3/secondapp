package defpackage;

import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class web0 implements g6i0 {
    public final ConstraintLayout a;
    public final EditText b;
    public final EditText c;

    public web0(ConstraintLayout constraintLayout, EditText editText, EditText editText2) {
        this.a = constraintLayout;
        this.b = editText;
        this.c = editText2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
