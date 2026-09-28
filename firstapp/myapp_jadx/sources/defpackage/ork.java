package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.gift.data.repository.GiftRepositoryImpl$useBoostGift$1", f = "GiftRepositoryImpl.kt", l = {78, 82}, m = "invokeSuspend", v = 2)
public final class ork extends tje0 implements Function2<myh<? super onh0>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jrk c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ork(jrk jrkVar, String str, v1b<? super ork> v1bVar) {
        super(2, v1bVar);
        this.c = jrkVar;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ork orkVar = new ork(this.c, this.d, v1bVar);
        orkVar.b = obj;
        return orkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super onh0> myhVar, v1b<? super Unit> v1bVar) {
        return ((ork) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        if (r0.emit(r6, r12) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r12.a
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r13)
            goto L70
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r12)
            return r5
        L1b:
            defpackage.uj50.b(r13)
            goto L3c
        L1f:
            defpackage.uj50.b(r13)
            jrk r13 = r12.c
            tnn r13 = r13.a
            mnh0 r2 = new mnh0
            java.lang.String r6 = r12.d
            r2.<init>(r6)
            r12.b = r0
            r12.a = r4
            java.lang.Object r13 = r13.a
            vik r13 = (defpackage.vik) r13
            java.lang.Object r13 = r13.a(r2, r12)
            if (r13 != r1) goto L3c
            goto L6f
        L3c:
            com.sporty.android.common.network.data.BaseResponse r13 = (com.sporty.android.common.network.data.BaseResponse) r13
            java.lang.Object r13 = defpackage.n52.b(r13)
            nnh0 r13 = (defpackage.nnh0) r13
            r13.getClass()
            onh0 r6 = new onh0
            java.lang.String r7 = r13.getGiftId()
            l25$a r2 = defpackage.l25.b
            int r4 = r13.getBoostKind()
            r2.getClass()
            l25 r8 = l25.a.a(r4)
            java.lang.String r9 = r13.getLogId()
            long r10 = r13.getAcceptTime()
            r6.<init>(r7, r8, r9, r10)
            r12.b = r5
            r12.a = r3
            java.lang.Object r12 = r0.emit(r6, r12)
            if (r12 != r1) goto L70
        L6f:
            return r1
        L70:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ork.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
