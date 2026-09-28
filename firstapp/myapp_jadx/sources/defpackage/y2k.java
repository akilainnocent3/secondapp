package defpackage;

import com.google.protobuf.RuntimeVersion;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.autobet.AutoBetListData;
import com.sporty.android.core.model.patron.KYCBannerItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.autobet.data.GetAutoBetListRepositoryImpl$getAutoBetList$1", f = "GetAutoBetListRepositoryImpl.kt", l = {KYCBannerItem.STATUS_DEPRECATE, RuntimeVersion.MINOR}, m = "invokeSuspend", v = 2)
public final class y2k extends tje0 implements Function2<myh<? super BaseResponse<AutoBetListData>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ z2k c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2k(z2k z2kVar, int i, int i2, v1b v1bVar) {
        super(2, v1bVar);
        this.c = z2kVar;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        y2k y2kVar = new y2k(this.c, this.d, this.e, v1bVar);
        y2kVar.b = obj;
        return y2kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<AutoBetListData>> myhVar, v1b<? super Unit> v1bVar) {
        return ((y2k) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r0.emit((com.sporty.android.common.network.data.BaseResponse) r8, r7) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r7.a
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L1f
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            defpackage.uj50.b(r8)
            goto L44
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r3
        L1b:
            defpackage.uj50.b(r8)
            goto L37
        L1f:
            defpackage.uj50.b(r8)
            z2k r8 = r7.c
            g3z r8 = r8.b
            r7.b = r0
            r7.a = r5
            int r2 = r7.d
            r5 = 10
            int r6 = r7.e
            java.lang.Object r8 = r8.x(r2, r5, r6, r7)
            if (r8 != r1) goto L37
            goto L43
        L37:
            com.sporty.android.common.network.data.BaseResponse r8 = (com.sporty.android.common.network.data.BaseResponse) r8
            r7.b = r3
            r7.a = r4
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r1) goto L44
        L43:
            return r1
        L44:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y2k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
