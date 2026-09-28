package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.nfj.CaBJCMnsV;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.BoreDrawConfig;
import com.sportybet.plugin.realsports.data.Combination;
import com.sportybet.plugin.realsports.data.RBet;
import com.sportybet.plugin.realsports.data.RSelection;
import com.sportybet.plugin.realsports.data.WinStatusDisplayData;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class jl30 extends RecyclerView.f<f> {
    public final int a;
    public final Activity b;
    public ArrayList c;
    public BoreDrawConfig d;

    public class a extends f {
        public final View a;
        public final View b;
        public final TextView c;
        public final TextView d;
        public final TextView e;

        public a(View view) {
            super(view);
            this.a = view.findViewById(R.id.title);
            this.b = view.findViewById(R.id.diver_line);
            this.c = (TextView) view.findViewById(R.id.time);
            this.d = (TextView) view.findViewById(R.id.stake_used);
            this.e = (TextView) view.findViewById(R.id.cashout);
        }

        @Override // jl30.f
        public final void a(int i) {
            Object obj = jl30.this.c.get(i);
            if (obj instanceof gl30) {
                gl30 gl30Var = (gl30) obj;
                boolean z = gl30Var.b;
                View view = this.b;
                View view2 = this.a;
                if (z) {
                    view2.setVisibility(0);
                    view.setVisibility(8);
                } else {
                    view.setVisibility(0);
                    view2.setVisibility(8);
                }
                boolean z2 = gl30Var.c;
                TextView textView = this.e;
                TextView textView2 = this.d;
                TextView textView3 = this.c;
                if (z2) {
                    textView3.setText(sn5.c(textView3, R.string.common_functions__total, new Object[0]));
                    textView2.setText(gl30Var.d);
                    textView.setText(gl30Var.e);
                } else {
                    textView3.setText(bwf0.a.d(gl30Var.a.createTime, false));
                    long j = Long.parseLong(gl30Var.a.usedStake);
                    Locale locale = Locale.US;
                    textView2.setText(bjb0.U(j, locale));
                    textView.setText(bjb0.U(Long.parseLong(gl30Var.a.amount), locale));
                }
            }
        }
    }

    public class b extends f {
        public final TextView A;
        public final TextView B;
        public final TextView a;
        public final TextView b;
        public final View c;
        public final TextView d;
        public final TextView e;
        public final TextView f;
        public final TextView i;
        public final TextView v;
        public final TextView w;
        public final TextView y;
        public final TextView z;

        public b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.combo_title);
            this.b = (TextView) view.findViewById(R.id.combo);
            this.c = view.findViewById(R.id.combo_line);
            this.d = (TextView) view.findViewById(R.id.status);
            this.e = (TextView) view.findViewById(R.id.stake_label);
            this.f = (TextView) view.findViewById(R.id.stake_value);
            this.i = (TextView) view.findViewById(R.id.odds_label);
            this.v = (TextView) view.findViewById(R.id.odds_value);
            this.w = (TextView) view.findViewById(R.id.final_odds_label);
            this.y = (TextView) view.findViewById(R.id.final_odds_value);
            this.z = (TextView) view.findViewById(R.id.bonus_label);
            this.A = (TextView) view.findViewById(R.id.bonus_value);
            this.B = (TextView) view.findViewById(R.id.return_value);
        }

        public static void b(TextView textView, TextView textView2, String str) {
            if (bjb0.d0(str) <= 0.0d) {
                textView.setVisibility(8);
                textView2.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView2.setVisibility(0);
                textView2.setText(str);
            }
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:39:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:41:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:45:0x011a  */
        /* JADX WARN: Code duplicated, block: B:46:0x0122  */
        /* JADX WARN: Code duplicated, block: B:50:0x012c  */
        /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
        @Override // jl30.f
        public final void a(int i) {
            String strB;
            Drawable drawableA;
            String str;
            TextView textView;
            TextView textView2;
            TextView textView3;
            TextView textView4;
            double dD0;
            TextView textView5;
            jl30 jl30Var = jl30.this;
            Object obj = jl30Var.c.get(i);
            if (obj instanceof el30) {
                el30 el30Var = (el30) obj;
                this.a.setVisibility(el30Var.b ? 0 : 8);
                this.c.setVisibility(el30Var.b ? 0 : 8);
                TextView textView6 = this.d;
                Context context = textView6.getContext();
                int i2 = el30Var.a.status;
                int i3 = R.color.text_type1_primary;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            strB = sn5.b(context, R.string.bet_history__lost, new Object[0]);
                            i3 = R.color.text_type2_tertiary;
                        } else {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 != 5) {
                                        strB = i2 != 90 ? "" : sn5.b(context, R.string.component_wap_share_bet__pending, new Object[0]);
                                    } else {
                                        strB = sn5.b(context, R.string.bet_history__partial_win, new Object[0]);
                                    }
                                }
                                textView6.setText(strB);
                                textView6.setTextColor(jl30Var.b.getColor(i3));
                                textView6.setCompoundDrawablesWithIntrinsicBounds(drawableA, (Drawable) null, (Drawable) null, (Drawable) null);
                                this.b.setText(el30Var.a.combo);
                                b(this.e, this.f, el30Var.a.originStake);
                                Combination combination = el30Var.a;
                                str = combination.finalOdds;
                                textView = this.y;
                                textView2 = this.w;
                                textView3 = this.v;
                                textView4 = this.i;
                                if (str != null || str.equals(combination.odds)) {
                                    String str2 = el30Var.a.odds;
                                    b(textView4, textView3, gky.a.a(str2 != null ? str2 : "", false));
                                    textView2.setVisibility(8);
                                    textView.setVisibility(8);
                                } else {
                                    textView4.setVisibility(8);
                                    textView3.setVisibility(8);
                                    b(textView2, textView, gky.a(el30Var.a.finalOdds));
                                }
                                b(this.z, this.A, el30Var.a.bonus);
                                dD0 = bjb0.d0(el30Var.a.winnings);
                                textView5 = this.B;
                                if (dD0 > 0.0d) {
                                    textView5.setText(el30Var.a.winnings);
                                } else {
                                    textView5.setText("--");
                                }
                                if (el30Var.b) {
                                    RelativeLayout relativeLayout = (RelativeLayout) this.itemView.getRootView();
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) relativeLayout.getLayoutParams();
                                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) this.itemView.getContext().getResources().getDimension(R.dimen.space_medium), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                                    relativeLayout.setLayoutParams(marginLayoutParams);
                                }
                                return;
                            }
                            strB = sn5.b(context, R.string.bet_history__void, new Object[0]);
                        }
                    }
                    String strB2 = sn5.b(context, R.string.bet_history__won, new Object[0]);
                    drawableA = iwh0.a(context, R.drawable.ic_spr_bet_history_win, context.getColor(R.color.text_type1_primary));
                    strB = strB2;
                    textView6.setText(strB);
                    textView6.setTextColor(jl30Var.b.getColor(i3));
                    textView6.setCompoundDrawablesWithIntrinsicBounds(drawableA, (Drawable) null, (Drawable) null, (Drawable) null);
                    this.b.setText(el30Var.a.combo);
                    b(this.e, this.f, el30Var.a.originStake);
                    Combination combination2 = el30Var.a;
                    str = combination2.finalOdds;
                    textView = this.y;
                    textView2 = this.w;
                    textView3 = this.v;
                    textView4 = this.i;
                    if (str != null) {
                        String str3 = el30Var.a.odds;
                        b(textView4, textView3, gky.a.a(str3 != null ? str3 : "", false));
                        textView2.setVisibility(8);
                        textView.setVisibility(8);
                    } else {
                        String str4 = el30Var.a.odds;
                        b(textView4, textView3, gky.a.a(str4 != null ? str4 : "", false));
                        textView2.setVisibility(8);
                        textView.setVisibility(8);
                    }
                    b(this.z, this.A, el30Var.a.bonus);
                    dD0 = bjb0.d0(el30Var.a.winnings);
                    textView5 = this.B;
                    if (dD0 > 0.0d) {
                        textView5.setText(el30Var.a.winnings);
                    } else {
                        textView5.setText("--");
                    }
                    if (el30Var.b) {
                        return;
                    }
                    RelativeLayout relativeLayout2 = (RelativeLayout) this.itemView.getRootView();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) relativeLayout2.getLayoutParams();
                    marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, (int) this.itemView.getContext().getResources().getDimension(R.dimen.space_medium), marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                    relativeLayout2.setLayoutParams(marginLayoutParams2);
                }
                strB = sn5.b(context, R.string.component_wap_share_bet__running, new Object[0]);
                drawableA = null;
                textView6.setText(strB);
                textView6.setTextColor(jl30Var.b.getColor(i3));
                textView6.setCompoundDrawablesWithIntrinsicBounds(drawableA, (Drawable) null, (Drawable) null, (Drawable) null);
                this.b.setText(el30Var.a.combo);
                b(this.e, this.f, el30Var.a.originStake);
                Combination combination3 = el30Var.a;
                str = combination3.finalOdds;
                textView = this.y;
                textView2 = this.w;
                textView3 = this.v;
                textView4 = this.i;
                if (str != null) {
                    String str5 = el30Var.a.odds;
                    b(textView4, textView3, gky.a.a(str5 != null ? str5 : "", false));
                    textView2.setVisibility(8);
                    textView.setVisibility(8);
                } else {
                    String str6 = el30Var.a.odds;
                    b(textView4, textView3, gky.a.a(str6 != null ? str6 : "", false));
                    textView2.setVisibility(8);
                    textView.setVisibility(8);
                }
                b(this.z, this.A, el30Var.a.bonus);
                dD0 = bjb0.d0(el30Var.a.winnings);
                textView5 = this.B;
                if (dD0 > 0.0d) {
                    textView5.setText(el30Var.a.winnings);
                } else {
                    textView5.setText("--");
                }
                if (el30Var.b) {
                    return;
                }
                RelativeLayout relativeLayout3 = (RelativeLayout) this.itemView.getRootView();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) relativeLayout3.getLayoutParams();
                marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, (int) this.itemView.getContext().getResources().getDimension(R.dimen.space_medium), marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                relativeLayout3.setLayoutParams(marginLayoutParams3);
            }
        }
    }

    public class c extends f implements View.OnClickListener {
        public final TextView a;
        public fl30 b;

        public c(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.bet_detail_bar);
            this.a = textView;
            textView.setOnClickListener(this);
        }

        @Override // jl30.f
        public final void a(int i) {
            fl30 fl30Var = (fl30) jl30.this.c.get(i);
            this.b = fl30Var;
            int i2 = fl30Var.a ? R.string.bet_history__selection_details : R.string.bet_history__cashout_details;
            TextView textView = this.a;
            textView.setText(sn5.c(textView, i2, new Object[0]));
            textView.setCompoundDrawablesWithIntrinsicBounds(iwh0.a(textView.getContext(), this.b.b ? R.drawable.spr_ic_arrow_drop_down_black_24dp : R.drawable.spr_ic_arrow_right_black_24dp, textView.getContext().getColor(R.color.brand_quinary)), (Drawable) null, (Drawable) null, (Drawable) null);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view instanceof TextView) {
                int adapterPosition = getAdapterPosition();
                jl30 jl30Var = jl30.this;
                if (adapterPosition < jl30Var.c.size()) {
                    Object obj = jl30Var.c.get(adapterPosition);
                    if (obj instanceof fl30) {
                        fl30 fl30Var = (fl30) obj;
                        ArrayList arrayList = fl30Var.a ? fl30Var.c : fl30Var.d;
                        fl30 fl30Var2 = this.b;
                        if (fl30Var2.b) {
                            if (arrayList != null) {
                                int size = arrayList.size();
                                if (this.b.e) {
                                    for (int i = 0; i < size; i++) {
                                        jl30Var.c.remove(adapterPosition + 1);
                                    }
                                    this.b.e = false;
                                    jl30Var.notifyItemRangeRemoved(adapterPosition + 1, size);
                                }
                            }
                        } else if (!fl30Var2.e) {
                            int i2 = adapterPosition + 1;
                            jl30Var.c.addAll(i2, arrayList);
                            this.b.e = true;
                            jl30Var.notifyItemRangeInserted(i2, arrayList.size());
                        }
                        fl30 fl30Var3 = this.b;
                        fl30Var3.b = !fl30Var3.b;
                        jl30Var.notifyItemChanged(adapterPosition);
                    }
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class d extends f {
        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final TextView d;
        public final TextView e;
        public final TextView f;
        public final TextView i;
        public final LinearLayout v;
        public final View w;
        public xec y;
        public final ImageView z;

        public d(View view) {
            super(view);
            this.w = view.findViewById(R.id.bet_detail_top_divider);
            this.a = (TextView) view.findViewById(R.id.bet_detail_live);
            this.b = (TextView) view.findViewById(R.id.bet_detail_game_id_date);
            ImageView imageView = (ImageView) view.findViewById(R.id.bet_detail_status_icon);
            this.c = imageView;
            imageView.setOnClickListener(new q13(this, 1));
            this.z = (ImageView) view.findViewById(R.id.delayed_settle_icon);
            this.d = (TextView) view.findViewById(R.id.bet_detail_match_name);
            this.e = (TextView) view.findViewById(R.id.bet_detail_game_score);
            this.f = (TextView) view.findViewById(R.id.game_label);
            this.i = (TextView) view.findViewById(R.id.bet_detail_index);
            this.v = (LinearLayout) view.findViewById(R.id.bet_detail_selection_container);
        }

        /* JADX WARN: Code duplicated, block: B:41:0x0100 A[PHI: r16
          0x0100: PHI (r16v2 int) = (r16v0 int), (r16v0 int), (r16v1 int), (r16v1 int) binds: [B:40:0x00fe, B:43:0x0105, B:59:0x0131, B:66:0x0141] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // jl30.f
        public final void a(int i) {
            String strD;
            int i2;
            int i3;
            jl30 jl30Var = jl30.this;
            Activity activity = jl30Var.b;
            Object obj = jl30Var.c.get(i);
            if (obj instanceof cu30) {
                cu30 cu30Var = (cu30) obj;
                RSelection rSelection = cu30Var.a;
                TextView textView = this.a;
                textView.setVisibility(8);
                ImageView imageView = this.c;
                imageView.setImageDrawable(null);
                TextView textView2 = this.e;
                textView2.setVisibility(8);
                TextView textView3 = this.f;
                textView3.setVisibility(8);
                textView3.setTypeface(textView3.getTypeface(), 0);
                textView3.setTextColor(activity.getColor(R.color.text_type2_tertiary));
                boolean z = cu30Var.b;
                TextView textView4 = this.i;
                if (z) {
                    textView4.setVisibility(0);
                    textView4.setText(String.valueOf(cu30Var.c));
                } else {
                    textView4.setVisibility(8);
                }
                this.w.setVisibility(cu30Var.c == 1 ? 8 : 0);
                StringBuilder sb = new StringBuilder();
                boolean zIsEmpty = TextUtils.isEmpty(rSelection.gameId);
                TextView textView5 = this.b;
                if (!zIsEmpty) {
                    sb.append(sn5.c(textView5, R.string.bet_history__game_id_vid, rSelection.gameId));
                    sb.append(CaBJCMnsV.IOTNKURk);
                }
                if (rSelection.isOngoing()) {
                    textView.setVisibility(0);
                    mfb0 mfb0VarE = lfb0.d().e(rSelection.sportId);
                    strD = mfb0VarE == null ? "" : mfb0VarE.f(rSelection.playedSeconds, rSelection.remainingTimeInPeriod, rSelection.matchStatus);
                } else {
                    strD = bwf0.a.d(rSelection.startTime, false);
                }
                if (!TextUtils.isEmpty(strD)) {
                    sb.append(strD);
                }
                if (TextUtils.isEmpty(sb.toString())) {
                    textView5.setVisibility(8);
                } else {
                    textView5.setVisibility(0);
                    textView5.setText(sb.toString());
                }
                this.z.setVisibility(q980.c(rSelection) ? 0 : 8);
                imageView.setTag(rSelection);
                int i4 = rSelection.eventStatus;
                if ((i4 == 0 || i4 == 6) && rSelection.status == 0) {
                    i2 = R.drawable.ic_selection_status_not_started;
                } else {
                    boolean zIsOngoing = rSelection.isOngoing();
                    int i5 = R.drawable.ic_selection_status_ongoing;
                    if (zIsOngoing || (i3 = rSelection.status) == 0) {
                        i2 = i5;
                    } else if (i3 == 1) {
                        int i6 = rSelection.settleType;
                        if (i6 == 1) {
                            i2 = R.drawable.ic_selection_status_flashwin;
                        } else if (i6 == 2) {
                            i2 = R.drawable.ic_selection_status_flashsave;
                        } else {
                            i5 = R.drawable.ic_selection_status_1_up;
                            if (i6 == 5) {
                                i2 = i5;
                            } else if (i6 == 3) {
                                i2 = R.drawable.ic_selection_status_2_up;
                            } else if (i6 == 6) {
                                i2 = R.drawable.ic_selection_status_over_under_early_goals;
                            } else if (i6 == 7) {
                                i2 = i5;
                            } else {
                                i2 = R.drawable.ic_selection_status_win;
                            }
                        }
                    } else if (i3 == 2) {
                        i2 = R.drawable.ic_selection_status_lost;
                    } else if (i3 != 3) {
                        i2 = i3 != 4 ? -1 : R.drawable.ic_selection_status_refund_all;
                    } else {
                        i2 = R.drawable.ic_selection_status_void;
                    }
                }
                imageView.setImageDrawable(i2 == -1 ? null : gr0.a(activity, i2));
                j7g j7gVar = new j7g();
                if (b3.U(rSelection.eventId)) {
                    if (!TextUtils.isEmpty(rSelection.marketDesc)) {
                        j7gVar = new j7g(rSelection.marketDesc);
                    }
                } else if (b3.T(rSelection.eventId)) {
                    if (!TextUtils.isEmpty(rSelection.tournamentName)) {
                        j7gVar = new j7g(rSelection.tournamentName);
                    }
                } else if (!TextUtils.isEmpty(rSelection.home) && !TextUtils.isEmpty(rSelection.away)) {
                    j7gVar = new j7g(rSelection.home);
                    j7gVar.e(this.itemView.getContext().getColor(R.color.text_type2_tertiary), " v ");
                    j7gVar.a(rSelection.away);
                }
                this.d.setText(j7gVar);
                if (!rSelection.isVoid() && !b3.U(rSelection.eventId)) {
                    int i7 = rSelection.eventStatus;
                    if (i7 == 1 || i7 == 2) {
                        textView3.setVisibility(0);
                        textView3.setText(sn5.c(textView3, R.string.bet_history__live_score, new Object[0]));
                        mfb0 mfb0VarE2 = lfb0.d().e(rSelection.sportId);
                        ArrayList arrayList = new ArrayList();
                        if (mfb0VarE2 != null) {
                            arrayList.addAll(mfb0VarE2.A(rSelection.setScore, rSelection.pointScore, rSelection.gameScore));
                        }
                        textView2.setVisibility(0);
                        if (arrayList.isEmpty()) {
                            textView2.setText(sn5.c(textView2, R.string.common_functions__not_available, new Object[0]));
                        } else {
                            j7g j7gVar2 = new j7g();
                            if (arrayList.size() == 2) {
                                j7gVar2.a((CharSequence) arrayList.get(0));
                                j7gVar2.a(":");
                                j7gVar2.a((CharSequence) arrayList.get(1));
                            } else {
                                j7gVar2.d((CharSequence) arrayList.get(0), true);
                                j7gVar2.d(":", true);
                                j7gVar2.d((CharSequence) arrayList.get(1), true);
                                for (int i8 = 2; i8 < arrayList.size(); i8 += 2) {
                                    j7gVar2.a("  ");
                                    j7gVar2.a((CharSequence) arrayList.get(i8));
                                    j7gVar2.a(":");
                                    j7gVar2.a((CharSequence) arrayList.get(i8 + 1));
                                }
                            }
                            textView2.setText(j7gVar2);
                        }
                    } else if (i7 == 3 || i7 == 4) {
                        if (b3.T(rSelection.eventId)) {
                            textView3.setVisibility(8);
                            textView2.setVisibility(8);
                        } else {
                            textView3.setVisibility(0);
                            textView3.setText(("sr:sport:1".equals(rSelection.sportId) || "sr:sport:202120001".equals(rSelection.sportId) || "sr:sport:137".equals(rSelection.sportId)) ? sn5.c(textView3, R.string.bet_history__ft_score, new Object[0]) : sn5.c(textView3, R.string.bet_history__final_score, new Object[0]));
                            textView2.setVisibility(0);
                            if (TextUtils.isEmpty(rSelection.setScore)) {
                                textView2.setText(sn5.c(textView2, R.string.common_functions__not_available, new Object[0]));
                            } else {
                                textView2.setVisibility(0);
                                textView2.setText(rSelection.setScore);
                            }
                        }
                    }
                }
                LinearLayout linearLayout = this.v;
                linearLayout.removeAllViews();
                if (rSelection.isBetBuilder()) {
                    g880.b(rSelection, linearLayout);
                    int i9 = 0;
                    while (i9 < rSelection.betBuilderSelections.size()) {
                        boolean z2 = i9 == rSelection.betBuilderSelections.size() - 1;
                        RSelection rSelection2 = rSelection.betBuilderSelections.get(i9);
                        BoreDrawConfig boreDrawConfig = jl30Var.d;
                        rSelection2.getClass();
                        RSelection rSelection3 = rSelection;
                        g880.d(rSelection2, linearLayout, boreDrawConfig, rSelection3, z2, 16);
                        rSelection = rSelection3;
                        i9++;
                    }
                } else {
                    g880.d(rSelection, linearLayout, jl30Var.d, null, false, 28);
                }
                g880.a(rSelection, linearLayout);
            }
        }
    }

    public class e extends f {
        public final TextView A;
        public final TextView B;
        public final TextView C;
        public final TextView D;
        public final TextView E;
        public final TextView F;
        public final TextView G;
        public final TextView H;
        public final TextView I;
        public final TextView J;
        public final TextView K;
        public final TextView L;
        public final View M;
        public final TextView N;
        public final TextView O;
        public final View a;
        public final TextView b;
        public final TextView c;
        public final TextView d;
        public final TextView e;
        public final TextView f;
        public final TextView i;
        public final TextView v;
        public final TextView w;
        public final TextView y;
        public final TextView z;

        public e(View view) {
            super(view);
            this.a = view.findViewById(R.id.bet_detail_title_layout);
            this.b = (TextView) view.findViewById(R.id.bet_detail_bet_id);
            this.c = (TextView) view.findViewById(R.id.bet_detail_bet_number);
            this.d = (TextView) view.findViewById(R.id.bet_detail_type);
            this.e = (TextView) view.findViewById(R.id.bet_detail_status);
            this.f = (TextView) view.findViewById(R.id.bet_detail_total_stake_value);
            this.i = (TextView) view.findViewById(R.id.bet_detail_total_return);
            this.v = (TextView) view.findViewById(R.id.bet_detail_total_return_value);
            this.w = (TextView) view.findViewById(R.id.bet_detail_remain_stake_label);
            this.y = (TextView) view.findViewById(R.id.bet_detail_remain_stake_value);
            this.z = (TextView) view.findViewById(R.id.bet_detail_bonus_label);
            this.A = (TextView) view.findViewById(R.id.bet_detail_bonus_value);
            this.B = (TextView) view.findViewById(R.id.bet_detail_tax_label);
            this.C = (TextView) view.findViewById(R.id.bet_detail_tax_value);
            this.D = (TextView) view.findViewById(R.id.bet_detail_pot_win_label);
            this.E = (TextView) view.findViewById(R.id.bet_detail_pot_win_value);
            this.F = (TextView) view.findViewById(R.id.bet_detail_insure);
            this.G = (TextView) view.findViewById(R.id.bet_detail_odds_label);
            this.H = (TextView) view.findViewById(R.id.bet_detail_odds_value);
            this.I = (TextView) view.findViewById(R.id.bet_detail_final_odds_label);
            this.J = (TextView) view.findViewById(R.id.bet_detail_final_odds_value);
            this.K = (TextView) view.findViewById(R.id.bet_detail_gift_label);
            this.L = (TextView) view.findViewById(R.id.bet_detail_gift_value);
            this.M = view.findViewById(R.id.one_cut_still_win_layout);
            this.N = (TextView) view.findViewById(R.id.one_cut_still_win_label);
            this.O = (TextView) view.findViewById(R.id.one_cut_still_win);
        }

        public static void b(TextView textView, TextView textView2, long j) {
            if (j <= 0) {
                textView.setVisibility(8);
                textView2.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView2.setVisibility(0);
                textView2.setText(bjb0.U(j, Locale.US));
            }
        }

        /* JADX WARN: Code duplicated, block: B:102:0x02e6  */
        /* JADX WARN: Code duplicated, block: B:103:0x02ef  */
        /* JADX WARN: Code duplicated, block: B:105:0x02fa  */
        /* JADX WARN: Code duplicated, block: B:106:0x0311  */
        /* JADX WARN: Code duplicated, block: B:108:0x0319  */
        /* JADX WARN: Code duplicated, block: B:109:0x031d  */
        /* JADX WARN: Code duplicated, block: B:113:0x032d  */
        /* JADX WARN: Code duplicated, block: B:117:0x033d  */
        /* JADX WARN: Code duplicated, block: B:123:0x0359  */
        /* JADX WARN: Code duplicated, block: B:127:0x0372  */
        /* JADX WARN: Code duplicated, block: B:129:0x0377  */
        /* JADX WARN: Code duplicated, block: B:131:0x037d  */
        /* JADX WARN: Code duplicated, block: B:132:0x0388  */
        /* JADX WARN: Code duplicated, block: B:134:0x038c  */
        /* JADX WARN: Code duplicated, block: B:140:0x03c2  */
        /* JADX WARN: Code duplicated, block: B:145:0x03c9  */
        /* JADX WARN: Code duplicated, block: B:147:0x03d8  */
        /* JADX WARN: Code duplicated, block: B:148:0x03e8  */
        /* JADX WARN: Code duplicated, block: B:151:0x03ec  */
        /* JADX WARN: Code duplicated, block: B:154:0x0407  */
        /* JADX WARN: Code duplicated, block: B:156:0x040b  */
        /* JADX WARN: Code duplicated, block: B:160:0x041d  */
        /* JADX WARN: Code duplicated, block: B:161:0x0430  */
        /* JADX WARN: Code duplicated, block: B:165:0x04bd  */
        /* JADX WARN: Code duplicated, block: B:168:0x04d6  */
        /* JADX WARN: Code duplicated, block: B:171:0x04ea  */
        /* JADX WARN: Code duplicated, block: B:172:0x04fb  */
        /* JADX WARN: Code duplicated, block: B:175:0x050e  */
        /* JADX WARN: Code duplicated, block: B:177:0x0538  */
        /* JADX WARN: Code duplicated, block: B:42:0x0161  */
        /* JADX WARN: Code duplicated, block: B:46:0x0173  */
        /* JADX WARN: Code duplicated, block: B:49:0x0192  */
        /* JADX WARN: Code duplicated, block: B:56:0x01d1  */
        /* JADX WARN: Code duplicated, block: B:59:0x01e1  */
        /* JADX WARN: Code duplicated, block: B:61:0x01e4  */
        /* JADX WARN: Code duplicated, block: B:63:0x01e7  */
        /* JADX WARN: Code duplicated, block: B:65:0x01ea  */
        /* JADX WARN: Code duplicated, block: B:68:0x01ef  */
        /* JADX WARN: Code duplicated, block: B:69:0x01f1  */
        /* JADX WARN: Code duplicated, block: B:71:0x01f5 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:72:0x01f7 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:73:0x01f9  */
        /* JADX WARN: Code duplicated, block: B:74:0x0209  */
        /* JADX WARN: Code duplicated, block: B:75:0x0214  */
        /* JADX WARN: Code duplicated, block: B:76:0x021f  */
        /* JADX WARN: Code duplicated, block: B:78:0x0231  */
        /* JADX WARN: Code duplicated, block: B:81:0x023d  */
        /* JADX WARN: Code duplicated, block: B:84:0x0271  */
        /* JADX WARN: Code duplicated, block: B:87:0x0279  */
        /* JADX WARN: Code duplicated, block: B:90:0x0292  */
        @Override // jl30.f
        public final void a(int i) {
            String strB;
            int i2;
            String strU;
            Drawable drawableA;
            Locale locale;
            boolean zEquals;
            TextView textView;
            boolean zIsOneCutBet;
            TextView textView2;
            String strB2;
            TextView textView3;
            TextView textView4;
            RBet rBet;
            boolean z;
            boolean zIsPartialCashout;
            TextView textView5;
            TextView textView6;
            TextView textView7;
            TextView textView8;
            TextView textView9;
            TextView textView10;
            int i3;
            boolean zIsSettled;
            TextView textView11;
            RBet rBet2;
            int iD;
            int i4;
            String strB3;
            int color;
            int i5;
            Drawable drawableA2;
            View view;
            int i6;
            String str;
            int i7;
            boolean zIsEmpty;
            TextView textView12;
            TextView textView13;
            boolean zIsEmpty2;
            TextView textView14;
            TextView textView15;
            int i8;
            TextView textView16;
            TextView textView17;
            int i9;
            jl30 jl30Var = jl30.this;
            int i10 = jl30Var.a;
            Object obj = jl30Var.c.get(i);
            if (obj instanceof il30) {
                il30 il30Var = (il30) obj;
                Context context = this.itemView.getContext();
                String strB4 = sn5.b(context, R.string.bet_history__bet_id_vid, il30Var.a.id);
                TextView textView18 = this.b;
                textView18.setText(strB4);
                int i11 = il30Var.b ? 0 : 8;
                TextView textView19 = this.c;
                textView19.setVisibility(i11);
                textView19.setText(sn5.b(context, R.string.bet_history__number_of_bets_vnum, String.valueOf(il30Var.c)));
                RBet rBet3 = il30Var.a;
                Context context2 = textView18.getContext();
                int i12 = rBet3.status;
                boolean z2 = (i12 == 1 || i12 == 3) && rBet3.isSettled == 0;
                if (z2) {
                    i12 = 0;
                }
                int i13 = R.color.text_type1_tertiary;
                if (i12 != 0) {
                    if (i12 == 1) {
                        boolean zIsPartialPayout = rBet3.isPartialPayout(i10);
                        strU = bjb0.U(rBet3.winnings, Locale.US);
                        WinStatusDisplayData winStatusDisplayDataA = rkf.a(context2, rBet3.selections, zIsPartialPayout, this.itemView.getContext().getColor(R.color.text_type2_primary));
                        String strB5 = sn5.b(context2, winStatusDisplayDataA.title, new Object[0]);
                        drawableA = winStatusDisplayDataA.iconDrawable;
                        strB = strB5;
                        i13 = R.color.brand_secondary;
                    } else {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 != 4) {
                                    if (i12 == 5) {
                                        strB = sn5.b(context2, R.string.bet_history__partial_win, new Object[0]);
                                        strU = bjb0.U(rBet3.winnings, Locale.US);
                                    } else if (i12 != 90) {
                                        strB = "";
                                    } else {
                                        strB = sn5.b(context2, R.string.component_wap_share_bet__pending, new Object[0]);
                                        drawableA = gr0.a(context2, R.drawable.spr_pending_icon_10dp);
                                        strU = "--";
                                    }
                                    i2 = R.color.custom_text_type2_primary_type2;
                                    TextView textView20 = this.e;
                                    textView20.setText(strB);
                                    textView20.setTextColor(this.itemView.getContext().getColor(i2));
                                    textView20.setCompoundDrawablesWithIntrinsicBounds(drawableA, (Drawable) null, (Drawable) null, (Drawable) null);
                                    int color2 = this.itemView.getContext().getColor(i13);
                                    View view2 = this.a;
                                    view2.setBackgroundColor(color2);
                                    view2.setTag(rBet3.orderId);
                                    long j = rBet3.originalStake;
                                    locale = Locale.US;
                                    this.f.setText(bjb0.U(j, locale));
                                    zEquals = TextUtils.equals(strU, "--");
                                    textView = this.v;
                                    if (!zEquals || TextUtils.equals(strU, "0.00")) {
                                        textView.setTextColor(context2.getColor(R.color.text_type2_tertiary));
                                    } else {
                                        textView.setTextColor(context2.getColor(R.color.brand_quinary));
                                    }
                                    textView.setText(strU);
                                    zIsOneCutBet = rBet3.isOneCutBet();
                                    textView2 = this.i;
                                    if (zIsOneCutBet || rBet3.status != 1) {
                                        textView2.setText(sn5.c(textView2, R.string.component_wap_share_bet__total_return, new Object[0]));
                                    } else {
                                        int size = rBet3.selections.size();
                                        int i14 = rBet3.isOneCutWin ? size - 1 : size;
                                        StringBuilder sb = new StringBuilder();
                                        String strB6 = sn5.b(context2, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(i14), String.valueOf(size));
                                        sb.append(sn5.b(context2, R.string.component_wap_share_bet__total_return, new Object[0]));
                                        sb.append(" (");
                                        sb.append(strB6);
                                        sb.append(")");
                                        textView2.setText(sb);
                                    }
                                    if (i10 != 1) {
                                        strB2 = sn5.b(context2, R.string.component_betslip__single, new Object[0]);
                                    } else if (i10 == 2) {
                                        if (i10 == 3) {
                                            strB2 = (i10 != 4 || i10 == 5) ? sn5.b(context2, R.string.bet_history__multiple, new Object[0]) : null;
                                        } else {
                                            i9 = rBet3.comboType;
                                            if (i9 != 1) {
                                                strB2 = sn5.b(context2, R.string.component_betslip__single, new Object[0]);
                                            } else if (i9 != 2) {
                                                strB2 = sn5.b(context2, R.string.bet_history__doubles, new Object[0]);
                                            } else if (i9 != 3) {
                                                strB2 = sn5.b(context2, R.string.bet_history__vnum_folds, String.valueOf(i9));
                                            } else {
                                                strB2 = sn5.b(context2, R.string.component_betslip__trebles, new Object[0]);
                                            }
                                        }
                                    }
                                    if (rBet3.comboNum > 1) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(strB2);
                                        sb2.append("(x");
                                        strB2 = zk1.a(rBet3.comboNum, ")", sb2);
                                    }
                                    TextView textView21 = this.d;
                                    textView21.setText(strB2);
                                    textView21.setTextColor(this.itemView.getContext().getColor(i2));
                                    long j2 = il30Var.a.bonus;
                                    textView3 = this.z;
                                    textView4 = this.A;
                                    b(textView3, textView4, j2);
                                    rBet = il30Var.a;
                                    if (rBet == null && rBet.hasTax()) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    zIsPartialCashout = il30Var.a.isPartialCashout();
                                    textView5 = this.w;
                                    textView6 = this.y;
                                    textView7 = this.B;
                                    textView8 = this.D;
                                    textView9 = this.C;
                                    if (zIsPartialCashout || il30Var.a.isSettled()) {
                                        textView10 = textView8;
                                        textView5.setVisibility(8);
                                        textView6.setVisibility(8);
                                        if (z) {
                                            textView7.setVisibility(0);
                                            textView9.setVisibility(0);
                                            textView9.setText("-".concat(bjb0.P(il30Var.a.taxAmount, locale)));
                                        } else {
                                            textView7.setVisibility(8);
                                            textView9.setVisibility(8);
                                        }
                                        if (z) {
                                            i3 = R.string.component_betslip__to_win;
                                        } else {
                                            i3 = R.string.component_betslip__pot_win;
                                        }
                                        textView10.setText(i3);
                                    } else {
                                        textView5.setVisibility(0);
                                        textView6.setVisibility(0);
                                        textView6.setText(bjb0.U(il30Var.a.stake, locale));
                                        textView10 = textView8;
                                        textView10.setText(z ? R.string.bet_history__max_to_win : R.string.component_betslip__pot_win);
                                        textView7.setText(sn5.b(context, R.string.bet_history__max_wh_tax, new Object[0]));
                                        RBet rBet4 = il30Var.a;
                                        if (rBet4 != null) {
                                            long j3 = rBet4.remainTaxAmount;
                                            if (j3 > 0) {
                                                textView9.setText("-".concat(bjb0.U(j3, locale)));
                                                textView7.setVisibility(0);
                                                textView9.setVisibility(0);
                                            } else {
                                                textView7.setVisibility(8);
                                                textView9.setVisibility(8);
                                            }
                                        } else {
                                            textView7.setVisibility(8);
                                            textView9.setVisibility(8);
                                        }
                                    }
                                    zIsSettled = il30Var.a.isSettled();
                                    textView11 = this.E;
                                    if (!zIsSettled || il30Var.a.isAllCashout() || il30Var.a.potentialWinnings == 0) {
                                        textView10.setVisibility(8);
                                        textView11.setVisibility(8);
                                    } else {
                                        textView10.setVisibility(0);
                                        textView11.setVisibility(0);
                                        RBet rBet5 = il30Var.a;
                                        if (rBet5 != null) {
                                            long j4 = rBet5.remainPotentialWinnings;
                                            if (j4 > 0) {
                                                textView11.setText(bjb0.U(j4, locale));
                                            } else {
                                                textView11.setText(bjb0.U(rBet5.potentialWinnings, locale));
                                            }
                                        } else {
                                            textView11.setText(bjb0.U(rBet5.potentialWinnings, locale));
                                        }
                                    }
                                    rBet2 = il30Var.a;
                                    if (rBet2.isAnyWin()) {
                                        iD = R.drawable.ic_any_win_label;
                                    } else {
                                        if (!rBet2.isOneCutBet()) {
                                            if (rBet2.selectionSize != -1 || (i4 = rBet2.minToWin) == -1) {
                                                iD = -1;
                                            } else {
                                                strB3 = sn5.b(context, R.string.cashout__flexi_label_vmintowin_of_vsize, String.valueOf(i4), String.valueOf(rBet2.selectionSize));
                                                iD = R.drawable.ic_flexi_outline;
                                            }
                                            color = this.itemView.getContext().getColor(R.color.custom_text_type2_primary_type2);
                                            i5 = rBet2.status;
                                            if (i5 != 1 || i5 == 2 || i5 == 4) {
                                                color = this.itemView.getContext().getColor(R.color.text_type2_primary);
                                            }
                                            if (iD != -1) {
                                                drawableA2 = s0b.a(this.itemView.getContext(), iD, new a78.a(color));
                                            } else {
                                                drawableA2 = null;
                                            }
                                            boolean z3 = drawableA2 != null;
                                            TextView textView22 = this.F;
                                            g8i0.b(textView22, z3);
                                            textView22.setCompoundDrawablesWithIntrinsicBounds(drawableA2, (Drawable) null, (Drawable) null, (Drawable) null);
                                            textView22.setText(strB3);
                                            textView22.setTextColor(color);
                                            view = this.M;
                                            view.setVisibility(8);
                                            i6 = rBet2.status;
                                            if ((i6 != 0 || i6 == 90) && rBet2.isOneCutBet()) {
                                                str = rBet2.cutbetType;
                                                gqy[] gqyVarArr = gqy.a;
                                                if (str.equalsIgnoreCase("1")) {
                                                    b(textView3, textView4, rBet2.cutbetRemainingBonusAmount);
                                                    i7 = 0;
                                                    textView3.setText(sn5.c(textView3, R.string.component_betslip__remaining_bonus, new Object[0]));
                                                } else {
                                                    i7 = 0;
                                                    b(textView3, textView4, 0L);
                                                }
                                                view.setVisibility(i7);
                                                int size2 = rBet2.selections.size();
                                                StringBuilder sb3 = new StringBuilder();
                                                String strB7 = sn5.b(context, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(size2), String.valueOf(size2));
                                                sb3.append(sn5.b(context, R.string.component_cashout__pot_win, new Object[i7]));
                                                sb3.append(" (");
                                                sb3.append(strB7);
                                                sb3.append(")");
                                                textView10.setText(sb3);
                                                StringBuilder sb4 = new StringBuilder();
                                                String strB8 = sn5.b(context, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(size2 - 1), String.valueOf(size2));
                                                sb4.append(sn5.b(context, R.string.common_functions__one_cut_win, new Object[0]));
                                                sb4.append(" (");
                                                sb4.append(strB8);
                                                sb4.append(")");
                                                this.N.setText(sb4);
                                                this.O.setText(bjb0.U(rBet2.cutbetWinningAmount, locale));
                                            }
                                            zIsEmpty = TextUtils.isEmpty(rBet2.totalOdds);
                                            textView12 = this.G;
                                            textView13 = this.H;
                                            if (zIsEmpty && TextUtils.isEmpty(rBet2.finalTotalOdds)) {
                                                textView12.setVisibility(0);
                                                textView13.setVisibility(0);
                                                textView13.setText(gky.a(rBet2.totalOdds));
                                            } else {
                                                textView12.setVisibility(8);
                                                textView13.setVisibility(8);
                                            }
                                            zIsEmpty2 = TextUtils.isEmpty(rBet2.finalTotalOdds);
                                            textView14 = this.J;
                                            textView15 = this.I;
                                            if (zIsEmpty2) {
                                                textView15.setVisibility(8);
                                                textView14.setVisibility(8);
                                            } else {
                                                textView15.setVisibility(0);
                                                textView14.setVisibility(0);
                                                textView14.setText(gky.a(rBet2.finalTotalOdds));
                                            }
                                            i8 = il30Var.a.favorType;
                                            textView16 = this.K;
                                            textView17 = this.L;
                                            if (i8 != 3) {
                                                textView16.setVisibility(8);
                                                textView17.setVisibility(8);
                                            } else {
                                                textView16.setText(sn5.b(context, R.string.common_functions__free_bet_gift, new Object[0]));
                                                textView17.setText(sn5.b(context, R.string.app_common__minus_prefix, bjb0.P(il30Var.a.favorAmount, locale)));
                                                textView16.setVisibility(0);
                                                textView17.setVisibility(0);
                                            }
                                        }
                                        iD = gug0.d(this.itemView.getContext());
                                    }
                                    strB3 = null;
                                    color = this.itemView.getContext().getColor(R.color.custom_text_type2_primary_type2);
                                    i5 = rBet2.status;
                                    if (i5 != 1) {
                                        color = this.itemView.getContext().getColor(R.color.text_type2_primary);
                                    } else {
                                        color = this.itemView.getContext().getColor(R.color.text_type2_primary);
                                    }
                                    if (iD != -1) {
                                        drawableA2 = s0b.a(this.itemView.getContext(), iD, new a78.a(color));
                                    } else {
                                        drawableA2 = null;
                                    }
                                    if (drawableA2 != null) {
                                    }
                                    TextView textView23 = this.F;
                                    g8i0.b(textView23, z3);
                                    textView23.setCompoundDrawablesWithIntrinsicBounds(drawableA2, (Drawable) null, (Drawable) null, (Drawable) null);
                                    textView23.setText(strB3);
                                    textView23.setTextColor(color);
                                    view = this.M;
                                    view.setVisibility(8);
                                    i6 = rBet2.status;
                                    if (i6 != 0) {
                                        str = rBet2.cutbetType;
                                        gqy[] gqyVarArr2 = gqy.a;
                                        if (str.equalsIgnoreCase("1")) {
                                            b(textView3, textView4, rBet2.cutbetRemainingBonusAmount);
                                            i7 = 0;
                                            textView3.setText(sn5.c(textView3, R.string.component_betslip__remaining_bonus, new Object[0]));
                                        } else {
                                            i7 = 0;
                                            b(textView3, textView4, 0L);
                                        }
                                        view.setVisibility(i7);
                                        int size3 = rBet2.selections.size();
                                        StringBuilder sb5 = new StringBuilder();
                                        String strB9 = sn5.b(context, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(size3), String.valueOf(size3));
                                        sb5.append(sn5.b(context, R.string.component_cashout__pot_win, new Object[i7]));
                                        sb5.append(" (");
                                        sb5.append(strB9);
                                        sb5.append(")");
                                        textView10.setText(sb5);
                                        StringBuilder sb6 = new StringBuilder();
                                        String strB10 = sn5.b(context, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(size3 - 1), String.valueOf(size3));
                                        sb6.append(sn5.b(context, R.string.common_functions__one_cut_win, new Object[0]));
                                        sb6.append(" (");
                                        sb6.append(strB10);
                                        sb6.append(")");
                                        this.N.setText(sb6);
                                        this.O.setText(bjb0.U(rBet2.cutbetWinningAmount, locale));
                                    } else {
                                        str = rBet2.cutbetType;
                                        gqy[] gqyVarArr3 = gqy.a;
                                        if (str.equalsIgnoreCase("1")) {
                                            b(textView3, textView4, rBet2.cutbetRemainingBonusAmount);
                                            i7 = 0;
                                            textView3.setText(sn5.c(textView3, R.string.component_betslip__remaining_bonus, new Object[0]));
                                        } else {
                                            i7 = 0;
                                            b(textView3, textView4, 0L);
                                        }
                                        view.setVisibility(i7);
                                        int size4 = rBet2.selections.size();
                                        StringBuilder sb7 = new StringBuilder();
                                        String strB11 = sn5.b(context, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(size4), String.valueOf(size4));
                                        sb7.append(sn5.b(context, R.string.component_cashout__pot_win, new Object[i7]));
                                        sb7.append(" (");
                                        sb7.append(strB11);
                                        sb7.append(")");
                                        textView10.setText(sb7);
                                        StringBuilder sb8 = new StringBuilder();
                                        String strB12 = sn5.b(context, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(size4 - 1), String.valueOf(size4));
                                        sb8.append(sn5.b(context, R.string.common_functions__one_cut_win, new Object[0]));
                                        sb8.append(" (");
                                        sb8.append(strB12);
                                        sb8.append(")");
                                        this.N.setText(sb8);
                                        this.O.setText(bjb0.U(rBet2.cutbetWinningAmount, locale));
                                    }
                                    zIsEmpty = TextUtils.isEmpty(rBet2.totalOdds);
                                    textView12 = this.G;
                                    textView13 = this.H;
                                    if (zIsEmpty) {
                                        textView12.setVisibility(8);
                                        textView13.setVisibility(8);
                                    } else {
                                        textView12.setVisibility(8);
                                        textView13.setVisibility(8);
                                    }
                                    zIsEmpty2 = TextUtils.isEmpty(rBet2.finalTotalOdds);
                                    textView14 = this.J;
                                    textView15 = this.I;
                                    if (zIsEmpty2) {
                                        textView15.setVisibility(0);
                                        textView14.setVisibility(0);
                                        textView14.setText(gky.a(rBet2.finalTotalOdds));
                                    } else {
                                        textView15.setVisibility(8);
                                        textView14.setVisibility(8);
                                    }
                                    i8 = il30Var.a.favorType;
                                    textView16 = this.K;
                                    textView17 = this.L;
                                    if (i8 != 3) {
                                        textView16.setVisibility(8);
                                        textView17.setVisibility(8);
                                    } else {
                                        textView16.setText(sn5.b(context, R.string.common_functions__free_bet_gift, new Object[0]));
                                        textView17.setText(sn5.b(context, R.string.app_common__minus_prefix, bjb0.P(il30Var.a.favorAmount, locale)));
                                        textView16.setVisibility(0);
                                        textView17.setVisibility(0);
                                    }
                                }
                                boolean zIsPartialPayout2 = rBet3.isPartialPayout(i10);
                                strU = bjb0.U(rBet3.winnings, Locale.US);
                                WinStatusDisplayData winStatusDisplayDataA2 = rkf.a(context2, rBet3.selections, zIsPartialPayout2, this.itemView.getContext().getColor(R.color.text_type2_primary));
                                String strB13 = sn5.b(context2, winStatusDisplayDataA2.title, new Object[0]);
                                drawableA = winStatusDisplayDataA2.iconDrawable;
                                strB = strB13;
                                i13 = R.color.brand_secondary;
                            } else {
                                strB = sn5.b(context2, R.string.bet_history__void, new Object[0]);
                                strU = bjb0.U(rBet3.winnings, Locale.US);
                            }
                            drawableA = null;
                            i2 = R.color.custom_text_type2_primary_type2;
                            TextView textView24 = this.e;
                            textView24.setText(strB);
                            textView24.setTextColor(this.itemView.getContext().getColor(i2));
                            textView24.setCompoundDrawablesWithIntrinsicBounds(drawableA, (Drawable) null, (Drawable) null, (Drawable) null);
                            int color3 = this.itemView.getContext().getColor(i13);
                            View view3 = this.a;
                            view3.setBackgroundColor(color3);
                            view3.setTag(rBet3.orderId);
                            long j5 = rBet3.originalStake;
                            locale = Locale.US;
                            this.f.setText(bjb0.U(j5, locale));
                            zEquals = TextUtils.equals(strU, "--");
                            textView = this.v;
                            if (zEquals) {
                                textView.setTextColor(context2.getColor(R.color.text_type2_tertiary));
                            } else {
                                textView.setTextColor(context2.getColor(R.color.text_type2_tertiary));
                            }
                            textView.setText(strU);
                            zIsOneCutBet = rBet3.isOneCutBet();
                            textView2 = this.i;
                            if (zIsOneCutBet) {
                                textView2.setText(sn5.c(textView2, R.string.component_wap_share_bet__total_return, new Object[0]));
                            } else {
                                textView2.setText(sn5.c(textView2, R.string.component_wap_share_bet__total_return, new Object[0]));
                            }
                            if (i10 != 1) {
                                strB2 = sn5.b(context2, R.string.component_betslip__single, new Object[0]);
                            } else if (i10 == 2) {
                                if (i10 == 3) {
                                    i9 = rBet3.comboType;
                                    if (i9 != 1) {
                                        strB2 = sn5.b(context2, R.string.component_betslip__single, new Object[0]);
                                    } else if (i9 != 2) {
                                        strB2 = sn5.b(context2, R.string.bet_history__doubles, new Object[0]);
                                    } else if (i9 != 3) {
                                        strB2 = sn5.b(context2, R.string.bet_history__vnum_folds, String.valueOf(i9));
                                    } else {
                                        strB2 = sn5.b(context2, R.string.component_betslip__trebles, new Object[0]);
                                    }
                                } else if (i10 != 4) {
                                }
                            }
                            if (rBet3.comboNum > 1) {
                                StringBuilder sb9 = new StringBuilder();
                                sb9.append(strB2);
                                sb9.append("(x");
                                strB2 = zk1.a(rBet3.comboNum, ")", sb9);
                            }
                            TextView textView25 = this.d;
                            textView25.setText(strB2);
                            textView25.setTextColor(this.itemView.getContext().getColor(i2));
                            long j6 = il30Var.a.bonus;
                            textView3 = this.z;
                            textView4 = this.A;
                            b(textView3, textView4, j6);
                            rBet = il30Var.a;
                            if (rBet == null) {
                                z = false;
                            } else {
                                z = false;
                            }
                            zIsPartialCashout = il30Var.a.isPartialCashout();
                            textView5 = this.w;
                            textView6 = this.y;
                            textView7 = this.B;
                            textView8 = this.D;
                            textView9 = this.C;
                            if (zIsPartialCashout) {
                                textView10 = textView8;
                                textView5.setVisibility(8);
                                textView6.setVisibility(8);
                                if (z) {
                                    textView7.setVisibility(0);
                                    textView9.setVisibility(0);
                                    textView9.setText("-".concat(bjb0.P(il30Var.a.taxAmount, locale)));
                                } else {
                                    textView7.setVisibility(8);
                                    textView9.setVisibility(8);
                                }
                                if (z) {
                                    i3 = R.string.component_betslip__to_win;
                                } else {
                                    i3 = R.string.component_betslip__pot_win;
                                }
                                textView10.setText(i3);
                            } else {
                                textView10 = textView8;
                                textView5.setVisibility(8);
                                textView6.setVisibility(8);
                                if (z) {
                                    textView7.setVisibility(0);
                                    textView9.setVisibility(0);
                                    textView9.setText("-".concat(bjb0.P(il30Var.a.taxAmount, locale)));
                                } else {
                                    textView7.setVisibility(8);
                                    textView9.setVisibility(8);
                                }
                                if (z) {
                                    i3 = R.string.component_betslip__to_win;
                                } else {
                                    i3 = R.string.component_betslip__pot_win;
                                }
                                textView10.setText(i3);
                            }
                            zIsSettled = il30Var.a.isSettled();
                            textView11 = this.E;
                            if (zIsSettled) {
                                textView10.setVisibility(8);
                                textView11.setVisibility(8);
                            } else {
                                textView10.setVisibility(8);
                                textView11.setVisibility(8);
                            }
                            rBet2 = il30Var.a;
                            if (rBet2.isAnyWin()) {
                                iD = R.drawable.ic_any_win_label;
                            } else if (!rBet2.isOneCutBet()) {
                                iD = gug0.d(this.itemView.getContext());
                            } else {
                                if (rBet2.selectionSize != -1) {
                                }
                                iD = -1;
                            }
                            strB3 = null;
                            color = this.itemView.getContext().getColor(R.color.custom_text_type2_primary_type2);
                            i5 = rBet2.status;
                            if (i5 != 1) {
                                color = this.itemView.getContext().getColor(R.color.text_type2_primary);
                            } else {
                                color = this.itemView.getContext().getColor(R.color.text_type2_primary);
                            }
                            if (iD != -1) {
                                drawableA2 = s0b.a(this.itemView.getContext(), iD, new a78.a(color));
                            } else {
                                drawableA2 = null;
                            }
                            if (drawableA2 != null) {
                            }
                            TextView textView26 = this.F;
                            g8i0.b(textView26, z3);
                            textView26.setCompoundDrawablesWithIntrinsicBounds(drawableA2, (Drawable) null, (Drawable) null, (Drawable) null);
                            textView26.setText(strB3);
                            textView26.setTextColor(color);
                            view = this.M;
                            view.setVisibility(8);
                            i6 = rBet2.status;
                            if (i6 != 0) {
                                str = rBet2.cutbetType;
                                gqy[] gqyVarArr4 = gqy.a;
                                if (str.equalsIgnoreCase("1")) {
                                    b(textView3, textView4, rBet2.cutbetRemainingBonusAmount);
                                    i7 = 0;
                                    textView3.setText(sn5.c(textView3, R.string.component_betslip__remaining_bonus, new Object[0]));
                                } else {
                                    i7 = 0;
                                    b(textView3, textView4, 0L);
                                }
                                view.setVisibility(i7);
                                int size5 = rBet2.selections.size();
                                StringBuilder sb10 = new StringBuilder();
                                String strB14 = sn5.b(context, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(size5), String.valueOf(size5));
                                sb10.append(sn5.b(context, R.string.component_cashout__pot_win, new Object[i7]));
                                sb10.append(" (");
                                sb10.append(strB14);
                                sb10.append(")");
                                textView10.setText(sb10);
                                StringBuilder sb11 = new StringBuilder();
                                String strB15 = sn5.b(context, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(size5 - 1), String.valueOf(size5));
                                sb11.append(sn5.b(context, R.string.common_functions__one_cut_win, new Object[0]));
                                sb11.append(" (");
                                sb11.append(strB15);
                                sb11.append(")");
                                this.N.setText(sb11);
                                this.O.setText(bjb0.U(rBet2.cutbetWinningAmount, locale));
                            } else {
                                str = rBet2.cutbetType;
                                gqy[] gqyVarArr5 = gqy.a;
                                if (str.equalsIgnoreCase("1")) {
                                    b(textView3, textView4, rBet2.cutbetRemainingBonusAmount);
                                    i7 = 0;
                                    textView3.setText(sn5.c(textView3, R.string.component_betslip__remaining_bonus, new Object[0]));
                                } else {
                                    i7 = 0;
                                    b(textView3, textView4, 0L);
                                }
                                view.setVisibility(i7);
                                int size6 = rBet2.selections.size();
                                StringBuilder sb12 = new StringBuilder();
                                String strB16 = sn5.b(context, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(size6), String.valueOf(size6));
                                sb12.append(sn5.b(context, R.string.component_cashout__pot_win, new Object[i7]));
                                sb12.append(" (");
                                sb12.append(strB16);
                                sb12.append(")");
                                textView10.setText(sb12);
                                StringBuilder sb13 = new StringBuilder();
                                String strB17 = sn5.b(context, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(size6 - 1), String.valueOf(size6));
                                sb13.append(sn5.b(context, R.string.common_functions__one_cut_win, new Object[0]));
                                sb13.append(" (");
                                sb13.append(strB17);
                                sb13.append(")");
                                this.N.setText(sb13);
                                this.O.setText(bjb0.U(rBet2.cutbetWinningAmount, locale));
                            }
                            zIsEmpty = TextUtils.isEmpty(rBet2.totalOdds);
                            textView12 = this.G;
                            textView13 = this.H;
                            if (zIsEmpty) {
                                textView12.setVisibility(8);
                                textView13.setVisibility(8);
                            } else {
                                textView12.setVisibility(8);
                                textView13.setVisibility(8);
                            }
                            zIsEmpty2 = TextUtils.isEmpty(rBet2.finalTotalOdds);
                            textView14 = this.J;
                            textView15 = this.I;
                            if (zIsEmpty2) {
                                textView15.setVisibility(0);
                                textView14.setVisibility(0);
                                textView14.setText(gky.a(rBet2.finalTotalOdds));
                            } else {
                                textView15.setVisibility(8);
                                textView14.setVisibility(8);
                            }
                            i8 = il30Var.a.favorType;
                            textView16 = this.K;
                            textView17 = this.L;
                            if (i8 != 3) {
                                textView16.setVisibility(8);
                                textView17.setVisibility(8);
                            } else {
                                textView16.setText(sn5.b(context, R.string.common_functions__free_bet_gift, new Object[0]));
                                textView17.setText(sn5.b(context, R.string.app_common__minus_prefix, bjb0.P(il30Var.a.favorAmount, locale)));
                                textView16.setVisibility(0);
                                textView17.setVisibility(0);
                            }
                        }
                        strB = sn5.b(context2, R.string.bet_history__lost, new Object[0]);
                        strU = "0.00";
                        i13 = R.color.text_type1_secondary;
                        drawableA = null;
                    }
                    i2 = R.color.text_type2_primary;
                    TextView textView27 = this.e;
                    textView27.setText(strB);
                    textView27.setTextColor(this.itemView.getContext().getColor(i2));
                    textView27.setCompoundDrawablesWithIntrinsicBounds(drawableA, (Drawable) null, (Drawable) null, (Drawable) null);
                    int color4 = this.itemView.getContext().getColor(i13);
                    View view4 = this.a;
                    view4.setBackgroundColor(color4);
                    view4.setTag(rBet3.orderId);
                    long j7 = rBet3.originalStake;
                    locale = Locale.US;
                    this.f.setText(bjb0.U(j7, locale));
                    zEquals = TextUtils.equals(strU, "--");
                    textView = this.v;
                    if (zEquals) {
                        textView.setTextColor(context2.getColor(R.color.text_type2_tertiary));
                    } else {
                        textView.setTextColor(context2.getColor(R.color.text_type2_tertiary));
                    }
                    textView.setText(strU);
                    zIsOneCutBet = rBet3.isOneCutBet();
                    textView2 = this.i;
                    if (zIsOneCutBet) {
                        textView2.setText(sn5.c(textView2, R.string.component_wap_share_bet__total_return, new Object[0]));
                    } else {
                        textView2.setText(sn5.c(textView2, R.string.component_wap_share_bet__total_return, new Object[0]));
                    }
                    if (i10 != 1) {
                        strB2 = sn5.b(context2, R.string.component_betslip__single, new Object[0]);
                    } else if (i10 == 2) {
                        if (i10 == 3) {
                            i9 = rBet3.comboType;
                            if (i9 != 1) {
                                strB2 = sn5.b(context2, R.string.component_betslip__single, new Object[0]);
                            } else if (i9 != 2) {
                                strB2 = sn5.b(context2, R.string.bet_history__doubles, new Object[0]);
                            } else if (i9 != 3) {
                                strB2 = sn5.b(context2, R.string.bet_history__vnum_folds, String.valueOf(i9));
                            } else {
                                strB2 = sn5.b(context2, R.string.component_betslip__trebles, new Object[0]);
                            }
                        } else if (i10 != 4) {
                        }
                    }
                    if (rBet3.comboNum > 1) {
                        StringBuilder sb14 = new StringBuilder();
                        sb14.append(strB2);
                        sb14.append("(x");
                        strB2 = zk1.a(rBet3.comboNum, ")", sb14);
                    }
                    TextView textView28 = this.d;
                    textView28.setText(strB2);
                    textView28.setTextColor(this.itemView.getContext().getColor(i2));
                    long j8 = il30Var.a.bonus;
                    textView3 = this.z;
                    textView4 = this.A;
                    b(textView3, textView4, j8);
                    rBet = il30Var.a;
                    if (rBet == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zIsPartialCashout = il30Var.a.isPartialCashout();
                    textView5 = this.w;
                    textView6 = this.y;
                    textView7 = this.B;
                    textView8 = this.D;
                    textView9 = this.C;
                    if (zIsPartialCashout) {
                        textView10 = textView8;
                        textView5.setVisibility(8);
                        textView6.setVisibility(8);
                        if (z) {
                            textView7.setVisibility(0);
                            textView9.setVisibility(0);
                            textView9.setText("-".concat(bjb0.P(il30Var.a.taxAmount, locale)));
                        } else {
                            textView7.setVisibility(8);
                            textView9.setVisibility(8);
                        }
                        if (z) {
                            i3 = R.string.component_betslip__to_win;
                        } else {
                            i3 = R.string.component_betslip__pot_win;
                        }
                        textView10.setText(i3);
                    } else {
                        textView10 = textView8;
                        textView5.setVisibility(8);
                        textView6.setVisibility(8);
                        if (z) {
                            textView7.setVisibility(0);
                            textView9.setVisibility(0);
                            textView9.setText("-".concat(bjb0.P(il30Var.a.taxAmount, locale)));
                        } else {
                            textView7.setVisibility(8);
                            textView9.setVisibility(8);
                        }
                        if (z) {
                            i3 = R.string.component_betslip__to_win;
                        } else {
                            i3 = R.string.component_betslip__pot_win;
                        }
                        textView10.setText(i3);
                    }
                    zIsSettled = il30Var.a.isSettled();
                    textView11 = this.E;
                    if (zIsSettled) {
                        textView10.setVisibility(8);
                        textView11.setVisibility(8);
                    } else {
                        textView10.setVisibility(8);
                        textView11.setVisibility(8);
                    }
                    rBet2 = il30Var.a;
                    if (rBet2.isAnyWin()) {
                        iD = R.drawable.ic_any_win_label;
                    } else if (!rBet2.isOneCutBet()) {
                        iD = gug0.d(this.itemView.getContext());
                    } else {
                        if (rBet2.selectionSize != -1) {
                        }
                        iD = -1;
                    }
                    strB3 = null;
                    color = this.itemView.getContext().getColor(R.color.custom_text_type2_primary_type2);
                    i5 = rBet2.status;
                    if (i5 != 1) {
                        color = this.itemView.getContext().getColor(R.color.text_type2_primary);
                    } else {
                        color = this.itemView.getContext().getColor(R.color.text_type2_primary);
                    }
                    if (iD != -1) {
                        drawableA2 = s0b.a(this.itemView.getContext(), iD, new a78.a(color));
                    } else {
                        drawableA2 = null;
                    }
                    if (drawableA2 != null) {
                    }
                    TextView textView29 = this.F;
                    g8i0.b(textView29, z3);
                    textView29.setCompoundDrawablesWithIntrinsicBounds(drawableA2, (Drawable) null, (Drawable) null, (Drawable) null);
                    textView29.setText(strB3);
                    textView29.setTextColor(color);
                    view = this.M;
                    view.setVisibility(8);
                    i6 = rBet2.status;
                    if (i6 != 0) {
                        str = rBet2.cutbetType;
                        gqy[] gqyVarArr6 = gqy.a;
                        if (str.equalsIgnoreCase("1")) {
                            b(textView3, textView4, rBet2.cutbetRemainingBonusAmount);
                            i7 = 0;
                            textView3.setText(sn5.c(textView3, R.string.component_betslip__remaining_bonus, new Object[0]));
                        } else {
                            i7 = 0;
                            b(textView3, textView4, 0L);
                        }
                        view.setVisibility(i7);
                        int size7 = rBet2.selections.size();
                        StringBuilder sb15 = new StringBuilder();
                        String strB18 = sn5.b(context, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(size7), String.valueOf(size7));
                        sb15.append(sn5.b(context, R.string.component_cashout__pot_win, new Object[i7]));
                        sb15.append(" (");
                        sb15.append(strB18);
                        sb15.append(")");
                        textView10.setText(sb15);
                        StringBuilder sb16 = new StringBuilder();
                        String strB19 = sn5.b(context, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(size7 - 1), String.valueOf(size7));
                        sb16.append(sn5.b(context, R.string.common_functions__one_cut_win, new Object[0]));
                        sb16.append(" (");
                        sb16.append(strB19);
                        sb16.append(")");
                        this.N.setText(sb16);
                        this.O.setText(bjb0.U(rBet2.cutbetWinningAmount, locale));
                    } else {
                        str = rBet2.cutbetType;
                        gqy[] gqyVarArr7 = gqy.a;
                        if (str.equalsIgnoreCase("1")) {
                            b(textView3, textView4, rBet2.cutbetRemainingBonusAmount);
                            i7 = 0;
                            textView3.setText(sn5.c(textView3, R.string.component_betslip__remaining_bonus, new Object[0]));
                        } else {
                            i7 = 0;
                            b(textView3, textView4, 0L);
                        }
                        view.setVisibility(i7);
                        int size8 = rBet2.selections.size();
                        StringBuilder sb17 = new StringBuilder();
                        String strB110 = sn5.b(context, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(size8), String.valueOf(size8));
                        sb17.append(sn5.b(context, R.string.component_cashout__pot_win, new Object[i7]));
                        sb17.append(" (");
                        sb17.append(strB110);
                        sb17.append(")");
                        textView10.setText(sb17);
                        StringBuilder sb18 = new StringBuilder();
                        String strB111 = sn5.b(context, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(size8 - 1), String.valueOf(size8));
                        sb18.append(sn5.b(context, R.string.common_functions__one_cut_win, new Object[0]));
                        sb18.append(" (");
                        sb18.append(strB111);
                        sb18.append(")");
                        this.N.setText(sb18);
                        this.O.setText(bjb0.U(rBet2.cutbetWinningAmount, locale));
                    }
                    zIsEmpty = TextUtils.isEmpty(rBet2.totalOdds);
                    textView12 = this.G;
                    textView13 = this.H;
                    if (zIsEmpty) {
                        textView12.setVisibility(8);
                        textView13.setVisibility(8);
                    } else {
                        textView12.setVisibility(8);
                        textView13.setVisibility(8);
                    }
                    zIsEmpty2 = TextUtils.isEmpty(rBet2.finalTotalOdds);
                    textView14 = this.J;
                    textView15 = this.I;
                    if (zIsEmpty2) {
                        textView15.setVisibility(0);
                        textView14.setVisibility(0);
                        textView14.setText(gky.a(rBet2.finalTotalOdds));
                    } else {
                        textView15.setVisibility(8);
                        textView14.setVisibility(8);
                    }
                    i8 = il30Var.a.favorType;
                    textView16 = this.K;
                    textView17 = this.L;
                    if (i8 != 3) {
                        textView16.setVisibility(8);
                        textView17.setVisibility(8);
                    } else {
                        textView16.setText(sn5.b(context, R.string.common_functions__free_bet_gift, new Object[0]));
                        textView17.setText(sn5.b(context, R.string.app_common__minus_prefix, bjb0.P(il30Var.a.favorAmount, locale)));
                        textView16.setVisibility(0);
                        textView17.setVisibility(0);
                    }
                }
                strB = sn5.b(context2, z2 ? R.string.bet_history__paying : R.string.component_wap_share_bet__running, new Object[0]);
                strU = "--";
                drawableA = null;
                i2 = R.color.custom_text_type2_primary_type2;
                TextView textView210 = this.e;
                textView210.setText(strB);
                textView210.setTextColor(this.itemView.getContext().getColor(i2));
                textView210.setCompoundDrawablesWithIntrinsicBounds(drawableA, (Drawable) null, (Drawable) null, (Drawable) null);
                int color5 = this.itemView.getContext().getColor(i13);
                View view5 = this.a;
                view5.setBackgroundColor(color5);
                view5.setTag(rBet3.orderId);
                long j9 = rBet3.originalStake;
                locale = Locale.US;
                this.f.setText(bjb0.U(j9, locale));
                zEquals = TextUtils.equals(strU, "--");
                textView = this.v;
                if (zEquals) {
                    textView.setTextColor(context2.getColor(R.color.text_type2_tertiary));
                } else {
                    textView.setTextColor(context2.getColor(R.color.text_type2_tertiary));
                }
                textView.setText(strU);
                zIsOneCutBet = rBet3.isOneCutBet();
                textView2 = this.i;
                if (zIsOneCutBet) {
                    textView2.setText(sn5.c(textView2, R.string.component_wap_share_bet__total_return, new Object[0]));
                } else {
                    textView2.setText(sn5.c(textView2, R.string.component_wap_share_bet__total_return, new Object[0]));
                }
                if (i10 != 1) {
                    strB2 = sn5.b(context2, R.string.component_betslip__single, new Object[0]);
                } else if (i10 == 2) {
                    if (i10 == 3) {
                        i9 = rBet3.comboType;
                        if (i9 != 1) {
                            strB2 = sn5.b(context2, R.string.component_betslip__single, new Object[0]);
                        } else if (i9 != 2) {
                            strB2 = sn5.b(context2, R.string.bet_history__doubles, new Object[0]);
                        } else if (i9 != 3) {
                            strB2 = sn5.b(context2, R.string.bet_history__vnum_folds, String.valueOf(i9));
                        } else {
                            strB2 = sn5.b(context2, R.string.component_betslip__trebles, new Object[0]);
                        }
                    } else if (i10 != 4) {
                    }
                }
                if (rBet3.comboNum > 1) {
                    StringBuilder sb19 = new StringBuilder();
                    sb19.append(strB2);
                    sb19.append("(x");
                    strB2 = zk1.a(rBet3.comboNum, ")", sb19);
                }
                TextView textView211 = this.d;
                textView211.setText(strB2);
                textView211.setTextColor(this.itemView.getContext().getColor(i2));
                long j10 = il30Var.a.bonus;
                textView3 = this.z;
                textView4 = this.A;
                b(textView3, textView4, j10);
                rBet = il30Var.a;
                if (rBet == null) {
                    z = false;
                } else {
                    z = false;
                }
                zIsPartialCashout = il30Var.a.isPartialCashout();
                textView5 = this.w;
                textView6 = this.y;
                textView7 = this.B;
                textView8 = this.D;
                textView9 = this.C;
                if (zIsPartialCashout) {
                    textView10 = textView8;
                    textView5.setVisibility(8);
                    textView6.setVisibility(8);
                    if (z) {
                        textView7.setVisibility(0);
                        textView9.setVisibility(0);
                        textView9.setText("-".concat(bjb0.P(il30Var.a.taxAmount, locale)));
                    } else {
                        textView7.setVisibility(8);
                        textView9.setVisibility(8);
                    }
                    if (z) {
                        i3 = R.string.component_betslip__to_win;
                    } else {
                        i3 = R.string.component_betslip__pot_win;
                    }
                    textView10.setText(i3);
                } else {
                    textView10 = textView8;
                    textView5.setVisibility(8);
                    textView6.setVisibility(8);
                    if (z) {
                        textView7.setVisibility(0);
                        textView9.setVisibility(0);
                        textView9.setText("-".concat(bjb0.P(il30Var.a.taxAmount, locale)));
                    } else {
                        textView7.setVisibility(8);
                        textView9.setVisibility(8);
                    }
                    if (z) {
                        i3 = R.string.component_betslip__to_win;
                    } else {
                        i3 = R.string.component_betslip__pot_win;
                    }
                    textView10.setText(i3);
                }
                zIsSettled = il30Var.a.isSettled();
                textView11 = this.E;
                if (zIsSettled) {
                    textView10.setVisibility(8);
                    textView11.setVisibility(8);
                } else {
                    textView10.setVisibility(8);
                    textView11.setVisibility(8);
                }
                rBet2 = il30Var.a;
                if (rBet2.isAnyWin()) {
                    iD = R.drawable.ic_any_win_label;
                } else if (!rBet2.isOneCutBet()) {
                    iD = gug0.d(this.itemView.getContext());
                } else {
                    if (rBet2.selectionSize != -1) {
                    }
                    iD = -1;
                }
                strB3 = null;
                color = this.itemView.getContext().getColor(R.color.custom_text_type2_primary_type2);
                i5 = rBet2.status;
                if (i5 != 1) {
                    color = this.itemView.getContext().getColor(R.color.text_type2_primary);
                } else {
                    color = this.itemView.getContext().getColor(R.color.text_type2_primary);
                }
                if (iD != -1) {
                    drawableA2 = s0b.a(this.itemView.getContext(), iD, new a78.a(color));
                } else {
                    drawableA2 = null;
                }
                if (drawableA2 != null) {
                }
                TextView textView212 = this.F;
                g8i0.b(textView212, z3);
                textView212.setCompoundDrawablesWithIntrinsicBounds(drawableA2, (Drawable) null, (Drawable) null, (Drawable) null);
                textView212.setText(strB3);
                textView212.setTextColor(color);
                view = this.M;
                view.setVisibility(8);
                i6 = rBet2.status;
                if (i6 != 0) {
                    str = rBet2.cutbetType;
                    gqy[] gqyVarArr8 = gqy.a;
                    if (str.equalsIgnoreCase("1")) {
                        b(textView3, textView4, rBet2.cutbetRemainingBonusAmount);
                        i7 = 0;
                        textView3.setText(sn5.c(textView3, R.string.component_betslip__remaining_bonus, new Object[0]));
                    } else {
                        i7 = 0;
                        b(textView3, textView4, 0L);
                    }
                    view.setVisibility(i7);
                    int size9 = rBet2.selections.size();
                    StringBuilder sb110 = new StringBuilder();
                    String strB112 = sn5.b(context, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(size9), String.valueOf(size9));
                    sb110.append(sn5.b(context, R.string.component_cashout__pot_win, new Object[i7]));
                    sb110.append(" (");
                    sb110.append(strB112);
                    sb110.append(")");
                    textView10.setText(sb110);
                    StringBuilder sb111 = new StringBuilder();
                    String strB113 = sn5.b(context, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(size9 - 1), String.valueOf(size9));
                    sb111.append(sn5.b(context, R.string.common_functions__one_cut_win, new Object[0]));
                    sb111.append(" (");
                    sb111.append(strB113);
                    sb111.append(")");
                    this.N.setText(sb111);
                    this.O.setText(bjb0.U(rBet2.cutbetWinningAmount, locale));
                } else {
                    str = rBet2.cutbetType;
                    gqy[] gqyVarArr9 = gqy.a;
                    if (str.equalsIgnoreCase("1")) {
                        b(textView3, textView4, rBet2.cutbetRemainingBonusAmount);
                        i7 = 0;
                        textView3.setText(sn5.c(textView3, R.string.component_betslip__remaining_bonus, new Object[0]));
                    } else {
                        i7 = 0;
                        b(textView3, textView4, 0L);
                    }
                    view.setVisibility(i7);
                    int size10 = rBet2.selections.size();
                    StringBuilder sb112 = new StringBuilder();
                    String strB114 = sn5.b(context, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(size10), String.valueOf(size10));
                    sb112.append(sn5.b(context, R.string.component_cashout__pot_win, new Object[i7]));
                    sb112.append(" (");
                    sb112.append(strB114);
                    sb112.append(")");
                    textView10.setText(sb112);
                    StringBuilder sb113 = new StringBuilder();
                    String strB115 = sn5.b(context, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(size10 - 1), String.valueOf(size10));
                    sb113.append(sn5.b(context, R.string.common_functions__one_cut_win, new Object[0]));
                    sb113.append(" (");
                    sb113.append(strB115);
                    sb113.append(")");
                    this.N.setText(sb113);
                    this.O.setText(bjb0.U(rBet2.cutbetWinningAmount, locale));
                }
                zIsEmpty = TextUtils.isEmpty(rBet2.totalOdds);
                textView12 = this.G;
                textView13 = this.H;
                if (zIsEmpty) {
                    textView12.setVisibility(8);
                    textView13.setVisibility(8);
                } else {
                    textView12.setVisibility(8);
                    textView13.setVisibility(8);
                }
                zIsEmpty2 = TextUtils.isEmpty(rBet2.finalTotalOdds);
                textView14 = this.J;
                textView15 = this.I;
                if (zIsEmpty2) {
                    textView15.setVisibility(0);
                    textView14.setVisibility(0);
                    textView14.setText(gky.a(rBet2.finalTotalOdds));
                } else {
                    textView15.setVisibility(8);
                    textView14.setVisibility(8);
                }
                i8 = il30Var.a.favorType;
                textView16 = this.K;
                textView17 = this.L;
                if (i8 != 3) {
                    textView16.setVisibility(8);
                    textView17.setVisibility(8);
                } else {
                    textView16.setText(sn5.b(context, R.string.common_functions__free_bet_gift, new Object[0]));
                    textView17.setText(sn5.b(context, R.string.app_common__minus_prefix, bjb0.P(il30Var.a.favorAmount, locale)));
                    textView16.setVisibility(0);
                    textView17.setVisibility(0);
                }
            }
        }
    }

    public abstract class f extends RecyclerView.d0 {
        public abstract void a(int i);
    }

    public jl30(Activity activity, ArrayList arrayList, int i, BoreDrawConfig boreDrawConfig) {
        this.b = activity;
        this.c = arrayList;
        this.a = i;
        this.d = boreDrawConfig;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        return ((hl30) this.c.get(i)).a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        ((f) d0Var).a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 5) {
            return new d(dzc.a(viewGroup, R.layout.spr_bet_detail_selection_item, viewGroup, false));
        }
        if (i == 11) {
            return new b(dzc.a(viewGroup, R.layout.spr_bet_detail_combo_item, viewGroup, false));
        }
        if (i == 7) {
            return new e(dzc.a(viewGroup, R.layout.spr_bet_detail_title_item, viewGroup, false));
        }
        if (i == 8) {
            return new c(dzc.a(viewGroup, R.layout.spr_bet_detail_common_bar, viewGroup, false));
        }
        if (i == 9) {
            return new a(dzc.a(viewGroup, R.layout.spr_bet_detail_cashout_item, viewGroup, false));
        }
        eub.a("RBetDetailsAdapter viewHolder return null,type:" + i);
        return null;
    }
}
