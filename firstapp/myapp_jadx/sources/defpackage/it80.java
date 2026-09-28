package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes8.dex */
public final class it80 implements g6i0 {
    public final LinearLayout a;
    public final ShapeableImageView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;

    public it80(LinearLayout linearLayout, ShapeableImageView shapeableImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.a = linearLayout;
        this.b = shapeableImageView;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
    }

    public static it80 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sh_item_all_bets_v2, viewGroup, false);
        int i = R.id.account_icon;
        ShapeableImageView shapeableImageView = (ShapeableImageView) h5e.a(R.id.account_icon, viewInflate);
        if (shapeableImageView != null) {
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            i = R.id.tv_bet_win;
            TextView textView = (TextView) h5e.a(R.id.tv_bet_win, viewInflate);
            if (textView != null) {
                i = R.id.tv_coeff;
                TextView textView2 = (TextView) h5e.a(R.id.tv_coeff, viewInflate);
                if (textView2 != null) {
                    i = R.id.tv_name;
                    TextView textView3 = (TextView) h5e.a(R.id.tv_name, viewInflate);
                    if (textView3 != null) {
                        i = R.id.tv_win;
                        TextView textView4 = (TextView) h5e.a(R.id.tv_win, viewInflate);
                        if (textView4 != null) {
                            return new it80(linearLayout, shapeableImageView, textView, textView2, textView3, textView4);
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
