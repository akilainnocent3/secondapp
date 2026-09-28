package defpackage;

import com.sportybet.android.data.GetInsureBetOddsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.InsureBetOddsViewModel$fetchData$1", f = "InsureBetOddsViewModel.kt", l = {71, 76}, m = "invokeSuspend", v = 2)
public final class nuo extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public int b;
    public final /* synthetic */ GetInsureBetOddsData c;
    public final /* synthetic */ ouo d;
    public final /* synthetic */ ruo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nuo(GetInsureBetOddsData getInsureBetOddsData, ouo ouoVar, ruo ruoVar, v1b<? super nuo> v1bVar) {
        super(2, v1bVar);
        this.c = getInsureBetOddsData;
        this.d = ouoVar;
        this.e = ruoVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nuo(this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nuo) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (r1.emit(r0, r9) == r2) goto L32;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            ouo r0 = r9.d
            b390 r1 = r0.c
            y5b r2 = defpackage.y5b.a
            int r3 = r9.b
            ruo r4 = r9.e
            com.sportybet.android.data.GetInsureBetOddsData r5 = r9.c
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L25
            if (r3 == r7) goto L1f
            if (r3 != r6) goto L18
            defpackage.uj50.b(r10)
            goto L84
        L18:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            r9 = 0
            return r9
        L1f:
            int r3 = r9.a
            defpackage.uj50.b(r10)
            goto L5d
        L25:
            defpackage.uj50.b(r10)
            int r3 = r5.betType
            r10 = 4
            if (r3 == r10) goto L36
            r10 = 5
            if (r3 == r10) goto L36
            r10 = 6
            if (r3 == r10) goto L36
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L36:
            com.sporty.android.book.domain.entity.BetTypeFlexiBetConfig r10 = r5.flexiBetConfig
            com.sporty.android.book.domain.entity.BetTypeAnyWinConfig r8 = r5.anyWinBetConfig
            if (r10 != 0) goto L41
            if (r8 != 0) goto L41
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L41:
            kotlin.coroutines.CoroutineContext r10 = r9.getContext()
            defpackage.i9p.e(r10)
            nqc r10 = new nqc
            quo r8 = new quo
            r8.<init>(r4)
            r10.<init>(r8)
            r9.a = r3
            r9.b = r7
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r2) goto L5d
            goto L83
        L5d:
            krm r10 = r0.a
            com.sportybet.android.data.GetInsureBetResult r10 = defpackage.vuo.e(r10, r5)
            if (r10 != 0) goto L68
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L68:
            kotlin.coroutines.CoroutineContext r0 = r9.getContext()
            defpackage.i9p.e(r0)
            nqc r0 = new nqc
            suo r5 = new suo
            r5.<init>(r4, r10)
            r0.<init>(r5)
            r9.a = r3
            r9.b = r6
            java.lang.Object r9 = r1.emit(r0, r9)
            if (r9 != r2) goto L84
        L83:
            return r2
        L84:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuo.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
