package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.sporty.android.book.presentation.eventdetails.header.EventDetailHeaderUiModel;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Tournament;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes7.dex */
public final class sd20 {
    public final Context a;
    public final uqm b;

    public sd20(Context context, uqm uqmVar) {
        uqmVar.getClass();
        this.a = context;
        this.b = uqmVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    public final EventDetailHeaderUiModel a(Event event, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        int i;
        int i2;
        int i3;
        int i4;
        Tournament tournament;
        String str;
        event.getClass();
        long j = event.estimateStartTime;
        bwf0 bwf0Var = bwf0.a;
        String strB = bwf0Var.b(j);
        String strJ = bwf0.j(event.estimateStartTime, this.b.getLanguageCode());
        String strS = bwf0Var.s(event.estimateStartTime, false);
        boolean zEquals = TextUtils.equals(event.bookingStatus, "Booked");
        Category category = event.sport.category;
        boolean zContains = (category == null || (tournament = category.tournament) == null || (str = tournament.id) == null) ? false : kgb0.a.contains(str);
        ngs ngsVarB = a.b();
        String str2 = event.eventId;
        str2.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        Context context = this.a;
        if (!zIsEmpty && b3.S(str2)) {
            int iA = fug0.a(hug0.a, context);
            if (iA == 1) {
                i4 = R.drawable.ic_spr_live_virtual_sw;
            } else if (iA == 2) {
                i4 = R.drawable.ic_spr_live_virtual_es_mx;
            } else if (iA != 4) {
                i4 = iA != 5 ? R.drawable.ic_spr_live_virtual : R.drawable.ic_spr_live_virtual_fr_fr;
            } else {
                i4 = R.drawable.ic_spr_live_virtual_pt_mz;
            }
            ngsVarB.add(new au1(i4, false));
        }
        if (nkd0.a.a.a(event)) {
            int iA2 = fug0.a(hug0.a, context);
            if (iA2 == 0) {
                i3 = R.drawable.spr_sport_sim_label;
            } else if (iA2 == 1) {
                i3 = R.drawable.spr_sport_sim_label_sw;
            } else if (iA2 == 2) {
                i3 = R.drawable.spr_sport_sim_label_es_mx;
            } else if (iA2 == 3) {
                i3 = R.drawable.spr_sport_sim_label_pt_br;
            } else if (iA2 == 4) {
                i3 = R.drawable.spr_sport_sim_label;
            } else {
                if (iA2 != 5) {
                    uhc.a();
                    return null;
                }
                i3 = R.drawable.spr_sport_sim_label_fr_fr;
            }
            ngsVarB.add(new au1(i3, true));
        }
        if (event.topTeam) {
            int iA3 = fug0.a(hug0.a, context);
            if (iA3 == 0) {
                i2 = R.drawable.spr_sports_hot;
            } else if (iA3 == 1) {
                i2 = R.drawable.spr_sports_hot_sw;
            } else if (iA3 == 2 || iA3 == 3 || iA3 == 4) {
                i2 = R.drawable.spr_sports_hot_es_mx;
            } else {
                if (iA3 != 5) {
                    uhc.a();
                    return null;
                }
                i2 = R.drawable.spr_sports_hot_fr_fr;
            }
            ngsVarB.add(new au1(i2, true));
        }
        if (event.oddsBoost) {
            int iA4 = fug0.a(hug0.a, context);
            if (iA4 == 0) {
                i = R.drawable.spr_odds_boost;
            } else if (iA4 == 1) {
                i = R.drawable.spr_odds_boost_sw;
            } else if (iA4 == 2) {
                i = R.drawable.spr_odds_boost_es_mx;
            } else if (iA4 == 3) {
                i = R.drawable.spr_odds_boost_pt_br;
            } else if (iA4 == 4) {
                i = R.drawable.spr_odds_boost_pt_mz;
            } else {
                if (iA4 != 5) {
                    uhc.a();
                    return null;
                }
                i = R.drawable.spr_odds_boost_fr_fr;
            }
            ngsVarB.add(new au1(i, true));
        }
        ngs ngsVarA = a.a(ngsVarB);
        String strH = apg.h(event);
        String str3 = event.homeTeamName;
        str3.getClass();
        String str4 = event.awayTeamName;
        str4.getClass();
        String str5 = event.homeTeamId;
        String str6 = str5 == null ? "" : str5;
        String str7 = event.awayTeamId;
        String str8 = str7 == null ? "" : str7;
        String str9 = event.homeTeamIcon;
        String str10 = event.awayTeamIcon;
        ofb0 ofb0VarB = pfb0.b(event.sport.id);
        String str11 = event.gameId;
        return new EventDetailHeaderUiModel(ngsVarA, strH, str3, str4, str6, str8, z, str9, str10, ofb0VarB, strB, strJ, strS, str11 == null ? "" : str11, zEquals, event.hasLiveStream(), event.hasAudioStream(), zContains, z2, z3, z4, z5, event.hasGift(), z6);
    }
}
