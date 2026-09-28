package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.main.data.repository.LoyaltyMainRepositoryImpl$getAppliedBoost$1", f = "LoyaltyMainRepositoryImpl.kt", l = {24, 28}, m = "invokeSuspend", v = 2)
public final class awt extends tje0 implements Function2<myh<? super List<? extends bv0>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ cwt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awt(cwt cwtVar, v1b<? super awt> v1bVar) {
        super(2, v1bVar);
        this.c = cwtVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        awt awtVar = new awt(this.c, v1bVar);
        awtVar.b = obj;
        return awtVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends bv0>> myhVar, v1b<? super Unit> v1bVar) {
        return ((awt) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        if (r0.emit(r2, r10) == r1) goto L19;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r10.a
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r11)
            goto L86
        L15:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r10)
            return r5
        L1b:
            defpackage.uj50.b(r11)
            goto L33
        L1f:
            defpackage.uj50.b(r11)
            cwt r11 = r10.c
            q650 r11 = r11.a
            r10.b = r0
            r10.a = r4
            rqt r11 = r11.a
            java.lang.Object r11 = r11.d(r10)
            if (r11 != r1) goto L33
            goto L85
        L33:
            com.sporty.android.common.network.data.BaseResponse r11 = (com.sporty.android.common.network.data.BaseResponse) r11
            java.lang.Object r11 = defpackage.n52.b(r11)
            y15 r11 = (defpackage.y15) r11
            java.util.List r11 = r11.a()
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.l48.r(r11, r4)
            r2.<init>(r4)
            java.util.Iterator r11 = r11.iterator()
        L4e:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L7b
            java.lang.Object r4 = r11.next()
            cv0 r4 = (defpackage.cv0) r4
            r4.getClass()
            bv0 r6 = new bv0
            l25$a r7 = defpackage.l25.b
            int r8 = r4.getKind()
            r7.getClass()
            l25 r7 = l25.a.a(r8)
            long r8 = r4.getEndTime()
            int r4 = r4.getMultiplier()
            r6.<init>(r7, r8, r4)
            r2.add(r6)
            goto L4e
        L7b:
            r10.b = r5
            r10.a = r3
            java.lang.Object r10 = r0.emit(r2, r10)
            if (r10 != r1) goto L86
        L85:
            return r1
        L86:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awt.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
