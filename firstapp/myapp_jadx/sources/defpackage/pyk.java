package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.common.gift.GiftViewModel$clearGiftCacheAndReFetch$1", f = "GiftViewModel.kt", l = {473, 474}, m = "invokeSuspend", v = 2)
public final class pyk extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ yyk b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pyk(yyk yykVar, boolean z, v1b<? super pyk> v1bVar) {
        super(2, v1bVar);
        this.b = yykVar;
        this.c = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pyk(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pyk) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r7.a(r6) == r2) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            yyk r0 = r6.b
            com.sportybet.plugin.realsports.data.local.BetSlipDataStore r1 = r0.B
            y5b r2 = defpackage.y5b.a
            int r3 = r6.a
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L1f
            if (r3 == r5) goto L1b
            if (r3 != r4) goto L14
            defpackage.uj50.b(r7)
            goto L3c
        L14:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L1b:
            defpackage.uj50.b(r7)
            goto L2f
        L1f:
            defpackage.uj50.b(r7)
            wm20 r7 = r1.getBetSlipGiftsJsonString()
            r6.a = r5
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r2) goto L2f
            goto L3b
        L2f:
            wm20 r7 = r1.getBetSlipGiftsTimestamp()
            r6.a = r4
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r2) goto L3c
        L3b:
            return r2
        L3c:
            java.lang.Integer r7 = new java.lang.Integer
            r1 = 0
            r7.<init>(r1)
            boolean r6 = r6.c
            r0.y1(r7, r6)
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
