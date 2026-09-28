package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class jrc0 implements g6i0 {
    public final ConstraintLayout a;
    public final View b;
    public final ImageView c;
    public final TextView d;

    public jrc0(View view, ImageView imageView, TextView textView, ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
        this.b = view;
        this.c = imageView;
        this.d = textView;
    }

    public static jrc0 a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.sporty_media_tab_custom_indicator, (ViewGroup) null, false);
        int i = R.id.custom_indicator;
        View viewA = h5e.a(R.id.custom_indicator, viewInflate);
        if (viewA != null) {
            i = R.id.tab_image;
            ImageView imageView = (ImageView) h5e.a(R.id.tab_image, viewInflate);
            if (imageView != null) {
                i = R.id.tab_title;
                TextView textView = (TextView) h5e.a(R.id.tab_title, viewInflate);
                if (textView != null) {
                    return new jrc0(viewA, imageView, textView, (ConstraintLayout) viewInflate);
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
