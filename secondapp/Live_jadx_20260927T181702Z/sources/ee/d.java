package ee;

import androidx.annotation.Nullable;
import java.util.Arrays;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f80777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ae.h f80778c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends r.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f80779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f80780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ae.h f80781c;

        @Override // ee.r.a
        public r a() {
            String str = "";
            if (this.f80779a == null) {
                str = " backendName";
            }
            if (this.f80781c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f80779a, this.f80780b, this.f80781c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ee.r.a
        public r.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f80779a = str;
            return this;
        }

        @Override // ee.r.a
        public r.a c(@Nullable byte[] bArr) {
            this.f80780b = bArr;
            return this;
        }

        @Override // ee.r.a
        public r.a d(ae.h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f80781c = hVar;
            return this;
        }
    }

    @Override // ee.r
    public String b() {
        return this.f80776a;
    }

    @Override // ee.r
    @Nullable
    public byte[] c() {
        return this.f80777b;
    }

    @Override // ee.r
    @y0({y0.a.LIBRARY_GROUP})
    public ae.h d() {
        return this.f80778c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f80776a.equals(rVar.b())) {
                if (Arrays.equals(this.f80777b, rVar instanceof d ? ((d) rVar).f80777b : rVar.c()) && this.f80778c.equals(rVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f80776a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f80777b)) * 1000003) ^ this.f80778c.hashCode();
    }

    public d(String str, @Nullable byte[] bArr, ae.h hVar) {
        this.f80776a = str;
        this.f80777b = bArr;
        this.f80778c = hVar;
    }
}
