package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.instantwin.newtork.model.PageData;
import com.sportybet.android.instantwin.newtork.model.request.TicketParameter;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballActiveEvents;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballConfig;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballEventResult;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballEventResultEnvelop;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballHeadToHeadStats;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballLeagueStats;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballLeagueStatsEnvelop;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballMatchdayResult;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballOpenBets;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballOpenBetsCountInfo;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballTicket;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTracking;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBetSource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class mg70 {
    public final zz60 a;
    public final uqm b;
    public final ylo c;
    public final k5b d;

    public mg70(zz60 zz60Var, uqm uqmVar, ylo yloVar, k5b k5bVar) {
        this.a = zz60Var;
        this.b = uqmVar;
        this.c = yloVar;
        this.d = k5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(TicketParameter ticketParameter, InstantWinBetSource instantWinBetSource, x1b x1bVar) {
        pf70 pf70Var;
        if (x1bVar instanceof pf70) {
            pf70Var = (pf70) x1bVar;
            int i = pf70Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pf70Var.c = i - Integer.MIN_VALUE;
            } else {
                pf70Var = new pf70(this, x1bVar);
            }
        } else {
            pf70Var = new pf70(this, x1bVar);
        }
        Object objA = pf70Var.a;
        y5b y5bVar = y5b.a;
        int i2 = pf70Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objA);
                zi50.a aVar = zi50.b;
                zz60 zz60Var = this.a;
                InstantWinApiTracking.PlaceBet placeBet = new InstantWinApiTracking.PlaceBet(instantWinBetSource, new Integer(171));
                pf70Var.c = 1;
                objA = zz60Var.a(ticketParameter, placeBet, pf70Var);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objA);
            }
            n52.b((BaseResponse) objA);
            Unit unit = Unit.a;
            zi50.a aVar2 = zi50.b;
            return unit;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, x1b x1bVar) {
        qf70 qf70Var;
        if (x1bVar instanceof qf70) {
            qf70Var = (qf70) x1bVar;
            int i = qf70Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qf70Var.c = i - Integer.MIN_VALUE;
            } else {
                qf70Var = new qf70(this, x1bVar);
            }
        } else {
            qf70Var = new qf70(this, x1bVar);
        }
        Object objH = qf70Var.a;
        y5b y5bVar = y5b.a;
        int i2 = qf70Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objH);
                zi50.a aVar = zi50.b;
                zz60 zz60Var = this.a;
                qf70Var.c = 1;
                objH = zz60Var.h(str, a070.a, qf70Var);
                if (objH == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objH);
            }
            uz60 uz60VarA = vz60.a((NetworkScheduledFootballActiveEvents) n52.b((BaseResponse) objH));
            zi50.a aVar2 = zi50.b;
            return uz60VarA;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, x1b x1bVar) {
        rf70 rf70Var;
        if (x1bVar instanceof rf70) {
            rf70Var = (rf70) x1bVar;
            int i = rf70Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rf70Var.c = i - Integer.MIN_VALUE;
            } else {
                rf70Var = new rf70(this, x1bVar);
            }
        } else {
            rf70Var = new rf70(this, x1bVar);
        }
        Object objE = rf70Var.a;
        y5b y5bVar = y5b.a;
        int i2 = rf70Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objE);
                zi50.a aVar = zi50.b;
                zz60 zz60Var = this.a;
                rf70Var.c = 1;
                objE = zz60Var.e(str, a070.a, rf70Var);
                if (objE == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objE);
            }
            x270 x270VarA = y270.a((NetworkScheduledFootballConfig) n52.b((BaseResponse) objE));
            zi50.a aVar2 = zi50.b;
            return x270VarA;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v3, types: [m2g] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    public final Serializable d(int i, int i2, x1b x1bVar, String str, String str2) {
        sf70 sf70Var;
        if (x1bVar instanceof sf70) {
            sf70Var = (sf70) x1bVar;
            int i3 = sf70Var.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sf70Var.c = i3 - Integer.MIN_VALUE;
            } else {
                sf70Var = new sf70(this, x1bVar);
            }
        } else {
            sf70Var = new sf70(this, x1bVar);
        }
        sf70 sf70Var2 = sf70Var;
        Object objG = sf70Var2.a;
        y5b y5bVar = y5b.a;
        int i4 = sf70Var2.c;
        ?? arrayList = 0;
        try {
            if (i4 == 0) {
                uj50.b(objG);
                zi50.a aVar = zi50.b;
                zz60 zz60Var = this.a;
                sf70Var2.c = 1;
                objG = zz60Var.g(str, str2, i, i2, a070.a, sf70Var2);
                if (objG == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i4 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objG);
            }
            NetworkScheduledFootballEventResultEnvelop networkScheduledFootballEventResultEnvelop = (NetworkScheduledFootballEventResultEnvelop) n52.b((BaseResponse) objG);
            long kickoffTime = networkScheduledFootballEventResultEnvelop.getKickoffTime();
            List<NetworkScheduledFootballEventResult> results = networkScheduledFootballEventResultEnvelop.getResults();
            if (results != null) {
                arrayList = new ArrayList(l48.r(results, 10));
                Iterator it = results.iterator();
                while (it.hasNext()) {
                    arrayList.add(p470.a((NetworkScheduledFootballEventResult) it.next(), kickoffTime));
                }
            }
            if (arrayList == 0) {
                arrayList = m2g.a;
            }
            zi50.a aVar2 = zi50.b;
            return arrayList;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, String str2, x1b x1bVar) {
        tf70 tf70Var;
        if (x1bVar instanceof tf70) {
            tf70Var = (tf70) x1bVar;
            int i = tf70Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tf70Var.c = i - Integer.MIN_VALUE;
            } else {
                tf70Var = new tf70(this, x1bVar);
            }
        } else {
            tf70Var = new tf70(this, x1bVar);
        }
        Object objF = tf70Var.a;
        y5b y5bVar = y5b.a;
        int i2 = tf70Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objF);
                zi50.a aVar = zi50.b;
                zz60 zz60Var = this.a;
                tf70Var.c = 1;
                objF = zz60Var.f(str, str2, a070.a, tf70Var);
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
            a670 a670VarA = q670.a((NetworkScheduledFootballHeadToHeadStats) n52.b((BaseResponse) objF));
            zi50.a aVar2 = zi50.b;
            return a670VarA;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [m2g] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public final Serializable f(String str, String str2, x1b x1bVar) {
        uf70 uf70Var;
        if (x1bVar instanceof uf70) {
            uf70Var = (uf70) x1bVar;
            int i = uf70Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uf70Var.c = i - Integer.MIN_VALUE;
            } else {
                uf70Var = new uf70(this, x1bVar);
            }
        } else {
            uf70Var = new uf70(this, x1bVar);
        }
        Object objC = uf70Var.a;
        y5b y5bVar = y5b.a;
        int i2 = uf70Var.c;
        ?? arrayList = 0;
        try {
            if (i2 == 0) {
                uj50.b(objC);
                zi50.a aVar = zi50.b;
                zz60 zz60Var = this.a;
                uf70Var.c = 1;
                objC = zz60Var.c(str, str2, a070.a, uf70Var);
                if (objC == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objC);
            }
            List<NetworkScheduledFootballLeagueStats> leagues = ((NetworkScheduledFootballLeagueStatsEnvelop) n52.b((BaseResponse) objC)).getLeagues();
            if (leagues != null) {
                arrayList = new ArrayList(l48.r(leagues, 10));
                Iterator it = leagues.iterator();
                while (it.hasNext()) {
                    arrayList.add(s770.a((NetworkScheduledFootballLeagueStats) it.next()));
                }
            }
            if (arrayList == 0) {
                arrayList = m2g.a;
            }
            zi50.a aVar2 = zi50.b;
            return arrayList;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable g(String str, String str2, x1b x1bVar) {
        vf70 vf70Var;
        if (x1bVar instanceof vf70) {
            vf70Var = (vf70) x1bVar;
            int i = vf70Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vf70Var.c = i - Integer.MIN_VALUE;
            } else {
                vf70Var = new vf70(this, x1bVar);
            }
        } else {
            vf70Var = new vf70(this, x1bVar);
        }
        Object objD = vf70Var.a;
        y5b y5bVar = y5b.a;
        int i2 = vf70Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objD);
                zi50.a aVar = zi50.b;
                zz60 zz60Var = this.a;
                vf70Var.c = 1;
                objD = zz60Var.d(str, str2, a070.a, vf70Var);
                if (objD == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objD);
            }
            Iterable iterable = (Iterable) n52.b((BaseResponse) objD);
            ArrayList arrayList = new ArrayList(l48.r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(j970.a((NetworkScheduledFootballMatchdayResult) it.next()));
            }
            zi50.a aVar2 = zi50.b;
            return arrayList;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, x1b x1bVar) {
        wf70 wf70Var;
        if (x1bVar instanceof wf70) {
            wf70Var = (wf70) x1bVar;
            int i = wf70Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wf70Var.c = i - Integer.MIN_VALUE;
            } else {
                wf70Var = new wf70(this, x1bVar);
            }
        } else {
            wf70Var = new wf70(this, x1bVar);
        }
        Object objB = wf70Var.a;
        y5b y5bVar = y5b.a;
        int i2 = wf70Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objB);
                zi50.a aVar = zi50.b;
                zz60 zz60Var = this.a;
                wf70Var.c = 1;
                objB = zz60Var.b(str, a070.a, wf70Var);
                if (objB == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objB);
            }
            ga70 ga70VarB = xpk.b((NetworkScheduledFootballOpenBets) n52.b((BaseResponse) objB));
            zi50.a aVar2 = zi50.b;
            return ga70VarB;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, x1b x1bVar) {
        xf70 xf70Var;
        if (x1bVar instanceof xf70) {
            xf70Var = (xf70) x1bVar;
            int i = xf70Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xf70Var.c = i - Integer.MIN_VALUE;
            } else {
                xf70Var = new xf70(this, x1bVar);
            }
        } else {
            xf70Var = new xf70(this, x1bVar);
        }
        Object objJ = xf70Var.a;
        y5b y5bVar = y5b.a;
        int i2 = xf70Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objJ);
                zi50.a aVar = zi50.b;
                zz60 zz60Var = this.a;
                xf70Var.c = 1;
                objJ = zz60Var.j(str, a070.a, xf70Var);
                if (objJ == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objJ);
            }
            NetworkScheduledFootballOpenBetsCountInfo networkScheduledFootballOpenBetsCountInfo = (NetworkScheduledFootballOpenBetsCountInfo) n52.b((BaseResponse) objJ);
            networkScheduledFootballOpenBetsCountInfo.getClass();
            nb70 nb70Var = new nb70(networkScheduledFootballOpenBetsCountInfo.getCount(), networkScheduledFootballOpenBetsCountInfo.getTimestamp());
            zi50.a aVar2 = zi50.b;
            return nb70Var;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(String str, x1b x1bVar) {
        yf70 yf70Var;
        if (x1bVar instanceof yf70) {
            yf70Var = (yf70) x1bVar;
            int i = yf70Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yf70Var.c = i - Integer.MIN_VALUE;
            } else {
                yf70Var = new yf70(this, x1bVar);
            }
        } else {
            yf70Var = new yf70(this, x1bVar);
        }
        Object objK = yf70Var.a;
        y5b y5bVar = y5b.a;
        int i2 = yf70Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objK);
                zi50.a aVar = zi50.b;
                zz60 zz60Var = this.a;
                yf70Var.c = 1;
                objK = zz60Var.k(str, a070.a, yf70Var);
                if (objK == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objK);
            }
            fk70 fk70VarA = uk70.a((NetworkScheduledFootballTicket) n52.b((BaseResponse) objK));
            zi50.a aVar2 = zi50.b;
            return fk70VarA;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object k(String str, int i, String str2, boolean z, long j, long j2, String str3, x1b x1bVar) {
        zf70 zf70Var;
        if (x1bVar instanceof zf70) {
            zf70Var = (zf70) x1bVar;
            int i2 = zf70Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zf70Var.c = i2 - Integer.MIN_VALUE;
            } else {
                zf70Var = new zf70(this, x1bVar);
            }
        } else {
            zf70Var = new zf70(this, x1bVar);
        }
        zf70 zf70Var2 = zf70Var;
        Object objI = zf70Var2.a;
        y5b y5bVar = y5b.a;
        int i3 = zf70Var2.c;
        try {
            if (i3 == 0) {
                uj50.b(objI);
                zi50.a aVar = zi50.b;
                zz60 zz60Var = this.a;
                zf70Var2.c = 1;
                objI = zz60Var.i(str, i, str2, z, j, j2, str3, a070.a, zf70Var2);
                if (objI == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objI);
            }
            PageData pageData = (PageData) n52.b((BaseResponse) objI);
            PageData pageData2 = new PageData();
            pageData2.lastId = pageData.lastId;
            pageData2.pageSize = pageData.pageSize;
            Collection<NetworkScheduledFootballTicket> collection = pageData.data;
            collection.getClass();
            ArrayList arrayList = new ArrayList(l48.r(collection, 10));
            for (NetworkScheduledFootballTicket networkScheduledFootballTicket : collection) {
                networkScheduledFootballTicket.getClass();
                arrayList.add(uk70.a(networkScheduledFootballTicket));
            }
            pageData2.data = arrayList;
            zi50.a aVar2 = zi50.b;
            return pageData2;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }
}
