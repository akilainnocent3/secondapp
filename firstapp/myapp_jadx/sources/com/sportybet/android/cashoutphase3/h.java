package com.sportybet.android.cashoutphase3;

import com.sporty.android.common.network.data.SprDataThrowable;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.cashout.AutoCashOut;
import com.sporty.android.core.model.cashout.CashOutFallbackData;
import com.sporty.android.core.model.cashout.CashOutInfo;
import com.sportybet.model.cashOut.CashOutData;
import com.sportybet.ntespm.socket.ISocketPushManager;
import com.sportybet.ntespm.socket.MultiTopic;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.realsports.data.BoreDrawConfig;
import defpackage.am6;
import defpackage.at2;
import defpackage.b1z;
import defpackage.b390;
import defpackage.bm50;
import defpackage.c0d;
import defpackage.c9p;
import defpackage.cep;
import defpackage.d1z;
import defpackage.d390;
import defpackage.e1i;
import defpackage.e1z;
import defpackage.ej5;
import defpackage.emf;
import defpackage.et7;
import defpackage.f1i;
import defpackage.fqx;
import defpackage.fr6;
import defpackage.g1i;
import defpackage.go6;
import defpackage.hdk;
import defpackage.ho6;
import defpackage.hwr;
import defpackage.i2i;
import defpackage.ib5;
import defpackage.itf0;
import defpackage.j8i0;
import defpackage.jvd0;
import defpackage.k1p;
import defpackage.kn6;
import defpackage.ko6;
import defpackage.kq6;
import defpackage.ku90;
import defpackage.kwd0;
import defpackage.kzh;
import defpackage.lk50;
import defpackage.lq1;
import defpackage.m2g;
import defpackage.mgb0;
import defpackage.mpe0;
import defpackage.mwd0;
import defpackage.n1i;
import defpackage.n1p;
import defpackage.ngs;
import defpackage.o1p;
import defpackage.o8i0;
import defpackage.oo6;
import defpackage.p0z;
import defpackage.pb5;
import defpackage.pl6;
import defpackage.pm6;
import defpackage.pn6;
import defpackage.po6;
import defpackage.psm;
import defpackage.q0z;
import defpackage.q490;
import defpackage.qo6;
import defpackage.qp10;
import defpackage.qs6;
import defpackage.r0i;
import defpackage.r5b;
import defpackage.rs6;
import defpackage.sfy;
import defpackage.sm6;
import defpackage.t340;
import defpackage.tcp;
import defpackage.tje0;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.un6;
import defpackage.uy0;
import defpackage.uzh;
import defpackage.v1b;
import defpackage.v340;
import defpackage.v5b;
import defpackage.vn20;
import defpackage.vn6;
import defpackage.vu90;
import defpackage.wlf;
import defpackage.wm20;
import defpackage.wn6;
import defpackage.wp6;
import defpackage.wwd0;
import defpackage.xn6;
import defpackage.xwd0;
import defpackage.xyy;
import defpackage.y5b;
import defpackage.yi5;
import defpackage.yi6;
import defpackage.yo6;
import defpackage.yzh;
import defpackage.z1d;
import defpackage.z890;
import defpackage.zi50;
import defpackage.zn6;
import defpackage.zyy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/cashoutphase3/h;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class h extends j8i0 {
    public final yo6 A;
    public final LinkedHashMap A0;
    public final kq6 B;
    public jvd0 B0;
    public final sm6 C;
    public final mpe0 C0;
    public final sfy D;
    public final k1p E;
    public final z890 F;
    public final kn6 G;
    public final psm H;
    public final fqx I;
    public final b1z J;
    public final lq1 K;
    public final yi5 L;
    public p0z M;
    public final String N;
    public String O;
    public Boolean P;
    public zyy Q;
    public final wwd0 R;
    public final LinkedHashMap S;
    public final ku90<Unit> T;
    public final r5b U;
    public final ku90<com.sportybet.android.cashoutphase3.a> V;
    public final t340 W;
    public final ku90<qp10> X;
    public final t340 Y;
    public final vu90<lk50<wlf>> Z;
    public final q0z a;
    public final vu90 a0;
    public final emf b;
    public final LinkedHashMap b0;
    public final uy0 c;
    public final LinkedHashMap c0;
    public final at2 d;
    public final ku90<com.sporty.android.common.uievent.a> d0;
    public final hdk e;
    public final b390 e0;
    public final am6 f;
    public final b390 f0;
    public final b390 g0;
    public final b390 h0;
    public final fr6 i;
    public final b390 i0;
    public final v340 j0;
    public final wwd0 k0;
    public final v340 l0;
    public final v340 m0;
    public final b390 n0;
    public final t340 o0;
    public final ConcurrentHashMap<String, c9p> p0;
    public String q0;
    public final v340 r0;
    public final v340 s0;
    public final b390 t0;
    public final t340 u0;
    public final wp6 v;
    public boolean v0;
    public final qs6 w;
    public boolean w0;
    public Long x0;
    public final mgb0 y;
    public final f1i y0;
    public final yi6 z;
    public final v340 z0;

    @c0d(c = "com.sportybet.android.cashoutphase3.CashOutViewModel$createAutoCashOut$1", f = "CashOutViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<lk50<? extends AutoCashOut>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ pl6 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pl6 pl6Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = pl6Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = h.this.new a(this.c, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends AutoCashOut> lk50Var, v1b<? super Unit> v1bVar) {
            return ((a) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = lk50Var instanceof lk50.c;
            pl6 pl6Var = this.c;
            h hVar = h.this;
            if (!z) {
                if (lk50Var instanceof lk50.a) {
                    lk50.a aVar = (lk50.a) lk50Var;
                    UiText uiText = aVar.b;
                    Throwable th = aVar.a;
                    if (th instanceof SprDataThrowable) {
                        int i = ((SprDataThrowable) th).d;
                        if (i != 33001 && i != 33003) {
                            switch (i) {
                                case 33008:
                                    hVar.A1(new com.sportybet.android.cashoutphase3.a.c.C0222a(pl6Var, th));
                                    break;
                                case 33009:
                                case 33010:
                                case 33011:
                                case 33012:
                                    hVar.A1(new com.sportybet.android.cashoutphase3.a.c.g(th, uiText));
                                    break;
                                default:
                                    hVar.A1(new com.sportybet.android.cashoutphase3.a.c.g(th, uiText));
                                    break;
                            }
                        } else {
                            String str = pl6Var.a.id;
                            str.getClass();
                            hVar.A1(new com.sportybet.android.cashoutphase3.a.c.b(str));
                        }
                    }
                }
            } else {
                int i2 = 0;
                vn20.g("open_bets", "show_auto_tab_new_icon", false, false);
                AutoCashOut autoCashOut = (AutoCashOut) ((lk50.c) lk50Var).a;
                wwd0 wwd0Var = hVar.R;
                e eVar = (e) wwd0Var.getValue();
                Iterator<AutoCashOut> it = eVar.a.getAutoCashOuts().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (Intrinsics.g(it.next().betId, autoCashOut.betId)) {
                        break;
                    }
                    i2++;
                }
                ArrayList arrayListC0 = CollectionsKt.C0(eVar.a.getAutoCashOuts());
                if (i2 == -1) {
                    arrayListC0.add(autoCashOut);
                } else {
                    arrayListC0.set(i2, autoCashOut);
                }
                wwd0Var.k(null, e.a(eVar, CashOutData.copy$default(eVar.a, 0, null, arrayListC0, null, false, false, null, 123, null), false, null, false, 14));
                hVar.A1(new com.sportybet.android.cashoutphase3.a.C0221a(pl6Var, autoCashOut));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.cashoutphase3.CashOutViewModel$emitCashoutEventFlow$1", f = "CashOutViewModel.kt", l = {762}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ com.sportybet.android.cashoutphase3.a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.sportybet.android.cashoutphase3.a aVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = aVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return h.this.new b(this.c, v1bVar);
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
                ku90<com.sportybet.android.cashoutphase3.a> ku90Var = h.this.V;
                this.a = 1;
                if (ku90Var.a.emit(this.c, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.cashoutphase3.CashOutViewModel$setupBannedTopic$1", f = "CashOutViewModel.kt", l = {723}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, boolean z2, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.c = z;
            this.d = z2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return h.this.new c(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            h hVar = h.this;
            if (i == 0) {
                uj50.b(obj);
                mgb0 mgb0Var = hVar.y;
                this.a = 1;
                obj = mgb0Var.getUserId(this);
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
            if (((CharSequence) obj).length() == 0) {
                return Unit.a;
            }
            q0z q0zVar = hVar.a;
            q0zVar.b.e(this.c, this.d);
            return Unit.a;
        }
    }

    public h(q0z q0zVar, emf emfVar, uy0 uy0Var, at2 at2Var, hdk hdkVar, am6 am6Var, fr6 fr6Var, wp6 wp6Var, qs6 qs6Var, mgb0 mgb0Var, yi6 yi6Var, yo6 yo6Var, kq6 kq6Var, sm6 sm6Var, sfy sfyVar, k1p k1pVar, o1p o1pVar, z890 z890Var, kn6 kn6Var, psm psmVar, fqx fqxVar, b1z b1zVar, lq1 lq1Var, yi5 yi5Var) {
        uy0Var.getClass();
        at2Var.getClass();
        hdkVar.getClass();
        am6Var.getClass();
        wp6Var.getClass();
        qs6Var.getClass();
        mgb0Var.getClass();
        yi6Var.getClass();
        yo6Var.getClass();
        kq6Var.getClass();
        sm6Var.getClass();
        sfyVar.getClass();
        psmVar.getClass();
        fqxVar.getClass();
        b1zVar.getClass();
        lq1Var.getClass();
        yi5Var.getClass();
        this.a = q0zVar;
        this.b = emfVar;
        this.c = uy0Var;
        this.d = at2Var;
        this.e = hdkVar;
        this.f = am6Var;
        this.i = fr6Var;
        this.v = wp6Var;
        this.w = qs6Var;
        this.y = mgb0Var;
        this.z = yi6Var;
        this.A = yo6Var;
        this.B = kq6Var;
        this.C = sm6Var;
        this.D = sfyVar;
        this.E = k1pVar;
        this.F = z890Var;
        this.G = kn6Var;
        this.H = psmVar;
        this.I = fqxVar;
        this.J = b1zVar;
        this.K = lq1Var;
        this.L = yi5Var;
        this.M = p0z.a;
        this.N = "";
        this.O = "";
        this.Q = zyy.a;
        wwd0 wwd0VarA = xwd0.a(e.b.a());
        this.R = wwd0VarA;
        this.S = new LinkedHashMap();
        ku90<Unit> ku90Var = new ku90<>();
        this.T = ku90Var;
        this.U = i2i.c(ku90Var, null, 3);
        ku90<com.sportybet.android.cashoutphase3.a> ku90Var2 = new ku90<>();
        this.V = ku90Var2;
        this.W = e1i.a(ku90Var2);
        ku90<qp10> ku90Var3 = new ku90<>();
        this.X = ku90Var3;
        this.Y = e1i.a(ku90Var3);
        vu90<lk50<wlf>> vu90Var = new vu90<>();
        this.Z = vu90Var;
        this.a0 = vu90Var;
        this.b0 = new LinkedHashMap();
        this.c0 = new LinkedHashMap();
        this.d0 = new ku90<>();
        pb5 pb5Var = pb5.b;
        b390 b390VarB = d390.b(0, 100, pb5Var, 1);
        this.e0 = b390VarB;
        b390 b390VarB2 = d390.b(0, 100, pb5Var, 1);
        this.f0 = b390VarB2;
        this.g0 = b390VarB2;
        b390 b390VarB3 = d390.b(0, 100, pb5Var, 1);
        this.h0 = b390VarB3;
        this.i0 = b390VarB3;
        t340 t340VarA = e1i.a(b390VarB);
        z1d z1dVar = o1pVar.a;
        wm20 wm20VarA = z1dVar.c.a(z1dVar, z1d.f[1]);
        Boolean bool = Boolean.FALSE;
        n1p n1pVar = new n1p(wm20VarA.d(bool));
        et7 et7VarD = o8i0.d(this);
        kwd0 kwd0Var = q490.a.a;
        this.j0 = e1i.e(n1pVar, et7VarD, kwd0Var, bool);
        wwd0 wwd0VarA2 = xwd0.a(bool);
        this.k0 = wwd0VarA2;
        this.l0 = e1i.b(wwd0VarA2);
        this.m0 = e1i.e(new yzh(fqxVar.needShow("need_show_cashout_import_sim_tooltip"), new xn6(3, null)), o8i0.d(this), kwd0Var, null);
        b390 b390VarB4 = d390.b(0, 100, pb5Var, 1);
        this.n0 = b390VarB4;
        this.o0 = e1i.a(b390VarB4);
        this.p0 = new ConcurrentHashMap<>();
        this.q0 = "";
        this.r0 = e1i.e(new oo6(bm50.f(kq6Var.b())), o8i0.d(this), kwd0Var, new CashOutFallbackData(null, null, null, null, null, null, null, null, null, null, 1023, null));
        this.s0 = e1i.e(new po6(mgb0Var.getAccountHolderFlow()), o8i0.d(this), kwd0Var, "");
        b390 b390VarB5 = d390.b(0, 100, pb5Var, 1);
        this.t0 = b390VarB5;
        this.u0 = e1i.a(b390VarB5);
        this.x0 = sm6Var.c.getLastDisconnectedTimestamp();
        sm6 sm6Var2 = q0zVar.b;
        f1i f1iVar = new f1i(sm6Var2.p);
        this.y0 = f1iVar;
        v340 v340Var = sm6Var2.r;
        this.z0 = e1i.e(new n1i(wwd0VarA, yo6Var.g(), new ko6(3, null)), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), new xyy(e.b.a(), new BoreDrawConfig(null, 1, null)));
        kzh.d(new g1i(t340VarA, new un6(this, null)), o8i0.d(this));
        kzh.d(new g1i(r0i.e(sm6Var2.i, sm6Var2.g, sm6Var2.k, sm6Var2.m, sm6Var2.o), new zn6(this, null)), o8i0.d(this));
        kzh.d(new g1i(uzh.b(new go6(b390VarB5.b())), new ho6(this, null)), o8i0.d(this));
        kzh.d(new g1i(f1iVar, new vn6(this, null)), o8i0.d(this));
        kzh.d(new g1i(v340Var, new f(this, null)), o8i0.d(this));
        kzh.d(new g1i(b390VarB2, new wn6(this, null)), o8i0.d(this));
        this.A0 = new LinkedHashMap();
        this.C0 = hwr.b(new pn6(this, 0));
    }

    public final void A1(com.sportybet.android.cashoutphase3.a aVar) {
        ej5.c(o8i0.d(this), null, null, new b(aVar, null), 3);
    }

    public final void B1(zyy zyyVar) {
        this.Q = zyyVar;
        e1z e1zVarA = d1z.a(this.M);
        if (e1zVarA == null) {
            return;
        }
        int iOrdinal = zyyVar.ordinal();
        kq6 kq6Var = this.B;
        if (iOrdinal == 0) {
            String str = this.O;
            if (str.length() <= 0) {
                str = null;
            }
            kq6Var.a(e1zVarA, str);
            kq6Var.d();
            return;
        }
        if (iOrdinal == 1) {
            kq6Var.f();
            return;
        }
        if (iOrdinal == 2) {
            kq6Var.d();
        } else if (iOrdinal == 3) {
            kq6Var.c();
        } else {
            uhc.a();
        }
    }

    public final void C1(String str) {
        this.f0.a(CashOutInfo.Companion.createUnavailable$default(CashOutInfo.INSTANCE, str, null, false, false, null, null, null, false, null, null, null, 2046, null));
        I1(str);
    }

    public final void D1(String str) {
        Object next;
        Object bVar;
        String str2 = (String) this.s0.a.getValue();
        qs6 qs6Var = this.w;
        wp6 wp6Var = qs6Var.a;
        LinkedHashMap linkedHashMap = qs6Var.b;
        str2.getClass();
        if (str == null) {
            return;
        }
        qs6.a aVar = (qs6.a) linkedHashMap.get(str);
        if (aVar == null) {
            aVar = new qs6.a(0);
        }
        linkedHashMap.put(str, qs6.a.a(aVar, null, true, null, 5));
        Iterator<T> it = ((e) this.R.getValue()).a.getCashAbleBets().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.g(((Bet) next).id, str));
        Bet bet = (Bet) next;
        qs6.a aVar2 = (qs6.a) linkedHashMap.get(str);
        CashOutInfo cashOutInfo = aVar2 != null ? aVar2.c : null;
        if (cashOutInfo == null) {
            if (bet == null) {
                return;
            }
            String str3 = bet.notCashableCode;
            if (str3 == null || StringsKt.U(str3)) {
                str3 = null;
            }
            if (str3 == null) {
                return;
            }
            String str4 = bet.id;
            str4.getClass();
            qs6.a aVar3 = (qs6.a) linkedHashMap.get(str4);
            if (aVar3 == null) {
                aVar3 = new qs6.a(0);
            }
            linkedHashMap.put(str4, qs6.a.a(aVar3, str3, false, null, 6));
            ngs ngsVarB = kotlin.collections.a.b();
            ngsVarB.add(new cep("userId"));
            ngsVarB.add(new cep(str2));
            ngsVarB.add(new cep("unavailableClick"));
            ngsVarB.add(new cep("1"));
            if (!bet.isCashable && !rs6.a.contains(str3)) {
                ngsVarB.add(new cep("isCashableFalse"));
                ngsVarB.add(new cep("1"));
            }
            String string = kotlin.collections.a.a(ngsVarB).toString();
            String str5 = bet.id;
            str5.getClass();
            wp6Var.b(str5, str3, string, true);
            return;
        }
        try {
            zi50.a aVar4 = zi50.b;
            String metrics = cashOutInfo.getMetrics();
            if (metrics != null) {
                qs6.a aVar5 = (qs6.a) linkedHashMap.get(str);
                if (aVar5 == null) {
                    aVar5 = new qs6.a(0);
                }
                linkedHashMap.put(str, qs6.a.a(aVar5, metrics, false, null, 6));
                List<tcp> metricsInfo = cashOutInfo.getMetricsInfo();
                if (metricsInfo == null) {
                    metricsInfo = m2g.a;
                }
                ngs ngsVarB2 = kotlin.collections.a.b();
                ngsVarB2.addAll(metricsInfo);
                if (bet != null && !bet.isCashable && !rs6.a.contains(metrics)) {
                    ngsVarB2.add(new cep("isCashableFalse"));
                    ngsVarB2.add(new cep("1"));
                }
                ngsVarB2.add(new cep("unavailableClick"));
                ngsVarB2.add(new cep("1"));
                wp6Var.b(str, metrics, kotlin.collections.a.a(ngsVarB2).toString(), true);
            }
            bVar = Unit.a;
        } catch (Throwable th) {
            zi50.a aVar6 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar7 = itf0.a;
            aVar7.q(MyLog.TAG_CASHOUT_CALC);
            aVar7.c(thA, "[onUnavailableClicked] fail.", new Object[0]);
        }
    }

    public final void E1(CashOutInfo cashOutInfo) {
        Object bVar;
        String strValueOf;
        qs6 qs6Var = this.w;
        qs6Var.getClass();
        try {
            zi50.a aVar = zi50.b;
            String betId = cashOutInfo.getBetId();
            if (betId == null) {
                betId = "";
            }
            if (betId.length() > 0) {
                LinkedHashMap linkedHashMap = qs6Var.b;
                qs6.a aVar2 = (qs6.a) linkedHashMap.get(betId);
                if (aVar2 == null) {
                    aVar2 = new qs6.a(0);
                }
                linkedHashMap.put(betId, qs6.a.a(aVar2, null, false, cashOutInfo, 3));
            }
            String metrics = cashOutInfo.getMetrics();
            if (metrics != null) {
                if (cashOutInfo.isCashAble() || betId.length() <= 0) {
                    strValueOf = String.valueOf(cashOutInfo.getMetricsInfo());
                } else {
                    int iA = qs6Var.a(betId, metrics);
                    List<tcp> metricsInfo = cashOutInfo.getMetricsInfo();
                    if (metricsInfo == null) {
                        metricsInfo = m2g.a;
                    }
                    strValueOf = iA == 1 ? CollectionsKt.i0(kotlin.collections.b.k(new cep("unavailableClick"), new cep("1")), metricsInfo).toString() : metricsInfo.toString();
                }
                qs6Var.a.b(betId, metrics, strValueOf, false);
            }
            bVar = Unit.a;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar4 = itf0.a;
            aVar4.q(MyLog.TAG_CASHOUT_CALC);
            aVar4.c(thA, "[recordJsFormulaResult] fail.", new Object[0]);
        }
    }

    public final void F1(boolean z, boolean z2) {
        ej5.c(o8i0.d(this), null, null, new c(z, z2, null), 3);
    }

    public final boolean G1() {
        CashOutData cashOutData = ((e) this.R.getValue()).a;
        return cashOutData.getCashAbleBets().isEmpty() && cashOutData.getTotalNum() == 0 && this.M == p0z.b;
    }

    public final void H1(CashOutInfo cashOutInfo) {
        Long oddsChangeTimeForFallback;
        cashOutInfo.getClass();
        String betId = cashOutInfo.getBetId();
        if (betId == null) {
            return;
        }
        if (!cashOutInfo.isFallbackCashOut() || !cashOutInfo.isCashAble()) {
            I1(betId);
            return;
        }
        LinkedHashMap linkedHashMap = this.A0;
        c9p c9pVar = (c9p) linkedHashMap.get(betId);
        if (c9pVar == null || !c9pVar.isActive()) {
            this.c0.put(betId, cashOutInfo);
            String str = this.q0;
            v340 v340Var = this.r0;
            Integer trfIntervalSeconds = ((CashOutFallbackData) v340Var.a.getValue()).getTrfIntervalSeconds();
            int iIntValue = trfIntervalSeconds != null ? trfIntervalSeconds.intValue() : 30;
            Integer trfGracePeriodSeconds = ((CashOutFallbackData) v340Var.a.getValue()).getTrfGracePeriodSeconds();
            int iIntValue2 = trfGracePeriodSeconds != null ? trfGracePeriodSeconds.intValue() : 0;
            String betId2 = cashOutInfo.getBetId();
            if (betId2 == null || (oddsChangeTimeForFallback = cashOutInfo.getOddsChangeTimeForFallback()) == null) {
                return;
            }
            long jLongValue = oddsChangeTimeForFallback.longValue();
            if (iIntValue > 0) {
                jvd0 jvd0VarC = ej5.c(o8i0.d(this), null, null, new qo6(iIntValue2, jLongValue, this, betId2, 1000 * ((long) iIntValue), str, null), 3);
                if (linkedHashMap.putIfAbsent(betId2, jvd0VarC) != null) {
                    jvd0VarC.cancel((CancellationException) null);
                    return;
                }
                return;
            }
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_CASHOUT_FALLBACK);
            aVar.n("Invalid t1Seconds: " + iIntValue + " for betId: " + betId2, new Object[0]);
        }
    }

    public final void I1(String str) {
        c9p c9pVar = (c9p) this.A0.remove(str);
        if (c9pVar != null) {
            c9pVar.cancel((CancellationException) null);
        }
        this.c0.remove(str);
    }

    public final void J1(boolean z, boolean z2) {
        sm6 sm6Var = this.a.b;
        pm6 pm6Var = sm6Var.A;
        MultiTopic multiTopic = sm6Var.y;
        if (multiTopic != null) {
            ISocketPushManager iSocketPushManager = sm6Var.c;
            if (z) {
                iSocketPushManager.subscribeTopic(multiTopic, pm6Var);
                return;
            }
            iSocketPushManager.unsubscribeTopic(multiTopic, pm6Var);
            if (z2) {
                sm6Var.y = null;
            }
        }
    }

    public final void K1() throws Throwable {
        sm6 sm6Var = this.a.b;
        sm6Var.d(false);
        ConcurrentHashMap.KeySetView keySetView = sm6Var.d;
        keySetView.clear();
        sm6Var.a();
        sm6Var.e.clear();
        keySetView.clear();
    }

    public final void L1(String str, boolean z) {
        str.getClass();
        if (((e) this.R.getValue()).a.getTotalNum() > 10 || z) {
            B1(zyy.c);
        } else {
            this.B.remove(str);
        }
    }

    public final void x1() {
        LinkedHashMap linkedHashMap = this.A0;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((c9p) it.next()).cancel((CancellationException) null);
        }
        linkedHashMap.clear();
    }

    public final void y1(pl6 pl6Var, int i, boolean z) {
        String string = pl6Var.a.cashOut.getAutoCashoutUsedStake(i).toString();
        string.getClass();
        String string2 = pl6Var.a.cashOut.getAutoCashOutAmount(i).toString();
        string2.getClass();
        String string3 = pl6Var.a.cashOut.getAutoCashOutMaxAmount().toString();
        string3.getClass();
        String str = pl6Var.a.id;
        str.getClass();
        kzh.d(new g1i(this.f.b(str, string, string2, string3, z), new a(pl6Var, null)), o8i0.d(this));
    }

    public final void z1(Bet bet, String str) {
        bet.getClass();
        this.q0 = str == null ? "" : str;
        boolean zG = Intrinsics.g(bet.id, str);
        b390 b390Var = this.e0;
        if (zG) {
            b390Var.a(bet);
        } else {
            this.b0.put(bet.id, bet);
            b390Var.a(bet);
        }
    }
}
