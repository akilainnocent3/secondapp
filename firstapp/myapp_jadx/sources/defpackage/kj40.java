package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.ui.d;

/* JADX INFO: loaded from: classes5.dex */
public final class kj40 {
    public static final d0b a(fx90 fx90Var) {
        boolean z = fx90Var instanceof fx90.a;
        d0b.a.e eVar = d0b.a.b;
        if (z) {
            return eVar;
        }
        if (fx90Var instanceof fx90.b) {
            return d0b.a.c;
        }
        if (fx90Var instanceof fx90.c) {
            return d0b.a.d;
        }
        if (fx90Var == null) {
            return eVar;
        }
        uhc.a();
        return null;
    }

    public static final d b(fx90 fx90Var) {
        boolean z = fx90Var instanceof fx90.a;
        d.a aVar = d.a.b;
        if (z) {
            return j.r(aVar, ((fx90.a) fx90Var).a);
        }
        if (fx90Var instanceof fx90.b) {
            return j.D(j.i(aVar, ((fx90.b) fx90Var).a), null, 3);
        }
        if (fx90Var instanceof fx90.c) {
            return j.A(j.w(aVar, ((fx90.c) fx90Var).a), null, 3);
        }
        if (fx90Var == null) {
            return j.C(aVar, null, 3);
        }
        uhc.a();
        return null;
    }
}
