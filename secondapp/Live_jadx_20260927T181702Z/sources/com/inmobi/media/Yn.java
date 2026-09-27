package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Yn extends R0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Le f55856b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yn(Le networkRequest, C3862n9 c3862n9) {
        super(c3862n9);
        kotlin.jvm.internal.m0.p(networkRequest, "networkRequest");
        this.f55856b = networkRequest;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.inmobi.media.R0
    public final Object a(or.f fVar) {
        Xn xn2;
        if (fVar instanceof Xn) {
            xn2 = (Xn) fVar;
            int i10 = xn2.f55793c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                xn2.f55793c = i10 - Integer.MIN_VALUE;
            } else {
                xn2 = new Xn(this, (rr.d) fVar);
            }
        } else {
            xn2 = new Xn(this, (rr.d) fVar);
        }
        Object objA = xn2.f55791a;
        Object objL = qr.d.l();
        int i11 = xn2.f55793c;
        if (i11 == 0) {
            dr.j1.n(objA);
            C3977s0 c3977s0 = C3977s0.f57586a;
            Le le2 = this.f55856b;
            xn2.f55793c = 1;
            objA = c3977s0.a(le2, xn2);
            if (objA == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dr.j1.n(objA);
        }
        Ne ne2 = (Ne) objA;
        ms.l lVar = Se.f55501a;
        kotlin.jvm.internal.m0.p(ne2, "<this>");
        return ne2.d().n0(cv.g.f77202b);
    }

    @Override // com.inmobi.media.R0
    public final dr.w2 a(AdResponse adResponse, ds.l lVar) {
        Objects.toString(adResponse);
        V0.a(adResponse, this.f55402a, lVar);
        return dr.w2.f79517a;
    }
}
