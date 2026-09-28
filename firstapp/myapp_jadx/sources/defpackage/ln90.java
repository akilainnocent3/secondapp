package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.simulation.NetworkSimulationBetHistory;
import com.sportybet.android.instantwin.newtork.model.response.simulation.NetworkSimulationConfigData;
import com.sportybet.android.instantwin.newtork.model.response.simulation.NetworkSimulationSettleRound;
import com.sportybet.android.instantwin.newtork.model.response.simulation.NetworkSimulationTicketResult;
import com.sportybet.android.instantwin.newtork.model.response.simulation.detail.NetworkSimulationTicket;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTracking;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBetSource;
import com.twilio.voice.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class ln90 {
    public final bl90 a;

    public ln90(bl90 bl90Var) {
        this.a = bl90Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, InstantWinBetSource instantWinBetSource, x1b x1bVar) {
        gn90 gn90Var;
        if (x1bVar instanceof gn90) {
            gn90Var = (gn90) x1bVar;
            int i = gn90Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gn90Var.c = i - Integer.MIN_VALUE;
            } else {
                gn90Var = new gn90(this, x1bVar);
            }
        } else {
            gn90Var = new gn90(this, x1bVar);
        }
        Object objB = gn90Var.a;
        y5b y5bVar = y5b.a;
        int i2 = gn90Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objB);
                zi50.a aVar = zi50.b;
                bl90 bl90Var = this.a;
                InstantWinApiTracking.PlaceBet placeBet = new InstantWinApiTracking.PlaceBet(instantWinBetSource, new Integer(114));
                gn90Var.c = 1;
                objB = bl90Var.b(Constants.APP_JSON_PAYLOAD_TYPE, str, placeBet, gn90Var);
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
            NetworkSimulationSettleRound networkSimulationSettleRound = (NetworkSimulationSettleRound) objB;
            networkSimulationSettleRound.getClass();
            String roundId = networkSimulationSettleRound.getRoundId();
            if (roundId == null) {
                roundId = "";
            }
            mn90 mn90Var = new mn90(roundId, networkSimulationSettleRound.getBizCode());
            zi50.a aVar2 = zi50.b;
            return mn90Var;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(int i, x1b x1bVar) {
        hn90 hn90Var;
        if (x1bVar instanceof hn90) {
            hn90Var = (hn90) x1bVar;
            int i2 = hn90Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hn90Var.c = i2 - Integer.MIN_VALUE;
            } else {
                hn90Var = new hn90(this, x1bVar);
            }
        } else {
            hn90Var = new hn90(this, x1bVar);
        }
        Object objA = hn90Var.a;
        y5b y5bVar = y5b.a;
        int i3 = hn90Var.c;
        try {
            if (i3 == 0) {
                uj50.b(objA);
                zi50.a aVar = zi50.b;
                bl90 bl90Var = this.a;
                hn90Var.c = 1;
                objA = bl90Var.a(i, cl90.a, hn90Var);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objA);
            }
            fl90 fl90VarC = w250.c((NetworkSimulationBetHistory) objA);
            zi50.a aVar2 = zi50.b;
            return fl90VarC;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(x1b x1bVar) {
        in90 in90Var;
        if (x1bVar instanceof in90) {
            in90Var = (in90) x1bVar;
            int i = in90Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                in90Var.c = i - Integer.MIN_VALUE;
            } else {
                in90Var = new in90(this, x1bVar);
            }
        } else {
            in90Var = new in90(this, x1bVar);
        }
        Object objD = in90Var.a;
        y5b y5bVar = y5b.a;
        int i2 = in90Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objD);
                zi50.a aVar = zi50.b;
                bl90 bl90Var = this.a;
                in90Var.c = 1;
                objD = bl90Var.d(Constants.APP_JSON_PAYLOAD_TYPE, cl90.a, in90Var);
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
            tm90 tm90VarA = fej.a((NetworkSimulationConfigData) objD);
            zi50.a aVar2 = zi50.b;
            return tm90VarA;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, x1b x1bVar) {
        jn90 jn90Var;
        if (x1bVar instanceof jn90) {
            jn90Var = (jn90) x1bVar;
            int i = jn90Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jn90Var.c = i - Integer.MIN_VALUE;
            } else {
                jn90Var = new jn90(this, x1bVar);
            }
        } else {
            jn90Var = new jn90(this, x1bVar);
        }
        Object objE = jn90Var.a;
        y5b y5bVar = y5b.a;
        int i2 = jn90Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objE);
                zi50.a aVar = zi50.b;
                bl90 bl90Var = this.a;
                jn90Var.c = 1;
                objE = bl90Var.e(str, cl90.a, jn90Var);
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
            rq90 rq90VarB = kr.b((NetworkSimulationTicket) objE);
            zi50.a aVar2 = zi50.b;
            return rq90VarB;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable e(String str, x1b x1bVar) {
        kn90 kn90Var;
        if (x1bVar instanceof kn90) {
            kn90Var = (kn90) x1bVar;
            int i = kn90Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kn90Var.c = i - Integer.MIN_VALUE;
            } else {
                kn90Var = new kn90(this, x1bVar);
            }
        } else {
            kn90Var = new kn90(this, x1bVar);
        }
        Object objC = kn90Var.a;
        y5b y5bVar = y5b.a;
        int i2 = kn90Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objC);
                zi50.a aVar = zi50.b;
                bl90 bl90Var = this.a;
                kn90Var.c = 1;
                objC = bl90Var.c(str, cl90.a, kn90Var);
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
            Iterable iterable = (Iterable) objC;
            ArrayList arrayList = new ArrayList(l48.r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(mr.b((NetworkSimulationTicketResult) it.next()));
            }
            zi50.a aVar2 = zi50.b;
            return arrayList;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }
}
