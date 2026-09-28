package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes8.dex */
public final class ax80 implements g6i0 {
    public final CardView a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final AppCompatTextView d;

    public ax80(CardView cardView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.a = cardView;
        this.b = appCompatTextView;
        this.c = appCompatTextView2;
        this.d = appCompatTextView3;
    }

    public static ax80 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sh_top_wins_coefficient_item_v2, viewGroup, false);
        int i = R.id.cashout_layout;
        if (((ConstraintLayout) h5e.a(R.id.cashout_layout, viewInflate)) != null) {
            i = R.id.coeff;
            AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.coeff, viewInflate);
            if (appCompatTextView != null) {
                i = R.id.date;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.date, viewInflate);
                if (appCompatTextView2 != null) {
                    i = R.id.fairness_layout;
                    if (((ConstraintLayout) h5e.a(R.id.fairness_layout, viewInflate)) != null) {
                        i = R.id.user_image_layout;
                        if (((ConstraintLayout) h5e.a(R.id.user_image_layout, viewInflate)) != null) {
                            i = R.id.user_name;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) h5e.a(R.id.user_name, viewInflate);
                            if (appCompatTextView3 != null) {
                                return new ax80((CardView) viewInflate, appCompatTextView, appCompatTextView2, appCompatTextView3);
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
