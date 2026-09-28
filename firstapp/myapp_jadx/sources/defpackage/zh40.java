package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.pocketrocket.model.response.RecentRoundMultiplier;
import java.text.DecimalFormat;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class zh40 extends RecyclerView.f<bi40> {
    public final List<RecentRoundMultiplier.Coefficients> a;
    public final Context b;
    public final a c;

    public interface a {
        void U(long j);
    }

    public zh40(List<RecentRoundMultiplier.Coefficients> list, Context context, a aVar) {
        list.getClass();
        context.getClass();
        aVar.getClass();
        this.a = list;
        this.b = context;
        this.c = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        bi40 bi40Var = (bi40) d0Var;
        bi40Var.getClass();
        final RecentRoundMultiplier.Coefficients coefficients = this.a.get(i);
        coefficients.getClass();
        final a aVar = this.c;
        aVar.getClass();
        DecimalFormat decimalFormat = new DecimalFormat("#,###,###.##", SportyGamesManager.decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        v820 v820Var = bi40Var.b;
        v820Var.c.setText(k94.h(coefficients.getEndTime()) + " " + k94.d(coefficients.getEndTime()));
        AppCompatTextView appCompatTextView = v820Var.f;
        Context context = bi40Var.a;
        RecentRoundMultiplier.Coefficients.HouseCoefficients houseCoefficients = coefficients.getHouseCoefficients();
        appCompatTextView.setText(context.getString(R.string.coeff, decimalFormat.format(houseCoefficients != null ? Double.valueOf(houseCoefficients.getRED()) : null)));
        AppCompatTextView appCompatTextView2 = v820Var.e;
        RecentRoundMultiplier.Coefficients.HouseCoefficients houseCoefficients2 = coefficients.getHouseCoefficients();
        appCompatTextView2.setText(context.getString(R.string.coeff, decimalFormat.format(houseCoefficients2 != null ? Double.valueOf(houseCoefficients2.getPURPLE()) : null)));
        AppCompatTextView appCompatTextView3 = v820Var.b;
        RecentRoundMultiplier.Coefficients.HouseCoefficients houseCoefficients3 = coefficients.getHouseCoefficients();
        appCompatTextView3.setText(context.getString(R.string.coeff, decimalFormat.format(houseCoefficients3 != null ? Double.valueOf(houseCoefficients3.getBLUE()) : null)));
        v820Var.d.setOnClickListener(new View.OnClickListener() { // from class: ai40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aVar.U(coefficients.getId());
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        int i2 = bi40.c;
        Context context = this.b;
        context.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pr_recent_round_item, viewGroup, false);
        int i3 = R.id.blue_layout;
        if (((ConstraintLayout) h5e.a(R.id.blue_layout, viewInflate)) != null) {
            i3 = R.id.blue_value;
            AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.blue_value, viewInflate);
            if (appCompatTextView != null) {
                i3 = R.id.coeff_layout;
                if (((ConstraintLayout) h5e.a(R.id.coeff_layout, viewInflate)) != null) {
                    i3 = R.id.date;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.date, viewInflate);
                    if (appCompatTextView2 != null) {
                        i3 = R.id.date_layout;
                        if (((ConstraintLayout) h5e.a(R.id.date_layout, viewInflate)) != null) {
                            i3 = R.id.fairness_layout;
                            if (((ConstraintLayout) h5e.a(R.id.fairness_layout, viewInflate)) != null) {
                                i3 = R.id.parent_layout;
                                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.parent_layout, viewInflate);
                                if (constraintLayout != null) {
                                    i3 = R.id.purple_value;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) h5e.a(R.id.purple_value, viewInflate);
                                    if (appCompatTextView3 != null) {
                                        i3 = R.id.red_rocket;
                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) h5e.a(R.id.red_rocket, viewInflate);
                                        if (appCompatTextView4 != null) {
                                            return new bi40(context, new v820((MaterialCardView) viewInflate, appCompatTextView, appCompatTextView2, constraintLayout, appCompatTextView3, appCompatTextView4));
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
