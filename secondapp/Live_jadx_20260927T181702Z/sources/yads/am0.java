package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class am0 implements cw {
    @Override // yads.cw
    public final void a(View view) {
        view.setAlpha(0.4f);
        view.setEnabled(false);
    }

    @Override // yads.cw
    public final void b(View view) {
        view.animate().alpha(1.0f).setDuration(200L);
        view.setEnabled(true);
    }
}
