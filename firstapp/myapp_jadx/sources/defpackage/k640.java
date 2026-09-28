package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.bethistory.data.db.entity.RealBetHistoryOrderEntity;
import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;
import com.sportybet.plugin.realsports.data.RSelection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class k640 extends xbs<a740> {
    public final /* synthetic */ i640 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k640(bw50 bw50Var, i640 i640Var, lv50 lv50Var, String[] strArr) {
        super(bw50Var, lv50Var, strArr);
        this.e = i640Var;
    }

    @Override // defpackage.xbs
    public final Object e(final bw50 bw50Var, int i, v1b<? super List<? extends a740>> v1bVar) {
        final i640 i640Var = this.e;
        return qlc.c(v1bVar, i640Var.a, new Function1() { // from class: j640
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                Boolean boolValueOf;
                Boolean boolValueOf2;
                Boolean boolValueOf3;
                Boolean boolValueOf4;
                i640 i640Var2 = i640Var;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                bw50 bw50Var2 = bw50Var;
                hq60 hq60VarH1 = vp60Var.H1(bw50Var2.a);
                bw50Var2.b.invoke(hq60VarH1);
                try {
                    int iB = l0b.b(hq60VarH1, AnalyticsParam.SOCIAL_ORDER_ID);
                    int iB2 = l0b.b(hq60VarH1, AnalyticsParam.EVENT_PARAM_USER_ID);
                    int iB3 = l0b.b(hq60VarH1, "order_type");
                    int iB4 = l0b.b(hq60VarH1, "share_code");
                    int iB5 = l0b.b(hq60VarH1, "currency");
                    int iB6 = l0b.b(hq60VarH1, "total_stake");
                    int iB7 = l0b.b(hq60VarH1, "winning_status");
                    int iB8 = l0b.b(hq60VarH1, "total_winnings");
                    int iB9 = l0b.b(hq60VarH1, "create_time");
                    int iB10 = l0b.b(hq60VarH1, "selections");
                    int iB11 = l0b.b(hq60VarH1, "combination_size");
                    int iB12 = l0b.b(hq60VarH1, "min_to_win");
                    int iB13 = l0b.b(hq60VarH1, "selection_size");
                    int iB14 = l0b.b(hq60VarH1, "odds_boosted");
                    int iB15 = l0b.b(hq60VarH1, "odds_lfb_boosted");
                    int iB16 = l0b.b(hq60VarH1, "feature_tags");
                    int iB17 = l0b.b(hq60VarH1, "is_editable");
                    int iB18 = l0b.b(hq60VarH1, "bet_ids");
                    int iB19 = l0b.b(hq60VarH1, "is_one_cut_win");
                    int iB20 = l0b.b(hq60VarH1, "is_bulk_delete_performing");
                    int iB21 = l0b.b(hq60VarH1, "remix_bet_enabled");
                    int iB22 = l0b.b(hq60VarH1, "show_remix_bet_red_dot");
                    int iB23 = l0b.b(hq60VarH1, "is_selected_for_bulk_delete");
                    int iB24 = l0b.b(hq60VarH1, "user_note");
                    int iB25 = l0b.b(hq60VarH1, "is_payment_in_progress");
                    int iB26 = l0b.b(hq60VarH1, "has_pending_event");
                    int iB27 = l0b.b(hq60VarH1, oLsIjJCWb.AWwYF);
                    int i2 = iB13;
                    ArrayList arrayList = new ArrayList();
                    while (hq60VarH1.D1()) {
                        Boolean boolValueOf5 = null;
                        Long lValueOf = hq60VarH1.isNull(iB27) ? null : Long.valueOf(hq60VarH1.getLong(iB27));
                        String strK1 = hq60VarH1.k1(iB);
                        String strK2 = hq60VarH1.isNull(iB2) ? null : hq60VarH1.k1(iB2);
                        Integer numValueOf = hq60VarH1.isNull(iB3) ? null : Integer.valueOf((int) hq60VarH1.getLong(iB3));
                        String strK3 = hq60VarH1.isNull(iB4) ? null : hq60VarH1.k1(iB4);
                        String strK4 = hq60VarH1.isNull(iB5) ? null : hq60VarH1.k1(iB5);
                        String strK5 = hq60VarH1.isNull(iB6) ? null : hq60VarH1.k1(iB6);
                        Integer numValueOf2 = hq60VarH1.isNull(iB7) ? null : Integer.valueOf((int) hq60VarH1.getLong(iB7));
                        String strK6 = hq60VarH1.isNull(iB8) ? null : hq60VarH1.k1(iB8);
                        Long lValueOf2 = hq60VarH1.isNull(iB9) ? null : Long.valueOf(hq60VarH1.getLong(iB9));
                        List<RSelection> listB = i640Var2.c.b(hq60VarH1.isNull(iB10) ? null : hq60VarH1.k1(iB10));
                        Integer numValueOf3 = hq60VarH1.isNull(iB11) ? null : Integer.valueOf((int) hq60VarH1.getLong(iB11));
                        Integer numValueOf4 = hq60VarH1.isNull(iB12) ? null : Integer.valueOf((int) hq60VarH1.getLong(iB12));
                        int i3 = i2;
                        Integer numValueOf5 = hq60VarH1.isNull(i3) ? null : Integer.valueOf((int) hq60VarH1.getLong(i3));
                        int i4 = iB14;
                        Integer numValueOf6 = hq60VarH1.isNull(i4) ? null : Integer.valueOf((int) hq60VarH1.getLong(i4));
                        if (numValueOf6 != null) {
                            boolValueOf = Boolean.valueOf(numValueOf6.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        int i5 = iB15;
                        Integer numValueOf7 = hq60VarH1.isNull(i5) ? null : Integer.valueOf((int) hq60VarH1.getLong(i5));
                        if (numValueOf7 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf7.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        int i6 = iB16;
                        List<Integer> listA = i640Var2.d.a(hq60VarH1.isNull(i6) ? null : hq60VarH1.k1(i6));
                        int i7 = iB17;
                        Integer numValueOf8 = hq60VarH1.isNull(i7) ? null : Integer.valueOf((int) hq60VarH1.getLong(i7));
                        if (numValueOf8 != null) {
                            boolValueOf3 = Boolean.valueOf(numValueOf8.intValue() != 0);
                        } else {
                            boolValueOf3 = null;
                        }
                        int i8 = iB18;
                        List<String> listA2 = i640Var2.e.a(hq60VarH1.isNull(i8) ? null : hq60VarH1.k1(i8));
                        int i9 = iB19;
                        Integer numValueOf9 = hq60VarH1.isNull(i9) ? null : Integer.valueOf((int) hq60VarH1.getLong(i9));
                        if (numValueOf9 != null) {
                            boolValueOf4 = Boolean.valueOf(numValueOf9.intValue() != 0);
                        } else {
                            boolValueOf4 = null;
                        }
                        i640 i640Var3 = i640Var2;
                        int i10 = iB20;
                        boolean z = ((int) hq60VarH1.getLong(i10)) != 0;
                        int i11 = iB21;
                        boolean z2 = ((int) hq60VarH1.getLong(i11)) != 0;
                        int i12 = iB22;
                        boolean z3 = ((int) hq60VarH1.getLong(i12)) != 0;
                        int i13 = iB23;
                        boolean z4 = ((int) hq60VarH1.getLong(i13)) != 0;
                        int i14 = iB24;
                        String strK7 = hq60VarH1.isNull(i14) ? null : hq60VarH1.k1(i14);
                        int i15 = iB25;
                        boolean z5 = ((int) hq60VarH1.getLong(i15)) != 0;
                        int i16 = iB26;
                        Integer numValueOf10 = hq60VarH1.isNull(i16) ? null : Integer.valueOf((int) hq60VarH1.getLong(i16));
                        if (numValueOf10 != null) {
                            boolValueOf5 = Boolean.valueOf(numValueOf10.intValue() != 0);
                        }
                        ArrayList arrayList2 = arrayList;
                        arrayList2.add(new a740(new RealBetHistoryOrderEntity(strK1, strK2, numValueOf, strK3, strK4, strK5, numValueOf2, strK6, lValueOf2, listB, numValueOf3, numValueOf4, numValueOf5, boolValueOf, boolValueOf2, listA, boolValueOf3, listA2, boolValueOf4, z, z2, z3, z4, strK7, z5, boolValueOf5), lValueOf));
                        iB24 = i14;
                        i640Var2 = i640Var3;
                        iB21 = i11;
                        iB23 = i13;
                        iB4 = iB4;
                        iB14 = i4;
                        iB3 = iB3;
                        iB16 = i6;
                        i2 = i3;
                        iB5 = iB5;
                        arrayList = arrayList2;
                        iB2 = iB2;
                        iB15 = i5;
                        iB17 = i7;
                        iB18 = i8;
                        iB19 = i9;
                        iB20 = i10;
                        iB22 = i12;
                        iB25 = i15;
                        iB27 = iB27;
                        iB26 = i16;
                        iB = iB;
                    }
                    return arrayList;
                } finally {
                    hq60VarH1.close();
                }
            }
        }, true, false);
    }
}
