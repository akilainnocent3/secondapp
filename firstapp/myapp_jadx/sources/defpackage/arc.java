package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", l = {72, 74, 100}, m = "invokeSuspend")
public final class arc extends tje0 implements Function2<myh<Object>, v1b<? super Unit>, Object> {
    public ioc a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yqc<Object> d;

    @c0d(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", l = {HttpStatusCodesKt.HTTP_PROCESSING}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<myh<? super swd0<Object>>, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ yqc<Object> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yqc<Object> yqcVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = yqcVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super swd0<Object>> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (this.b.d(this) == y5bVar) {
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

    @c0d(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<swd0<Object>, v1b<? super Boolean>, Object> {
        public /* synthetic */ Object a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(2, v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(swd0<Object> swd0Var, v1b<? super Boolean> v1bVar) {
            return ((b) create(swd0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(!(((swd0) this.a) instanceof mnh));
        }
    }

    @c0d(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
    public static final class c extends tje0 implements Function2<swd0<Object>, v1b<? super Boolean>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ swd0<Object> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(swd0<Object> swd0Var, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = swd0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = new c(this.b, v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(swd0<Object> swd0Var, v1b<? super Boolean> v1bVar) {
            return ((c) create(swd0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            swd0 swd0Var = (swd0) this.a;
            return Boolean.valueOf((swd0Var instanceof ioc) && swd0Var.a <= this.b.a);
        }
    }

    @c0d(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", l = {116}, m = "invokeSuspend")
    public static final class d extends tje0 implements gaj<myh<Object>, Throwable, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ yqc<Object> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(yqc<Object> yqcVar, v1b<? super d> v1bVar) {
            super(3, v1bVar);
            this.b = yqcVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<Object> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            return new d(this.b, v1bVar).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (this.b.a(this) == y5bVar) {
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

    public static final class e implements lyh<Object> {
        public final /* synthetic */ f0i a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: arc$e$a$a, reason: collision with other inner class name */
            @c0d(c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreImpl.kt", l = {223}, m = "emit")
            public static final class C0090a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0090a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) throws Throwable {
                C0090a c0090a;
                if (v1bVar instanceof C0090a) {
                    c0090a = (C0090a) v1bVar;
                    int i = c0090a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0090a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0090a = new C0090a(v1bVar);
                    }
                } else {
                    c0090a = new C0090a(v1bVar);
                }
                Object obj2 = c0090a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0090a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    swd0 swd0Var = (swd0) obj;
                    if (swd0Var instanceof m340) {
                        throw ((m340) swd0Var).b;
                    }
                    if (!(swd0Var instanceof ioc)) {
                        if (swd0Var instanceof mnh ? true : swd0Var instanceof cdh0) {
                            ib5.a("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            return null;
                        }
                        uhc.a();
                        return null;
                    }
                    T t = ((ioc) swd0Var).b;
                    c0090a.b = 1;
                    if (this.a.emit(t, c0090a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public e(f0i f0iVar) {
            this.a = f0iVar;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super Object> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arc(yqc<Object> yqcVar, v1b<? super arc> v1bVar) {
        super(2, v1bVar);
        this.d = yqcVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        arc arcVar = new arc(this.d, v1bVar);
        arcVar.c = obj;
        return arcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<Object> myhVar, v1b<? super Unit> v1bVar) {
        return ((arc) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        if (defpackage.kzh.c(r3, r4, r9) == r0) goto L31;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r9.b
            r2 = 3
            r3 = 1
            yqc<java.lang.Object> r4 = r9.d
            r5 = 2
            r6 = 0
            if (r1 == 0) goto L30
            if (r1 == r3) goto L27
            if (r1 == r5) goto L1d
            if (r1 != r2) goto L17
            defpackage.uj50.b(r10)
            goto Lb5
        L17:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r6
        L1d:
            ioc r1 = r9.a
            java.lang.Object r3 = r9.c
            myh r3 = (defpackage.myh) r3
            defpackage.uj50.b(r10)
            goto L77
        L27:
            java.lang.Object r1 = r9.c
            myh r1 = (defpackage.myh) r1
            defpackage.uj50.b(r10)
            r3 = r1
            goto L4f
        L30:
            defpackage.uj50.b(r10)
            java.lang.Object r10 = r9.c
            myh r10 = (defpackage.myh) r10
            r9.c = r10
            r9.b = r3
            v5b r1 = r4.c
            kotlin.coroutines.CoroutineContext r1 = r1.getCoroutineContext()
            krc r3 = new krc
            r3.<init>(r4, r6)
            java.lang.Object r1 = defpackage.ej5.d(r1, r3, r9)
            if (r1 != r0) goto L4d
            goto Lb4
        L4d:
            r3 = r10
            r10 = r1
        L4f:
            r1 = r10
            swd0 r1 = (defpackage.swd0) r1
            boolean r10 = r1 instanceof defpackage.ioc
            if (r10 == 0) goto L68
            r10 = r1
            ioc r10 = (defpackage.ioc) r10
            T r7 = r10.b
            r9.c = r3
            r9.a = r10
            r9.b = r5
            java.lang.Object r10 = r3.emit(r7, r9)
            if (r10 != r0) goto L77
            goto Lb4
        L68:
            boolean r10 = r1 instanceof defpackage.cdh0
            if (r10 != 0) goto Lbd
            boolean r10 = r1 instanceof defpackage.m340
            if (r10 != 0) goto Lb8
            boolean r10 = r1 instanceof defpackage.mnh
            if (r10 == 0) goto L77
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L77:
            src<T> r10 = r4.h
            wwd0 r10 = r10.a
            arc$a r7 = new arc$a
            r7.<init>(r4, r6)
            xzh r8 = new xzh
            r8.<init>(r10, r7)
            arc$b r10 = new arc$b
            r10.<init>(r5, r6)
            k0i r5 = new k0i
            r5.<init>(r8, r10)
            arc$c r10 = new arc$c
            r10.<init>(r1, r6)
            f0i r1 = new f0i
            r1.<init>(r5, r10)
            arc$e r10 = new arc$e
            r10.<init>(r1)
            arc$d r1 = new arc$d
            r1.<init>(r4, r6)
            wzh r4 = new wzh
            r4.<init>(r10, r1)
            r9.c = r6
            r9.a = r6
            r9.b = r2
            java.lang.Object r9 = defpackage.kzh.c(r3, r4, r9)
            if (r9 != r0) goto Lb5
        Lb4:
            return r0
        Lb5:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        Lb8:
            m340 r1 = (defpackage.m340) r1
            java.lang.Throwable r9 = r1.b
            throw r9
        Lbd:
            java.lang.String r9 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            defpackage.ib5.a(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
