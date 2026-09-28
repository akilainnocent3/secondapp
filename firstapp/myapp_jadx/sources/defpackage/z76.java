package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z76 {
    public static final x66<y370> A;
    public static final ArrayList a = new ArrayList();
    public static final x66<hrm> b;
    public static final x66<i4j0> c;
    public static final x66<i4j0> d;
    public static final x66<i4j0> e;
    public static final x66<i4j0> f;
    public static final x66<i4j0> g;
    public static final x66<i4j0> h;
    public static final x66<i4j0> i;
    public static final x66<ie00> j;
    public static final x66<sa20> k;
    public static final x66<tbc0> l;
    public static final x66<ftm> m;
    public static final x66<js40> n;
    public static final x66<q85> o;
    public static final LinkedHashMap p;
    public static final x66<xdl> q;
    public static final x66<m0e> r;
    public static final x66<rsy> s;
    public static final x66<etm> t;
    public static final x66<ic40> u;
    public static final x66<w75> v;
    public static final x66<nfj0> w;
    public static final x66<rki0> x;
    public static final x66<rki0> y;
    public static final x66<xcj> z;

    public static x66 a(String str) {
        Object next;
        str.getClass();
        Iterator it = CollectionsKt.A0(a).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.g(((x66) next).a, str)) {
                return (x66) next;
            }
        }
        next = null;
        return (x66) next;
    }

    public static x66 b(String str, List list, Class cls) {
        str.getClass();
        list.getClass();
        x66 x66Var = new x66(str, list, cls);
        ArrayList arrayList = a;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (Intrinsics.g(((x66) obj).a, str)) {
                    kb5.a(tug.a("Campaign code '", str, "' is already registered."));
                    return null;
                }
            }
        }
        arrayList.add(x66Var);
        return x66Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        b("v2_test_winner_variant", a.c("winner_variant_event"), ddf0.class);
        b("message_an_test", a.c("message_click"), rnv.class);
        b = b("ib_default_stake_ng", b.k("place_bet_conversion", "total_stake"), hrm.class);
        c = b("welcome_reward_za_android", a.c("click_to_deposit"), i4j0.class);
        d = b(oLsIjJCWb.UuEYXLvQLoprtEn, a.c("click_to_deposit"), i4j0.class);
        e = b("ftd_floating_ke_android", a.c("click_to_deposit"), i4j0.class);
        f = b("ftd_floating_za_android", a.c("click_to_deposit"), i4j0.class);
        g = b("ftd_story_gh_android", a.c("click_to_deposit"), i4j0.class);
        h = b("ftd_story_ke_android", a.c("click_to_deposit"), i4j0.class);
        i = b("ftd_story_za_android", a.c("click_to_deposit"), i4j0.class);
        j = b("android_pers_feature_code_tier_5", a.c(AnalyticsParam.BETSLIP_ADD_CODE), ie00.class);
        k = b("pre_match_detail_code_list", a.c("add_to_betslip"), sa20.class);
        l = b("sl_combo_single_bet_flow_android", b.k("selection_count_place_bet", "stake_per_user"), tbc0.class);
        b("sp_game_promo_popup", b.k("sp_user_amount", "if_stake_per_user"), n7n.class);
        m = b("if_kick_off_completion_android", b.k("if__kickoff_group_a__click", "if__kickoff_group_b__click", "if__kickoff_group_c__click", "if__place_bet__click"), ftm.class);
        n = b("za_reg_success_sheet_android", b.k("click_to_deposit", "cta_click"), js40.class);
        o = b("br_club_discoverability_android", b.k("mission_activated", "deposit_started"), q85.class);
        List<Pair> listK = b.k(new Pair(CountryCodeName.KENYA, "payday_ke"), new Pair(CountryCodeName.SOUTH_AFRICA, "payday_za"));
        int iA = jpu.a(l48.r(listK, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Pair pair : listK) {
            linkedHashMap.put((CountryCodeName) pair.a, b((String) pair.b, b.k("payday_modal_shown", "payday_modal_cta_click", "payday_deposit_started"), q500.class));
        }
        p = linkedHashMap;
        q = b("main_thread_watchdog_android", m2g.a, xdl.class);
        r = b("za_deposit_lobby_android", b.k("click_to_deposit", "channel_click"), m0e.class);
        s = b("one_up_label_ng_android", a.c("one_up_bet_placed"), rsy.class);
        t = b("if_recommended_selection", b.k("add_selection_to_betslip_cr", "add_recommendation_to_betslip"), etm.class);
        u = b("rebet_remix_bet_merge_test_android", b.k("two_step_place_bet_conversion_rate", "three_step_completion_time"), ic40.class);
        w75.b.getClass();
        v = b("br_deposit_hot_button", w75.c, w75.class);
        w = b("winning_popup_remix_bet_android_v1", a.c("post_bet_add_to_betslip"), nfj0.class);
        x = b("sporty_penalty_renaming", a.c("click_rate"), rki0.class);
        y = b("sporty_legends_renaming", a.c("click_rate"), rki0.class);
        z = b("gh_310_popup_android", a.c("cta_click"), xcj.class);
        A = b("sf_matchday_default_display", b.k("bet_conversion_rate", "bets_per_user"), y370.class);
    }
}
