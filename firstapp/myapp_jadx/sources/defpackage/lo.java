package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class lo extends ym {
    public final int b;
    public final int c;
    public final int d;
    public final a e;

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

    public lo(int i, int i2, int i3, a aVar) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lo)) {
            return false;
        }
        lo loVar = (lo) obj;
        return loVar.b == this.b && loVar.c == this.c && loVar.d == this.d && loVar.e == this.e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.c);
        sb.append("-byte IV, ");
        sb.append(this.d);
        sb.append("-byte tag, and ");
        return zk1.a(this.b, "-byte key)", sb);
    }
}
