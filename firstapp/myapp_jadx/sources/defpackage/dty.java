package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes7.dex */
public final class dty {
    public final LinkedHashSet a = new LinkedHashSet();
    public boolean b;

    public static final class a {
        public final gty a;
        public final String b;

        public a(gty gtyVar, String str) {
            this.a = gtyVar;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ImpressionKey(surface=" + this.a + ", eventId=" + this.b + ")";
        }
    }
}
