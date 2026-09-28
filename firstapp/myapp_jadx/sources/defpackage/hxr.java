package defpackage;

import androidx.compose.ui.layout.h0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hxr implements h0 {
    public final dxr a;
    public final dtw<Object> b = zby.a();

    public hxr(dxr dxrVar) {
        this.a = dxrVar;
    }

    @Override // androidx.compose.ui.layout.h0
    public final void a(h0.a aVar) {
        dtw<Object> dtwVar = this.b;
        dtwVar.a();
        gtw<Object> gtwVar = aVar.a;
        Object[] objArr = gtwVar.b;
        long[] jArr = gtwVar.c;
        int i = gtwVar.e;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object objB = this.a.b(obj);
            int iD = dtwVar.d(objB);
            int i3 = iD >= 0 ? dtwVar.c[iD] : 0;
            if (i3 == 7) {
                aVar.remove(obj);
            } else {
                dtwVar.h(i3 + 1, objB);
            }
            i = i2;
        }
    }

    @Override // androidx.compose.ui.layout.h0
    public final boolean b(Object obj, Object obj2) {
        dxr dxrVar = this.a;
        return Intrinsics.g(dxrVar.b(obj), dxrVar.b(obj2));
    }
}
