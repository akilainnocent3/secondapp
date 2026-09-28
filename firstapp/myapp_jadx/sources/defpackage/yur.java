package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yur extends o {
    public final our b;
    public final oxr c;
    public final int d;
    public final /* synthetic */ oxr e;
    public final /* synthetic */ zvr f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yur(our ourVar, oxr oxrVar, int i, zvr zvrVar, int i2, int i3, long j) {
        super(1);
        this.e = oxrVar;
        this.f = zvrVar;
        this.g = i2;
        this.h = i3;
        this.i = j;
        this.b = ourVar;
        this.c = oxrVar;
        this.d = i;
    }

    @Override // defpackage.o
    public final pxr U(int i, int i2, int i3, long j) {
        return n0(i, i2, i3, this.d, j);
    }

    public final hvr n0(int i, int i2, int i3, int i4, long j) {
        int iJ;
        our ourVar = this.b;
        Object objG = ourVar.g(i);
        Object objE = ourVar.e(i);
        List listZ = Z(this.c, i, j);
        if (kxa.g(j)) {
            iJ = kxa.k(j);
        } else {
            if (!kxa.f(j)) {
                zkn.a("does not have fixed height");
            }
            iJ = kxa.j(j);
        }
        asr layoutDirection = this.e.b.getLayoutDirection();
        LazyLayoutItemAnimator<hvr> lazyLayoutItemAnimator = this.f.m;
        return new hvr(i, objG, iJ, i4, layoutDirection, this.g, this.h, listZ, this.i, objE, lazyLayoutItemAnimator, j, i2, i3);
    }
}
