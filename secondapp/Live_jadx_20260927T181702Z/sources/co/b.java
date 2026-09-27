package co;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements SwipeRefreshLayout.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f24926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24927b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void d(int sourceId);
    }

    public b(a listener, int sourceId) {
        this.f24926a = listener;
        this.f24927b = sourceId;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void a() {
        this.f24926a.d(this.f24927b);
    }
}
