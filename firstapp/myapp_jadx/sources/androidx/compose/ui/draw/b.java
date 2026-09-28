package androidx.compose.ui.draw;

import androidx.compose.ui.d;
import defpackage.crz;
import defpackage.d0b;
import defpackage.ht;
import defpackage.l58;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static d a(d dVar, crz crzVar, ht htVar, d0b d0bVar, float f, l58 l58Var, int i) {
        if ((i & 4) != 0) {
            htVar = ht.a.e;
        }
        ht htVar2 = htVar;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            l58Var = null;
        }
        return dVar.n(new PainterElement(crzVar, htVar2, d0bVar, f2, l58Var));
    }
}
