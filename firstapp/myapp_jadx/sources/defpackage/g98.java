package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sportybet.android.bethistory.data.dto.RealBetHistoryOrderDto;
import com.sportybet.android.choosebet.presentation.ChooseBetActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.PrevBetHistoryActivity;
import com.sportybet.plugin.realsports.data.ROrder;
import com.sportybet.plugin.realsports.data.RSelection;
import com.sportybet.plugin.realsports.data.WinStatusDisplayData;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class g98 extends RecyclerView.f<d> {
    public ArrayList a;
    public SparseArray<hl30> b;
    public Activity c;
    public boolean d;
    public boolean e;
    public int f;
    public int i;
    public boolean v;
    public ChooseBetActivity w;

    /* JADX INFO: loaded from: classes5.dex */
    public class a extends d implements View.OnClickListener {
        public final TextView A;
        public final View B;
        public final View C;
        public final TextView D;
        public final View E;
        public final TextView F;
        public final View G;
        public final TextView H;
        public final ProgressBar I;
        public final ConstraintLayout a;
        public final ConstraintLayout b;
        public final TextView c;
        public final TextView d;
        public final TextView e;
        public final TextView f;
        public final TextView i;
        public final TextView v;
        public final TextView w;
        public final TextView y;
        public final TextView[] z;

        public a(View view) {
            super(view);
            this.z = new TextView[]{(TextView) view.findViewById(R.id.r_bet_match_desc1), (TextView) view.findViewById(R.id.r_bet_match_desc2), (TextView) view.findViewById(R.id.r_bet_match_desc3), (TextView) view.findViewById(R.id.r_bet_match_desc4)};
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.r_bet_root);
            this.b = constraintLayout;
            this.a = (ConstraintLayout) view.findViewById(R.id.r_bet_title_layout);
            constraintLayout.setOnClickListener(this);
            this.c = (TextView) view.findViewById(R.id.r_bet_type);
            this.d = (TextView) view.findViewById(R.id.r_bet_status);
            this.e = (TextView) view.findViewById(R.id.r_bet_day);
            this.f = (TextView) view.findViewById(R.id.r_bet_date);
            this.i = (TextView) view.findViewById(R.id.r_bet_year);
            ((TextView) view.findViewById(R.id.r_bet_total_stake)).setText(sn5.b(g98.this.c, R.string.bet_history__total_stake_with_stake, a8b.d().trim()));
            this.v = (TextView) view.findViewById(R.id.r_bet_total_stake_value);
            this.w = (TextView) view.findViewById(R.id.r_bet_total_return);
            this.y = (TextView) view.findViewById(R.id.r_bet_total_return_value);
            this.A = (TextView) view.findViewById(R.id.r_bet_pending_desc);
            this.B = view.findViewById(R.id.r_bet_item_divider_line);
            this.C = view.findViewById(R.id.r_bet_top_divider_line);
            this.D = (TextView) view.findViewById(R.id.r_bet_flex_bet);
            this.E = view.findViewById(R.id.r_bet_odds_boost);
            this.F = (TextView) view.findViewById(R.id.r_bet_one_cut_bet);
            this.G = view.findViewById(R.id.r_bet_publish_state_container);
            this.H = (TextView) view.findViewById(R.id.r_bet_publish_button);
            this.I = (ProgressBar) view.findViewById(R.id.r_bet_publish_loading);
        }

        /* JADX WARN: Code duplicated, block: B:114:0x02d3  */
        /* JADX WARN: Code duplicated, block: B:116:0x02dd  */
        /* JADX WARN: Code duplicated, block: B:124:0x0312  */
        /* JADX WARN: Code duplicated, block: B:127:0x032d  */
        /* JADX WARN: Code duplicated, block: B:129:0x033d  */
        /* JADX WARN: Code duplicated, block: B:131:0x034f  */
        /* JADX WARN: Code duplicated, block: B:132:0x0352  */
        /* JADX WARN: Code duplicated, block: B:134:0x0384  */
        /* JADX WARN: Code duplicated, block: B:135:0x038f  */
        /* JADX WARN: Code duplicated, block: B:138:0x03b0  */
        /* JADX WARN: Code duplicated, block: B:142:0x03c7  */
        /* JADX WARN: Code duplicated, block: B:145:0x03e4  */
        /* JADX WARN: Code duplicated, block: B:146:0x03e6  */
        /* JADX WARN: Code duplicated, block: B:147:0x03f1  */
        /* JADX WARN: Code duplicated, block: B:148:0x03fc  */
        /* JADX WARN: Code duplicated, block: B:151:0x040c  */
        /* JADX WARN: Code duplicated, block: B:156:0x0430  */
        /* JADX WARN: Code duplicated, block: B:159:0x0439 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:162:0x044f  */
        /* JADX WARN: Code duplicated, block: B:164:0x045b  */
        /* JADX WARN: Code duplicated, block: B:166:0x0463  */
        /* JADX WARN: Code duplicated, block: B:173:0x0491  */
        /* JADX WARN: Code duplicated, block: B:175:0x049c  */
        /* JADX WARN: Code duplicated, block: B:176:0x04a0  */
        /* JADX WARN: Code duplicated, block: B:86:0x0244  */
        /* JADX WARN: Code duplicated, block: B:88:0x024e  */
        @Override // g98.d
        public final void a(int i) {
            String strB;
            String strP;
            Drawable drawable;
            boolean z;
            ProgressBar progressBar;
            View view;
            TextView textView;
            final RealBetHistoryOrderDto realBetHistoryOrderDto;
            int i2;
            TextView textView2;
            Drawable drawableC;
            TextView textView3;
            boolean zIsOneCutBet;
            TextView textView4;
            boolean zEquals;
            TextView textView5;
            String strB2;
            Integer combinationSize;
            List<RSelection> selections;
            int i3;
            int i4;
            int size;
            int i5;
            RSelection rSelection;
            int size2;
            int i6;
            Integer minToWin;
            Integer selectionSize;
            int i7 = i;
            g98 g98Var = g98.this;
            Activity activity = g98Var.c;
            int i8 = g98Var.i;
            ConstraintLayout constraintLayout = this.b;
            if (i8 == i7) {
                constraintLayout.setBackgroundColor(this.itemView.getContext().getColor(R.color.background_type1_tertiary));
            } else {
                constraintLayout.setBackgroundColor(0);
            }
            if (g98Var.f == 0) {
                i7++;
            }
            Object obj = g98Var.a.get(i7 - 1);
            if (obj instanceof rm7) {
                rm7 rm7Var = (rm7) obj;
                RealBetHistoryOrderDto realBetHistoryOrderDto2 = rm7Var.a;
                if (g98Var.d && realBetHistoryOrderDto2.getWinningStatus().intValue() != 20) {
                    b(false);
                    if (i7 < g98Var.a.size() && (g98Var.a.get(i7) instanceof rm7) && rm7Var.b) {
                        ((rm7) g98Var.a.get(i7)).b = true;
                        return;
                    }
                    return;
                }
                g98Var.b.put(i7, rm7Var);
                b(true);
                TextView[] textViewArr = this.z;
                for (TextView textView6 : textViewArr) {
                    textView6.setVisibility(8);
                }
                TextView textView7 = this.A;
                textView7.setVisibility(8);
                TextView textView8 = this.f;
                textView8.setVisibility(4);
                TextView textView9 = this.e;
                textView9.setVisibility(4);
                TextView textView10 = this.i;
                textView10.setVisibility(8);
                View view2 = this.B;
                view2.setVisibility(8);
                View view3 = this.C;
                view3.setVisibility(8);
                Boolean bool = Boolean.TRUE;
                boolean zEquals2 = bool.equals(realBetHistoryOrderDto2.getOddsBoosted());
                int i9 = i7;
                View view4 = this.E;
                if (zEquals2) {
                    view4.setVisibility(0);
                } else {
                    view4.setVisibility(8);
                }
                long jLongValue = realBetHistoryOrderDto2.getCreateTime().longValue();
                bwf0 bwf0Var = bwf0.a;
                textView9.setText(bwf0Var.a(jLongValue));
                textView9.setVisibility(rm7Var.b ? 0 : 4);
                textView8.setText(bwf0Var.v(realBetHistoryOrderDto2.getCreateTime().longValue()));
                textView8.setVisibility(rm7Var.b ? 0 : 4);
                textView10.setText(bwf0Var.x(realBetHistoryOrderDto2.getCreateTime().longValue()));
                textView10.setVisibility(rm7Var.c ? 0 : 8);
                if (i9 == 0) {
                    view3.setVisibility(8);
                } else {
                    view3.setVisibility(rm7Var.b ? 0 : 8);
                }
                view2.setVisibility(rm7Var.b ? 8 : 0);
                int color = activity.getColor(R.color.text_type1_tertiary);
                int color2 = activity.getColor(R.color.history_item_title_text);
                boolean zEquals3 = bool.equals(realBetHistoryOrderDto2.isPaymentInProgress());
                int iIntValue = zEquals3 ? 0 : realBetHistoryOrderDto2.getWinningStatus().intValue();
                TextView textView11 = this.c;
                if (iIntValue != 0) {
                    if (iIntValue != 5) {
                        if (iIntValue == 20) {
                            color = activity.getColor(R.color.brand_secondary);
                            color2 = c8i0.d(R.color.text_type2_primary, textView11);
                            String strP2 = bjb0.P(realBetHistoryOrderDto2.getTotalWinnings(), Locale.US);
                            WinStatusDisplayData winStatusDisplayDataA = rkf.a(activity, realBetHistoryOrderDto2.getSelections(), realBetHistoryOrderDto2.isPartialPayout(), this.itemView.getContext().getColor(R.color.text_type2_primary));
                            String strB3 = sn5.b(activity, winStatusDisplayDataA.title, new Object[0]);
                            drawable = winStatusDisplayDataA.iconDrawable;
                            strP = strP2;
                            strB = strB3;
                        } else if (iIntValue == 30) {
                            color = activity.getColor(R.color.text_type1_secondary);
                            color2 = c8i0.d(R.color.text_type2_primary, textView11);
                            strB = sn5.b(activity, R.string.bet_history__lost, new Object[0]);
                            strP = "0.00";
                        } else if (iIntValue == 40) {
                            strB = sn5.b(activity, R.string.bet_history__void, new Object[0]);
                            strP = bjb0.P(realBetHistoryOrderDto2.getTotalWinnings(), Locale.US);
                        } else if (iIntValue != 90) {
                            strB = "";
                        } else {
                            strB = sn5.b(activity, R.string.component_wap_share_bet__pending, new Object[0]);
                            Drawable drawableA = gr0.a(activity, R.drawable.ic_selection_status_pending);
                            textView7.setVisibility(0);
                            strP = "--";
                            drawable = drawableA;
                        }
                        TextView textView12 = this.d;
                        textView12.setText(strB);
                        textView12.setTextColor(color2);
                        textView12.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, iwh0.a(activity, R.drawable.spr_ic_keyboard_arrow_right_black_24dp, color2), (Drawable) null);
                        this.a.setBackgroundColor(color);
                        constraintLayout.setTag(realBetHistoryOrderDto2.getOrderId());
                        z = g98Var.v;
                        progressBar = this.I;
                        view = this.G;
                        textView = this.H;
                        if (z || TextUtils.isEmpty(realBetHistoryOrderDto2.getShareCode())) {
                            realBetHistoryOrderDto = realBetHistoryOrderDto2;
                            i2 = 8;
                            view.setVisibility(8);
                            progressBar.setVisibility(8);
                            textView.setVisibility(8);
                            textView.setOnClickListener(null);
                        } else {
                            view.setVisibility(0);
                            boolean z2 = rm7Var.d;
                            final boolean z3 = rm7Var.e;
                            progressBar.setVisibility(z2 ? 0 : 8);
                            textView.setVisibility(z2 ? 8 : 0);
                            textView.setEnabled(!z3);
                            textView.setText(sn5.c(textView, z3 ? R.string.sporty_bingo__published : R.string.common_functions__publish, new Object[0]));
                            textView.setTextColor(textView.getContext().getColor(z3 ? R.color.text_type1_secondary : R.color.text_type2_primary));
                            textView.setBackgroundResource(z3 ? R.drawable.bg_filled_line_type1_tertiary_2_radius : R.drawable.bg_filled_brand_secondary_2_radius_with_brand_secondary_disable_normal);
                            realBetHistoryOrderDto = realBetHistoryOrderDto2;
                            textView.setOnClickListener(new View.OnClickListener() { // from class: f98
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view5) {
                                    rm7 rm7Var2;
                                    ArrayList<hl30> arrayList;
                                    Object obj2;
                                    g98 g98Var2 = g98.this;
                                    if (g98Var2.w != null) {
                                        RealBetHistoryOrderDto realBetHistoryOrderDto3 = realBetHistoryOrderDto;
                                        if (TextUtils.isEmpty(realBetHistoryOrderDto3.getShareCode()) || z3) {
                                            return;
                                        }
                                        boolean z4 = (realBetHistoryOrderDto3.getUserNote() == null || TextUtils.isEmpty(realBetHistoryOrderDto3.getUserNote().getNoteText())) ? false : true;
                                        ChooseBetActivity chooseBetActivity = g98Var2.w;
                                        String orderId = realBetHistoryOrderDto3.getOrderId();
                                        String shareCode = realBetHistoryOrderDto3.getShareCode();
                                        chooseBetActivity.getClass();
                                        orderId.getClass();
                                        shareCode.getClass();
                                        if (chooseBetActivity.A1()) {
                                            rdd0 rdd0Var = chooseBetActivity.v;
                                            if (rdd0Var == null) {
                                                Intrinsics.n("sportyTrackingUseCase");
                                                throw null;
                                            }
                                            rdd0Var.a(pbd0.a, k00.d);
                                        }
                                        bn7 bn7VarZ1 = chooseBetActivity.z1();
                                        String str = z4 ? orderId : null;
                                        ku90<a> ku90Var = bn7VarZ1.d;
                                        Object value = bn7VarZ1.f.getValue();
                                        hw2.f fVar = value instanceof hw2.f ? (hw2.f) value : null;
                                        if (fVar == null || (arrayList = fVar.a) == null) {
                                            rm7Var2 = null;
                                        } else {
                                            ArrayList arrayList2 = new ArrayList();
                                            int size3 = arrayList.size();
                                            int i10 = 0;
                                            while (i10 < size3) {
                                                hl30 hl30Var = arrayList.get(i10);
                                                i10++;
                                                if (hl30Var instanceof rm7) {
                                                    arrayList2.add(hl30Var);
                                                }
                                            }
                                            int size4 = arrayList2.size();
                                            int i11 = 0;
                                            do {
                                                if (i11 >= size4) {
                                                    obj2 = null;
                                                    break;
                                                } else {
                                                    obj2 = arrayList2.get(i11);
                                                    i11++;
                                                }
                                            } while (!Intrinsics.g(((rm7) obj2).a.getOrderId(), orderId));
                                            rm7Var2 = (rm7) obj2;
                                        }
                                        if (rm7Var2 == null) {
                                            b.j(ku90Var, vch0.b);
                                            return;
                                        }
                                        if (rm7Var2.d || rm7Var2.e) {
                                            return;
                                        }
                                        if (StringsKt.U(shareCode)) {
                                            b.j(ku90Var, vch0.b);
                                        } else {
                                            bn7VarZ1.y1(orderId, new um7(0));
                                            ej5.c(o8i0.d(bn7VarZ1), null, null, new an7(bn7VarZ1, shareCode, str, orderId, null), 3);
                                        }
                                    }
                                }
                            });
                            i2 = 8;
                        }
                        textView2 = this.D;
                        textView2.setTextColor(color2);
                        textView2.setVisibility(i2);
                        if (realBetHistoryOrderDto.getOrderType().intValue() == 4) {
                            minToWin = realBetHistoryOrderDto.getMinToWin();
                            selectionSize = realBetHistoryOrderDto.getSelectionSize();
                            if (minToWin != null && minToWin.intValue() != -1 && selectionSize != null && selectionSize.intValue() != -1) {
                                textView2.setVisibility(0);
                                textView2.setText(sn5.c(textView2, R.string.cashout__flexi_label_vmintowin_of_vsize, String.valueOf(minToWin), String.valueOf(selectionSize)));
                            }
                        }
                        drawableC = gug0.c(this.itemView.getContext());
                        if (drawableC != null) {
                            drawableC.setTint(color2);
                        }
                        textView3 = this.F;
                        textView3.setCompoundDrawablesWithIntrinsicBounds(drawableC, (Drawable) null, (Drawable) null, (Drawable) null);
                        textView3.setVisibility(8);
                        zIsOneCutBet = realBetHistoryOrderDto.isOneCutBet();
                        textView4 = this.w;
                        if (zIsOneCutBet) {
                            textView3.setVisibility(0);
                            if (realBetHistoryOrderDto.getWinningStatus().intValue() == 20) {
                                size2 = realBetHistoryOrderDto.getSelections().size();
                                if (realBetHistoryOrderDto.isOneCutWin().booleanValue()) {
                                    i6 = size2 - 1;
                                } else {
                                    i6 = size2;
                                }
                                StringBuilder sb = new StringBuilder();
                                String strB4 = sn5.b(activity, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(i6), String.valueOf(size2));
                                sb.append(sn5.b(activity, R.string.component_wap_share_bet__total_return, new Object[0]));
                                sb.append(" (");
                                sb.append(strB4);
                                sb.append(")");
                                textView4.setText(sb);
                            } else {
                                textView4.setText(sn5.c(textView4, R.string.component_wap_share_bet__total_return, new Object[0]));
                            }
                        } else {
                            textView4.setText(sn5.c(textView4, R.string.component_wap_share_bet__total_return, new Object[0]));
                        }
                        this.v.setText(bjb0.P(realBetHistoryOrderDto.getTotalStake(), Locale.US));
                        zEquals = TextUtils.equals(strP, "--");
                        textView5 = this.y;
                        if (!zEquals || TextUtils.equals(strP, "0.00")) {
                            textView5.setTextColor(c8i0.d(R.color.text_type1_primary, textView5));
                            textView5.setTextSize(12.0f);
                        } else {
                            textView5.setTextColor(c8i0.d(R.color.brand_quaternary, textView5));
                            textView5.setTextSize(20.0f);
                        }
                        textView5.setText(strP);
                        switch (realBetHistoryOrderDto.getOrderType().intValue()) {
                            case 1:
                                strB2 = sn5.b(activity, R.string.component_betslip__singles, new Object[0]);
                                break;
                            case 2:
                            case 4:
                            case 5:
                            case 6:
                                strB2 = sn5.b(activity, R.string.bet_history__multiple, new Object[0]);
                                break;
                            case 3:
                                strB2 = sn5.b(activity, R.string.common_functions__system, new Object[0]);
                                break;
                            default:
                                strB2 = null;
                                break;
                        }
                        combinationSize = realBetHistoryOrderDto.getCombinationSize();
                        if (combinationSize != null && combinationSize.intValue() > 1) {
                            strB2 = strB2 + "(x" + combinationSize + ")";
                        }
                        selections = realBetHistoryOrderDto.getSelections();
                        if (selections != null) {
                            i4 = 0;
                            for (i3 = 0; i3 < selections.size() && i3 < 3; i3++) {
                                textViewArr[i3].setVisibility(0);
                                rSelection = selections.get(i3);
                                if (b3.T(rSelection.eventId)) {
                                    textViewArr[i3].setText(rSelection.tournamentName);
                                } else {
                                    if (!TextUtils.isEmpty(rSelection.home) || TextUtils.isEmpty(rSelection.away)) {
                                        textViewArr[i3].setVisibility(8);
                                    } else {
                                        textViewArr[i3].setText(sn5.b(activity, R.string.app_common__variable_v, rSelection.home, rSelection.away));
                                    }
                                }
                                i4++;
                            }
                            size = selections.size() - i4;
                            if (size > 0) {
                                textViewArr[3].setVisibility(0);
                                TextView textView13 = textViewArr[3];
                                if (size > 1) {
                                    i5 = R.string.app_common__and_other_matches;
                                } else {
                                    i5 = R.string.app_common__and_other_match;
                                }
                                textView13.setText(sn5.b(activity, i5, Integer.valueOf(size)));
                            }
                        }
                        textView11.setText(strB2);
                        textView11.setTextColor(color2);
                    }
                    strB = sn5.b(activity, R.string.bet_history__partial_win, new Object[0]);
                    strP = bjb0.P(realBetHistoryOrderDto2.getTotalWinnings(), Locale.US);
                    drawable = null;
                    TextView textView14 = this.d;
                    textView14.setText(strB);
                    textView14.setTextColor(color2);
                    textView14.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, iwh0.a(activity, R.drawable.spr_ic_keyboard_arrow_right_black_24dp, color2), (Drawable) null);
                    this.a.setBackgroundColor(color);
                    constraintLayout.setTag(realBetHistoryOrderDto2.getOrderId());
                    z = g98Var.v;
                    progressBar = this.I;
                    view = this.G;
                    textView = this.H;
                    if (z) {
                        realBetHistoryOrderDto = realBetHistoryOrderDto2;
                        i2 = 8;
                        view.setVisibility(8);
                        progressBar.setVisibility(8);
                        textView.setVisibility(8);
                        textView.setOnClickListener(null);
                    } else {
                        realBetHistoryOrderDto = realBetHistoryOrderDto2;
                        i2 = 8;
                        view.setVisibility(8);
                        progressBar.setVisibility(8);
                        textView.setVisibility(8);
                        textView.setOnClickListener(null);
                    }
                    textView2 = this.D;
                    textView2.setTextColor(color2);
                    textView2.setVisibility(i2);
                    if (realBetHistoryOrderDto.getOrderType().intValue() == 4) {
                        minToWin = realBetHistoryOrderDto.getMinToWin();
                        selectionSize = realBetHistoryOrderDto.getSelectionSize();
                        if (minToWin != null) {
                            textView2.setVisibility(0);
                            textView2.setText(sn5.c(textView2, R.string.cashout__flexi_label_vmintowin_of_vsize, String.valueOf(minToWin), String.valueOf(selectionSize)));
                        }
                    }
                    drawableC = gug0.c(this.itemView.getContext());
                    if (drawableC != null) {
                        drawableC.setTint(color2);
                    }
                    textView3 = this.F;
                    textView3.setCompoundDrawablesWithIntrinsicBounds(drawableC, (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setVisibility(8);
                    zIsOneCutBet = realBetHistoryOrderDto.isOneCutBet();
                    textView4 = this.w;
                    if (zIsOneCutBet) {
                        textView3.setVisibility(0);
                        if (realBetHistoryOrderDto.getWinningStatus().intValue() == 20) {
                            size2 = realBetHistoryOrderDto.getSelections().size();
                            if (realBetHistoryOrderDto.isOneCutWin().booleanValue()) {
                                i6 = size2 - 1;
                            } else {
                                i6 = size2;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            String strB5 = sn5.b(activity, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(i6), String.valueOf(size2));
                            sb2.append(sn5.b(activity, R.string.component_wap_share_bet__total_return, new Object[0]));
                            sb2.append(" (");
                            sb2.append(strB5);
                            sb2.append(")");
                            textView4.setText(sb2);
                        } else {
                            textView4.setText(sn5.c(textView4, R.string.component_wap_share_bet__total_return, new Object[0]));
                        }
                    } else {
                        textView4.setText(sn5.c(textView4, R.string.component_wap_share_bet__total_return, new Object[0]));
                    }
                    this.v.setText(bjb0.P(realBetHistoryOrderDto.getTotalStake(), Locale.US));
                    zEquals = TextUtils.equals(strP, "--");
                    textView5 = this.y;
                    if (zEquals) {
                        textView5.setTextColor(c8i0.d(R.color.text_type1_primary, textView5));
                        textView5.setTextSize(12.0f);
                    } else {
                        textView5.setTextColor(c8i0.d(R.color.text_type1_primary, textView5));
                        textView5.setTextSize(12.0f);
                    }
                    textView5.setText(strP);
                    switch (realBetHistoryOrderDto.getOrderType().intValue()) {
                        case 1:
                            strB2 = sn5.b(activity, R.string.component_betslip__singles, new Object[0]);
                            break;
                        case 2:
                        case 4:
                        case 5:
                        case 6:
                            strB2 = sn5.b(activity, R.string.bet_history__multiple, new Object[0]);
                            break;
                        case 3:
                            strB2 = sn5.b(activity, R.string.common_functions__system, new Object[0]);
                            break;
                        default:
                            strB2 = null;
                            break;
                    }
                    combinationSize = realBetHistoryOrderDto.getCombinationSize();
                    if (combinationSize != null) {
                        strB2 = strB2 + "(x" + combinationSize + ")";
                    }
                    selections = realBetHistoryOrderDto.getSelections();
                    if (selections != null) {
                        i4 = 0;
                        while (i3 < selections.size()) {
                            textViewArr[i3].setVisibility(0);
                            rSelection = selections.get(i3);
                            if (b3.T(rSelection.eventId)) {
                                textViewArr[i3].setText(rSelection.tournamentName);
                            } else {
                                if (TextUtils.isEmpty(rSelection.home)) {
                                }
                                textViewArr[i3].setVisibility(8);
                            }
                            i4++;
                        }
                        size = selections.size() - i4;
                        if (size > 0) {
                            textViewArr[3].setVisibility(0);
                            TextView textView15 = textViewArr[3];
                            if (size > 1) {
                                i5 = R.string.app_common__and_other_matches;
                            } else {
                                i5 = R.string.app_common__and_other_match;
                            }
                            textView15.setText(sn5.b(activity, i5, Integer.valueOf(size)));
                        }
                    }
                    textView11.setText(strB2);
                    textView11.setTextColor(color2);
                }
                strB = sn5.b(activity, zEquals3 ? R.string.bet_history__paying : R.string.component_wap_share_bet__running, new Object[0]);
                strP = "--";
                drawable = null;
                TextView textView16 = this.d;
                textView16.setText(strB);
                textView16.setTextColor(color2);
                textView16.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, iwh0.a(activity, R.drawable.spr_ic_keyboard_arrow_right_black_24dp, color2), (Drawable) null);
                this.a.setBackgroundColor(color);
                constraintLayout.setTag(realBetHistoryOrderDto2.getOrderId());
                z = g98Var.v;
                progressBar = this.I;
                view = this.G;
                textView = this.H;
                if (z) {
                    realBetHistoryOrderDto = realBetHistoryOrderDto2;
                    i2 = 8;
                    view.setVisibility(8);
                    progressBar.setVisibility(8);
                    textView.setVisibility(8);
                    textView.setOnClickListener(null);
                } else {
                    realBetHistoryOrderDto = realBetHistoryOrderDto2;
                    i2 = 8;
                    view.setVisibility(8);
                    progressBar.setVisibility(8);
                    textView.setVisibility(8);
                    textView.setOnClickListener(null);
                }
                textView2 = this.D;
                textView2.setTextColor(color2);
                textView2.setVisibility(i2);
                if (realBetHistoryOrderDto.getOrderType().intValue() == 4) {
                    minToWin = realBetHistoryOrderDto.getMinToWin();
                    selectionSize = realBetHistoryOrderDto.getSelectionSize();
                    if (minToWin != null) {
                        textView2.setVisibility(0);
                        textView2.setText(sn5.c(textView2, R.string.cashout__flexi_label_vmintowin_of_vsize, String.valueOf(minToWin), String.valueOf(selectionSize)));
                    }
                }
                drawableC = gug0.c(this.itemView.getContext());
                if (drawableC != null) {
                    drawableC.setTint(color2);
                }
                textView3 = this.F;
                textView3.setCompoundDrawablesWithIntrinsicBounds(drawableC, (Drawable) null, (Drawable) null, (Drawable) null);
                textView3.setVisibility(8);
                zIsOneCutBet = realBetHistoryOrderDto.isOneCutBet();
                textView4 = this.w;
                if (zIsOneCutBet) {
                    textView3.setVisibility(0);
                    if (realBetHistoryOrderDto.getWinningStatus().intValue() == 20) {
                        size2 = realBetHistoryOrderDto.getSelections().size();
                        if (realBetHistoryOrderDto.isOneCutWin().booleanValue()) {
                            i6 = size2 - 1;
                        } else {
                            i6 = size2;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        String strB6 = sn5.b(activity, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(i6), String.valueOf(size2));
                        sb3.append(sn5.b(activity, R.string.component_wap_share_bet__total_return, new Object[0]));
                        sb3.append(" (");
                        sb3.append(strB6);
                        sb3.append(")");
                        textView4.setText(sb3);
                    } else {
                        textView4.setText(sn5.c(textView4, R.string.component_wap_share_bet__total_return, new Object[0]));
                    }
                } else {
                    textView4.setText(sn5.c(textView4, R.string.component_wap_share_bet__total_return, new Object[0]));
                }
                this.v.setText(bjb0.P(realBetHistoryOrderDto.getTotalStake(), Locale.US));
                zEquals = TextUtils.equals(strP, "--");
                textView5 = this.y;
                if (zEquals) {
                    textView5.setTextColor(c8i0.d(R.color.text_type1_primary, textView5));
                    textView5.setTextSize(12.0f);
                } else {
                    textView5.setTextColor(c8i0.d(R.color.text_type1_primary, textView5));
                    textView5.setTextSize(12.0f);
                }
                textView5.setText(strP);
                switch (realBetHistoryOrderDto.getOrderType().intValue()) {
                    case 1:
                        strB2 = sn5.b(activity, R.string.component_betslip__singles, new Object[0]);
                        break;
                    case 2:
                    case 4:
                    case 5:
                    case 6:
                        strB2 = sn5.b(activity, R.string.bet_history__multiple, new Object[0]);
                        break;
                    case 3:
                        strB2 = sn5.b(activity, R.string.common_functions__system, new Object[0]);
                        break;
                    default:
                        strB2 = null;
                        break;
                }
                combinationSize = realBetHistoryOrderDto.getCombinationSize();
                if (combinationSize != null) {
                    strB2 = strB2 + "(x" + combinationSize + ")";
                }
                selections = realBetHistoryOrderDto.getSelections();
                if (selections != null) {
                    i4 = 0;
                    while (i3 < selections.size()) {
                        textViewArr[i3].setVisibility(0);
                        rSelection = selections.get(i3);
                        if (b3.T(rSelection.eventId)) {
                            textViewArr[i3].setText(rSelection.tournamentName);
                        } else {
                            if (TextUtils.isEmpty(rSelection.home)) {
                            }
                            textViewArr[i3].setVisibility(8);
                        }
                        i4++;
                    }
                    size = selections.size() - i4;
                    if (size > 0) {
                        textViewArr[3].setVisibility(0);
                        TextView textView17 = textViewArr[3];
                        if (size > 1) {
                            i5 = R.string.app_common__and_other_matches;
                        } else {
                            i5 = R.string.app_common__and_other_match;
                        }
                        textView17.setText(sn5.b(activity, i5, Integer.valueOf(size)));
                    }
                }
                textView11.setText(strB2);
                textView11.setTextColor(color2);
            }
        }

        public final void b(boolean z) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) this.itemView.getLayoutParams();
            if (z) {
                ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
                ((ViewGroup.MarginLayoutParams) layoutParams).width = -1;
                this.itemView.setVisibility(0);
            } else {
                this.itemView.setVisibility(8);
                ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
            }
            this.itemView.setLayoutParams(layoutParams);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int bindingAdapterPosition = getBindingAdapterPosition();
            g98 g98Var = g98.this;
            int i = g98Var.i;
            if (i == bindingAdapterPosition) {
                g98Var.i = -1;
            } else {
                g98Var.i = bindingAdapterPosition;
                g98Var.notifyItemChanged(i);
            }
            g98Var.notifyItemChanged(bindingAdapterPosition);
            ChooseBetActivity chooseBetActivity = g98Var.w;
            if (chooseBetActivity != null) {
                String str = g98Var.i != -1 ? (String) view.getTag() : null;
                chooseBetActivity.e = str;
                chooseBetActivity.z1().y.setValue(str);
            }
        }
    }

    public class b extends d {
        public final ProgressBar a;
        public final TextView b;
        public final View c;
        public nr30 d;

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b bVar = b.this;
                g98 g98Var = g98.this;
                nr30 nr30Var = bVar.d;
                if (nr30Var == null || nr30Var.d == 0 || g98Var.e) {
                    return;
                }
                Intent intent = new Intent(g98Var.c, (Class<?>) PrevBetHistoryActivity.class);
                intent.putExtra("SETTLED", bVar.d.d);
                yrh0.s(g98Var.c, intent, true);
            }
        }

        /* JADX INFO: renamed from: g98$b$b, reason: collision with other inner class name */
        public class ViewOnClickListenerC0595b implements View.OnClickListener {
            public ViewOnClickListenerC0595b() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b bVar = b.this;
                nr30 nr30Var = bVar.d;
                if (nr30Var == null || !nr30Var.a) {
                    return;
                }
                bVar.b();
            }
        }

        public b(View view) {
            super(view);
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.results_loading_progress);
            this.a = progressBar;
            progressBar.getIndeterminateDrawable().setColorFilter(view.getContext().getColor(R.color.text_type2_tertiary), PorterDuff.Mode.SRC_IN);
            TextView textView = (TextView) view.findViewById(R.id.results_load_more);
            this.b = textView;
            View viewFindViewById = view.findViewById(R.id.view_older_order);
            this.c = viewFindViewById;
            viewFindViewById.setOnClickListener(new a());
            textView.setOnClickListener(new ViewOnClickListenerC0595b());
        }

        @Override // g98.d
        public final void a(int i) {
            g98 g98Var = g98.this;
            if (g98Var.f == 0) {
                i++;
            }
            int i2 = i - 1;
            if (g98Var.a.get(i2) instanceof nr30) {
                this.d = (nr30) g98Var.a.get(i2);
                b();
            }
        }

        public final void b() {
            boolean z = this.d.a;
            View view = this.c;
            g98 g98Var = g98.this;
            TextView textView = this.b;
            ProgressBar progressBar = this.a;
            if (!z) {
                progressBar.setVisibility(8);
                textView.setVisibility(0);
                view.setVisibility(8);
                if (this.d.h) {
                    textView.setText(sn5.b(g98Var.c, R.string.bet_history__no_more_tickets, new Object[0]));
                    return;
                } else if (g98Var.a.size() == 0 || g98Var.b.size() != 0) {
                    textView.setText("");
                    return;
                } else {
                    textView.setText(sn5.c(textView, R.string.bet_history__no_tickets_available, new Object[0]));
                    return;
                }
            }
            progressBar.setVisibility(0);
            textView.setVisibility(8);
            view.setVisibility(8);
            nr30 nr30Var = this.d;
            if (nr30Var.b == null) {
                if (g98Var.v) {
                    nr30Var.b = ap0.f().j(10, this.d.f);
                } else {
                    h3z h3zVarF = ap0.f();
                    int i = this.d.d;
                    Integer numValueOf = Integer.valueOf(i != -1 ? i : 10);
                    this.d.getClass();
                    nr30 nr30Var2 = this.d;
                    nr30Var.b = h3zVarF.i(numValueOf, 10, null, nr30Var2.f, null, nr30Var2.e, null);
                }
                this.d.b.G(new h98(this));
            }
        }
    }

    public abstract class d extends RecyclerView.d0 {
        public abstract void a(int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        int i = this.f;
        ArrayList arrayList = this.a;
        return i != 0 ? arrayList.size() + 1 : arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        if (this.f == 0) {
            return ((hl30) this.a.get(i)).a();
        }
        if (i == 0) {
            return -1;
        }
        return ((hl30) this.a.get(i - 1)).a();
    }

    public final void i() {
        nr30 nr30Var;
        su5<BaseResponse<ROrder>> su5Var;
        ArrayList arrayList = this.a;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        hl30 hl30Var = (hl30) rh6.a(1, this.a);
        if (!(hl30Var instanceof nr30) || (su5Var = (nr30Var = (nr30) hl30Var).b) == null) {
            return;
        }
        su5Var.cancel();
        nr30Var.b = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        ((d) d0Var).a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == -1) {
            return new c(dzc.a(viewGroup, R.layout.spr_show_recent_item, viewGroup, false));
        }
        if (i == 1) {
            return new a(dzc.a(viewGroup, R.layout.common_history_item, viewGroup, false));
        }
        if (i == 2) {
            return new b(dzc.a(viewGroup, R.layout.spr_bets_load_more_item, viewGroup, false));
        }
        eub.a("RTicketListAdapter viewHolder return null,type:" + i);
        return null;
    }

    public class c extends d {

        public class a implements CompoundButton.OnCheckedChangeListener {
            public a() {
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                g98 g98Var = g98.this;
                g98Var.b.clear();
                g98Var.d = z;
                g98Var.notifyDataSetChanged();
            }
        }

        public c(View view) {
            super(view);
            ToggleButton toggleButton = (ToggleButton) view.findViewById(R.id.win_switch);
            toggleButton.setChecked(false);
            toggleButton.setOnCheckedChangeListener(new a());
        }

        @Override // g98.d
        public final void a(int i) {
        }
    }
}
