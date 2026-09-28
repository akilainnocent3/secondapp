package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class afb0 implements g6i0 {
    public final ConstraintLayout a;

    public afb0(ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
    }

    public static afb0 a(View view) {
        int i = R.id.progress;
        if (((ProgressBar) h5e.a(R.id.progress, view)) != null) {
            i = R.id.text;
            if (((TextView) h5e.a(R.id.text, view)) != null) {
                return new afb0((ConstraintLayout) view);
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
