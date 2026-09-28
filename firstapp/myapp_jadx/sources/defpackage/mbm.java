package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class mbm extends xhu {
    public final int b;
    public final int c;
    public final c d;
    public final b e;

    public static final class a {
        public Integer a;
        public Integer b;
        public b c;
        public c d;

        public final mbm a() throws GeneralSecurityException {
            Integer num = this.a;
            if (num == null) {
                opp.a("key size is not set");
                return null;
            }
            if (this.b == null) {
                opp.a("tag size is not set");
                return null;
            }
            if (this.c == null) {
                opp.a("hash type is not set");
                return null;
            }
            if (this.d == null) {
                opp.a("variant is not set");
                return null;
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.a));
            }
            Integer num2 = this.b;
            int iIntValue = num2.intValue();
            b bVar = this.c;
            if (iIntValue < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
            }
            if (bVar == b.b) {
                if (iIntValue > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
                }
            } else if (bVar == b.c) {
                if (iIntValue > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
                }
            } else if (bVar == b.d) {
                if (iIntValue > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
                }
            } else if (bVar == b.e) {
                if (iIntValue > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
                }
            } else {
                if (bVar != b.f) {
                    opp.a("unknown hash type; must be SHA256, SHA384 or SHA512");
                    return null;
                }
                if (iIntValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
                }
            }
            return new mbm(this.a.intValue(), this.b.intValue(), this.d, this.c);
        }
    }

    public static final class b {
        public static final b b = new b("SHA1");
        public static final b c = new b("SHA224");
        public static final b d = new b("SHA256");
        public static final b e = new b("SHA384");
        public static final b f = new b("SHA512");
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final String toString() {
            return this.a;
        }
    }

    public static final class c {
        public static final c b = new c("TINK");
        public static final c c = new c("CRUNCHY");
        public static final c d = new c("LEGACY");
        public static final c e = new c("NO_PREFIX");
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final String toString() {
            return this.a;
        }
    }

    public mbm(int i, int i2, c cVar, b bVar) {
        this.b = i;
        this.c = i2;
        this.d = cVar;
        this.e = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mbm)) {
            return false;
        }
        mbm mbmVar = (mbm) obj;
        return mbmVar.b == this.b && mbmVar.h0() == h0() && mbmVar.d == this.d && mbmVar.e == this.e;
    }

    public final int h0() {
        c cVar = c.e;
        int i = this.c;
        c cVar2 = this.d;
        if (cVar2 == cVar) {
            return i;
        }
        if (cVar2 == c.b) {
            return i + 5;
        }
        if (cVar2 == c.c) {
            return i + 5;
        }
        if (cVar2 == c.d) {
            return i + 5;
        }
        ib5.a("Unknown variant");
        return 0;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
        sb.append(this.d);
        sb.append(", hashType: ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.c);
        sb.append("-byte tags, and ");
        return zk1.a(this.b, "-byte key)", sb);
    }
}
