package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class igd0 implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;
    public final ConstraintLayout c;
    public final ConstraintLayout d;
    public final TextView e;
    public final TextView f;
    public final FlexboxLayout i;
    public final TextView v;
    public final ImageView w;
    public final FrameLayout y;
    public final TextView z;

    public igd0(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, TextView textView2, TextView textView3, FlexboxLayout flexboxLayout, TextView textView4, ImageView imageView, FrameLayout frameLayout, TextView textView5) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = constraintLayout2;
        this.d = constraintLayout3;
        this.e = textView2;
        this.f = textView3;
        this.i = flexboxLayout;
        this.v = textView4;
        this.w = imageView;
        this.y = frameLayout;
        this.z = textView5;
    }

    public static igd0 a(View view) {
        int i = R.id.bonus;
        TextView textView = (TextView) h5e.a(R.id.bonus, view);
        if (textView != null) {
            i = R.id.booking_code_bonus_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.booking_code_bonus_container, view);
            if (constraintLayout != null) {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                i = R.id.market_match;
                TextView textView2 = (TextView) h5e.a(R.id.market_match, view);
                if (textView2 != null) {
                    i = R.id.odds;
                    TextView textView3 = (TextView) h5e.a(R.id.odds, view);
                    if (textView3 != null) {
                        i = R.id.odds_bonus_container;
                        FlexboxLayout flexboxLayout = (FlexboxLayout) h5e.a(R.id.odds_bonus_container, view);
                        if (flexboxLayout != null) {
                            i = R.id.result_booking_code;
                            TextView textView4 = (TextView) h5e.a(R.id.result_booking_code, view);
                            if (textView4 != null) {
                                i = R.id.share_img;
                                ImageView imageView = (ImageView) h5e.a(R.id.share_img, view);
                                if (imageView != null) {
                                    i = R.id.share_img_container;
                                    FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.share_img_container, view);
                                    if (frameLayout != null) {
                                        i = R.id.share_result;
                                        TextView textView5 = (TextView) h5e.a(R.id.share_result, view);
                                        if (textView5 != null) {
                                            i = R.id.zoom_bet;
                                            if (((ImageView) h5e.a(R.id.zoom_bet, view)) != null) {
                                                return new igd0(constraintLayout2, textView, constraintLayout, constraintLayout2, textView2, textView3, flexboxLayout, textView4, imageView, frameLayout, textView5);
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
