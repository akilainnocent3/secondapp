package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.gift.data.repository.GiftRepositoryImpl$getGifts$1", f = "GiftRepositoryImpl.kt", l = {41, 43}, m = "invokeSuspend", v = 2)
public final class drk extends tje0 implements Function2<myh<? super hpk>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jrk c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drk(jrk jrkVar, int i, v1b v1bVar) {
        super(2, v1bVar);
        this.c = jrkVar;
        this.d = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        drk drkVar = new drk(this.c, this.d, v1bVar);
        drkVar.b = obj;
        return drkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super hpk> myhVar, v1b<? super Unit> v1bVar) {
        return ((drk) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
        if (r0.emit(r2, r7) == r1) goto L19;
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
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r8)
            goto L7c
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r5
        L1b:
            defpackage.uj50.b(r8)
            goto L39
        L1f:
            defpackage.uj50.b(r8)
            jrk r8 = r7.c
            tnn r8 = r8.a
            r7.b = r0
            r7.a = r4
            java.lang.Object r8 = r8.a
            vik r8 = (defpackage.vik) r8
            int r2 = r7.d
            r4 = 100
            java.lang.Object r8 = r8.e(r2, r5, r4, r7)
            if (r8 != r1) goto L39
            goto L7b
        L39:
            com.sporty.android.common.network.data.BaseResponse r8 = (com.sporty.android.common.network.data.BaseResponse) r8
            java.lang.Object r8 = defpackage.n52.b(r8)
            rrk r8 = (defpackage.rrk) r8
            java.util.List r2 = r8.a()
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.l48.r(r2, r6)
            r4.<init>(r6)
            java.util.Iterator r2 = r2.iterator()
        L54:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L68
            java.lang.Object r6 = r2.next()
            xjk r6 = (defpackage.xjk) r6
            eik r6 = defpackage.atf.a(r6)
            r4.add(r6)
            goto L54
        L68:
            int r8 = r8.getTotalNum()
            hpk r2 = new hpk
            r2.<init>(r8, r4)
            r7.b = r5
            r7.a = r3
            java.lang.Object r7 = r0.emit(r2, r7)
            if (r7 != r1) goto L7c
        L7b:
            return r1
        L7c:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
