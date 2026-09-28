package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {121, 121}, m = "invokeSuspend")
public final class lj90 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public prc a;
    public int b;
    public final /* synthetic */ mj90<Object> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj90(mj90<Object> mj90Var, v1b<? super lj90> v1bVar) {
        super(2, v1bVar);
        this.c = mj90Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lj90(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((lj90) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[PHI: r1 r7
      0x0044: PHI (r1v1 prc) = (r1v2 prc), (r1v3 prc) binds: [B:13:0x0041, B:9:0x0019] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r7v4 java.lang.Object) = (r7v9 java.lang.Object), (r7v0 java.lang.Object) binds: [B:13:0x0041, B:9:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r1.invoke(r7, r6) == r0) goto L17;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:18:0x004f). Please report as a decompilation issue!!! */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.b
            r2 = 0
            r3 = 2
            r4 = 1
            mj90<java.lang.Object> r5 = r6.c
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L19
            if (r1 != r3) goto L13
            defpackage.uj50.b(r7)
            goto L4f
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r2
        L19:
            prc r1 = r6.a
            defpackage.uj50.b(r7)
            goto L44
        L1f:
            defpackage.uj50.b(r7)
            s11 r7 = r5.d
            java.util.concurrent.atomic.AtomicInteger r7 = r7.a
            int r7 = r7.get()
            if (r7 <= 0) goto L5c
        L2c:
            v5b r7 = r5.a
            kotlin.coroutines.CoroutineContext r7 = r7.getCoroutineContext()
            defpackage.i9p.e(r7)
            prc r1 = r5.b
            tb5 r7 = r5.c
            r6.a = r1
            r6.b = r4
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r0) goto L44
            goto L4e
        L44:
            r6.a = r2
            r6.b = r3
            java.lang.Object r7 = r1.invoke(r7, r6)
            if (r7 != r0) goto L4f
        L4e:
            return r0
        L4f:
            s11 r7 = r5.d
            java.util.concurrent.atomic.AtomicInteger r7 = r7.a
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L2c
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L5c:
            java.lang.String r6 = "Check failed."
            defpackage.ib5.a(r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj90.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
