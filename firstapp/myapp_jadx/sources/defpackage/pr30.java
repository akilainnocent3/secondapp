package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.bethistory.data.dto.RealBetHistoryOrderDto;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.PrevBetHistoryActivity;
import com.sportybet.plugin.realsports.data.RSelection;
import com.sportybet.plugin.realsports.data.WinStatusDisplayData;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class pr30 extends RecyclerView.f<cz1> {
    public ArrayList a;
    public SparseArray<hl30> b;
    public Activity c;
    public boolean d;
    public String e;

    /* JADX INFO: loaded from: classes5.dex */
    public class a extends cz1 implements View.OnClickListener {
        public final TextView A;
        public final View B;
        public final ConstraintLayout C;
        public final View D;
        public final TextView E;
        public final View F;
        public final TextView G;
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
            ((TextView) view.findViewById(R.id.r_bet_total_stake)).setText(sn5.c(view, R.string.bet_history__total_stake_with_stake, a8b.d().trim()));
            this.v = (TextView) view.findViewById(R.id.r_bet_total_stake_value);
            this.w = (TextView) view.findViewById(R.id.r_bet_total_return);
            this.y = (TextView) view.findViewById(R.id.r_bet_total_return_value);
            this.A = (TextView) view.findViewById(R.id.r_bet_pending_desc);
            this.C = (ConstraintLayout) view.findViewById(R.id.r_bet_item_top_divider_line_layout);
            this.B = view.findViewById(R.id.r_bet_item_divider_line);
            this.D = view.findViewById(R.id.r_bet_top_divider_line);
            this.E = (TextView) view.findViewById(R.id.r_bet_flex_bet);
            this.G = (TextView) view.findViewById(R.id.r_bet_one_cut_bet);
            this.F = view.findViewById(R.id.r_bet_odds_boost);
        }

        /* JADX WARN: Code duplicated, block: B:102:0x032d  */
        /* JADX WARN: Code duplicated, block: B:105:0x0359  */
        /* JADX WARN: Code duplicated, block: B:107:0x035c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:108:0x035e  */
        /* JADX WARN: Code duplicated, block: B:110:0x0361  */
        /* JADX WARN: Code duplicated, block: B:113:0x0366  */
        /* JADX WARN: Code duplicated, block: B:114:0x0368  */
        /* JADX WARN: Code duplicated, block: B:116:0x037d  */
        /* JADX WARN: Code duplicated, block: B:119:0x038d  */
        /* JADX WARN: Code duplicated, block: B:120:0x0396  */
        /* JADX WARN: Code duplicated, block: B:122:0x0399  */
        /* JADX WARN: Code duplicated, block: B:125:0x03b6  */
        /* JADX WARN: Code duplicated, block: B:128:0x03be A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:131:0x03d4  */
        /* JADX WARN: Code duplicated, block: B:133:0x03e0  */
        /* JADX WARN: Code duplicated, block: B:135:0x03e8  */
        /* JADX WARN: Code duplicated, block: B:142:0x0416  */
        /* JADX WARN: Code duplicated, block: B:144:0x0420  */
        /* JADX WARN: Code duplicated, block: B:145:0x0424  */
        /* JADX WARN: Code duplicated, block: B:74:0x024b  */
        /* JADX WARN: Code duplicated, block: B:76:0x0255  */
        /* JADX WARN: Code duplicated, block: B:84:0x028a  */
        /* JADX WARN: Code duplicated, block: B:87:0x02a4  */
        /* JADX WARN: Code duplicated, block: B:89:0x02b2  */
        /* JADX WARN: Code duplicated, block: B:91:0x02c4  */
        /* JADX WARN: Code duplicated, block: B:92:0x02c7  */
        /* JADX WARN: Code duplicated, block: B:94:0x02fb  */
        /* JADX WARN: Code duplicated, block: B:95:0x0306  */
        /* JADX WARN: Code duplicated, block: B:98:0x031b  */
        /* JADX WARN: Instruction removed from duplicated block: B:122:0x0399, please report this as an issue */
        @Override // defpackage.cz1
        public final void a(int i) {
            int i2;
            String strB;
            int iD;
            String strP;
            int color;
            Drawable drawable;
            TextView textView;
            Drawable drawableC;
            TextView textView2;
            boolean zIsOneCutBet;
            TextView textView3;
            boolean zEquals;
            TextView textView4;
            int iIntValue;
            String strB2;
            int iIntValue2;
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
            String strP2;
            int i7 = i + 1;
            Context context = this.itemView.getContext();
            pr30 pr30Var = pr30.this;
            Object obj = pr30Var.a.get(i);
            if (obj instanceof vq30) {
                vq30 vq30Var = (vq30) obj;
                RealBetHistoryOrderDto realBetHistoryOrderDto = vq30Var.a;
                pr30Var.b.put(i7, vq30Var);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) this.itemView.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
                ((ViewGroup.MarginLayoutParams) layoutParams).width = -1;
                this.itemView.setVisibility(0);
                this.itemView.setLayoutParams(layoutParams);
                int color2 = this.itemView.getContext().getColor(R.color.text_type1_tertiary);
                int color3 = this.itemView.getContext().getColor(R.color.custom_text_type2_primary_type2);
                TextView[] textViewArr = this.z;
                for (TextView textView5 : textViewArr) {
                    textView5.setVisibility(8);
                }
                TextView textView6 = this.A;
                textView6.setVisibility(8);
                TextView textView7 = this.f;
                textView7.setVisibility(4);
                TextView textView8 = this.e;
                textView8.setVisibility(4);
                TextView textView9 = this.i;
                textView9.setVisibility(8);
                ConstraintLayout constraintLayout = this.C;
                constraintLayout.setVisibility(8);
                View view = this.B;
                view.setVisibility(8);
                View view2 = this.D;
                view2.setVisibility(8);
                Boolean bool = Boolean.TRUE;
                boolean zEquals2 = bool.equals(realBetHistoryOrderDto.getOddsBoosted());
                View view3 = this.F;
                if (zEquals2) {
                    view3.setVisibility(0);
                } else {
                    view3.setVisibility(8);
                }
                long jLongValue = realBetHistoryOrderDto.getCreateTime().longValue();
                bwf0 bwf0Var = bwf0.a;
                textView8.setText(bwf0Var.a(jLongValue));
                textView8.setVisibility(vq30Var.b ? 0 : 4);
                textView7.setText(bwf0Var.v(realBetHistoryOrderDto.getCreateTime().longValue()));
                textView7.setVisibility(vq30Var.b ? 0 : 4);
                textView9.setText(bwf0Var.x(realBetHistoryOrderDto.getCreateTime().longValue()));
                textView9.setVisibility(vq30Var.c ? 0 : 8);
                if (i7 == 2) {
                    i2 = 8;
                    constraintLayout.setVisibility(8);
                } else {
                    i2 = 8;
                    constraintLayout.setVisibility(vq30Var.c ? 0 : 8);
                }
                if (i7 == 0) {
                    view2.setVisibility(i2);
                } else {
                    view2.setVisibility(vq30Var.b ? 0 : 8);
                }
                view.setVisibility(vq30Var.b ? 8 : 0);
                boolean zEquals3 = bool.equals(realBetHistoryOrderDto.isPaymentInProgress());
                int iIntValue3 = zEquals3 ? 0 : realBetHistoryOrderDto.getWinningStatus().intValue();
                TextView textView10 = this.c;
                if (iIntValue3 != 0) {
                    if (iIntValue3 != 5) {
                        if (iIntValue3 == 20) {
                            boolean zIsPartialPayout = realBetHistoryOrderDto.isPartialPayout();
                            iD = c8i0.d(R.color.text_type2_primary, textView10);
                            int color4 = context.getColor(R.color.brand_secondary);
                            strP = bjb0.P(realBetHistoryOrderDto.getTotalWinnings(), Locale.US);
                            WinStatusDisplayData winStatusDisplayDataA = rkf.a(context, realBetHistoryOrderDto.getSelections(), zIsPartialPayout, this.itemView.getContext().getColor(R.color.text_type2_primary));
                            String strB3 = sn5.b(context, winStatusDisplayDataA.title, new Object[0]);
                            drawable = winStatusDisplayDataA.iconDrawable;
                            strB = strB3;
                            color = color4;
                        } else if (iIntValue3 != 30) {
                            if (iIntValue3 == 40) {
                                strB = sn5.b(context, R.string.bet_history__void, new Object[0]);
                                strP2 = bjb0.P(realBetHistoryOrderDto.getTotalWinnings(), Locale.US);
                            } else if (iIntValue3 != 90) {
                                strB = "";
                            } else {
                                strB = sn5.b(context, R.string.component_wap_share_bet__pending, new Object[0]);
                                Drawable drawableA = gr0.a(context, R.drawable.ic_selection_status_pending);
                                textView6.setVisibility(0);
                                strP = "--";
                                drawable = drawableA;
                            }
                            color = color2;
                            iD = color3;
                        } else {
                            int iD2 = c8i0.d(R.color.text_type2_primary, textView10);
                            String strB4 = sn5.b(context, R.string.bet_history__lost, new Object[0]);
                            strP = "0.00";
                            color = context.getColor(R.color.text_type1_secondary);
                            iD = iD2;
                            strB = strB4;
                            drawable = null;
                        }
                        TextView textView11 = this.d;
                        textView11.setText(strB);
                        textView11.setTextColor(iD);
                        textView11.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, iwh0.a(context, R.drawable.spr_ic_keyboard_arrow_right_black_24dp, iD), (Drawable) null);
                        this.a.setBackgroundColor(color);
                        this.b.setTag(realBetHistoryOrderDto.getOrderId());
                        textView = this.E;
                        textView.setTextColor(iD);
                        textView.setVisibility(8);
                        if (realBetHistoryOrderDto.getOrderType().intValue() == 4) {
                            minToWin = realBetHistoryOrderDto.getMinToWin();
                            selectionSize = realBetHistoryOrderDto.getSelectionSize();
                            if (minToWin != null && minToWin.intValue() != -1 && selectionSize != null && selectionSize.intValue() != -1) {
                                textView.setVisibility(0);
                                textView.setText(sn5.c(textView, R.string.cashout__flexi_label_vmintowin_of_vsize, String.valueOf(minToWin), String.valueOf(selectionSize)));
                            }
                        }
                        drawableC = gug0.c(this.itemView.getContext());
                        if (drawableC != null) {
                            drawableC.setTint(iD);
                        }
                        textView2 = this.G;
                        textView2.setCompoundDrawablesWithIntrinsicBounds(drawableC, (Drawable) null, (Drawable) null, (Drawable) null);
                        textView2.setVisibility(8);
                        zIsOneCutBet = realBetHistoryOrderDto.isOneCutBet();
                        textView3 = this.w;
                        if (zIsOneCutBet) {
                            textView2.setVisibility(0);
                            if (realBetHistoryOrderDto.getWinningStatus().intValue() == 20) {
                                size2 = realBetHistoryOrderDto.getSelections().size();
                                if (realBetHistoryOrderDto.isOneCutWin().booleanValue()) {
                                    i6 = size2 - 1;
                                } else {
                                    i6 = size2;
                                }
                                StringBuilder sb = new StringBuilder();
                                String strB5 = sn5.b(context, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(i6), String.valueOf(size2));
                                sb.append(sn5.b(pr30Var.c, R.string.component_wap_share_bet__total_return, new Object[0]));
                                sb.append(" (");
                                sb.append(strB5);
                                sb.append(")");
                                textView3.setText(sb);
                            } else {
                                textView3.setText(sn5.c(textView3, R.string.component_wap_share_bet__total_return, new Object[0]));
                            }
                        } else {
                            textView3.setText(sn5.c(textView3, R.string.component_wap_share_bet__total_return, new Object[0]));
                        }
                        zEquals = TextUtils.equals(strP, "--");
                        textView4 = this.y;
                        if (!zEquals || TextUtils.equals(strP, "0.00")) {
                            textView4.setTextColor(context.getColor(R.color.text_type1_primary));
                        } else {
                            textView4.setTextColor(context.getColor(R.color.brand_quaternary));
                        }
                        textView4.setText(strP);
                        String strP3 = bjb0.P(realBetHistoryOrderDto.getTotalStake(), Locale.US);
                        TextView textView12 = this.v;
                        textView12.setText(strP3);
                        textView12.setTextColor(context.getColor(R.color.text_type1_primary));
                        iIntValue = realBetHistoryOrderDto.getOrderType().intValue();
                        if (iIntValue == 1) {
                            strB2 = sn5.b(context, R.string.component_betslip__singles, new Object[0]);
                        } else if (iIntValue != 2) {
                            if (iIntValue != 3) {
                                strB2 = (iIntValue != 4 || iIntValue == 5) ? sn5.b(context, R.string.bet_history__multiple, new Object[0]) : null;
                            } else {
                                strB2 = sn5.b(context, R.string.common_functions__system, new Object[0]);
                            }
                        }
                        if (realBetHistoryOrderDto.getCombinationSize() != null) {
                            iIntValue2 = realBetHistoryOrderDto.getCombinationSize().intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        if (iIntValue2 > 1) {
                            strB2 = strB2 + "(x" + iIntValue2 + ")";
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
                                        textViewArr[i3].setText(sn5.b(context, R.string.app_common__variable_v, rSelection.home, rSelection.away));
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
                                textView13.setText(sn5.b(context, i5, Integer.valueOf(size)));
                            }
                        }
                        textView10.setTextColor(iD);
                        textView10.setText(strB2);
                    }
                    strB = sn5.b(context, R.string.bet_history__partial_win, new Object[0]);
                    strP2 = bjb0.P(realBetHistoryOrderDto.getTotalWinnings(), Locale.US);
                    drawable = null;
                    strP = strP2;
                    color = color2;
                    iD = color3;
                    TextView textView14 = this.d;
                    textView14.setText(strB);
                    textView14.setTextColor(iD);
                    textView14.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, iwh0.a(context, R.drawable.spr_ic_keyboard_arrow_right_black_24dp, iD), (Drawable) null);
                    this.a.setBackgroundColor(color);
                    this.b.setTag(realBetHistoryOrderDto.getOrderId());
                    textView = this.E;
                    textView.setTextColor(iD);
                    textView.setVisibility(8);
                    if (realBetHistoryOrderDto.getOrderType().intValue() == 4) {
                        minToWin = realBetHistoryOrderDto.getMinToWin();
                        selectionSize = realBetHistoryOrderDto.getSelectionSize();
                        if (minToWin != null) {
                            textView.setVisibility(0);
                            textView.setText(sn5.c(textView, R.string.cashout__flexi_label_vmintowin_of_vsize, String.valueOf(minToWin), String.valueOf(selectionSize)));
                        }
                    }
                    drawableC = gug0.c(this.itemView.getContext());
                    if (drawableC != null) {
                        drawableC.setTint(iD);
                    }
                    textView2 = this.G;
                    textView2.setCompoundDrawablesWithIntrinsicBounds(drawableC, (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setVisibility(8);
                    zIsOneCutBet = realBetHistoryOrderDto.isOneCutBet();
                    textView3 = this.w;
                    if (zIsOneCutBet) {
                        textView2.setVisibility(0);
                        if (realBetHistoryOrderDto.getWinningStatus().intValue() == 20) {
                            size2 = realBetHistoryOrderDto.getSelections().size();
                            if (realBetHistoryOrderDto.isOneCutWin().booleanValue()) {
                                i6 = size2 - 1;
                            } else {
                                i6 = size2;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            String strB6 = sn5.b(context, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(i6), String.valueOf(size2));
                            sb2.append(sn5.b(pr30Var.c, R.string.component_wap_share_bet__total_return, new Object[0]));
                            sb2.append(" (");
                            sb2.append(strB6);
                            sb2.append(")");
                            textView3.setText(sb2);
                        } else {
                            textView3.setText(sn5.c(textView3, R.string.component_wap_share_bet__total_return, new Object[0]));
                        }
                    } else {
                        textView3.setText(sn5.c(textView3, R.string.component_wap_share_bet__total_return, new Object[0]));
                    }
                    zEquals = TextUtils.equals(strP, "--");
                    textView4 = this.y;
                    if (zEquals) {
                        textView4.setTextColor(context.getColor(R.color.text_type1_primary));
                    } else {
                        textView4.setTextColor(context.getColor(R.color.text_type1_primary));
                    }
                    textView4.setText(strP);
                    String strP4 = bjb0.P(realBetHistoryOrderDto.getTotalStake(), Locale.US);
                    TextView textView15 = this.v;
                    textView15.setText(strP4);
                    textView15.setTextColor(context.getColor(R.color.text_type1_primary));
                    iIntValue = realBetHistoryOrderDto.getOrderType().intValue();
                    if (iIntValue == 1) {
                        strB2 = sn5.b(context, R.string.component_betslip__singles, new Object[0]);
                    } else if (iIntValue != 2) {
                        if (iIntValue != 3) {
                            strB2 = sn5.b(context, R.string.common_functions__system, new Object[0]);
                        } else if (iIntValue != 4) {
                        }
                    }
                    if (realBetHistoryOrderDto.getCombinationSize() != null) {
                        iIntValue2 = realBetHistoryOrderDto.getCombinationSize().intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    if (iIntValue2 > 1) {
                        strB2 = strB2 + "(x" + iIntValue2 + ")";
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
                            TextView textView16 = textViewArr[3];
                            if (size > 1) {
                                i5 = R.string.app_common__and_other_matches;
                            } else {
                                i5 = R.string.app_common__and_other_match;
                            }
                            textView16.setText(sn5.b(context, i5, Integer.valueOf(size)));
                        }
                    }
                    textView10.setTextColor(iD);
                    textView10.setText(strB2);
                }
                strB = sn5.b(context, zEquals3 ? R.string.bet_history__paying : R.string.component_wap_share_bet__running, new Object[0]);
                strP = "--";
                drawable = null;
                color = color2;
                iD = color3;
                TextView textView17 = this.d;
                textView17.setText(strB);
                textView17.setTextColor(iD);
                textView17.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, iwh0.a(context, R.drawable.spr_ic_keyboard_arrow_right_black_24dp, iD), (Drawable) null);
                this.a.setBackgroundColor(color);
                this.b.setTag(realBetHistoryOrderDto.getOrderId());
                textView = this.E;
                textView.setTextColor(iD);
                textView.setVisibility(8);
                if (realBetHistoryOrderDto.getOrderType().intValue() == 4) {
                    minToWin = realBetHistoryOrderDto.getMinToWin();
                    selectionSize = realBetHistoryOrderDto.getSelectionSize();
                    if (minToWin != null) {
                        textView.setVisibility(0);
                        textView.setText(sn5.c(textView, R.string.cashout__flexi_label_vmintowin_of_vsize, String.valueOf(minToWin), String.valueOf(selectionSize)));
                    }
                }
                drawableC = gug0.c(this.itemView.getContext());
                if (drawableC != null) {
                    drawableC.setTint(iD);
                }
                textView2 = this.G;
                textView2.setCompoundDrawablesWithIntrinsicBounds(drawableC, (Drawable) null, (Drawable) null, (Drawable) null);
                textView2.setVisibility(8);
                zIsOneCutBet = realBetHistoryOrderDto.isOneCutBet();
                textView3 = this.w;
                if (zIsOneCutBet) {
                    textView2.setVisibility(0);
                    if (realBetHistoryOrderDto.getWinningStatus().intValue() == 20) {
                        size2 = realBetHistoryOrderDto.getSelections().size();
                        if (realBetHistoryOrderDto.isOneCutWin().booleanValue()) {
                            i6 = size2 - 1;
                        } else {
                            i6 = size2;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        String strB7 = sn5.b(context, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(i6), String.valueOf(size2));
                        sb3.append(sn5.b(pr30Var.c, R.string.component_wap_share_bet__total_return, new Object[0]));
                        sb3.append(" (");
                        sb3.append(strB7);
                        sb3.append(")");
                        textView3.setText(sb3);
                    } else {
                        textView3.setText(sn5.c(textView3, R.string.component_wap_share_bet__total_return, new Object[0]));
                    }
                } else {
                    textView3.setText(sn5.c(textView3, R.string.component_wap_share_bet__total_return, new Object[0]));
                }
                zEquals = TextUtils.equals(strP, "--");
                textView4 = this.y;
                if (zEquals) {
                    textView4.setTextColor(context.getColor(R.color.text_type1_primary));
                } else {
                    textView4.setTextColor(context.getColor(R.color.text_type1_primary));
                }
                textView4.setText(strP);
                String strP5 = bjb0.P(realBetHistoryOrderDto.getTotalStake(), Locale.US);
                TextView textView18 = this.v;
                textView18.setText(strP5);
                textView18.setTextColor(context.getColor(R.color.text_type1_primary));
                iIntValue = realBetHistoryOrderDto.getOrderType().intValue();
                if (iIntValue == 1) {
                    strB2 = sn5.b(context, R.string.component_betslip__singles, new Object[0]);
                } else if (iIntValue != 2) {
                    if (iIntValue != 3) {
                        strB2 = sn5.b(context, R.string.common_functions__system, new Object[0]);
                    } else if (iIntValue != 4) {
                    }
                }
                if (realBetHistoryOrderDto.getCombinationSize() != null) {
                    iIntValue2 = realBetHistoryOrderDto.getCombinationSize().intValue();
                } else {
                    iIntValue2 = 0;
                }
                if (iIntValue2 > 1) {
                    strB2 = strB2 + "(x" + iIntValue2 + ")";
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
                        TextView textView19 = textViewArr[3];
                        if (size > 1) {
                            i5 = R.string.app_common__and_other_matches;
                        } else {
                            i5 = R.string.app_common__and_other_match;
                        }
                        textView19.setText(sn5.b(context, i5, Integer.valueOf(size)));
                    }
                }
                textView10.setTextColor(iD);
                textView10.setText(strB2);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view instanceof ConstraintLayout) {
                String str = (String) view.getTag();
                Intent intent = new Intent(view.getContext(), (Class<?>) RSportsBetTicketDetailsActivity.class);
                intent.putExtra(AnalyticsParam.SOCIAL_ORDER_ID, str);
                yrh0.s(view.getContext(), intent, true);
            }
        }
    }

    public class b extends cz1 {
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
                pr30 pr30Var = pr30.this;
                nr30 nr30Var = bVar.d;
                if (nr30Var == null || nr30Var.d == 0 || pr30Var.d) {
                    return;
                }
                Intent intent = new Intent(pr30Var.c, (Class<?>) PrevBetHistoryActivity.class);
                intent.putExtra("SETTLED", bVar.d.d);
                yrh0.s(pr30Var.c, intent, true);
            }
        }

        /* JADX INFO: renamed from: pr30$b$b, reason: collision with other inner class name */
        public class ViewOnClickListenerC0982b implements View.OnClickListener {
            public ViewOnClickListenerC0982b() {
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
            textView.setOnClickListener(new ViewOnClickListenerC0982b());
        }

        @Override // defpackage.cz1
        public final void a(int i) {
            pr30 pr30Var = pr30.this;
            if (pr30Var.a.get(i) instanceof nr30) {
                this.d = (nr30) pr30Var.a.get(i);
                this.b.setText(sn5.b(pr30Var.c, R.string.bet_history__no_more_tickets, new Object[0]));
                b();
            }
        }

        public final void b() {
            pr30 pr30Var = pr30.this;
            Activity activity = pr30Var.c;
            boolean z = this.d.a;
            View view = this.c;
            TextView textView = this.b;
            ProgressBar progressBar = this.a;
            if (!z) {
                progressBar.setVisibility(8);
                textView.setVisibility(0);
                if (pr30Var.d || this.d.d != 10) {
                }
                view.setVisibility(8);
                if (this.d.h) {
                    textView.setText(sn5.b(activity, R.string.bet_history__no_more_tickets, new Object[0]));
                    return;
                } else if (pr30Var.a.size() == 0 || pr30Var.b.size() != 0) {
                    textView.setText("");
                    return;
                } else {
                    textView.setText(sn5.b(activity, R.string.bet_history__no_tickets_available, new Object[0]));
                    return;
                }
            }
            progressBar.setVisibility(0);
            textView.setVisibility(8);
            view.setVisibility(8);
            nr30 nr30Var = this.d;
            if (nr30Var.b == null) {
                h3z h3zVarF = ap0.f();
                int i = this.d.d;
                if (i == -1) {
                    i = 10;
                }
                Integer numValueOf = Integer.valueOf(i);
                this.d.getClass();
                nr30 nr30Var2 = this.d;
                nr30Var.b = h3zVarF.i(numValueOf, 10, null, nr30Var2.f, null, nr30Var2.e, null);
                this.d.b.G(new qr30(this));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        return ((hl30) this.a.get(i)).a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        ((cz1) d0Var).a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new sp2(viewGroup.getContext(), this.e);
        }
        if (i == 1) {
            return new a(dzc.a(viewGroup, R.layout.spr_real_bet_old_history_item, viewGroup, false));
        }
        if (i == 2) {
            return new b(dzc.a(viewGroup, R.layout.spr_bets_load_more_item, viewGroup, false));
        }
        eub.a("RTicketListAdapter viewHolder return null,type:" + i);
        return new a(dzc.a(viewGroup, R.layout.spr_real_bet_old_history_item, viewGroup, false));
    }
}
