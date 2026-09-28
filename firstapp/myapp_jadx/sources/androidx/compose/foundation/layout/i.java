package androidx.compose.foundation.layout;

import defpackage.a160;
import defpackage.c3c;
import defpackage.hsz;
import defpackage.kt;
import defpackage.mmd;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends androidx.compose.ui.d.c implements hsz {

    public static final class a extends i {
        public kt D;

        @Override // defpackage.hsz
        public final Object U(mmd mmdVar, Object obj) {
            a160 a160Var = obj instanceof a160 ? (a160) obj : null;
            if (a160Var == null) {
                a160Var = new a160(0);
            }
            int i = c3c.a;
            a160Var.c = new c3c.a(new b.a(this.D));
            return a160Var;
        }
    }
}
