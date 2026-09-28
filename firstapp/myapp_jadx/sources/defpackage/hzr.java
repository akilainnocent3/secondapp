package defpackage;

import androidx.compose.ui.layout.y;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hzr extends pzr {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ oxr f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ ht.b i;
    public final /* synthetic */ ht.c j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ long n;
    public final /* synthetic */ zzr o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzr(long j, boolean z, azr azrVar, oxr oxrVar, int i, int i2, ht.b bVar, ht.c cVar, boolean z2, int i3, int i4, long j2, zzr zzrVar) {
        super(j, z, azrVar, oxrVar);
        this.e = z;
        this.f = oxrVar;
        this.g = i;
        this.h = i2;
        this.i = bVar;
        this.j = cVar;
        this.k = z2;
        this.l = i3;
        this.m = i4;
        this.n = j2;
        this.o = zzrVar;
    }

    @Override // defpackage.pzr
    public final ozr n0(int i, Object obj, Object obj2, List<? extends y> list, long j) {
        return new ozr(i, list, this.e, this.i, this.j, this.f.b.getLayoutDirection(), this.k, this.l, this.m, i == this.g + (-1) ? 0 : this.h, this.n, obj, obj2, this.o.n, j);
    }
}
