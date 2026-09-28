package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public final class srr implements g6i0 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final ImageView c;
    public final TextView d;

    public srr(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = textView;
    }

    public static srr a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_common_popup_upward, (ViewGroup) null, false);
        int i = R.id.arrow_down;
        ImageView imageView = (ImageView) h5e.a(R.id.arrow_down, viewInflate);
        if (imageView != null) {
            i = R.id.arrow_up;
            ImageView imageView2 = (ImageView) h5e.a(R.id.arrow_up, viewInflate);
            if (imageView2 != null) {
                i = R.id.message;
                TextView textView = (TextView) h5e.a(R.id.message, viewInflate);
                if (textView != null) {
                    return new srr((ConstraintLayout) viewInflate, imageView, imageView2, textView);
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
