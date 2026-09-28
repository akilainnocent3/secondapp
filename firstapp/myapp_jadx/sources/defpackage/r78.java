package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class r78 {

    @c0d(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {51, 73, 76}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public l67 a;
        public byte[] b;
        public int c;
        public int d;
        public int e;
        public /* synthetic */ Object f;
        public final /* synthetic */ lyh<Object>[] i;
        public final /* synthetic */ Function0<Object[]> v;
        public final /* synthetic */ gaj<myh<Object>, Object[], v1b<? super Unit>, Object> w;
        public final /* synthetic */ myh<Object> y;

        /* JADX INFO: renamed from: r78$a$a, reason: collision with other inner class name */
        @c0d(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {28}, m = "invokeSuspend")
        public static final class C1039a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ lyh<Object>[] b;
            public final /* synthetic */ int c;
            public final /* synthetic */ AtomicInteger d;
            public final /* synthetic */ tb5 e;

            /* JADX INFO: renamed from: r78$a$a$a, reason: collision with other inner class name */
            public static final class C1040a<T> implements myh {
                public final /* synthetic */ tb5 a;
                public final /* synthetic */ int b;

                /* JADX INFO: renamed from: r78$a$a$a$a, reason: collision with other inner class name */
                @c0d(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {29, 30}, m = "emit")
                public static final class C1041a extends x1b {
                    public /* synthetic */ Object a;
                    public final /* synthetic */ C1040a<T> b;
                    public int c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C1041a(C1040a<? super T> c1040a, v1b<? super C1041a> v1bVar) {
                        super(v1bVar);
                        this.b = c1040a;
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.c |= Integer.MIN_VALUE;
                        return this.b.emit(null, this);
                    }
                }

                public C1040a(tb5 tb5Var, int i) {
                    this.a = tb5Var;
                    this.b = i;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
                
                    if (defpackage.lal.c(r0) == r1) goto L21;
                 */
                @Override // defpackage.myh
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r6, defpackage.v1b<? super kotlin.Unit> r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof r78.a.C1039a.C1040a.C1041a
                        if (r0 == 0) goto L13
                        r0 = r7
                        r78$a$a$a$a r0 = (r78.a.C1039a.C1040a.C1041a) r0
                        int r1 = r0.c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.c = r1
                        goto L18
                    L13:
                        r78$a$a$a$a r0 = new r78$a$a$a$a
                        r0.<init>(r5, r7)
                    L18:
                        java.lang.Object r7 = r0.a
                        y5b r1 = defpackage.y5b.a
                        int r2 = r0.c
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L35
                        if (r2 == r4) goto L31
                        if (r2 != r3) goto L2a
                        defpackage.uj50.b(r7)
                        goto L53
                    L2a:
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.ib5.a(r5)
                        r5 = 0
                        return r5
                    L31:
                        defpackage.uj50.b(r7)
                        goto L4a
                    L35:
                        defpackage.uj50.b(r7)
                        kotlin.collections.IndexedValue r7 = new kotlin.collections.IndexedValue
                        int r2 = r5.b
                        r7.<init>(r2, r6)
                        r0.c = r4
                        tb5 r5 = r5.a
                        java.lang.Object r5 = r5.j(r0, r7)
                        if (r5 != r1) goto L4a
                        goto L52
                    L4a:
                        r0.c = r3
                        java.lang.Object r5 = defpackage.lal.c(r0)
                        if (r5 != r1) goto L53
                    L52:
                        return r1
                    L53:
                        kotlin.Unit r5 = kotlin.Unit.a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: r78.a.C1039a.C1040a.emit(java.lang.Object, v1b):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1039a(lyh[] lyhVarArr, int i, AtomicInteger atomicInteger, tb5 tb5Var, v1b v1bVar) {
                super(2, v1bVar);
                this.b = lyhVarArr;
                this.c = i;
                this.d = atomicInteger;
                this.e = tb5Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1039a(this.b, this.c, this.d, this.e, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1039a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                AtomicInteger atomicInteger = this.d;
                tb5 tb5Var = this.e;
                try {
                    if (i == 0) {
                        uj50.b(obj);
                        lyh<Object>[] lyhVarArr = this.b;
                        int i2 = this.c;
                        lyh<Object> lyhVar = lyhVarArr[i2];
                        C1040a c1040a = new C1040a(tb5Var, i2);
                        this.a = 1;
                        if (lyhVar.collect(c1040a, this) == y5bVar) {
                            return y5bVar;
                        }
                    } else {
                        if (i != 1) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uj50.b(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        tb5Var.k(null);
                    }
                    return Unit.a;
                } catch (Throwable th) {
                    if (atomicInteger.decrementAndGet() == 0) {
                        tb5Var.k(null);
                    }
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, myh myhVar, gaj gajVar, Function0 function0, lyh[] lyhVarArr) {
            super(2, v1bVar);
            this.i = lyhVarArr;
            this.v = function0;
            this.w = gajVar;
            this.y = myhVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(v1bVar, this.y, this.w, this.v, this.i);
            aVar.f = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c5 A[DONT_INVERT, EDGE_INSN: B:34:0x00c5->B:20:0x0086 BREAK  A[LOOP:0: B:27:0x00a6->B:45:?]] */
        /* JADX WARN: Code duplicated, block: B:35:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:37:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:40:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:44:0x00c5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:27:0x00a6->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e5 -> B:20:0x0086). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fd -> B:20:0x0086). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:34:0x00c5
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 256
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: r78.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object a(v1b v1bVar, myh myhVar, gaj gajVar, Function0 function0, lyh[] lyhVarArr) {
        a aVar = new a(null, myhVar, gajVar, function0, lyhVarArr);
        nyh nyhVar = new nyh(v1bVar, v1bVar.getContext());
        Object objA = mdh0.a(nyhVar, true, nyhVar, aVar);
        return objA == y5b.a ? objA : Unit.a;
    }
}
