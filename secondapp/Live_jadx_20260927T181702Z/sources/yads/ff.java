package yads;

import android.widget.ProgressBar;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ff {
    public static void a(ProgressBar progressBar, long j10, long j11) {
        progressBar.clearAnimation();
        if (j10 > 0) {
            progressBar.setMax((int) j10);
            ej2 ej2Var = new ej2(progressBar, progressBar.getProgress(), (int) j11);
            ej2Var.setDuration(200L);
            progressBar.startAnimation(ej2Var);
        }
    }
}
