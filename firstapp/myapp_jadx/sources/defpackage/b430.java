package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.views.ProgressMeterBackground;

/* JADX INFO: loaded from: classes7.dex */
public final class b430 implements g6i0 {
    public final ConstraintLayout a;
    public final ProgressBar b;
    public final TextView c;

    public b430(ConstraintLayout constraintLayout, ProgressBar progressBar, TextView textView) {
        this.a = constraintLayout;
        this.b = progressBar;
        this.c = textView;
    }

    public static b430 a(LayoutInflater layoutInflater, ConstraintLayout constraintLayout) {
        View viewInflate = layoutInflater.inflate(R.layout.progress_meter_component, (ViewGroup) constraintLayout, false);
        constraintLayout.addView(viewInflate);
        int i = R.id.ob_placeholder;
        if (((ProgressMeterBackground) h5e.a(R.id.ob_placeholder, viewInflate)) != null) {
            i = R.id.progressShow;
            ProgressBar progressBar = (ProgressBar) h5e.a(R.id.progressShow, viewInflate);
            if (progressBar != null) {
                i = R.id.progressText;
                TextView textView = (TextView) h5e.a(R.id.progressText, viewInflate);
                if (textView != null) {
                    return new b430((ConstraintLayout) viewInflate, progressBar, textView);
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
