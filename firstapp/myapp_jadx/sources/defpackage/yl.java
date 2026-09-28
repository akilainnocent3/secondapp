package defpackage;

import com.sporty.android.core.model.ads.Ads;
import com.sporty.android.core.model.ads.AdsConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.ads.AdsRepositoryImpl$getAdsFlow$1", f = "AdsRepositoryImpl.kt", l = {40, 40}, m = "invokeSuspend", v = 2)
public final class yl extends tje0 implements Function2<myh<? super Ads>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ zl d;
    public final /* synthetic */ AdsConfig e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl(zl zlVar, AdsConfig adsConfig, v1b<? super yl> v1bVar) {
        super(2, v1bVar);
        this.d = zlVar;
        this.e = adsConfig;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yl ylVar = new yl(this.d, this.e, v1bVar);
        ylVar.c = obj;
        return ylVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Ads> myhVar, v1b<? super Unit> v1bVar) {
        return ((yl) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
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
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r7)
            goto L46
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L1b:
            myh r0 = r6.a
            defpackage.uj50.b(r7)
            goto L39
        L21:
            defpackage.uj50.b(r7)
            com.sporty.android.core.model.ads.AdsConfig r7 = r6.e
            java.lang.String r7 = r7.getId()
            r6.c = r5
            r6.a = r0
            r6.b = r4
            zl r2 = r6.d
            java.lang.Object r7 = r2.a(r7, r6)
            if (r7 != r1) goto L39
            goto L45
        L39:
            r6.c = r5
            r6.a = r5
            r6.b = r3
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r1) goto L46
        L45:
            return r1
        L46:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
