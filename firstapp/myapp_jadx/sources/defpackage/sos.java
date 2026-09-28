package defpackage;

import android.view.View;
import com.sportybet.android.widget.LoadingView;

/* JADX INFO: loaded from: classes7.dex */
public final class sos implements g6i0 {
    public final LoadingView a;
    public final LoadingView b;

    public sos(LoadingView loadingView, LoadingView loadingView2) {
        this.a = loadingView;
        this.b = loadingView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
