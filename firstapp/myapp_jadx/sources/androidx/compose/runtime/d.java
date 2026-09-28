package androidx.compose.runtime;

import defpackage.avh0;
import defpackage.b1s;
import defpackage.bbe0;
import defpackage.j730;
import defpackage.lhf;
import defpackage.tyd0;
import defpackage.vna;
import defpackage.y5a0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class d<T> {
    public final b1s a;

    public d() {
        throw null;
    }

    public d(Function0<Object> function0) {
        this.a = new b1s(function0);
    }

    public abstract j730<T> a(T t);

    public avh0<Object> b() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034 A[PHI: r4
      0x0034: PHI (r4v2 java.lang.Object) = (r4v6 java.lang.Object), (r4v7 java.lang.Object) binds: [B:21:0x0041, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public final avh0<T> c(j730<T> j730Var, avh0<T> avh0Var) {
        vna vnaVar;
        Object obj;
        tyd0 tyd0Var;
        lhf lhfVar = null;
        if (avh0Var instanceof lhf) {
            if (j730Var.d) {
                lhfVar = (lhf) avh0Var;
                lhfVar.a.setValue(j730Var.a());
            }
        } else if (avh0Var instanceof tyd0) {
            if ((j730Var.b || j730Var.e != null) && !j730Var.d) {
                tyd0Var = (tyd0) avh0Var;
                if (Intrinsics.g(j730Var.a(), tyd0Var.a)) {
                    obj = vnaVar;
                    obj = tyd0Var;
                    lhfVar = (avh0<T>) obj;
                }
            }
        } else if (avh0Var instanceof vna) {
            j730Var.getClass();
            vnaVar = (vna) avh0Var;
            if (vnaVar.a == null) {
                obj = vnaVar;
                obj = tyd0Var;
                lhfVar = (avh0<T>) obj;
            }
        }
        if (lhfVar != null) {
            return lhfVar;
        }
        if (!j730Var.d) {
            return new tyd0(j730Var.a());
        }
        T t = j730Var.e;
        y5a0 y5a0Var = j730Var.c;
        if (y5a0Var == null) {
            y5a0Var = bbe0.b;
        }
        return new lhf(new ParcelableSnapshotMutableState(t, y5a0Var));
    }
}
