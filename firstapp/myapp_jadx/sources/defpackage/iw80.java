package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes8.dex */
public final class iw80 implements g6i0 {
    public final CardView a;
    public final TextView b;
    public final RelativeLayout c;
    public final CardView d;
    public final TextView e;
    public final TextView f;
    public final ImageView i;
    public final ImageView v;
    public final TextView w;

    public iw80(CardView cardView, TextView textView, RelativeLayout relativeLayout, CardView cardView2, TextView textView2, TextView textView3, ImageView imageView, ImageView imageView2, TextView textView4) {
        this.a = cardView;
        this.b = textView;
        this.c = relativeLayout;
        this.d = cardView2;
        this.e = textView2;
        this.f = textView3;
        this.i = imageView;
        this.v = imageView2;
        this.w = textView4;
    }

    public static iw80 a(LayoutInflater layoutInflater, LinearLayoutCompat linearLayoutCompat) {
        View viewInflate = layoutInflater.inflate(R.layout.sh_toast_layout, (ViewGroup) linearLayoutCompat, false);
        linearLayoutCompat.addView(viewInflate);
        int i = R.id.at;
        TextView textView = (TextView) h5e.a(R.id.at, viewInflate);
        if (textView != null) {
            i = R.id.card;
            RelativeLayout relativeLayout = (RelativeLayout) h5e.a(R.id.card, viewInflate);
            if (relativeLayout != null) {
                CardView cardView = (CardView) viewInflate;
                i = R.id.coeff;
                TextView textView2 = (TextView) h5e.a(R.id.coeff, viewInflate);
                if (textView2 != null) {
                    i = R.id.currency;
                    TextView textView3 = (TextView) h5e.a(R.id.currency, viewInflate);
                    if (textView3 != null) {
                        i = R.id.image1;
                        ImageView imageView = (ImageView) h5e.a(R.id.image1, viewInflate);
                        if (imageView != null) {
                            i = R.id.image2;
                            ImageView imageView2 = (ImageView) h5e.a(R.id.image2, viewInflate);
                            if (imageView2 != null) {
                                i = R.id.message;
                                TextView textView4 = (TextView) h5e.a(R.id.message, viewInflate);
                                if (textView4 != null) {
                                    return new iw80(cardView, textView, relativeLayout, cardView, textView2, textView3, imageView, imageView2, textView4);
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
