package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.data.repository.BettingStreakRepositoryImpl$participateBettingStreakMission$1", f = "BettingStreakRepositoryImpl.kt", l = {85, 89}, m = "invokeSuspend", v = 2)
public final class k34 extends tje0 implements Function2<myh<? super btz>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ n34 c;
    public final /* synthetic */ zsz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k34(n34 n34Var, zsz zszVar, v1b<? super k34> v1bVar) {
        super(2, v1bVar);
        this.c = n34Var;
        this.d = zszVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        k34 k34Var = new k34(this.c, this.d, v1bVar);
        k34Var.b = obj;
        return k34Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super btz> myhVar, v1b<? super Unit> v1bVar) {
        return ((k34) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
    
        if (r2.emit(r0, r9) == r3) goto L29;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            n34 r0 = r9.c
            s04 r1 = r0.c
            java.lang.Object r2 = r9.b
            myh r2 = (defpackage.myh) r2
            y5b r3 = defpackage.y5b.a
            int r4 = r9.a
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L24
            if (r4 == r6) goto L20
            if (r4 != r5) goto L1a
            defpackage.uj50.b(r10)
            goto Lb0
        L1a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r7
        L20:
            defpackage.uj50.b(r10)
            goto L45
        L24:
            defpackage.uj50.b(r10)
            r1.getClass()
            ysz r10 = new ysz
            zsz r4 = r9.d
            boolean r8 = r4.a
            s24 r4 = r4.b
            r4.getClass()
            r10.<init>(r8)
            o04 r0 = r0.b
            r9.b = r2
            r9.a = r6
            java.lang.Object r10 = r0.d(r10, r9)
            if (r10 != r3) goto L45
            goto Laf
        L45:
            com.sporty.android.common.network.data.BaseResponse r10 = (com.sporty.android.common.network.data.BaseResponse) r10
            java.lang.Object r10 = defpackage.n52.b(r10)
            atz r10 = (defpackage.atz) r10
            r1.getClass()
            r10.getClass()
            uag r0 = defpackage.s24.c
            java.util.Iterator r0 = r0.iterator()
        L59:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r0.next()
            r4 = r1
            s24 r4 = (defpackage.s24) r4
            r4.getClass()
            java.lang.String r4 = "PLACING_WAGER"
            java.lang.String r6 = r10.getType()
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L59
            goto L77
        L76:
            r1 = r7
        L77:
            s24 r1 = (defpackage.s24) r1
            uag r0 = defpackage.r24.e
            java.util.Iterator r0 = r0.iterator()
        L7f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L99
            java.lang.Object r4 = r0.next()
            r6 = r4
            r24 r6 = (defpackage.r24) r6
            java.lang.String r6 = r6.a
            java.lang.String r8 = r10.getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_STATUS java.lang.String()
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L7f
            goto L9a
        L99:
            r4 = r7
        L9a:
            r24 r4 = (defpackage.r24) r4
            java.lang.String r10 = r10.getCom.twilio.voice.EventKeys.ERROR_MESSAGE java.lang.String()
            btz r0 = new btz
            r0.<init>(r1, r4, r10)
            r9.b = r7
            r9.a = r5
            java.lang.Object r9 = r2.emit(r0, r9)
            if (r9 != r3) goto Lb0
        Laf:
            return r3
        Lb0:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k34.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
