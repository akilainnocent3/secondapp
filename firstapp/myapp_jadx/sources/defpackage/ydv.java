package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.account.themes.ThemeConfig;
import com.sportybet.core.gift.domain.DobGift;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lydv;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "profile"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ydv extends twl {
    public mgb0 A;
    public final q8i0 B;
    public kv0 f;
    public ifv i;
    public com.sporty.android.common.uievent.e v;
    public mrm w;
    public tta y;
    public wue z;

    @c0d(c = "com.sportybet.feature.profile.me.presentation.MeFragment$onViewCreated$$inlined$collectWithLifecycle$1", f = "MeFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ibs b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ ydv d;

        /* JADX INFO: renamed from: ydv$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.profile.me.presentation.MeFragment$onViewCreated$$inlined$collectWithLifecycle$1$1", f = "MeFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class C1334a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ lyh c;
            public final /* synthetic */ ydv d;

            /* JADX INFO: renamed from: ydv$a$a$a, reason: collision with other inner class name */
            public static final class C1335a<T> implements myh {
                public final /* synthetic */ v5b a;
                public final /* synthetic */ ydv b;

                public C1335a(v5b v5bVar, ydv ydvVar) {
                    this.b = ydvVar;
                    this.a = v5bVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.myh
                public final Object emit(T t, v1b<? super Unit> v1bVar) {
                    if (Intrinsics.g((Boolean) t, Boolean.TRUE)) {
                        ydv ydvVar = this.b;
                        tta ttaVar = ydvVar.y;
                        if (ttaVar == null) {
                            Intrinsics.n("confirmNameDialogLauncher");
                            throw null;
                        }
                        androidx.fragment.app.e eVarRequireActivity = ydvVar.requireActivity();
                        eVarRequireActivity.getClass();
                        Object objC = ttaVar.c(eVarRequireActivity, vtp.ME_PAGE, v1bVar);
                        if (objC == y5b.a) {
                            return objC;
                        }
                    } else {
                        Unit unit = Unit.a;
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1334a(lyh lyhVar, v1b v1bVar, ydv ydvVar) {
                super(2, v1bVar);
                this.c = lyhVar;
                this.d = ydvVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C1334a c1334a = new C1334a(this.c, v1bVar, this.d);
                c1334a.b = obj;
                return c1334a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1334a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    C1335a c1335a = new C1335a(v5bVar, this.d);
                    this.b = null;
                    this.a = 1;
                    if (this.c.collect(c1335a, this) == y5bVar) {
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
        public a(ibs ibsVar, lyh lyhVar, v1b v1bVar, ydv ydvVar) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = ibsVar;
            this.c = lyhVar;
            this.d = ydvVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new a(this.b, this.c, v1bVar, this.d);
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
                s9s lifecycle = this.b.getLifecycle();
                s9s.b bVar = s9s.b.e;
                C1334a c1334a = new C1334a(this.c, null, this.d);
                this.a = 1;
                if (m850.a(lifecycle, bVar, c1334a, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.profile.me.presentation.MeFragment$onViewCreated$$inlined$collectWithLifecycle$2", f = "MeFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ibs b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ ydv d;

        @c0d(c = "com.sportybet.feature.profile.me.presentation.MeFragment$onViewCreated$$inlined$collectWithLifecycle$2$1", f = "MeFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ lyh c;
            public final /* synthetic */ ydv d;

            /* JADX INFO: renamed from: ydv$b$a$a, reason: collision with other inner class name */
            public static final class C1336a<T> implements myh {
                public final /* synthetic */ v5b a;
                public final /* synthetic */ ydv b;

                public C1336a(v5b v5bVar, ydv ydvVar) {
                    this.b = ydvVar;
                    this.a = v5bVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.myh
                public final Object emit(T t, v1b<? super Unit> v1bVar) {
                    if (!((Boolean) t).booleanValue()) {
                        rhv rhvVarN0 = this.b.n0();
                        ej5.c(o8i0.d(rhvVarN0), null, null, new qhv(rhvVarN0, null), 3);
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(lyh lyhVar, v1b v1bVar, ydv ydvVar) {
                super(2, v1bVar);
                this.c = lyhVar;
                this.d = ydvVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.c, v1bVar, this.d);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    C1336a c1336a = new C1336a(v5bVar, this.d);
                    this.b = null;
                    this.a = 1;
                    if (this.c.collect(c1336a, this) == y5bVar) {
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
        public b(ibs ibsVar, lyh lyhVar, v1b v1bVar, ydv ydvVar) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = ibsVar;
            this.c = lyhVar;
            this.d = ydvVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new b(this.b, this.c, v1bVar, this.d);
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
                s9s lifecycle = this.b.getLifecycle();
                s9s.b bVar = s9s.b.d;
                a aVar = new a(this.c, null, this.d);
                this.a = 1;
                if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.profile.me.presentation.MeFragment$onViewCreated$$inlined$collectWithLifecycle$default$1", f = "MeFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ibs b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ ydv d;

        @c0d(c = "com.sportybet.feature.profile.me.presentation.MeFragment$onViewCreated$$inlined$collectWithLifecycle$default$1$1", f = "MeFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ lyh c;
            public final /* synthetic */ ydv d;

            /* JADX INFO: renamed from: ydv$c$a$a, reason: collision with other inner class name */
            public static final class C1337a<T> implements myh {
                public final /* synthetic */ v5b a;
                public final /* synthetic */ ydv b;

                public C1337a(v5b v5bVar, ydv ydvVar) {
                    this.b = ydvVar;
                    this.a = v5bVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.myh
                public final Object emit(T t, v1b<? super Unit> v1bVar) {
                    ThemeConfig themeConfig = (ThemeConfig) t;
                    ydv ydvVar = this.b;
                    kv0 kv0Var = ydvVar.f;
                    if (kv0Var == null) {
                        Intrinsics.n("applyThemeDelegate");
                        throw null;
                    }
                    Context contextRequireContext = ydvVar.requireContext();
                    contextRequireContext.getClass();
                    kv0Var.E(contextRequireContext, themeConfig);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(lyh lyhVar, v1b v1bVar, ydv ydvVar) {
                super(2, v1bVar);
                this.c = lyhVar;
                this.d = ydvVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.c, v1bVar, this.d);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    C1337a c1337a = new C1337a(v5bVar, this.d);
                    this.b = null;
                    this.a = 1;
                    if (this.c.collect(c1337a, this) == y5bVar) {
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
        public c(ibs ibsVar, lyh lyhVar, v1b v1bVar, ydv ydvVar) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = ibsVar;
            this.c = lyhVar;
            this.d = ydvVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new c(this.b, this.c, v1bVar, this.d);
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
                s9s lifecycle = this.b.getLifecycle();
                s9s.b bVar = s9s.b.d;
                a aVar = new a(this.c, null, this.d);
                this.a = 1;
                if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.profile.me.presentation.MeFragment$onViewCreated$$inlined$collectWithLifecycle$default$2", f = "MeFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ibs b;
        public final /* synthetic */ t340 c;
        public final /* synthetic */ ydv d;

        @c0d(c = "com.sportybet.feature.profile.me.presentation.MeFragment$onViewCreated$$inlined$collectWithLifecycle$default$2$1", f = "MeFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ t340 c;
            public final /* synthetic */ ydv d;

            /* JADX INFO: renamed from: ydv$d$a$a, reason: collision with other inner class name */
            public static final class C1338a<T> implements myh {
                public final /* synthetic */ v5b a;
                public final /* synthetic */ ydv b;

                public C1338a(v5b v5bVar, ydv ydvVar) {
                    this.b = ydvVar;
                    this.a = v5bVar;
                }

                @Override // defpackage.myh
                public final Object emit(T t, v1b<? super Unit> v1bVar) {
                    iev ievVar = (iev) t;
                    boolean z = ievVar instanceof iev.r;
                    ydv ydvVar = this.b;
                    if (z) {
                        ydvVar.m0().u(((iev.r) ievVar).a);
                    } else if (ievVar instanceof iev.q) {
                        ydvVar.m0().B(((iev.q) ievVar).a);
                    } else if (ievVar instanceof iev.c) {
                        ydvVar.m0().l();
                    } else if (ievVar instanceof iev.a) {
                        ydvVar.m0().i(((iev.a) ievVar).a);
                    } else if (ievVar instanceof iev.b) {
                        iev.b bVar = (iev.b) ievVar;
                        ydvVar.m0().f(bVar.b, bVar.a, bVar.c);
                    } else if (ievVar instanceof iev.f) {
                        ifv ifvVarM0 = ydvVar.m0();
                        snb0 snb0Var = snb0.DEPP_LINK;
                        ifvVarM0.A();
                    } else if (ievVar instanceof iev.l) {
                        ydvVar.m0().e();
                    } else if (ievVar instanceof iev.p) {
                        ydvVar.m0().a();
                    } else if (ievVar instanceof iev.i) {
                        ydvVar.m0().b();
                    } else if (ievVar instanceof iev.x) {
                        iev.x xVar = (iev.x) ievVar;
                        ydvVar.m0().x(xVar.a, xVar.b);
                    } else if (ievVar instanceof iev.o) {
                        ydvVar.m0().g();
                    } else if (ievVar instanceof iev.c0) {
                        ydvVar.m0().d();
                    } else if (ievVar instanceof iev.e) {
                        ydvVar.m0().h();
                    } else if (ievVar instanceof iev.u) {
                        ydvVar.m0().w();
                    } else if (ievVar instanceof iev.d) {
                        ydvVar.m0().v();
                    } else if (ievVar instanceof iev.w) {
                        ydvVar.m0().r(((iev.w) ievVar).a);
                    } else if (ievVar instanceof iev.b0) {
                        ydvVar.m0().q();
                    } else if (ievVar instanceof iev.h) {
                        ydvVar.m0().n();
                    } else if (ievVar instanceof iev.y) {
                        ydvVar.m0().z();
                    } else if (ievVar instanceof iev.z) {
                        ydvVar.m0().c();
                    } else if (ievVar instanceof iev.k) {
                        ydvVar.m0().t();
                    } else if (ievVar instanceof iev.a0) {
                        ydvVar.m0().o(((iev.a0) ievVar).a);
                    } else if (ievVar instanceof iev.s) {
                        ydvVar.m0().s(((iev.s) ievVar).a);
                    } else if (ievVar instanceof iev.m) {
                        iev.m mVar = (iev.m) ievVar;
                        ydvVar.m0().m(mVar.a, mVar.b);
                    } else if (ievVar instanceof iev.n) {
                        rhv rhvVarN0 = ydvVar.n0();
                        androidx.fragment.app.e eVarRequireActivity = ydvVar.requireActivity();
                        eVarRequireActivity.getClass();
                        ej5.c(o8i0.d(rhvVarN0), null, null, new chv(rhvVarN0, eVarRequireActivity, null), 3);
                    } else if (ievVar instanceof iev.j) {
                        ifv ifvVarM1 = ydvVar.m0();
                        FragmentManager childFragmentManager = ydvVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        ifvVarM1.k(childFragmentManager, ((iev.j) ievVar).a);
                    } else if (ievVar instanceof iev.g) {
                        ydvVar.m0().y(((iev.g) ievVar).a);
                    } else if (ievVar instanceof iev.v) {
                        mgb0 mgb0Var = ydvVar.A;
                        if (mgb0Var == null) {
                            Intrinsics.n("sportyAccountManager");
                            throw null;
                        }
                        if (mgb0Var.isLogin()) {
                            ydvVar.m0().j();
                        } else {
                            rhv rhvVarN1 = ydvVar.n0();
                            androidx.fragment.app.e eVarRequireActivity2 = ydvVar.requireActivity();
                            eVarRequireActivity2.getClass();
                            ej5.c(o8i0.d(rhvVarN1), null, null, new chv(rhvVarN1, eVarRequireActivity2, null), 3);
                        }
                    } else {
                        if (!(ievVar instanceof iev.t)) {
                            uhc.a();
                            return null;
                        }
                        ydvVar.m0().p();
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(t340 t340Var, v1b v1bVar, ydv ydvVar) {
                super(2, v1bVar);
                this.c = t340Var;
                this.d = ydvVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.c, v1bVar, this.d);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to ydv$d$a for r5v3 'this'  v1b
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // defpackage.pz1
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = r5.b
                    v5b r0 = (defpackage.v5b) r0
                    y5b r1 = defpackage.y5b.a
                    int r2 = r5.a
                    r3 = 0
                    r4 = 1
                    if (r2 == 0) goto L18
                    if (r2 != r4) goto L12
                    defpackage.uj50.b(r6)
                    goto L31
                L12:
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r5)
                    return r3
                L18:
                    defpackage.uj50.b(r6)
                    ydv$d$a$a r6 = new ydv$d$a$a
                    ydv r2 = r5.d
                    r6.<init>(r0, r2)
                    r5.b = r3
                    r5.a = r4
                    t340 r0 = r5.c
                    a390<T> r0 = r0.a
                    java.lang.Object r5 = r0.collect(r6, r5)
                    if (r5 != r1) goto L31
                    return r1
                L31:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ydv.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ibs ibsVar, t340 t340Var, v1b v1bVar, ydv ydvVar) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = ibsVar;
            this.c = t340Var;
            this.d = ydvVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new d(this.b, this.c, v1bVar, this.d);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s9s lifecycle = this.b.getLifecycle();
                s9s.b bVar = s9s.b.d;
                a aVar = new a(this.c, null, this.d);
                this.a = 1;
                if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.profile.me.presentation.MeFragment$onViewCreated$$inlined$collectWithLifecycle$default$3", f = "MeFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ibs b;
        public final /* synthetic */ t340 c;
        public final /* synthetic */ ydv d;
        public final /* synthetic */ View e;

        @c0d(c = "com.sportybet.feature.profile.me.presentation.MeFragment$onViewCreated$$inlined$collectWithLifecycle$default$3$1", f = "MeFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ t340 c;
            public final /* synthetic */ ydv d;
            public final /* synthetic */ View e;

            /* JADX INFO: renamed from: ydv$e$a$a, reason: collision with other inner class name */
            public static final class C1339a<T> implements myh {
                public final /* synthetic */ v5b a;
                public final /* synthetic */ ydv b;
                public final /* synthetic */ View c;

                public C1339a(v5b v5bVar, ydv ydvVar, View view) {
                    this.b = ydvVar;
                    this.c = view;
                    this.a = v5bVar;
                }

                @Override // defpackage.myh
                public final Object emit(T t, v1b<? super Unit> v1bVar) {
                    com.sporty.android.common.uievent.a aVar = (com.sporty.android.common.uievent.a) t;
                    ydv ydvVar = this.b;
                    com.sporty.android.common.uievent.e eVar = ydvVar.v;
                    if (eVar != null) {
                        eVar.d(aVar, ydvVar, this.c, null);
                        return Unit.a;
                    }
                    Intrinsics.n("commonProcessor");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(t340 t340Var, v1b v1bVar, ydv ydvVar, View view) {
                super(2, v1bVar);
                this.c = t340Var;
                this.d = ydvVar;
                this.e = view;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.c, v1bVar, this.d, this.e);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to ydv$e$a for r6v3 'this'  v1b
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // defpackage.pz1
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = r6.b
                    v5b r0 = (defpackage.v5b) r0
                    y5b r1 = defpackage.y5b.a
                    int r2 = r6.a
                    r3 = 0
                    r4 = 1
                    if (r2 == 0) goto L18
                    if (r2 != r4) goto L12
                    defpackage.uj50.b(r7)
                    goto L33
                L12:
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r6)
                    return r3
                L18:
                    defpackage.uj50.b(r7)
                    ydv$e$a$a r7 = new ydv$e$a$a
                    ydv r2 = r6.d
                    android.view.View r5 = r6.e
                    r7.<init>(r0, r2, r5)
                    r6.b = r3
                    r6.a = r4
                    t340 r0 = r6.c
                    a390<T> r0 = r0.a
                    java.lang.Object r6 = r0.collect(r7, r6)
                    if (r6 != r1) goto L33
                    return r1
                L33:
                    kotlin.Unit r6 = kotlin.Unit.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: ydv.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ibs ibsVar, t340 t340Var, v1b v1bVar, ydv ydvVar, View view) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = ibsVar;
            this.c = t340Var;
            this.d = ydvVar;
            this.e = view;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new e(this.b, this.c, v1bVar, this.d, this.e);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s9s lifecycle = this.b.getLifecycle();
                s9s.b bVar = s9s.b.d;
                a aVar = new a(this.c, null, this.d, this.e);
                this.a = 1;
                if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.profile.me.presentation.MeFragment$onViewCreated$$inlined$collectWithLifecycle$default$4", f = "MeFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ibs b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ ydv d;

        @c0d(c = "com.sportybet.feature.profile.me.presentation.MeFragment$onViewCreated$$inlined$collectWithLifecycle$default$4$1", f = "MeFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ lyh c;
            public final /* synthetic */ ydv d;

            /* JADX INFO: renamed from: ydv$f$a$a, reason: collision with other inner class name */
            public static final class C1340a<T> implements myh {
                public final /* synthetic */ v5b a;
                public final /* synthetic */ ydv b;

                public C1340a(v5b v5bVar, ydv ydvVar) {
                    this.b = ydvVar;
                    this.a = v5bVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.myh
                public final Object emit(T t, v1b<? super Unit> v1bVar) {
                    DobGift dobGift = (DobGift) t;
                    ydv ydvVar = this.b;
                    wue wueVar = ydvVar.z;
                    if (wueVar == null) {
                        Intrinsics.n("dobGiftNavigator");
                        throw null;
                    }
                    Context contextRequireContext = ydvVar.requireContext();
                    contextRequireContext.getClass();
                    wueVar.d(contextRequireContext, dobGift);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(lyh lyhVar, v1b v1bVar, ydv ydvVar) {
                super(2, v1bVar);
                this.c = lyhVar;
                this.d = ydvVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.c, v1bVar, this.d);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    C1340a c1340a = new C1340a(v5bVar, this.d);
                    this.b = null;
                    this.a = 1;
                    if (this.c.collect(c1340a, this) == y5bVar) {
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
        public f(ibs ibsVar, lyh lyhVar, v1b v1bVar, ydv ydvVar) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = ibsVar;
            this.c = lyhVar;
            this.d = ydvVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new f(this.b, this.c, v1bVar, this.d);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s9s lifecycle = this.b.getLifecycle();
                s9s.b bVar = s9s.b.d;
                a aVar = new a(this.c, null, this.d);
                this.a = 1;
                if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
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

    public static final class g extends qlr implements Function0<Fragment> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return ydv.this;
        }
    }

    public static final class h extends qlr implements Function0<w8i0> {
        public final /* synthetic */ g a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.a = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class i extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class j extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class k extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? ydv.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ydv() {
        ttr ttrVarA = hwr.a(a1s.c, new h(new g()));
        this.B = new q8i0(jq40.a(rhv.class), new i(ttrVarA), new k(ttrVarA), new j(ttrVarA));
    }

    public final ifv m0() {
        ifv ifvVar = this.i;
        if (ifvVar != null) {
            return ifvVar;
        }
        Intrinsics.n("navigator");
        throw null;
    }

    public final rhv n0() {
        return (rhv) this.B.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        return mla.a(contextRequireContext, new op8(-1373878695, new Function2() { // from class: wdv
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final ydv ydvVar = this.a;
                    o0z.a(null, null, null, null, null, pp8.b(-133615606, new Function2() { // from class: xdv
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                ffv.a(ydvVar.n0(), aVar2, 8);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        rhv rhvVarN0 = n0();
        ej5.c(o8i0.d(rhvVarN0), rhvVarN0.a, null, new mhv(rhvVarN0, null), 2);
        mrm mrmVar = this.w;
        if (mrmVar == null) {
            Intrinsics.n("betSlipManager");
            throw null;
        }
        mrmVar.a(requireActivity(), false);
        rhv rhvVarN1 = n0();
        ej5.c(o8i0.d(rhvVarN1), null, null, new lhv(rhvVarN1, null), 3);
        rhv rhvVarN2 = n0();
        ej5.c(o8i0.d(rhvVarN2), null, null, new nhv(rhvVarN2, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        v340 v340VarB = n0().y.b();
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new c(viewLifecycleOwner, v340VarB, null, this), 3);
        t340 t340VarA = e1i.a(n0().M);
        ibs viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        ej5.c(ebs.a(viewLifecycleOwner2.getLifecycle()), null, null, new d(viewLifecycleOwner2, t340VarA, null, this), 3);
        t340 t340VarA2 = e1i.a(n0().G);
        ibs viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        ej5.c(ebs.a(viewLifecycleOwner3.getLifecycle()), null, null, new e(viewLifecycleOwner3, t340VarA2, null, this, view), 3);
        uwd0<Boolean> uwd0VarA = n0().b.a.a();
        ibs viewLifecycleOwner4 = getViewLifecycleOwner();
        viewLifecycleOwner4.getClass();
        s9s.b bVar2 = s9s.b.a;
        ej5.c(ebs.a(viewLifecycleOwner4.getLifecycle()), null, null, new a(viewLifecycleOwner4, uwd0VarA, null, this), 3);
        v340 v340Var = n0().L;
        ibs viewLifecycleOwner5 = getViewLifecycleOwner();
        viewLifecycleOwner5.getClass();
        ej5.c(ebs.a(viewLifecycleOwner5.getLifecycle()), null, null, new b(viewLifecycleOwner5, v340Var, null, this), 3);
        t340 t340Var = n0().R;
        ibs viewLifecycleOwner6 = getViewLifecycleOwner();
        viewLifecycleOwner6.getClass();
        ej5.c(ebs.a(viewLifecycleOwner6.getLifecycle()), null, null, new f(viewLifecycleOwner6, t340Var, null, this), 3);
        rhv rhvVarN0 = n0();
        ej5.c(o8i0.d(rhvVarN0), null, null, new pgv(rhvVarN0, null), 3);
    }
}
