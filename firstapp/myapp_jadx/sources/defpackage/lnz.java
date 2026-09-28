package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", f = "PageFetcherSnapshot.kt", l = {646, 168, 657}, m = "invokeSuspend")
public final class lnz extends tje0 implements Function2<hk90<xmz<Object>>, v1b<? super Unit>, Object> {
    public Object a;
    public Object b;
    public tuw c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ enz<Object, Object> f;

    @c0d(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", f = "PageFetcherSnapshot.kt", l = {91}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ enz<Object, Object> b;
        public final /* synthetic */ hk90<xmz<Object>> c;

        /* JADX INFO: renamed from: lnz$a$a, reason: collision with other inner class name */
        public static final class C0821a<T> implements myh {
            public final /* synthetic */ hk90<xmz<Object>> a;

            /* JADX INFO: renamed from: lnz$a$a$a, reason: collision with other inner class name */
            @c0d(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1", f = "PageFetcherSnapshot.kt", l = {95}, m = "emit")
            public static final class C0822a extends x1b {
                public /* synthetic */ Object a;
                public final /* synthetic */ C0821a<T> b;
                public int c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0822a(C0821a<? super T> c0821a, v1b<? super C0822a> v1bVar) {
                    super(v1bVar);
                    this.b = c0821a;
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.c |= Integer.MIN_VALUE;
                    return this.b.emit(null, this);
                }
            }

            public C0821a(hk90<xmz<Object>> hk90Var) {
                this.a = hk90Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object emit(xmz<Object> xmzVar, v1b<? super Unit> v1bVar) {
                C0822a c0822a;
                if (v1bVar instanceof C0822a) {
                    c0822a = (C0822a) v1bVar;
                    int i = c0822a.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0822a.c = i - Integer.MIN_VALUE;
                    } else {
                        c0822a = new C0822a(this, v1bVar);
                    }
                } else {
                    c0822a = new C0822a(this, v1bVar);
                }
                Object obj = c0822a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0822a.c;
                try {
                    if (i2 == 0) {
                        uj50.b(obj);
                        hk90<xmz<Object>> hk90Var = this.a;
                        c0822a.c = 1;
                        if (hk90Var.j(c0822a, xmzVar) == y5bVar) {
                            return y5bVar;
                        }
                    } else {
                        if (i2 != 1) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uj50.b(obj);
                    }
                } catch (lt7 unused) {
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(enz<Object, Object> enzVar, hk90<xmz<Object>> hk90Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = enzVar;
            this.c = hk90Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                o67 o67VarA = izh.a(this.b.i);
                C0821a c0821a = new C0821a(this.c);
                this.a = 1;
                if (o67VarA.collect(c0821a, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", f = "PageFetcherSnapshot.kt", l = {105}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ enz<Object, Object> b;
        public final /* synthetic */ tb5 c;

        public static final class a<T> implements myh {
            public final /* synthetic */ tb5 a;

            public a(tb5 tb5Var) {
                this.a = tb5Var;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                this.a.c((Unit) obj);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tb5 tb5Var, v1b v1bVar, enz enzVar) {
            super(2, v1bVar);
            this.b = enzVar;
            this.c = tb5Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.c, v1bVar, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                lyh<Unit> lyhVar = this.b.d;
                a aVar = new a(this.c);
                this.a = 1;
                if (lyhVar.collect(aVar, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", f = "PageFetcherSnapshot.kt", l = {110}, m = "invokeSuspend")
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ tb5 c;
        public final /* synthetic */ enz<Object, Object> d;

        public static final class a<T> implements myh {
            public final /* synthetic */ enz<Object, Object> a;
            public final /* synthetic */ v5b b;

            /* JADX INFO: renamed from: lnz$c$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0823a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[kxs.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    a = iArr;
                }
            }

            public a(enz<Object, Object> enzVar, v5b v5bVar) {
                this.a = enzVar;
                this.b = v5bVar;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x0333  */
            /* JADX WARN: Code duplicated, block: B:101:0x0337  */
            /* JADX WARN: Code duplicated, block: B:104:0x0357  */
            /* JADX WARN: Code duplicated, block: B:110:0x0387  */
            /* JADX WARN: Code duplicated, block: B:112:0x038b  */
            /* JADX WARN: Code duplicated, block: B:119:0x03b7 A[PHI: r6 r7 r8
              0x03b7: PHI (r6v48 v5b) = (r6v43 v5b), (r6v49 v5b), (r6v49 v5b) binds: [B:111:0x0389, B:117:0x03b2, B:118:0x03b4] A[DONT_GENERATE, DONT_INLINE]
              0x03b7: PHI (r7v48 enz<java.lang.Object, java.lang.Object>) = 
              (r7v43 enz<java.lang.Object, java.lang.Object>)
              (r7v50 enz<java.lang.Object, java.lang.Object>)
              (r7v50 enz<java.lang.Object, java.lang.Object>)
             binds: [B:111:0x0389, B:117:0x03b2, B:118:0x03b4] A[DONT_GENERATE, DONT_INLINE]
              0x03b7: PHI (r8v35 jxs) = (r8v32 jxs), (r8v37 jxs), (r8v37 jxs) binds: [B:111:0x0389, B:117:0x03b2, B:118:0x03b4] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:129:0x03ca A[PHI: r7 r8 r9
              0x03ca: PHI (r7v47 v5b) = (r7v24 v5b), (r7v49 v5b) binds: [B:89:0x02e7, B:123:0x03be] A[DONT_GENERATE, DONT_INLINE]
              0x03ca: PHI (r8v34 enz<java.lang.Object, java.lang.Object>) = (r8v15 enz<java.lang.Object, java.lang.Object>), (r8v36 enz<java.lang.Object, java.lang.Object>) binds: [B:89:0x02e7, B:123:0x03be] A[DONT_GENERATE, DONT_INLINE]
              0x03ca: PHI (r9v22 jxs) = (r9v10 jxs), (r9v23 jxs) binds: [B:89:0x02e7, B:123:0x03be] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:131:0x03d0  */
            /* JADX WARN: Code duplicated, block: B:134:0x03ec A[Catch: all -> 0x0088, PHI: r2 r6 r7 r8 r12
              0x03ec: PHI (r2v50 onz$a<java.lang.Object, java.lang.Object>) = (r2v46 onz$a<java.lang.Object, java.lang.Object>), (r2v55 onz$a<java.lang.Object, java.lang.Object>) binds: [B:132:0x03e8, B:20:0x008b] A[DONT_GENERATE, DONT_INLINE]
              0x03ec: PHI (r6v52 kxs) = (r6v47 kxs), (r6v54 kxs) binds: [B:132:0x03e8, B:20:0x008b] A[DONT_GENERATE, DONT_INLINE]
              0x03ec: PHI (r7v53 v5b) = (r7v47 v5b), (r7v56 v5b) binds: [B:132:0x03e8, B:20:0x008b] A[DONT_GENERATE, DONT_INLINE]
              0x03ec: PHI (r8v40 enz<java.lang.Object, java.lang.Object>) = (r8v34 enz<java.lang.Object, java.lang.Object>), (r8v43 enz<java.lang.Object, java.lang.Object>) binds: [B:132:0x03e8, B:20:0x008b] A[DONT_GENERATE, DONT_INLINE]
              0x03ec: PHI (r12v63 quw) = (r12v99 quw), (r12v100 quw) binds: [B:132:0x03e8, B:20:0x008b] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #5 {all -> 0x0088, blocks: (B:16:0x0082, B:138:0x0408, B:134:0x03ec), top: B:178:0x0022 }] */
            /* JADX WARN: Code duplicated, block: B:136:0x0402  */
            /* JADX WARN: Code duplicated, block: B:137:0x0404  */
            /* JADX WARN: Code duplicated, block: B:141:0x0417  */
            /* JADX WARN: Code duplicated, block: B:142:0x041b  */
            /* JADX WARN: Code duplicated, block: B:145:0x0438  */
            /* JADX WARN: Code duplicated, block: B:151:0x0464  */
            /* JADX WARN: Code duplicated, block: B:153:0x0468  */
            /* JADX WARN: Code duplicated, block: B:156:0x047f  */
            /* JADX WARN: Code duplicated, block: B:160:0x0491  */
            /* JADX WARN: Code duplicated, block: B:55:0x0232  */
            /* JADX WARN: Code duplicated, block: B:58:0x0241  */
            /* JADX WARN: Code duplicated, block: B:61:0x024e  */
            /* JADX WARN: Code duplicated, block: B:62:0x0252  */
            /* JADX WARN: Code duplicated, block: B:65:0x0271  */
            /* JADX WARN: Code duplicated, block: B:71:0x02a0  */
            /* JADX WARN: Code duplicated, block: B:73:0x02a6  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code duplicated, block: B:83:0x02d7 A[PHI: r6 r7 r8
              0x02d7: PHI (r6v26 v5b) = (r6v21 v5b), (r6v27 v5b), (r6v27 v5b) binds: [B:72:0x02a4, B:78:0x02cc, B:79:0x02ce] A[DONT_GENERATE, DONT_INLINE]
              0x02d7: PHI (r7v25 enz<java.lang.Object, java.lang.Object>) = 
              (r7v20 enz<java.lang.Object, java.lang.Object>)
              (r7v27 enz<java.lang.Object, java.lang.Object>)
              (r7v27 enz<java.lang.Object, java.lang.Object>)
             binds: [B:72:0x02a4, B:78:0x02cc, B:79:0x02ce] A[DONT_GENERATE, DONT_INLINE]
              0x02d7: PHI (r8v16 jxs) = (r8v13 jxs), (r8v18 jxs), (r8v18 jxs) binds: [B:72:0x02a4, B:78:0x02cc, B:79:0x02ce] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:87:0x02e0  */
            /* JADX WARN: Code duplicated, block: B:90:0x02e9  */
            /* JADX WARN: Code duplicated, block: B:93:0x0306 A[Catch: all -> 0x0113, PHI: r2 r6 r7 r8 r9 r12
              0x0306: PHI (r2v31 onz$a<java.lang.Object, java.lang.Object>) = (r2v27 onz$a<java.lang.Object, java.lang.Object>), (r2v35 onz$a<java.lang.Object, java.lang.Object>) binds: [B:91:0x0302, B:29:0x0116] A[DONT_GENERATE, DONT_INLINE]
              0x0306: PHI (r6v30 kxs) = (r6v25 kxs), (r6v32 kxs) binds: [B:91:0x0302, B:29:0x0116] A[DONT_GENERATE, DONT_INLINE]
              0x0306: PHI (r7v30 v5b) = (r7v24 v5b), (r7v33 v5b) binds: [B:91:0x0302, B:29:0x0116] A[DONT_GENERATE, DONT_INLINE]
              0x0306: PHI (r8v21 enz<java.lang.Object, java.lang.Object>) = (r8v15 enz<java.lang.Object, java.lang.Object>), (r8v23 enz<java.lang.Object, java.lang.Object>) binds: [B:91:0x0302, B:29:0x0116] A[DONT_GENERATE, DONT_INLINE]
              0x0306: PHI (r9v12 jxs) = (r9v10 jxs), (r9v15 jxs) binds: [B:91:0x0302, B:29:0x0116] A[DONT_GENERATE, DONT_INLINE]
              0x0306: PHI (r12v36 quw) = (r12v103 quw), (r12v104 quw) binds: [B:91:0x0302, B:29:0x0116] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x0113, blocks: (B:25:0x010c, B:97:0x0324, B:93:0x0306), top: B:178:0x0022 }] */
            /* JADX WARN: Code duplicated, block: B:95:0x031e  */
            /* JADX WARN: Code duplicated, block: B:96:0x0320  */
            /* JADX WARN: Code restructure failed: missing block: B:113:0x03a1, code lost:
            
                if (r12.d(r0) == r1) goto L155;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x02bb, code lost:
            
                if (r12.d(r0) == r1) goto L155;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, lnz$c$a, lnz$c$a<T>] */
            /* JADX WARN: Type inference failed for: r12v1, types: [quw] */
            /* JADX WARN: Type inference failed for: r12v101 */
            /* JADX WARN: Type inference failed for: r12v102 */
            /* JADX WARN: Type inference failed for: r12v105 */
            /* JADX WARN: Type inference failed for: r12v106 */
            /* JADX WARN: Type inference failed for: r12v15, types: [quw] */
            /* JADX WARN: Type inference failed for: r12v2, types: [quw] */
            /* JADX WARN: Type inference failed for: r12v3, types: [quw] */
            /* JADX WARN: Type inference failed for: r12v39, types: [quw] */
            /* JADX WARN: Type inference failed for: r12v66, types: [quw] */
            /* JADX WARN: Type inference failed for: r12v97 */
            /* JADX WARN: Type inference failed for: r12v98 */
            /* JADX WARN: Type inference failed for: r7v1 */
            /* JADX WARN: Type inference failed for: r7v2, types: [lnz$c$a] */
            /* JADX WARN: Type inference failed for: r7v66 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object c(defpackage.v1b r13) {
                /*
                    Method dump skipped, instruction units count: 1234
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: lnz.c.a.c(v1b):java.lang.Object");
            }

            @Override // defpackage.myh
            public final /* bridge */ /* synthetic */ Object emit(Object obj, v1b v1bVar) {
                return c(v1bVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tb5 tb5Var, v1b v1bVar, enz enzVar) {
            super(2, v1bVar);
            this.c = tb5Var;
            this.d = enzVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = new c(this.c, v1bVar, this.d);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                v5b v5bVar = (v5b) this.b;
                o67 o67VarA = izh.a(this.c);
                a aVar = new a(this.d, v5bVar);
                this.a = 1;
                if (o67VarA.collect(aVar, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnz(enz<Object, Object> enzVar, v1b<? super lnz> v1bVar) {
        super(2, v1bVar);
        this.f = enzVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lnz lnzVar = new lnz(this.f, v1bVar);
        lnzVar.e = obj;
        return lnzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(hk90<xmz<Object>> hk90Var, v1b<? super Unit> v1bVar) {
        return ((lnz) create(hk90Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d9  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        hk90 hk90Var;
        y650<Object, Object> y650Var;
        xqz<Object, Object> xqzVarA;
        tuw tuwVar;
        onz.a<Object, Object> aVar;
        hk90 hk90Var2;
        quw quwVar;
        hk90 hk90Var3;
        hxs hxsVarA;
        enz<Object, Object> enzVar = this.f;
        onz.a<Object, Object> aVar2 = enzVar.j;
        y5b y5bVar = y5b.a;
        int i = this.d;
        try {
            if (i != 0) {
                if (i == 1) {
                    tuwVar = this.c;
                    aVar = (onz.a) this.b;
                    y650Var = (y650) this.a;
                    hk90Var = (hk90) this.e;
                    uj50.b(obj);
                } else {
                    if (i == 2) {
                        hk90Var2 = (hk90) this.e;
                        uj50.b(obj);
                        quwVar = aVar2.a;
                        this.e = hk90Var2;
                        this.a = aVar2;
                        this.b = quwVar;
                        this.d = 3;
                        if (quwVar.d(this) != y5bVar) {
                            hk90Var3 = hk90Var2;
                        }
                        return y5bVar;
                    }
                    if (i != 3) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    quw quwVar2 = (quw) this.b;
                    onz.a<Object, Object> aVar3 = (onz.a) this.a;
                    hk90Var3 = (hk90) this.e;
                    uj50.b(obj);
                    quwVar = quwVar2;
                    aVar2 = aVar3;
                }
                try {
                    hxsVarA = aVar2.b.l.a(kxs.a);
                    quwVar.f(null);
                    if (!(hxsVarA instanceof hxs.a)) {
                        enzVar.k(hk90Var3);
                    }
                    return Unit.a;
                } catch (Throwable th) {
                    quwVar.f(null);
                    throw th;
                }
            }
            uj50.b(obj);
            hk90Var = (hk90) this.e;
            if (!enzVar.h.compareAndSet(false, true)) {
                ib5.a("Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?");
                return null;
            }
            ej5.c(hk90Var, null, null, new a(enzVar, hk90Var, null), 3);
            tb5 tb5VarB = d77.b(0, 6, null);
            ej5.c(hk90Var, null, null, new b(tb5VarB, null, enzVar), 3);
            ej5.c(hk90Var, null, null, new c(tb5VarB, null, enzVar), 3);
            y650Var = enzVar.e;
            if (y650Var == null) {
                this.e = hk90Var;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = 2;
                if (enzVar.c(this) != y5bVar) {
                    hk90Var2 = hk90Var;
                    quwVar = aVar2.a;
                    this.e = hk90Var2;
                    this.a = aVar2;
                    this.b = quwVar;
                    this.d = 3;
                    if (quwVar.d(this) != y5bVar) {
                        hk90Var3 = hk90Var2;
                        hxsVarA = aVar2.b.l.a(kxs.a);
                        quwVar.f(null);
                        if (!(hxsVarA instanceof hxs.a)) {
                            enzVar.k(hk90Var3);
                        }
                        return Unit.a;
                    }
                }
            } else {
                xqzVarA = enzVar.f;
                if (xqzVarA == null) {
                    tuwVar = aVar2.a;
                    this.e = hk90Var;
                    this.a = y650Var;
                    this.b = aVar2;
                    this.c = tuwVar;
                    this.d = 1;
                    if (tuwVar.d(this) != y5bVar) {
                        aVar = aVar2;
                    }
                } else {
                    y650Var.a(xqzVarA);
                    this.e = hk90Var;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = 2;
                    if (enzVar.c(this) != y5bVar) {
                        hk90Var2 = hk90Var;
                        quwVar = aVar2.a;
                        this.e = hk90Var2;
                        this.a = aVar2;
                        this.b = quwVar;
                        this.d = 3;
                        if (quwVar.d(this) != y5bVar) {
                            hk90Var3 = hk90Var2;
                            hxsVarA = aVar2.b.l.a(kxs.a);
                            quwVar.f(null);
                            if (!(hxsVarA instanceof hxs.a)) {
                                enzVar.k(hk90Var3);
                            }
                            return Unit.a;
                        }
                    }
                }
            }
            return y5bVar;
            xqzVarA = aVar.b.a(null);
            tuwVar.f(null);
            y650Var.a(xqzVarA);
            this.e = hk90Var;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = 2;
            if (enzVar.c(this) != y5bVar) {
                hk90Var2 = hk90Var;
                quwVar = aVar2.a;
                this.e = hk90Var2;
                this.a = aVar2;
                this.b = quwVar;
                this.d = 3;
                if (quwVar.d(this) != y5bVar) {
                    hk90Var3 = hk90Var2;
                    hxsVarA = aVar2.b.l.a(kxs.a);
                    quwVar.f(null);
                    if (!(hxsVarA instanceof hxs.a)) {
                        enzVar.k(hk90Var3);
                    }
                    return Unit.a;
                }
            }
            return y5bVar;
        } catch (Throwable th2) {
            tuwVar.f(null);
            throw th2;
        }
    }
}
