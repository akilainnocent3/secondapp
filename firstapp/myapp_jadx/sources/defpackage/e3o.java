package defpackage;

import com.sportybet.android.instantwin.newtork.model.PageData;
import com.sportybet.android.instantwin.newtork.model.request.TicketParameter;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingOverallConfig;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingSettleRound;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingSportConfig;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingTicket;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTracking;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBetSource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class e3o {
    public final osn a;
    public final mgb0 b;
    public final k5b c;

    public e3o(osn osnVar, mgb0 mgb0Var, k5b k5bVar) {
        this.a = osnVar;
        this.b = mgb0Var;
        this.c = k5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(TicketParameter ticketParameter, InstantWinBetSource instantWinBetSource, x1b x1bVar) {
        w2o w2oVar;
        if (x1bVar instanceof w2o) {
            w2oVar = (w2o) x1bVar;
            int i = w2oVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w2oVar.c = i - Integer.MIN_VALUE;
            } else {
                w2oVar = new w2o(this, x1bVar);
            }
        } else {
            w2oVar = new w2o(this, x1bVar);
        }
        Object objA = w2oVar.a;
        y5b y5bVar = y5b.a;
        int i2 = w2oVar.c;
        try {
            if (i2 == 0) {
                uj50.b(objA);
                zi50.a aVar = zi50.b;
                osn osnVar = this.a;
                InstantWinApiTracking.PlaceBet placeBet = new InstantWinApiTracking.PlaceBet(instantWinBetSource, new Integer(150));
                w2oVar.c = 1;
                objA = osnVar.a(ticketParameter, placeBet, w2oVar);
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
            u3o u3oVarA = jyd.a((NetworkInstantRacingSettleRound) objA);
            zi50.a aVar2 = zi50.b;
            return u3oVarA;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, boolean z, x1b x1bVar) {
        x2o x2oVar;
        if (x1bVar instanceof x2o) {
            x2oVar = (x2o) x1bVar;
            int i = x2oVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x2oVar.c = i - Integer.MIN_VALUE;
            } else {
                x2oVar = new x2o(this, x1bVar);
            }
        } else {
            x2oVar = new x2o(this, x1bVar);
        }
        Object objD = x2oVar.a;
        y5b y5bVar = y5b.a;
        int i2 = x2oVar.c;
        try {
            if (i2 == 0) {
                uj50.b(objD);
                zi50.a aVar = zi50.b;
                k5b k5bVar = this.c;
                y2o y2oVar = new y2o(this, str, str2, z, null);
                x2oVar.c = 1;
                objD = ej5.d(k5bVar, y2oVar, x2oVar);
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
            dun dunVar = (dun) objD;
            zi50.a aVar2 = zi50.b;
            return dunVar;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(x1b x1bVar) {
        z2o z2oVar;
        if (x1bVar instanceof z2o) {
            z2oVar = (z2o) x1bVar;
            int i = z2oVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z2oVar.c = i - Integer.MIN_VALUE;
            } else {
                z2oVar = new z2o(this, x1bVar);
            }
        } else {
            z2oVar = new z2o(this, x1bVar);
        }
        Object objC = z2oVar.a;
        y5b y5bVar = y5b.a;
        int i2 = z2oVar.c;
        try {
            if (i2 == 0) {
                uj50.b(objC);
                zi50.a aVar = zi50.b;
                osn osnVar = this.a;
                z2oVar.c = 1;
                objC = osnVar.c(psn.a, z2oVar);
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
            nzn nznVar = new nzn(((NetworkInstantRacingOverallConfig) objC).getActive());
            zi50.a aVar2 = zi50.b;
            return nznVar;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, x1b x1bVar) {
        a3o a3oVar;
        if (x1bVar instanceof a3o) {
            a3oVar = (a3o) x1bVar;
            int i = a3oVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a3oVar.c = i - Integer.MIN_VALUE;
            } else {
                a3oVar = new a3o(this, x1bVar);
            }
        } else {
            a3oVar = new a3o(this, x1bVar);
        }
        Object objD = a3oVar.a;
        y5b y5bVar = y5b.a;
        int i2 = a3oVar.c;
        try {
            if (i2 == 0) {
                uj50.b(objD);
                zi50.a aVar = zi50.b;
                osn osnVar = this.a;
                a3oVar.c = 1;
                objD = osnVar.d(str, psn.a, a3oVar);
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
            d4o d4oVarA = e4o.a((NetworkInstantRacingSportConfig) objD);
            zi50.a aVar2 = zi50.b;
            return d4oVarA;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, x1b x1bVar) {
        b3o b3oVar;
        if (x1bVar instanceof b3o) {
            b3oVar = (b3o) x1bVar;
            int i = b3oVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                b3oVar.c = i - Integer.MIN_VALUE;
            } else {
                b3oVar = new b3o(this, x1bVar);
            }
        } else {
            b3oVar = new b3o(this, x1bVar);
        }
        Object objE = b3oVar.a;
        y5b y5bVar = y5b.a;
        int i2 = b3oVar.c;
        try {
            if (i2 == 0) {
                uj50.b(objE);
                zi50.a aVar = zi50.b;
                osn osnVar = this.a;
                b3oVar.c = 1;
                objE = osnVar.e(str, psn.a, b3oVar);
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
            f4o f4oVarA = v4o.a((NetworkInstantRacingTicket) objE);
            zi50.a aVar2 = zi50.b;
            return f4oVarA;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object f(String str, int i, boolean z, long j, long j2, String str2, x1b x1bVar) {
        c3o c3oVar;
        if (x1bVar instanceof c3o) {
            c3oVar = (c3o) x1bVar;
            int i2 = c3oVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3oVar.c = i2 - Integer.MIN_VALUE;
            } else {
                c3oVar = new c3o(this, x1bVar);
            }
        } else {
            c3oVar = new c3o(this, x1bVar);
        }
        c3o c3oVar2 = c3oVar;
        Object objF = c3oVar2.a;
        y5b y5bVar = y5b.a;
        int i3 = c3oVar2.c;
        try {
            if (i3 == 0) {
                uj50.b(objF);
                zi50.a aVar = zi50.b;
                osn osnVar = this.a;
                c3oVar2.c = 1;
                objF = osnVar.f(str, i, z, j, j2, str2, psn.a, c3oVar2);
                if (objF == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objF);
            }
            PageData pageData = (PageData) objF;
            PageData pageData2 = new PageData();
            pageData2.lastId = pageData.lastId;
            pageData2.pageSize = pageData.pageSize;
            Collection<NetworkInstantRacingTicket> collection = pageData.data;
            collection.getClass();
            ArrayList arrayList = new ArrayList(l48.r(collection, 10));
            for (NetworkInstantRacingTicket networkInstantRacingTicket : collection) {
                networkInstantRacingTicket.getClass();
                arrayList.add(v4o.a(networkInstantRacingTicket));
            }
            pageData2.data = arrayList;
            zi50.a aVar2 = zi50.b;
            return pageData2;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, x1b x1bVar) {
        d3o d3oVar;
        if (x1bVar instanceof d3o) {
            d3oVar = (d3o) x1bVar;
            int i = d3oVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d3oVar.c = i - Integer.MIN_VALUE;
            } else {
                d3oVar = new d3o(this, x1bVar);
            }
        } else {
            d3oVar = new d3o(this, x1bVar);
        }
        Object obj = d3oVar.a;
        y5b y5bVar = y5b.a;
        int i2 = d3oVar.c;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                osn osnVar = this.a;
                d3oVar.c = 1;
                if (osnVar.b(str, psn.a, d3oVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            Unit unit = Unit.a;
            zi50.a aVar2 = zi50.b;
            return unit;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }
}
