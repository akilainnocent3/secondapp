package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {218, 226}, m = "invokeSuspend")
public final class krc extends tje0 implements Function2<v5b, v1b<? super swd0<Object>>, Object> {
    public int a;
    public final /* synthetic */ yqc<Object> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krc(yqc yqcVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = yqcVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new krc(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super swd0<Object>> v1bVar) {
        return ((krc) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r7 == r2) goto L20;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            yqc<java.lang.Object> r0 = r6.b
            src<T> r1 = r0.h
            y5b r2 = defpackage.y5b.a
            int r3 = r6.a
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L1f
            if (r3 == r5) goto L1b
            if (r3 != r4) goto L14
            defpackage.uj50.b(r7)
            goto L42
        L14:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L1b:
            defpackage.uj50.b(r7)     // Catch: java.lang.Throwable -> L45
            goto L38
        L1f:
            defpackage.uj50.b(r7)
            swd0 r7 = r1.a()
            boolean r7 = r7 instanceof defpackage.mnh
            if (r7 == 0) goto L2f
            swd0 r6 = r1.a()
            return r6
        L2f:
            r6.a = r5     // Catch: java.lang.Throwable -> L45
            java.lang.Object r7 = r0.e(r6)     // Catch: java.lang.Throwable -> L45
            if (r7 != r2) goto L38
            goto L41
        L38:
            r6.a = r4
            r7 = 0
            java.lang.Object r7 = r0.f(r7, r6)
            if (r7 != r2) goto L42
        L41:
            return r2
        L42:
            swd0 r7 = (defpackage.swd0) r7
            return r7
        L45:
            r6 = move-exception
            m340 r7 = new m340
            r0 = -1
            r7.<init>(r0, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.krc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
