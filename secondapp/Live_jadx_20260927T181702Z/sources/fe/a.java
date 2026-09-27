package fe;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterable<ee.j> f83900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f83901b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterable<ee.j> f83902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f83903b;

        @Override // fe.g.a
        public g a() {
            String str = "";
            if (this.f83902a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f83902a, this.f83903b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // fe.g.a
        public g.a b(Iterable<ee.j> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f83902a = iterable;
            return this;
        }

        @Override // fe.g.a
        public g.a c(@Nullable byte[] bArr) {
            this.f83903b = bArr;
            return this;
        }
    }

    @Override // fe.g
    public Iterable<ee.j> c() {
        return this.f83900a;
    }

    @Override // fe.g
    @Nullable
    public byte[] d() {
        return this.f83901b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f83900a.equals(gVar.c())) {
                if (Arrays.equals(this.f83901b, gVar instanceof a ? ((a) gVar).f83901b : gVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f83900a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f83901b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f83900a + ", extras=" + Arrays.toString(this.f83901b) + "}";
    }

    public a(Iterable<ee.j> iterable, @Nullable byte[] bArr) {
        this.f83900a = iterable;
        this.f83901b = bArr;
    }
}
