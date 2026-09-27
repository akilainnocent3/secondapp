package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import java.util.Objects;
import x4.m1;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14208c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f14209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f14210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f14211c;

        public j d() {
            return new j(this);
        }

        @qj.a
        public b e(long j10) {
            l0.d(j10 >= 0 || j10 == -9223372036854775807L);
            this.f14211c = j10;
            return this;
        }

        @qj.a
        public b f(long j10) {
            this.f14209a = j10;
            return this;
        }

        @qj.a
        public b g(float f10) {
            l0.d(f10 > 0.0f || f10 == -3.4028235E38f);
            this.f14210b = f10;
            return this;
        }

        public b() {
            this.f14209a = -9223372036854775807L;
            this.f14210b = -3.4028235E38f;
            this.f14211c = -9223372036854775807L;
        }

        public b(j jVar) {
            this.f14209a = jVar.f14206a;
            this.f14210b = jVar.f14207b;
            this.f14211c = jVar.f14208c;
        }
    }

    public b a() {
        return new b();
    }

    public boolean b(long j10) {
        long j11 = this.f14208c;
        return (j11 == -9223372036854775807L || j10 == -9223372036854775807L || j11 < j10) ? false : true;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f14206a == jVar.f14206a && this.f14207b == jVar.f14207b && this.f14208c == jVar.f14208c;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.f14206a), Float.valueOf(this.f14207b), Long.valueOf(this.f14208c));
    }

    public j(b bVar) {
        this.f14206a = bVar.f14209a;
        this.f14207b = bVar.f14210b;
        this.f14208c = bVar.f14211c;
    }
}
