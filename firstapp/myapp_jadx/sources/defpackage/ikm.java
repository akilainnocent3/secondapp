package defpackage;

import com.sportybet.feature.horseracing.model.BmSdkResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.horseracing.presentation.HorseRacingViewModel$onSdkError$1", f = "HorseRacingViewModel.kt", l = {78, 74}, m = "invokeSuspend", v = 2)
public final class ikm extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public ku90 a;
    public fkm b;
    public String c;
    public int d;
    public final /* synthetic */ BmSdkResult.a e;
    public final /* synthetic */ fkm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikm(BmSdkResult.a aVar, fkm fkmVar, v1b<? super ikm> v1bVar) {
        super(2, v1bVar);
        this.e = aVar;
        this.f = fkmVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ikm(this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ikm) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0091  */
    /* JADX WARN: Code duplicated, block: B:28:0x0094  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        if (r5.a.emit(r0, r14) == r2) goto L31;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            fkm r0 = r14.f
            wwd0 r1 = r0.i
            y5b r2 = defpackage.y5b.a
            int r3 = r14.d
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L26
            if (r3 == r5) goto L1c
            if (r3 != r4) goto L16
            defpackage.uj50.b(r15)
            goto Lc2
        L16:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r14)
            return r6
        L1c:
            java.lang.String r1 = r14.c
            fkm r3 = r14.b
            ku90 r5 = r14.a
            defpackage.uj50.b(r15)
            goto L87
        L26:
            defpackage.uj50.b(r15)
            com.sportybet.feature.horseracing.model.BmSdkResult$a r15 = r14.e
            com.sportybet.feature.horseracing.model.BmSdkResult$a r3 = com.sportybet.feature.horseracing.model.BmSdkResult.a.c
            if (r15 != r3) goto Lc2
        L2f:
            java.lang.Object r15 = r1.getValue()
            r3 = r15
            dkm r3 = (defpackage.dkm) r3
            ekm r7 = r0.e
            r11 = 0
            r12 = 30
            r8 = 1
            r9 = 0
            r10 = 0
            dkm r3 = defpackage.ekm.a(r7, r8, r9, r10, r11, r12)
            boolean r15 = r1.g(r15, r3)
            if (r15 == 0) goto L2f
            uqm r15 = r0.c
            java.lang.String r15 = r15.refreshAccessToken()
        L4e:
            java.lang.Object r3 = r1.getValue()
            r7 = r3
            dkm r7 = (defpackage.dkm) r7
            ekm r8 = r0.e
            if (r15 == 0) goto L5b
            r10 = r5
            goto L5d
        L5b:
            r9 = 0
            r10 = r9
        L5d:
            boolean r11 = r7.b
            r12 = 0
            r13 = 24
            r9 = 0
            dkm r7 = defpackage.ekm.a(r8, r9, r10, r11, r12, r13)
            boolean r3 = r1.g(r3, r7)
            if (r3 == 0) goto L4e
            ku90<ckm> r1 = r0.w
            r15.getClass()
            mgb0 r3 = r0.d
            r14.a = r1
            r14.b = r0
            r14.c = r15
            r14.d = r5
            java.lang.Object r3 = r3.getUserId(r14)
            if (r3 != r2) goto L83
            goto Lc1
        L83:
            r5 = r1
            r1 = r15
            r15 = r3
            r3 = r0
        L87:
            java.lang.String r15 = (java.lang.String) r15
            uy0 r0 = r0.a
            com.sporty.android.core.model.assetsinfo.AssetsInfo r0 = r0.c()
            if (r0 == 0) goto L94
            long r7 = r0.balance
            goto L96
        L94:
            r7 = 0
        L96:
            r3.getClass()
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            java.lang.Object[] r15 = new java.lang.Object[]{r15, r1, r0}
            r0 = 3
            java.lang.Object[] r15 = java.util.Arrays.copyOf(r15, r0)
            java.lang.String r0 = "window.horseRacing.setWidgetData('{\"userId\":\"%s\", \"token\": \"%s\", \"balance\": \"%s\"}');"
            java.lang.String r15 = java.lang.String.format(r0, r15)
            ckm$e r0 = new ckm$e
            r0.<init>(r15)
            r14.a = r6
            r14.b = r6
            r14.c = r6
            r14.d = r4
            b390 r15 = r5.a
            java.lang.Object r14 = r15.emit(r0, r14)
            if (r14 != r2) goto Lc2
        Lc1:
            return r2
        Lc2:
            kotlin.Unit r14 = kotlin.Unit.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ikm.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
