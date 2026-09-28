package defpackage;

import com.google.protobuf.RuntimeVersion;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sporty.android.platform.features.security.twofa.TwoFABottomSheetViewModel$updateTwoFactorAuthPromptStatus$1", f = "TwoFABottomSheetViewModel.kt", l = {RuntimeVersion.MINOR, 28}, m = "invokeSuspend", v = 2)
public final class xzg0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ yzg0 b;
    public final /* synthetic */ dvh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzg0(yzg0 yzg0Var, dvh dvhVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = yzg0Var;
        this.c = dvhVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xzg0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xzg0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r6.g(r5, r0) == r1) goto L17;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            yzg0 r0 = r5.b
            ga r0 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r5.a
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L14
            defpackage.uj50.b(r6)
            goto L48
        L14:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L1b:
            defpackage.uj50.b(r6)
            goto L31
        L1f:
            defpackage.uj50.b(r6)
            wm20 r6 = r0.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r5.a = r4
            java.lang.Object r6 = r6.e(r5, r2)
            if (r6 != r1) goto L31
            goto L47
        L31:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L48
            wm20 r6 = r0.a()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r5.a = r3
            java.lang.Object r6 = r6.g(r5, r0)
            if (r6 != r1) goto L48
        L47:
            return r1
        L48:
            dvh r5 = r5.c
            r5.invoke()
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xzg0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
