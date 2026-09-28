package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lu7i;", "Lc82;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class u7i extends c82 {
    public final t7i d;
    public final uqm e;
    public final wwd0 f;
    public final v340 i;
    public final wuw<b6i> v;
    public lyh<? extends b6i> w;

    public static final class a implements lyh<x7i> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: u7i$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.codehub.viewmodel.FollowCodeViewModel$getFollowingCode$$inlined$map$1", f = "FollowCodeViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C1167a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1167a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: u7i$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.codehub.viewmodel.FollowCodeViewModel$getFollowingCode$$inlined$map$1$2", f = "FollowCodeViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C1168a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1168a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C1168a c1168a;
                Object aVar;
                Object bVar;
                if (v1bVar instanceof C1168a) {
                    c1168a = (C1168a) v1bVar;
                    int i = c1168a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1168a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1168a = new C1168a(v1bVar);
                    }
                } else {
                    c1168a = new C1168a(v1bVar);
                }
                Object obj2 = c1168a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1168a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    lk50 lk50Var = (lk50) obj;
                    if (lk50Var instanceof lk50.c) {
                        s7a0 s7a0Var = (s7a0) ((lk50.c) lk50Var).a;
                        if (!s7a0Var.a) {
                            aVar = new x7i.a();
                        } else if (s7a0Var.c) {
                            bVar = new x7i.c(s7a0Var.b);
                            aVar = bVar;
                        } else {
                            aVar = x7i.e.a;
                        }
                    } else if (lk50Var instanceof lk50.a) {
                        lk50.a aVar2 = (lk50.a) lk50Var;
                        bVar = new x7i.b(aVar2.a, aVar2.b);
                        aVar = bVar;
                    } else {
                        if (!(lk50Var instanceof lk50.b)) {
                            uhc.a();
                            return null;
                        }
                        aVar = x7i.d.a;
                    }
                    c1168a.b = 1;
                    if (this.a.emit(aVar, c1168a) == y5bVar) {
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

        public a(lyh lyhVar) {
            this.a = lyhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super x7i> myhVar, v1b v1bVar) {
            C1167a c1167a;
            if (v1bVar instanceof C1167a) {
                c1167a = (C1167a) v1bVar;
                int i = c1167a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1167a.b = i - Integer.MIN_VALUE;
                } else {
                    c1167a = new C1167a(v1bVar);
                }
            } else {
                c1167a = new C1167a(v1bVar);
            }
            Object obj = c1167a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1167a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c1167a.b = 1;
                if (this.a.collect(bVar, c1167a) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.codehub.viewmodel.FollowCodeViewModel$getFollowingCode$2", f = "FollowCodeViewModel.kt", l = {81}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<x7i, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = u7i.this.new b(v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x7i x7iVar, v1b<? super Unit> v1bVar) {
            return ((b) create(x7iVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            x7i x7iVar = (x7i) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = u7i.this.f;
                this.b = null;
                this.a = 1;
                wwd0Var.setValue(x7iVar);
                if (Unit.a == y5bVar) {
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

    public u7i(vu60 vu60Var, t7i t7iVar, uqm uqmVar) {
        vu60Var.getClass();
        uqmVar.getClass();
        this.d = t7iVar;
        this.e = uqmVar;
        wwd0 wwd0VarA = xwd0.a(x7i.d.a);
        this.f = wwd0VarA;
        this.i = e1i.b(wwd0VarA);
        this.v = new wuw<>();
        this.w = i2g.a;
    }

    public final void x1(boolean z) {
        lyh gzhVar;
        uqm uqmVar = this.e;
        boolean zIsLogin = uqmVar.isLogin();
        wwd0 wwd0Var = this.f;
        if (!zIsLogin) {
            x7i.a aVar = new x7i.a();
            wwd0Var.getClass();
            wwd0Var.k(null, aVar);
        } else {
            if (!uqmVar.hasPersonalPage()) {
                wwd0Var.setValue(x7i.e.a);
                return;
            }
            t7i t7iVar = this.d;
            if (t7iVar.b.isLogin()) {
                gzhVar = bm50.m(t7iVar.a.a(z ? pu0.c.a : new pu0.a(0)), new s7i());
            } else {
                gzhVar = new gzh(new lk50.c(new s7a0("", false, false)));
            }
            kzh.d(new g1i(new a(gzhVar), new b(null)), o8i0.d(this));
        }
    }
}
