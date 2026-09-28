package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class krc0 implements g6i0 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;

    public krc0(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
    }

    public static krc0 a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.sporty_media_tab_layout, (ViewGroup) null, false);
        int i = R.id.tab_icon;
        ImageView imageView = (ImageView) h5e.a(R.id.tab_icon, viewInflate);
        if (imageView != null) {
            i = R.id.tab_title;
            TextView textView = (TextView) h5e.a(R.id.tab_title, viewInflate);
            if (textView != null) {
                return new krc0((ConstraintLayout) viewInflate, imageView, textView);
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
