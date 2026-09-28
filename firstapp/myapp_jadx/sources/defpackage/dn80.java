package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import com.github.ybq.android.spinkit.SpinKitView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class dn80 implements g6i0 {
    public final RelativeLayout a;
    public final AppCompatImageView b;
    public final Toolbar c;
    public final NestedScrollView d;
    public final WebView e;
    public final FrameLayout f;
    public final ImageView i;
    public final SpinKitView v;
    public final TextView w;

    public dn80(RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, Toolbar toolbar, NestedScrollView nestedScrollView, WebView webView, FrameLayout frameLayout, ImageView imageView, SpinKitView spinKitView, TextView textView) {
        this.a = relativeLayout;
        this.b = appCompatImageView;
        this.c = toolbar;
        this.d = nestedScrollView;
        this.e = webView;
        this.f = frameLayout;
        this.i = imageView;
        this.v = spinKitView;
        this.w = textView;
    }

    public static dn80 a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.sg_activity_main, (ViewGroup) null, false);
        int i = R.id.back_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.back_icon, viewInflate);
        if (appCompatImageView != null) {
            i = R.id.place_holder_fragment;
            View viewA = h5e.a(R.id.place_holder_fragment, viewInflate);
            if (viewA != null) {
                axi.a(viewA);
                i = R.id.sg_toolbar_main;
                Toolbar toolbar = (Toolbar) h5e.a(R.id.sg_toolbar_main, viewInflate);
                if (toolbar != null) {
                    i = R.id.sg_web_scroll_layout;
                    NestedScrollView nestedScrollView = (NestedScrollView) h5e.a(R.id.sg_web_scroll_layout, viewInflate);
                    if (nestedScrollView != null) {
                        i = R.id.sg_web_view;
                        WebView webView = (WebView) h5e.a(R.id.sg_web_view, viewInflate);
                        if (webView != null) {
                            i = R.id.sg_web_wrapper;
                            FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.sg_web_wrapper, viewInflate);
                            if (frameLayout != null) {
                                i = R.id.spin_image;
                                ImageView imageView = (ImageView) h5e.a(R.id.spin_image, viewInflate);
                                if (imageView != null) {
                                    i = R.id.spin_kit;
                                    SpinKitView spinKitView = (SpinKitView) h5e.a(R.id.spin_kit, viewInflate);
                                    if (spinKitView != null) {
                                        i = R.id.toolbar_title;
                                        TextView textView = (TextView) h5e.a(R.id.toolbar_title, viewInflate);
                                        if (textView != null) {
                                            return new dn80((RelativeLayout) viewInflate, appCompatImageView, toolbar, nestedScrollView, webView, frameLayout, imageView, spinKitView, textView);
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
