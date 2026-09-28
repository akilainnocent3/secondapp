package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.widget.ListenableSpinner;

/* JADX INFO: loaded from: classes4.dex */
public final class tjd0 implements g6i0 {
    public final RelativeLayout a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final RelativeLayout e;
    public final TextView f;
    public final TextView i;
    public final ListenableSpinner v;

    public tjd0(RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, RelativeLayout relativeLayout2, TextView textView4, TextView textView5, ListenableSpinner listenableSpinner) {
        this.a = relativeLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = relativeLayout2;
        this.f = textView4;
        this.i = textView5;
        this.v = listenableSpinner;
    }

    public static tjd0 a(View view) {
        int i = R.id.date_week;
        TextView textView = (TextView) h5e.a(R.id.date_week, view);
        if (textView != null) {
            i = R.id.fourth_button;
            TextView textView2 = (TextView) h5e.a(R.id.fourth_button, view);
            if (textView2 != null) {
                i = R.id.left_button;
                TextView textView3 = (TextView) h5e.a(R.id.left_button, view);
                if (textView3 != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i = R.id.market_title;
                    if (((LinearLayout) h5e.a(R.id.market_title, view)) != null) {
                        i = R.id.mid_button;
                        TextView textView4 = (TextView) h5e.a(R.id.mid_button, view);
                        if (textView4 != null) {
                            i = R.id.right_button;
                            TextView textView5 = (TextView) h5e.a(R.id.right_button, view);
                            if (textView5 != null) {
                                i = R.id.specifier_spinner;
                                ListenableSpinner listenableSpinner = (ListenableSpinner) h5e.a(R.id.specifier_spinner, view);
                                if (listenableSpinner != null) {
                                    return new tjd0(relativeLayout, textView, textView2, textView3, relativeLayout, textView4, textView5, listenableSpinner);
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
