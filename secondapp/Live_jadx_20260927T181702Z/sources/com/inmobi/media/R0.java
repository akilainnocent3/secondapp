package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3862n9 f55402a;

    public R0(C3862n9 c3862n9) {
        this.f55402a = c3862n9;
    }

    public abstract dr.w2 a(AdResponse adResponse, ds.l lVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ds.l lVar, rr.d dVar) {
        P0 p10;
        if (dVar instanceof P0) {
            p10 = (P0) dVar;
            int i10 = p10.f55292d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                p10.f55292d = i10 - Integer.MIN_VALUE;
            } else {
                p10 = new P0(this, dVar);
            }
        } else {
            p10 = new P0(this, dVar);
        }
        Object objA = p10.f55290b;
        Object objL = qr.d.l();
        int i11 = p10.f55292d;
        if (i11 == 0) {
            dr.j1.n(objA);
            lVar.invoke(C3690gb.f56495a);
            p10.f55289a = lVar;
            p10.f55292d = 1;
            objA = a(p10);
            if (objA != objL) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dr.j1.n(objA);
            return objA;
        }
        lVar = p10.f55289a;
        dr.j1.n(objA);
        p10.f55289a = null;
        p10.f55292d = 2;
        Object objA2 = a((String) objA, lVar, p10);
        return objA2 == objL ? objL : objA2;
    }

    public abstract Object a(or.f fVar);

    /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x012b  */
    /* JADX WARN: Code duplicated, block: B:75:0x015b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (r2 == r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0103, code lost:
    
        if (a(r0, r14) == r4) goto L51;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c7 -> B:32:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00c9 -> B:32:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00de -> B:32:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00e0 -> B:32:0x009a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r17, ds.l r18, rr.d r19) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.R0.a(java.lang.String, ds.l, rr.d):java.lang.Object");
    }
}
