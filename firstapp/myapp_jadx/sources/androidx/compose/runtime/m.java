package androidx.compose.runtime;

import defpackage.bbe0;
import defpackage.y5a0;
import defpackage.ytw;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m {
    public static final <T> ytw<T> a(T t, y5a0<T> y5a0Var) {
        return new ParcelableSnapshotMutableState(t, y5a0Var);
    }

    public static ytw b(Object obj) {
        return new ParcelableSnapshotMutableState(obj, bbe0.b);
    }

    public static final ytw c(Object obj, a aVar) {
        Object objY = aVar.y();
        if (objY == a.C0041a.a) {
            objY = b(obj);
            aVar.r(objY);
        }
        ytw ytwVar = (ytw) objY;
        ytwVar.setValue(obj);
        return ytwVar;
    }
}
