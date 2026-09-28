package defpackage;

import com.sporty.android.core.model.loyalty.ParticipateMissionRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.main.data.repository.LoyaltyMissionRepositoryImpl$participateMission$1", f = "LoyaltyMissionRepositoryImpl.kt", l = {57, 58}, m = "invokeSuspend", v = 2)
public final class nxt extends tje0 implements Function2<myh<? super Unit>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ oxt c;
    public final /* synthetic */ ParticipateMissionRequest d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxt(oxt oxtVar, ParticipateMissionRequest participateMissionRequest, v1b<? super nxt> v1bVar) {
        super(2, v1bVar);
        this.c = oxtVar;
        this.d = participateMissionRequest;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nxt nxtVar = new nxt(this.c, this.d, v1bVar);
        nxtVar.b = obj;
        return nxtVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Unit> myhVar, v1b<? super Unit> v1bVar) {
        return ((nxt) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws com.sporty.android.common.network.data.SprThrowable {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r6.a
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L1f
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            defpackage.uj50.b(r7)
            goto L45
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L1b:
            defpackage.uj50.b(r7)
            goto L33
        L1f:
            defpackage.uj50.b(r7)
            oxt r7 = r6.c
            x430 r7 = r7.a
            r6.b = r0
            r6.a = r5
            com.sporty.android.core.model.loyalty.ParticipateMissionRequest r2 = r6.d
            java.lang.Object r7 = r7.G(r2, r6)
            if (r7 != r1) goto L33
            goto L44
        L33:
            com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
            defpackage.n52.c(r7)
            kotlin.Unit r7 = kotlin.Unit.a
            r6.b = r3
            r6.a = r4
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r1) goto L45
        L44:
            return r1
        L45:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxt.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
