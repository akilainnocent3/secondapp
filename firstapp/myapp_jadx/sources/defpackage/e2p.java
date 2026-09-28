package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class e2p implements g6i0 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView i;
    public final TextView v;
    public final TextView w;

    public e2p(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
        this.i = textView4;
        this.v = textView5;
        this.w = textView6;
    }

    public static e2p a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.item_booking_code_info_outcome, viewGroup, false);
        int i = R.id.ivIcon;
        ImageView imageView = (ImageView) h5e.a(R.id.ivIcon, viewInflate);
        if (imageView != null) {
            i = R.id.ivStats;
            ImageView imageView2 = (ImageView) h5e.a(R.id.ivStats, viewInflate);
            if (imageView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i = R.id.tvAwayTeam;
                TextView textView = (TextView) h5e.a(R.id.tvAwayTeam, viewInflate);
                if (textView != null) {
                    i = R.id.tvHomeTeam;
                    TextView textView2 = (TextView) h5e.a(R.id.tvHomeTeam, viewInflate);
                    if (textView2 != null) {
                        i = R.id.tvMarket;
                        TextView textView3 = (TextView) h5e.a(R.id.tvMarket, viewInflate);
                        if (textView3 != null) {
                            i = R.id.tvOdds;
                            TextView textView4 = (TextView) h5e.a(R.id.tvOdds, viewInflate);
                            if (textView4 != null) {
                                i = R.id.tvOutcome;
                                TextView textView5 = (TextView) h5e.a(R.id.tvOutcome, viewInflate);
                                if (textView5 != null) {
                                    i = R.id.tvSeparator;
                                    if (((TextView) h5e.a(R.id.tvSeparator, viewInflate)) != null) {
                                        i = R.id.tvTime;
                                        TextView textView6 = (TextView) h5e.a(R.id.tvTime, viewInflate);
                                        if (textView6 != null) {
                                            i = R.id.tvVs;
                                            if (((TextView) h5e.a(R.id.tvVs, viewInflate)) != null) {
                                                return new e2p(constraintLayout, imageView, imageView2, textView, textView2, textView3, textView4, textView5, textView6);
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
