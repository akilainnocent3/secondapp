package defpackage;

import com.sportygames.campaign.data.model.LeaderboardRecord;
import com.sportygames.campaign.data.model.TopRankPoint;
import com.sportygames.campaign.data.model.TournamentRankListResponse;
import com.sportygames.campaign.data.model.TournamentRankResponse;
import com.sportygames.campaign.data.model.TournamentStatsData;
import com.sportygames.campaign.data.model.UserPlayInfo;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
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
public final /* synthetic */ class reg0 implements Function1 {
    public final /* synthetic */ TournamentStatsData a;
    public final /* synthetic */ dq40 b;
    public final /* synthetic */ b5 c;
    public final /* synthetic */ ytw d;
    public final /* synthetic */ ytw e;
    public final /* synthetic */ ytw f;
    public final /* synthetic */ ytw i;

    public /* synthetic */ reg0(TournamentStatsData tournamentStatsData, dq40 dq40Var, b5 b5Var, ytw ytwVar, ytw ytwVar2, ytw ytwVar3, ytw ytwVar4) {
        this.a = tournamentStatsData;
        this.b = dq40Var;
        this.c = b5Var;
        this.d = ytwVar;
        this.e = ytwVar2;
        this.f = ytwVar3;
        this.i = ytwVar4;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0295  */
    /* JADX WARN: Code duplicated, block: B:141:0x029a  */
    /* JADX WARN: Code duplicated, block: B:145:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:147:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:148:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:151:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:152:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:155:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:162:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:165:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:221:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:256:0x0443  */
    /* JADX WARN: Code duplicated, block: B:266:0x0464 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:267:0x0466  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LeaderboardRecord leaderboardRecord;
        TournamentRankListResponse tournamentRankListResponse;
        String string;
        String str;
        Object next;
        Double prize;
        LeaderboardRecord leaderboardRecord2;
        Object next2;
        String str2;
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
        Double score;
        Double endPoints;
        String str3;
        Double score2;
        Double endPoints2;
        double dDoubleValue2;
        Double endPoints3;
        Double score3;
        Object next3;
        Double score4;
        Integer rank2;
        Double score5;
        String strValueOf2;
        T t;
        UserPlayInfo rankData;
        Double pointsScore;
        Double score6;
        Object next4;
        LeaderboardRecord leaderboardRecord3;
        TournamentRankListResponse tournamentRankListResponse2 = (TournamentRankListResponse) obj;
        tournamentRankListResponse2.getClass();
        List<LeaderboardRecord> leaderboardRecords2 = tournamentRankListResponse2.getLeaderboardRecords();
        b5 b5Var = this.c;
        if (leaderboardRecords2 != null) {
            Iterator<T> it = leaderboardRecords2.iterator();
            do {
                if (!it.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it.next();
                leaderboardRecord3 = (LeaderboardRecord) next4;
            } while (!Intrinsics.g(leaderboardRecord3 != null ? leaderboardRecord3.getPatronId() : null, b5Var.fetchPatronId()));
            leaderboardRecord = (LeaderboardRecord) next4;
        } else {
            leaderboardRecord = null;
        }
        ytw ytwVar = this.d;
        Integer intOrNull3 = StringsKt.toIntOrNull((String) ytwVar.getValue());
        int iIntValue3 = intOrNull3 != null ? intOrNull3.intValue() : 0;
        TournamentStatsData tournamentStatsData = this.a;
        boolean zJ = pfg0.j(iIntValue3, tournamentStatsData.getPrizeListMap());
        dq40 dq40Var = this.b;
        ytw ytwVar2 = this.e;
        ytw ytwVar3 = this.f;
        String strValueOf3 = "0.00";
        String str4 = "--";
        if (zJ) {
            if (leaderboardRecord != null) {
                tournamentRankListResponse = tournamentRankListResponse2;
                StringBuilder sb = new StringBuilder();
                sb.append(tournamentStatsData.getCurrency());
                sb.append(' ');
                Integer intOrNull4 = StringsKt.toIntOrNull((String) ytwVar.getValue());
                int iIntValue4 = intOrNull4 != null ? intOrNull4.intValue() : 0;
                List<LeaderboardRecord> leaderboardRecords3 = tournamentRankListResponse.getLeaderboardRecords();
                if (leaderboardRecords3 == null) {
                    leaderboardRecords3 = m2g.a;
                }
                leaderboardRecords3.getClass();
                b5Var.getClass();
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
                    } while (!Intrinsics.g(leaderboardRecord2 != null ? leaderboardRecord2.getPatronId() : null, b5Var.fetchPatronId()));
                    LeaderboardRecord leaderboardRecord4 = (LeaderboardRecord) next;
                    int i = rw.a;
                    string = rw.b(b5Var, rw.d((leaderboardRecord4 == null || (prize = leaderboardRecord4.getPrize()) == null) ? 0.0d : prize.doubleValue())).toString();
                }
                sb.append(string);
                ytwVar2.setValue(sb.toString());
                Double score7 = leaderboardRecord.getScore();
                if (score7 != null) {
                    try {
                        str4 = new DecimalFormat("0.00", b5Var.getDecimalFormatSymbols()).format(score7.doubleValue());
                        str4.getClass();
                        str = str4;
                    } catch (Exception unused) {
                        str = "0.00";
                    }
                } else {
                    str = str4;
                }
                ytwVar3.setValue(str);
            } else if (dq40Var.a != 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tournamentStatsData.getCurrency());
                sb2.append(' ');
                int i2 = rw.a;
                sb2.append(rw.a(b5Var, String.valueOf(((TournamentRankResponse) dq40Var.a).getPrize())));
                ytwVar2.setValue(sb2.toString());
                Double score8 = ((TournamentRankResponse) dq40Var.a).getScore();
                if (score8 == null || (strValueOf = String.valueOf(score8.doubleValue())) == null) {
                    strValueOf = "--";
                }
                ytwVar3.setValue(strValueOf);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(tournamentStatsData.getCurrency());
                sb3.append(' ');
                int i3 = rw.a;
                UserPlayInfo rankData2 = tournamentStatsData.getRankData();
                int iIntValue5 = (rankData2 == null || (rank = rankData2.getRank()) == null) ? 0 : rank.intValue();
                List<Pair<String, String>> prizeListMap = tournamentStatsData.getPrizeListMap();
                prizeListMap.getClass();
                Iterator<T> it3 = prizeListMap.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        tournamentRankListResponse = tournamentRankListResponse2;
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    String str5 = (String) ((Pair) next2).a;
                    List listSplit$default = StringsKt__StringsKt.split$default(str5, new String[]{"-"}, false, 0, 6, null);
                    tournamentRankListResponse = tournamentRankListResponse2;
                    if (listSplit$default.size() == 2) {
                        Integer intOrNull5 = StringsKt.toIntOrNull((String) listSplit$default.get(0));
                        int iIntValue6 = intOrNull5 != null ? intOrNull5.intValue() : 0;
                        Integer intOrNull6 = StringsKt.toIntOrNull((String) listSplit$default.get(1));
                        int iIntValue7 = intOrNull6 != null ? intOrNull6.intValue() : 0;
                        if (iIntValue6 <= iIntValue5 && iIntValue5 <= iIntValue7) {
                            break;
                        }
                        tournamentRankListResponse2 = tournamentRankListResponse;
                    } else {
                        Integer intOrNull7 = StringsKt.toIntOrNull(str5);
                        if ((intOrNull7 != null ? intOrNull7.intValue() : 0) == iIntValue5) {
                            break;
                        }
                        tournamentRankListResponse2 = tournamentRankListResponse;
                    }
                }
                Pair pair = (Pair) next2;
                if (pair == null || (str2 = (String) pair.b) == null) {
                    str2 = "--";
                }
                sb3.append(rw.a(b5Var, str2));
                ytwVar2.setValue(sb3.toString());
                UserPlayInfo rankData3 = tournamentStatsData.getRankData();
                String strA = rw.a(b5Var, String.valueOf(rankData3 != null ? rankData3.getPointsScore() : null));
                if (strA == null) {
                    strA = "--";
                }
                ytwVar3.setValue(strA);
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
                dH = b.h((String) ytwVar3.getValue());
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
                    int i4 = iIntValue2 - 1;
                    if (i4 <= 0) {
                        strValueOf3 = "";
                    } else {
                        try {
                            if (pfg0.j(iIntValue2, prizeListMap2)) {
                                if (iIntValue2 <= 10) {
                                    Iterator<T> it4 = leaderboardRecords.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            next3 = null;
                                            break;
                                        }
                                        next3 = it4.next();
                                        LeaderboardRecord leaderboardRecord5 = (LeaderboardRecord) next3;
                                        if (leaderboardRecord5 != null && (rank2 = leaderboardRecord5.getRank()) != null && rank2.intValue() == i4) {
                                            break;
                                        }
                                    }
                                    LeaderboardRecord leaderboardRecord6 = (LeaderboardRecord) next3;
                                    double dDoubleValue3 = ((leaderboardRecord6 == null || (score4 = leaderboardRecord6.getScore()) == null) ? 0.0d : score4.doubleValue()) - dDoubleValue;
                                    b5Var.getClass();
                                    str3 = new DecimalFormat("0.00", b5Var.getDecimalFormatSymbols()).format(dDoubleValue3);
                                    str3.getClass();
                                } else {
                                    Integer num = pfg0.l(iIntValue2, topRankPoints).a;
                                    if ((num != null ? num.intValue() : 0) <= 0) {
                                        num = 0;
                                    }
                                    if (num != null && num.intValue() == 0) {
                                        LeaderboardRecord leaderboardRecord7 = (LeaderboardRecord) CollectionsKt.b0(leaderboardRecords);
                                        double dDoubleValue4 = ((leaderboardRecord7 == null || (score3 = leaderboardRecord7.getScore()) == null) ? 0.0d : score3.doubleValue()) - dDoubleValue;
                                        b5Var.getClass();
                                        str3 = new DecimalFormat("0.00", b5Var.getDecimalFormatSymbols()).format(dDoubleValue4);
                                        str3.getClass();
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
                                            strValueOf3 = "";
                                        } else {
                                            double d = dDoubleValue2 - dDoubleValue;
                                            b5Var.getClass();
                                            str3 = new DecimalFormat("0.00", b5Var.getDecimalFormatSymbols()).format(d);
                                            str3.getClass();
                                        }
                                    }
                                }
                                strValueOf3 = str3;
                            } else {
                                if (topRankPoints != null && !topRankPoints.isEmpty()) {
                                    TopRankPoint topRankPoint2 = (TopRankPoint) CollectionsKt.b0(topRankPoints);
                                    double dDoubleValue5 = ((topRankPoint2 == null || (endPoints2 = topRankPoint2.getEndPoints()) == null) ? 0.0d : endPoints2.doubleValue()) - dDoubleValue;
                                    b5Var.getClass();
                                    str3 = new DecimalFormat("0.00", b5Var.getDecimalFormatSymbols()).format(dDoubleValue5);
                                    str3.getClass();
                                } else if (leaderboardRecords == null || leaderboardRecords.isEmpty()) {
                                    strValueOf3 = "";
                                } else {
                                    LeaderboardRecord leaderboardRecord8 = (LeaderboardRecord) CollectionsKt.b0(leaderboardRecords);
                                    double dDoubleValue6 = ((leaderboardRecord8 == null || (score2 = leaderboardRecord8.getScore()) == null) ? 0.0d : score2.doubleValue()) - dDoubleValue;
                                    b5Var.getClass();
                                    str3 = new DecimalFormat("0.00", b5Var.getDecimalFormatSymbols()).format(dDoubleValue6);
                                    str3.getClass();
                                }
                                strValueOf3 = str3;
                            }
                        } catch (Exception unused2) {
                        }
                    }
                } else if (topRankPoints == null && !topRankPoints.isEmpty()) {
                    TopRankPoint topRankPoint3 = (TopRankPoint) CollectionsKt.b0(topRankPoints);
                    strValueOf3 = String.valueOf((topRankPoint3 == null || (endPoints = topRankPoint3.getEndPoints()) == null) ? 0.0d : endPoints.doubleValue());
                } else if (leaderboardRecords != null || leaderboardRecords.isEmpty()) {
                    strValueOf3 = "";
                } else {
                    LeaderboardRecord leaderboardRecord9 = (LeaderboardRecord) CollectionsKt.b0(leaderboardRecords);
                    strValueOf3 = String.valueOf((leaderboardRecord9 == null || (score = leaderboardRecord9.getScore()) == null) ? 0.0d : score.doubleValue());
                }
                strP = c.p(strValueOf3, ",", "", false);
            }
            this.i.setValue(strP);
            return Unit.a;
        }
        ytwVar2.setValue(tournamentStatsData.getCurrency() + " --");
        if (leaderboardRecord != null ? (score5 = leaderboardRecord.getScore()) == null || (strValueOf2 = String.valueOf(score5.doubleValue())) == null : (t = dq40Var.a) == 0 ? (rankData = tournamentStatsData.getRankData()) == null || (pointsScore = rankData.getPointsScore()) == null || (strValueOf2 = String.valueOf(pointsScore.doubleValue())) == null : (score6 = ((TournamentRankResponse) t).getScore()) == null || (strValueOf2 = String.valueOf(score6.doubleValue())) == null) {
            strValueOf2 = "--";
        }
        ytwVar3.setValue(strValueOf2);
        tournamentRankListResponse = tournamentRankListResponse2;
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
            dH = b.h((String) ytwVar3.getValue());
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
                        strValueOf3 = "";
                    } else {
                        strValueOf3 = "";
                    }
                } else if (leaderboardRecords != null) {
                    strValueOf3 = "";
                } else {
                    strValueOf3 = "";
                }
            } else if (topRankPoints == null) {
                if (leaderboardRecords != null) {
                    strValueOf3 = "";
                } else {
                    strValueOf3 = "";
                }
            } else if (leaderboardRecords != null) {
                strValueOf3 = "";
            } else {
                strValueOf3 = "";
            }
            strP = c.p(strValueOf3, ",", "", false);
        }
        this.i.setValue(strP);
        return Unit.a;
    }
}
