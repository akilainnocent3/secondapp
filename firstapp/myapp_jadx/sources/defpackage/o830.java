package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;

/* JADX INFO: loaded from: classes8.dex */
public final class o830<T> extends u67<T> {
    public final m830<T> d;

    @c0d(c = "kotlinx.coroutines.reactive.PublisherAsFlow", f = "ReactiveFlow.kt", l = {94, 96}, m = "collectImpl")
    public static final class a extends x1b {
        public o830 a;
        public myh b;
        public k340 c;
        public long d;
        public /* synthetic */ Object e;
        public final /* synthetic */ o830<T> f;
        public int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o830<T> o830Var, v1b<? super a> v1bVar) {
            super(v1bVar);
            this.f = o830Var;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.i |= Integer.MIN_VALUE;
            return this.f.l(null, null, this);
        }
    }

    public o830(m830<T> m830Var, CoroutineContext coroutineContext, int i, pb5 pb5Var) {
        super(coroutineContext, i, pb5Var);
        this.d = m830Var;
    }

    @Override // defpackage.u67, defpackage.lyh
    public final Object collect(myh<? super T> myhVar, v1b<? super Unit> v1bVar) {
        CoroutineContext context = v1bVar.getContext();
        d.a aVar = d.n;
        CoroutineContext coroutineContext = this.a;
        d dVar = (d) coroutineContext.get(aVar);
        if (dVar == null || dVar.equals(context.get(aVar))) {
            Object objL = l(context.plus(coroutineContext), myhVar, v1bVar);
            return objL == y5b.a ? objL : Unit.a;
        }
        Object objD = w5b.d(new p830(myhVar, this, null), v1bVar);
        y5b y5bVar = y5b.a;
        if (objD != y5bVar) {
            objD = Unit.a;
        }
        return objD == y5bVar ? objD : Unit.a;
    }

    @Override // defpackage.u67
    public final Object f(ez20<? super T> ez20Var, v1b<? super Unit> v1bVar) {
        Object objL = l(ez20Var.getCoroutineContext(), new rc80(ez20Var.d()), v1bVar);
        return objL == y5b.a ? objL : Unit.a;
    }

    @Override // defpackage.u67
    public final u67<T> i(CoroutineContext coroutineContext, int i, pb5 pb5Var) {
        return new o830(this.d, coroutineContext, i, pb5Var);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0 A[Catch: all -> 0x003e, TRY_ENTER, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0037, B:40:0x00b8, B:26:0x007b, B:37:0x00a0, B:42:0x00c3, B:44:0x00c7, B:45:0x00ce, B:46:0x00d1, B:20:0x004f), top: B:53:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
    
        if (r0.emit(r1, r2) == r3) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [myh] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [myh] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [k340] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [k340] */
    /* JADX WARN: Type inference failed for: r4v6, types: [k340] */
    /* JADX WARN: Type inference failed for: r4v7, types: [k340] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b5 -> B:14:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(kotlin.coroutines.CoroutineContext r17, defpackage.myh<? super T> r18, defpackage.v1b<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o830.l(kotlin.coroutines.CoroutineContext, myh, v1b):java.lang.Object");
    }

    public final long m() {
        if (this.c != pb5.a) {
            return Long.MAX_VALUE;
        }
        int i = this.b;
        if (i == -2) {
            l67.j.getClass();
            return l67.a.b;
        }
        if (i == 0) {
            return 1L;
        }
        if (i == Integer.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        long j = i;
        if (j >= 1) {
            return j;
        }
        ib5.a("Check failed.");
        return 0L;
    }
}
