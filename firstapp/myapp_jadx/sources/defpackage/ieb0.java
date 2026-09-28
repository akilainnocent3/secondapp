package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class ieb0 implements g6i0 {
    public final FrameLayout a;
    public final View b;

    public ieb0(View view, FrameLayout frameLayout) {
        this.a = frameLayout;
        this.b = view;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
