package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.OrderBetType;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.domain.model.SelectionId;
import com.sportybet.plugin.realsports.betslip.liabilitycheck.domain.model.LiabilityCheckSelection;
import com.sportybet.plugin.realsports.betslip.widget.e;
import com.sportybet.plugin.realsports.data.BoreDrawConfig;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.EarlyPayoutMarket;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.MarketExtend;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.OutcomesRequest;
import com.sportybet.plugin.realsports.data.PickMarketMetadata;
import com.sportybet.plugin.realsports.data.PreCannedBBOutcome;
import com.sportybet.plugin.realsports.data.RSelection;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class g880 {
    public static final LinkedHashMap A(Event event) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Market> list = event.markets;
        if (list == null) {
            list = m2g.a;
        }
        for (Market market : list) {
            market.getClass();
            String str = market.id;
            String str2 = market.specifier;
            if (str2 == null) {
                str2 = "";
            }
            String strA = oxc.a(str, "|", str2);
            Object linkedHashSet = linkedHashMap.get(strA);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(strA, linkedHashSet);
            }
            Set set = (Set) linkedHashSet;
            List<Outcome> list2 = market.outcomes;
            if (list2 == null) {
                list2 = m2g.a;
            }
            for (Outcome outcome : list2) {
                outcome.getClass();
                set.add(outcome.id + "^" + outcome.odds + "^" + outcome.status);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(jpu.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), CollectionsKt.E0((Iterable) entry.getValue()));
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [m2g] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.List] */
    public static final ArrayList B(List list) {
        char c;
        ?? arrayList;
        List list2 = list == null ? m2g.a : list;
        ArrayList arrayList2 = new ArrayList(l48.r(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Selection selection = (Selection) it.next();
            Event event = selection.a;
            event.getClass();
            String str = event.eventId;
            str.getClass();
            String str2 = event.gameId;
            if (str2 == null) {
                str2 = "";
            }
            int i = event.status;
            long j = event.estimateStartTime;
            String str3 = event.matchStatus;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = event.homeTeamName;
            str4.getClass();
            String str5 = event.awayTeamName;
            str5.getClass();
            String str6 = event.sport.id;
            str6.getClass();
            Sport sport = event.sport;
            Iterator it2 = it;
            String str7 = sport.name;
            String str8 = str7 == null ? "" : str7;
            String str9 = sport.category.id;
            str9.getClass();
            String str10 = event.sport.category.name;
            String str11 = str10 == null ? "" : str10;
            List<Market> list3 = event.markets;
            if (list3 != null) {
                c = '\n';
                arrayList = new ArrayList(l48.r(list3, 10));
                for (Market market : list3) {
                    market.getClass();
                    arrayList.add(vpu.j(market));
                }
            } else {
                c = '\n';
                arrayList = m2g.a;
            }
            ?? r19 = arrayList;
            boolean z = event.topTeam;
            String str12 = event.sport.category.tournament.id;
            str12.getClass();
            String str13 = event.sport.category.tournament.name;
            com.sporty.android.book.domain.entity.Event event2 = new com.sporty.android.book.domain.entity.Event(str, str2, i, j, str3, str4, str5, str6, str8, str9, str11, r19, z, str12, str13 == null ? "" : str13, event.matchTrackerNotAllowed, event.eventSource);
            Market market2 = selection.b;
            market2.getClass();
            com.sporty.android.book.domain.entity.Market marketJ = vpu.j(market2);
            Outcome outcome = selection.c;
            outcome.getClass();
            com.sporty.android.book.domain.entity.Selection selection2 = new com.sporty.android.book.domain.entity.Selection(event2, marketJ, i8z.b(outcome));
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(selection2);
            arrayList2 = arrayList3;
            it = it2;
        }
        return arrayList2;
    }

    public static final ArrayList C(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.sporty.android.book.domain.entity.Selection selection = (com.sporty.android.book.domain.entity.Selection) it.next();
            selection.getClass();
            arrayList.add(new Selection(apg.i(selection.getEvent()), vpu.k(selection.getMarket()), i8z.c(selection.getOutcome())));
        }
        return arrayList;
    }

    public static final void D(Selection selection) {
        selection.getClass();
        List<Selection> listD = iu2.d();
        if (listD == null || !((ArrayList) listD).isEmpty()) {
            ArrayList arrayList = (ArrayList) listD;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Selection selection2 = (Selection) obj;
                k980 k980Var = selection2.e;
                k980 k980Var2 = k980.EDIT_BET;
                if (k980Var == k980Var2 && selection2.equals(selection)) {
                    selection.e = k980Var2;
                    selection.i = true;
                    return;
                }
            }
        }
    }

    public static final void a(final RSelection rSelection, ViewGroup viewGroup) {
        int i;
        viewGroup.getClass();
        final Context context = viewGroup.getContext();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spr_ticket_detail_item_selection_footer, viewGroup, false);
        int i2 = R.id.td_result_description;
        TextView textView = (TextView) h5e.a(R.id.td_result_description, viewInflate);
        if (textView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            ImageView imageView = (ImageView) h5e.a(R.id.td_result_question_mark_icon, viewInflate);
            if (imageView != null) {
                int i3 = q980.c(rSelection) ? R.string.bet_history__delayed_settlement : -1;
                int i4 = rSelection.status;
                if (i4 != 1) {
                    i = R.color.text_type1_primary;
                    if (i4 == 3 || i4 == 4) {
                        i3 = R.string.bet_history__this_bet_has_been_settled_as_void;
                    }
                } else {
                    int i5 = rSelection.settleType;
                    if (i5 == 1) {
                        i3 = R.string.bet_history__flash_win_achieved;
                    } else if (i5 == 2) {
                        i3 = R.string.bet_history__congrats_flash_save;
                    } else if (i5 == 5) {
                        i3 = R.string.bet_history__1up_win_achieved;
                    } else if (i5 == 3) {
                        i3 = R.string.bet_history__2up_win_achieved;
                    } else if (i5 == 6) {
                        i3 = R.string.bet_history__early_goal_win_achieved;
                    } else if (i5 == 7) {
                        i3 = R.string.bet_history__dc_1up_win_achieved;
                    }
                    i = R.color.brand_quinary;
                }
                if (i3 == -1) {
                    constraintLayout.setVisibility(8);
                } else {
                    constraintLayout.setVisibility(0);
                    textView.setText(i3);
                    textView.setTextColor(context.getColor(i));
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: f880
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            String strF;
                            String strB;
                            RSelection rSelection2 = rSelection;
                            int i6 = rSelection2.status;
                            Context context2 = context;
                            if (i6 == 0) {
                                if (kgb0.a.contains(rSelection2.tournamentId)) {
                                    rkf.c(context2, R.string.bet_history__delayed_settlement, R.string.live__this_match_may_take_up_tip);
                                    return;
                                }
                                return;
                            }
                            if (i6 == 3 || i6 == 4) {
                                rkf.c(context2, R.string.bet_history__void, R.string.bet_history__void_bet_popup);
                                return;
                            }
                            int i7 = rSelection2.settleType;
                            if (i7 == 1) {
                                rkf.c(context2, R.string.bet_history__flash_win, R.string.bet_history__congratulations_flash_win_popup);
                                return;
                            }
                            if (i7 == 2) {
                                rkf.c(context2, R.string.bet_history__flash_save, R.string.bet_history__achieved_flash_save_popup);
                                return;
                            }
                            if (i7 == 3) {
                                rkf.c(context2, R.string.bet_history__2up_early_payout, R.string.bet_history__congratulations_2up_popup);
                                return;
                            }
                            if (i7 == 5) {
                                rkf.c(context2, R.string.bet_history__1up_early_payout, R.string.bet_history__congratulations_1up_popup);
                                return;
                            }
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    return;
                                }
                                rkf.c(context2, R.string.bet_history__dc_1up_early_payout, R.string.bet_history__congratulations_dc_1up_popup);
                                return;
                            }
                            String str = rSelection2.marketId;
                            String str2 = rSelection2.specifier;
                            String str3 = null;
                            aby abyVarD = (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? null : yay.d(str, str2);
                            if (abyVarD == null || (strF = abyVarD.f()) == null) {
                                strF = null;
                            } else if (strF.length() == 0) {
                                strF = "0";
                            }
                            if (abyVarD != null && (strB = abyVarD.b()) != null) {
                                str3 = strB.length() == 0 ? "0" : strB;
                            }
                            rkf.b(R.string.bet_history__early_goal_win_popup_title, context2, sn5.b(context2, R.string.bet_history__early_goal_win_achieved_popup_content, strF, str3));
                        }
                    });
                }
                viewGroup.addView(constraintLayout);
                return;
            }
            i2 = R.id.td_result_question_mark_icon;
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    public static final void b(RSelection rSelection, ViewGroup viewGroup) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spr_ticket_detail_item_selection_header, viewGroup, false);
        TextView textView = (TextView) h5e.a(R.id.td_selection_title, viewInflate);
        if (textView == null) {
            bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.td_selection_title)));
            return;
        }
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        float fA = zch0.a(context, 8);
        frameLayout.getClass();
        c8i0.i(frameLayout, rSelection.isWin() ? R.color.brand_secondary_variable_type1 : R.color.background_type1_primary, 0.0f, 0.0f, fA, fA);
        String strB = sn5.b(context, R.string.bet_builder__bet_builder, new Object[0]);
        String str = rSelection.odds;
        str.getClass();
        textView.setText(sn5.b(context, R.string.app_common__pick_value, strB, gky.a.a(str, false)));
        Drawable drawableA = rSelection.banker ? gr0.a(context, R.drawable.spr_banker_normal) : null;
        if (drawableA != null) {
            int iB = zch0.b(context.getResources(), 16);
            drawableA.setBounds(0, 0, iB, iB);
        }
        textView.setCompoundDrawables(null, null, drawableA, null);
        viewGroup.addView(frameLayout);
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0245 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x0247  */
    /* JADX WARN: Code duplicated, block: B:141:0x0252  */
    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ac  */
    public static final void c(RSelection rSelection, ViewGroup viewGroup, BoreDrawConfig boreDrawConfig, RSelection rSelection2, boolean z, boolean z2) {
        int i;
        Integer numValueOf;
        Drawable drawableA;
        Integer numValueOf2;
        Integer numValueOf3;
        Drawable drawable;
        Drawable drawableA2;
        String strD;
        int i2;
        int i3;
        rSelection.getClass();
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spr_ticket_detail_item_selection, viewGroup, false);
        int i4 = R.id.td_bore_draw_label;
        View viewA = h5e.a(R.id.td_bore_draw_label, viewInflate);
        if (viewA != null) {
            nrr nrrVarA = nrr.a(viewA);
            int i5 = R.id.td_market_label;
            if (((TextView) h5e.a(R.id.td_market_label, viewInflate)) != null) {
                i5 = R.id.td_market_value;
                TextView textView = (TextView) h5e.a(R.id.td_market_value, viewInflate);
                if (textView != null) {
                    i5 = R.id.td_pick_label;
                    if (((TextView) h5e.a(R.id.td_pick_label, viewInflate)) != null) {
                        i5 = R.id.td_pick_status;
                        ImageView imageView = (ImageView) h5e.a(R.id.td_pick_status, viewInflate);
                        if (imageView != null) {
                            i5 = R.id.td_pick_value;
                            TextView textView2 = (TextView) h5e.a(R.id.td_pick_value, viewInflate);
                            if (textView2 != null) {
                                i5 = R.id.td_result_label;
                                TextView textView3 = (TextView) h5e.a(R.id.td_result_label, viewInflate);
                                if (textView3 != null) {
                                    i5 = R.id.td_result_value;
                                    TextView textView4 = (TextView) h5e.a(R.id.td_result_value, viewInflate);
                                    if (textView4 != null) {
                                        i5 = R.id.td_settle_type_icon;
                                        ImageView imageView2 = (ImageView) h5e.a(R.id.td_settle_type_icon, viewInflate);
                                        if (imageView2 != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                            boolean z3 = rSelection2 == null;
                                            if (!z3) {
                                                rSelection2.getClass();
                                                if (!rSelection2.isWin()) {
                                                    i = R.color.background_type1_primary;
                                                } else if (rSelection.isWin()) {
                                                    i = R.color.brand_secondary_variable_type1;
                                                } else {
                                                    i = R.color.background_type1_primary;
                                                }
                                            } else if (rSelection.isWin()) {
                                                i = R.color.brand_secondary_variable_type1;
                                            } else {
                                                i = R.color.background_type1_primary;
                                            }
                                            if (z3) {
                                                constraintLayout.setBackgroundResource(i);
                                            } else {
                                                float fA = zch0.a(context, 8);
                                                constraintLayout.getClass();
                                                c8i0.i(constraintLayout, i, fA, fA, z ? 0.0f : fA, z ? 0.0f : fA);
                                            }
                                            if (z3 && rSelection.isWin()) {
                                                int i6 = rSelection.settleType;
                                                if (i6 == 1) {
                                                    i3 = R.drawable.ic_settle_type_flashwin;
                                                } else if (i6 == 2) {
                                                    i3 = R.drawable.ic_settle_type_flashsave;
                                                } else if (i6 != 3) {
                                                    i3 = R.drawable.ic_settle_type_1_up;
                                                    if (i6 != 5) {
                                                        if (i6 == 6) {
                                                            i3 = R.drawable.ic_settle_type_over_under_early_goals;
                                                        } else if (i6 != 7) {
                                                            i3 = R.drawable.ic_settle_type_won;
                                                        }
                                                    }
                                                } else {
                                                    i3 = R.drawable.ic_settle_type_2_up;
                                                }
                                                numValueOf = Integer.valueOf(i3);
                                            } else {
                                                numValueOf = null;
                                            }
                                            imageView2.setImageDrawable(numValueOf != null ? gr0.a(context, numValueOf.intValue()) : null);
                                            if (rSelection.odds != null) {
                                                StringBuilder sb = new StringBuilder();
                                                if (rSelection.joker != null) {
                                                    context.getClass();
                                                    sb.append(sn5.b(context, R.string.common_functions__joker, new Object[0]));
                                                    sb.append(" - ");
                                                }
                                                context.getClass();
                                                String str = rSelection.outcomeDesc;
                                                String str2 = rSelection.odds;
                                                str2.getClass();
                                                sb.append(sn5.b(context, R.string.app_common__pick_value, str, gky.a.a(str2, false)));
                                                textView2.setText(sb);
                                            } else {
                                                textView2.setText(rSelection.outcomeDesc);
                                            }
                                            Drawable drawableA3 = rSelection.banker ? gr0.a(context, R.drawable.spr_banker_normal) : null;
                                            if (drawableA3 != null) {
                                                int iA = zch0.a(context, 16);
                                                drawableA3.setBounds(0, 0, iA, iA);
                                            }
                                            if ((rSelection.lfbOddsBoosted ? rSelection : null) == null || (drawableA = gr0.a(context, R.drawable.ic_flash_boost)) == null) {
                                                drawableA = null;
                                            } else {
                                                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.flash_boost_badge_size);
                                                drawableA.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                                            }
                                            textView2.setCompoundDrawables(drawableA, null, drawableA3, null);
                                            if (rSelection.isWin()) {
                                                numValueOf2 = Integer.valueOf(R.drawable.spr_ic_done_black_24dp);
                                            } else if (z3) {
                                                numValueOf2 = null;
                                            } else if (rSelection.isLost()) {
                                                numValueOf2 = Integer.valueOf(R.drawable.ic_close_black_24dp);
                                            } else if (rSelection.isVoid()) {
                                                numValueOf2 = Integer.valueOf(R.drawable.ic_selection_status_void);
                                            } else {
                                                numValueOf2 = null;
                                            }
                                            if (rSelection.isWin()) {
                                                numValueOf3 = Integer.valueOf(R.color.brand_quinary);
                                            } else {
                                                numValueOf3 = rSelection.isLost() ? Integer.valueOf(R.color.text_type1_secondary) : null;
                                            }
                                            if (numValueOf2 == null || (drawable = context.getDrawable(numValueOf2.intValue())) == null) {
                                                drawable = null;
                                            } else if (numValueOf3 != null) {
                                                aef.b(drawable, context, numValueOf3.intValue());
                                            }
                                            imageView.setImageDrawable(drawable);
                                            if (rSelection.oddsBoosted) {
                                                context.getClass();
                                                drawableA2 = gr0.a(context, r0b.d(context) ? R.drawable.ic_odds_boost_dark : R.drawable.ic_odds_boost);
                                            } else {
                                                drawableA2 = null;
                                            }
                                            if (b3.U(rSelection.eventId)) {
                                                PickMarketMetadata pickMarketMetadata = rSelection.pickMarketMetadata;
                                                String marketHeadline = pickMarketMetadata != null ? pickMarketMetadata.getMarketHeadline() : null;
                                                if (marketHeadline != null && marketHeadline.length() != 0) {
                                                    PickMarketMetadata pickMarketMetadata2 = rSelection.pickMarketMetadata;
                                                    strD = pickMarketMetadata2 != null ? pickMarketMetadata2.getMarketHeadline() : null;
                                                    if (strD == null) {
                                                        strD = "";
                                                    }
                                                } else if (z2) {
                                                    strD = e.d(rSelection.marketId, rSelection.specifier, rSelection.marketDesc);
                                                } else {
                                                    strD = rSelection.marketDesc;
                                                }
                                            } else if (z2) {
                                                strD = e.d(rSelection.marketId, rSelection.specifier, rSelection.marketDesc);
                                            } else {
                                                strD = rSelection.marketDesc;
                                            }
                                            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableA2, (Drawable) null);
                                            textView.setText(strD);
                                            boolean z4 = (TextUtils.isEmpty(rSelection.correctOutcome) || rSelection.isVoid() || z2) ? false : true;
                                            textView3.setVisibility(z4 ? 0 : 8);
                                            textView4.setVisibility(z4 ? 0 : 8);
                                            textView4.setText(rSelection.correctOutcome);
                                            if (rSelection.isWin() && rSelection.settleType == 1 && TextUtils.isEmpty(rSelection.correctOutcome)) {
                                                i2 = 0;
                                                textView3.setVisibility(0);
                                                textView4.setVisibility(0);
                                                sn5.f(textView4, R.string.bet_history__coming_soon, new Object[0]);
                                            } else {
                                                i2 = 0;
                                            }
                                            nrrVarA.a.setVisibility(rSelection.shouldShowBoreDrawLabel(boreDrawConfig) ? i2 : 8);
                                            if (z2) {
                                                textView2.setTypeface(null, 1);
                                            }
                                            viewGroup.addView(constraintLayout);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i4 = i5;
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    public static /* synthetic */ void d(RSelection rSelection, ViewGroup viewGroup, BoreDrawConfig boreDrawConfig, RSelection rSelection2, boolean z, int i) {
        if ((i & 4) != 0) {
            rSelection2 = null;
        }
        RSelection rSelection3 = rSelection2;
        if ((i & 8) != 0) {
            z = false;
        }
        c(rSelection, viewGroup, boreDrawConfig, rSelection3, z, false);
    }

    public static final Selection e(Selection selection, List list) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.g((Selection) next, selection)) {
                return (Selection) next;
            }
        }
        next = null;
        return (Selection) next;
    }

    public static final SpannableStringBuilder f(Selection selection) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        List<Selection> list = selection.d;
        list.getClass();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            Selection selection2 = (Selection) obj;
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) selection2.c.desc);
            spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) (" " + selection2.b.desc));
            list.getClass();
            if (i != list.size() - 1) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            i = i2;
        }
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder g(Selection selection) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Outcome outcome = selection.c;
        List<PreCannedBBOutcome> list = outcome.childOutcomes;
        list.getClass();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            PreCannedBBOutcome preCannedBBOutcome = (PreCannedBBOutcome) obj;
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) preCannedBBOutcome.getOutcomeDesc());
            spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) (" " + preCannedBBOutcome.getMarketName()));
            List<PreCannedBBOutcome> list2 = outcome.childOutcomes;
            list2.getClass();
            if (i != list2.size() - 1) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            i = i2;
        }
        return spannableStringBuilder;
    }

    public static final String h(Selection selection, boolean z) {
        Market market = selection.b;
        EarlyPayoutMarket earlyPayoutMarketE = yay.e(market);
        if (earlyPayoutMarketE != null) {
            return z ? earlyPayoutMarketE.getMappedMarketId() : earlyPayoutMarketE.getSourceMarketId();
        }
        String str = market.id;
        str.getClass();
        return str;
    }

    public static final String i(Selection selection, boolean z) {
        Market market = selection.b;
        EarlyPayoutMarket earlyPayoutMarketE = yay.e(market);
        if (earlyPayoutMarketE != null) {
            return z ? earlyPayoutMarketE.getMappedSpecifier() : earlyPayoutMarketE.getSourceSpecifier();
        }
        String str = market.specifier;
        str.getClass();
        return str;
    }

    public static final String j(Selection selection, zuy zuyVar, avy avyVar) {
        String str;
        Market market;
        Selection selectionH;
        Market market2;
        String str2;
        Market market3;
        Market market4;
        String str3;
        Market market5 = selection.b;
        int iOrdinal = zuyVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    String str4 = market5.id;
                    str4.getClass();
                    return str4;
                }
                MarketExtend marketExtendB = xvy.b(market5);
                if (marketExtendB != null) {
                    str3 = avyVar != avy.c ? marketExtendB.nodeMarketId : marketExtendB.rootMarketId;
                } else {
                    str3 = market5.id;
                }
                str3.getClass();
                return str3;
            }
            if (!rlc.b(selection)) {
                MarketExtend marketExtendA = xvy.a(market5);
                if (marketExtendA != null) {
                    str2 = avyVar != avy.c ? marketExtendA.nodeMarketId : marketExtendA.rootMarketId;
                } else {
                    str2 = market5.id;
                }
            } else if (avyVar != avy.c) {
                Selection selectionG = rlc.g(selection);
                if (selectionG == null || (market4 = selectionG.b) == null || (str2 = market4.id) == null) {
                    str2 = market5.id;
                }
            } else {
                Selection selectionH2 = rlc.h(selection);
                if (selectionH2 == null || (market3 = selectionH2.b) == null || (str2 = market3.id) == null) {
                    str2 = market5.id;
                }
            }
            str2.getClass();
            return str2;
        }
        MarketExtend marketExtendA2 = xvy.a(market5);
        MarketExtend marketExtendB2 = xvy.b(market5);
        if (rlc.b(selection)) {
            int iOrdinal2 = avyVar.ordinal();
            if (iOrdinal2 == 0) {
                Selection selectionG2 = rlc.g(selection);
                if (selectionG2 == null || (market = selectionG2.b) == null || (str = market.id) == null) {
                    str = market5.id;
                }
            } else if (iOrdinal2 != 2 || (selectionH = rlc.h(selection)) == null || (market2 = selectionH.b) == null || (str = market2.id) == null) {
                str = market5.id;
            }
        } else if (marketExtendA2 == null && marketExtendB2 == null) {
            str = market5.id;
        } else {
            int iOrdinal3 = avyVar.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    if (marketExtendA2 != null) {
                        str = marketExtendA2.rootMarketId;
                    } else {
                        str = marketExtendB2 != null ? marketExtendB2.rootMarketId : market5.id;
                    }
                } else if (marketExtendB2 == null || (str = marketExtendB2.nodeMarketId) == null) {
                    str = market5.id;
                }
            } else if (marketExtendA2 == null || (str = marketExtendA2.nodeMarketId) == null) {
                str = market5.id;
            }
        }
        str.getClass();
        return str;
    }

    public static final OutcomesRequest k(List<? extends Selection> list, boolean z) {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            JSONArray jSONArray = new JSONArray();
            for (Selection selection : list == null ? m2g.a : list) {
                JSONObject jSONObject = new JSONObject();
                Event event = selection.a;
                Outcome outcome = selection.c;
                Market market = selection.b;
                jSONObject.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, event.eventId);
                jSONObject.put("marketId", market.id);
                jSONObject.put("specifier", market.specifier);
                jSONObject.put("outcomeId", outcome.id);
                jSONArray.put(jSONObject);
                if (selection.p()) {
                    Iterable<Selection> iterable = selection.d;
                    if (iterable == null) {
                        iterable = m2g.a;
                    }
                    for (Selection selection2 : iterable) {
                        JSONObject jSONObject2 = new JSONObject();
                        Event event2 = selection2.a;
                        Market market2 = selection2.b;
                        jSONObject2.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, event2.eventId);
                        jSONObject2.put("marketId", market2.id);
                        jSONObject2.put("specifier", market2.specifier);
                        jSONObject2.put("outcomeId", selection2.c.id);
                        jSONObject2.put("parentBetBuilderMarketId", market.id);
                        jSONArray.put(jSONObject2);
                    }
                }
                if (z && Intrinsics.g(market.id, "60210")) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, selection.a.eventId);
                    jSONObject3.put("marketId", "1");
                    jSONObject3.put("specifier", market.specifier);
                    jSONObject3.put("outcomeId", outcome.id);
                    jSONArray.put(jSONObject3);
                }
            }
            String string = jSONArray.toString();
            string.getClass();
            bVar = new OutcomesRequest(list == null ? m2g.a : list, null, null, string, null, 22, null);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_COMMON);
            aVar3.p(thA, "Failed to generate selections body", new Object[0]);
            thA.printStackTrace();
            if (list == null) {
                list = m2g.a;
            }
            bVar = new OutcomesRequest(list, null, null, "", thA, 6, null);
        }
        return (OutcomesRequest) bVar;
    }

    public static final OutcomesRequest l(List<? extends Selection> list, boolean z) {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            JSONArray jSONArray = new JSONArray();
            for (Selection selection : list == null ? m2g.a : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, selection.a.eventId);
                jSONObject.put("marketId", h(selection, z));
                jSONObject.put("specifier", i(selection, z));
                jSONObject.put("outcomeId", selection.c.id);
                jSONArray.put(jSONObject);
                if (selection.p()) {
                    Iterable<Selection> iterable = selection.d;
                    if (iterable == null) {
                        iterable = m2g.a;
                    }
                    for (Selection selection2 : iterable) {
                        JSONObject jSONObject2 = new JSONObject();
                        Event event = selection2.a;
                        Market market = selection2.b;
                        jSONObject2.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, event.eventId);
                        jSONObject2.put("marketId", market.id);
                        jSONObject2.put("specifier", market.specifier);
                        jSONObject2.put("outcomeId", selection2.c.id);
                        jSONObject2.put("parentBetBuilderMarketId", selection.b.id);
                        jSONArray.put(jSONObject2);
                    }
                }
            }
            String string = jSONArray.toString();
            string.getClass();
            bVar = new OutcomesRequest(list == null ? m2g.a : list, null, String.valueOf(z), string, null, 18, null);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_COMMON);
            aVar3.p(thA, "Failed to generate selections body", new Object[0]);
            thA.printStackTrace();
            if (list == null) {
                list = m2g.a;
            }
            bVar = new OutcomesRequest(list, null, String.valueOf(z), "", thA, 2, null);
        }
        return (OutcomesRequest) bVar;
    }

    public static final OutcomesRequest m(List<? extends Selection> list, boolean z) {
        Object bVar;
        String mappedMarketId;
        try {
            zi50.a aVar = zi50.b;
            JSONArray jSONArray = new JSONArray();
            for (Selection selection : list == null ? m2g.a : list) {
                JSONObject jSONObject = new JSONObject();
                Event event = selection.a;
                Outcome outcome = selection.c;
                Market market = selection.b;
                jSONObject.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, event.eventId);
                EarlyPayoutMarket earlyPayoutMarketB = qvy.b(market);
                if (earlyPayoutMarketB == null) {
                    mappedMarketId = market.id;
                    mappedMarketId.getClass();
                } else {
                    mappedMarketId = z ? earlyPayoutMarketB.getMappedMarketId() : earlyPayoutMarketB.getSourceMarketId();
                }
                jSONObject.put("marketId", mappedMarketId);
                String str = market.specifier;
                if (str == null) {
                    str = "";
                }
                jSONObject.put("specifier", str);
                jSONObject.put("outcomeId", outcome.id);
                jSONArray.put(jSONObject);
                if (selection.p()) {
                    Iterable<Selection> iterable = selection.d;
                    if (iterable == null) {
                        iterable = m2g.a;
                    }
                    for (Selection selection2 : iterable) {
                        JSONObject jSONObject2 = new JSONObject();
                        Event event2 = selection2.a;
                        Market market2 = selection2.b;
                        jSONObject2.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, event2.eventId);
                        jSONObject2.put("marketId", market2.id);
                        jSONObject2.put("specifier", market2.specifier);
                        jSONObject2.put("outcomeId", selection2.c.id);
                        jSONObject2.put("parentBetBuilderMarketId", market.id);
                        jSONArray.put(jSONObject2);
                    }
                }
                if (z) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, selection.a.eventId);
                    jSONObject3.put("marketId", "1");
                    jSONObject3.put("specifier", market.specifier);
                    jSONObject3.put("outcomeId", outcome.id);
                    jSONArray.put(jSONObject3);
                }
            }
            String string = jSONArray.toString();
            string.getClass();
            bVar = new OutcomesRequest(list == null ? m2g.a : list, null, String.valueOf(z), string, null, 18, null);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_COMMON);
            aVar3.p(thA, "Failed to generate selections body for Never Down", new Object[0]);
            thA.printStackTrace();
            if (list == null) {
                list = m2g.a;
            }
            bVar = new OutcomesRequest(list, null, String.valueOf(z), "", thA, 2, null);
        }
        return (OutcomesRequest) bVar;
    }

    public static final OutcomesRequest n(List<? extends Selection> list, zuy zuyVar, avy avyVar) {
        Object bVar;
        zuyVar.getClass();
        try {
            zi50.a aVar = zi50.b;
            JSONArray jSONArray = new JSONArray();
            for (Selection selection : list == null ? m2g.a : list) {
                JSONObject jSONObject = new JSONObject();
                Event event = selection.a;
                Market market = selection.b;
                jSONObject.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, event.eventId);
                jSONObject.put("marketId", j(selection, zuyVar, avyVar));
                jSONObject.put("specifier", market.specifier);
                jSONObject.put("outcomeId", selection.c.id);
                jSONArray.put(jSONObject);
                if (selection.p()) {
                    Iterable<Selection> iterable = selection.d;
                    if (iterable == null) {
                        iterable = m2g.a;
                    }
                    for (Selection selection2 : iterable) {
                        JSONObject jSONObject2 = new JSONObject();
                        Event event2 = selection2.a;
                        Market market2 = selection2.b;
                        jSONObject2.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, event2.eventId);
                        jSONObject2.put("marketId", market2.id);
                        jSONObject2.put("specifier", market2.specifier);
                        jSONObject2.put("outcomeId", selection2.c.id);
                        jSONObject2.put("parentBetBuilderMarketId", market.id);
                        jSONArray.put(jSONObject2);
                    }
                }
            }
            String string = jSONArray.toString();
            string.getClass();
            bVar = new OutcomesRequest(list == null ? m2g.a : list, zuyVar.name(), avyVar.name(), string, null, 16, null);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_COMMON);
            aVar3.p(thA, "Failed to generate selections body", new Object[0]);
            thA.printStackTrace();
            if (list == null) {
                list = m2g.a;
            }
            bVar = new OutcomesRequest(list, zuyVar.name(), avyVar.name(), "", thA);
        }
        return (OutcomesRequest) bVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0097  */
    /* JADX WARN: Code duplicated, block: B:62:0x0130  */
    public static final String o(List<? extends Selection> list, Integer num, Map<Selection, String> map, zz80 zz80Var) {
        Object bVar;
        String str;
        String str2;
        String str3;
        BigDecimal bigDecimal;
        BigDecimal bigDecimalC;
        String str4;
        Object bVar2;
        map.getClass();
        try {
            zi50.a aVar = zi50.b;
            List<? extends Selection> list2 = list == null ? m2g.a : list;
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            String str5 = null;
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    b.q();
                    throw null;
                }
                Selection selection = (Selection) obj;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, selection.a.eventId);
                jSONObject.put("marketId", selection.b.id);
                jSONObject.put("specifier", selection.b.specifier);
                jSONObject.put("outcomeId", selection.c.id);
                String str6 = map.get(selection);
                if (str6 != null) {
                    try {
                        zi50.a aVar2 = zi50.b;
                        bVar2 = Long.valueOf(p54.c(new BigDecimal(str6)).longValue());
                    } catch (Throwable th) {
                        zi50.a aVar3 = zi50.b;
                        bVar2 = new zi50.b(th);
                    }
                    if (bVar2 instanceof zi50.b) {
                        bVar2 = null;
                    }
                    Long l = (Long) bVar2;
                    if (l != null) {
                        jSONObject.put("stake", l.longValue());
                    }
                }
                jSONArray.put(jSONObject);
                if (selection.p()) {
                    Iterable<Selection> iterable = selection.d;
                    if (iterable == null) {
                        iterable = m2g.a;
                    }
                    for (Selection selection2 : iterable) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, selection2.a.eventId);
                        jSONObject2.put("marketId", selection2.b.id);
                        jSONObject2.put("specifier", selection2.b.specifier);
                        jSONObject2.put("outcomeId", selection2.c.id);
                        jSONObject2.put("parentBetBuilderMarketId", selection.b.id);
                        jSONArray.put(jSONObject2);
                    }
                }
                String str7 = selection.f;
                if (i == 0) {
                    str5 = str7;
                } else if (str5 != null && !Intrinsics.g(str7, str5)) {
                    str5 = null;
                }
                i = i2;
                list2 = list2;
            }
            List<? extends Selection> list3 = list2;
            if (x(list3)) {
                str = "BET_BUILDER";
            } else {
                int value = OrderBetType.SINGLE.getValue();
                if (num != null && num.intValue() == value) {
                    str = "SINGLE";
                } else {
                    int value2 = OrderBetType.MULTIPLE.getValue();
                    if (num != null && num.intValue() == value2) {
                        str = "MULTIPLE";
                    } else {
                        int value3 = OrderBetType.SYSTEM.getValue();
                        if (num != null && num.intValue() == value3) {
                            str = "SYSTEM";
                        } else if (list3.size() == 1) {
                            str = "SINGLE";
                        } else {
                            str = "MULTIPLE";
                        }
                    }
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            if (str5 != null) {
                jSONObject3.put("loadingShareCode", str5);
            }
            jSONObject3.put("selections", jSONArray);
            if (num != null) {
                jSONObject3.put("orderType", num.intValue());
            }
            jSONObject3.put("betType", str);
            if (zz80Var != null && (str4 = zz80Var.a) != null) {
                jSONObject3.put("potentialWinnings", str4);
            }
            if (zz80Var != null && (bigDecimal = zz80Var.b) != null && (bigDecimalC = p54.c(bigDecimal)) != null) {
                jSONObject3.put("totalStake", bigDecimalC.longValue());
            }
            if (zz80Var != null && (str3 = zz80Var.c) != null) {
                jSONObject3.put("displayTotalOdds", str3);
            }
            if (zz80Var != null && (str2 = zz80Var.d) != null) {
                jSONObject3.put("displayBonus", str2);
            }
            bVar = jSONObject3.toString();
        } catch (Throwable th2) {
            zi50.a aVar4 = zi50.b;
            bVar = new zi50.b(th2);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar5 = itf0.a;
            aVar5.q(MyLog.TAG_COMMON);
            aVar5.p(thA, "Failed to generate share code body", new Object[0]);
            thA.printStackTrace();
            bVar = "";
        }
        return (String) bVar;
    }

    public static final Selection p(Selection selection, List list) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.g(q((Selection) next), q(selection))) {
                return (Selection) next;
            }
        }
        next = null;
        return (Selection) next;
    }

    public static final Set<String> q(Selection selection) {
        ArrayList arrayList;
        selection.getClass();
        Event event = selection.a;
        Sport sport = event.sport;
        String str = sport == null ? "" : sport.id;
        List<Selection> list = selection.d;
        ArrayList arrayList2 = null;
        if (list != null) {
            arrayList = new ArrayList(l48.r(list, 10));
            for (Selection selection2 : list) {
                String str2 = event.eventId;
                String marketId = selection2.getMarketId();
                String outcomeId = selection2.getOutcomeId();
                String specifier = selection2.getSpecifier();
                if (specifier == null) {
                    specifier = "";
                }
                arrayList.add(kwi.a(crh0.a(str, "_", str2, "_", marketId), "_", outcomeId, "_", specifier));
            }
        } else {
            arrayList = null;
        }
        List<PreCannedBBOutcome> list2 = selection.c.childOutcomes;
        if (list2 != null) {
            arrayList2 = new ArrayList(l48.r(list2, 10));
            for (PreCannedBBOutcome preCannedBBOutcome : list2) {
                String str3 = event.eventId;
                int marketId2 = preCannedBBOutcome.getMarketId();
                String outcomeId2 = preCannedBBOutcome.getOutcomeId();
                String specifier2 = preCannedBBOutcome.getSpecifier();
                if (specifier2 == null) {
                    specifier2 = "";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("_");
                sb.append(str3);
                sb.append("_");
                sb.append(marketId2);
                arrayList2.add(kwi.a(sb, "_", outcomeId2, "_", specifier2));
            }
        }
        return CollectionsKt.E0(l48.s(ay0.v(new List[]{arrayList, arrayList2})));
    }

    public static final <T extends SelectionId<T>> boolean r(T t) {
        List<T> childSelections = t != null ? t.getChildSelections() : null;
        return !(childSelections == null || childSelections.isEmpty());
    }

    public static final Selection s(Selection selection) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str6;
        String str7;
        List<EarlyPayoutMarket> list;
        String sourceSpecifier;
        String sourceMarketId;
        String mappedMarketId;
        String mappedSpecifier;
        String name;
        List<MarketExtend> list2;
        String str8;
        String str9;
        Sport sport;
        String str10;
        Sport sport2;
        Category category;
        Tournament tournament;
        String str11;
        Category category2;
        Tournament tournament2;
        selection.getClass();
        Tournament tournament3 = new Tournament();
        Event event = selection.a;
        Event event2 = selection.a;
        Market market = selection.b;
        Sport sport3 = event.sport;
        String str12 = "";
        if (sport3 == null || (category2 = sport3.category) == null || (tournament2 = category2.tournament) == null || (str = tournament2.id) == null) {
            str = "";
        }
        if (event != null && (tournament = event.tournament) != null && (str11 = tournament.id) != null && str11.length() != 0) {
            str = str11;
        }
        tournament3.id = str;
        Category category3 = new Category();
        if (event2 == null || (sport2 = event2.sport) == null || (category = sport2.category) == null || (str2 = category.id) == null) {
            str2 = "";
        }
        if (event2 != null && (str10 = event2.categoryId) != null && str10.length() != 0) {
            str2 = str10;
        }
        category3.id = str2;
        category3.tournament = tournament3;
        Sport sport4 = new Sport();
        if (event2 == null || (sport = event2.sport) == null || (str3 = sport.id) == null) {
            str3 = "";
        }
        sport4.id = str3;
        sport4.category = category3;
        Event event3 = new Event();
        if (event2 == null || (str4 = event2.eventId) == null) {
            str4 = "";
        }
        event3.eventId = str4;
        if (event2 == null || (str5 = event2.categoryId) == null) {
            str5 = "";
        }
        event3.categoryId = str5;
        event3.sport = sport4;
        if (market == null || (list2 = market.marketExtendVOS) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(l48.r(list2, 10));
            for (MarketExtend marketExtend : list2) {
                MarketExtend marketExtend2 = new MarketExtend();
                if (marketExtend == null || (str8 = marketExtend.nodeMarketId) == null) {
                    str8 = "";
                }
                marketExtend2.nodeMarketId = str8;
                if (marketExtend == null || (str9 = marketExtend.rootMarketId) == null) {
                    str9 = "";
                }
                marketExtend2.rootMarketId = str9;
                arrayList.add(marketExtend2);
            }
        }
        if (market == null || (list = market.earlyPayoutMarkets) == null) {
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList(l48.r(list, 10));
            for (EarlyPayoutMarket earlyPayoutMarket : list) {
                arrayList2.add(new EarlyPayoutMarket((earlyPayoutMarket == null || (name = earlyPayoutMarket.getName()) == null) ? "" : name, (earlyPayoutMarket == null || (sourceMarketId = earlyPayoutMarket.getSourceMarketId()) == null) ? "" : sourceMarketId, (earlyPayoutMarket == null || (sourceSpecifier = earlyPayoutMarket.getSourceSpecifier()) == null) ? "" : sourceSpecifier, (earlyPayoutMarket == null || (mappedMarketId = earlyPayoutMarket.getMappedMarketId()) == null) ? "" : mappedMarketId, (earlyPayoutMarket == null || (mappedSpecifier = earlyPayoutMarket.getMappedSpecifier()) == null) ? "" : mappedSpecifier, earlyPayoutMarket != null ? earlyPayoutMarket.getSupported() : false));
            }
        }
        Market market2 = new Market();
        if (market == null || (str6 = market.id) == null) {
            str6 = "";
        }
        market2.id = str6;
        String str13 = market != null ? market.specifier : null;
        if (str13 != null && str13.length() != 0) {
            market2.specifier = market.specifier;
        }
        market2.marketExtendVOS = arrayList;
        market2.earlyPayoutMarkets = arrayList2;
        Outcome outcome = new Outcome();
        Outcome outcome2 = selection.c;
        if (outcome2 != null && (str7 = outcome2.id) != null) {
            str12 = str7;
        }
        outcome.id = str12;
        return new Selection(event3, market2, outcome);
    }

    public static final boolean t(Selection selection) {
        Outcome outcome;
        List<PreCannedBBOutcome> list;
        selection.getClass();
        return selection.p() || !((outcome = selection.c) == null || (list = outcome.childOutcomes) == null || !(list.isEmpty() ^ true));
    }

    public static final boolean u(Selection selection, j8s j8sVar, boolean z) {
        List<LiabilityCheckSelection> list;
        if (selection == null || !z || !(j8sVar instanceof j8s.b) || ((list = ((j8s.b) j8sVar).c) != null && list.isEmpty())) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (w((LiabilityCheckSelection) it.next(), selection)) {
                return true;
            }
        }
        return false;
    }

    public static final <T1 extends SelectionId<T1>, T2 extends SelectionId<T2>> boolean v(List<? extends T1> list, List<? extends T2> list2) {
        if (list == null || list.size() != list2.size()) {
            return false;
        }
        for (T1 t1 : list) {
            Iterator<? extends T2> it = list2.iterator();
            while (it.hasNext()) {
                if (w(t1, it.next())) {
                }
            }
            return false;
        }
        return true;
    }

    public static final <T1 extends SelectionId<T1>, T2 extends SelectionId<T2>> boolean w(T1 t1, T2 t2) {
        String specifier;
        if (t1 != null && t2 != null && ((!r(t1) || r(t2)) && (r(t1) || !r(t2)))) {
            if (!r(t1) || !r(t2)) {
                String eventId = t1.getEventId();
                String eventId2 = t2.getEventId();
                Boolean boolValueOf = null;
                Boolean boolValueOf2 = (eventId == null || eventId2 == null) ? null : Boolean.valueOf(eventId.equals(eventId2));
                if (boolValueOf2 != null ? boolValueOf2.booleanValue() : false) {
                    String marketId = t1.getMarketId();
                    String marketId2 = t2.getMarketId();
                    Boolean boolValueOf3 = (marketId == null || marketId2 == null) ? null : Boolean.valueOf(marketId.equals(marketId2));
                    if (boolValueOf3 != null ? boolValueOf3.booleanValue() : false) {
                        String outcomeId = t1.getOutcomeId();
                        String outcomeId2 = t2.getOutcomeId();
                        if (outcomeId != null && outcomeId2 != null) {
                            boolValueOf = Boolean.valueOf(outcomeId.equals(outcomeId2));
                        }
                        if (boolValueOf != null ? boolValueOf.booleanValue() : false) {
                            String specifier2 = t1.getSpecifier();
                            if ((specifier2 == null || specifier2.length() == 0) && ((specifier = t2.getSpecifier()) == null || specifier.length() == 0)) {
                                return true;
                            }
                            return Intrinsics.g(t1.getSpecifier(), t2.getSpecifier());
                        }
                    }
                }
            } else if (Intrinsics.g(t1.getEventId(), t2.getEventId())) {
                Iterable<SelectionId> childSelections = t1.getChildSelections();
                if (childSelections == null) {
                    childSelections = m2g.a;
                }
                ArrayList arrayList = new ArrayList(l48.r(childSelections, 10));
                for (SelectionId selectionId : childSelections) {
                    arrayList.add(new Pair(selectionId.getMarketId(), selectionId.getOutcomeId()));
                }
                Set setE0 = CollectionsKt.E0(arrayList);
                Iterable<SelectionId> childSelections2 = t2.getChildSelections();
                if (childSelections2 == null) {
                    childSelections2 = m2g.a;
                }
                ArrayList arrayList2 = new ArrayList(l48.r(childSelections2, 10));
                for (SelectionId selectionId2 : childSelections2) {
                    arrayList2.add(new Pair(selectionId2.getMarketId(), selectionId2.getOutcomeId()));
                }
                return Intrinsics.g(setE0, CollectionsKt.E0(arrayList2));
            }
        }
        return false;
    }

    public static final boolean x(List<? extends Selection> list) {
        Selection selection;
        Outcome outcome;
        List<PreCannedBBOutcome> list2;
        if (list == null || list.size() != 1) {
            return false;
        }
        Selection selection2 = (Selection) CollectionsKt.firstOrNull(list);
        return (selection2 != null && selection2.p()) || !((selection = (Selection) CollectionsKt.firstOrNull(list)) == null || (outcome = selection.c) == null || (list2 = outcome.childOutcomes) == null || !(list2.isEmpty() ^ true));
    }

    public static final ArrayList y(Selection selection, List list) {
        Object next;
        list.getClass();
        List<Selection> list2 = selection.d;
        list2.getClass();
        ArrayList arrayList = new ArrayList(list2);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Selection selection2 = (Selection) arrayList.get(i);
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g((Selection) next, selection2));
            Selection selection3 = (Selection) next;
            if (selection3 != null) {
                selection2 = selection3;
            }
            arrayList.set(i, selection2);
        }
        return B(arrayList);
    }

    public static final Selection z(Selection selection) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        List<MarketExtend> list;
        List<EarlyPayoutMarket> list2;
        String str12;
        String str13;
        List<PreCannedBBOutcome> list3;
        String str14;
        Sport sport;
        String str15;
        Sport sport2;
        Category category;
        Tournament tournament;
        String str16;
        Sport sport3;
        Category category2;
        Tournament tournament2;
        selection.getClass();
        Tournament tournament3 = new Tournament();
        Event event = selection.a;
        Market market = selection.b;
        Event event2 = selection.a;
        String str17 = "";
        if (event == null || (sport3 = event.sport) == null || (category2 = sport3.category) == null || (tournament2 = category2.tournament) == null || (str = tournament2.id) == null) {
            str = "";
        }
        if (event != null && (tournament = event.tournament) != null && (str16 = tournament.id) != null && str16.length() != 0) {
            str = str16;
        }
        tournament3.id = str;
        Category category3 = new Category();
        if (event2 == null || (sport2 = event2.sport) == null || (category = sport2.category) == null || (str2 = category.id) == null) {
            str2 = "";
        }
        if (event2 != null && (str15 = event2.categoryId) != null && str15.length() != 0) {
            str2 = str15;
        }
        category3.id = str2;
        category3.tournament = tournament3;
        Sport sport4 = new Sport();
        if (event2 == null || (sport = event2.sport) == null || (str3 = sport.id) == null) {
            str3 = "";
        }
        sport4.id = str3;
        sport4.category = category3;
        Event event3 = new Event();
        if (event2 == null || (str4 = event2.eventId) == null) {
            str4 = "";
        }
        event3.eventId = str4;
        if (event2 == null || (str5 = event2.categoryId) == null) {
            str5 = "";
        }
        event3.categoryId = str5;
        if (event2 == null || (str6 = event2.awayTeamName) == null) {
            str6 = "";
        }
        event3.awayTeamName = str6;
        event3.estimateStartTime = event2 != null ? event2.estimateStartTime : 0L;
        if (event2 == null || (str7 = event2.homeTeamName) == null) {
            str7 = "";
        }
        event3.homeTeamName = str7;
        if (event2 == null || (str8 = event2.matchStatus) == null) {
            str8 = "";
        }
        event3.matchStatus = str8;
        if (event2 == null || (str9 = event2.productStatus) == null) {
            str9 = "";
        }
        event3.productStatus = str9;
        event3.status = event2 != null ? event2.status : 0;
        event3.sport = sport4;
        Market market2 = new Market();
        if (market == null || (str10 = market.id) == null) {
            str10 = "";
        }
        market2.id = str10;
        market2.product = market != null ? market.product : 0;
        if (market == null || (str11 = market.desc) == null) {
            str11 = "";
        }
        market2.desc = str11;
        market2.status = market != null ? market.status : 0;
        String str18 = market != null ? market.specifier : null;
        if (str18 != null && str18.length() != 0) {
            market2.specifier = market.specifier;
        }
        if (market == null || (list = market.marketExtendVOS) == null) {
            list = m2g.a;
        }
        market2.marketExtendVOS = list;
        if (market == null || (list2 = market.earlyPayoutMarkets) == null) {
            list2 = m2g.a;
        }
        market2.earlyPayoutMarkets = list2;
        Outcome outcome = new Outcome();
        Outcome outcome2 = selection.c;
        if (outcome2 == null || (str12 = outcome2.id) == null) {
            str12 = "";
        }
        outcome.id = str12;
        if (outcome2 == null || (str13 = outcome2.odds) == null) {
            str13 = "";
        }
        outcome.odds = str13;
        outcome.probability = outcome2 != null ? outcome2.probability : 0.0d;
        outcome.isActive = outcome2 != null ? outcome2.isActive : 0;
        if (outcome2 != null && (str14 = outcome2.desc) != null) {
            str17 = str14;
        }
        outcome.desc = str17;
        if (outcome2 == null || (list3 = outcome2.childOutcomes) == null) {
            list3 = m2g.a;
        }
        outcome.childOutcomes = list3;
        ArrayList arrayList = new ArrayList();
        if (selection.p()) {
            for (Selection selection2 : selection.d) {
                selection2.getClass();
                arrayList.add(z(selection2));
            }
        }
        return new Selection(event3, market2, outcome, arrayList);
    }
}
