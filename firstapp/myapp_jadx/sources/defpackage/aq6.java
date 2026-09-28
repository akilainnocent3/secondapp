package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.data.manager.CashoutMetricsManagerImpl$init$1", f = "CashoutMetricsManagerImpl.kt", l = {DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER, 35}, m = "invokeSuspend", v = 2)
public final class aq6 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public zp6 a;
    public int b;
    public final /* synthetic */ zp6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq6(zp6 zp6Var, v1b<? super aq6> v1bVar) {
        super(2, v1bVar);
        this.c = zp6Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new aq6(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((aq6) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r8 == r2) goto L16;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            zp6 r0 = r7.c
            dq6 r1 = r0.b
            y5b r2 = defpackage.y5b.a
            int r3 = r7.b
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L23
            if (r3 == r6) goto L1d
            if (r3 != r5) goto L17
            zp6 r0 = r7.a
            defpackage.uj50.b(r8)
            goto L53
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r4
        L1d:
            zp6 r3 = r7.a
            defpackage.uj50.b(r8)
            goto L39
        L23:
            defpackage.uj50.b(r8)
            r7.a = r0
            r7.b = r6
            k5b r8 = r1.g
            cq6 r3 = new cq6
            r3.<init>(r1, r4)
            java.lang.Object r8 = defpackage.ej5.d(r8, r3, r7)
            if (r8 != r2) goto L38
            goto L52
        L38:
            r3 = r0
        L39:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r3.f = r8
            r7.a = r0
            r7.b = r5
            k5b r8 = r1.g
            bq6 r3 = new bq6
            r3.<init>(r1, r4)
            java.lang.Object r8 = defpackage.ej5.d(r8, r3, r7)
            if (r8 != r2) goto L53
        L52:
            return r2
        L53:
            java.lang.Number r8 = (java.lang.Number) r8
            long r7 = r8.longValue()
            r0.g = r7
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aq6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
