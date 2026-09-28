package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.n;
import com.google.android.material.card.MaterialCardView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.pocketrocket.component.MultiplierContainer;
import com.sportygames.pocketrocket.model.response.BetDetails;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r920 extends RecyclerView.f<p820> {
    public final List<BetDetails> a;
    public final Context b;

    public r920(Context context, ArrayList arrayList) {
        arrayList.getClass();
        context.getClass();
        this.a = arrayList;
        this.b = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    public final void i() {
        for (BetDetails betDetails : this.a) {
            if (Intrinsics.g(betDetails.getRocketType(), "BLUE") && !Intrinsics.g(betDetails.getTicketStatus(), "WIN")) {
                betDetails.setTicketStatus("Lost");
            }
        }
        notifyDataSetChanged();
    }

    public final void j() {
        for (BetDetails betDetails : this.a) {
            if (Intrinsics.g(betDetails.getRocketType(), "PURPLE") && !Intrinsics.g(betDetails.getTicketStatus(), "WIN")) {
                betDetails.setTicketStatus("Lost");
            }
        }
        notifyDataSetChanged();
    }

    public final void k() {
        for (BetDetails betDetails : this.a) {
            if (Intrinsics.g(betDetails.getRocketType(), "RED") && !Intrinsics.g(betDetails.getTicketStatus(), "WIN")) {
                betDetails.setTicketStatus("Lost");
            }
        }
        notifyDataSetChanged();
    }

    public final void l(ArrayList arrayList, MultiplierContainer multiplierContainer) {
        arrayList.getClass();
        List<BetDetails> list = this.a;
        n.d dVarA = n.a(new n1g0(list, arrayList), true);
        list.clear();
        list.addAll(arrayList);
        dVarA.b(new b(this));
        if (multiplierContainer != null && multiplierContainer.isRedRocketFired) {
            k();
        }
        if (multiplierContainer != null && multiplierContainer.isPurpleRocketFired) {
            j();
        }
        if (multiplierContainer == null || !multiplierContainer.isBlueRocketFired) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        p820 p820Var = (p820) d0Var;
        p820Var.getClass();
        BetDetails betDetails = this.a.get(i);
        Context context = p820Var.a;
        betDetails.getClass();
        rt rtVar = p820Var.b;
        AppCompatTextView appCompatTextView = rtVar.d;
        AppCompatImageView appCompatImageView = rtVar.v;
        AppCompatTextView appCompatTextView2 = rtVar.c;
        AppCompatTextView appCompatTextView3 = rtVar.i;
        MaterialCardView materialCardView = rtVar.b;
        appCompatTextView.setText(betDetails.getNickName());
        AppCompatTextView appCompatTextView4 = rtVar.f;
        TreeMap treeMap = pw.a;
        appCompatTextView4.setText(pw.l(betDetails.getStakeAmount()));
        String ticketStatus = betDetails.getTicketStatus();
        if (Intrinsics.g(ticketStatus, "WIN")) {
            appCompatImageView.setVisibility(0);
            appCompatTextView3.setText(pw.l(betDetails.getPayoutAmount()));
            appCompatTextView2.setText(pw.m(betDetails.getCashoutCoefficient()).concat("x"));
            materialCardView.setStrokeColor(context.getColor(R.color.card_background_border_color));
            materialCardView.setCardBackgroundColor(context.getColor(R.color.card_background_color));
        } else if (Intrinsics.g(ticketStatus, "Lost")) {
            appCompatImageView.setVisibility(8);
            materialCardView.setStrokeColor(context.getColor(R.color.item_boundry_color));
            materialCardView.setCardBackgroundColor(context.getColor(R.color.sb_black));
            op5 op5Var = op5.a;
            String string = context.getString(R.string.lost_pr_cms);
            string.getClass();
            String string2 = context.getString(R.string.lost);
            string2.getClass();
            op5Var.getClass();
            appCompatTextView3.setText(op5.b(string, string2, null));
            appCompatTextView2.setText("- -");
        } else {
            appCompatImageView.setVisibility(8);
            materialCardView.setStrokeColor(context.getColor(R.color.item_boundry_color));
            materialCardView.setCardBackgroundColor(context.getColor(R.color.sb_black));
            appCompatTextView3.setText("- -");
            appCompatTextView2.setText("- -");
        }
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(gku.a), null, null, new o820(betDetails, p820Var, null), 3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        int i2 = p820.c;
        Context context = this.b;
        context.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.all_bet_list_item, viewGroup, false);
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
                                                        return new p820(context, new rt(materialCardView, materialCardView, appCompatTextView, appCompatTextView2, appCompatImageView, appCompatTextView3, appCompatTextView4, appCompatImageView2));
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
