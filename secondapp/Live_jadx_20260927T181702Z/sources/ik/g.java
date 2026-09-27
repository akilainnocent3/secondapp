package ik;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends f0.e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f94651b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends f0.e.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f94652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f94653b;

        @Override // ik.f0.e.b.a
        public f0.e.b a() {
            byte[] bArr;
            String str = this.f94652a;
            if (str != null && (bArr = this.f94653b) != null) {
                return new g(str, bArr);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f94652a == null) {
                sb2.append(" filename");
            }
            if (this.f94653b == null) {
                sb2.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // ik.f0.e.b.a
        public f0.e.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f94653b = bArr;
            return this;
        }

        @Override // ik.f0.e.b.a
        public f0.e.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f94652a = str;
            return this;
        }
    }

    @Override // ik.f0.e.b
    @NonNull
    public byte[] b() {
        return this.f94651b;
    }

    @Override // ik.f0.e.b
    @NonNull
    public String c() {
        return this.f94650a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.b) {
            f0.e.b bVar = (f0.e.b) obj;
            if (this.f94650a.equals(bVar.c())) {
                if (Arrays.equals(this.f94651b, bVar instanceof g ? ((g) bVar).f94651b : bVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f94650a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f94651b);
    }

    public String toString() {
        return "File{filename=" + this.f94650a + ", contents=" + Arrays.toString(this.f94651b) + "}";
    }

    public g(String str, byte[] bArr) {
        this.f94650a = str;
        this.f94651b = bArr;
    }
}
