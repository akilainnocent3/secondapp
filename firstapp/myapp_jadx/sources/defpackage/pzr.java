package defpackage;

import androidx.compose.ui.layout.y;
import com.google.protobuf.Reader;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class pzr extends o {
    public final azr b;
    public final oxr c;
    public final long d;

    public pzr(long j, boolean z, azr azrVar, oxr oxrVar) {
        super(1);
        this.b = azrVar;
        this.c = oxrVar;
        this.d = oxa.b(0, z ? kxa.i(j) : Integer.MAX_VALUE, z ? Reader.READ_DONE : kxa.h(j), 5);
    }

    public static ozr o0(hzr hzrVar, int i) {
        long j = hzrVar.d;
        azr azrVar = hzrVar.b;
        return hzrVar.n0(i, azrVar.g(i), azrVar.e(i), hzrVar.Z(hzrVar.c, i, j), j);
    }

    @Override // defpackage.o
    public final pxr U(int i, int i2, int i3, long j) {
        azr azrVar = this.b;
        return n0(i, azrVar.g(i), azrVar.e(i), Z(this.c, i, j), j);
    }

    public abstract ozr n0(int i, Object obj, Object obj2, List<? extends y> list, long j);
}
