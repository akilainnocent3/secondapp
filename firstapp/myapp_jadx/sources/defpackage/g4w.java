package defpackage;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class g4w {
    public final e4w a;
    public final List<a> b;
    public final Integer c;

    public static final class a {
        public final ymp a;
        public final int b;
        public final String c;
        public final String d;

        public a(ymp ympVar, int i, String str, String str2) {
            this.a = ympVar;
            this.b = i;
            this.c = str;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c.equals(aVar.c) && this.d.equals(aVar.d);
        }

        public final int hashCode() {
            return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(status=");
            sb.append(this.a);
            sb.append(", keyId=");
            sb.append(this.b);
            sb.append(", keyType='");
            return kwi.a(sb, this.c, "', keyPrefix='", this.d, "')");
        }
    }

    public g4w(e4w e4wVar, List<a> list, Integer num) {
        this.a = e4wVar;
        this.b = list;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g4w)) {
            return false;
        }
        g4w g4wVar = (g4w) obj;
        return this.a.equals(g4wVar.a) && this.b.equals(g4wVar.b) && Objects.equals(this.c, g4wVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.a, this.b, this.c);
    }
}
