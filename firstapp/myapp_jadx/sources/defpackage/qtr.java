package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes.dex */
public final class qtr implements g6i0 {
    public final RelativeLayout a;
    public final TextView b;
    public final TextView c;
    public final TextView d;

    public qtr(RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3) {
        this.a = relativeLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
    }

    public static qtr a(View view) {
        int i = R.id.draw_grey_details;
        TextView textView = (TextView) h5e.a(R.id.draw_grey_details, view);
        if (textView != null) {
            i = R.id.draw_grey_title;
            TextView textView2 = (TextView) h5e.a(R.id.draw_grey_title, view);
            if (textView2 != null) {
                i = R.id.draw_verify_btn;
                TextView textView3 = (TextView) h5e.a(R.id.draw_verify_btn, view);
                if (textView3 != null) {
                    i = R.id.draw_warn;
                    if (((AppCompatImageView) h5e.a(R.id.draw_warn, view)) != null) {
                        return new qtr((RelativeLayout) view, textView, textView2, textView3);
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
