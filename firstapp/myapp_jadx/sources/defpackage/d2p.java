package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public final class d2p implements g6i0 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final View E;
    public final View F;
    public final View G;
    public final View H;
    public final CardView a;
    public final ImageView b;
    public final ImageView c;
    public final LinearLayout d;
    public final ProgressBar e;
    public final RecyclerView f;
    public final ProgressBar i;
    public final ProgressButton v;
    public final TextView w;
    public final TextView y;
    public final TextView z;

    public d2p(CardView cardView, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, ProgressBar progressBar, RecyclerView recyclerView, ProgressBar progressBar2, ProgressButton progressButton, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, View view, View view2, View view3, View view4) {
        this.a = cardView;
        this.b = imageView;
        this.c = imageView2;
        this.d = linearLayout;
        this.e = progressBar;
        this.f = recyclerView;
        this.i = progressBar2;
        this.v = progressButton;
        this.w = textView;
        this.y = textView2;
        this.z = textView3;
        this.A = textView4;
        this.B = textView5;
        this.C = textView6;
        this.D = textView7;
        this.E = view;
        this.F = view2;
        this.G = view3;
        this.H = view4;
    }

    public static d2p a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.item_booking_code_info_list, viewGroup, false);
        int i = R.id.ivCodeChat;
        if (((ImageView) h5e.a(R.id.ivCodeChat, viewInflate)) != null) {
            i = R.id.ivPencil;
            ImageView imageView = (ImageView) h5e.a(R.id.ivPencil, viewInflate);
            if (imageView != null) {
                i = R.id.ivShare;
                ImageView imageView2 = (ImageView) h5e.a(R.id.ivShare, viewInflate);
                if (imageView2 != null) {
                    i = R.id.layout_container;
                    if (((ConstraintLayout) h5e.a(R.id.layout_container, viewInflate)) != null) {
                        i = R.id.llCodeChatPopularity;
                        LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.llCodeChatPopularity, viewInflate);
                        if (linearLayout != null) {
                            i = R.id.llFolds;
                            if (((LinearLayout) h5e.a(R.id.llFolds, viewInflate)) != null) {
                                i = R.id.llOdds;
                                if (((LinearLayout) h5e.a(R.id.llOdds, viewInflate)) != null) {
                                    i = R.id.pencil_progress;
                                    ProgressBar progressBar = (ProgressBar) h5e.a(R.id.pencil_progress, viewInflate);
                                    if (progressBar != null) {
                                        i = R.id.rvSubCards;
                                        RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.rvSubCards, viewInflate);
                                        if (recyclerView != null) {
                                            i = R.id.share_progress;
                                            ProgressBar progressBar2 = (ProgressBar) h5e.a(R.id.share_progress, viewInflate);
                                            if (progressBar2 != null) {
                                                i = R.id.tvAddToBetslip;
                                                ProgressButton progressButton = (ProgressButton) h5e.a(R.id.tvAddToBetslip, viewInflate);
                                                if (progressButton != null) {
                                                    i = R.id.tvCode;
                                                    TextView textView = (TextView) h5e.a(R.id.tvCode, viewInflate);
                                                    if (textView != null) {
                                                        i = R.id.tvFoldsLabel;
                                                        TextView textView2 = (TextView) h5e.a(R.id.tvFoldsLabel, viewInflate);
                                                        if (textView2 != null) {
                                                            i = R.id.tvFoldsValue;
                                                            TextView textView3 = (TextView) h5e.a(R.id.tvFoldsValue, viewInflate);
                                                            if (textView3 != null) {
                                                                i = R.id.tvOddsLabel;
                                                                TextView textView4 = (TextView) h5e.a(R.id.tvOddsLabel, viewInflate);
                                                                if (textView4 != null) {
                                                                    i = R.id.tvOddsValue;
                                                                    TextView textView5 = (TextView) h5e.a(R.id.tvOddsValue, viewInflate);
                                                                    if (textView5 != null) {
                                                                        i = R.id.tvPopularity;
                                                                        TextView textView6 = (TextView) h5e.a(R.id.tvPopularity, viewInflate);
                                                                        if (textView6 != null) {
                                                                            i = R.id.tvShare;
                                                                            TextView textView7 = (TextView) h5e.a(R.id.tvShare, viewInflate);
                                                                            if (textView7 != null) {
                                                                                i = R.id.vRvMarginProvider;
                                                                                View viewA = h5e.a(R.id.vRvMarginProvider, viewInflate);
                                                                                if (viewA != null) {
                                                                                    i = R.id.vShare;
                                                                                    View viewA2 = h5e.a(R.id.vShare, viewInflate);
                                                                                    if (viewA2 != null) {
                                                                                        i = R.id.vTopBanner;
                                                                                        View viewA3 = h5e.a(R.id.vTopBanner, viewInflate);
                                                                                        if (viewA3 != null) {
                                                                                            i = R.id.view_fade_edge;
                                                                                            View viewA4 = h5e.a(R.id.view_fade_edge, viewInflate);
                                                                                            if (viewA4 != null) {
                                                                                                return new d2p((CardView) viewInflate, imageView, imageView2, linearLayout, progressBar, recyclerView, progressBar2, progressButton, textView, textView2, textView3, textView4, textView5, textView6, textView7, viewA, viewA2, viewA3, viewA4);
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
