package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetDetailsActivity;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;
import com.sportybet.android.bethistory.presentation.viewholder.EditBetHistoryItemView;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.android.editbet.presentation.view.EditHistoryDetailActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.data.BoreDrawConfig;
import com.sportybet.plugin.realsports.data.RSelection;
import com.sportybet.plugin.realsports.data.RTicket;
import com.sportybet.plugin.realsports.data.RemixBet;
import com.sportybet.plugin.realsports.data.UserNote;
import com.sportybet.plugin.realsports.data.WinStatusDisplayData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class eu30 extends RecyclerView.f<k> {
    public final uqm A;
    public final psm B;
    public final nr7 C;
    public final boolean D;
    public final boolean E;
    public BoreDrawConfig F;
    public RSportsBetTicketDetailsActivity G;
    public final boolean H;
    public final y8j I;
    public final Activity a;
    public List<hl30> b;
    public boolean c;
    public boolean d;
    public int e;
    public String f;
    public final dz80 i;
    public boolean v = false;
    public final s090 w;
    public g y;
    public f z;

    /* JADX INFO: loaded from: classes2.dex */
    public class a extends k implements View.OnClickListener {
        public final TextView a;
        public final TextView b;
        public final TextView c;
        public final TextView d;
        public final TextView e;
        public final View f;

        public a(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.td_ticket_bet_size);
            this.c = (TextView) view.findViewById(R.id.device_info);
            TextView textView = (TextView) view.findViewById(R.id.td_ticket_bet_detail);
            this.b = textView;
            Drawable drawableA = iwh0.a(textView.getContext(), R.drawable.spr_ic_keyboard_arrow_right_black_24dp, textView.getContext().getColor(R.color.brand_quinary));
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableA, (Drawable) null);
            TextView textView2 = (TextView) view.findViewById(R.id.check_transaction_history);
            this.d = textView2;
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableA, (Drawable) null);
            TextView textView3 = (TextView) view.findViewById(R.id.td_delete_ticket);
            this.e = textView3;
            this.f = view.findViewById(R.id.divider4);
            textView3.setOnClickListener(this);
            textView2.setOnClickListener(this);
            textView.setOnClickListener(this);
        }

        @Override // eu30.k
        public final void a(int i) {
            ou30 ou30Var;
            eu30 eu30Var = eu30.this;
            if (eu30Var.b.get(i) instanceof au30) {
                au30 au30Var = (au30) eu30Var.b.get(i);
                this.a.setText(sn5.c(this.itemView, R.string.bet_history__number_of_bets_vnum, String.valueOf(au30Var.a)));
                boolean z = eu30Var.c;
                View view = this.f;
                TextView textView = this.e;
                if (!z || au30Var.g) {
                    textView.setVisibility(8);
                    view.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    view.setVisibility(0);
                    textView.setTag(au30Var);
                }
                String str = au30Var.e;
                ou30.a aVar = ou30.b;
                String str2 = au30Var.d;
                aVar.getClass();
                uag uagVar = ou30.e;
                q3.b bVarA = ocx.a(uagVar, uagVar);
                do {
                    if (!bVarA.hasNext()) {
                        ou30Var = ou30.UNKNOWN;
                        break;
                    }
                    ou30Var = (ou30) bVarA.next();
                } while (!kotlin.text.c.l(ou30Var.name(), str2, true));
                List<String> listAsList = Arrays.asList(str, ou30Var.a);
                StringBuilder sb = new StringBuilder();
                for (String str3 : listAsList) {
                    if (!TextUtils.isEmpty(str3)) {
                        if (sb.length() > 0) {
                            sb.append(" | ");
                        }
                        sb.append(str3);
                    }
                }
                this.c.setText(sb.toString());
                this.b.setTag(au30Var);
                this.d.setTag(au30Var);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity;
            eu30 eu30Var = eu30.this;
            Activity activity = eu30Var.a;
            if (view.getId() == R.id.td_ticket_bet_detail) {
                Intent intent = new Intent(activity, (Class<?>) RSportsBetDetailsActivity.class);
                au30 au30Var = (au30) view.getTag();
                if (au30Var != null) {
                    intent.putExtra("order_type", au30Var.f);
                    intent.putExtra(AnalyticsParam.SOCIAL_ORDER_ID, au30Var.b);
                    yrh0.s(activity, intent, true);
                }
                f00 f00Var = vgb0.a;
                vgb0.a("BetHistory_BetDetails");
                return;
            }
            if (view.getId() != R.id.check_transaction_history) {
                if (view.getId() == R.id.td_delete_ticket) {
                    final RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity2 = (RSportsBetTicketDetailsActivity) activity;
                    final String str = ((au30) view.getTag()).b;
                    rSportsBetTicketDetailsActivity2.getClass();
                    androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(rSportsBetTicketDetailsActivity2);
                    aVar.a.f = rSportsBetTicketDetailsActivity2.getCMSString(R.string.bet_history__are_you_sure_ticket_delete, new Object[0]);
                    aVar.c(rSportsBetTicketDetailsActivity2.getCMSString(R.string.common_feedback__delete, new Object[0]), new DialogInterface.OnClickListener() { // from class: at30
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            int i2 = RSportsBetTicketDetailsActivity.s0;
                            RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity3 = rSportsBetTicketDetailsActivity2;
                            su5<BaseResponse> su5Var = rSportsBetTicketDetailsActivity3.N;
                            if (su5Var != null) {
                                su5Var.cancel();
                            }
                            mo0 mo0Var = rSportsBetTicketDetailsActivity3.z;
                            String str2 = str;
                            su5<BaseResponse> su5VarD = mo0Var.d(str2);
                            rSportsBetTicketDetailsActivity3.N = su5VarD;
                            su5VarD.G(new mt30(rSportsBetTicketDetailsActivity3, str2));
                        }
                    });
                    aVar.b(rSportsBetTicketDetailsActivity2.getCMSString(R.string.common_functions__cancel, new Object[0]), new ct30());
                    aVar.f();
                    return;
                }
                return;
            }
            au30 au30Var2 = (au30) view.getTag();
            if (au30Var2 == null || (rSportsBetTicketDetailsActivity = eu30Var.G) == null) {
                return;
            }
            Pair<String, String>[] pairArr = {new Pair(lobGSRIlnSGJY.JjKYObBRZIOAiZM, au30Var2.c)};
            azm azmVar = rSportsBetTicketDetailsActivity.b;
            wae waeVar = wae.TRANS_SEARCH;
            fag fagVar = fag.PAYSLIP_RS_SHORTCUT;
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_ENTRANCE", fagVar);
            azmVar.k(waeVar, pairArr, bundle);
        }
    }

    public class b extends k implements View.OnClickListener {
        public final Drawable A;
        public final TextView B;
        public final TextView C;
        public final ImageView D;
        public final TextView a;
        public boolean b;
        public final ConstraintLayout c;
        public final TextView d;
        public final TextView e;
        public final TextView f;
        public final TextView i;
        public final TextView v;
        public final TextView w;
        public final TextView y;
        public final Drawable z;

        public b(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.td_ticket_cashout_bar);
            this.a = textView;
            if (!eu30.this.d) {
                textView.setOnClickListener(this);
            }
            this.c = (ConstraintLayout) view.findViewById(R.id.td_ticket_cashout_content_layout);
            this.d = (TextView) view.findViewById(R.id.td_ticket_total_cashout_value);
            this.e = (TextView) view.findViewById(R.id.td_ticket_remain_stake_label);
            this.f = (TextView) view.findViewById(R.id.ttd_ticket_remain_stake_value);
            this.i = (TextView) view.findViewById(R.id.td_ticket_remain_pot_win_label);
            this.v = (TextView) view.findViewById(R.id.td_ticket_remain_pot_win_value);
            this.w = (TextView) view.findViewById(R.id.td_ticket_used_label);
            this.y = (TextView) view.findViewById(R.id.td_ticket_used_value);
            this.B = (TextView) view.findViewById(R.id.td_ticket_remain_tax_amount_label);
            this.C = (TextView) view.findViewById(R.id.td_ticket_remain_tax_amount);
            this.z = iwh0.a(textView.getContext(), R.drawable.spr_ic_arrow_drop_down_black_24dp, -1);
            this.A = iwh0.a(textView.getContext(), R.drawable.spr_ic_arrow_right_black_24dp, -1);
            this.D = (ImageView) view.findViewById(R.id.verify_bet_color_background);
        }

        @Override // eu30.k
        public final void a(int i) {
            Locale locale = Locale.US;
            eu30 eu30Var = eu30.this;
            if (eu30Var.b.get(i) instanceof bu30) {
                bu30 bu30Var = (bu30) eu30Var.b.get(i);
                boolean z = eu30Var.c;
                TextView textView = this.B;
                TextView textView2 = this.w;
                TextView textView3 = this.y;
                TextView textView4 = this.v;
                TextView textView5 = this.i;
                TextView textView6 = this.f;
                TextView textView7 = this.C;
                TextView textView8 = this.e;
                if (z) {
                    textView8.setVisibility(8);
                    textView6.setVisibility(8);
                    textView5.setVisibility(8);
                    textView4.setVisibility(8);
                    textView2.setVisibility(0);
                    textView3.setVisibility(0);
                    textView3.setText(bjb0.P(bu30Var.d, locale));
                    textView.setVisibility(8);
                    textView7.setVisibility(8);
                } else {
                    textView8.setVisibility(0);
                    textView6.setVisibility(0);
                    textView5.setVisibility(0);
                    textView4.setVisibility(0);
                    textView2.setVisibility(8);
                    textView3.setVisibility(8);
                    textView6.setText(bjb0.P(bu30Var.b, locale));
                    textView5.setText(bu30Var.f ? R.string.bet_history__max_to_win : R.string.bet_history__total_remaining_pot_win);
                    textView4.setText(bjb0.P(bu30Var.c, locale));
                    if (bjb0.d0(bu30Var.e) > 0.0d) {
                        textView.setVisibility(0);
                        textView7.setVisibility(0);
                        textView7.setText(bjb0.L(new BigDecimal(bu30Var.e).multiply(new BigDecimal("-1")), locale));
                    } else {
                        textView.setVisibility(8);
                        textView7.setVisibility(8);
                    }
                }
                this.d.setText(bjb0.P(bu30Var.a, locale));
                boolean z2 = eu30Var.d;
                ImageView imageView = this.D;
                if (!z2) {
                    b(false);
                    imageView.setVisibility(8);
                } else {
                    this.b = true;
                    this.c.setVisibility(0);
                    imageView.setVisibility(0);
                }
            }
        }

        public final void b(boolean z) {
            if (z) {
                this.b = !this.b;
            }
            boolean z2 = this.b;
            ConstraintLayout constraintLayout = this.c;
            TextView textView = this.a;
            if (z2) {
                textView.setCompoundDrawablesWithIntrinsicBounds(this.z, (Drawable) null, (Drawable) null, (Drawable) null);
                constraintLayout.setVisibility(0);
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(this.A, (Drawable) null, (Drawable) null, (Drawable) null);
                constraintLayout.setVisibility(8);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b(true);
        }
    }

    public class c extends k {
        public final LinearLayout a;
        public final CheckedTextView b;
        public final Drawable c;
        public final Drawable d;
        public int e;

        public c(View view) {
            super(view);
            Drawable drawableA = iwh0.a(this.itemView.getContext(), R.drawable.spr_ic_arrow_right_black_24dp, this.itemView.getContext().getColor(R.color.text_type2_primary));
            this.c = drawableA;
            this.d = iwh0.a(this.itemView.getContext(), R.drawable.spr_ic_arrow_drop_down_black_24dp, this.itemView.getContext().getColor(R.color.text_type2_primary));
            this.e = 0;
            this.a = (LinearLayout) view.findViewById(R.id.edit_bet_history_container);
            CheckedTextView checkedTextView = (CheckedTextView) view.findViewById(R.id.edit_bet_history);
            this.b = checkedTextView;
            checkedTextView.setCompoundDrawablesWithIntrinsicBounds(drawableA, (Drawable) null, (Drawable) null, (Drawable) null);
            checkedTextView.setOnClickListener(new View.OnClickListener() { // from class: fu30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    eu30.c cVar = this.a;
                    CheckedTextView checkedTextView2 = cVar.b;
                    checkedTextView2.setChecked(!checkedTextView2.isChecked());
                    checkedTextView2.setCompoundDrawablesWithIntrinsicBounds(checkedTextView2.isChecked() ? cVar.d : cVar.c, (Drawable) null, (Drawable) null, (Drawable) null);
                    cVar.a.setVisibility(checkedTextView2.isChecked() ? 0 : 8);
                }
            });
        }

        @Override // eu30.k
        public final void a(int i) {
            hl30 hl30Var = eu30.this.b.get(i);
            if (hl30Var instanceof zt30) {
                ArrayList arrayList = ((zt30) hl30Var).b;
                if (arrayList.size() == this.e) {
                    return;
                }
                this.e = arrayList.size();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    final wpf wpfVar = (wpf) arrayList.get(i2);
                    final EditBetHistoryItemView editBetHistoryItemView = new EditBetHistoryItemView(this.itemView.getContext());
                    final boolean z = true;
                    if (i2 != this.e - 1) {
                        z = false;
                    }
                    editBetHistoryItemView.setupInfo(wpfVar.a, wpfVar.b);
                    editBetHistoryItemView.setOnClickListener(new View.OnClickListener() { // from class: gu30
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i3 = EditHistoryDetailActivity.c;
                            Context context = editBetHistoryItemView.getContext();
                            String str = wpfVar.c;
                            context.getClass();
                            str.getClass();
                            Intent intent = new Intent(context, (Class<?>) EditHistoryDetailActivity.class);
                            intent.putExtra(siPCzPFw.EbFXymRCn, str);
                            intent.putExtra("key_is_original", z);
                            context.startActivity(intent);
                        }
                    });
                    this.a.addView(editBetHistoryItemView);
                }
            }
        }
    }

    public class d extends k {
        public final TextView A;
        public final View B;
        public final ImageView C;
        public final ComposeView D;
        public xec E;
        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;
        public final TextView e;
        public final TextView f;
        public final TextView i;
        public final TextView v;
        public final LinearLayout w;
        public final TextView y;
        public final TextView z;

        public d(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.td_live);
            this.b = (TextView) view.findViewById(R.id.td_game_id_date);
            this.c = (ImageView) view.findViewById(R.id.winning_hint_img);
            ImageView imageView = (ImageView) view.findViewById(R.id.td_status_icon);
            this.d = imageView;
            imageView.setOnClickListener(new tf8(this, 1));
            this.e = (TextView) view.findViewById(R.id.td_match_name);
            this.A = (TextView) view.findViewById(R.id.comments);
            this.v = (TextView) view.findViewById(R.id.game_label);
            this.f = (TextView) view.findViewById(R.id.td_game_score);
            this.i = (TextView) view.findViewById(R.id.td_game_score_tracker_limiter);
            this.w = (LinearLayout) view.findViewById(R.id.td_selection_container);
            TextView textView = (TextView) view.findViewById(R.id.td_live_betting);
            this.y = textView;
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, iwh0.a(view.getContext(), R.drawable.spr_ic_keyboard_arrow_right_black_24dp, view.getContext().getColor(R.color.brand_quaternary)), (Drawable) null);
            TextView textView2 = (TextView) view.findViewById(R.id.match_tracker);
            this.z = textView2;
            Drawable drawableA = iwh0.a(view.getContext(), R.drawable.spr_ic_match_tracker_selector, view.getContext().getColor(R.color.brand_quinary));
            int iA = r0b.a(view.getContext(), 16);
            drawableA.setBounds(0, 0, iA, iA);
            textView2.setCompoundDrawables(drawableA, null, null, null);
            this.B = view.findViewById(R.id.td_bottom_line);
            this.C = (ImageView) view.findViewById(R.id.delayed_settle_icon);
            this.D = (ComposeView) view.findViewById(R.id.td_bo_message_container);
        }

        /* JADX WARN: Code duplicated, block: B:77:0x01b5  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v14, types: [android.view.View, android.widget.TextView] */
        /* JADX WARN: Type inference failed for: r3v43 */
        /* JADX WARN: Type inference failed for: r3v44 */
        /* JADX WARN: Type inference failed for: r3v45 */
        /* JADX WARN: Type inference failed for: r3v46 */
        /* JADX WARN: Type inference failed for: r3v47 */
        /* JADX WARN: Type inference failed for: r3v48 */
        /* JADX WARN: Type inference failed for: r3v49 */
        /* JADX WARN: Type inference failed for: r3v50 */
        /* JADX WARN: Type inference failed for: r3v51 */
        /* JADX WARN: Type inference failed for: r3v52 */
        /* JADX WARN: Type inference failed for: r3v53 */
        /* JADX WARN: Type inference failed for: r6v24 */
        /* JADX WARN: Type inference failed for: r6v25, types: [android.graphics.drawable.Drawable, android.view.View$OnClickListener] */
        /* JADX WARN: Type inference failed for: r6v29 */
        /* JADX WARN: Type inference failed for: r8v5, types: [android.view.View, android.widget.TextView] */
        @Override // eu30.k
        public final void a(int i) {
            String strD;
            int i2;
            int i3;
            ?? r3;
            TextView textView;
            ?? r6;
            int i4;
            int i5;
            String strC;
            TextView textView2;
            TextView textView3;
            eu30 eu30Var = eu30.this;
            psm psmVar = eu30Var.B;
            Activity activity = eu30Var.a;
            this.B.setVisibility(i == eu30Var.b.size() - 2 ? 4 : 0);
            hl30 hl30Var = eu30Var.b.get(i);
            if (hl30Var instanceof cu30) {
                cu30 cu30Var = (cu30) hl30Var;
                final RSelection rSelection = cu30Var.a;
                TextView textView4 = this.A;
                textView4.setVisibility(8);
                TextView textView5 = this.a;
                textView5.setVisibility(8);
                ImageView imageView = this.d;
                imageView.setImageDrawable(null);
                imageView.setTag(null);
                TextView textView6 = this.f;
                textView6.setVisibility(8);
                TextView textView7 = this.i;
                textView7.setVisibility(8);
                TextView textView8 = this.v;
                textView8.setVisibility(8);
                textView8.setTypeface(textView8.getTypeface(), 0);
                textView8.setTextColor(activity.getColor(R.color.text_type2_tertiary));
                StringBuilder sb = new StringBuilder();
                if (!TextUtils.isEmpty(rSelection.gameId)) {
                    sb.append(sn5.c(this.itemView, R.string.bet_history__game_id_vid, rSelection.gameId));
                    sb.append(" | ");
                }
                mfb0 mfb0VarE = lfb0.d().e(rSelection.sportId);
                if (rSelection.isOngoing()) {
                    textView5.setVisibility(0);
                    strD = mfb0VarE == null ? "" : mfb0VarE.f(rSelection.playedSeconds, rSelection.remainingTimeInPeriod, rSelection.matchStatus);
                } else {
                    psmVar = psmVar;
                    strD = bwf0.a.d(rSelection.startTime, false);
                }
                if (!TextUtils.isEmpty(strD)) {
                    sb.append(strD);
                }
                boolean zIsEmpty = TextUtils.isEmpty(sb.toString());
                TextView textView9 = this.b;
                if (zIsEmpty) {
                    textView9.setVisibility(8);
                } else {
                    textView9.setVisibility(0);
                    textView9.setText(sb.toString());
                }
                boolean zIsRefundAll = rSelection.isRefundAll();
                TextView textView10 = this.z;
                int i6 = 1;
                if (zIsRefundAll || rSelection.isVoid() || !rSelection.showMatchTracker() || eu30Var.d) {
                    i2 = 8;
                    textView10.setVisibility(8);
                    textView10.setOnClickListener(null);
                } else {
                    textView10.setVisibility(0);
                    textView10.setOnClickListener(new pf8(i6, this, rSelection));
                    i2 = 8;
                }
                this.C.setVisibility(q980.c(rSelection) ? 0 : i2);
                ImageView imageView2 = this.c;
                imageView2.setVisibility(i2);
                imageView.setTag(rSelection);
                int i7 = rSelection.eventStatus;
                if ((i7 == 0 || i7 == 6) && rSelection.status == 0) {
                    i3 = R.drawable.ic_selection_status_not_started;
                    r3 = textView4;
                    textView = textView10;
                } else {
                    if (rSelection.isOngoing()) {
                        TextView textView11 = textView4;
                        textView = textView10;
                        if (System.currentTimeMillis() - rSelection.startTime < 21600000 || !"sr:sport:1".equals(rSelection.sportId)) {
                            imageView2.setVisibility(8);
                            textView3 = textView11;
                        } else {
                            imageView2.setVisibility(0);
                            imageView2.setOnClickListener(new hu30());
                            textView3 = textView11;
                        }
                    } else {
                        textView2 = textView4;
                        textView = textView10;
                        int i8 = rSelection.status;
                        if (i8 != 0) {
                            if (i8 == 1) {
                                int i9 = rSelection.settleType;
                                if (i9 == 1) {
                                    textView3 = textView2;
                                    i3 = R.drawable.ic_selection_status_flashwin;
                                    r3 = textView2;
                                } else if (i9 == 2) {
                                    textView3 = textView2;
                                    i3 = R.drawable.ic_selection_status_flashsave;
                                    r3 = textView2;
                                } else if (i9 == 5) {
                                    textView3 = textView2;
                                    i3 = R.drawable.ic_selection_status_1_up;
                                    r3 = textView2;
                                } else if (i9 == 3) {
                                    i3 = R.drawable.ic_selection_status_2_up;
                                    r3 = textView2;
                                } else if (i9 == 6) {
                                    i3 = R.drawable.ic_selection_status_over_under_early_goals;
                                    r3 = textView2;
                                } else if (i9 == 7) {
                                    textView3 = textView2;
                                    i3 = R.drawable.ic_selection_status_1_up;
                                    r3 = textView2;
                                } else {
                                    i3 = R.drawable.ic_selection_status_win;
                                    r3 = textView2;
                                }
                            } else if (i8 == 2) {
                                textView3 = textView2;
                                i3 = R.drawable.ic_selection_status_lost;
                                r3 = textView2;
                            } else if (i8 == 3) {
                                i3 = R.drawable.ic_selection_status_void;
                                r3 = textView2;
                            } else if (i8 != 4) {
                                i3 = -1;
                                r3 = textView2;
                            } else {
                                i3 = R.drawable.ic_selection_status_refund_all;
                                r3 = textView2;
                            }
                        }
                    }
                    textView3 = textView2;
                    i3 = R.drawable.ic_selection_status_ongoing;
                    r3 = textView3;
                }
                imageView.setImageDrawable(i3 == -1 ? null : gr0.a(activity, i3));
                j7g j7gVar = new j7g();
                if (b3.U(rSelection.eventId)) {
                    if (!TextUtils.isEmpty(rSelection.marketDesc)) {
                        j7gVar = new j7g(rSelection.marketDesc);
                    }
                } else if (b3.T(rSelection.eventId)) {
                    if (!TextUtils.isEmpty(rSelection.categoryName) && !TextUtils.isEmpty(rSelection.tournamentName)) {
                        j7gVar = new j7g(rSelection.tournamentName);
                    }
                } else if (!TextUtils.isEmpty(rSelection.home) && !TextUtils.isEmpty(rSelection.away)) {
                    j7gVar = new j7g(rSelection.home);
                    j7gVar.a(" vs ");
                    j7gVar.a(rSelection.away);
                }
                j7gVar.n(j7gVar);
                this.e.setText(j7gVar);
                if (!rSelection.isVoid() && !b3.U(rSelection.eventId)) {
                    int i10 = rSelection.eventStatus;
                    if (i10 == 1 || i10 == 2) {
                        textView8.setVisibility(0);
                        textView8.setText(sn5.c(textView8, R.string.bet_history__live_score, new Object[0]));
                        mfb0 mfb0VarE2 = lfb0.d().e(rSelection.sportId);
                        ArrayList arrayList = new ArrayList();
                        if (mfb0VarE2 != null) {
                            arrayList.addAll(mfb0VarE2.A(rSelection.setScore, rSelection.pointScore, rSelection.gameScore));
                        }
                        textView6.setVisibility(0);
                        textView7.setVisibility(0);
                        if (arrayList.isEmpty()) {
                            textView6.setText(sn5.c(textView6, R.string.common_functions__not_available, new Object[0]));
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
                                for (int i11 = 2; i11 < arrayList.size(); i11 += 2) {
                                    j7gVar2.a("  ");
                                    j7gVar2.a((CharSequence) arrayList.get(i11));
                                    j7gVar2.a(":");
                                    j7gVar2.a((CharSequence) arrayList.get(i11 + 1));
                                }
                            }
                            textView6.setText(j7gVar2);
                        }
                    } else if (i10 == 3 || i10 == 4) {
                        if (b3.T(rSelection.eventId)) {
                            textView8.setVisibility(8);
                            textView6.setVisibility(8);
                            textView7.setVisibility(8);
                        } else {
                            textView8.setVisibility(0);
                            if ("sr:sport:1".equals(rSelection.sportId) || "sr:sport:202120001".equals(rSelection.sportId) || "sr:sport:137".equals(rSelection.sportId)) {
                                i5 = 0;
                                strC = sn5.c(textView8, R.string.bet_history__ft_score, new Object[0]);
                            } else {
                                i5 = 0;
                                strC = sn5.c(textView8, R.string.bet_history__final_score, new Object[0]);
                            }
                            textView8.setText(strC);
                            textView6.setVisibility(i5);
                            textView7.setVisibility(i5);
                            if (TextUtils.isEmpty(rSelection.setScore)) {
                                textView6.setText(sn5.c(textView6, R.string.common_functions__not_available, new Object[i5]));
                            } else {
                                textView6.setVisibility(i5);
                                textView6.setText(rSelection.setScore);
                            }
                        }
                    }
                }
                LinearLayout linearLayout = this.w;
                linearLayout.removeAllViews();
                if (rSelection.isBetBuilder()) {
                    g880.b(rSelection, linearLayout);
                    int i12 = 0;
                    while (i12 < rSelection.betBuilderSelections.size()) {
                        boolean z = i12 == rSelection.betBuilderSelections.size() + (-1);
                        RSelection rSelection2 = rSelection.betBuilderSelections.get(i12);
                        BoreDrawConfig boreDrawConfig = eu30Var.F;
                        rSelection2.getClass();
                        RSelection rSelection3 = rSelection;
                        g880.d(rSelection2, linearLayout, boreDrawConfig, rSelection3, z, 16);
                        rSelection = rSelection3;
                        i12++;
                    }
                    r6 = 0;
                } else {
                    r6 = 0;
                    g880.d(rSelection, linearLayout, eu30Var.F, null, false, 28);
                }
                g880.a(rSelection, linearLayout);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
                if (textView8.getVisibility() == 0) {
                    layoutParams.removeRule(3);
                    layoutParams.addRule(3, textView8.getId());
                } else {
                    layoutParams.removeRule(3);
                    layoutParams.addRule(3, textView.getId());
                }
                linearLayout.setLayoutParams(layoutParams);
                boolean zIsOngoing = rSelection.isOngoing();
                ?? r8 = this.y;
                if (zIsOngoing && (cu30Var.a.sportId.equals("sr:sport:21") || rSelection.haveLive)) {
                    if (psmVar.W()) {
                        r8.setVisibility(8);
                        i4 = 0;
                    } else {
                        i4 = 0;
                        r8.setVisibility(0);
                    }
                    int i13 = rSelection.commentsNum;
                    View view = this.itemView;
                    if (i13 > 0) {
                        StringBuilder sb2 = new StringBuilder(sn5.c(view, R.string.bet_history__go_to_live_betting, new Object[i4]));
                        sb2.append("(Chat ");
                        zug.b(sb2, rSelection.commentsNum <= 999 ? zk1.a(rSelection.commentsNum, ")", new StringBuilder()) : "999+", r8);
                    } else {
                        r8.setText(sn5.c(view, R.string.bet_history__go_to_live_betting, new Object[i4]));
                    }
                    r8.setOnClickListener(new View.OnClickListener() { // from class: iu30
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            Activity activity2 = eu30.this.a;
                            Intent intent = new Intent(activity2, (Class<?>) EventActivity.class);
                            intent.putExtra("EXTRA_EVENT_ID", rSelection.eventId);
                            intent.putExtra("EXTRA_SOURCE", 3);
                            int i14 = EventActivity.U0;
                            EventActivity.a.a(activity2, intent);
                        }
                    });
                } else {
                    int i14 = rSelection.eventStatus;
                    if (i14 == 3 || i14 == 4) {
                        r8.setVisibility(8);
                        r8.setOnClickListener(r6);
                    } else if (i14 == 0) {
                        Drawable drawableA = iwh0.a(r3.getContext(), R.drawable.spr_comment, r3.getContext().getColor(R.color.brand_quinary));
                        drawableA.setBounds(0, 0, zch0.a(activity, 16), zch0.a(activity, 16));
                        r3.setCompoundDrawables(drawableA, r6, r6, r6);
                        r3.setGravity(16);
                        int i15 = rSelection.commentsNum;
                        r3.setText(i15 <= 999 ? i15 > 0 ? String.valueOf(i15) : r15 : "999+");
                        r3.setOnClickListener(new View.OnClickListener() { // from class: ju30
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Activity activity2 = eu30.this.a;
                                Intent intent = new Intent(activity2, (Class<?>) PreMatchEventActivity.class);
                                intent.putExtra("EXTRA_EVENT_ID", rSelection.eventId);
                                intent.putExtra("EXTRA_NAVI_TAB", 2);
                                yrh0.s(activity2, intent, true);
                            }
                        });
                        r3.setVisibility((b3.T(rSelection.eventId) || b3.U(rSelection.eventId) || b3.S(rSelection.eventId) || psmVar.W()) ? 8 : 0);
                        r8.setVisibility(8);
                        r8.setOnClickListener(r6);
                    } else {
                        r8.setVisibility(8);
                        r8.setOnClickListener(r6);
                    }
                }
                boolean z2 = cu30Var.d;
                ComposeView composeView = this.D;
                if (!z2 || rSelection.eventPendingReason == null) {
                    composeView.setVisibility(8);
                    return;
                }
                composeView.setVisibility(0);
                xg4.b(composeView, rSelection.eventPendingReason.getTitle() != null ? rSelection.eventPendingReason.getTitle() : r15, rSelection.eventPendingReason.getDesc() != null ? rSelection.eventPendingReason.getDesc() : "");
                for (int childCount = linearLayout.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = linearLayout.getChildAt(childCount);
                    if (childAt.getVisibility() != 8) {
                        ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                            marginLayoutParams.bottomMargin = 0;
                            childAt.setLayoutParams(marginLayoutParams);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public class e extends k implements View.OnClickListener {
        public final TextView a;
        public final ImageView b;
        public final View c;
        public String d;

        public e(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.td_ticket_booking_code);
            ((ImageView) view.findViewById(R.id.td_ticket_copy_btn)).setOnClickListener(this);
            ImageView imageView = (ImageView) view.findViewById(R.id.td_ticket_share_btn);
            this.b = imageView;
            imageView.setOnClickListener(this);
            ((ImageView) view.findViewById(R.id.rebet_info)).setOnClickListener(this);
            this.c = view.findViewById(R.id.btn_share_loading);
            ((TextView) view.findViewById(R.id.td_ticket_rebet_btn)).setOnClickListener(this);
        }

        @Override // eu30.k
        public final void a(int i) {
            RTicket rTicket;
            eu30 eu30Var = eu30.this;
            boolean z = eu30Var.v;
            ImageView imageView = this.b;
            View view = this.c;
            if (z) {
                view.setVisibility(0);
                imageView.setVisibility(8);
            } else {
                view.setVisibility(8);
                imageView.setVisibility(0);
            }
            hl30 hl30Var = eu30Var.b.get(i);
            if (!(hl30Var instanceof pu30) || (rTicket = ((pu30) hl30Var).a) == null) {
                return;
            }
            String str = rTicket.shareCode;
            this.d = str;
            this.a.setText(str);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int id = view.getId();
            if (id == R.id.td_ticket_copy_btn) {
                yrh0.e(this.d);
                return;
            }
            eu30 eu30Var = eu30.this;
            if (id == R.id.td_ticket_share_btn) {
                dz80 dz80Var = eu30Var.i;
                if (dz80Var != null) {
                    String str = this.d;
                    if (TextUtils.isEmpty(str)) {
                        dz80Var.c(new kqc());
                        return;
                    }
                    dz80Var.c(new lqc());
                    su5<BaseResponse<BookingData>> su5Var = dz80Var.d;
                    if (su5Var != null) {
                        su5Var.cancel();
                    }
                    su5<BaseResponse<BookingData>> su5VarB = dz80Var.c.b(str);
                    dz80Var.d = su5VarB;
                    su5VarB.G(new cz80(dz80Var));
                    return;
                }
                return;
            }
            if (id == R.id.td_ticket_rebet_btn) {
                eu30Var.C.a(this.d);
                return;
            }
            if (id == R.id.rebet_info) {
                Context context = this.itemView.getContext();
                context.getClass();
                FragmentManager supportFragmentManager = null;
                try {
                    Context contextB = dvi.b(context);
                    contextB.getClass();
                    supportFragmentManager = ((androidx.fragment.app.e) contextB).getSupportFragmentManager();
                    if (supportFragmentManager.H("rebet_intro_info") != null) {
                        itf0.a aVar = itf0.a;
                        aVar.q("rebet_intro_info");
                        aVar.a("a dialog is already on the screen", new Object[0]);
                        return;
                    }
                } catch (ClassCastException unused) {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q("rebet_intro_info");
                    aVar2.a("Can't get fragment manager", new Object[0]);
                }
                if (supportFragmentManager == null || supportFragmentManager.K) {
                    return;
                }
                y040 y040Var = new y040();
                y040Var.setCancelable(false);
                y040Var.show(supportFragmentManager, "rebet_intro_info");
            }
        }
    }

    public class f extends k {
        public final ComposeView a;
        public h550 b;

        public f(View view) {
            super(view);
            this.a = (ComposeView) view.findViewById(R.id.remix_note_container);
        }

        @Override // eu30.k
        public final void a(int i) {
            RemixBet remixBet;
            String str;
            eu30 eu30Var = eu30.this;
            hl30 hl30Var = eu30Var.b.get(i);
            if (!(hl30Var instanceof qu30) || (remixBet = ((qu30) hl30Var).a) == null) {
                return;
            }
            final boolean zIsWon = remixBet.isWon();
            boolean shouldShowRedDot = remixBet.getShouldShowRedDot();
            final lu30 lu30Var = new lu30(this);
            ComposeView composeView = this.a;
            composeView.getClass();
            final h550 h550Var = new h550(shouldShowRedDot);
            composeView.setViewCompositionStrategy(u6i0.c.a);
            composeView.setContent(new op8(148253210, new Function2() { // from class: y350
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        h550 h550Var2 = h550Var;
                        c450.b(zIsWon, lu30Var, null, ((Boolean) ((x5a0) h550Var2.b).getValue()).booleanValue(), ((Boolean) ((x5a0) h550Var2.a).getValue()).booleanValue(), aVar, 0);
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
            this.b = h550Var;
            int winningStatus = remixBet.getWinningStatus();
            if (winningStatus == 20) {
                str = AnalyticsParam.BET_HISTORY_TICKET__WON_REMIX_BET_BTN;
            } else if (winningStatus == 40) {
                str = AnalyticsParam.BET_HISTORY_TICKET__VOID_REMIX_BET_BTN;
            } else {
                str = winningStatus == 30 ? AnalyticsParam.BET_HISTORY_TICKET__LOST_REMIX_BET_BTN : null;
            }
            if (str != null) {
                eu30Var.I.c(composeView, str);
            }
        }
    }

    public class g extends k implements View.OnClickListener {
        public final View a;
        public final TextView b;
        public final ProgressButton c;

        public g(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.share_c);
            this.a = viewFindViewById;
            ProgressButton progressButton = (ProgressButton) viewFindViewById.findViewById(R.id.share);
            this.c = progressButton;
            progressButton.setOnClickListener(this);
            progressButton.setButtonText(sn5.b(eu30.this.a, R.string.component_pop_dialog__show_off, new Object[0]));
            progressButton.setTextTypeFace(Typeface.defaultFromStyle(1));
            this.b = (TextView) view.findViewById(R.id.show_off_user_name);
        }

        @Override // eu30.k
        public final void a(int i) {
            ru30 ru30Var;
            RTicket rTicket;
            eu30 eu30Var = eu30.this;
            psm psmVar = eu30Var.B;
            hl30 hl30Var = eu30Var.b.get(i);
            if (!(hl30Var instanceof ru30) || (rTicket = (ru30Var = (ru30) hl30Var).a) == null) {
                return;
            }
            View view = this.a;
            view.setVisibility(8);
            if (rTicket.isAllSelectionSettled()) {
                if (eu30Var.d) {
                    view.setVisibility(8);
                } else {
                    view.setVisibility(0);
                    String str = ru30Var.b;
                    boolean z = psmVar.W() || psmVar.r();
                    boolean zIsEmpty = TextUtils.isEmpty(str);
                    TextView textView = this.b;
                    if (zIsEmpty) {
                        textView.setVisibility(z ? 8 : 0);
                        textView.setText(sn5.c(this.itemView, R.string.verify_bet__no_user_name_set, new Object[0]));
                    } else if (z && str.equals(eu30Var.a.getString(R.string.verify_bet__no_user_name_set))) {
                        textView.setVisibility(8);
                    } else {
                        textView.setVisibility(0);
                        textView.setText(str);
                    }
                }
                this.c.setTag(rTicket.orderId);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view.getId() == R.id.share) {
                ProgressButton progressButton = this.c;
                progressButton.setLoading(true);
                progressButton.setEnabled(false);
                if (TextUtils.isEmpty((String) view.getTag())) {
                    return;
                }
                eu30 eu30Var = eu30.this;
                s090 s090Var = eu30Var.w;
                RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = (RSportsBetTicketDetailsActivity) s090Var;
                rSportsBetTicketDetailsActivity.C1(eu30Var.e, eu30Var.f);
            }
        }
    }

    public class h extends k implements View.OnClickListener {
        public final TextView A;
        public final TextView B;
        public final TextView C;
        public final TextView D;
        public final TextView E;
        public final TextView F;
        public final TextView G;
        public final TextView H;
        public final TextView I;
        public final AppCompatImageView J;
        public final View K;
        public final View L;
        public final View M;
        public final TextView N;
        public final TextView O;
        public final TextView P;
        public final View Q;
        public final TextView R;
        public final TextView S;
        public final int T;
        public final int U;
        public final int V;
        public final TextView W;
        public final LinearLayout X;
        public final TextView a;
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

        public h(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.td_ticket_id);
            this.b = (TextView) view.findViewById(R.id.td_ticket_date);
            this.c = (TextView) view.findViewById(R.id.td_ticket_order_type);
            this.d = (TextView) view.findViewById(R.id.td_ticket_status);
            this.e = (TextView) view.findViewById(R.id.td_ticket_stake_value);
            this.i = (TextView) view.findViewById(R.id.td_ticket_gift_label);
            this.v = (TextView) view.findViewById(R.id.td_ticket_gift_value);
            this.f = (TextView) view.findViewById(R.id.td_ticket_return_value);
            this.w = (TextView) view.findViewById(R.id.td_ticket_bonus_label);
            this.y = (TextView) view.findViewById(R.id.td_ticket_bonus_value);
            this.z = (TextView) view.findViewById(R.id.td_ticket_tax_label);
            this.A = (TextView) view.findViewById(R.id.td_ticket_tax_value);
            this.B = (TextView) view.findViewById(R.id.td_ticket_pot_win_label);
            this.C = (TextView) view.findViewById(R.id.td_ticket_pot_win_value);
            this.D = (TextView) view.findViewById(R.id.td_ticket_cashout_desc);
            this.E = (TextView) view.findViewById(R.id.td_ticket_insure);
            this.F = (TextView) view.findViewById(R.id.td_ticket_total_odds_label);
            this.G = (TextView) view.findViewById(R.id.td_ticket_total_odds_value);
            this.H = (TextView) view.findViewById(R.id.td_ticket_final_odds_label);
            this.I = (TextView) view.findViewById(R.id.td_ticket_final_odds_value);
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.td_ticket_final_odds_tip_icon);
            this.J = appCompatImageView;
            appCompatImageView.setOnClickListener(new sc3(this, 3));
            ImageView imageView = (ImageView) view.findViewById(R.id.verify_bet_color_background);
            this.K = view.findViewById(R.id.odds_boost_container);
            this.L = view.findViewById(R.id.odds_boost_live_group);
            this.M = view.findViewById(R.id.odds_flash_boost_group);
            this.N = (TextView) view.findViewById(R.id.td_ticket_stake_label);
            this.X = (LinearLayout) view.findViewById(R.id.td_autobet_badge);
            this.O = (TextView) view.findViewById(R.id.td_ticket_return_label);
            TextView textView = (TextView) view.findViewById(R.id.coins_hint);
            this.P = textView;
            textView.setOnClickListener(this);
            this.Q = view.findViewById(R.id.one_cut_still_win_layout);
            this.R = (TextView) view.findViewById(R.id.one_cut_still_win);
            this.S = (TextView) view.findViewById(R.id.one_cut_still_win_label);
            TextView textView2 = (TextView) view.findViewById(R.id.edit_bet);
            this.W = textView2;
            c8i0.b(textView2, 200L, new r7v(this, 1));
            this.T = view.getContext().getColor(R.color.brand_quinary);
            this.U = view.getContext().getColor(R.color.text_type2_tertiary);
            this.V = view.getContext().getColor(R.color.other003);
            if (eu30.this.d) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }

        public static void b(TextView textView, TextView textView2, Double d) {
            if (d.doubleValue() <= 0.0d) {
                textView.setVisibility(8);
                textView2.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView2.setVisibility(0);
                textView2.setText(bjb0.P(String.valueOf(d), Locale.US));
            }
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0315  */
        /* JADX WARN: Code duplicated, block: B:101:0x0317  */
        /* JADX WARN: Code duplicated, block: B:104:0x0326  */
        /* JADX WARN: Code duplicated, block: B:105:0x0340  */
        /* JADX WARN: Code duplicated, block: B:107:0x0365  */
        /* JADX WARN: Code duplicated, block: B:110:0x0388  */
        /* JADX WARN: Code duplicated, block: B:112:0x0396  */
        /* JADX WARN: Code duplicated, block: B:113:0x039e  */
        /* JADX WARN: Code duplicated, block: B:114:0x03a0  */
        /* JADX WARN: Code duplicated, block: B:120:0x03b1  */
        /* JADX WARN: Code duplicated, block: B:123:0x03cb  */
        /* JADX WARN: Code duplicated, block: B:124:0x03f7  */
        /* JADX WARN: Code duplicated, block: B:133:0x0415  */
        /* JADX WARN: Code duplicated, block: B:146:0x043c  */
        /* JADX WARN: Code duplicated, block: B:148:0x0442 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:151:0x0452  */
        /* JADX WARN: Code duplicated, block: B:153:0x045a  */
        /* JADX WARN: Code duplicated, block: B:156:0x0468  */
        /* JADX WARN: Code duplicated, block: B:158:0x046e  */
        /* JADX WARN: Code duplicated, block: B:159:0x0478  */
        /* JADX WARN: Code duplicated, block: B:161:0x047d  */
        /* JADX WARN: Code duplicated, block: B:163:0x0481 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:168:0x0498  */
        /* JADX WARN: Code duplicated, block: B:169:0x049b  */
        /* JADX WARN: Code duplicated, block: B:176:0x04ab  */
        /* JADX WARN: Code duplicated, block: B:179:0x04b3  */
        /* JADX WARN: Code duplicated, block: B:180:0x04b5  */
        /* JADX WARN: Code duplicated, block: B:183:0x04be  */
        /* JADX WARN: Code duplicated, block: B:184:0x04c0  */
        /* JADX WARN: Code duplicated, block: B:187:0x04cb  */
        /* JADX WARN: Code duplicated, block: B:190:0x04d4  */
        /* JADX WARN: Code duplicated, block: B:192:0x04d9  */
        /* JADX WARN: Code duplicated, block: B:195:0x04ec  */
        /* JADX WARN: Code duplicated, block: B:196:0x04ef  */
        /* JADX WARN: Code duplicated, block: B:199:0x0508  */
        /* JADX WARN: Code duplicated, block: B:200:0x051f  */
        /* JADX WARN: Code duplicated, block: B:202:0x0529  */
        /* JADX WARN: Code duplicated, block: B:203:0x052d  */
        /* JADX WARN: Code duplicated, block: B:210:0x054a  */
        /* JADX WARN: Code duplicated, block: B:217:0x0586  */
        /* JADX WARN: Code duplicated, block: B:223:0x05a6  */
        /* JADX WARN: Code duplicated, block: B:227:0x05bd  */
        /* JADX WARN: Code duplicated, block: B:230:0x05d2  */
        /* JADX WARN: Code duplicated, block: B:233:0x05e0  */
        /* JADX WARN: Code duplicated, block: B:236:0x05e6  */
        /* JADX WARN: Code duplicated, block: B:238:0x05ec  */
        /* JADX WARN: Code duplicated, block: B:239:0x05f7  */
        /* JADX WARN: Code duplicated, block: B:241:0x05fd  */
        /* JADX WARN: Code duplicated, block: B:248:0x0626  */
        /* JADX WARN: Code duplicated, block: B:249:0x0639  */
        /* JADX WARN: Code duplicated, block: B:24:0x0086  */
        /* JADX WARN: Code duplicated, block: B:252:0x063d  */
        /* JADX WARN: Code duplicated, block: B:255:0x065a  */
        /* JADX WARN: Code duplicated, block: B:260:0x0663  */
        /* JADX WARN: Code duplicated, block: B:270:0x0710  */
        /* JADX WARN: Code duplicated, block: B:282:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:95:0x02b3  */
        /* JADX WARN: Code duplicated, block: B:97:0x02ed  */
        @Override // eu30.k
        public final void a(int i) {
            String strB;
            boolean z;
            String strB2;
            String strP;
            int i2;
            Drawable drawableA;
            Locale locale;
            String strP2;
            TextView textView;
            boolean z2;
            LinearLayout linearLayout;
            int i3;
            TextView textView2;
            double dD0;
            TextView textView3;
            TextView textView4;
            TextView textView5;
            int i4;
            String str;
            int i5;
            boolean z3;
            boolean z4;
            int i6;
            int i7;
            int i8;
            int i9;
            String str2;
            boolean zHasTax;
            TextView textView6;
            TextView textView7;
            int i10;
            TextView textView8;
            boolean zIsEmpty;
            TextView textView9;
            TextView textView10;
            boolean zIsEmpty2;
            AppCompatImageView appCompatImageView;
            TextView textView11;
            TextView textView12;
            boolean z5;
            boolean z6;
            TextView textView13;
            int iD;
            int i11;
            String strB3;
            Drawable drawableA2;
            String str3;
            String str4;
            int i12;
            int i13;
            Drawable drawableA3;
            float fMeasureText;
            int measuredWidth;
            int measuredWidth2;
            int width;
            boolean z7;
            ConstraintLayout.LayoutParams layoutParams;
            ConstraintLayout.LayoutParams layoutParams2;
            eu30 eu30Var = eu30.this;
            boolean z8 = eu30Var.D;
            Activity activity = eu30Var.a;
            hl30 hl30Var = eu30Var.b.get(i);
            if (hl30Var instanceof du30) {
                du30 du30Var = (du30) hl30Var;
                RTicket rTicket = du30Var.a;
                int i14 = (!rTicket.isEditable || rTicket.hasBetBuilderSelection()) ? 8 : 0;
                TextView textView14 = this.W;
                textView14.setVisibility(i14);
                List<String> list = rTicket.betIds;
                if (list != null && !list.isEmpty()) {
                    textView14.setTag(rTicket.betIds.get(0));
                }
                Object[] objArr = {rTicket.shortId};
                TextView textView15 = this.a;
                textView15.setText(sn5.c(textView15, R.string.bet_history__ticket_id_vid, objArr));
                this.b.setText(bwf0.a.d(rTicket.createTime, false));
                TextView textView16 = this.c;
                Context context = textView16.getContext();
                int i15 = rTicket.orderType;
                int i16 = rTicket.combinationSize;
                String strB4 = "";
                if (i15 == 1) {
                    strB = sn5.b(context, R.string.component_betslip__singles, new Object[0]);
                } else if (i15 == 2) {
                    strB = sn5.b(context, R.string.bet_history__multiple, new Object[0]);
                } else if (i15 == 3) {
                    strB = sn5.b(context, R.string.common_functions__system, new Object[0]);
                } else if (i15 == 4 || i15 == 5) {
                    strB = sn5.b(context, R.string.bet_history__multiple, new Object[0]);
                } else {
                    strB = "";
                }
                String str5 = ")";
                if (i16 > 1) {
                    strB = strB + "(x" + i16 + ")";
                }
                textView16.setText(strB);
                Context context2 = this.itemView.getContext();
                if (eu30Var.d) {
                    StringBuilder sb = new StringBuilder(sn5.c(textView15, R.string.bet_history__ticket_owner, new Object[0]));
                    sb.append(": ");
                    zug.b(sb, du30Var.b, textView15);
                } else {
                    textView15.setText(sn5.c(textView15, R.string.bet_history__ticket_id_vid, rTicket.shortId));
                }
                int i17 = rTicket.paymentType;
                TextView textView17 = this.O;
                TextView textView18 = this.N;
                if (i17 == 0) {
                    textView18.setText(sn5.c(textView18, R.string.bet_history__total_stake, new Object[0]));
                    if (eu30Var.d) {
                        textView17.setText(sn5.b(context2, R.string.bet_history__total_sportybet_return, new Object[0]) + " (" + rTicket.currency + ")");
                    } else {
                        textView17.setText(sn5.b(context2, R.string.bet_history__total_sportybet_return, new Object[0]));
                    }
                } else if (i17 == 1) {
                    textView18.setText(sn5.b(context2, R.string.bet_history__total_stake_coins, new Object[0]));
                    textView17.setText(sn5.b(context2, R.string.bet_history__total_return_coins, new Object[0]));
                }
                if (rTicket.paymentType == 1) {
                    Drawable drawableA4 = gr0.a(context2, R.drawable.spr_ic_chevron_right_black_24dp);
                    TextView textView19 = this.P;
                    if (drawableA4 != null) {
                        drawableA4.setTint(-1);
                        textView19.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableA4, (Drawable) null);
                    }
                    Drawable drawableA5 = gr0.a(context2, R.drawable.spr_sportycoin_bubble);
                    if (drawableA5 != null) {
                        drawableA5.setTint(context2.getColor(R.color.hint));
                        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                        textView19.setBackground(drawableA5);
                    }
                    boolean z9 = eu30Var.c;
                    if (z9 && rTicket.winningStatus == 20) {
                        textView19.setVisibility(0);
                        textView19.setText(sn5.b(context2, R.string.bet_history__sportcoins_ticket_settled_hint, new Object[0]));
                    } else if (z9) {
                        textView19.setVisibility(8);
                    } else {
                        textView19.setVisibility(0);
                        textView19.setText(sn5.b(context2, R.string.bet_history__sportcoins_ticket_unsettled_hint, new Object[0]));
                    }
                }
                boolean z10 = rTicket.isPaymentInProgress;
                int i18 = z10 ? 0 : rTicket.winningStatus;
                int i19 = this.T;
                int i20 = R.color.text_type2_primary;
                if (i18 != 0) {
                    z = z8;
                    if (i18 != 5) {
                        if (i18 == 20) {
                            boolean zIsPartialPayout = rTicket.isPartialPayout();
                            strP = bjb0.P(rTicket.totalWinnings, Locale.US);
                            WinStatusDisplayData winStatusDisplayDataA = rkf.a(context2, rTicket.selections, zIsPartialPayout, i19);
                            textView17 = textView17;
                            str5 = ")";
                            String strB5 = sn5.b(context2, winStatusDisplayDataA.title, new Object[0]);
                            Drawable drawable = winStatusDisplayDataA.iconDrawable;
                            if (winStatusDisplayDataA.title == R.string.bet_history__won && winStatusDisplayDataA.isNormalSettled) {
                                i20 = R.color.brand_quinary;
                            }
                            eu30Var.e = rTicket.percent;
                            eu30Var.f = strP;
                            drawableA = drawable;
                            i2 = i20;
                            strB2 = strB5;
                        } else if (i18 == 30) {
                            strB2 = sn5.b(context2, R.string.bet_history__lost, new Object[0]);
                            i20 = R.color.text_type1_secondary;
                            strP = "0.00";
                        } else if (i18 == 40) {
                            strB2 = sn5.b(context2, R.string.bet_history__void, new Object[0]);
                            strP = bjb0.P(rTicket.totalWinnings, Locale.US);
                        } else if (i18 != 90) {
                            strP = "--";
                            strB2 = "";
                        } else {
                            strB2 = sn5.b(context2, R.string.component_wap_share_bet__pending, new Object[0]);
                            drawableA = gr0.a(context2, R.drawable.ic_selection_status_pending);
                            textView17 = textView17;
                            str5 = ")";
                            strP = "--";
                            i2 = R.color.text_type2_primary;
                        }
                        TextView textView20 = this.d;
                        textView20.setText(strB2);
                        textView20.setTextColor(context2.getColor(i2));
                        textView20.setCompoundDrawablesWithIntrinsicBounds(drawableA, (Drawable) null, (Drawable) null, (Drawable) null);
                        String str6 = rTicket.totalStake;
                        locale = Locale.US;
                        strP2 = bjb0.P(str6, locale);
                        textView = this.e;
                        textView.setText(strP2);
                        z2 = rTicket.isAutoBet;
                        linearLayout = this.X;
                        if (z2) {
                            linearLayout.setVisibility(0);
                            fMeasureText = textView.getPaint().measureText(strP2);
                            linearLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                            measuredWidth = linearLayout.getMeasuredWidth();
                            textView18.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                            measuredWidth2 = textView18.getMeasuredWidth();
                            width = this.itemView.getWidth();
                            if (width == 0) {
                                width = context2.getResources().getDisplayMetrics().widthPixels;
                            }
                            if (r0b.a(context2, 4) + measuredWidth + fMeasureText > ((width - r0b.a(context2, 32)) - measuredWidth2) - r0b.a(context2, 8)) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            layoutParams = (ConstraintLayout.LayoutParams) linearLayout.getLayoutParams();
                            layoutParams2 = (ConstraintLayout.LayoutParams) textView.getLayoutParams();
                            if (z7) {
                                layoutParams.v = 0;
                                layoutParams.u = -1;
                                layoutParams.i = 0;
                                layoutParams.l = -1;
                                layoutParams.setMarginEnd(0);
                                layoutParams2.j = R.id.td_autobet_badge;
                                layoutParams2.i = -1;
                                layoutParams2.l = -1;
                                layoutParams2.v = 0;
                            } else {
                                layoutParams.u = R.id.td_ticket_stake_value;
                                layoutParams.v = -1;
                                layoutParams.i = 0;
                                layoutParams.l = 0;
                                layoutParams.setMarginEnd(r0b.a(context2, 4));
                                layoutParams2.i = 0;
                                layoutParams2.j = -1;
                                layoutParams2.l = 0;
                                layoutParams2.v = 0;
                            }
                            linearLayout.setLayoutParams(layoutParams);
                            textView.setLayoutParams(layoutParams2);
                        } else {
                            linearLayout.setVisibility(8);
                            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) textView.getLayoutParams();
                            layoutParams3.i = 0;
                            layoutParams3.j = -1;
                            layoutParams3.l = 0;
                            layoutParams3.v = 0;
                            textView.setLayoutParams(layoutParams3);
                        }
                        i3 = rTicket.paymentType;
                        textView2 = this.f;
                        if (i3 == 1) {
                            i13 = this.V;
                            textView2.setTextColor(i13);
                            drawableA3 = gr0.a(context2, R.drawable.ic_coins);
                            if (drawableA3 != null) {
                                drawableA3.setTint(i13);
                                textView2.setCompoundDrawablesWithIntrinsicBounds(drawableA3, (Drawable) null, (Drawable) null, (Drawable) null);
                            }
                        } else if (i3 == 0) {
                            if (!TextUtils.equals(strP, "--") || TextUtils.equals(strP, "0.00")) {
                                textView2.setTextColor(this.U);
                            } else {
                                textView2.setTextColor(i19);
                            }
                        }
                        textView2.setText(strP);
                        dD0 = bjb0.d0(rTicket.favorAmount);
                        textView3 = this.v;
                        textView4 = this.i;
                        textView5 = this.D;
                        if (dD0 > 0.0d) {
                            textView4.setVisibility(0);
                            textView3.setVisibility(0);
                            textView5.setVisibility(0);
                            textView4.setText(qz3.e(rTicket.favorType).e(context2));
                            textView3.setText(sn5.b(context2, R.string.app_common__minus_prefix, bjb0.P(rTicket.favorAmount, locale)));
                        } else {
                            textView5.setVisibility(8);
                            textView4.setVisibility(8);
                            textView3.setVisibility(8);
                        }
                        if (!rTicket.isOneCutBet() || rTicket.oddsBoosted || ((rTicket.isFlexBet() && !z) || (rTicket.isAnyWin() && !eu30Var.E))) {
                            i4 = 0;
                            textView5.setVisibility(0);
                        } else {
                            i4 = 0;
                        }
                        if (rTicket.oddsBoosted || du30Var.c) {
                            if (!rTicket.isFlexBet() && !z) {
                                strB4 = sn5.b(activity, R.string.bet_history__cashout_unavailable_for_flex, new Object[i4]);
                            } else if (!rTicket.isAnyWin() && !eu30Var.E) {
                                strB4 = sn5.b(activity, R.string.bet_history__cashout_unavailable_for_any_win, new Object[i4]);
                            } else if (rTicket.isOneCutBet()) {
                                strB4 = sn5.b(activity, R.string.bet_history__cashout_unavailable_for_one_cut, new Object[i4]);
                            } else if ((rTicket.favorType == 3 || !eu30Var.H) && dD0 != 0.0d) {
                            }
                            str = strB4;
                            textView5.setText(str);
                            if (TextUtils.isEmpty(str)) {
                                i5 = 8;
                            } else {
                                i5 = 0;
                            }
                            textView5.setVisibility(i5);
                        } else {
                            textView5.setText(sn5.b(context2, R.string.cashout__unavailable_for_oddsboost, new Object[i4]));
                        }
                        z3 = rTicket.oddsBoosted;
                        z4 = rTicket.lfbOddsBoosted;
                        if (!z3 || z4) {
                            i6 = 0;
                        } else {
                            i6 = 8;
                        }
                        this.K.setVisibility(i6);
                        if (z3) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        this.L.setVisibility(i7);
                        if (z4) {
                            i8 = 0;
                        } else {
                            i8 = 8;
                        }
                        this.M.setVisibility(i8);
                        if (eu30Var.d) {
                            textView5.setVisibility(8);
                        }
                        if (eu30Var.c) {
                            i9 = R.string.bet_history__total_bonus;
                        } else {
                            i9 = R.string.bet_history__max_bonus;
                        }
                        String strB6 = sn5.b(context2, i9, new Object[0]);
                        TextView textView21 = this.w;
                        textView21.setText(strB6);
                        if (eu30Var.c) {
                            str2 = rTicket.bonusPrize;
                        } else {
                            str2 = rTicket.totalBonus;
                        }
                        Double dValueOf = Double.valueOf(bjb0.d0(str2));
                        TextView textView22 = this.y;
                        b(textView21, textView22, dValueOf);
                        zHasTax = rTicket.hasTax();
                        textView6 = this.A;
                        textView7 = this.z;
                        if (zHasTax) {
                            textView7.setVisibility(0);
                            textView6.setVisibility(0);
                            textView6.setText("-".concat(bjb0.P(rTicket.taxAmount, locale)));
                        } else {
                            textView7.setVisibility(8);
                            textView6.setVisibility(8);
                        }
                        if (zHasTax) {
                            i10 = R.string.component_betslip__to_win;
                        } else {
                            i10 = R.string.component_betslip__total_pot_win;
                        }
                        textView8 = this.B;
                        textView8.setText(i10);
                        zIsEmpty = TextUtils.isEmpty(rTicket.totalOdds);
                        textView9 = this.G;
                        textView10 = this.F;
                        if (!zIsEmpty || (rTicket.orderType == 1 && rTicket.selectionSize > 1)) {
                            textView10.setVisibility(8);
                            textView9.setVisibility(8);
                        } else {
                            textView10.setVisibility(0);
                            textView9.setVisibility(0);
                            textView9.setText(gky.a(rTicket.totalOdds));
                            if (!TextUtils.isEmpty(rTicket.finalTotalOdds)) {
                                textView10.setText(sn5.b(context2, R.string.bet_history__void_total_odds, new Object[0]));
                            }
                        }
                        zIsEmpty2 = TextUtils.isEmpty(rTicket.finalTotalOdds);
                        appCompatImageView = this.J;
                        textView11 = this.H;
                        textView12 = this.I;
                        if (!zIsEmpty2) {
                            z5 = true;
                            if (rTicket.orderType == 1 || rTicket.selectionSize <= 1) {
                                textView11.setVisibility(0);
                                appCompatImageView.setVisibility(0);
                                textView12.setVisibility(0);
                                textView12.setText(gky.a(rTicket.finalTotalOdds));
                            }
                            double dD1 = bjb0.d0(rTicket.potentialWinnings);
                            z6 = eu30Var.c;
                            textView13 = this.C;
                            if (!z6 || dD1 <= 0.0d) {
                                textView8.setVisibility(8);
                                textView13.setVisibility(8);
                            } else {
                                textView8.setVisibility(0);
                                textView13.setVisibility(0);
                                textView13.setText(bjb0.P(rTicket.potentialWinnings, locale));
                            }
                            if (rTicket.isAnyWin()) {
                                iD = R.drawable.ic_any_win_label;
                            } else {
                                if (!rTicket.isOneCutBet()) {
                                    if (rTicket.isFlexBet() || (i11 = rTicket.minToWin) == -1 || rTicket.selectionSize == -1) {
                                        iD = -1;
                                    } else {
                                        strB3 = sn5.b(context2, R.string.cashout__flexi_label_vmintowin_of_vsize, String.valueOf(i11), String.valueOf(rTicket.selectionSize));
                                        iD = R.drawable.ic_flexi_outline;
                                    }
                                    if (iD != -1) {
                                        drawableA2 = s0b.a(this.itemView.getContext(), iD, new a78.c(R.color.custom_brand_secondary_type3));
                                    } else {
                                        drawableA2 = null;
                                    }
                                    if (drawableA2 == null) {
                                        z5 = false;
                                    }
                                    TextView textView23 = this.E;
                                    g8i0.b(textView23, z5);
                                    textView23.setCompoundDrawables(drawableA2, null, null, null);
                                    textView23.setText(strB3);
                                    View view = this.Q;
                                    view.setVisibility(8);
                                    if (rTicket.isOneCutBet() || !((i12 = rTicket.winningStatus) == 0 || i12 == 90)) {
                                        str3 = r13;
                                        str4 = str5;
                                    } else {
                                        String str7 = rTicket.cutbetType;
                                        gqy[] gqyVarArr = gqy.a;
                                        if (str7.equalsIgnoreCase("1")) {
                                            textView21.setText(sn5.c(textView21, R.string.component_betslip__remaining_bonus, new Object[0]));
                                            textView22.setText(rTicket.cutbetRemainingBonusAmount);
                                        } else {
                                            b(textView21, textView22, Double.valueOf(0.0d));
                                        }
                                        this.R.setText(rTicket.cutbetWinningAmount);
                                        view.setVisibility(0);
                                        if (rTicket.winningStatus == 0) {
                                            int size = rTicket.selections.size();
                                            StringBuilder sb2 = new StringBuilder();
                                            String strB7 = sn5.b(context2, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(size), String.valueOf(size));
                                            sb2.append(sn5.b(context2, R.string.component_cashout__pot_win, new Object[0]));
                                            str3 = " (";
                                            sb2.append(str3);
                                            sb2.append(strB7);
                                            str4 = str5;
                                            sb2.append(str4);
                                            textView8.setText(sb2);
                                            textView8.setVisibility(0);
                                            StringBuilder sb3 = new StringBuilder();
                                            String strB8 = sn5.b(context2, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(size - 1), String.valueOf(size));
                                            sb3.append(sn5.b(context2, R.string.common_functions__one_cut_win, new Object[0]));
                                            sb3.append(str3);
                                            sb3.append(strB8);
                                            sb3.append(str4);
                                            this.S.setText(sb3);
                                        } else {
                                            str3 = r13;
                                            str4 = str5;
                                        }
                                    }
                                    if (rTicket.isOneCutBet() || rTicket.winningStatus != 20) {
                                    }
                                    int size2 = rTicket.selections.size();
                                    int i21 = rTicket.isOneCutWin ? size2 - 1 : size2;
                                    StringBuilder sb4 = new StringBuilder();
                                    String strB9 = sn5.b(context2, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(i21), String.valueOf(size2));
                                    sb4.append(sn5.b(context2, R.string.component_wap_share_bet__total_return, new Object[0]));
                                    sb4.append(str3);
                                    sb4.append(strB9);
                                    sb4.append(str4);
                                    if (eu30Var.d) {
                                        sb4.append(str3);
                                        sb4.append(rTicket.currency);
                                        sb4.append(str4);
                                    }
                                    textView17.setText(sb4);
                                    return;
                                }
                                iD = gug0.d(this.itemView.getContext());
                            }
                            strB3 = null;
                            if (iD != -1) {
                                drawableA2 = s0b.a(this.itemView.getContext(), iD, new a78.c(R.color.custom_brand_secondary_type3));
                            } else {
                                drawableA2 = null;
                            }
                            if (drawableA2 == null) {
                                z5 = false;
                            }
                            TextView textView24 = this.E;
                            g8i0.b(textView24, z5);
                            textView24.setCompoundDrawables(drawableA2, null, null, null);
                            textView24.setText(strB3);
                            View view2 = this.Q;
                            view2.setVisibility(8);
                            if (rTicket.isOneCutBet()) {
                                str3 = r13;
                                str4 = str5;
                            } else {
                                str3 = r13;
                                str4 = str5;
                            }
                            if (rTicket.isOneCutBet()) {
                            }
                        }
                        z5 = true;
                        textView11.setVisibility(8);
                        appCompatImageView.setVisibility(8);
                        textView12.setVisibility(8);
                        double dD2 = bjb0.d0(rTicket.potentialWinnings);
                        z6 = eu30Var.c;
                        textView13 = this.C;
                        if (z6) {
                            textView8.setVisibility(8);
                            textView13.setVisibility(8);
                        } else {
                            textView8.setVisibility(8);
                            textView13.setVisibility(8);
                        }
                        if (rTicket.isAnyWin()) {
                            iD = R.drawable.ic_any_win_label;
                        } else if (!rTicket.isOneCutBet()) {
                            iD = gug0.d(this.itemView.getContext());
                        } else {
                            if (rTicket.isFlexBet()) {
                            }
                            iD = -1;
                        }
                        strB3 = null;
                        if (iD != -1) {
                            drawableA2 = s0b.a(this.itemView.getContext(), iD, new a78.c(R.color.custom_brand_secondary_type3));
                        } else {
                            drawableA2 = null;
                        }
                        if (drawableA2 == null) {
                            z5 = false;
                        }
                        TextView textView25 = this.E;
                        g8i0.b(textView25, z5);
                        textView25.setCompoundDrawables(drawableA2, null, null, null);
                        textView25.setText(strB3);
                        View view3 = this.Q;
                        view3.setVisibility(8);
                        if (rTicket.isOneCutBet()) {
                            str3 = r13;
                            str4 = str5;
                        } else {
                            str3 = r13;
                            str4 = str5;
                        }
                        if (rTicket.isOneCutBet()) {
                        }
                    }
                    strB2 = sn5.b(context2, R.string.bet_history__partial_win, new Object[0]);
                    strP = bjb0.P(rTicket.totalWinnings, Locale.US);
                } else {
                    z = z8;
                    strB2 = sn5.b(context2, z10 ? R.string.bet_history__paying : R.string.component_wap_share_bet__running, new Object[0]);
                    strP = "--";
                }
                i2 = i20;
                drawableA = null;
                TextView textView26 = this.d;
                textView26.setText(strB2);
                textView26.setTextColor(context2.getColor(i2));
                textView26.setCompoundDrawablesWithIntrinsicBounds(drawableA, (Drawable) null, (Drawable) null, (Drawable) null);
                String str8 = rTicket.totalStake;
                locale = Locale.US;
                strP2 = bjb0.P(str8, locale);
                textView = this.e;
                textView.setText(strP2);
                z2 = rTicket.isAutoBet;
                linearLayout = this.X;
                if (z2) {
                    linearLayout.setVisibility(0);
                    fMeasureText = textView.getPaint().measureText(strP2);
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    measuredWidth = linearLayout.getMeasuredWidth();
                    textView18.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    measuredWidth2 = textView18.getMeasuredWidth();
                    width = this.itemView.getWidth();
                    if (width == 0) {
                        width = context2.getResources().getDisplayMetrics().widthPixels;
                    }
                    if (r0b.a(context2, 4) + measuredWidth + fMeasureText > ((width - r0b.a(context2, 32)) - measuredWidth2) - r0b.a(context2, 8)) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    layoutParams = (ConstraintLayout.LayoutParams) linearLayout.getLayoutParams();
                    layoutParams2 = (ConstraintLayout.LayoutParams) textView.getLayoutParams();
                    if (z7) {
                        layoutParams.v = 0;
                        layoutParams.u = -1;
                        layoutParams.i = 0;
                        layoutParams.l = -1;
                        layoutParams.setMarginEnd(0);
                        layoutParams2.j = R.id.td_autobet_badge;
                        layoutParams2.i = -1;
                        layoutParams2.l = -1;
                        layoutParams2.v = 0;
                    } else {
                        layoutParams.u = R.id.td_ticket_stake_value;
                        layoutParams.v = -1;
                        layoutParams.i = 0;
                        layoutParams.l = 0;
                        layoutParams.setMarginEnd(r0b.a(context2, 4));
                        layoutParams2.i = 0;
                        layoutParams2.j = -1;
                        layoutParams2.l = 0;
                        layoutParams2.v = 0;
                    }
                    linearLayout.setLayoutParams(layoutParams);
                    textView.setLayoutParams(layoutParams2);
                } else {
                    linearLayout.setVisibility(8);
                    ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) textView.getLayoutParams();
                    layoutParams4.i = 0;
                    layoutParams4.j = -1;
                    layoutParams4.l = 0;
                    layoutParams4.v = 0;
                    textView.setLayoutParams(layoutParams4);
                }
                i3 = rTicket.paymentType;
                textView2 = this.f;
                if (i3 == 1) {
                    i13 = this.V;
                    textView2.setTextColor(i13);
                    drawableA3 = gr0.a(context2, R.drawable.ic_coins);
                    if (drawableA3 != null) {
                        drawableA3.setTint(i13);
                        textView2.setCompoundDrawablesWithIntrinsicBounds(drawableA3, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                } else if (i3 == 0) {
                    if (TextUtils.equals(strP, "--")) {
                        textView2.setTextColor(this.U);
                    } else {
                        textView2.setTextColor(this.U);
                    }
                }
                textView2.setText(strP);
                dD0 = bjb0.d0(rTicket.favorAmount);
                textView3 = this.v;
                textView4 = this.i;
                textView5 = this.D;
                if (dD0 > 0.0d) {
                    textView4.setVisibility(0);
                    textView3.setVisibility(0);
                    textView5.setVisibility(0);
                    textView4.setText(qz3.e(rTicket.favorType).e(context2));
                    textView3.setText(sn5.b(context2, R.string.app_common__minus_prefix, bjb0.P(rTicket.favorAmount, locale)));
                } else {
                    textView5.setVisibility(8);
                    textView4.setVisibility(8);
                    textView3.setVisibility(8);
                }
                if (rTicket.isOneCutBet()) {
                    i4 = 0;
                    textView5.setVisibility(0);
                } else {
                    i4 = 0;
                    textView5.setVisibility(0);
                }
                if (rTicket.oddsBoosted) {
                    if (!rTicket.isFlexBet()) {
                        if (!rTicket.isAnyWin()) {
                            if (rTicket.isOneCutBet()) {
                                strB4 = sn5.b(activity, R.string.bet_history__cashout_unavailable_for_one_cut, new Object[i4]);
                            } else {
                                strB4 = rTicket.favorType == 3 ? sn5.b(activity, R.string.bet_history__cashout_unavailable_as_gifts_used, new Object[0]) : sn5.b(activity, R.string.bet_history__cashout_unavailable_as_gifts_used, new Object[0]);
                            }
                        } else if (rTicket.isOneCutBet()) {
                            strB4 = sn5.b(activity, R.string.bet_history__cashout_unavailable_for_one_cut, new Object[i4]);
                        } else if (rTicket.favorType == 3) {
                        }
                    } else if (!rTicket.isAnyWin()) {
                        if (rTicket.isOneCutBet()) {
                            strB4 = sn5.b(activity, R.string.bet_history__cashout_unavailable_for_one_cut, new Object[i4]);
                        } else if (rTicket.favorType == 3) {
                        }
                    } else if (rTicket.isOneCutBet()) {
                        strB4 = sn5.b(activity, R.string.bet_history__cashout_unavailable_for_one_cut, new Object[i4]);
                    } else if (rTicket.favorType == 3) {
                    }
                    str = strB4;
                    textView5.setText(str);
                    if (TextUtils.isEmpty(str)) {
                        i5 = 8;
                    } else {
                        i5 = 0;
                    }
                    textView5.setVisibility(i5);
                } else {
                    if (!rTicket.isFlexBet()) {
                        if (!rTicket.isAnyWin()) {
                            if (rTicket.isOneCutBet()) {
                                strB4 = sn5.b(activity, R.string.bet_history__cashout_unavailable_for_one_cut, new Object[i4]);
                            } else if (rTicket.favorType == 3) {
                            }
                        } else if (rTicket.isOneCutBet()) {
                            strB4 = sn5.b(activity, R.string.bet_history__cashout_unavailable_for_one_cut, new Object[i4]);
                        } else if (rTicket.favorType == 3) {
                        }
                    } else if (!rTicket.isAnyWin()) {
                        if (rTicket.isOneCutBet()) {
                            strB4 = sn5.b(activity, R.string.bet_history__cashout_unavailable_for_one_cut, new Object[i4]);
                        } else if (rTicket.favorType == 3) {
                        }
                    } else if (rTicket.isOneCutBet()) {
                        strB4 = sn5.b(activity, R.string.bet_history__cashout_unavailable_for_one_cut, new Object[i4]);
                    } else if (rTicket.favorType == 3) {
                    }
                    str = strB4;
                    textView5.setText(str);
                    if (TextUtils.isEmpty(str)) {
                        i5 = 8;
                    } else {
                        i5 = 0;
                    }
                    textView5.setVisibility(i5);
                }
                z3 = rTicket.oddsBoosted;
                z4 = rTicket.lfbOddsBoosted;
                if (z3) {
                    i6 = 0;
                } else {
                    i6 = 0;
                }
                this.K.setVisibility(i6);
                if (z3) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                this.L.setVisibility(i7);
                if (z4) {
                    i8 = 0;
                } else {
                    i8 = 8;
                }
                this.M.setVisibility(i8);
                if (eu30Var.d) {
                    textView5.setVisibility(8);
                }
                if (eu30Var.c) {
                    i9 = R.string.bet_history__total_bonus;
                } else {
                    i9 = R.string.bet_history__max_bonus;
                }
                String strB10 = sn5.b(context2, i9, new Object[0]);
                TextView textView27 = this.w;
                textView27.setText(strB10);
                if (eu30Var.c) {
                    str2 = rTicket.bonusPrize;
                } else {
                    str2 = rTicket.totalBonus;
                }
                Double dValueOf2 = Double.valueOf(bjb0.d0(str2));
                TextView textView28 = this.y;
                b(textView27, textView28, dValueOf2);
                zHasTax = rTicket.hasTax();
                textView6 = this.A;
                textView7 = this.z;
                if (zHasTax) {
                    textView7.setVisibility(0);
                    textView6.setVisibility(0);
                    textView6.setText("-".concat(bjb0.P(rTicket.taxAmount, locale)));
                } else {
                    textView7.setVisibility(8);
                    textView6.setVisibility(8);
                }
                if (zHasTax) {
                    i10 = R.string.component_betslip__to_win;
                } else {
                    i10 = R.string.component_betslip__total_pot_win;
                }
                textView8 = this.B;
                textView8.setText(i10);
                zIsEmpty = TextUtils.isEmpty(rTicket.totalOdds);
                textView9 = this.G;
                textView10 = this.F;
                if (zIsEmpty) {
                    textView10.setVisibility(8);
                    textView9.setVisibility(8);
                } else {
                    textView10.setVisibility(8);
                    textView9.setVisibility(8);
                }
                zIsEmpty2 = TextUtils.isEmpty(rTicket.finalTotalOdds);
                appCompatImageView = this.J;
                textView11 = this.H;
                textView12 = this.I;
                if (!zIsEmpty2) {
                    z5 = true;
                    if (rTicket.orderType == 1) {
                    }
                    textView11.setVisibility(0);
                    appCompatImageView.setVisibility(0);
                    textView12.setVisibility(0);
                    textView12.setText(gky.a(rTicket.finalTotalOdds));
                    double dD3 = bjb0.d0(rTicket.potentialWinnings);
                    z6 = eu30Var.c;
                    textView13 = this.C;
                    if (z6) {
                        textView8.setVisibility(8);
                        textView13.setVisibility(8);
                    } else {
                        textView8.setVisibility(8);
                        textView13.setVisibility(8);
                    }
                    if (rTicket.isAnyWin()) {
                        iD = R.drawable.ic_any_win_label;
                    } else if (!rTicket.isOneCutBet()) {
                        iD = gug0.d(this.itemView.getContext());
                    } else {
                        if (rTicket.isFlexBet()) {
                        }
                        iD = -1;
                    }
                    strB3 = null;
                    if (iD != -1) {
                        drawableA2 = s0b.a(this.itemView.getContext(), iD, new a78.c(R.color.custom_brand_secondary_type3));
                    } else {
                        drawableA2 = null;
                    }
                    if (drawableA2 == null) {
                        z5 = false;
                    }
                    TextView textView29 = this.E;
                    g8i0.b(textView29, z5);
                    textView29.setCompoundDrawables(drawableA2, null, null, null);
                    textView29.setText(strB3);
                    View view4 = this.Q;
                    view4.setVisibility(8);
                    if (rTicket.isOneCutBet()) {
                        str3 = r13;
                        str4 = str5;
                    } else {
                        str3 = r13;
                        str4 = str5;
                    }
                    if (rTicket.isOneCutBet()) {
                    }
                }
                z5 = true;
                textView11.setVisibility(8);
                appCompatImageView.setVisibility(8);
                textView12.setVisibility(8);
                double dD4 = bjb0.d0(rTicket.potentialWinnings);
                z6 = eu30Var.c;
                textView13 = this.C;
                if (z6) {
                    textView8.setVisibility(8);
                    textView13.setVisibility(8);
                } else {
                    textView8.setVisibility(8);
                    textView13.setVisibility(8);
                }
                if (rTicket.isAnyWin()) {
                    iD = R.drawable.ic_any_win_label;
                } else if (!rTicket.isOneCutBet()) {
                    iD = gug0.d(this.itemView.getContext());
                } else {
                    if (rTicket.isFlexBet()) {
                    }
                    iD = -1;
                }
                strB3 = null;
                if (iD != -1) {
                    drawableA2 = s0b.a(this.itemView.getContext(), iD, new a78.c(R.color.custom_brand_secondary_type3));
                } else {
                    drawableA2 = null;
                }
                if (drawableA2 == null) {
                    z5 = false;
                }
                TextView textView210 = this.E;
                g8i0.b(textView210, z5);
                textView210.setCompoundDrawables(drawableA2, null, null, null);
                textView210.setText(strB3);
                View view5 = this.Q;
                view5.setVisibility(8);
                if (rTicket.isOneCutBet()) {
                    str3 = r13;
                    str4 = str5;
                } else {
                    str3 = r13;
                    str4 = str5;
                }
                if (rTicket.isOneCutBet()) {
                }
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view.getId() == R.id.coins_hint) {
                sh8.c().e(o7d.a(wae.SPORTY_COINS_DEFAULT));
            }
        }
    }

    public class i extends k {
        public final ComposeView a;

        public i(View view) {
            super(view);
            this.a = (ComposeView) view.findViewById(R.id.note_container);
        }

        @Override // eu30.k
        public final void a(final int i) {
            hl30 hl30Var = eu30.this.b.get(i);
            if (hl30Var instanceof su30) {
                su30 su30Var = (su30) hl30Var;
                final String str = su30Var.b;
                UserNote userNote = su30Var.a;
                szx.b(this.a, userNote != null ? userNote.getNoteText() : null, str, e0y.TicketDetails, new Function1() { // from class: nu30
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        String str2 = (String) obj;
                        eu30 eu30Var = eu30.this;
                        List<hl30> list = eu30Var.b;
                        UserNote userNote2 = new UserNote(str2);
                        String str3 = str;
                        list.set(i, new su30(userNote2, str3));
                        RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = (RSportsBetTicketDetailsActivity) eu30Var.a;
                        rSportsBetTicketDetailsActivity.getClass();
                        rSportsBetTicketDetailsActivity.h0 = new UserNote(str2);
                        for (int i2 = 0; i2 < rSportsBetTicketDetailsActivity.H.size(); i2++) {
                            if (rSportsBetTicketDetailsActivity.H.get(i2) instanceof su30) {
                                rSportsBetTicketDetailsActivity.H.set(i2, new su30(rSportsBetTicketDetailsActivity.h0, str3));
                                rSportsBetTicketDetailsActivity.E.notifyItemChanged(i2);
                                break;
                            }
                        }
                        im2 im2Var = rSportsBetTicketDetailsActivity.c0;
                        im2Var.getClass();
                        str2.getClass();
                        ej5.c(o8i0.d(im2Var), null, null, new hm2(im2Var, str3, str2, null), 3);
                        return Unit.a;
                    }
                });
            }
        }
    }

    public class j extends k {
        public final TextView a;

        public j(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.provider_verify_code);
        }

        @Override // eu30.k
        public final void a(int i) {
            String str;
            hl30 hl30Var = eu30.this.b.get(i);
            if (!(hl30Var instanceof tu30) || (str = ((tu30) hl30Var).a) == null) {
                return;
            }
            TextView textView = this.a;
            textView.setText(str);
            textView.setOnClickListener(new mvg(str, 1));
        }
    }

    public abstract class k extends RecyclerView.d0 {
        public abstract void a(int i);
    }

    static {
        bjb0.S("/m/my_accounts/open_bets/bet_history/match_tracker?event_id=");
        bjb0.S("/m/live_virtual_mt?matchId=");
    }

    public eu30(Activity activity, dz80 dz80Var, boolean z, boolean z2, List<hl30> list, uqm uqmVar, psm psmVar, s090 s090Var, nr7 nr7Var, boolean z3, boolean z4, BoreDrawConfig boreDrawConfig, boolean z5, y8j y8jVar) {
        this.a = activity;
        this.i = dz80Var;
        this.c = z;
        this.b = list;
        this.d = z2;
        this.w = s090Var;
        this.A = uqmVar;
        this.B = psmVar;
        this.C = nr7Var;
        this.D = z3;
        this.E = z4;
        this.F = boreDrawConfig;
        this.H = z5;
        this.I = y8jVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        List<hl30> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i2) {
        return this.b.get(i2).a();
    }

    public final void i(boolean z) {
        h550 h550Var;
        f fVar = this.z;
        if (fVar == null || (h550Var = fVar.b) == null) {
            return;
        }
        ((x5a0) h550Var.a).setValue(Boolean.valueOf(z));
    }

    public final void j(boolean z) {
        g gVar = this.y;
        if (gVar != null) {
            ProgressButton progressButton = gVar.c;
            if (z) {
                progressButton.setEnabled(false);
                this.y.c.setLoading(true);
            } else {
                progressButton.setEnabled(true);
                this.y.c.setLoading(false);
            }
        }
    }

    public final void k(boolean z) {
        this.v = z;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            if (this.b.get(i2).a() == 19) {
                notifyItemChanged(i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i2) {
        k kVar = (k) d0Var;
        kVar.a(i2);
        if (kVar instanceof g) {
            this.y = (g) kVar;
        } else if (kVar instanceof f) {
            this.z = (f) kVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i2) {
        if (i2 == 3) {
            return new h(dzc.a(viewGroup, R.layout.spr_ticket_detail_title, viewGroup, false));
        }
        if (i2 == 4) {
            return new b(dzc.a(viewGroup, R.layout.spr_ticket_detail_cashout, viewGroup, false));
        }
        if (i2 == 5) {
            return new d(dzc.a(viewGroup, R.layout.spr_ticket_detail_item, viewGroup, false));
        }
        if (i2 == 6) {
            return new a(dzc.a(viewGroup, R.layout.spr_ticket_detail_bottom, viewGroup, false));
        }
        switch (i2) {
            case 18:
                return new g(dzc.a(viewGroup, R.layout.spr_ticket_share_win, viewGroup, false));
            case 19:
                return new e(dzc.a(viewGroup, R.layout.spr_ticket_re_bet, viewGroup, false));
            case 20:
                return new c(dzc.a(viewGroup, R.layout.spr_ticket_detail_edit_history, viewGroup, false));
            case 21:
                return new i(dzc.a(viewGroup, R.layout.spr_ticket_user_note, viewGroup, false));
            case 22:
                return new f(dzc.a(viewGroup, R.layout.spr_ticket_remix_bet, viewGroup, false));
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return new j(dzc.a(viewGroup, R.layout.spr_ticket_verify_code, viewGroup, false));
            default:
                eub.a("RTicketDetailsAdapter viewHolder return null,type:" + i2);
                return null;
        }
    }
}
