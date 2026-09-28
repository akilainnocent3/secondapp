package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class xod0 implements lzm {
    public final qca0 a;
    public final mzm b;
    public final eal c;
    public final v5b d;
    public final aym e;
    public final mpe0 f;

    public xod0(qca0 qca0Var, mzm mzmVar, eal ealVar, v5b v5bVar, aym aymVar) {
        mzmVar.getClass();
        ealVar.getClass();
        v5bVar.getClass();
        aymVar.getClass();
        this.a = qca0Var;
        this.b = mzmVar;
        this.c = ealVar;
        this.d = v5bVar;
        this.e = aymVar;
        this.f = hwr.b(new ddx(this, 1));
    }

    @Override // defpackage.lzm
    public final void a() {
        this.b.a();
    }

    @Override // defpackage.lzm
    public final Object b(String str, lr7 lr7Var, Map map, op20 op20Var) {
        Unit unitB = this.b.b(map, str, this.c.j(new kr7(lr7Var.b, lr7Var.d, lr7Var.e, lr7Var.a, lr7Var.c)));
        return unitB == y5b.a ? unitB : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lzm
    public final Object c(x1b x1bVar) {
        qod0 qod0Var;
        if (x1bVar instanceof qod0) {
            qod0Var = (qod0) x1bVar;
            int i = qod0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qod0Var.c = i - Integer.MIN_VALUE;
            } else {
                qod0Var = new qod0(this, x1bVar);
            }
        } else {
            qod0Var = new qod0(this, x1bVar);
        }
        Object objF = qod0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = qod0Var.c;
        if (i2 == 0) {
            uj50.b(objF);
            gox goxVar = gox.a;
            rod0 rod0Var = new rod0(this, null);
            qod0Var.c = 1;
            objF = this.e.f(goxVar, rod0Var, qod0Var);
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
        vmd0 vmd0Var = (vmd0) objF;
        if (vmd0Var != null) {
            return Boolean.valueOf(vmd0Var.getIsAvailable());
        }
        return null;
    }

    @Override // defpackage.lzm
    public final Object d(long j, nkj nkjVar) {
        qpd0 qpd0Var = new qpd0(j);
        return this.e.f(gox.f, new nod0(this, qpd0Var, null), nkjVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lzm
    public final Object e(String str, x1b x1bVar) {
        tod0 tod0Var;
        if (x1bVar instanceof tod0) {
            tod0Var = (tod0) x1bVar;
            int i = tod0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tod0Var.c = i - Integer.MIN_VALUE;
            } else {
                tod0Var = new tod0(this, x1bVar);
            }
        } else {
            tod0Var = new tod0(this, x1bVar);
        }
        Object objF = tod0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = tod0Var.c;
        if (i2 == 0) {
            uj50.b(objF);
            zod0 zod0Var = new zod0(str);
            gox goxVar = gox.c;
            uod0 uod0Var = new uod0(this, zod0Var, null);
            tod0Var.c = 1;
            objF = this.e.f(goxVar, uod0Var, tod0Var);
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
        yod0 yod0Var = (yod0) objF;
        if (yod0Var == null) {
            return null;
        }
        long j = yod0Var.getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_ID java.lang.String();
        int rowsCount = yod0Var.getRowsCount();
        int columnsCount = yod0Var.getColumnsCount();
        List<apd0> listC = yod0Var.c();
        ArrayList arrayList = new ArrayList(l48.r(listC, 10));
        for (apd0 apd0Var : listC) {
            int size = apd0Var.getSize();
            String startingPoint = apd0Var.getStartingPoint();
            arrayList.add(new cpd0(size, Intrinsics.g(startingPoint, "LEFT"), apd0Var.getSpeed(), apd0Var.getRowRewardAmount()));
        }
        return new ymd0(j, rowsCount, columnsCount, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lzm
    public final Object f(x1b x1bVar) {
        vod0 vod0Var;
        if (x1bVar instanceof vod0) {
            vod0Var = (vod0) x1bVar;
            int i = vod0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vod0Var.c = i - Integer.MIN_VALUE;
            } else {
                vod0Var = new vod0(this, x1bVar);
            }
        } else {
            vod0Var = new vod0(this, x1bVar);
        }
        Object objF = vod0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = vod0Var.c;
        if (i2 == 0) {
            uj50.b(objF);
            gox goxVar = gox.b;
            wod0 wod0Var = new wod0(this, null);
            vod0Var.c = 1;
            objF = this.e.f(goxVar, wod0Var, vod0Var);
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
        bqd0 bqd0Var = (bqd0) objF;
        if (bqd0Var != null) {
            return new soh0(bqd0Var.getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_ID java.lang.String(), bqd0Var.getCountryCode());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lzm
    public final Object g(long j, x1b x1bVar) {
        lod0 lod0Var;
        if (x1bVar instanceof lod0) {
            lod0Var = (lod0) x1bVar;
            int i = lod0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lod0Var.c = i - Integer.MIN_VALUE;
            } else {
                lod0Var = new lod0(this, x1bVar);
            }
        } else {
            lod0Var = new lod0(this, x1bVar);
        }
        Object objF = lod0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = lod0Var.c;
        if (i2 == 0) {
            uj50.b(objF);
            qpd0 qpd0Var = new qpd0(j);
            gox goxVar = gox.e;
            mod0 mod0Var = new mod0(this, qpd0Var, null);
            lod0Var.c = 1;
            objF = this.e.f(goxVar, mod0Var, lod0Var);
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
        return Boolean.valueOf(objF != null);
    }

    @Override // defpackage.lzm
    public final Object h(String str, Map map, Map map2, phn phnVar) {
        Object objC = this.b.c(str, 15000, 15000, map, map2, phnVar);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.lzm
    public final void i() {
        w5b.c(this.d, null);
    }

    @Override // defpackage.lzm
    public final Object j(String str, Map map, phn phnVar) {
        Unit unitE = this.b.e(str, map);
        return unitE == y5b.a ? unitE : Unit.a;
    }

    @Override // defpackage.lzm
    public final t340 k() {
        return e1i.d(new sod0(this.b.d()), this.d, q490.a.b, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.lzm
    public final Object l(x1b x1bVar) {
        ood0 ood0Var;
        if (x1bVar instanceof ood0) {
            ood0Var = (ood0) x1bVar;
            int i = ood0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ood0Var.c = i - Integer.MIN_VALUE;
            } else {
                ood0Var = new ood0(this, x1bVar);
            }
        } else {
            ood0Var = new ood0(this, x1bVar);
        }
        Object objF = ood0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = ood0Var.c;
        if (i2 == 0) {
            uj50.b(objF);
            gox goxVar = gox.d;
            pod0 pod0Var = new pod0(this, null);
            ood0Var.c = 1;
            objF = this.e.f(goxVar, pod0Var, ood0Var);
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
        wpd0 wpd0Var = (wpd0) objF;
        if (wpd0Var != null) {
            bnd0 gameStatus = wpd0Var.getGameStatus();
            switch (gameStatus == null ? -1 : ppc.a[gameStatus.ordinal()]) {
                case -1:
                    break;
                case 0:
                default:
                    uhc.a();
                    return null;
                case 1:
                    return iqx.a;
                case 2:
                    if (wpd0Var.getCurrentGame() != null) {
                        long sessionId = wpd0Var.getCurrentGame().getSessionId();
                        int rowsCount = wpd0Var.getCurrentGame().getRowsCount();
                        int columnsCount = wpd0Var.getCurrentGame().getColumnsCount();
                        int size = wpd0Var.getCurrentGame().e().size();
                        List<hld0> listE = wpd0Var.getCurrentGame().e();
                        ArrayList arrayList = new ArrayList(l48.r(listE, 10));
                        for (hld0 hld0Var : listE) {
                            arrayList.add(new ild0(hld0Var.getResultLeft(), hld0Var.getResultWidth()));
                        }
                        List<apd0> listB = wpd0Var.getCurrentGame().b();
                        ArrayList arrayList2 = new ArrayList(l48.r(listB, 10));
                        for (apd0 apd0Var : listB) {
                            arrayList2.add(new cpd0(apd0Var.getSize(), Intrinsics.g(apd0Var.getStartingPoint(), "LEFT"), apd0Var.getSpeed(), apd0Var.getRowRewardAmount()));
                        }
                        return new dn50(sessionId, rowsCount, columnsCount, size, arrayList, arrayList2);
                    }
                    break;
                case 3:
                    if (wpd0Var.getCurrentGame() != null) {
                        Double totalReward = wpd0Var.getCurrentGame().getTotalReward();
                        double dDoubleValue = totalReward != null ? totalReward.doubleValue() : 0.0d;
                        long sessionId2 = wpd0Var.getCurrentGame().getSessionId();
                        int rowsCount2 = wpd0Var.getCurrentGame().getRowsCount();
                        int columnsCount2 = wpd0Var.getCurrentGame().getColumnsCount();
                        int size2 = wpd0Var.getCurrentGame().e().size();
                        List<hld0> listE2 = wpd0Var.getCurrentGame().e();
                        ArrayList arrayList3 = new ArrayList(l48.r(listE2, 10));
                        for (hld0 hld0Var2 : listE2) {
                            arrayList3.add(new ild0(hld0Var2.getResultLeft(), hld0Var2.getResultWidth()));
                        }
                        List<apd0> listB2 = wpd0Var.getCurrentGame().b();
                        ArrayList arrayList4 = new ArrayList(l48.r(listB2, 10));
                        for (apd0 apd0Var2 : listB2) {
                            arrayList4.add(new cpd0(apd0Var2.getSize(), Intrinsics.g(apd0Var2.getStartingPoint(), "LEFT"), apd0Var2.getSpeed(), apd0Var2.getRowRewardAmount()));
                        }
                        return new w340(dDoubleValue, sessionId2, rowsCount2, columnsCount2, size2, arrayList3, arrayList4);
                    }
                    break;
                case 4:
                    return a0h.a;
                case 5:
                    return wv.a;
                case 6:
                    return new msf0(wpd0Var.getMaxReward());
            }
        }
        return null;
    }

    public final mld0 m() {
        return (mld0) this.f.getValue();
    }
}
