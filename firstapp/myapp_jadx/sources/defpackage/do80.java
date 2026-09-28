package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.ybq.android.spinkit.SpinKitView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class do80 implements g6i0 {
    public final ConstraintLayout A;
    public final ConstraintLayout a;
    public final AppCompatImageView b;
    public final AppCompatImageView c;
    public final ImageView d;
    public final ImageView e;
    public final SpinKitView f;
    public final AppCompatTextView i;
    public final LinearLayout v;
    public final TextView w;
    public final AppCompatTextView y;
    public final TextView z;

    public do80(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ImageView imageView, ImageView imageView2, SpinKitView spinKitView, AppCompatTextView appCompatTextView, LinearLayout linearLayout, TextView textView, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout2, TextView textView2, ConstraintLayout constraintLayout3) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = appCompatImageView2;
        this.d = imageView;
        this.e = imageView2;
        this.f = spinKitView;
        this.i = appCompatTextView;
        this.v = linearLayout;
        this.w = textView;
        this.y = appCompatTextView2;
        this.z = textView2;
        this.A = constraintLayout3;
    }

    public static do80 a(View view) {
        int i = R.id.back_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.back_icon, view);
        if (appCompatImageView != null) {
            i = R.id.ic_logo;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.ic_logo, view);
            if (appCompatImageView2 != null) {
                i = R.id.imageView;
                ImageView imageView = (ImageView) h5e.a(R.id.imageView, view);
                if (imageView != null) {
                    i = R.id.iv_me_icon;
                    ImageView imageView2 = (ImageView) h5e.a(R.id.iv_me_icon, view);
                    if (imageView2 != null) {
                        i = R.id.loader;
                        SpinKitView spinKitView = (SpinKitView) h5e.a(R.id.loader, view);
                        if (spinKitView != null) {
                            i = R.id.login;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.login, view);
                            if (appCompatTextView != null) {
                                i = R.id.login_layout;
                                LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.login_layout, view);
                                if (linearLayout != null) {
                                    i = R.id.register;
                                    TextView textView = (TextView) h5e.a(R.id.register, view);
                                    if (textView != null) {
                                        i = R.id.toolbar_id;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.toolbar_id, view);
                                        if (appCompatTextView2 != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                            i = R.id.wallet_balance;
                                            TextView textView2 = (TextView) h5e.a(R.id.wallet_balance, view);
                                            if (textView2 != null) {
                                                i = R.id.wallet_info;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.wallet_info, view);
                                                if (constraintLayout2 != null) {
                                                    return new do80(constraintLayout, appCompatImageView, appCompatImageView2, imageView, imageView2, spinKitView, appCompatTextView, linearLayout, textView, appCompatTextView2, constraintLayout, textView2, constraintLayout2);
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
