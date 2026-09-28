package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class uo extends ym {
    public final int b;
    public final a c;

    public static final class a {
        public static final a b = new a("TINK");
        public static final a c = new a("CRUNCHY");
        public static final a d = new a("NO_PREFIX");
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final String toString() {
            return this.a;
        }
    }

    public uo(int i, a aVar) {
        this.b = i;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uo)) {
            return false;
        }
        uo uoVar = (uo) obj;
        return uoVar.b == this.b && uoVar.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(this.c);
        sb.append(", ");
        return zk1.a(this.b, "-byte key)", sb);
    }
}
