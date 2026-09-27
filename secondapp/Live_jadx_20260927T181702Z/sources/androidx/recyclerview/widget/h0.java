package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import f0.d1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface h0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f18771a = 0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.h0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class C0150a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d1<Long> f18772a = new d1<>();

            public C0150a() {
            }

            @Override // androidx.recyclerview.widget.h0.d
            public long a(long j10) {
                Long lG = this.f18772a.g(j10);
                if (lG == null) {
                    lG = Long.valueOf(a.this.b());
                    this.f18772a.n(j10, lG);
                }
                return lG.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.h0
        @NonNull
        public d a() {
            return new C0150a();
        }

        public long b() {
            long j10 = this.f18771a;
            this.f18771a = 1 + j10;
            return j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f18774a = new a();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements d {
            public a() {
            }

            @Override // androidx.recyclerview.widget.h0.d
            public long a(long j10) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.h0
        @NonNull
        public d a() {
            return this.f18774a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        long a(long j10);
    }

    @NonNull
    d a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f18776a = new a();

        @Override // androidx.recyclerview.widget.h0
        @NonNull
        public d a() {
            return this.f18776a;
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements d {
            public a() {
            }

            @Override // androidx.recyclerview.widget.h0.d
            public long a(long j10) {
                return j10;
            }
        }
    }
}
