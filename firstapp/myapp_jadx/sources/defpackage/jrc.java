package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {387, 388, 390}, m = "invokeSuspend")
public final class jrc extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public Serializable a;
    public int b;
    public final /* synthetic */ dq40<Object> c;
    public final /* synthetic */ yqc<Object> d;
    public final /* synthetic */ bq40 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrc(dq40<Object> dq40Var, yqc<Object> yqcVar, bq40 bq40Var, v1b<? super jrc> v1bVar) {
        super(1, v1bVar);
        this.c = dq40Var;
        this.d = yqcVar;
        this.e = bq40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new jrc(this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((jrc) create(v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r10 == r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r9.b
            r2 = 0
            bq40 r3 = r9.e
            dq40<java.lang.Object> r4 = r9.c
            r5 = 3
            r6 = 2
            yqc<java.lang.Object> r7 = r9.d
            r8 = 1
            if (r1 == 0) goto L35
            if (r1 == r8) goto L2d
            if (r1 == r6) goto L25
            if (r1 != r5) goto L1f
            java.io.Serializable r9 = r9.a
            r3 = r9
            bq40 r3 = (defpackage.bq40) r3
            defpackage.uj50.b(r10)
            goto L79
        L1f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r2
        L25:
            java.io.Serializable r1 = r9.a
            bq40 r1 = (defpackage.bq40) r1
            defpackage.uj50.b(r10)     // Catch: defpackage.j6b -> L6c
            goto L63
        L2d:
            java.io.Serializable r1 = r9.a
            dq40 r1 = (defpackage.dq40) r1
            defpackage.uj50.b(r10)     // Catch: defpackage.j6b -> L6c
            goto L51
        L35:
            defpackage.uj50.b(r10)
            r9.a = r4     // Catch: defpackage.j6b -> L6c
            r9.b = r8     // Catch: defpackage.j6b -> L6c
            mpe0 r10 = r7.j     // Catch: defpackage.j6b -> L6c
            java.lang.Object r10 = r10.getValue()     // Catch: defpackage.j6b -> L6c
            l1e0 r10 = (defpackage.l1e0) r10     // Catch: defpackage.j6b -> L6c
            m1e0 r1 = new m1e0     // Catch: defpackage.j6b -> L6c
            r1.<init>(r5, r2)     // Catch: defpackage.j6b -> L6c
            java.lang.Object r10 = r10.d(r1, r9)     // Catch: defpackage.j6b -> L6c
            if (r10 != r0) goto L50
            goto L78
        L50:
            r1 = r4
        L51:
            r1.a = r10     // Catch: defpackage.j6b -> L6c
            wxo r10 = r7.b()     // Catch: defpackage.j6b -> L6c
            r9.a = r3     // Catch: defpackage.j6b -> L6c
            r9.b = r6     // Catch: defpackage.j6b -> L6c
            java.lang.Object r10 = r10.d(r9)     // Catch: defpackage.j6b -> L6c
            if (r10 != r0) goto L62
            goto L78
        L62:
            r1 = r3
        L63:
            java.lang.Number r10 = (java.lang.Number) r10     // Catch: defpackage.j6b -> L6c
            int r10 = r10.intValue()     // Catch: defpackage.j6b -> L6c
            r1.a = r10     // Catch: defpackage.j6b -> L6c
            goto L81
        L6c:
            T r10 = r4.a
            r9.a = r3
            r9.b = r5
            java.lang.Object r10 = r7.h(r10, r8, r9)
            if (r10 != r0) goto L79
        L78:
            return r0
        L79:
            java.lang.Number r10 = (java.lang.Number) r10
            int r9 = r10.intValue()
            r3.a = r9
        L81:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
