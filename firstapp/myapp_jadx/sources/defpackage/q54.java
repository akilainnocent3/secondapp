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
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.pingpong.remote.models.BiggestResponse;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class q54 extends RecyclerView.f<v54> {
    public final List<BiggestResponse> a;
    public final Context b;
    public final ibs c;
    public final a d;

    public interface a {
        void a(String str);
    }

    public q54(List<BiggestResponse> list, Context context, y720 y720Var, ibs ibsVar, a aVar) {
        context.getClass();
        y720Var.getClass();
        ibsVar.getClass();
        this.a = list;
        this.b = context;
        this.c = ibsVar;
        this.d = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        String str;
        v54 v54Var = (v54) d0Var;
        v54Var.getClass();
        final BiggestResponse biggestResponse = this.a.get(i);
        Context context = v54Var.a;
        biggestResponse.getClass();
        final a aVar = this.d;
        aVar.getClass();
        ps80 ps80Var = v54Var.b;
        AppCompatTextView appCompatTextView = ps80Var.d;
        AppCompatTextView appCompatTextView2 = ps80Var.c;
        String updateTime = biggestResponse.getUpdateTime();
        updateTime.getClass();
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
        appCompatTextView.setText(str);
        ps80Var.b.setBackgroundColor(context.getColor(R.color.pp_ham_menu_header_color));
        try {
            double d = Double.parseDouble(biggestResponse.getHouseCoefficient());
            String strValueOf = String.valueOf(d);
            if (StringsKt.M(strValueOf, "E", false) || StringsKt.M(strValueOf, "e", false)) {
                appCompatTextView2.setText(context.getString(R.string.coeff, String.format(SportyGamesManager.locale, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1)).toString()));
            } else {
                appCompatTextView2.setText(context.getString(R.string.coeff, String.valueOf(d)));
            }
        } catch (Exception unused) {
            appCompatTextView2.setText(context.getString(R.string.coeff, biggestResponse.getHouseCoefficient()));
        }
        Map<Double, Integer> map = k18.a;
        appCompatTextView2.setBackgroundTintList(th50.a(k18.a(Double.parseDouble(biggestResponse.getHouseCoefficient())), context.getTheme(), context.getResources()));
        ps80Var.e.setOnClickListener(new View.OnClickListener() { // from class: t54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aVar.a(biggestResponse.getRoundId());
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        int i2 = v54.c;
        Context context = this.b;
        context.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sh_biggest_coefficient_item, viewGroup, false);
        int i3 = R.id.biggest_parent_layout;
        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.biggest_parent_layout, viewInflate);
        if (constraintLayout != null) {
            i3 = R.id.coeff;
            AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.coeff, viewInflate);
            if (appCompatTextView != null) {
                i3 = R.id.coeff_layout;
                if (((ConstraintLayout) h5e.a(R.id.coeff_layout, viewInflate)) != null) {
                    i3 = R.id.date;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.date, viewInflate);
                    if (appCompatTextView2 != null) {
                        i3 = R.id.date_layout;
                        if (((ConstraintLayout) h5e.a(R.id.date_layout, viewInflate)) != null) {
                            i3 = R.id.fairness;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.fairness, viewInflate);
                            if (appCompatImageView != null) {
                                i3 = R.id.fairness_layout;
                                if (((ConstraintLayout) h5e.a(R.id.fairness_layout, viewInflate)) != null) {
                                    return new v54(context, new ps80((MaterialCardView) viewInflate, constraintLayout, appCompatTextView, appCompatTextView2, appCompatImageView));
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
