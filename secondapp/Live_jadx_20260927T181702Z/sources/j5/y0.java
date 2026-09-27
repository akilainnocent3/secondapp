package j5;

import androidx.annotation.Nullable;
import java.util.UUID;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public interface y0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f99713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final s5.e0 f99714b;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final byte[] f99715a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public s5.e0 f99716b;

            public a(byte[] bArr) {
                this.f99715a = bArr;
            }

            public b c() {
                return new b(this);
            }

            @qj.a
            public a d(s5.e0 e0Var) {
                this.f99716b = e0Var;
                return this;
            }
        }

        public b(byte[] bArr) {
            this.f99713a = bArr;
            this.f99714b = null;
        }

        public b(a aVar) {
            this.f99713a = aVar.f99715a;
            this.f99714b = aVar.f99716b;
        }
    }

    b a(UUID uuid, f0.h hVar) throws z0;

    b b(UUID uuid, f0.b bVar) throws z0;
}
