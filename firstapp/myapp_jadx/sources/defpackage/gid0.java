package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.widget.ListenableSpinner;

/* JADX INFO: loaded from: classes7.dex */
public final class gid0 implements g6i0 {
    public final RelativeLayout a;
    public final ListenableSpinner b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final View i;

    public gid0(RelativeLayout relativeLayout, ListenableSpinner listenableSpinner, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view) {
        this.a = relativeLayout;
        this.b = listenableSpinner;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.i = view;
    }

    public static gid0 a(View view) {
        int i = R.id.anchor;
        if (((Space) h5e.a(R.id.anchor, view)) != null) {
            i = R.id.specifier_spinner;
            ListenableSpinner listenableSpinner = (ListenableSpinner) h5e.a(R.id.specifier_spinner, view);
            if (listenableSpinner != null) {
                i = R.id.sports_grid;
                if (((LinearLayout) h5e.a(R.id.sports_grid, view)) != null) {
                    i = R.id.title1;
                    TextView textView = (TextView) h5e.a(R.id.title1, view);
                    if (textView != null) {
                        i = R.id.title2;
                        TextView textView2 = (TextView) h5e.a(R.id.title2, view);
                        if (textView2 != null) {
                            i = R.id.title3;
                            TextView textView3 = (TextView) h5e.a(R.id.title3, view);
                            if (textView3 != null) {
                                i = R.id.title4;
                                TextView textView4 = (TextView) h5e.a(R.id.title4, view);
                                if (textView4 != null) {
                                    i = R.id.title_bg;
                                    View viewA = h5e.a(R.id.title_bg, view);
                                    if (viewA != null) {
                                        return new gid0((RelativeLayout) view, listenableSpinner, textView, textView2, textView3, textView4, viewA);
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
