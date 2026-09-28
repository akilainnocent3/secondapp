package defpackage;

import com.sporty.android.core.model.account.MyFavoriteStake;
import com.sportybet.plugin.realsports.data.sim.SimShareData;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class drd0 implements nzm {
    public final hrd0 a;
    public final xlf b;
    public final CopyOnWriteArrayList c;
    public volatile String d;
    public final mpe0 e;

    @c0d(c = "com.sportybet.plugin.realsports.betslip.StakeConfigAgentImpl$forceRefresh$1", f = "StakeConfigAgentImpl.kt", l = {135, 136}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: drd0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.plugin.realsports.betslip.StakeConfigAgentImpl$forceRefresh$1$1", f = "StakeConfigAgentImpl.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0502a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public final /* synthetic */ drd0 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0502a(drd0 drd0Var, v1b<? super C0502a> v1bVar) {
                super(2, v1bVar);
                this.a = drd0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0502a(this.a, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0502a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                Iterator it = this.a.c.iterator();
                while (it.hasNext()) {
                    ((nzm.a) it.next()).T();
                }
                return Unit.a;
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return drd0.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (defpackage.ej5.d(r7, r1, r6) == r0) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r6.a
                r2 = 0
                drd0 r3 = defpackage.drd0.this
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L1d
                if (r1 == r5) goto L19
                if (r1 != r4) goto L13
                defpackage.uj50.b(r7)
                goto L43
            L13:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r2
            L19:
                defpackage.uj50.b(r7)
                goto L2f
            L1d:
                defpackage.uj50.b(r7)
                hrd0 r7 = r3.a
                lyh r7 = r7.D(r5)
                r6.a = r5
                java.lang.Object r7 = defpackage.bm50.p(r7, r6)
                if (r7 != r0) goto L2f
                goto L42
            L2f:
                zu7$a r7 = defpackage.zu7.a
                pfd r7 = defpackage.fse.a
                wcl r7 = defpackage.gku.a
                drd0$a$a r1 = new drd0$a$a
                r1.<init>(r3, r2)
                r6.a = r4
                java.lang.Object r6 = defpackage.ej5.d(r7, r1, r6)
                if (r6 != r0) goto L43
            L42:
                return r0
            L43:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: drd0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.betslip.StakeConfigAgentImpl$persistedEditBetStakeOnDisk$2$1", f = "StakeConfigAgentImpl.kt", l = {35}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return drd0.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            xlf xlfVar = drd0.this.b;
            this.a = 1;
            Object objF = xlfVar.a.f(co20.f("edit_bet_stake"), this);
            return objF == y5bVar ? y5bVar : objF;
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.betslip.StakeConfigAgentImpl$refresh$1", f = "StakeConfigAgentImpl.kt", l = {WebSocketProtocol.PAYLOAD_SHORT, 127}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        @c0d(c = "com.sportybet.plugin.realsports.betslip.StakeConfigAgentImpl$refresh$1$1", f = "StakeConfigAgentImpl.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public final /* synthetic */ drd0 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(drd0 drd0Var, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.a = drd0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.a, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                Iterator it = this.a.c.iterator();
                while (it.hasNext()) {
                    ((nzm.a) it.next()).T();
                }
                return Unit.a;
            }
        }

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return drd0.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (defpackage.ej5.d(r7, r1, r6) == r0) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r6.a
                r2 = 0
                drd0 r3 = defpackage.drd0.this
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L1d
                if (r1 == r5) goto L19
                if (r1 != r4) goto L13
                defpackage.uj50.b(r7)
                goto L44
            L13:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r2
            L19:
                defpackage.uj50.b(r7)
                goto L30
            L1d:
                defpackage.uj50.b(r7)
                hrd0 r7 = r3.a
                r1 = 0
                lyh r7 = r7.D(r1)
                r6.a = r5
                java.lang.Object r7 = defpackage.bm50.p(r7, r6)
                if (r7 != r0) goto L30
                goto L43
            L30:
                zu7$a r7 = defpackage.zu7.a
                pfd r7 = defpackage.fse.a
                wcl r7 = defpackage.gku.a
                drd0$c$a r1 = new drd0$c$a
                r1.<init>(r3, r2)
                r6.a = r4
                java.lang.Object r6 = defpackage.ej5.d(r7, r1, r6)
                if (r6 != r0) goto L44
            L43:
                return r0
            L44:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: drd0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.betslip.StakeConfigAgentImpl$setEditBetStake$1", f = "StakeConfigAgentImpl.kt", l = {106}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return drd0.this.new d(this.c, v1bVar);
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
                xlf xlfVar = drd0.this.b;
                this.a = 1;
                if (xlfVar.a.putString("edit_bet_stake", this.c, this) == y5bVar) {
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

    public drd0(hrd0 hrd0Var, xlf xlfVar) {
        hrd0Var.getClass();
        this.a = hrd0Var;
        this.b = xlfVar;
        this.c = new CopyOnWriteArrayList();
        this.e = hwr.b(new h8e(this, 3));
    }

    @Override // defpackage.nzm
    public final BigDecimal a() {
        if (iu2.p()) {
            return SimShareData.INSTANCE.getSimMinStake();
        }
        return iu2.k() ? f() : this.a.y().getMinStake();
    }

    @Override // defpackage.nzm
    public final BigDecimal b() {
        return iu2.p() ? SimShareData.INSTANCE.getSimMaxStake() : this.a.y().getMaxStake();
    }

    @Override // defpackage.nzm
    public final void c() {
        zu7.a aVar = zu7.a;
        odd oddVar = zu7.f;
        ej5.c(zu7.b(oddVar), null, null, new c(null), 3);
    }

    @Override // defpackage.nzm
    public final void d(nzm.a aVar) {
        aVar.getClass();
        this.c.remove(aVar);
    }

    @Override // defpackage.nzm
    public final BigDecimal e() {
        if (!iu2.p()) {
            return this.a.y().getMaxPayout();
        }
        BigDecimal bigDecimalDivide = SimShareData.INSTANCE.getSimMaxPayout().divide(SimulateBetConsts.MAGIC_NUMBER, 2, RoundingMode.HALF_UP);
        bigDecimalDivide.getClass();
        return bigDecimalDivide;
    }

    @Override // defpackage.nzm
    public final BigDecimal f() {
        return new BigDecimal(l());
    }

    @Override // defpackage.nzm
    public final void g() {
        zu7.a aVar = zu7.a;
        odd oddVar = zu7.f;
        ej5.c(zu7.b(oddVar), null, null, new a(null), 3);
    }

    @Override // defpackage.nzm
    public final BigDecimal h() {
        return p();
    }

    @Override // defpackage.nzm
    public final List<BigDecimal> i() {
        return this.a.y().getQuickStakes();
    }

    @Override // defpackage.nzm
    public final String j() {
        BigDecimal bigDecimalP = p();
        DecimalFormat decimalFormat = b6y.a;
        String str = b6y.b.format(bigDecimalP.doubleValue());
        str.getClass();
        return str;
    }

    @Override // defpackage.nzm
    public final BigDecimal k() {
        return this.a.y().getMinCashout();
    }

    @Override // defpackage.nzm
    public final String l() {
        String str = this.d;
        return (str == null && (str = (String) this.e.getValue()) == null) ? j() : str;
    }

    @Override // defpackage.nzm
    public final void m(nzm.a aVar) {
        this.c.add(aVar);
    }

    @Override // defpackage.nzm
    public final void n(String str) {
        if (str == null || str.length() == 0) {
            str = null;
        }
        this.d = str;
        zu7.a aVar = zu7.a;
        ej5.c(zu7.b(zu7.f), null, null, new d(str, null), 3);
    }

    @Override // defpackage.nzm
    public final int o() {
        return iu2.p() ? SimShareData.INSTANCE.getMaxSelection() : this.a.y().getMaxSelectionLimit();
    }

    public final BigDecimal p() {
        MyFavoriteStake stake = izw.a.a().getStake();
        Double defaultStake = stake != null ? stake.getDefaultStake() : null;
        BigDecimal bigDecimalDivide = defaultStake != null ? BigDecimal.valueOf(defaultStake.doubleValue()).divide(BigDecimal.valueOf(10000L)) : BigDecimal.valueOf(-1L);
        if (bigDecimalDivide.compareTo(BigDecimal.ZERO) < 0) {
            bigDecimalDivide = this.a.y().getDefStake();
        }
        bigDecimalDivide.getClass();
        return bigDecimalDivide;
    }

    public final String toString() {
        return "StakeConfigAgentImpl{stakeConfig=" + this.a.y() + "}";
    }
}
