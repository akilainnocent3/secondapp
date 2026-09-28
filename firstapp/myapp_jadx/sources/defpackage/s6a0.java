package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateSet;

/* JADX INFO: loaded from: classes.dex */
public final class s6a0 {
    public static final Object a = new Object();

    public static final <T> boolean a(uxd0<T> uxd0Var, int i, zg00<? extends T> zg00Var) {
        boolean z;
        synchronized (a) {
            int i2 = uxd0Var.d;
            if (i2 == i) {
                uxd0Var.c = zg00Var;
                z = true;
                uxd0Var.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    public static final <T> uxd0<T> b(SnapshotStateSet<T> snapshotStateSet) {
        uxd0 uxd0Var = snapshotStateSet.a;
        uxd0Var.getClass();
        return (uxd0) n5a0.r(uxd0Var, snapshotStateSet);
    }
}
