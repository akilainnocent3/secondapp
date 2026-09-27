package yads;

import android.widget.ProgressBar;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jj2 implements w63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kw f151126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f151127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f151128c;

    public jj2(ProgressBar progressBar, kw kwVar, long j10) {
        this.f151126a = kwVar;
        this.f151127b = j10;
        this.f151128c = new WeakReference(progressBar);
    }

    @Override // yads.w63
    public final void a(long j10, long j11) {
        ProgressBar progressBar = (ProgressBar) this.f151128c.get();
        if (progressBar != null) {
            kw kwVar = this.f151126a;
            long j12 = this.f151127b;
            kwVar.f151748a.getClass();
            ff.a(progressBar, j12, j12 - j10);
        }
    }
}
