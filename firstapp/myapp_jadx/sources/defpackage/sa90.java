package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.plugin.realsports.data.local.BetSlipDataStore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsa90;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class sa90 extends j8i0 {
    public final b390 A;
    public final wwd0 B;
    public final r5b C;
    public final wwd0 D;
    public final wwd0 E;
    public final odd a;
    public final mgb0 b;
    public final lq1 c;
    public final mtv d;
    public final BetSlipDataStore e;
    public final p53 f;
    public final n53 i;
    public final m93 v;
    public final wwd0 w;
    public final wwd0 y;
    public final wwd0 z;

    @c0d(c = "com.sportybet.plugin.realsports.mission.ShowMissionViewModel$showMissionTrigger$1", f = "ShowMissionViewModel.kt", l = {219}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ i53 b;
        public final /* synthetic */ sa90 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i53 i53Var, sa90 sa90Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = i53Var;
            this.c = sa90Var;
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
                i53 i53Var = this.b;
                boolean z = i53Var.d;
                sa90 sa90Var = this.c;
                if (z) {
                    b390 b390Var = sa90Var.A;
                    this.a = 1;
                    if (b390Var.emit(i53Var, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    wwd0 wwd0Var = sa90Var.y;
                    vwv.b bVar = new vwv.b(i53Var.a);
                    wwd0Var.getClass();
                    wwd0Var.k(null, bVar);
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

    @c0d(c = "com.sportybet.plugin.realsports.mission.ShowMissionViewModel$startMission$1", f = "ShowMissionViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;
        public final /* synthetic */ sa90 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, sa90 sa90Var) {
            super(2, v1bVar);
            this.b = sa90Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(v1bVar, this.b);
            bVar.a = ((Boolean) obj).booleanValue();
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((b) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (z) {
                sa90 sa90Var = this.b;
                ej5.c(o8i0.d(sa90Var), sa90Var.a, null, new ma90(null, sa90Var), 2);
            }
            return Unit.a;
        }
    }

    public sa90(@Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, mgb0 mgb0Var, lq1 lq1Var, mtv mtvVar, BetSlipDataStore betSlipDataStore, p53 p53Var, n53 n53Var, m93 m93Var) {
        mgb0Var.getClass();
        lq1Var.getClass();
        mtvVar.getClass();
        betSlipDataStore.getClass();
        this.a = oddVar;
        this.b = mgb0Var;
        this.c = lq1Var;
        this.d = mtvVar;
        this.e = betSlipDataStore;
        this.f = p53Var;
        this.i = n53Var;
        this.v = m93Var;
        wwd0 wwd0VarA = xwd0.a(nsv.b.a);
        this.w = wwd0VarA;
        vwv.a aVar = vwv.a.a;
        this.y = xwd0.a(aVar);
        this.z = xwd0.a(aVar);
        b390 b390VarB = d390.b(0, 0, null, 6);
        this.A = b390VarB;
        wwd0 wwd0VarA2 = xwd0.a(krv.a.a);
        this.B = wwd0VarA2;
        this.C = i2i.c(wwd0VarA2, null, 3);
        this.D = xwd0.a(ltv.b.a);
        wwd0 wwd0VarA3 = xwd0.a(null);
        this.E = wwd0VarA3;
        kzh.d(ozh.c(new g1i(r0i.f(szh.a(new n1i(wwd0VarA, b390VarB, new ha90(3, null)), 300L), new ta90(null, this)), new ia90(null, this)), oddVar), o8i0.d(this));
        kzh.d(ozh.c(r0i.f(szh.a(new n1i(wwd0VarA, wwd0VarA3, new ja90(3, null)), 300L), new ua90(null, this)), oddVar), o8i0.d(this));
    }

    public static String x1(ftv ftvVar) {
        ftvVar.getClass();
        boolean zB = ftvVar.b();
        boolean zC = ftvVar.c();
        boolean zD = ftvVar.d();
        boolean zA = ftvVar.a();
        StringBuilder sb = new StringBuilder();
        if (zB) {
            sb.append("minstake");
        }
        if (zC) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append("one_up");
        }
        if (zD) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append("two_up");
        }
        if (zA) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append("earlygoals");
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A1(x1b x1bVar) {
        va90 va90Var;
        ltv.a aVar;
        if (x1bVar instanceof va90) {
            va90Var = (va90) x1bVar;
            int i = va90Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                va90Var.d = i - Integer.MIN_VALUE;
            } else {
                va90Var = new va90(this, x1bVar);
            }
        } else {
            va90Var = new va90(this, x1bVar);
        }
        Object obj = va90Var.b;
        y5b y5bVar = y5b.a;
        int i2 = va90Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            Object value = this.D.getValue();
            ltv.a aVar2 = value instanceof ltv.a ? (ltv.a) value : null;
            if (aVar2 != null) {
                wm20<Long> betSlipMissionReportCount = this.e.getBetSlipMissionReportCount();
                Long l = new Long(0L);
                va90Var.a = aVar2;
                va90Var.d = 1;
                Object objE = betSlipMissionReportCount.e(va90Var, l);
                if (objE == y5bVar) {
                    return y5bVar;
                }
                ltv.a aVar3 = aVar2;
                obj = objE;
                aVar = aVar3;
            }
            return null;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        aVar = va90Var.a;
        uj50.b(obj);
        boolean z = ((Number) obj).longValue() >= 1;
        Integer num = aVar.a;
        if (z) {
            return num;
        }
        return null;
    }

    public final void y1(i53 i53Var) {
        ej5.c(o8i0.d(this), null, null, new a(i53Var, this, null), 3);
    }

    public final void z1() {
        kzh.d(ozh.c(new g1i(new or60(new na90(null, this)), new b(null, this)), this.a), o8i0.d(this));
    }
}
