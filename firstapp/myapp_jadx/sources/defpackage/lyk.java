package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.plugin.common.gift.GiftViewModel$1$1", f = "GiftViewModel.kt", l = {153, 153}, m = "invokeSuspend", v = 2)
public final class lyk extends tje0 implements Function2<myh<? super Unit>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yyk d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyk(yyk yykVar, boolean z, v1b<? super lyk> v1bVar) {
        super(2, v1bVar);
        this.d = yykVar;
        this.e = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lyk lykVar = new lyk(this.d, this.e, v1bVar);
        lykVar.c = obj;
        return lykVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Unit> myhVar, v1b<? super Unit> v1bVar) {
        return ((lyk) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r6.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L22
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L15
            defpackage.uj50.b(r7)
            goto L43
        L15:
            r6 = 0
            java.lang.String r6 = com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm.QRhtEjah
            defpackage.ib5.a(r6)
            return r5
        L1c:
            myh r0 = r6.a
            defpackage.uj50.b(r7)
            goto L36
        L22:
            defpackage.uj50.b(r7)
            r6.c = r5
            r6.a = r0
            r6.b = r4
            yyk r7 = r6.d
            boolean r2 = r6.e
            java.lang.Object r7 = r7.G1(r2, r6)
            if (r7 != r1) goto L36
            goto L42
        L36:
            r6.c = r5
            r6.a = r5
            r6.b = r3
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r1) goto L43
        L42:
            return r1
        L43:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
