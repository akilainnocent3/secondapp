package defpackage;

import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.UserPlayInfo;
import com.sportygames.commons.tournament.model.LeaderboardRecord;
import com.sportygames.commons.tournament.model.TopRankPoint;
import com.sportygames.commons.tournament.model.TournamentRankListResponse;
import com.sportygames.commons.tournament.model.TournamentRankResponse;
import com.sportygames.commons.tournament.model.TournamentStatsData;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.b;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wdg0 implements Function1 {
    public final /* synthetic */ TournamentStatsData a;
    public final /* synthetic */ dq40 b;
    public final /* synthetic */ ytw c;
    public final /* synthetic */ ytw d;
    public final /* synthetic */ ytw e;
    public final /* synthetic */ ytw f;

    public /* synthetic */ wdg0(TournamentStatsData tournamentStatsData, dq40 dq40Var, ytw ytwVar, ytw ytwVar2, ytw ytwVar3, ytw ytwVar4) {
        this.a = tournamentStatsData;
        this.b = dq40Var;
        this.c = ytwVar;
        this.d = ytwVar2;
        this.e = ytwVar3;
        this.f = ytwVar4;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x029f  */
    /* JADX WARN: Code duplicated, block: B:143:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:147:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:149:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:150:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:154:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:157:0x02df  */
    /* JADX WARN: Code duplicated, block: B:164:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:167:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:225:0x03be  */
    /* JADX WARN: Code duplicated, block: B:263:0x0449  */
    /* JADX WARN: Code duplicated, block: B:273:0x046a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:274:0x046c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LeaderboardRecord leaderboardRecord;
        TournamentRankListResponse tournamentRankListResponse;
        ytw ytwVar;
        String string;
        Object next;
        Double prize;
        LeaderboardRecord leaderboardRecord2;
        Object next2;
        String str;
        Integer rank;
        String strValueOf;
        Integer intOrNull;
        int iIntValue;
        String strP;
        Integer intOrNull2;
        int iIntValue2;
        Double dH;
        double dDoubleValue;
        List<LeaderboardRecord> leaderboardRecords;
        List<TopRankPoint> topRankPoints;
        String strValueOf2;
        Double score;
        Double endPoints;
        Double score2;
        Double endPoints2;
        double dDoubleValue2;
        Double endPoints3;
        Double score3;
        Object next3;
        Double score4;
        Integer rank2;
        Double score5;
        String strValueOf3;
        T t;
        UserPlayInfo rankData;
        Double pointsScore;
        Double score6;
        Object next4;
        LeaderboardRecord leaderboardRecord3;
        TournamentRankListResponse tournamentRankListResponse2 = (TournamentRankListResponse) obj;
        tournamentRankListResponse2.getClass();
        List<LeaderboardRecord> leaderboardRecords2 = tournamentRankListResponse2.getLeaderboardRecords();
        if (leaderboardRecords2 != null) {
            Iterator<T> it = leaderboardRecords2.iterator();
            do {
                if (!it.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it.next();
                leaderboardRecord3 = (LeaderboardRecord) next4;
            } while (!Intrinsics.g(leaderboardRecord3 != null ? leaderboardRecord3.getPatronId() : null, SportyGamesManager.getInstance().getPatronId()));
            leaderboardRecord = (LeaderboardRecord) next4;
        } else {
            leaderboardRecord = null;
        }
        ytw ytwVar2 = this.c;
        Integer intOrNull3 = StringsKt.toIntOrNull((String) ytwVar2.getValue());
        int iIntValue3 = intOrNull3 != null ? intOrNull3.intValue() : 0;
        TournamentStatsData tournamentStatsData = this.a;
        boolean zJ = hfg0.j(iIntValue3, tournamentStatsData.getPrizeListMap());
        dq40 dq40Var = this.b;
        ytw ytwVar3 = this.d;
        ytw ytwVar4 = this.e;
        String str2 = "0.00";
        String str3 = "--";
        if (zJ) {
            if (leaderboardRecord != null) {
                tournamentRankListResponse = tournamentRankListResponse2;
                ytwVar = ytwVar2;
                String currency = tournamentStatsData.getCurrency();
                Integer intOrNull4 = StringsKt.toIntOrNull((String) ytwVar.getValue());
                int iIntValue4 = intOrNull4 != null ? intOrNull4.intValue() : 0;
                List<LeaderboardRecord> leaderboardRecords3 = tournamentRankListResponse.getLeaderboardRecords();
                if (leaderboardRecords3 == null) {
                    leaderboardRecords3 = m2g.a;
                }
                leaderboardRecords3.getClass();
                if (iIntValue4 <= 0 || leaderboardRecords3.isEmpty()) {
                    string = null;
                } else {
                    Iterator<T> it2 = leaderboardRecords3.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        leaderboardRecord2 = (LeaderboardRecord) next;
                    } while (!Intrinsics.g(leaderboardRecord2 != null ? leaderboardRecord2.getPatronId() : null, SportyGamesManager.getInstance().getPatronId()));
                    LeaderboardRecord leaderboardRecord4 = (LeaderboardRecord) next;
                    TreeMap treeMap = pw.a;
                    string = pw.c(pw.n((leaderboardRecord4 == null || (prize = leaderboardRecord4.getPrize()) == null) ? 0.0d : prize.doubleValue())).toString();
                }
                ytwVar3.setValue(currency + " " + string);
                Double score7 = leaderboardRecord.getScore();
                if (score7 != null) {
                    try {
                        String str4 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(score7.doubleValue());
                        str4.getClass();
                        str3 = str4;
                    } catch (Exception unused) {
                        str3 = "0.00";
                    }
                }
                ytwVar4.setValue(str3);
            } else if (dq40Var.a != 0) {
                String currency2 = tournamentStatsData.getCurrency();
                TreeMap treeMap2 = pw.a;
                ytwVar3.setValue(currency2 + " " + pw.b(String.valueOf(((TournamentRankResponse) dq40Var.a).getPrize())));
                Double score8 = ((TournamentRankResponse) dq40Var.a).getScore();
                if (score8 != null && (strValueOf = String.valueOf(score8.doubleValue())) != null) {
                    str3 = strValueOf;
                }
                ytwVar4.setValue(str3);
            } else {
                String currency3 = tournamentStatsData.getCurrency();
                TreeMap treeMap3 = pw.a;
                UserPlayInfo rankData2 = tournamentStatsData.getRankData();
                int iIntValue5 = (rankData2 == null || (rank = rankData2.getRank()) == null) ? 0 : rank.intValue();
                List<Pair<String, String>> prizeListMap = tournamentStatsData.getPrizeListMap();
                prizeListMap.getClass();
                Iterator<T> it3 = prizeListMap.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        tournamentRankListResponse = tournamentRankListResponse2;
                        ytwVar = ytwVar2;
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    String str5 = (String) ((Pair) next2).a;
                    tournamentRankListResponse = tournamentRankListResponse2;
                    List listSplit$default = StringsKt__StringsKt.split$default(str5, new String[]{"-"}, false, 0, 6, null);
                    ytwVar = ytwVar2;
                    if (listSplit$default.size() == 2) {
                        Integer intOrNull5 = StringsKt.toIntOrNull((String) listSplit$default.get(0));
                        int iIntValue6 = intOrNull5 != null ? intOrNull5.intValue() : 0;
                        Integer intOrNull6 = StringsKt.toIntOrNull((String) listSplit$default.get(1));
                        int iIntValue7 = intOrNull6 != null ? intOrNull6.intValue() : 0;
                        if (iIntValue6 <= iIntValue5 && iIntValue5 <= iIntValue7) {
                            break;
                        }
                        tournamentRankListResponse2 = tournamentRankListResponse;
                        ytwVar2 = ytwVar;
                    } else {
                        Integer intOrNull7 = StringsKt.toIntOrNull(str5);
                        if ((intOrNull7 != null ? intOrNull7.intValue() : 0) == iIntValue5) {
                            break;
                        }
                        tournamentRankListResponse2 = tournamentRankListResponse;
                        ytwVar2 = ytwVar;
                    }
                }
                Pair pair = (Pair) next2;
                if (pair == null || (str = (String) pair.b) == null) {
                    str = "--";
                }
                ytwVar3.setValue(currency3 + " " + pw.b(str));
                TreeMap treeMap4 = pw.a;
                UserPlayInfo rankData3 = tournamentStatsData.getRankData();
                String strB = pw.b(String.valueOf(rankData3 != null ? rankData3.getPointsScore() : null));
                ytwVar4.setValue(strB != null ? strB : "--");
            }
            intOrNull = StringsKt.toIntOrNull((String) ytwVar.getValue());
            if (intOrNull != null) {
                iIntValue = intOrNull.intValue();
            } else {
                iIntValue = 0;
            }
            strP = "";
            if (iIntValue != 1) {
                intOrNull2 = StringsKt.toIntOrNull((String) ytwVar.getValue());
                if (intOrNull2 != null) {
                    iIntValue2 = intOrNull2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                dH = b.h((String) ytwVar4.getValue());
                if (dH != null) {
                    dDoubleValue = dH.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                Double dValueOf = Double.valueOf(dDoubleValue);
                List<Pair<String, String>> prizeListMap2 = tournamentStatsData.getPrizeListMap();
                leaderboardRecords = tournamentRankListResponse.getLeaderboardRecords();
                if (leaderboardRecords == null) {
                    leaderboardRecords = m2g.a;
                }
                topRankPoints = tournamentRankListResponse.getTopRankPoints();
                if (iIntValue2 <= 0 && !Intrinsics.c(dValueOf, 0.0d) && !prizeListMap2.isEmpty()) {
                    int i = iIntValue2 - 1;
                    if (i <= 0) {
                        strValueOf2 = "";
                    } else if (hfg0.j(iIntValue2, prizeListMap2)) {
                        if (iIntValue2 <= 10) {
                            Iterator<T> it4 = leaderboardRecords.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    next3 = null;
                                    break;
                                }
                                next3 = it4.next();
                                LeaderboardRecord leaderboardRecord5 = (LeaderboardRecord) next3;
                                if (leaderboardRecord5 != null && (rank2 = leaderboardRecord5.getRank()) != null && rank2.intValue() == i) {
                                    break;
                                }
                            }
                            LeaderboardRecord leaderboardRecord6 = (LeaderboardRecord) next3;
                            try {
                                String str6 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(((leaderboardRecord6 == null || (score4 = leaderboardRecord6.getScore()) == null) ? 0.0d : score4.doubleValue()) - dDoubleValue);
                                str6.getClass();
                                str2 = str6;
                            } catch (Exception unused2) {
                            }
                            strValueOf2 = str2.toString();
                        } else {
                            Integer num = hfg0.l(iIntValue2, topRankPoints).a;
                            if ((num != null ? num.intValue() : 0) <= 0) {
                                num = 0;
                            }
                            if (num != null && num.intValue() == 0) {
                                LeaderboardRecord leaderboardRecord7 = (LeaderboardRecord) CollectionsKt.b0(leaderboardRecords);
                                try {
                                    String str7 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(((leaderboardRecord7 == null || (score3 = leaderboardRecord7.getScore()) == null) ? 0.0d : score3.doubleValue()) - dDoubleValue);
                                    str7.getClass();
                                    str2 = str7;
                                } catch (Exception unused3) {
                                }
                                strValueOf2 = str2;
                            } else {
                                if (topRankPoints == null) {
                                    dDoubleValue2 = 0.0d;
                                } else {
                                    TopRankPoint topRankPoint = topRankPoints.get((num != null ? num.intValue() : 0) - 1);
                                    if (topRankPoint == null || (endPoints3 = topRankPoint.getEndPoints()) == null) {
                                        dDoubleValue2 = 0.0d;
                                    } else {
                                        dDoubleValue2 = endPoints3.doubleValue();
                                    }
                                }
                                if (dDoubleValue2 == 0.0d) {
                                    strValueOf2 = "";
                                } else {
                                    try {
                                        String str8 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dDoubleValue2 - dDoubleValue);
                                        str8.getClass();
                                        str2 = str8;
                                    } catch (Exception unused4) {
                                    }
                                    strValueOf2 = str2.toString();
                                }
                            }
                        }
                    } else if (topRankPoints != null && !topRankPoints.isEmpty()) {
                        TopRankPoint topRankPoint2 = (TopRankPoint) CollectionsKt.b0(topRankPoints);
                        try {
                            String str9 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(((topRankPoint2 == null || (endPoints2 = topRankPoint2.getEndPoints()) == null) ? 0.0d : endPoints2.doubleValue()) - dDoubleValue);
                            str9.getClass();
                            str2 = str9;
                        } catch (Exception unused5) {
                        }
                        strValueOf2 = str2.toString();
                    } else if (leaderboardRecords == null || leaderboardRecords.isEmpty()) {
                        strValueOf2 = "";
                    } else {
                        LeaderboardRecord leaderboardRecord8 = (LeaderboardRecord) CollectionsKt.b0(leaderboardRecords);
                        try {
                            String str10 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(((leaderboardRecord8 == null || (score2 = leaderboardRecord8.getScore()) == null) ? 0.0d : score2.doubleValue()) - dDoubleValue);
                            str10.getClass();
                            str2 = str10;
                        } catch (Exception unused6) {
                        }
                        strValueOf2 = str2.toString();
                    }
                } else if (topRankPoints == null && !topRankPoints.isEmpty()) {
                    TopRankPoint topRankPoint3 = (TopRankPoint) CollectionsKt.b0(topRankPoints);
                    strValueOf2 = String.valueOf((topRankPoint3 == null || (endPoints = topRankPoint3.getEndPoints()) == null) ? 0.0d : endPoints.doubleValue());
                } else if (leaderboardRecords != null || leaderboardRecords.isEmpty()) {
                    strValueOf2 = "";
                } else {
                    LeaderboardRecord leaderboardRecord9 = (LeaderboardRecord) CollectionsKt.b0(leaderboardRecords);
                    strValueOf2 = String.valueOf((leaderboardRecord9 == null || (score = leaderboardRecord9.getScore()) == null) ? 0.0d : score.doubleValue());
                }
                strP = c.p(strValueOf2, ",", "", false);
            }
            this.f.setValue(strP);
            return Unit.a;
        }
        ytwVar3.setValue(tournamentStatsData.getCurrency() + " --");
        if (leaderboardRecord != null ? !((score5 = leaderboardRecord.getScore()) == null || (strValueOf3 = String.valueOf(score5.doubleValue())) == null) : !((t = dq40Var.a) == 0 ? (rankData = tournamentStatsData.getRankData()) == null || (pointsScore = rankData.getPointsScore()) == null || (strValueOf3 = String.valueOf(pointsScore.doubleValue())) == null : (score6 = ((TournamentRankResponse) t).getScore()) == null || (strValueOf3 = String.valueOf(score6.doubleValue())) == null)) {
            str3 = strValueOf3;
        }
        ytwVar4.setValue(str3);
        tournamentRankListResponse = tournamentRankListResponse2;
        ytwVar = ytwVar2;
        intOrNull = StringsKt.toIntOrNull((String) ytwVar.getValue());
        if (intOrNull != null) {
            iIntValue = intOrNull.intValue();
        } else {
            iIntValue = 0;
        }
        strP = "";
        if (iIntValue != 1) {
            intOrNull2 = StringsKt.toIntOrNull((String) ytwVar.getValue());
            if (intOrNull2 != null) {
                iIntValue2 = intOrNull2.intValue();
            } else {
                iIntValue2 = 0;
            }
            dH = b.h((String) ytwVar4.getValue());
            if (dH != null) {
                dDoubleValue = dH.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
            Double dValueOf2 = Double.valueOf(dDoubleValue);
            List<Pair<String, String>> prizeListMap3 = tournamentStatsData.getPrizeListMap();
            leaderboardRecords = tournamentRankListResponse.getLeaderboardRecords();
            if (leaderboardRecords == null) {
                leaderboardRecords = m2g.a;
            }
            topRankPoints = tournamentRankListResponse.getTopRankPoints();
            if (iIntValue2 <= 0) {
                if (topRankPoints == null) {
                    if (leaderboardRecords != null) {
                        strValueOf2 = "";
                    } else {
                        strValueOf2 = "";
                    }
                } else if (leaderboardRecords != null) {
                    strValueOf2 = "";
                } else {
                    strValueOf2 = "";
                }
            } else if (topRankPoints == null) {
                if (leaderboardRecords != null) {
                    strValueOf2 = "";
                } else {
                    strValueOf2 = "";
                }
            } else if (leaderboardRecords != null) {
                strValueOf2 = "";
            } else {
                strValueOf2 = "";
            }
            strP = c.p(strValueOf2, ",", "", false);
        }
        this.f.setValue(strP);
        return Unit.a;
    }
}
