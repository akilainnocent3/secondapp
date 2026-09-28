package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import com.sportybet.android.widget.LoadingView;

/* JADX INFO: loaded from: classes5.dex */
public final class kc implements g6i0 {
    public final RelativeLayout a;
    public final LoadingView b;

    public kc(RelativeLayout relativeLayout, LoadingView loadingView) {
        this.a = relativeLayout;
        this.b = loadingView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
