package defpackage;

import com.sporty.android.common.data.ErrorResponse;
import com.sportybet.android.instantwin.newtork.model.response.heattoheadstats.NetworkInstantVirtualTeamStats;
import com.sportybet.android.instantwin.newtork.model.response.heattoheadstats.NetworkInstantVirtualTeamStatsEnvelop;
import com.sportybet.android.instantwin.newtork.model.response.heattoheadstats.NetworkInstantVirtualTeamStatsHeadToHead;
import com.sportybet.android.instantwin.newtork.model.response.heattoheadstats.NetworkInstantVirtualTeamStatsMatchRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fhl implements lyh<ihl> {
    public final /* synthetic */ yzh a;
    public final /* synthetic */ dhl b;

    /* JADX INFO: loaded from: classes.dex */
    @c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.HeadToHeadStatsViewModel$getViewState$lambda$0$$inlined$map$1", f = "HeadToHeadStatsViewModel.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return fhl.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ dhl b;

        @c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.HeadToHeadStatsViewModel$getViewState$lambda$0$$inlined$map$1$2", f = "HeadToHeadStatsViewModel.kt", l = {50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(myh myhVar, dhl dhlVar) {
            this.a = myhVar;
            this.b = dhlVar;
        }

        /* JADX WARN: Code duplicated, block: B:107:0x01a2  */
        /* JADX WARN: Code duplicated, block: B:110:0x01b1  */
        /* JADX WARN: Code duplicated, block: B:111:0x01b6  */
        /* JADX WARN: Code duplicated, block: B:114:0x01be  */
        /* JADX WARN: Code duplicated, block: B:115:0x01c3  */
        /* JADX WARN: Code duplicated, block: B:118:0x01ce  */
        /* JADX WARN: Code duplicated, block: B:119:0x01d3  */
        /* JADX WARN: Code duplicated, block: B:123:0x01dd  */
        /* JADX WARN: Code duplicated, block: B:190:0x02fa  */
        /* JADX WARN: Code duplicated, block: B:191:0x02ff  */
        /* JADX WARN: Code duplicated, block: B:194:0x0306  */
        /* JADX WARN: Code duplicated, block: B:195:0x030b  */
        /* JADX WARN: Code duplicated, block: B:198:0x0312  */
        /* JADX WARN: Code duplicated, block: B:199:0x0317  */
        /* JADX WARN: Code duplicated, block: B:202:0x031e  */
        /* JADX WARN: Code duplicated, block: B:203:0x0323  */
        /* JADX WARN: Code duplicated, block: B:206:0x032f  */
        /* JADX WARN: Code duplicated, block: B:207:0x0334  */
        /* JADX WARN: Code duplicated, block: B:210:0x033b  */
        /* JADX WARN: Code duplicated, block: B:211:0x0340  */
        /* JADX WARN: Code duplicated, block: B:214:0x0347  */
        /* JADX WARN: Code duplicated, block: B:215:0x034c  */
        /* JADX WARN: Code duplicated, block: B:218:0x0353  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            Object cVar;
            List<NetworkInstantVirtualTeamStatsMatchRecord> list;
            List listT0;
            NetworkInstantVirtualTeamStats awayTeam;
            List listT1;
            m7j0 m7j0Var;
            NetworkInstantVirtualTeamStats homeTeam;
            int probability;
            NetworkInstantVirtualTeamStats awayTeam2;
            int probability2;
            NetworkInstantVirtualTeamStatsHeadToHead headToHead;
            List<NetworkInstantVirtualTeamStatsMatchRecord> matches;
            NetworkInstantVirtualTeamStatsEnvelop networkInstantVirtualTeamStatsEnvelop;
            m7j0 m7j0Var2;
            Object xq20Var;
            NetworkInstantVirtualTeamStats homeTeam2;
            float avgPoints;
            NetworkInstantVirtualTeamStats homeTeam3;
            float homeAvgScore;
            NetworkInstantVirtualTeamStats homeTeam4;
            float awayAvgScore;
            NetworkInstantVirtualTeamStats homeTeam5;
            float overallAvgScore;
            NetworkInstantVirtualTeamStats awayTeam3;
            float avgPoints2;
            NetworkInstantVirtualTeamStats awayTeam4;
            float homeAvgScore2;
            NetworkInstantVirtualTeamStats awayTeam5;
            float awayAvgScore2;
            List list2;
            List<NetworkInstantVirtualTeamStatsMatchRecord> matches2;
            Boolean bool;
            olv.a aVar2;
            olv.a aVar3;
            String awayTeamName;
            Boolean bool2;
            String str;
            Object olvVar;
            List<NetworkInstantVirtualTeamStatsMatchRecord> recentMatches;
            List<NetworkInstantVirtualTeamStatsMatchRecord> recentMatches2;
            List<NetworkInstantVirtualTeamStatsMatchRecord> recentMatches3;
            List<NetworkInstantVirtualTeamStatsMatchRecord> recentMatches4;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj2 = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            List<NetworkInstantVirtualTeamStatsMatchRecord> list3 = null;
            if (i2 == 0) {
                uj50.b(obj2);
                lk50 lk50Var = (lk50) obj;
                if (lk50Var instanceof lk50.b) {
                    cVar = ihl.d.a;
                } else if (lk50Var instanceof lk50.c) {
                    NetworkInstantVirtualTeamStatsEnvelop networkInstantVirtualTeamStatsEnvelop2 = (NetworkInstantVirtualTeamStatsEnvelop) ((lk50.c) lk50Var).a;
                    networkInstantVirtualTeamStatsEnvelop2.getClass();
                    NetworkInstantVirtualTeamStats homeTeam6 = networkInstantVirtualTeamStatsEnvelop2.getHomeTeam();
                    String teamName = homeTeam6 != null ? homeTeam6.getTeamName() : null;
                    if (teamName == null) {
                        teamName = "";
                    }
                    NetworkInstantVirtualTeamStats homeTeam7 = networkInstantVirtualTeamStatsEnvelop2.getHomeTeam();
                    String teamLogoUrl = homeTeam7 != null ? homeTeam7.getTeamLogoUrl() : null;
                    if (teamLogoUrl == null) {
                        teamLogoUrl = "";
                    }
                    d6f0 d6f0Var = new d6f0(teamName, teamLogoUrl);
                    NetworkInstantVirtualTeamStats awayTeam6 = networkInstantVirtualTeamStatsEnvelop2.getAwayTeam();
                    String teamName2 = awayTeam6 != null ? awayTeam6.getTeamName() : null;
                    if (teamName2 == null) {
                        teamName2 = "";
                    }
                    NetworkInstantVirtualTeamStats awayTeam7 = networkInstantVirtualTeamStatsEnvelop2.getAwayTeam();
                    String teamLogoUrl2 = awayTeam7 != null ? awayTeam7.getTeamLogoUrl() : null;
                    if (teamLogoUrl2 == null) {
                        teamLogoUrl2 = "";
                    }
                    d6f0 d6f0Var2 = new d6f0(teamName2, teamLogoUrl2);
                    q2i0 q2i0Var = new q2i0(d6f0Var, d6f0Var2);
                    NetworkInstantVirtualTeamStats homeTeam8 = networkInstantVirtualTeamStatsEnvelop2.getHomeTeam();
                    int teamSize = homeTeam8 != null ? homeTeam8.getTeamSize() : 0;
                    NetworkInstantVirtualTeamStats homeTeam9 = networkInstantVirtualTeamStatsEnvelop2.getHomeTeam();
                    int form = homeTeam9 != null ? homeTeam9.getForm() : 0;
                    NetworkInstantVirtualTeamStats homeTeam10 = networkInstantVirtualTeamStatsEnvelop2.getHomeTeam();
                    int rank = homeTeam10 != null ? homeTeam10.getRank() : 0;
                    NetworkInstantVirtualTeamStats awayTeam8 = networkInstantVirtualTeamStatsEnvelop2.getAwayTeam();
                    int form2 = awayTeam8 != null ? awayTeam8.getForm() : 0;
                    NetworkInstantVirtualTeamStats awayTeam9 = networkInstantVirtualTeamStatsEnvelop2.getAwayTeam();
                    q2s q2sVar = new q2s(teamSize, form, rank, form2, awayTeam9 != null ? awayTeam9.getRank() : 0);
                    NetworkInstantVirtualTeamStats homeTeam11 = networkInstantVirtualTeamStatsEnvelop2.getHomeTeam();
                    int size = (homeTeam11 == null || (recentMatches4 = homeTeam11.getRecentMatches()) == null) ? 0 : recentMatches4.size();
                    NetworkInstantVirtualTeamStats awayTeam10 = networkInstantVirtualTeamStatsEnvelop2.getAwayTeam();
                    int iMax = Math.max(size, (awayTeam10 == null || (recentMatches3 = awayTeam10.getRecentMatches()) == null) ? 0 : recentMatches3.size());
                    int iMin = Math.min(iMax, 5);
                    NetworkInstantVirtualTeamStats homeTeam12 = networkInstantVirtualTeamStatsEnvelop2.getHomeTeam();
                    if (homeTeam12 == null || (recentMatches2 = homeTeam12.getRecentMatches()) == null) {
                        list = null;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = recentMatches2.iterator();
                        while (it.hasNext()) {
                            List<NetworkInstantVirtualTeamStatsMatchRecord> list4 = list3;
                            i7v i7vVarA = qgl.a((NetworkInstantVirtualTeamStatsMatchRecord) it.next(), networkInstantVirtualTeamStatsEnvelop2.getHomeTeam().getTeamId());
                            if (i7vVarA != null) {
                                arrayList.add(i7vVarA);
                            }
                            list3 = list4;
                        }
                        list = list3;
                        listT0 = CollectionsKt.t0(arrayList, iMax);
                        if (listT0 == null) {
                        }
                        awayTeam = networkInstantVirtualTeamStatsEnvelop2.getAwayTeam();
                        if (awayTeam != null || (recentMatches = awayTeam.getRecentMatches()) == null) {
                            listT1 = m2g.a;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<T> it2 = recentMatches.iterator();
                            while (it2.hasNext()) {
                                i7v i7vVarA2 = qgl.a((NetworkInstantVirtualTeamStatsMatchRecord) it2.next(), networkInstantVirtualTeamStatsEnvelop2.getAwayTeam().getTeamId());
                                if (i7vVarA2 != null) {
                                    arrayList2.add(i7vVarA2);
                                }
                            }
                            listT1 = CollectionsKt.t0(arrayList2, iMax);
                            if (listT1 == null) {
                                listT1 = m2g.a;
                            }
                        }
                        eor eorVar = new eor(iMin, listT0, listT1);
                        homeTeam = networkInstantVirtualTeamStatsEnvelop2.getHomeTeam();
                        if (homeTeam != null) {
                            probability = homeTeam.getProbability();
                        } else {
                            probability = 0;
                        }
                        awayTeam2 = networkInstantVirtualTeamStatsEnvelop2.getAwayTeam();
                        if (awayTeam2 != null) {
                            probability2 = awayTeam2.getProbability();
                        } else {
                            probability2 = 0;
                        }
                        m7j0Var = new m7j0(d6f0Var, probability, d6f0Var2, probability2);
                        headToHead = networkInstantVirtualTeamStatsEnvelop2.getHeadToHead();
                        if (headToHead != null) {
                            matches = headToHead.getMatches();
                        } else {
                            matches = list;
                        }
                        if (matches != null || matches.isEmpty()) {
                            networkInstantVirtualTeamStatsEnvelop = networkInstantVirtualTeamStatsEnvelop2;
                            m7j0Var2 = m7j0Var;
                            xq20Var = list;
                        } else {
                            NetworkInstantVirtualTeamStatsHeadToHead headToHead2 = networkInstantVirtualTeamStatsEnvelop2.getHeadToHead();
                            int homeTeamWins = headToHead2 != null ? headToHead2.getHomeTeamWins() : 0;
                            NetworkInstantVirtualTeamStatsHeadToHead headToHead3 = networkInstantVirtualTeamStatsEnvelop2.getHeadToHead();
                            Object homeTeamHighestWinScore = headToHead3 != null ? headToHead3.getHomeTeamHighestWinScore() : list;
                            if (homeTeamHighestWinScore == null) {
                                homeTeamHighestWinScore = "";
                            }
                            NetworkInstantVirtualTeamStatsHeadToHead headToHead4 = networkInstantVirtualTeamStatsEnvelop2.getHeadToHead();
                            int awayTeamWins = headToHead4 != null ? headToHead4.getAwayTeamWins() : 0;
                            NetworkInstantVirtualTeamStatsHeadToHead headToHead5 = networkInstantVirtualTeamStatsEnvelop2.getHeadToHead();
                            Object awayTeamHighestWinScore = headToHead5 != null ? headToHead5.getAwayTeamHighestWinScore() : list;
                            Object obj3 = awayTeamHighestWinScore != null ? awayTeamHighestWinScore : "";
                            NetworkInstantVirtualTeamStatsHeadToHead headToHead6 = networkInstantVirtualTeamStatsEnvelop2.getHeadToHead();
                            int draws = headToHead6 != null ? headToHead6.getDraws() : 0;
                            NetworkInstantVirtualTeamStatsHeadToHead headToHead7 = networkInstantVirtualTeamStatsEnvelop2.getHeadToHead();
                            if (headToHead7 == null || (matches2 = headToHead7.getMatches()) == null) {
                                networkInstantVirtualTeamStatsEnvelop = networkInstantVirtualTeamStatsEnvelop2;
                            } else {
                                networkInstantVirtualTeamStatsEnvelop = networkInstantVirtualTeamStatsEnvelop2;
                                List listT2 = CollectionsKt.t0(matches2, 5);
                                if (listT2 != null) {
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator<T> it3 = listT2.iterator();
                                    while (it3.hasNext()) {
                                        NetworkInstantVirtualTeamStatsMatchRecord networkInstantVirtualTeamStatsMatchRecord = (NetworkInstantVirtualTeamStatsMatchRecord) it3.next();
                                        NetworkInstantVirtualTeamStats homeTeam13 = networkInstantVirtualTeamStatsEnvelop.getHomeTeam();
                                        Object teamId = homeTeam13 != null ? homeTeam13.getTeamId() : list;
                                        if (teamId == null) {
                                            olvVar = list;
                                        } else {
                                            boolean zG = Intrinsics.g(networkInstantVirtualTeamStatsMatchRecord.getHomeTeamId(), teamId);
                                            if (networkInstantVirtualTeamStatsMatchRecord.getHomeScore() > networkInstantVirtualTeamStatsMatchRecord.getAwayScore()) {
                                                aVar3 = zG ? olv.a.a : olv.a.b;
                                                awayTeamName = networkInstantVirtualTeamStatsMatchRecord.getHomeTeamName();
                                                bool2 = Boolean.TRUE;
                                            } else {
                                                if (networkInstantVirtualTeamStatsMatchRecord.getHomeScore() < networkInstantVirtualTeamStatsMatchRecord.getAwayScore()) {
                                                    aVar3 = zG ? olv.a.b : olv.a.a;
                                                    awayTeamName = networkInstantVirtualTeamStatsMatchRecord.getAwayTeamName();
                                                    bool2 = Boolean.FALSE;
                                                } else {
                                                    List<NetworkInstantVirtualTeamStatsMatchRecord> list5 = list;
                                                    bool = list5;
                                                    aVar2 = olv.a.c;
                                                    str = list5;
                                                }
                                                olvVar = new olv(aVar2, str, bool, networkInstantVirtualTeamStatsMatchRecord.getHomeScore(), networkInstantVirtualTeamStatsMatchRecord.getAwayScore());
                                            }
                                            aVar2 = aVar3;
                                            str = awayTeamName;
                                            bool = bool2;
                                            olvVar = new olv(aVar2, str, bool, networkInstantVirtualTeamStatsMatchRecord.getHomeScore(), networkInstantVirtualTeamStatsMatchRecord.getAwayScore());
                                        }
                                        if (olvVar != null) {
                                            arrayList3.add(olvVar);
                                        }
                                        it3 = it3;
                                        m7j0Var = m7j0Var;
                                    }
                                    m7j0Var2 = m7j0Var;
                                    list2 = arrayList3;
                                }
                                xq20Var = new xq20(d6f0Var, homeTeamWins, homeTeamHighestWinScore, d6f0Var2, awayTeamWins, obj3, draws, list2);
                            }
                            m7j0Var2 = m7j0Var;
                            list2 = m2g.a;
                            xq20Var = new xq20(d6f0Var, homeTeamWins, homeTeamHighestWinScore, d6f0Var2, awayTeamWins, obj3, draws, list2);
                        }
                        homeTeam2 = networkInstantVirtualTeamStatsEnvelop.getHomeTeam();
                        if (homeTeam2 != null) {
                            avgPoints = homeTeam2.getAvgPoints();
                        } else {
                            avgPoints = 0.0f;
                        }
                        homeTeam3 = networkInstantVirtualTeamStatsEnvelop.getHomeTeam();
                        if (homeTeam3 != null) {
                            homeAvgScore = homeTeam3.getHomeAvgScore();
                        } else {
                            homeAvgScore = 0.0f;
                        }
                        homeTeam4 = networkInstantVirtualTeamStatsEnvelop.getHomeTeam();
                        if (homeTeam4 != null) {
                            awayAvgScore = homeTeam4.getAwayAvgScore();
                        } else {
                            awayAvgScore = 0.0f;
                        }
                        homeTeam5 = networkInstantVirtualTeamStatsEnvelop.getHomeTeam();
                        if (homeTeam5 != null) {
                            overallAvgScore = homeTeam5.getOverallAvgScore();
                        } else {
                            overallAvgScore = 0.0f;
                        }
                        ki40.a aVar4 = new ki40.a(avgPoints, homeAvgScore, awayAvgScore, overallAvgScore);
                        awayTeam3 = networkInstantVirtualTeamStatsEnvelop.getAwayTeam();
                        if (awayTeam3 != null) {
                            avgPoints2 = awayTeam3.getAvgPoints();
                        } else {
                            avgPoints2 = 0.0f;
                        }
                        awayTeam4 = networkInstantVirtualTeamStatsEnvelop.getAwayTeam();
                        if (awayTeam4 != null) {
                            homeAvgScore2 = awayTeam4.getHomeAvgScore();
                        } else {
                            homeAvgScore2 = 0.0f;
                        }
                        awayTeam5 = networkInstantVirtualTeamStatsEnvelop.getAwayTeam();
                        if (awayTeam5 != null) {
                            awayAvgScore2 = awayTeam5.getAwayAvgScore();
                        } else {
                            awayAvgScore2 = 0.0f;
                        }
                        NetworkInstantVirtualTeamStats awayTeam11 = networkInstantVirtualTeamStatsEnvelop.getAwayTeam();
                        cVar = new ihl.c(new wel(q2i0Var, q2sVar, eorVar, m7j0Var2, xq20Var, new ki40(aVar4, new ki40.a(avgPoints2, homeAvgScore2, awayAvgScore2, awayTeam11 != null ? awayTeam11.getOverallAvgScore() : 0.0f))), this.b.b);
                    }
                    listT0 = m2g.a;
                    awayTeam = networkInstantVirtualTeamStatsEnvelop2.getAwayTeam();
                    if (awayTeam != null) {
                        listT1 = m2g.a;
                    } else {
                        listT1 = m2g.a;
                    }
                    eor eorVar2 = new eor(iMin, listT0, listT1);
                    homeTeam = networkInstantVirtualTeamStatsEnvelop2.getHomeTeam();
                    if (homeTeam != null) {
                        probability = homeTeam.getProbability();
                    } else {
                        probability = 0;
                    }
                    awayTeam2 = networkInstantVirtualTeamStatsEnvelop2.getAwayTeam();
                    if (awayTeam2 != null) {
                        probability2 = awayTeam2.getProbability();
                    } else {
                        probability2 = 0;
                    }
                    m7j0Var = new m7j0(d6f0Var, probability, d6f0Var2, probability2);
                    headToHead = networkInstantVirtualTeamStatsEnvelop2.getHeadToHead();
                    if (headToHead != null) {
                        matches = headToHead.getMatches();
                    } else {
                        matches = list;
                    }
                    if (matches != null) {
                        networkInstantVirtualTeamStatsEnvelop = networkInstantVirtualTeamStatsEnvelop2;
                        m7j0Var2 = m7j0Var;
                        xq20Var = list;
                    } else {
                        networkInstantVirtualTeamStatsEnvelop = networkInstantVirtualTeamStatsEnvelop2;
                        m7j0Var2 = m7j0Var;
                        xq20Var = list;
                    }
                    homeTeam2 = networkInstantVirtualTeamStatsEnvelop.getHomeTeam();
                    if (homeTeam2 != null) {
                        avgPoints = homeTeam2.getAvgPoints();
                    } else {
                        avgPoints = 0.0f;
                    }
                    homeTeam3 = networkInstantVirtualTeamStatsEnvelop.getHomeTeam();
                    if (homeTeam3 != null) {
                        homeAvgScore = homeTeam3.getHomeAvgScore();
                    } else {
                        homeAvgScore = 0.0f;
                    }
                    homeTeam4 = networkInstantVirtualTeamStatsEnvelop.getHomeTeam();
                    if (homeTeam4 != null) {
                        awayAvgScore = homeTeam4.getAwayAvgScore();
                    } else {
                        awayAvgScore = 0.0f;
                    }
                    homeTeam5 = networkInstantVirtualTeamStatsEnvelop.getHomeTeam();
                    if (homeTeam5 != null) {
                        overallAvgScore = homeTeam5.getOverallAvgScore();
                    } else {
                        overallAvgScore = 0.0f;
                    }
                    ki40.a aVar5 = new ki40.a(avgPoints, homeAvgScore, awayAvgScore, overallAvgScore);
                    awayTeam3 = networkInstantVirtualTeamStatsEnvelop.getAwayTeam();
                    if (awayTeam3 != null) {
                        avgPoints2 = awayTeam3.getAvgPoints();
                    } else {
                        avgPoints2 = 0.0f;
                    }
                    awayTeam4 = networkInstantVirtualTeamStatsEnvelop.getAwayTeam();
                    if (awayTeam4 != null) {
                        homeAvgScore2 = awayTeam4.getHomeAvgScore();
                    } else {
                        homeAvgScore2 = 0.0f;
                    }
                    awayTeam5 = networkInstantVirtualTeamStatsEnvelop.getAwayTeam();
                    if (awayTeam5 != null) {
                        awayAvgScore2 = awayTeam5.getAwayAvgScore();
                    } else {
                        awayAvgScore2 = 0.0f;
                    }
                    NetworkInstantVirtualTeamStats awayTeam12 = networkInstantVirtualTeamStatsEnvelop.getAwayTeam();
                    cVar = new ihl.c(new wel(q2i0Var, q2sVar, eorVar2, m7j0Var2, xq20Var, new ki40(aVar5, new ki40.a(avgPoints2, homeAvgScore2, awayAvgScore2, awayTeam12 != null ? awayTeam12.getOverallAvgScore() : 0.0f))), this.b.b);
                } else {
                    if (!(lk50Var instanceof lk50.a)) {
                        uhc.a();
                        return null;
                    }
                    Throwable th = ((lk50.a) lk50Var).a;
                    if (th instanceof tom) {
                        tom tomVar = (tom) th;
                        if (tomVar.a != 400) {
                            cVar = ihl.b.a;
                        } else {
                            ErrorResponse.Companion companion = ErrorResponse.INSTANCE;
                            bi50<?> bi50Var = tomVar.c;
                            ErrorResponse errorResponse = companion.getErrorResponse(bi50Var != null ? bi50Var.c : null);
                            cVar = (errorResponse == null || errorResponse.getErrorCode() != 19301) ? ihl.b.a : ihl.a.a;
                        }
                    } else {
                        cVar = ihl.b.a;
                    }
                }
                aVar.b = 1;
                if (this.a.emit(cVar, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj2);
            }
            return Unit.a;
        }
    }

    public fhl(yzh yzhVar, dhl dhlVar) {
        this.a = yzhVar;
        this.b = dhlVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super ihl> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            b bVar = new b(myhVar, this.b);
            aVar.b = 1;
            if (this.a.collect(bVar, aVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
