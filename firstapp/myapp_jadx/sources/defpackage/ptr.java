package defpackage;

import androidx.compose.ui.d;

/* JADX INFO: loaded from: classes.dex */
public final class ptr extends d.c implements hsz {
    public float D;
    public boolean E;

    @Override // defpackage.hsz
    public final Object U(mmd mmdVar, Object obj) {
        a160 a160Var = obj instanceof a160 ? (a160) obj : null;
        if (a160Var == null) {
            a160Var = new a160(0);
        }
        a160Var.a = this.D;
        a160Var.b = this.E;
        return a160Var;
    }
}
