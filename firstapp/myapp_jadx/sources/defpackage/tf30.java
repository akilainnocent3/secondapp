package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import com.sporty.android.core.model.OrderBetType;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.realsports.MaxCombinationRejectConfig;
import com.sporty.android.core.model.realsports.liabilitycheck.QuickLiabilityCheckRequestDto;
import com.sporty.android.core.model.realsports.liabilitycheck.QuickLiabilityCheckResponseDto;
import com.sportybet.ntespm.socket.ISocketPushManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Ltf30;", "Lihb0;", "", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tf30 extends ihb0 {
    public final m990 A;
    public final m2l B;
    public final mgb0 C;
    public final h940 D;
    public final psm E;
    public final pjh0 F;
    public final qh30 G;
    public final iym H;
    public final odd I;
    public final pfd J;
    public final j800 K;
    public final ISocketPushManager L;
    public final y8j M;
    public final sfy N;
    public final xm90 O;
    public final k6f P;
    public final ku90<com.sporty.android.common.uievent.a> Q;
    public final r5b R;
    public final ku90<Unit> S;
    public final r5b T;
    public final vu90<UIState<List<String>>> U;
    public final vu90 V;
    public final vu90<t7z> W;
    public final vu90 X;
    public final r5b Y;
    public final wwd0 Z;
    public long a0;
    public boolean b0;
    public Long c0;
    public final it90 d;
    public String d0;
    public final uy0 e;
    public jvd0 e0;
    public final ot3 f;
    public final ex4 i;
    public final wh30 v;
    public final e8h w;
    public final jrm y;
    public final h53 z;

    public static final class a implements lyh<uh30> {
        public final /* synthetic */ o0i a;

        /* JADX INFO: renamed from: tf30$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.plugin.realsports.viewmodel.QuickBetViewModel$quickLiabilityCheck$$inlined$mapNotNull$1", f = "QuickBetViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C1130a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1130a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: tf30$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.plugin.realsports.viewmodel.QuickBetViewModel$quickLiabilityCheck$$inlined$mapNotNull$1$2", f = "QuickBetViewModel.kt", l = {56}, m = "emit", v = 2)
            public static final class C1131a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1131a(v1b v1bVar) {
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
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C1131a c1131a;
                if (v1bVar instanceof C1131a) {
                    c1131a = (C1131a) v1bVar;
                    int i = c1131a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1131a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1131a = new C1131a(v1bVar);
                    }
                } else {
                    c1131a = new C1131a(v1bVar);
                }
                Object obj2 = c1131a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1131a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Pair pair = (Pair) obj;
                    th30 th30Var = (th30) pair.a;
                    lk50 lk50Var = (lk50) pair.b;
                    uh30 uh30VarA = lk50Var instanceof lk50.c ? sh30.a((QuickLiabilityCheckResponseDto) ((lk50.c) lk50Var).a, th30Var.b) : null;
                    if (uh30VarA != null) {
                        c1131a.b = 1;
                        if (this.a.emit(uh30VarA, c1131a) == y5bVar) {
                            return y5bVar;
                        }
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

        public a(o0i o0iVar) {
            this.a = o0iVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super uh30> myhVar, v1b v1bVar) {
            C1130a c1130a;
            if (v1bVar instanceof C1130a) {
                c1130a = (C1130a) v1bVar;
                int i = c1130a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1130a.b = i - Integer.MIN_VALUE;
                } else {
                    c1130a = new C1130a(v1bVar);
                }
            } else {
                c1130a = new C1130a(v1bVar);
            }
            Object obj = c1130a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1130a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c1130a.b = 1;
                if (this.a.collect(bVar, c1130a) == y5bVar) {
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

    @c0d(c = "com.sportybet.plugin.realsports.viewmodel.QuickBetViewModel$quickLiabilityCheck$1", f = "QuickBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<MaxCombinationRejectConfig, v1b<? super lyh<? extends th30>>, Object> {
        public /* synthetic */ Object a;

        public b(v1b v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = tf30.this.new b(v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MaxCombinationRejectConfig maxCombinationRejectConfig, v1b<? super lyh<? extends th30>> v1bVar) {
            return ((b) create(maxCombinationRejectConfig, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            MaxCombinationRejectConfig maxCombinationRejectConfig = (MaxCombinationRejectConfig) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            tf30 tf30Var = tf30.this;
            qh30 qh30Var = tf30Var.G;
            OrderBetType orderBetTypeFromValue = OrderBetType.INSTANCE.fromValue(1);
            if (orderBetTypeFromValue == null) {
                orderBetTypeFromValue = OrderBetType.ALL;
            }
            return ozh.c(new gzh(qh30Var.b(orderBetTypeFromValue, maxCombinationRejectConfig)), tf30Var.J);
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.viewmodel.QuickBetViewModel$quickLiabilityCheck$2", f = "QuickBetViewModel.kt", l = {499}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<th30, v1b<? super lyh<? extends Pair<? extends th30, ? extends lk50<? extends QuickLiabilityCheckResponseDto>>>>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public static final class a implements lyh<Pair<? extends th30, ? extends lk50<? extends QuickLiabilityCheckResponseDto>>> {
            public final /* synthetic */ lyh a;
            public final /* synthetic */ th30 b;

            /* JADX INFO: renamed from: tf30$c$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.plugin.realsports.viewmodel.QuickBetViewModel$quickLiabilityCheck$2$invokeSuspend$$inlined$map$1", f = "QuickBetViewModel.kt", l = {109}, m = "collect", v = 2)
            public static final class C1132a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1132a(v1b v1bVar) {
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
                public final /* synthetic */ th30 b;

                /* JADX INFO: renamed from: tf30$c$a$b$a, reason: collision with other inner class name */
                @c0d(c = "com.sportybet.plugin.realsports.viewmodel.QuickBetViewModel$quickLiabilityCheck$2$invokeSuspend$$inlined$map$1$2", f = "QuickBetViewModel.kt", l = {50}, m = "emit", v = 2)
                public static final class C1133a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public C1133a(v1b v1bVar) {
                        super(v1bVar);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return b.this.emit(null, this);
                    }
                }

                public b(myh myhVar, th30 th30Var) {
                    this.a = myhVar;
                    this.b = th30Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    C1133a c1133a;
                    if (v1bVar instanceof C1133a) {
                        c1133a = (C1133a) v1bVar;
                        int i = c1133a.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c1133a.b = i - Integer.MIN_VALUE;
                        } else {
                            c1133a = new C1133a(v1bVar);
                        }
                    } else {
                        c1133a = new C1133a(v1bVar);
                    }
                    Object obj2 = c1133a.a;
                    y5b y5bVar = y5b.a;
                    int i2 = c1133a.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        Pair pair = new Pair(this.b, (lk50) obj);
                        c1133a.b = 1;
                        if (this.a.emit(pair, c1133a) == y5bVar) {
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

            public a(lyh lyhVar, th30 th30Var) {
                this.a = lyhVar;
                this.b = th30Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.lyh
            public final Object collect(myh<? super Pair<? extends th30, ? extends lk50<? extends QuickLiabilityCheckResponseDto>>> myhVar, v1b v1bVar) {
                C1132a c1132a;
                if (v1bVar instanceof C1132a) {
                    c1132a = (C1132a) v1bVar;
                    int i = c1132a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1132a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1132a = new C1132a(v1bVar);
                    }
                } else {
                    c1132a = new C1132a(v1bVar);
                }
                Object obj = c1132a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1132a.b;
                if (i2 == 0) {
                    uj50.b(obj);
                    b bVar = new b(myhVar, this.b);
                    c1132a.b = 1;
                    if (this.a.collect(bVar, c1132a) == y5bVar) {
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

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = tf30.this.new c(v1bVar);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(th30 th30Var, v1b<? super lyh<? extends Pair<? extends th30, ? extends lk50<? extends QuickLiabilityCheckResponseDto>>>> v1bVar) {
            return ((c) create(th30Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            th30 th30Var = (th30) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                h940 h940Var = tf30.this.D;
                QuickLiabilityCheckRequestDto quickLiabilityCheckRequestDto = th30Var.a;
                this.b = th30Var;
                this.a = 1;
                obj = h940Var.e(quickLiabilityCheckRequestDto);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return new a((lyh) obj, th30Var);
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.viewmodel.QuickBetViewModel$quickLiabilityCheck$4", f = "QuickBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<uh30, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = tf30.this.new d(v1bVar);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(uh30 uh30Var, v1b<? super Unit> v1bVar) {
            return ((d) create(uh30Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            uh30 uh30Var = (uh30) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            tf30.this.v.c(uh30Var);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf30(it90 it90Var, uy0 uy0Var, ot3 ot3Var, ex4 ex4Var, wh30 wh30Var, e8h e8hVar, jrm jrmVar, h53 h53Var, m990 m990Var, m2l m2lVar, mgb0 mgb0Var, h940 h940Var, psm psmVar, pjh0 pjh0Var, qh30 qh30Var, iym iymVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, @Dispatcher(sportyDispatcher = SportyDispatchers.Default) pfd pfdVar, j800 j800Var, ISocketPushManager iSocketPushManager, y8j y8jVar, sfy sfyVar, xm90 xm90Var, t880 t880Var, k6f k6fVar) {
        super(0);
        uy0Var.getClass();
        ot3Var.getClass();
        ex4Var.getClass();
        wh30Var.getClass();
        e8hVar.getClass();
        jrmVar.getClass();
        h53Var.getClass();
        m2lVar.getClass();
        mgb0Var.getClass();
        h940Var.getClass();
        psmVar.getClass();
        iymVar.getClass();
        iSocketPushManager.getClass();
        y8jVar.getClass();
        sfyVar.getClass();
        t880Var.getClass();
        this.d = it90Var;
        this.e = uy0Var;
        this.f = ot3Var;
        this.i = ex4Var;
        this.v = wh30Var;
        this.w = e8hVar;
        this.y = jrmVar;
        this.z = h53Var;
        this.A = m990Var;
        this.B = m2lVar;
        this.C = mgb0Var;
        this.D = h940Var;
        this.E = psmVar;
        this.F = pjh0Var;
        this.G = qh30Var;
        this.H = iymVar;
        this.I = oddVar;
        this.J = pfdVar;
        this.K = j800Var;
        this.L = iSocketPushManager;
        this.M = y8jVar;
        this.N = sfyVar;
        this.O = xm90Var;
        this.P = k6fVar;
        ku90<com.sporty.android.common.uievent.a> ku90Var = new ku90<>();
        this.Q = ku90Var;
        this.R = i2i.c(ku90Var, null, 3);
        ku90<Unit> ku90Var2 = new ku90<>();
        this.S = ku90Var2;
        this.T = i2i.c(ku90Var2, null, 3);
        vu90<UIState<List<String>>> vu90Var = new vu90<>();
        this.U = vu90Var;
        this.V = vu90Var;
        vu90<t7z> vu90Var2 = new vu90<>();
        this.W = vu90Var2;
        this.X = vu90Var2;
        this.Y = i2i.c(wh30Var.b(), null, 3);
        this.Z = xwd0.a(new v03.q(8388574));
        this.a0 = System.currentTimeMillis();
    }

    public final v03.q A1() {
        return (v03.q) this.Z.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B1(x1b x1bVar) {
        pf30 pf30Var;
        if (x1bVar instanceof pf30) {
            pf30Var = (pf30) x1bVar;
            int i = pf30Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pf30Var.c = i - Integer.MIN_VALUE;
            } else {
                pf30Var = new pf30(this, x1bVar);
            }
        } else {
            pf30Var = new pf30(this, x1bVar);
        }
        Object userId = pf30Var.a;
        y5b y5bVar = y5b.a;
        int i2 = pf30Var.c;
        if (i2 == 0) {
            uj50.b(userId);
            pf30Var.c = 1;
            userId = this.C.getUserId(pf30Var);
            if (userId == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(userId);
        }
        return wga.a(userId, "hide_odds_change_accept_dlg");
    }

    public final void C1(int i) {
        kzh.d(new g1i(new a(r0i.a(r0i.a(this.i.B(), new b(null)), new c(null))), new d(null)), o8i0.d(this));
    }

    public final jvd0 D1(String str, String str2, String str3, String str4, String str5) {
        return ej5.c(o8i0.d(this), null, null, new uf30(this, str, str2, str3, str4, str5, null), 3);
    }

    public final void E1(v03.n nVar) {
        ej5.c(o8i0.d(this), this.I, null, new xf30(this, nVar, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object F1(x1b x1bVar) {
        yf30 yf30Var;
        m2l m2lVar;
        if (x1bVar instanceof yf30) {
            yf30Var = (yf30) x1bVar;
            int i = yf30Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yf30Var.d = i - Integer.MIN_VALUE;
            } else {
                yf30Var = new yf30(this, x1bVar);
            }
        } else {
            yf30Var = new yf30(this, x1bVar);
        }
        Object obj = yf30Var.b;
        Object obj2 = y5b.a;
        int i2 = yf30Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            m2l m2lVar2 = this.B;
            yf30Var.a = m2lVar2;
            yf30Var.d = 1;
            Object objB1 = B1(yf30Var);
            if (objB1 != obj2) {
                obj = objB1;
                m2lVar = m2lVar2;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m2lVar = yf30Var.a;
        uj50.b(obj);
        yf30Var.a = null;
        yf30Var.d = 2;
        Object obj3 = m2lVar.a.getBoolean((String) obj, false, yf30Var);
        return obj3 == obj2 ? obj2 : obj3;
    }

    public final void G1() {
        wwd0 wwd0Var = this.Z;
        v03.q qVarB = this.F.b((v03.q) wwd0Var.getValue());
        wwd0Var.getClass();
        wwd0Var.k(null, qVarB);
    }

    public final void z1(String str, aak aakVar, List list) {
        list.getClass();
        ej5.c(o8i0.d(this), null, null, new nf30(this, aakVar, list, str, null), 3);
    }
}
