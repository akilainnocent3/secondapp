package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.piggybash.data.model.http.PBBetHistoryItemDTO;
import com.sportygames.pocketrocket.model.response.BetDetails;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o920 extends RecyclerView.f<q920> {
    public List<BetDetails> a;
    public final Context b;
    public List<BetDetails> c;

    public o920(Context context, List list) {
        list.getClass();
        context.getClass();
        this.a = list;
        this.b = context;
        this.c = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        q920 q920Var = (q920) d0Var;
        q920Var.getClass();
        BetDetails betDetails = this.a.get(i);
        Context context = q920Var.a;
        betDetails.getClass();
        ew2 ew2Var = q920Var.b;
        AppCompatTextView appCompatTextView = ew2Var.d;
        AppCompatImageView appCompatImageView = ew2Var.v;
        AppCompatTextView appCompatTextView2 = ew2Var.c;
        AppCompatTextView appCompatTextView3 = ew2Var.i;
        appCompatTextView.setText(k94.h(betDetails.getCreatedAt()) + " " + k94.d(betDetails.getCreatedAt()));
        AppCompatTextView appCompatTextView4 = ew2Var.f;
        TreeMap treeMap = pw.a;
        appCompatTextView4.setText(pw.l(betDetails.getStakeAmount()));
        if (Intrinsics.g(betDetails.getTicketStatus(), "WIN")) {
            appCompatImageView.setVisibility(0);
            appCompatTextView3.setText(pw.l(betDetails.getPayoutAmount()));
            appCompatTextView2.setText(pw.m(betDetails.getCashoutCoefficient()).concat("x"));
            appCompatTextView2.setTextColor(context.getColor(R.color.pr_win_text_color));
            appCompatTextView3.setTextColor(context.getColor(R.color.pr_win_text_color));
            if (betDetails.isBackground()) {
                q920Var.a(R.color.card_background_border_color, R.color.card_background_color);
            } else {
                q920Var.a(R.color.item_boundry_color, R.color.sb_black);
            }
        } else if (Intrinsics.g(betDetails.getTicketStatus(), "ONGOING")) {
            appCompatImageView.setVisibility(8);
            op5 op5Var = op5.a;
            String string = context.getString(R.string.ongoing_pr_cms);
            string.getClass();
            String string2 = context.getString(R.string.ongoing_text);
            string2.getClass();
            op5Var.getClass();
            appCompatTextView3.setText(op5.b(string, string2, null));
            appCompatTextView3.setTextColor(context.getColor(R.color.ongoing_text_color));
            appCompatTextView2.setText("--");
            appCompatTextView2.setTextColor(context.getColor(R.color.pr_win_text_color));
            q920Var.a(R.color.item_boundry_color, R.color.sb_black);
        } else if (Intrinsics.g(betDetails.getTicketStatus(), PBBetHistoryItemDTO.STATUS_PENDING)) {
            appCompatImageView.setVisibility(8);
            op5 op5Var2 = op5.a;
            String string3 = context.getString(R.string.pending_pr_cms);
            string3.getClass();
            String string4 = context.getString(R.string.pending_text);
            string4.getClass();
            op5Var2.getClass();
            appCompatTextView3.setText(op5.b(string3, string4, null));
            appCompatTextView3.setTextColor(context.getColor(R.color.pending_text_color));
            String string5 = context.getString(R.string.pending_pr_cms);
            string5.getClass();
            String string6 = context.getString(R.string.pending_text);
            string6.getClass();
            appCompatTextView2.setText(op5.b(string5, string6, null));
            appCompatTextView2.setTextColor(context.getColor(R.color.pending_text_color));
            q920Var.a(R.color.item_boundry_color, R.color.sb_black);
        } else {
            appCompatImageView.setVisibility(8);
            op5 op5Var3 = op5.a;
            String string7 = context.getString(R.string.lost_pr_cms);
            string7.getClass();
            String string8 = context.getString(R.string.lost);
            string8.getClass();
            op5Var3.getClass();
            appCompatTextView3.setText(op5.b(string7, string8, null));
            appCompatTextView3.setTextColor(context.getColor(R.color.lost_text_color));
            appCompatTextView2.setText("--");
            appCompatTextView2.setTextColor(context.getColor(R.color.pr_win_text_color));
            q920Var.a(R.color.item_boundry_color, R.color.sb_black);
        }
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(gku.a), null, null, new p920(betDetails, q920Var, null), 3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        int i2 = q920.c;
        Context context = this.b;
        context.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bet_list_item, viewGroup, false);
        MaterialCardView materialCardView = (MaterialCardView) viewInflate;
        int i3 = R.id.coeff_layout;
        if (((ConstraintLayout) h5e.a(R.id.coeff_layout, viewInflate)) != null) {
            i3 = R.id.coeff_value;
            AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.coeff_value, viewInflate);
            if (appCompatTextView != null) {
                i3 = R.id.date;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.date, viewInflate);
                if (appCompatTextView2 != null) {
                    i3 = R.id.date_layout;
                    if (((ConstraintLayout) h5e.a(R.id.date_layout, viewInflate)) != null) {
                        i3 = R.id.parent_layout;
                        if (((ConstraintLayout) h5e.a(R.id.parent_layout, viewInflate)) != null) {
                            i3 = R.id.rocket_image;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.rocket_image, viewInflate);
                            if (appCompatImageView != null) {
                                i3 = R.id.rocket_layout;
                                if (((ConstraintLayout) h5e.a(R.id.rocket_layout, viewInflate)) != null) {
                                    i3 = R.id.status_layout;
                                    if (((ConstraintLayout) h5e.a(R.id.status_layout, viewInflate)) != null) {
                                        i3 = R.id.status_rocket;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) h5e.a(R.id.status_rocket, viewInflate);
                                        if (appCompatTextView3 != null) {
                                            i3 = R.id.wil_layout;
                                            if (((ConstraintLayout) h5e.a(R.id.wil_layout, viewInflate)) != null) {
                                                i3 = R.id.wil_value;
                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) h5e.a(R.id.wil_value, viewInflate);
                                                if (appCompatTextView4 != null) {
                                                    i3 = R.id.win_image;
                                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.win_image, viewInflate);
                                                    if (appCompatImageView2 != null) {
                                                        return new q920(context, new ew2(materialCardView, materialCardView, appCompatTextView, appCompatTextView2, appCompatImageView, appCompatTextView3, appCompatTextView4, appCompatImageView2));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
        return null;
    }
}
