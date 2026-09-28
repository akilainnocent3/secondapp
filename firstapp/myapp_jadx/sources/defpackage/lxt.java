package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.main.data.repository.LoyaltyMissionRepositoryImpl$getMultiTaskMissions$1", f = "LoyaltyMissionRepositoryImpl.kt", l = {50, 52}, m = "invokeSuspend", v = 2)
public final class lxt extends tje0 implements Function2<myh<? super List<? extends qlw>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ oxt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxt(oxt oxtVar, v1b<? super lxt> v1bVar) {
        super(2, v1bVar);
        this.c = oxtVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lxt lxtVar = new lxt(this.c, v1bVar);
        lxtVar.b = obj;
        return lxtVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends qlw>> myhVar, v1b<? super Unit> v1bVar) {
        return ((lxt) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L15;
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
            oxt r3 = r7.c
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L21
            if (r2 == r5) goto L1d
            if (r2 != r4) goto L17
            defpackage.uj50.b(r8)
            goto L4a
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r6
        L1d:
            defpackage.uj50.b(r8)
            goto L31
        L21:
            defpackage.uj50.b(r8)
            x430 r8 = r3.a
            r7.b = r0
            r7.a = r5
            java.lang.Object r8 = r8.p(r6, r7)
            if (r8 != r1) goto L31
            goto L49
        L31:
            com.sporty.android.common.network.data.BaseResponse r8 = (com.sporty.android.common.network.data.BaseResponse) r8
            java.lang.Object r8 = defpackage.n52.b(r8)
            java.util.List r8 = (java.util.List) r8
            rlw r2 = r3.c
            java.util.ArrayList r8 = r2.a(r8)
            r7.b = r6
            r7.a = r4
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r1) goto L4a
        L49:
            return r1
        L4a:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxt.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
