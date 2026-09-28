package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.settings.SettingsViewModel$toggleAutoUpdate$1", f = "SettingsViewModel.kt", l = {234, 235}, m = "invokeSuspend", v = 2)
public final class jm80 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ nm80 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm80(nm80 nm80Var, v1b<? super jm80> v1bVar) {
        super(2, v1bVar);
        this.b = nm80Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jm80(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jm80) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r0.g(r5, r6) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            nm80 r0 = r5.b
            du0 r0 = r0.v
            y5b r1 = defpackage.y5b.a
            int r2 = r5.a
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L14
            defpackage.uj50.b(r6)
            goto L49
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
            goto L48
        L31:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            wm20 r0 = r0.a()
            r6 = r6 ^ r4
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5.a = r3
            java.lang.Object r5 = r0.g(r5, r6)
            if (r5 != r1) goto L49
        L48:
            return r1
        L49:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jm80.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
