package defpackage;

import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportybet.feature.worldcup.config.domain.model.WorldCupTournamentConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.worldcuptournament.presentation.WorldCupPanelViewModel$onLoadConfigAndEvents$1", f = "WorldCupPanelViewModel.kt", l = {153, 156, 157}, m = "invokeSuspend", v = 2)
public final class b1k0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public t0k0 a;
    public int b;
    public final /* synthetic */ t0k0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1k0(t0k0 t0k0Var, v1b<? super b1k0> v1bVar) {
        super(2, v1bVar);
        this.c = t0k0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new b1k0(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((b1k0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0082  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        t0k0 t0k0Var;
        WorldCupTournamentConfig worldCupTournamentConfig;
        t0k0 t0k0Var2;
        v6k0 v6k0Var;
        int iOrdinal;
        WorldCupTournamentConfig worldCupTournamentConfig2;
        t0k0 t0k0Var3 = this.c;
        s6k0 s6k0Var = t0k0Var3.a;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            this.b = 1;
            obj = qq1.k(s6k0Var.a, BOConfigParam.WorldCupTournamentPageConfig, s6k0Var.b.b().a(), this);
            if (obj != y5bVar) {
            }
            return y5bVar;
        }
        if (i == 1) {
            uj50.b(obj);
        } else {
            if (i == 2) {
                t0k0Var = this.a;
                uj50.b(obj);
                worldCupTournamentConfig = (WorldCupTournamentConfig) obj;
                if (worldCupTournamentConfig == null) {
                    return Unit.a;
                }
                t0k0Var.D = worldCupTournamentConfig;
                this.a = t0k0Var3;
                this.b = 3;
                obj = s6k0Var.c(this);
                if (obj != y5bVar) {
                    t0k0Var2 = t0k0Var3;
                }
                return y5bVar;
            }
            if (i != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t0k0Var2 = this.a;
            uj50.b(obj);
        }
        t0k0Var2.E = a4h.f((Iterable) obj);
        if (t0k0Var3.F == l0k0.TEAM) {
            worldCupTournamentConfig2 = t0k0Var3.D;
            if (worldCupTournamentConfig2 != null) {
                Intrinsics.n("config");
                throw null;
            }
            if (Intrinsics.g(worldCupTournamentConfig2.isTeamTabDefault(), Boolean.FALSE) || t0k0Var3.A1() == null) {
                t0k0Var3.F = l0k0.LIVE;
            }
        }
        if (!(t0k0Var3.N.getValue() instanceof n0k0.d)) {
            t0k0Var3.J1();
        }
        v6k0Var = t0k0Var3.z;
        if (!v6k0Var.b) {
            v6k0Var.a.a(new wbg0(0), k00.d);
            v6k0Var.b = true;
        }
        t0k0Var3.G = null;
        t0k0Var3.H = null;
        iOrdinal = t0k0Var3.F.ordinal();
        if (iOrdinal != 2) {
            t0k0Var3.F1();
        } else if (iOrdinal != 4) {
            t0k0Var3.D1(true);
        } else {
            t0k0Var3.E1();
        }
        t0k0Var3.v.m1((iu2.b) t0k0Var3.B.getValue());
        if (t0k0Var3.M == null) {
            t0k0Var3.M = kzh.d(new g1i(new x0k0(fc4.a(t0k0Var3.e.a(), 1), t0k0Var3), new y0k0(t0k0Var3, null)), o8i0.d(t0k0Var3));
        }
        return Unit.a;
        if (!((Boolean) obj).booleanValue()) {
            return Unit.a;
        }
        this.a = t0k0Var3;
        this.b = 2;
        obj = s6k0Var.a(this);
        if (obj != y5bVar) {
            t0k0Var = t0k0Var3;
            worldCupTournamentConfig = (WorldCupTournamentConfig) obj;
            if (worldCupTournamentConfig == null) {
                return Unit.a;
            }
            t0k0Var.D = worldCupTournamentConfig;
            this.a = t0k0Var3;
            this.b = 3;
            obj = s6k0Var.c(this);
            if (obj != y5bVar) {
                t0k0Var2 = t0k0Var3;
                t0k0Var2.E = a4h.f((Iterable) obj);
                if (t0k0Var3.F == l0k0.TEAM) {
                    worldCupTournamentConfig2 = t0k0Var3.D;
                    if (worldCupTournamentConfig2 != null) {
                        Intrinsics.n("config");
                        throw null;
                    }
                    if (Intrinsics.g(worldCupTournamentConfig2.isTeamTabDefault(), Boolean.FALSE)) {
                        t0k0Var3.F = l0k0.LIVE;
                    } else {
                        t0k0Var3.F = l0k0.LIVE;
                    }
                }
                if (!(t0k0Var3.N.getValue() instanceof n0k0.d)) {
                    t0k0Var3.J1();
                }
                v6k0Var = t0k0Var3.z;
                if (!v6k0Var.b) {
                    v6k0Var.a.a(new wbg0(0), k00.d);
                    v6k0Var.b = true;
                }
                t0k0Var3.G = null;
                t0k0Var3.H = null;
                iOrdinal = t0k0Var3.F.ordinal();
                if (iOrdinal != 2) {
                    t0k0Var3.F1();
                } else if (iOrdinal != 4) {
                    t0k0Var3.D1(true);
                } else {
                    t0k0Var3.E1();
                }
                t0k0Var3.v.m1((iu2.b) t0k0Var3.B.getValue());
                if (t0k0Var3.M == null) {
                    t0k0Var3.M = kzh.d(new g1i(new x0k0(fc4.a(t0k0Var3.e.a(), 1), t0k0Var3), new y0k0(t0k0Var3, null)), o8i0.d(t0k0Var3));
                }
                return Unit.a;
            }
        }
        return y5bVar;
    }
}
