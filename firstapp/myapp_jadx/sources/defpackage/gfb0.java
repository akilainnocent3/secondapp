package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class gfb0 implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;

    public gfb0(ConstraintLayout constraintLayout, TextView textView) {
        this.a = constraintLayout;
        this.b = textView;
    }

    public static gfb0 a(View view) {
        int i = R.id.icon;
        if (((AppCompatImageView) h5e.a(R.id.icon, view)) != null) {
            i = R.id.message;
            TextView textView = (TextView) h5e.a(R.id.message, view);
            if (textView != null) {
                return new gfb0((ConstraintLayout) view, textView);
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
