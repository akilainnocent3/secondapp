package defpackage;

import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.horseracing.presentation.HorseRacingViewModel$updateSdkData$1", f = "HorseRacingViewModel.kt", l = {140, 144}, m = "invokeSuspend", v = 2)
public final class mkm extends tje0 implements Function2<lk50<? extends AssetsInfo>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fkm c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkm(fkm fkmVar, String str, v1b<? super mkm> v1bVar) {
        super(2, v1bVar);
        this.c = fkmVar;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mkm mkmVar = new mkm(this.c, this.d, v1bVar);
        mkmVar.b = obj;
        return mkmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends AssetsInfo> lk50Var, v1b<? super Unit> v1bVar) {
        return ((mkm) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        if (r2.a.emit(r5, r14) == r1) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.b
            lk50 r0 = (defpackage.lk50) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r14.a
            r3 = 0
            r4 = 2
            r5 = 1
            fkm r6 = r14.c
            if (r2 == 0) goto L21
            if (r2 == r5) goto L1d
            if (r2 != r4) goto L17
            defpackage.uj50.b(r15)
            goto L83
        L17:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r14)
            return r3
        L1d:
            defpackage.uj50.b(r15)
            goto L35
        L21:
            defpackage.uj50.b(r15)
            boolean r15 = r0 instanceof lk50.c
            if (r15 == 0) goto L83
            com.sportybet.android.auth.GetUserAccessTokenUseCase r15 = r6.b
            r14.b = r0
            r14.a = r5
            java.lang.Object r15 = r15.invoke(r14)
            if (r15 != r1) goto L35
            goto L82
        L35:
            java.lang.String r15 = (java.lang.String) r15
            wwd0 r2 = r6.i
        L39:
            java.lang.Object r5 = r2.getValue()
            r7 = r5
            dkm r7 = (defpackage.dkm) r7
            ekm r8 = r6.e
            r12 = 0
            r13 = 29
            r9 = 0
            r10 = 1
            r11 = 0
            dkm r7 = defpackage.ekm.a(r8, r9, r10, r11, r12, r13)
            boolean r5 = r2.g(r5, r7)
            if (r5 == 0) goto L39
            ku90<ckm> r2 = r6.w
            ckm$e r5 = new ckm$e
            lk50$c r0 = (lk50.c) r0
            T r0 = r0.a
            com.sporty.android.core.model.assetsinfo.AssetsInfo r0 = (com.sporty.android.core.model.assetsinfo.AssetsInfo) r0
            long r6 = r0.balance
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            java.lang.String r6 = r14.d
            java.lang.Object[] r15 = new java.lang.Object[]{r6, r15, r0}
            r0 = 3
            java.lang.Object[] r15 = java.util.Arrays.copyOf(r15, r0)
            java.lang.String r0 = "window.horseRacing.setWidgetData('{\"userId\":\"%s\", \"token\": \"%s\", \"balance\": \"%s\"}');"
            java.lang.String r15 = java.lang.String.format(r0, r15)
            r5.<init>(r15)
            r14.b = r3
            r14.a = r4
            b390 r15 = r2.a
            java.lang.Object r14 = r15.emit(r5, r14)
            if (r14 != r1) goto L83
        L82:
            return r1
        L83:
            kotlin.Unit r14 = kotlin.Unit.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mkm.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
