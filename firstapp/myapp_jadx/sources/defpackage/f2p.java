package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes5.dex */
public final class f2p implements g6i0 {
    public final TextView A;
    public final TextView B;
    public final View C;
    public final View D;
    public final View E;
    public final View F;
    public final CardView a;
    public final ImageView b;
    public final ImageView c;
    public final ProgressBar d;
    public final RecyclerView e;
    public final ProgressBar f;
    public final ProgressButton i;
    public final TextView v;
    public final TextView w;
    public final TextView y;
    public final TextView z;

    public f2p(CardView cardView, ImageView imageView, ImageView imageView2, ProgressBar progressBar, RecyclerView recyclerView, ProgressBar progressBar2, ProgressButton progressButton, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, View view, View view2, View view3, View view4) {
        this.a = cardView;
        this.b = imageView;
        this.c = imageView2;
        this.d = progressBar;
        this.e = recyclerView;
        this.f = progressBar2;
        this.i = progressButton;
        this.v = textView;
        this.w = textView2;
        this.y = textView3;
        this.z = textView4;
        this.A = textView5;
        this.B = textView6;
        this.C = view;
        this.D = view2;
        this.E = view3;
        this.F = view4;
    }

    public static f2p a(View view) {
        int i = R.id.ivPencil;
        ImageView imageView = (ImageView) h5e.a(R.id.ivPencil, view);
        if (imageView != null) {
            i = R.id.ivShare;
            ImageView imageView2 = (ImageView) h5e.a(R.id.ivShare, view);
            if (imageView2 != null) {
                i = R.id.layout_container;
                if (((ConstraintLayout) h5e.a(R.id.layout_container, view)) != null) {
                    i = R.id.llFolds;
                    if (((LinearLayout) h5e.a(R.id.llFolds, view)) != null) {
                        i = R.id.llOdds;
                        if (((LinearLayout) h5e.a(R.id.llOdds, view)) != null) {
                            i = R.id.pencil_progress;
                            ProgressBar progressBar = (ProgressBar) h5e.a(R.id.pencil_progress, view);
                            if (progressBar != null) {
                                i = R.id.rvSubCards;
                                RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.rvSubCards, view);
                                if (recyclerView != null) {
                                    i = R.id.share_progress;
                                    ProgressBar progressBar2 = (ProgressBar) h5e.a(R.id.share_progress, view);
                                    if (progressBar2 != null) {
                                        i = R.id.tvAddToBetslip;
                                        ProgressButton progressButton = (ProgressButton) h5e.a(R.id.tvAddToBetslip, view);
                                        if (progressButton != null) {
                                            i = R.id.tvCode;
                                            TextView textView = (TextView) h5e.a(R.id.tvCode, view);
                                            if (textView != null) {
                                                i = R.id.tvFoldsLabel;
                                                TextView textView2 = (TextView) h5e.a(R.id.tvFoldsLabel, view);
                                                if (textView2 != null) {
                                                    i = R.id.tvFoldsValue;
                                                    TextView textView3 = (TextView) h5e.a(R.id.tvFoldsValue, view);
                                                    if (textView3 != null) {
                                                        i = R.id.tvOddsLabel;
                                                        TextView textView4 = (TextView) h5e.a(R.id.tvOddsLabel, view);
                                                        if (textView4 != null) {
                                                            i = R.id.tvOddsValue;
                                                            TextView textView5 = (TextView) h5e.a(R.id.tvOddsValue, view);
                                                            if (textView5 != null) {
                                                                i = R.id.tvShare;
                                                                TextView textView6 = (TextView) h5e.a(R.id.tvShare, view);
                                                                if (textView6 != null) {
                                                                    i = R.id.vRvMarginProvider;
                                                                    View viewA = h5e.a(R.id.vRvMarginProvider, view);
                                                                    if (viewA != null) {
                                                                        i = R.id.vShare;
                                                                        View viewA2 = h5e.a(R.id.vShare, view);
                                                                        if (viewA2 != null) {
                                                                            i = R.id.vTopBanner;
                                                                            View viewA3 = h5e.a(R.id.vTopBanner, view);
                                                                            if (viewA3 != null) {
                                                                                i = R.id.view_fade_edge;
                                                                                View viewA4 = h5e.a(R.id.view_fade_edge, view);
                                                                                if (viewA4 != null) {
                                                                                    return new f2p((CardView) view, imageView, imageView2, progressBar, recyclerView, progressBar2, progressButton, textView, textView2, textView3, textView4, textView5, textView6, viewA, viewA2, viewA3, viewA4);
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
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
