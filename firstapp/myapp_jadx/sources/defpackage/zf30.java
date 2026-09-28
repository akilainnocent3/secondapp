package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.QuickBetViewModel$showAcceptOddsChangeDlg$1", f = "QuickBetViewModel.kt", l = {178, 179, 185, 185, 186}, m = "invokeSuspend", v = 2)
public final class zf30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public m2l a;
    public int b;
    public final /* synthetic */ tf30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf30(tf30 tf30Var, v1b<? super zf30> v1bVar) {
        super(2, v1bVar);
        this.c = tf30Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zf30(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zf30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0074 A[PHI: r0 r4
      0x0074: PHI (r0v13 m2l) = (r0v12 m2l), (r0v27 m2l) binds: [B:30:0x0071, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x0074: PHI (r4v2 java.lang.Object) = (r4v1 java.lang.Object), (r4v7 java.lang.Object) binds: [B:30:0x0071, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:
    
        if (r0 == r10) goto L37;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zf30.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
