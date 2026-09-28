package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sl90 extends pf implements gaj<fl90, hug0, v1b<? super sm90>, Object> {
    /* JADX WARN: Code duplicated, block: B:51:0x0126  */
    /* JADX WARN: Code duplicated, block: B:53:0x013e  */
    /* JADX WARN: Code duplicated, block: B:56:0x014c  */
    @Override // defpackage.gaj
    public final Object invoke(fl90 fl90Var, hug0 hug0Var, v1b<? super sm90> v1bVar) {
        gl90 gl90Var;
        pm90 pm90Var;
        yl90 wl90Var;
        yl90 yl90Var;
        UiText resourceUiText;
        int i;
        fl90 fl90Var2 = fl90Var;
        hug0 hug0Var2 = hug0Var;
        vl90 vl90Var = (vl90) this.a;
        gl90 gl90Var2 = null;
        if (fl90Var2 == null) {
            vl90Var.getClass();
            return null;
        }
        il90 il90Var = vl90Var.c;
        List<rq90> list = fl90Var2.b;
        list.getClass();
        hug0Var2.getClass();
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        Long lValueOf = null;
        for (rq90 rq90Var : list) {
            cd3.a aVar = cd3.b;
            String str = rq90Var.c;
            List<uq90> list2 = rq90Var.l;
            long j = rq90Var.g;
            aVar.getClass();
            cd3 cd3VarA = cd3.a.a(str);
            uq90 uq90Var = (uq90) CollectionsKt.firstOrNull(list2);
            boolean z = uq90Var != null ? uq90Var.f : false;
            if (lValueOf == null || !vjt.a(lValueOf.longValue(), j)) {
                bwf0 bwf0Var = bwf0.a;
                gl90Var = new gl90(bwf0Var.a(j), bwf0Var.v(j));
            } else {
                gl90Var = gl90Var2;
            }
            lValueOf = Long.valueOf(j);
            String str2 = rq90Var.a;
            UiText uiTextE = cd3VarA != null ? rqf0.e(cd3VarA, 1) : vch0.a;
            int i2 = R.color.bg_brand_sub_primary_d_base;
            if (z) {
                StringUiText stringUiText = vch0.a;
                pm90Var = new pm90(true, new ResourceUiText(R.string.bet_history__won), "ticket_cell_result_won_text", R.color.bg_brand_sub_primary_d_base);
            } else {
                StringUiText stringUiText2 = vch0.a;
                pm90Var = new pm90(false, new ResourceUiText(R.string.bet_history__lost), "ticket_cell_result_lost_text", R.color.text_secondary);
            }
            int i3 = cd3VarA == null ? -1 : il90.a.a[cd3VarA.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    yl90Var = null;
                } else {
                    int iOrdinal = hug0Var2.ordinal();
                    if (iOrdinal == 1) {
                        i = R.drawable.ic_one_bet_cut_sw;
                    } else if (iOrdinal != 2) {
                        i = iOrdinal != 3 ? R.drawable.ic_one_bet_cut : R.drawable.ic_one_bet_cut_pt_br;
                    } else {
                        i = R.drawable.ic_one_bet_cut_es_mx;
                    }
                    wl90Var = new xl90(i);
                }
                if (z) {
                    resourceUiText = new StringUiText(bjb0.P(p54.b(rq90Var.f).toString(), Locale.US));
                } else {
                    resourceUiText = new ResourceUiText(R.string.app_common__zero_point_zero);
                }
                UiText uiText = resourceUiText;
                if (!z) {
                    i2 = R.color.text_tertiary;
                }
                arrayList.add(new hl90(str2, gl90Var, uiTextE, pm90Var, yl90Var, uiText, i2, bjb0.P(p54.b(rq90Var.e).toString(), Locale.US), new ResourceUiText(R.string.bet_history__round_id_vid, ay0.S(new Object[]{rq90Var.b}))));
                gl90Var2 = null;
            } else {
                uq90 uq90Var2 = (uq90) CollectionsKt.firstOrNull(list2);
                wl90Var = uq90Var2 == null ? null : new wl90(new ResourceUiText(R.string.component_wap_share_bet__flex_your_bet_vmintowin_of_vsize, ay0.S(new Object[]{String.valueOf(rq90Var.o), String.valueOf(uq90Var2.g.size())})));
            }
            yl90Var = wl90Var;
            if (z) {
                resourceUiText = new StringUiText(bjb0.P(p54.b(rq90Var.f).toString(), Locale.US));
            } else {
                resourceUiText = new ResourceUiText(R.string.app_common__zero_point_zero);
            }
            UiText uiText2 = resourceUiText;
            if (!z) {
                i2 = R.color.text_tertiary;
            }
            arrayList.add(new hl90(str2, gl90Var, uiTextE, pm90Var, yl90Var, uiText2, i2, bjb0.P(p54.b(rq90Var.e).toString(), Locale.US), new ResourceUiText(R.string.bet_history__round_id_vid, ay0.S(new Object[]{rq90Var.b}))));
            gl90Var2 = null;
        }
        StringUiText stringUiText3 = vch0.a;
        return new sm90(new bt90(R.color.bg_inverse_tertiary_d_lighter, new ResourceUiText(R.string.common_functions__bet_history)), arrayList.isEmpty() ? pl90.a : new om90(arrayList));
    }
}
