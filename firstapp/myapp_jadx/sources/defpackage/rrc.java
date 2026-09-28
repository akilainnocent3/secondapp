package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", l = {352, 353}, m = "invokeSuspend")
public final class rrc extends tje0 implements Function2<w7k0<Object>, v1b<? super Unit>, Object> {
    public bq40 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bq40 d;
    public final /* synthetic */ yqc<Object> e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rrc(bq40 bq40Var, yqc<Object> yqcVar, Object obj, boolean z, v1b<? super rrc> v1bVar) {
        super(2, v1bVar);
        this.d = bq40Var;
        this.e = yqcVar;
        this.f = obj;
        this.i = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rrc rrcVar = new rrc(this.d, this.e, this.f, this.i, v1bVar);
        rrcVar.c = obj;
        return rrcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(w7k0<Object> w7k0Var, v1b<? super Unit> v1bVar) {
        return ((rrc) create(w7k0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r7.b(r3, r8) == r0) goto L16;
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
            int r1 = r8.b
            r2 = 0
            java.lang.Object r3 = r8.f
            yqc<java.lang.Object> r4 = r8.e
            bq40 r5 = r8.d
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L27
            if (r1 == r7) goto L1d
            if (r1 != r6) goto L17
            defpackage.uj50.b(r9)
            goto L57
        L17:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r2
        L1d:
            bq40 r1 = r8.a
            java.lang.Object r7 = r8.c
            w7k0 r7 = (defpackage.w7k0) r7
            defpackage.uj50.b(r9)
            goto L42
        L27:
            defpackage.uj50.b(r9)
            java.lang.Object r9 = r8.c
            w7k0 r9 = (defpackage.w7k0) r9
            wxo r1 = r4.b()
            r8.c = r9
            r8.a = r5
            r8.b = r7
            java.lang.Object r1 = r1.a(r8)
            if (r1 != r0) goto L3f
            goto L56
        L3f:
            r7 = r9
            r9 = r1
            r1 = r5
        L42:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r1.a = r9
            r8.c = r2
            r8.a = r2
            r8.b = r6
            java.lang.Object r9 = r7.b(r3, r8)
            if (r9 != r0) goto L57
        L56:
            return r0
        L57:
            boolean r8 = r8.i
            if (r8 == 0) goto L6f
            src<T> r8 = r4.h
            ioc r9 = new ioc
            if (r3 == 0) goto L66
            int r0 = r3.hashCode()
            goto L67
        L66:
            r0 = 0
        L67:
            int r1 = r5.a
            r9.<init>(r0, r1, r3)
            r8.b(r9)
        L6f:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rrc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
