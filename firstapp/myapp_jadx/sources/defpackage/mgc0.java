package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.instantwin.newtork.model.PageData;
import com.sportybet.android.instantwin.newtork.model.request.SportyLegendsPrepareRoundRequest;
import com.sportybet.android.instantwin.newtork.model.request.TicketParameter;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderConfig;
import com.sportybet.android.instantwin.newtork.model.response.Overall;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.Sports;
import com.sportybet.android.instantwin.newtork.model.response.SportsAnimationMode;
import com.sportybet.android.instantwin.newtork.model.response.Ticket;
import com.sportybet.android.instantwin.newtork.model.response.legends.NetworkSportyLegendsPrepareRound;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTracking;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBetSource;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class mgc0 implements ubc0 {
    public static final InstantWinBizTypeTag e = new InstantWinBizTypeTag(152);
    public final s8o a;
    public final dac0 b;
    public final mgb0 c;
    public final ubc0 d;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SportsAnimationMode.values().length];
            try {
                iArr[SportsAnimationMode.BOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SportsAnimationMode.LITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SportsAnimationMode.PLAYER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public mgc0(s8o s8oVar, dac0 dac0Var, mgb0 mgb0Var, ubc0 ubc0Var) {
        this.a = s8oVar;
        this.b = dac0Var;
        this.c = mgb0Var;
        this.d = ubc0Var;
    }

    @Override // defpackage.ubc0
    public final imc0 a() {
        return this.d.a();
    }

    @Override // defpackage.ubc0
    public final void b(imc0 imc0Var) {
        this.d.b(imc0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(TicketParameter ticketParameter, InstantWinBetSource instantWinBetSource, x1b x1bVar) {
        ngc0 ngc0Var;
        if (x1bVar instanceof ngc0) {
            ngc0Var = (ngc0) x1bVar;
            int i = ngc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ngc0Var.c = i - Integer.MIN_VALUE;
            } else {
                ngc0Var = new ngc0(this, x1bVar);
            }
        } else {
            ngc0Var = new ngc0(this, x1bVar);
        }
        Object objA = ngc0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = ngc0Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objA);
                zi50.a aVar = zi50.b;
                dac0 dac0Var = this.b;
                InstantWinApiTracking.PlaceBet placeBet = new InstantWinApiTracking.PlaceBet(instantWinBetSource, new Integer(152));
                ngc0Var.c = 1;
                objA = dac0Var.a(ticketParameter, placeBet, ngc0Var);
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
            Round round = (Round) objA;
            zi50.a aVar2 = zi50.b;
            return round;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable d(x1b x1bVar) {
        ogc0 ogc0Var;
        Object objJ;
        if (x1bVar instanceof ogc0) {
            ogc0Var = (ogc0) x1bVar;
            int i = ogc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ogc0Var.c = i - Integer.MIN_VALUE;
            } else {
                ogc0Var = new ogc0(this, x1bVar);
            }
        } else {
            ogc0Var = new ogc0(this, x1bVar);
        }
        Object obj = ogc0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = ogc0Var.c;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                ogc0Var.c = 1;
                objJ = j(false, ogc0Var);
                if (objJ == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objJ = ((zi50) obj).a;
            }
            uj50.b(objJ);
            ngs ngsVarB = kotlin.collections.a.b();
            SportsAnimationMode sportsAnimationMode = ((imc0) objJ).i;
            int i3 = sportsAnimationMode == null ? -1 : a.a[sportsAnimationMode.ordinal()];
            if (i3 == 1) {
                ngsVarB.add(ikc0.a);
                ngsVarB.add(ikc0.b);
            } else if (i3 == 2) {
                ngsVarB.add(ikc0.a);
            } else if (i3 != 3) {
                Unit unit = Unit.a;
            } else {
                ngsVarB.add(ikc0.b);
            }
            ngs ngsVarA = kotlin.collections.a.a(ngsVarB);
            zi50.a aVar2 = zi50.b;
            return ngsVarA;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(int i, x1b x1bVar, String str) {
        pgc0 pgc0Var;
        if (x1bVar instanceof pgc0) {
            pgc0Var = (pgc0) x1bVar;
            int i2 = pgc0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pgc0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                pgc0Var = new pgc0(this, x1bVar);
            }
        } else {
            pgc0Var = new pgc0(this, x1bVar);
        }
        Object objC = pgc0Var.a;
        y5b y5bVar = y5b.a;
        int i3 = pgc0Var.c;
        try {
            if (i3 == 0) {
                uj50.b(objC);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.a;
                InstantWinBizTypeTag instantWinBizTypeTag = e;
                pgc0Var.c = 1;
                objC = s8oVar.C(str, i, instantWinBizTypeTag, pgc0Var);
                if (objC == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objC);
            }
            BetBuilderConfig betBuilderConfig = (BetBuilderConfig) objC;
            zi50.a aVar2 = zi50.b;
            return betBuilderConfig;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(x1b x1bVar) {
        qgc0 qgc0Var;
        if (x1bVar instanceof qgc0) {
            qgc0Var = (qgc0) x1bVar;
            int i = qgc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qgc0Var.c = i - Integer.MIN_VALUE;
            } else {
                qgc0Var = new qgc0(this, x1bVar);
            }
        } else {
            qgc0Var = new qgc0(this, x1bVar);
        }
        Object objC = qgc0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = qgc0Var.c;
        hcc0 hcc0VarA = null;
        try {
            if (i2 == 0) {
                uj50.b(objC);
                zi50.a aVar = zi50.b;
                if (this.c.isLogin()) {
                    dac0 dac0Var = this.b;
                    qgc0Var.c = 1;
                    objC = dac0Var.c(eac0.a, qgc0Var);
                    if (objC == y5bVar) {
                        return y5bVar;
                    }
                }
                zi50.a aVar2 = zi50.b;
                return hcc0VarA;
            }
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objC);
            NetworkSportyLegendsPrepareRound networkSportyLegendsPrepareRound = (NetworkSportyLegendsPrepareRound) n52.b((BaseResponse) objC);
            if (networkSportyLegendsPrepareRound != null) {
                hcc0VarA = zgc0.a(networkSportyLegendsPrepareRound);
            }
            zi50.a aVar3 = zi50.b;
            return hcc0VarA;
        } catch (Throwable th) {
            zi50.a aVar4 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (r6 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.x1b r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.rgc0
            if (r0 == 0) goto L13
            r0 = r6
            rgc0 r0 = (defpackage.rgc0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            rgc0 r0 = new rgc0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            defpackage.uj50.b(r6)     // Catch: java.lang.Throwable -> L66
            goto L5d
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L31:
            defpackage.uj50.b(r6)     // Catch: java.lang.Throwable -> L66
            goto L4f
        L35:
            defpackage.uj50.b(r6)
            zi50$a r6 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L66
            mgb0 r6 = r5.c     // Catch: java.lang.Throwable -> L66
            boolean r6 = r6.isLogin()     // Catch: java.lang.Throwable -> L66
            dac0 r5 = r5.b
            if (r6 == 0) goto L52
            r0.c = r4     // Catch: java.lang.Throwable -> L66
            com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag r6 = defpackage.eac0.a     // Catch: java.lang.Throwable -> L66
            java.lang.Object r6 = r5.b(r6, r0)     // Catch: java.lang.Throwable -> L66
            if (r6 != r1) goto L4f
            goto L5c
        L4f:
            com.sportybet.android.instantwin.newtork.model.response.legends.NetworkSportyLegendsLeaguesAndTeams r6 = (com.sportybet.android.instantwin.newtork.model.response.legends.NetworkSportyLegendsLeaguesAndTeams) r6     // Catch: java.lang.Throwable -> L66
            goto L5f
        L52:
            r0.c = r3     // Catch: java.lang.Throwable -> L66
            com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag r6 = defpackage.eac0.a     // Catch: java.lang.Throwable -> L66
            java.lang.Object r6 = r5.e(r6, r0)     // Catch: java.lang.Throwable -> L66
            if (r6 != r1) goto L5d
        L5c:
            return r1
        L5d:
            com.sportybet.android.instantwin.newtork.model.response.legends.NetworkSportyLegendsLeaguesAndTeams r6 = (com.sportybet.android.instantwin.newtork.model.response.legends.NetworkSportyLegendsLeaguesAndTeams) r6     // Catch: java.lang.Throwable -> L66
        L5f:
            kdc0 r5 = defpackage.edc0.a(r6)     // Catch: java.lang.Throwable -> L66
            zi50$a r6 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L66
            return r5
        L66:
            r5 = move-exception
            zi50$a r6 = defpackage.zi50.b
            zi50$b r6 = new zi50$b
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgc0.g(x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(x1b x1bVar) {
        sgc0 sgc0Var;
        if (x1bVar instanceof sgc0) {
            sgc0Var = (sgc0) x1bVar;
            int i = sgc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sgc0Var.c = i - Integer.MIN_VALUE;
            } else {
                sgc0Var = new sgc0(this, x1bVar);
            }
        } else {
            sgc0Var = new sgc0(this, x1bVar);
        }
        Object objW = sgc0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = sgc0Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objW);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.a;
                InstantWinBizTypeTag instantWinBizTypeTag = e;
                sgc0Var.c = 1;
                objW = s8oVar.w(instantWinBizTypeTag, sgc0Var);
                if (objW == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objW);
            }
            agc0 agc0Var = new agc0(((Overall) objW).getActive());
            zi50.a aVar2 = zi50.b;
            return agc0Var;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(SportyLegendsPrepareRoundRequest sportyLegendsPrepareRoundRequest, x1b x1bVar) {
        tgc0 tgc0Var;
        if (x1bVar instanceof tgc0) {
            tgc0Var = (tgc0) x1bVar;
            int i = tgc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tgc0Var.c = i - Integer.MIN_VALUE;
            } else {
                tgc0Var = new tgc0(this, x1bVar);
            }
        } else {
            tgc0Var = new tgc0(this, x1bVar);
        }
        Object objD = tgc0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = tgc0Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objD);
                zi50.a aVar = zi50.b;
                dac0 dac0Var = this.b;
                tgc0Var.c = 1;
                objD = dac0Var.d(sportyLegendsPrepareRoundRequest, eac0.a, tgc0Var);
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
            hcc0 hcc0VarA = zgc0.a((NetworkSportyLegendsPrepareRound) objD);
            zi50.a aVar2 = zi50.b;
            return hcc0VarA;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(boolean z, x1b x1bVar) {
        ugc0 ugc0Var;
        imc0 imc0VarA;
        if (x1bVar instanceof ugc0) {
            ugc0Var = (ugc0) x1bVar;
            int i = ugc0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ugc0Var.d = i - Integer.MIN_VALUE;
            } else {
                ugc0Var = new ugc0(this, x1bVar);
            }
        } else {
            ugc0Var = new ugc0(this, x1bVar);
        }
        Object objT = ugc0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = ugc0Var.d;
        try {
            if (i2 == 0) {
                uj50.b(objT);
                zi50.a aVar = zi50.b;
                imc0VarA = this.d.a();
                if (z || imc0VarA == null) {
                    s8o s8oVar = this.a;
                    InstantWinBizTypeTag instantWinBizTypeTag = e;
                    ugc0Var.a = this;
                    ugc0Var.d = 1;
                    objT = s8oVar.t("sr:sport:3", instantWinBizTypeTag, ugc0Var);
                    if (objT == y5bVar) {
                        return y5bVar;
                    }
                }
                zi50.a aVar2 = zi50.b;
                return imc0VarA;
            }
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = ugc0Var.a;
            uj50.b(objT);
            imc0VarA = xxm.b((Sports) objT);
            this.d.b(imc0VarA);
            zi50.a aVar3 = zi50.b;
            return imc0VarA;
        } catch (Throwable th) {
            zi50.a aVar4 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(String str, x1b x1bVar) {
        vgc0 vgc0Var;
        if (x1bVar instanceof vgc0) {
            vgc0Var = (vgc0) x1bVar;
            int i = vgc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vgc0Var.c = i - Integer.MIN_VALUE;
            } else {
                vgc0Var = new vgc0(this, x1bVar);
            }
        } else {
            vgc0Var = new vgc0(this, x1bVar);
        }
        Object objQ = vgc0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = vgc0Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objQ);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.a;
                InstantWinBizTypeTag instantWinBizTypeTag = e;
                vgc0Var.c = 1;
                objQ = s8oVar.q(str, instantWinBizTypeTag, vgc0Var);
                if (objQ == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objQ);
            }
            joc0 joc0VarA = cpc0.a((Ticket) objQ);
            zi50.a aVar2 = zi50.b;
            return joc0VarA;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object l(String str, int i, boolean z, long j, long j2, String str2, x1b x1bVar) {
        wgc0 wgc0Var;
        if (x1bVar instanceof wgc0) {
            wgc0Var = (wgc0) x1bVar;
            int i2 = wgc0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wgc0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                wgc0Var = new wgc0(this, x1bVar);
            }
        } else {
            wgc0Var = new wgc0(this, x1bVar);
        }
        wgc0 wgc0Var2 = wgc0Var;
        Object objK = wgc0Var2.a;
        y5b y5bVar = y5b.a;
        int i3 = wgc0Var2.c;
        try {
            if (i3 == 0) {
                uj50.b(objK);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.a;
                String lowerCase = "SETTLED".toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                InstantWinBizTypeTag instantWinBizTypeTag = e;
                Integer num = new Integer(i);
                Boolean boolValueOf = Boolean.valueOf(z);
                Long l = new Long(j);
                Long l2 = new Long(j2);
                wgc0Var2.c = 1;
                objK = s8oVar.k(str, str2, num, lowerCase, boolValueOf, l, l2, instantWinBizTypeTag, wgc0Var2);
                if (objK == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objK);
            }
            PageData pageData = (PageData) objK;
            PageData pageData2 = new PageData();
            pageData2.lastId = pageData.lastId;
            pageData2.pageSize = pageData.pageSize;
            Collection<Ticket> collection = pageData.data;
            collection.getClass();
            ArrayList arrayList = new ArrayList(l48.r(collection, 10));
            for (Ticket ticket : collection) {
                ticket.getClass();
                arrayList.add(cpc0.a(ticket));
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
    public final Object m(String str, x1b x1bVar) {
        xgc0 xgc0Var;
        if (x1bVar instanceof xgc0) {
            xgc0Var = (xgc0) x1bVar;
            int i = xgc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xgc0Var.c = i - Integer.MIN_VALUE;
            } else {
                xgc0Var = new xgc0(this, x1bVar);
            }
        } else {
            xgc0Var = new xgc0(this, x1bVar);
        }
        Object obj = xgc0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = xgc0Var.c;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.a;
                InstantWinBizTypeTag instantWinBizTypeTag = e;
                xgc0Var.c = 1;
                if (s8oVar.b(str, instantWinBizTypeTag, xgc0Var) == y5bVar) {
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
