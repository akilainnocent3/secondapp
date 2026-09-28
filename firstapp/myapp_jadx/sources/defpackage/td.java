package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.widget.LoadingView;

/* JADX INFO: loaded from: classes5.dex */
public final class td implements g6i0 {
    public final ConstraintLayout a;
    public final LoadingView b;

    public td(ConstraintLayout constraintLayout, LoadingView loadingView, TextView textView) {
        this.a = constraintLayout;
        this.b = loadingView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
