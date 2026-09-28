package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ybq.android.spinkit.SpinKitView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class b920 implements g6i0 {
    public final ConstraintLayout a;
    public final ConstraintLayout b;
    public final AppCompatImageView c;
    public final TextView d;
    public final RecyclerView e;
    public final ConstraintLayout f;
    public final AppCompatImageView i;
    public final AppCompatImageView v;
    public final SpinKitView w;

    public b920(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, TextView textView, RecyclerView recyclerView, ConstraintLayout constraintLayout3, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, SpinKitView spinKitView) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = appCompatImageView;
        this.d = textView;
        this.e = recyclerView;
        this.f = constraintLayout3;
        this.i = appCompatImageView2;
        this.v = appCompatImageView3;
        this.w = spinKitView;
    }

    public static b920 a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.pr_round_history, (ViewGroup) null, false);
        int i = R.id.biggest_coeff;
        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.biggest_coeff, viewInflate);
        if (constraintLayout != null) {
            i = R.id.blue_rocket_image;
            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.blue_rocket_image, viewInflate);
            if (appCompatImageView != null) {
                i = R.id.container;
                if (((CardView) h5e.a(R.id.container, viewInflate)) != null) {
                    i = R.id.date;
                    TextView textView = (TextView) h5e.a(R.id.date, viewInflate);
                    if (textView != null) {
                        i = R.id.list;
                        RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.list, viewInflate);
                        if (recyclerView != null) {
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                            i = R.id.purple_rocket_image;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.purple_rocket_image, viewInflate);
                            if (appCompatImageView2 != null) {
                                i = R.id.red_rocket_image;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.red_rocket_image, viewInflate);
                                if (appCompatImageView3 != null) {
                                    i = R.id.spin_kit;
                                    SpinKitView spinKitView = (SpinKitView) h5e.a(R.id.spin_kit, viewInflate);
                                    if (spinKitView != null) {
                                        return new b920(constraintLayout2, constraintLayout, appCompatImageView, textView, recyclerView, constraintLayout2, appCompatImageView2, appCompatImageView3, spinKitView);
                                    }
                                }
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
