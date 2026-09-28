package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.PageFetcher$injectRemoteEvents$1", f = "PageFetcher.kt", l = {203}, m = "invokeSuspend")
public final class dnz extends tje0 implements Function2<hk90<xmz<Object>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ x650<Object, Object> c;
    public final /* synthetic */ enz<Object, Object> d;
    public final /* synthetic */ tsw e;

    public static final class a<T> implements myh {
        public final /* synthetic */ hk90<xmz<Object>> a;

        public a(hk90<xmz<Object>> hk90Var) {
            this.a = hk90Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object objJ = this.a.j(v1bVar, (xmz) obj);
            return objJ == y5b.a ? objJ : Unit.a;
        }
    }

    @c0d(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1", f = "PageFetcher.kt", l = {161}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<hk90<xmz<Object>>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ lyh d;
        public final /* synthetic */ tsw e;

        @c0d(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1", f = "PageFetcher.kt", l = {141}, m = "invokeSuspend")
        public static final class a extends tje0 implements iaj<jxs, xmz<Object>, v78, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public /* synthetic */ Object c;
            public /* synthetic */ v78 d;
            public final /* synthetic */ hk90<xmz<Object>> e;
            public final /* synthetic */ tsw f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(hk90 hk90Var, v1b v1bVar, tsw tswVar) {
                super(4, v1bVar);
                this.f = tswVar;
                this.e = hk90Var;
            }

            @Override // defpackage.iaj
            public final Object d(jxs jxsVar, xmz<Object> xmzVar, v78 v78Var, v1b<? super Unit> v1bVar) {
                a aVar = new a(this.e, v1bVar, this.f);
                aVar.b = jxsVar;
                aVar.c = xmzVar;
                aVar.d = v78Var;
                return aVar.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    Object obj2 = this.b;
                    Object obj3 = this.c;
                    v78 v78Var = this.d;
                    Object cVar = (xmz) obj3;
                    jxs jxsVar = (jxs) obj2;
                    v78 v78Var2 = v78.b;
                    tsw tswVar = this.f;
                    if (v78Var == v78Var2) {
                        cVar = new xmz.c(tswVar.d(), jxsVar);
                    } else if (cVar instanceof xmz.b) {
                        xmz.b bVar = (xmz.b) cVar;
                        jxs jxsVar2 = bVar.e;
                        tswVar.b(jxsVar2);
                        kxs kxsVar = bVar.a;
                        List<msg0<T>> list = bVar.b;
                        int i2 = bVar.c;
                        int i3 = bVar.d;
                        kxsVar.getClass();
                        list.getClass();
                        cVar = new xmz.b(kxsVar, list, i2, i3, jxsVar2, jxsVar);
                    } else if (cVar instanceof xmz.a) {
                        tswVar.c(((xmz.a) cVar).a, hxs.c.c);
                    } else {
                        if (!(cVar instanceof xmz.c)) {
                            if (cVar instanceof xmz.d) {
                                ib5.a("Paging generated an event to display a static list that\n originated from a paginated source. If you see this\n exception, it is most likely a bug in the library.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106");
                                return null;
                            }
                            uhc.a();
                            return null;
                        }
                        jxs jxsVar3 = ((xmz.c) cVar).a;
                        tswVar.b(jxsVar3);
                        cVar = new xmz.c(jxsVar3, jxsVar);
                    }
                    this.a = 1;
                    if (this.e.j(this, cVar) == y5bVar) {
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

        /* JADX INFO: renamed from: dnz$b$b, reason: collision with other inner class name */
        @c0d(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", l = {147}, m = "invokeSuspend")
        public static final class C0496b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ hk90<xmz<Object>> b;
            public final /* synthetic */ lyh c;
            public final /* synthetic */ AtomicInteger d;
            public final /* synthetic */ fdh0 e;
            public final /* synthetic */ int f;

            /* JADX INFO: renamed from: dnz$b$b$a */
            public static final class a<T> implements myh {
                public final /* synthetic */ fdh0 a;
                public final /* synthetic */ int b;

                /* JADX INFO: renamed from: dnz$b$b$a$a, reason: collision with other inner class name */
                public static final class C0497a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public C0497a(v1b v1bVar) {
                        super(v1bVar);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(fdh0 fdh0Var, int i) {
                    this.a = fdh0Var;
                    this.b = i;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
                
                    if (defpackage.lal.c(r0) == r1) goto L21;
                 */
                @Override // defpackage.myh
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, defpackage.v1b<? super kotlin.Unit> r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof dnz.b.C0496b.a.C0497a
                        if (r0 == 0) goto L13
                        r0 = r7
                        dnz$b$b$a$a r0 = (dnz.b.C0496b.a.C0497a) r0
                        int r1 = r0.b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.b = r1
                        goto L18
                    L13:
                        dnz$b$b$a$a r0 = new dnz$b$b$a$a
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.a
                        y5b r1 = defpackage.y5b.a
                        int r2 = r0.b
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L35
                        if (r2 == r4) goto L31
                        if (r2 != r3) goto L2a
                        defpackage.uj50.b(r7)
                        goto L4e
                    L2a:
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.ib5.a(r5)
                        r5 = 0
                        return r5
                    L31:
                        defpackage.uj50.b(r7)
                        goto L45
                    L35:
                        defpackage.uj50.b(r7)
                        r0.b = r4
                        fdh0 r7 = r5.a
                        int r5 = r5.b
                        java.lang.Object r5 = r7.a(r5, r6, r0)
                        if (r5 != r1) goto L45
                        goto L4d
                    L45:
                        r0.b = r3
                        java.lang.Object r5 = defpackage.lal.c(r0)
                        if (r5 != r1) goto L4e
                    L4d:
                        return r1
                    L4e:
                        kotlin.Unit r5 = kotlin.Unit.a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: dnz.b.C0496b.a.emit(java.lang.Object, v1b):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0496b(lyh lyhVar, AtomicInteger atomicInteger, hk90 hk90Var, fdh0 fdh0Var, int i, v1b v1bVar) {
                super(2, v1bVar);
                this.c = lyhVar;
                this.d = atomicInteger;
                this.e = fdh0Var;
                this.f = i;
                this.b = hk90Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0496b(this.c, this.d, this.b, this.e, this.f, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0496b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                hk90<xmz<Object>> hk90Var = this.b;
                AtomicInteger atomicInteger = this.d;
                try {
                    if (i == 0) {
                        uj50.b(obj);
                        lyh lyhVar = this.c;
                        a aVar = new a(this.e, this.f);
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
                    if (atomicInteger.decrementAndGet() == 0) {
                        hk90Var.k(null);
                    }
                    return Unit.a;
                } catch (Throwable th) {
                    if (atomicInteger.decrementAndGet() == 0) {
                        hk90Var.k(null);
                    }
                    throw th;
                }
            }
        }

        public static final class c extends qlr implements Function0<Unit> {
            public final /* synthetic */ e9p a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(e9p e9pVar) {
                super(0);
                this.a = e9pVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                this.a.cancel((CancellationException) null);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lyh lyhVar, lyh lyhVar2, v1b v1bVar, tsw tswVar) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = lyhVar2;
            this.e = tswVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.c, this.d, v1bVar, this.e);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(hk90<xmz<Object>> hk90Var, v1b<? super Unit> v1bVar) {
            return ((b) create(hk90Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                hk90 hk90Var = (hk90) this.b;
                AtomicInteger atomicInteger = new AtomicInteger(2);
                fdh0 fdh0Var = new fdh0(new a(hk90Var, null, this.e));
                e9p e9pVarA = i9p.a();
                lyh[] lyhVarArr = {this.c, this.d};
                int i2 = 0;
                int i3 = 0;
                while (i3 < 2) {
                    ej5.c(hk90Var, e9pVarA, null, new C0496b(lyhVarArr[i3], atomicInteger, hk90Var, fdh0Var, i2, null), 2);
                    i3++;
                    i2++;
                }
                c cVar = new c(e9pVarA);
                this.a = 1;
                if (hk90Var.l(cVar, this) == y5bVar) {
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
    public dnz(x650<Object, Object> x650Var, enz<Object, Object> enzVar, tsw tswVar, v1b<? super dnz> v1bVar) {
        super(2, v1bVar);
        this.c = x650Var;
        this.d = enzVar;
        this.e = tswVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dnz dnzVar = new dnz(this.c, this.d, this.e, v1bVar);
        dnzVar.b = obj;
        return dnzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(hk90<xmz<Object>> hk90Var, v1b<? super Unit> v1bVar) {
        return ((dnz) create(hk90Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            hk90 hk90Var = (hk90) this.b;
            lyh lyhVarA = rj90.a(new b(this.c.getState(), this.d.l, null, this.e));
            a aVar = new a(hk90Var);
            this.a = 1;
            if (lyhVarA.collect(aVar, this) == y5bVar) {
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
