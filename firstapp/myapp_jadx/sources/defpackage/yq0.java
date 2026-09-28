package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.d;

/* JADX INFO: loaded from: classes.dex */
public class yq0 extends d {
    public yq0() {
    }

    @Override // androidx.fragment.app.d
    public Dialog onCreateDialog(Bundle bundle) {
        return new xq0(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.d
    public void setupDialog(Dialog dialog, int i) {
        if (!(dialog instanceof xq0)) {
            super.setupDialog(dialog, i);
            return;
        }
        xq0 xq0Var = (xq0) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        xq0Var.d().x(1);
    }

    public yq0(int i) {
        super(i);
    }
}
