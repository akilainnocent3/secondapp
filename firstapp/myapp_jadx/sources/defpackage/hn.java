package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class hn extends xhu {
    public final int b;
    public final int c;
    public final b d;

    public static final class a {
        public Integer a;
        public Integer b;
        public b c;

        public final hn a() throws GeneralSecurityException {
            Integer num = this.a;
            if (num == null) {
                opp.a("key size not set");
                return null;
            }
            if (this.b == null) {
                opp.a("tag size not set");
                return null;
            }
            if (this.c != null) {
                return new hn(num.intValue(), this.b.intValue(), this.c);
            }
            opp.a("variant not set");
            return null;
        }

        public final void b(int i) throws InvalidAlgorithmParameterException {
            if (i != 16 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
            }
            this.a = Integer.valueOf(i);
        }
    }

    public static final class b {
        public static final b b = new b("TINK");
        public static final b c = new b("CRUNCHY");
        public static final b d = new b("LEGACY");
        public static final b e = new b("NO_PREFIX");
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final String toString() {
            return this.a;
        }
    }

    public hn(int i, int i2, b bVar) {
        this.b = i;
        this.c = i2;
        this.d = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hn)) {
            return false;
        }
        hn hnVar = (hn) obj;
        return hnVar.b == this.b && hnVar.h0() == h0() && hnVar.d == this.d;
    }

    public final int h0() {
        b bVar = b.e;
        int i = this.c;
        b bVar2 = this.d;
        if (bVar2 == bVar) {
            return i;
        }
        if (bVar2 == b.b) {
            return i + 5;
        }
        if (bVar2 == b.c) {
            return i + 5;
        }
        if (bVar2 == b.d) {
            return i + 5;
        }
        ib5.a("Unknown variant");
        return 0;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Integer.valueOf(this.c), this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.c);
        sb.append("-byte tags, and ");
        return zk1.a(this.b, "-byte key)", sb);
    }
}
