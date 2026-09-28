package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.horseracing.presentation.HorseRacingViewModel$onToolbarLeftButtonClick$1", f = "HorseRacingViewModel.kt", l = {130, 132}, m = "invokeSuspend", v = 2)
public final class kkm extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fkm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkm(fkm fkmVar, v1b<? super kkm> v1bVar) {
        super(2, v1bVar);
        this.b = fkmVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kkm(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kkm) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (r1.a.emit(r0, r13) == r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if (r1.a.emit(r14, r13) == r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        return r3;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            fkm r0 = r13.b
            ku90<ckm> r1 = r0.w
            wwd0 r2 = r0.i
            y5b r3 = defpackage.y5b.a
            int r4 = r13.a
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L1e
            if (r4 == r6) goto L1a
            if (r4 != r5) goto L13
            goto L1a
        L13:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r13)
            r13 = 0
            return r13
        L1a:
            defpackage.uj50.b(r14)
            goto L7b
        L1e:
            defpackage.uj50.b(r14)
            java.lang.Object r14 = r2.getValue()
            dkm r14 = (defpackage.dkm) r14
            boolean r14 = r14.b
            if (r14 == 0) goto L6b
        L2b:
            java.lang.Object r14 = r2.getValue()
            r4 = r14
            dkm r4 = (defpackage.dkm) r4
            ekm r7 = r0.e
            uqm r4 = r0.c
            boolean r9 = r4.isLogin()
            r11 = 0
            r12 = 25
            r8 = 0
            r10 = 0
            dkm r4 = defpackage.ekm.a(r7, r8, r9, r10, r11, r12)
            boolean r14 = r2.g(r14, r4)
            if (r14 == 0) goto L2b
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r6)
            java.lang.String r0 = "window.horseRacing.toggleHistory('{\"showHistory\":%s}');"
            java.lang.String r14 = java.lang.String.format(r0, r14)
            ckm$d r0 = new ckm$d
            java.lang.String r2 = "window.horseRacing.toggleBetslip('{\"showBetslip\":false}');"
            r0.<init>(r14, r2)
            r13.a = r6
            b390 r14 = r1.a
            java.lang.Object r13 = r14.emit(r0, r13)
            if (r13 != r3) goto L7b
            goto L7a
        L6b:
            ckm$b r14 = new ckm$b
            r14.<init>()
            r13.a = r5
            b390 r0 = r1.a
            java.lang.Object r13 = r0.emit(r14, r13)
            if (r13 != r3) goto L7b
        L7a:
            return r3
        L7b:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kkm.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
