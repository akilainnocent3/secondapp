package qc;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f122167a = false;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile RuntimeException f122168b;

        public b() {
            super();
        }

        @Override // qc.c
        public void b(boolean z10) {
            if (z10) {
                this.f122168b = new RuntimeException("Released");
            } else {
                this.f122168b = null;
            }
        }

        @Override // qc.c
        public void c() {
            if (this.f122168b != null) {
                throw new IllegalStateException("Already released", this.f122168b);
            }
        }
    }

    /* JADX INFO: renamed from: qc.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C1182c extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f122169b;

        public C1182c() {
            super();
        }

        @Override // qc.c
        public void b(boolean z10) {
            this.f122169b = z10;
        }

        @Override // qc.c
        public void c() {
            if (this.f122169b) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    @NonNull
    public static c a() {
        return new C1182c();
    }

    public abstract void b(boolean z10);

    public abstract void c();

    public c() {
    }
}
