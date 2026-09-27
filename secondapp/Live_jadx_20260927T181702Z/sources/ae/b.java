package ae;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f4839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f4840c;

    /* JADX INFO: renamed from: ae.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0015b extends g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f4841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f4842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f4843c;

        @Override // ae.g.a
        public g a() {
            return new b(this.f4841a, this.f4842b, this.f4843c);
        }

        @Override // ae.g.a
        public g.a b(byte[] bArr) {
            this.f4842b = bArr;
            return this;
        }

        @Override // ae.g.a
        public g.a c(byte[] bArr) {
            this.f4843c = bArr;
            return this;
        }

        @Override // ae.g.a
        public g.a d(String str) {
            this.f4841a = str;
            return this;
        }
    }

    @Override // ae.g
    @Nullable
    public byte[] b() {
        return this.f4839b;
    }

    @Override // ae.g
    @Nullable
    public byte[] c() {
        return this.f4840c;
    }

    @Override // ae.g
    @Nullable
    public String d() {
        return this.f4838a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            String str = this.f4838a;
            if (str != null ? str.equals(gVar.d()) : gVar.d() == null) {
                boolean z10 = gVar instanceof b;
                if (Arrays.equals(this.f4839b, z10 ? ((b) gVar).f4839b : gVar.b())) {
                    if (Arrays.equals(this.f4840c, z10 ? ((b) gVar).f4840c : gVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f4838a;
        return (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f4839b)) * 1000003) ^ Arrays.hashCode(this.f4840c);
    }

    public String toString() {
        return "EventContext{pseudonymousId=" + this.f4838a + ", experimentIdsClear=" + Arrays.toString(this.f4839b) + ", experimentIdsEncrypted=" + Arrays.toString(this.f4840c) + "}";
    }

    public b(@Nullable String str, @Nullable byte[] bArr, @Nullable byte[] bArr2) {
        this.f4838a = str;
        this.f4839b = bArr;
        this.f4840c = bArr2;
    }
}
