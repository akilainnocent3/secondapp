package defpackage;

import com.sporty.android.core.model.patron.KYCBannerItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sporty.android.core.data.repository.SportyBetAPICacheRepositoryKt$getSportyBetAPIResponse$1", f = "SportyBetAPICacheRepository.kt", l = {KYCBannerItem.STATUS_DEPRECATE, KYCBannerItem.STATUS_DEPRECATE}, m = "invokeSuspend", v = 2)
public final class y6k extends tje0 implements Function2<myh<? super wjk>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ lhb0 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6k(lhb0 lhb0Var, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.d = lhb0Var;
        this.e = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        y6k y6kVar = new y6k(this.d, this.e, v1bVar);
        y6kVar.c = obj;
        return y6kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super wjk> myhVar, v1b<? super Unit> v1bVar) {
        return ((y6k) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
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
            java.lang.Object r0 = r7.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r7.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r8)
            goto L4b
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r5
        L1b:
            myh r0 = r7.a
            defpackage.uj50.b(r8)
            goto L3e
        L21:
            defpackage.uj50.b(r8)
            r7.c = r5
            r7.a = r0
            r7.b = r4
            lhb0 r8 = r7.d
            ohb0 r8 = (defpackage.ohb0) r8
            k5b r2 = r8.c
            nhb0 r4 = new nhb0
            java.lang.String r6 = r7.e
            r4.<init>(r8, r6, r5)
            java.lang.Object r8 = defpackage.ej5.d(r2, r4, r7)
            if (r8 != r1) goto L3e
            goto L4a
        L3e:
            r7.c = r5
            r7.a = r5
            r7.b = r3
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r1) goto L4b
        L4a:
            return r1
        L4b:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y6k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
