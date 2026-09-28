package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.integrity.DeviceIntegrityRepositoryImpl$saveVerificationStatus$2", f = "DeviceIntegrityRepositoryImpl.kt", l = {84, 85}, m = "invokeSuspend", v = 2)
public final class ode extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ qde b;
    public final /* synthetic */ rde c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ode(qde qdeVar, rde rdeVar, v1b<? super ode> v1bVar) {
        super(2, v1bVar);
        this.b = qdeVar;
        this.c = rdeVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ode(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ode) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r9.a.putString("device_integrity_status", r1, r8) == r0) goto L18;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r8.a
            r2 = 0
            qde r3 = r8.b
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1d
            if (r1 == r5) goto L19
            if (r1 != r4) goto L13
            defpackage.uj50.b(r9)
            goto L50
        L13:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r2
        L19:
            defpackage.uj50.b(r9)
            goto L39
        L1d:
            defpackage.uj50.b(r9)
            long r6 = java.lang.System.currentTimeMillis()
            r8.a = r5
            k5b r9 = r3.b
            nde r1 = new nde
            r1.<init>(r3, r6, r2)
            java.lang.Object r9 = defpackage.ej5.d(r9, r1, r8)
            if (r9 != r0) goto L34
            goto L36
        L34:
            kotlin.Unit r9 = kotlin.Unit.a
        L36:
            if (r9 != r0) goto L39
            goto L4f
        L39:
            m2l r9 = r3.d
            eo20[] r1 = defpackage.eo20.a
            rde r1 = r8.c
            java.lang.String r1 = r1.name()
            r8.a = r4
            zed r9 = r9.a
            java.lang.String r2 = "device_integrity_status"
            java.lang.Object r8 = r9.putString(r2, r1, r8)
            if (r8 != r0) goto L50
        L4f:
            return r0
        L50:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ode.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
