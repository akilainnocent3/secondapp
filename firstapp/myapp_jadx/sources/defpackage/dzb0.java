package defpackage;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.e;
import androidx.transition.nfj.CaBJCMnsV;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.EligibilityCriteria;
import com.sportygames.commons.models.PrizeInfo;
import com.sportygames.commons.models.TournamentConfigVO;
import com.sportygames.commons.models.UserPlayInfo;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dzb0 implements Function1 {
    public final /* synthetic */ q1c0 a;
    public final /* synthetic */ e b;

    public /* synthetic */ dzb0(q1c0 q1c0Var, e eVar) {
        this.a = q1c0Var;
        this.b = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:189:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:192:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:193:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:195:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:206:0x031b  */
    /* JADX WARN: Code duplicated, block: B:208:0x0322  */
    /* JADX WARN: Code duplicated, block: B:225:0x0357  */
    /* JADX WARN: Code duplicated, block: B:228:0x037e  */
    /* JADX WARN: Code duplicated, block: B:229:0x0381  */
    /* JADX WARN: Code duplicated, block: B:232:0x038b  */
    /* JADX WARN: Code duplicated, block: B:233:0x038e  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object next;
        String currency;
        String startTime;
        String name;
        List<PrizeInfo> prizeInfo;
        e eVar;
        UserPlayInfo userPlayInfo;
        Long id;
        EligibilityCriteria eligibilityCriteria;
        String str;
        String string;
        TournamentConfigVO tournamentConfigVO;
        String startTime2;
        String str2;
        String str3;
        String str4;
        TournamentConfigVO tournamentConfigVO2;
        String str5;
        String str6;
        String string2;
        String str7;
        String str8;
        List<PrizeInfo> prizeInfo2;
        PrizeInfo prizeInfo3;
        Double prize;
        String str9;
        Double minimumThreshold;
        Double minimumStakeCriteria;
        Object next2;
        Long id2;
        String str10;
        String str11;
        String str12;
        List<PrizeInfo> prizeInfo4;
        Double minimumThreshold2;
        List<PrizeInfo> prizeInfo5;
        PrizeInfo prizeInfo6;
        Double prize2;
        Double minimumStakeCriteria2;
        Long id3;
        String name2;
        List<EligibilityCriteria> eligibilityCriteria2;
        Double totalPrize;
        long jLongValue = ((Long) obj).longValue();
        q1c0 q1c0Var = this.a;
        Iterator<T> it = q1c0Var.c2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Long id4 = ((TournamentConfigVO) next).getId();
            if (id4 != null && id4.longValue() == jLongValue) {
                break;
            }
        }
        q1c0Var.f2 = (TournamentConfigVO) next;
        Iterator<TournamentConfigVO> it2 = q1c0Var.c2.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            Long id5 = it2.next().getId();
            if (id5 != null && id5.longValue() == jLongValue) {
                break;
            }
            i++;
        }
        TournamentConfigVO tournamentConfigVO3 = q1c0Var.f2;
        double dDoubleValue = (tournamentConfigVO3 == null || (totalPrize = tournamentConfigVO3.getTotalPrize()) == null) ? 0.0d : totalPrize.doubleValue();
        op5 op5Var = op5.a;
        TournamentConfigVO tournamentConfigVO4 = q1c0Var.f2;
        if (tournamentConfigVO4 == null || (currency = tournamentConfigVO4.getCurrency()) == null) {
            currency = "";
        }
        op5Var.getClass();
        String strI = op5.i(currency);
        TournamentConfigVO tournamentConfigVO5 = q1c0Var.f2;
        EligibilityCriteria eligibilityCriteria3 = (tournamentConfigVO5 == null || (eligibilityCriteria2 = tournamentConfigVO5.getEligibilityCriteria()) == null) ? null : (EligibilityCriteria) CollectionsKt.firstOrNull(eligibilityCriteria2);
        TournamentConfigVO tournamentConfigVO6 = q1c0Var.f2;
        if (tournamentConfigVO6 == null || (startTime = tournamentConfigVO6.getStartTime()) == null) {
            startTime = "";
        }
        boolean zA = k94.a(startTime);
        TournamentConfigVO tournamentConfigVO7 = q1c0Var.f2;
        e eVar2 = this.b;
        long jLongValue2 = 0;
        if (zA) {
            if (tournamentConfigVO7 == null || (name = tournamentConfigVO7.getName()) == null) {
                name = "";
            }
            TournamentConfigVO tournamentConfigVO8 = q1c0Var.f2;
            long jLongValue3 = (tournamentConfigVO8 == null || (id2 = tournamentConfigVO8.getId()) == null) ? 0L : id2.longValue();
            TournamentConfigVO tournamentConfigVO9 = q1c0Var.f2;
            String currency2 = tournamentConfigVO9 != null ? tournamentConfigVO9.getCurrency() : null;
            if (currency2 == null) {
                currency2 = "";
            }
            String strI2 = op5.i(currency2);
            TreeMap treeMap = pw.a;
            String string3 = pw.c(pw.n(dDoubleValue)).toString();
            TournamentConfigVO tournamentConfigVO10 = q1c0Var.f2;
            String endTime = tournamentConfigVO10 != null ? tournamentConfigVO10.getEndTime() : null;
            if (endTime == null) {
                endTime = "";
            }
            TournamentConfigVO tournamentConfigVO11 = q1c0Var.f2;
            if (tournamentConfigVO11 == null || (prizeInfo = tournamentConfigVO11.getPrizeInfo()) == null) {
                prizeInfo = m2g.a;
            }
            List<UserPlayInfo> list = q1c0Var.d2;
            if (list != null) {
                Iterator<T> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        eVar = eVar2;
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    Long tournamentId = ((UserPlayInfo) next2).getTournamentId();
                    eVar = eVar2;
                    TournamentConfigVO tournamentConfigVO12 = q1c0Var.f2;
                    if (Intrinsics.g(tournamentId, tournamentConfigVO12 != null ? tournamentConfigVO12.getId() : null)) {
                        break;
                    }
                    eVar2 = eVar;
                }
                UserPlayInfo userPlayInfo2 = (UserPlayInfo) next2;
                if (userPlayInfo2 != null) {
                    userPlayInfo = userPlayInfo2;
                }
                TreeMap treeMap2 = pw.a;
                if (eligibilityCriteria3 != null || (minimumStakeCriteria = eligibilityCriteria3.getMinimumStakeCriteria()) == null) {
                    eligibilityCriteria = eligibilityCriteria3;
                    str = null;
                } else {
                    try {
                        eligibilityCriteria = eligibilityCriteria3;
                        try {
                            str = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(minimumStakeCriteria.doubleValue());
                            str.getClass();
                        } catch (Exception unused) {
                            str = "0.00";
                        }
                    } catch (Exception unused2) {
                        eligibilityCriteria = eligibilityCriteria3;
                    }
                }
                string = pw.c(str).toString();
                tournamentConfigVO = q1c0Var.f2;
                if (tournamentConfigVO != null) {
                    startTime2 = tournamentConfigVO.getStartTime();
                } else {
                    startTime2 = null;
                }
                if (startTime2 == null) {
                    startTime2 = "";
                }
                if (eligibilityCriteria != null || (minimumThreshold = eligibilityCriteria.getMinimumThreshold()) == null) {
                    str2 = string;
                    str3 = "";
                    str4 = null;
                } else {
                    str2 = string;
                    try {
                        str3 = "";
                        try {
                            str4 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(minimumThreshold.doubleValue());
                            str4.getClass();
                        } catch (Exception unused3) {
                            str4 = "0.00";
                        }
                    } catch (Exception unused4) {
                        str3 = "";
                    }
                }
                if (str4 == null) {
                    str4 = str3;
                }
                tournamentConfigVO2 = q1c0Var.f2;
                if (tournamentConfigVO2 != null || (prizeInfo2 = tournamentConfigVO2.getPrizeInfo()) == null || (prizeInfo3 = (PrizeInfo) CollectionsKt.firstOrNull(prizeInfo2)) == null || (prize = prizeInfo3.getPrize()) == null) {
                    str5 = "tournament_tnc_clicked";
                    str6 = null;
                } else {
                    try {
                        str5 = "tournament_tnc_clicked";
                        try {
                            str9 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(prize.doubleValue());
                            str9.getClass();
                        } catch (Exception unused5) {
                            str9 = "0.00";
                        }
                    } catch (Exception unused6) {
                        str5 = "tournament_tnc_clicked";
                    }
                    str6 = str9;
                }
                string2 = pw.c(str6).toString();
                string3.getClass();
                prizeInfo.getClass();
                wcg0 wcg0Var = new wcg0();
                wcg0Var.b = jLongValue3;
                wcg0Var.c = name;
                wcg0Var.d = strI2;
                wcg0Var.e = string3;
                wcg0Var.f = endTime;
                wcg0Var.z = prizeInfo;
                wcg0Var.A = userPlayInfo;
                if (str2 == null) {
                    str7 = str3;
                } else {
                    str7 = str2;
                }
                wcg0Var.i = str7;
                wcg0Var.v = startTime2;
                wcg0Var.w = str4;
                if (string2 == null) {
                    str8 = str3;
                } else {
                    str8 = string2;
                }
                wcg0Var.y = str8;
                FragmentManager supportFragmentManager = eVar.getSupportFragmentManager();
                supportFragmentManager.getClass();
                a aVar = new a(supportFragmentManager);
                aVar.f(R.id.flContent, wcg0Var, CaBJCMnsV.KIKB);
                aVar.c(jq40.a(wcg0.class).k());
                aVar.d();
                q1c0Var.P1("tournament_bottom_sheet_view", true);
                q1c0Var.Q1("tournament_leaderboard_viewed", String.valueOf(i));
                q1c0Var.P1(str5, true);
            } else {
                eVar = eVar2;
            }
            TournamentConfigVO tournamentConfigVO13 = q1c0Var.f2;
            if (tournamentConfigVO13 != null && (id = tournamentConfigVO13.getId()) != null) {
                jLongValue2 = id.longValue();
            }
            userPlayInfo = new UserPlayInfo(Long.valueOf(jLongValue2), 0, Double.valueOf(0.0d));
            TreeMap treeMap3 = pw.a;
            if (eligibilityCriteria3 != null) {
                eligibilityCriteria = eligibilityCriteria3;
                str = null;
            } else {
                eligibilityCriteria = eligibilityCriteria3;
                str = null;
            }
            string = pw.c(str).toString();
            tournamentConfigVO = q1c0Var.f2;
            if (tournamentConfigVO != null) {
                startTime2 = tournamentConfigVO.getStartTime();
            } else {
                startTime2 = null;
            }
            if (startTime2 == null) {
                startTime2 = "";
            }
            if (eligibilityCriteria != null) {
                str2 = string;
                str3 = "";
                str4 = null;
            } else {
                str2 = string;
                str3 = "";
                str4 = null;
            }
            if (str4 == null) {
                str4 = str3;
            }
            tournamentConfigVO2 = q1c0Var.f2;
            if (tournamentConfigVO2 != null) {
                str5 = "tournament_tnc_clicked";
                str6 = null;
            } else {
                str5 = "tournament_tnc_clicked";
                str6 = null;
            }
            string2 = pw.c(str6).toString();
            string3.getClass();
            prizeInfo.getClass();
            wcg0 wcg0Var2 = new wcg0();
            wcg0Var2.b = jLongValue3;
            wcg0Var2.c = name;
            wcg0Var2.d = strI2;
            wcg0Var2.e = string3;
            wcg0Var2.f = endTime;
            wcg0Var2.z = prizeInfo;
            wcg0Var2.A = userPlayInfo;
            if (str2 == null) {
                str7 = str3;
            } else {
                str7 = str2;
            }
            wcg0Var2.i = str7;
            wcg0Var2.v = startTime2;
            wcg0Var2.w = str4;
            if (string2 == null) {
                str8 = str3;
            } else {
                str8 = string2;
            }
            wcg0Var2.y = str8;
            FragmentManager supportFragmentManager2 = eVar.getSupportFragmentManager();
            supportFragmentManager2.getClass();
            a aVar2 = new a(supportFragmentManager2);
            aVar2.f(R.id.flContent, wcg0Var2, CaBJCMnsV.KIKB);
            aVar2.c(jq40.a(wcg0.class).k());
            aVar2.d();
            q1c0Var.P1("tournament_bottom_sheet_view", true);
            q1c0Var.Q1("tournament_leaderboard_viewed", String.valueOf(i));
            q1c0Var.P1(str5, true);
        } else {
            String str13 = (tournamentConfigVO7 == null || (name2 = tournamentConfigVO7.getName()) == null) ? "" : name2;
            TreeMap treeMap4 = pw.a;
            String strA = tug.a(strI, " ", pw.c(pw.n(dDoubleValue)));
            TournamentConfigVO tournamentConfigVO14 = q1c0Var.f2;
            if (tournamentConfigVO14 != null && (id3 = tournamentConfigVO14.getId()) != null) {
                jLongValue2 = id3.longValue();
            }
            TournamentConfigVO tournamentConfigVO15 = q1c0Var.f2;
            String strValueOf = String.valueOf(tournamentConfigVO15 != null ? tournamentConfigVO15.getMaxParticipants() : null);
            if (eligibilityCriteria3 == null || (minimumStakeCriteria2 = eligibilityCriteria3.getMinimumStakeCriteria()) == null) {
                str10 = null;
            } else {
                try {
                    str10 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(minimumStakeCriteria2.doubleValue());
                    str10.getClass();
                } catch (Exception unused7) {
                    str10 = "0.00";
                }
            }
            String string4 = pw.c(str10).toString();
            TournamentConfigVO tournamentConfigVO16 = q1c0Var.f2;
            String startTime3 = tournamentConfigVO16 != null ? tournamentConfigVO16.getStartTime() : null;
            String str14 = startTime3 == null ? "" : startTime3;
            String string5 = pw.c(pw.n(dDoubleValue)).toString();
            TournamentConfigVO tournamentConfigVO17 = q1c0Var.f2;
            String startTime4 = tournamentConfigVO17 != null ? tournamentConfigVO17.getStartTime() : null;
            String str15 = startTime4 == null ? "" : startTime4;
            TournamentConfigVO tournamentConfigVO18 = q1c0Var.f2;
            String endTime2 = tournamentConfigVO18 != null ? tournamentConfigVO18.getEndTime() : null;
            String str16 = endTime2 == null ? "" : endTime2;
            TournamentConfigVO tournamentConfigVO19 = q1c0Var.f2;
            if (tournamentConfigVO19 == null || (prizeInfo5 = tournamentConfigVO19.getPrizeInfo()) == null || (prizeInfo6 = (PrizeInfo) CollectionsKt.firstOrNull(prizeInfo5)) == null || (prize2 = prizeInfo6.getPrize()) == null) {
                str11 = null;
            } else {
                try {
                    str11 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(prize2.doubleValue());
                    str11.getClass();
                } catch (Exception unused8) {
                    str11 = "0.00";
                }
            }
            String string6 = pw.c(str11).toString();
            if (eligibilityCriteria3 == null || (minimumThreshold2 = eligibilityCriteria3.getMinimumThreshold()) == null) {
                str12 = null;
            } else {
                try {
                    str12 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(minimumThreshold2.doubleValue());
                    str12.getClass();
                } catch (Exception unused9) {
                    str12 = "0.00";
                }
            }
            String str17 = str12 == null ? "" : str12;
            TournamentConfigVO tournamentConfigVO20 = q1c0Var.f2;
            if (tournamentConfigVO20 == null || (prizeInfo4 = tournamentConfigVO20.getPrizeInfo()) == null) {
                prizeInfo4 = m2g.a;
            }
            w6g0 w6g0VarA = w6g0.a.a(str13, strA, jLongValue2, false, strValueOf, string4, str14, strI, string5, str15, str16, string6, str17, prizeInfo4, new w6v(1), new szb0());
            FragmentManager supportFragmentManager3 = eVar2.getSupportFragmentManager();
            supportFragmentManager3.getClass();
            a aVar3 = new a(supportFragmentManager3);
            aVar3.f(R.id.flContent, w6g0VarA, "TournamentJoinConfirmFragment");
            aVar3.c(jq40.a(w6g0.class).k());
            aVar3.d();
            q1c0Var.P1("tournament_tnc_clicked", true);
        }
        return Unit.a;
    }
}
