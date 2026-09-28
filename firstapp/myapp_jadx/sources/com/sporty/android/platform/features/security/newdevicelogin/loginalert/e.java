package com.sporty.android.platform.features.security.newdevicelogin.loginalert;

import defpackage.c0d;
import defpackage.tje0;
import defpackage.v1b;
import defpackage.v5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.security.newdevicelogin.loginalert.LoginAlertViewModel$handleAction$1", f = "LoginAlertViewModel.kt", l = {51, 55}, m = "invokeSuspend", v = 2)
public final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ g b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, v1b<? super e> v1bVar) {
        super(2, v1bVar);
        this.b = gVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r6.a.putBoolean("show_two_fa_prompt", r1, r5) == r0) goto L18;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r5.a
            r2 = 2
            r3 = 1
            com.sporty.android.platform.features.security.newdevicelogin.loginalert.g r4 = r5.b
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L12
            defpackage.uj50.b(r6)
            goto L4e
        L12:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L19:
            defpackage.uj50.b(r6)
            goto L2b
        L1d:
            defpackage.uj50.b(r6)
            mgb0 r6 = r4.b
            r5.a = r3
            java.lang.Object r6 = r6.isTwoFactorAuthEnabled(r5)
            if (r6 != r0) goto L2b
            goto L4d
        L2b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L3b
            ku90<com.sporty.android.platform.features.security.newdevicelogin.loginalert.b> r5 = r4.f
            com.sporty.android.platform.features.security.newdevicelogin.loginalert.b$a r6 = com.sporty.android.platform.features.security.newdevicelogin.loginalert.b.a.a
            r5.a(r6)
            goto L55
        L3b:
            xq00 r6 = r4.c
            mr00 r1 = defpackage.mr00.NewDeviceLogin
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5.a = r2
            zed r6 = r6.a
            java.lang.String r2 = "show_two_fa_prompt"
            java.lang.Object r5 = r6.putBoolean(r2, r1, r5)
            if (r5 != r0) goto L4e
        L4d:
            return r0
        L4e:
            ku90<com.sporty.android.platform.features.security.newdevicelogin.loginalert.b> r5 = r4.f
            com.sporty.android.platform.features.security.newdevicelogin.loginalert.b$a r6 = com.sporty.android.platform.features.security.newdevicelogin.loginalert.b.a.a
            r5.a(r6)
        L55:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sporty.android.platform.features.security.newdevicelogin.loginalert.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
