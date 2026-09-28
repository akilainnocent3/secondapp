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
import com.sportygames.pocketrocket.model.response.TopWinResponse;
import java.text.DecimalFormat;
import java.util.List;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g920 extends RecyclerView.f<i920> {
    public final List<TopWinResponse> a;
    public final Context b;

    public g920(Context context, List list) {
        context.getClass();
        this.a = list;
        this.b = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        i920 i920Var = (i920) d0Var;
        i920Var.getClass();
        TopWinResponse topWinResponse = this.a.get(i);
        topWinResponse.getClass();
        boolean zG = Intrinsics.g(String.valueOf(topWinResponse.getUserId()), SportyGamesManager.getInstance().getUserId());
        b2g0 b2g0Var = i920Var.b;
        if (zG) {
            b2g0Var.d.setText("You");
        } else {
            b2g0Var.d.setText(topWinResponse.getNickName());
        }
        DecimalFormat decimalFormat = new DecimalFormat("#,###,###.##", SportyGamesManager.decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        b2g0Var.c.setText(k94.h(String.valueOf(topWinResponse.getCreateTime())) + " " + k94.d(String.valueOf(topWinResponse.getCreateTime())));
        AppCompatTextView appCompatTextView = b2g0Var.f;
        TreeMap treeMap = pw.a;
        appCompatTextView.setText(pw.l(Double.parseDouble(String.valueOf(topWinResponse.getStakeAmount()))));
        b2g0Var.i.setText(pw.l(Double.parseDouble(String.valueOf(topWinResponse.getPayoutAmount()))));
        b2g0Var.b.setText(decimalFormat.format(topWinResponse.getCashoutCoefficient()) + "x");
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(gku.a), null, null, new h920(topWinResponse, i920Var, null), 3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        int i2 = i920.c;
        Context context = this.b;
        context.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.top_win_list_item, viewGroup, false);
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
                        i3 = R.id.name;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) h5e.a(R.id.name, viewInflate);
                        if (appCompatTextView3 != null) {
                            i3 = R.id.name_layout;
                            if (((ConstraintLayout) h5e.a(R.id.name_layout, viewInflate)) != null) {
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
                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) h5e.a(R.id.status_rocket, viewInflate);
                                                if (appCompatTextView4 != null) {
                                                    i3 = R.id.wil_layout;
                                                    if (((ConstraintLayout) h5e.a(R.id.wil_layout, viewInflate)) != null) {
                                                        i3 = R.id.wil_value;
                                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) h5e.a(R.id.wil_value, viewInflate);
                                                        if (appCompatTextView5 != null) {
                                                            return new i920(context, new b2g0((MaterialCardView) viewInflate, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatImageView, appCompatTextView4, appCompatTextView5));
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
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
        return null;
    }
}
