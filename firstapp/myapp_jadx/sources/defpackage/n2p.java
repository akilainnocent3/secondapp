package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public final class n2p implements g6i0 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final ImageView c;
    public final ConstraintLayout d;
    public final TextView e;

    public n2p(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, TextView textView) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = constraintLayout2;
        this.e = textView;
    }

    public static n2p a(View view) {
        int i = R.id.icon;
        ImageView imageView = (ImageView) h5e.a(R.id.icon, view);
        if (imageView != null) {
            i = R.id.icon_check;
            ImageView imageView2 = (ImageView) h5e.a(R.id.icon_check, view);
            if (imageView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.text_country;
                TextView textView = (TextView) h5e.a(R.id.text_country, view);
                if (textView != null) {
                    return new n2p(constraintLayout, imageView, imageView2, constraintLayout, textView);
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
