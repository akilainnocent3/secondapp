package defpackage;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.components.bet.StakeSelectorWrapperComponentKt$StakeSelectorWrapperComponent$1$1", f = "StakeSelectorWrapperComponent.kt", l = {173, 183}, m = "invokeSuspend", v = 1)
public final class qud0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ SharedPreferences c;
    public final /* synthetic */ ytw<Boolean> d;
    public final /* synthetic */ twd0<Boolean> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qud0(boolean z, SharedPreferences sharedPreferences, ytw<Boolean> ytwVar, twd0<Boolean> twd0Var, v1b<? super qud0> v1bVar) {
        super(2, v1bVar);
        this.b = z;
        this.c = sharedPreferences;
        this.d = ytwVar;
        this.e = twd0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qud0(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qud0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (kotlin.Unit.a == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (defpackage.hkd.b(1000, r6) == r0) goto L30;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.a
            r2 = 0
            r3 = 2
            ytw<java.lang.Boolean> r4 = r6.d
            r5 = 1
            if (r1 == 0) goto L1d
            if (r1 == r5) goto L19
            if (r1 != r3) goto L13
            defpackage.uj50.b(r7)
            goto L71
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r2
        L19:
            defpackage.uj50.b(r7)
            goto L4d
        L1d:
            defpackage.uj50.b(r7)
            boolean r7 = r6.b
            if (r7 != 0) goto L2c
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.setValue(r6)
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L2c:
            android.content.SharedPreferences r7 = r6.c
            r7.getClass()
            java.lang.String r1 = "one_time_fetch"
            java.lang.String r7 = r7.getString(r1, r2)     // Catch: java.lang.Exception -> L3e
            java.lang.String r1 = "ui_animated"
            boolean r7 = kotlin.jvm.internal.Intrinsics.g(r7, r1)     // Catch: java.lang.Exception -> L3e
            goto L3f
        L3e:
            r7 = 0
        L3f:
            if (r7 == 0) goto L50
            r6.a = r5
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r4.setValue(r6)
            kotlin.Unit r6 = kotlin.Unit.a
            if (r6 != r0) goto L4d
            goto L70
        L4d:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L50:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r4.setValue(r7)
            twd0<java.lang.Boolean> r7 = r6.e
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L66
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L66:
            r6.a = r3
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r6 = defpackage.hkd.b(r1, r6)
            if (r6 != r0) goto L71
        L70:
            return r0
        L71:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r4.setValue(r6)
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qud0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
