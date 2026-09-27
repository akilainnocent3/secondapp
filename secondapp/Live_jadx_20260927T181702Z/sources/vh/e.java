package vh;

import androidx.annotation.NonNull;
import k.c1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @c1
    public final int f141079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @c1
    public final int f141080b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @c1
        public int f141081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @c1
        public int f141082b;

        @NonNull
        public e c() {
            return new e(this);
        }

        @NonNull
        @qj.a
        public b d(@c1 int i10) {
            this.f141082b = i10;
            return this;
        }

        @NonNull
        @qj.a
        public b e(@c1 int i10) {
            this.f141081a = i10;
            return this;
        }
    }

    @c1
    public int a() {
        return this.f141080b;
    }

    @c1
    public int b() {
        return this.f141079a;
    }

    public e(b bVar) {
        this.f141079a = bVar.f141081a;
        this.f141080b = bVar.f141082b;
    }
}
