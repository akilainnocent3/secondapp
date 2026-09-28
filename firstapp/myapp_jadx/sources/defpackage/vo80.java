package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class vo80 implements g6i0 {
    public final TextView A;
    public final ConstraintLayout a;
    public final ImageView b;
    public final ImageView c;
    public final AppCompatImageView d;
    public final TextView e;
    public final RelativeLayout f;
    public final LinearLayoutCompat i;
    public final TextView v;
    public final AppCompatTextView w;
    public final ImageView y;
    public final LinearLayout z;

    public vo80(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, AppCompatImageView appCompatImageView, TextView textView, RelativeLayout relativeLayout, LinearLayoutCompat linearLayoutCompat, TextView textView2, AppCompatTextView appCompatTextView, ImageView imageView3, LinearLayout linearLayout, TextView textView3) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = appCompatImageView;
        this.e = textView;
        this.f = relativeLayout;
        this.i = linearLayoutCompat;
        this.v = textView2;
        this.w = appCompatTextView;
        this.y = imageView3;
        this.z = linearLayout;
        this.A = textView3;
    }

    public static vo80 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sg_lobby_items, viewGroup, false);
        int i = R.id.card;
        if (((CardView) h5e.a(R.id.card, viewInflate)) != null) {
            i = R.id.dots;
            ImageView imageView = (ImageView) h5e.a(R.id.dots, viewInflate);
            if (imageView != null) {
                i = R.id.favourite;
                ImageView imageView2 = (ImageView) h5e.a(R.id.favourite, viewInflate);
                if (imageView2 != null) {
                    i = R.id.game_iv;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.game_iv, viewInflate);
                    if (appCompatImageView != null) {
                        i = R.id.game_name;
                        TextView textView = (TextView) h5e.a(R.id.game_name, viewInflate);
                        if (textView != null) {
                            i = R.id.layout;
                            RelativeLayout relativeLayout = (RelativeLayout) h5e.a(R.id.layout, viewInflate);
                            if (relativeLayout != null) {
                                i = R.id.linearLayoutCompat3;
                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) h5e.a(R.id.linearLayoutCompat3, viewInflate);
                                if (linearLayoutCompat != null) {
                                    i = R.id.online_tv;
                                    TextView textView2 = (TextView) h5e.a(R.id.online_tv, viewInflate);
                                    if (textView2 != null) {
                                        i = R.id.tag_tv;
                                        AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.tag_tv, viewInflate);
                                        if (appCompatTextView != null) {
                                            i = R.id.toast_icon;
                                            ImageView imageView3 = (ImageView) h5e.a(R.id.toast_icon, viewInflate);
                                            if (imageView3 != null) {
                                                i = R.id.toast_layout;
                                                LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.toast_layout, viewInflate);
                                                if (linearLayout != null) {
                                                    i = R.id.toast_title;
                                                    TextView textView3 = (TextView) h5e.a(R.id.toast_title, viewInflate);
                                                    if (textView3 != null) {
                                                        return new vo80((ConstraintLayout) viewInflate, imageView, imageView2, appCompatImageView, textView, relativeLayout, linearLayoutCompat, textView2, appCompatTextView, imageView3, linearLayout, textView3);
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
