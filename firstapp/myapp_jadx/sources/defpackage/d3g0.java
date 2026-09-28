package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.pingpong.remote.models.TopWinResponse;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class d3g0 extends RecyclerView.f<g3g0> {
    public final List<TopWinResponse> a;
    public final Context b;

    public d3g0(e eVar, List list) {
        eVar.getClass();
        this.a = list;
        this.b = eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        String str;
        g3g0 g3g0Var = (g3g0) d0Var;
        g3g0Var.getClass();
        TopWinResponse topWinResponse = this.a.get(i);
        topWinResponse.getClass();
        k820 k820Var = g3g0Var.b;
        k820Var.d.setText(topWinResponse.getNickName());
        DecimalFormat decimalFormat = new DecimalFormat("#######.##", SportyGamesManager.decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        AppCompatTextView appCompatTextView = k820Var.b;
        Context context = g3g0Var.a;
        String cashoutCoefficient = topWinResponse.getCashoutCoefficient();
        appCompatTextView.setText(context.getString(R.string.coeff, decimalFormat.format(cashoutCoefficient != null ? Double.valueOf(Double.parseDouble(cashoutCoefficient)) : null)));
        String updateTime = topWinResponse.getUpdateTime();
        if (updateTime != null) {
            AppCompatTextView appCompatTextView2 = k820Var.c;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date date = simpleDateFormat.parse(updateTime);
                date.getClass();
                str = simpleDateFormat2.format(date);
                str.getClass();
            } catch (Exception e) {
                e.printStackTrace();
                str = "";
            }
            appCompatTextView2.setText(str);
        }
        String cashoutCoefficient2 = topWinResponse.getCashoutCoefficient();
        if (cashoutCoefficient2 != null) {
            Map<Double, Integer> map = k18.a;
            appCompatTextView.setBackgroundTintList(th50.a(k18.a(Double.parseDouble(cashoutCoefficient2)), context.getTheme(), context.getResources()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        int i2 = g3g0.c;
        Context context = this.b;
        context.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pp_top_wins_coefficient_item, viewGroup, false);
        int i3 = R.id.cashout_layout;
        if (((ConstraintLayout) h5e.a(R.id.cashout_layout, viewInflate)) != null) {
            i3 = R.id.coeff;
            AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.coeff, viewInflate);
            if (appCompatTextView != null) {
                i3 = R.id.date;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.date, viewInflate);
                if (appCompatTextView2 != null) {
                    i3 = R.id.fairness_layout;
                    if (((ConstraintLayout) h5e.a(R.id.fairness_layout, viewInflate)) != null) {
                        i3 = R.id.user_image_layout;
                        if (((ConstraintLayout) h5e.a(R.id.user_image_layout, viewInflate)) != null) {
                            i3 = R.id.user_name;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) h5e.a(R.id.user_name, viewInflate);
                            if (appCompatTextView3 != null) {
                                return new g3g0(context, new k820((CardView) viewInflate, appCompatTextView, appCompatTextView2, appCompatTextView3));
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
