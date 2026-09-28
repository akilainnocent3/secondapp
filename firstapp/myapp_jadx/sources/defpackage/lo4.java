package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class lo4 implements srm {
    public final fn4 a;
    public final urm b;
    public final eal c;
    public final v5b d;
    public final bym e;
    public final mpe0 f;

    public lo4(fn4 fn4Var, urm urmVar, eal ealVar, v5b v5bVar, bym bymVar) {
        urmVar.getClass();
        ealVar.getClass();
        v5bVar.getClass();
        bymVar.getClass();
        this.a = fn4Var;
        this.b = urmVar;
        this.c = ealVar;
        this.d = v5bVar;
        this.e = bymVar;
        this.f = hwr.b(new Function0() { // from class: ao4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (wh4) this.a.a.invoke();
            }
        });
    }

    @Override // defpackage.srm
    public final void a() {
        this.b.a();
    }

    @Override // defpackage.srm
    public final a390<cp4> d() {
        return this.b.d();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.srm
    public final Object e(String str, x1b x1bVar) {
        ho4 ho4Var;
        if (x1bVar instanceof ho4) {
            ho4Var = (ho4) x1bVar;
            int i = ho4Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ho4Var.c = i - Integer.MIN_VALUE;
            } else {
                ho4Var = new ho4(this, x1bVar);
            }
        } else {
            ho4Var = new ho4(this, x1bVar);
        }
        Object objF = ho4Var.a;
        y5b y5bVar = y5b.a;
        int i2 = ho4Var.c;
        if (i2 == 0) {
            uj50.b(objF);
            po4 po4Var = new po4(str);
            hox hoxVar = hox.c;
            io4 io4Var = new io4(this, po4Var, null);
            ho4Var.c = 1;
            objF = this.e.f(hoxVar, io4Var, ho4Var);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objF);
        }
        oo4 oo4Var = (oo4) objF;
        if (oo4Var != null) {
            return new zo4(oo4Var.getSessionId(), oo4Var.getTimerSeconds());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.srm
    public final Object f(x1b x1bVar) {
        jo4 jo4Var;
        if (x1bVar instanceof jo4) {
            jo4Var = (jo4) x1bVar;
            int i = jo4Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jo4Var.c = i - Integer.MIN_VALUE;
            } else {
                jo4Var = new jo4(this, x1bVar);
            }
        } else {
            jo4Var = new jo4(this, x1bVar);
        }
        Object objF = jo4Var.a;
        y5b y5bVar = y5b.a;
        int i2 = jo4Var.c;
        if (i2 == 0) {
            uj50.b(objF);
            hox hoxVar = hox.a;
            ko4 ko4Var = new ko4(this, null);
            jo4Var.c = 1;
            objF = this.e.f(hoxVar, ko4Var, jo4Var);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objF);
        }
        qp4 qp4Var = (qp4) objF;
        if (qp4Var != null) {
            return new toh0(qp4Var.getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_ID java.lang.String(), qp4Var.getCountryCode(), qp4Var.getIsBlocked());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [m2g] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.ArrayList] */
    @Override // defpackage.srm
    public final Object g(long j, x1b x1bVar) {
        bo4 bo4Var;
        ?? arrayList;
        if (x1bVar instanceof bo4) {
            bo4Var = (bo4) x1bVar;
            int i = bo4Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bo4Var.c = i - Integer.MIN_VALUE;
            } else {
                bo4Var = new bo4(this, x1bVar);
            }
        } else {
            bo4Var = new bo4(this, x1bVar);
        }
        Object objF = bo4Var.a;
        y5b y5bVar = y5b.a;
        int i2 = bo4Var.c;
        if (i2 == 0) {
            uj50.b(objF);
            yo4 yo4Var = new yo4(j);
            hox hoxVar = hox.e;
            co4 co4Var = new co4(this, yo4Var, null);
            bo4Var.c = 1;
            objF = this.e.f(hoxVar, co4Var, bo4Var);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objF);
        }
        ri4 ri4Var = (ri4) objF;
        if (ri4Var == null) {
            return null;
        }
        long sessionId = ri4Var.getSessionId();
        Integer freeBetCount = ri4Var.getFreeBetCount();
        int iIntValue = freeBetCount != null ? freeBetCount.intValue() : 0;
        Double freeBetValue = ri4Var.getFreeBetValue();
        List<hm4> listC = ri4Var.c();
        if (listC != null) {
            arrayList = new ArrayList(l48.r(listC, 10));
            for (hm4 hm4Var : listC) {
                arrayList.add(new gm4(hm4Var.getGiftId(), hm4Var.getGiftValue()));
            }
        } else {
            arrayList = m2g.a;
        }
        return new si4(sessionId, iIntValue, freeBetValue, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.srm
    public final Object h(x1b x1bVar) {
        fo4 fo4Var;
        if (x1bVar instanceof fo4) {
            fo4Var = (fo4) x1bVar;
            int i = fo4Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fo4Var.c = i - Integer.MIN_VALUE;
            } else {
                fo4Var = new fo4(this, x1bVar);
            }
        } else {
            fo4Var = new fo4(this, x1bVar);
        }
        Object objF = fo4Var.a;
        y5b y5bVar = y5b.a;
        int i2 = fo4Var.c;
        if (i2 == 0) {
            uj50.b(objF);
            hox hoxVar = hox.b;
            go4 go4Var = new go4(this, null);
            fo4Var.c = 1;
            objF = this.e.f(hoxVar, go4Var, fo4Var);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objF);
        }
        qhj qhjVar = (qhj) objF;
        if (qhjVar != null) {
            return Boolean.valueOf(qhjVar.getIsAvailable());
        }
        return null;
    }

    @Override // defpackage.srm
    public final void i() {
        a();
        w5b.c(this.d, null);
    }

    @Override // defpackage.srm
    public final Object j(zj4 zj4Var, String str, Map map, gl4 gl4Var) {
        Unit unitB = this.b.b(map, str, this.c.j(new ak4(zj4Var.c.name(), zj4Var.d.name(), zj4Var.b, zj4Var.a)));
        return unitB == y5b.a ? unitB : Unit.a;
    }

    @Override // defpackage.srm
    public final Object k(List list, Map map, lhn lhnVar) {
        Unit unitE = this.b.e(list, map);
        return unitE == y5b.a ? unitE : Unit.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.srm
    public final Object l(x1b x1bVar) {
        do4 do4Var;
        if (x1bVar instanceof do4) {
            do4Var = (do4) x1bVar;
            int i = do4Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                do4Var.c = i - Integer.MIN_VALUE;
            } else {
                do4Var = new do4(this, x1bVar);
            }
        } else {
            do4Var = new do4(this, x1bVar);
        }
        Object objF = do4Var.a;
        y5b y5bVar = y5b.a;
        int i2 = do4Var.c;
        if (i2 == 0) {
            uj50.b(objF);
            hox hoxVar = hox.d;
            eo4 eo4Var = new eo4(this, null);
            do4Var.c = 1;
            objF = this.e.f(hoxVar, eo4Var, do4Var);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objF);
        }
        op4 op4Var = (op4) objF;
        if (op4Var != null) {
            jl4 gameStatus = op4Var.getGameStatus();
            switch (gameStatus == null ? -1 : qpc.a.a[gameStatus.ordinal()]) {
                case -1:
                    break;
                case 0:
                default:
                    uhc.a();
                    return null;
                case 1:
                    return jqx.a;
                case 2:
                    aj4 currentGame = op4Var.getCurrentGame();
                    if (currentGame != null) {
                        return new en50(qpc.a(currentGame));
                    }
                    break;
                case 3:
                    aj4 currentGame2 = op4Var.getCurrentGame();
                    if (currentGame2 != null) {
                        return new x340(qpc.a(currentGame2));
                    }
                    break;
                case 4:
                    return b0h.a;
                case 5:
                    return yv.a;
                case 6:
                    return new osf0(op4Var.getMaxReward());
            }
        }
        return null;
    }

    @Override // defpackage.srm
    public final Object m(ip4 ip4Var, String str, Map map, tje0 tje0Var) {
        Unit unitB = this.b.b(map, str, this.c.j(new hp4(ip4Var.a)));
        return unitB == y5b.a ? unitB : Unit.a;
    }

    @Override // defpackage.srm
    public final Object n(String str, Map map, Map map2, lhn lhnVar) {
        Object objC = this.b.c(str, 10000, 10000, map, map2, lhnVar);
        return objC == y5b.a ? objC : Unit.a;
    }
}
