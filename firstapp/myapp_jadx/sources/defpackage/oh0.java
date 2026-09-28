package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface oh0 {

    public static final class a implements oh0 {
        public final String a;
        public final boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + gmf0.a(Integer.hashCode(0) * 31, 31, this.a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AddAnimation(channel=0, animationName=");
            sb.append(this.a);
            sb.append(", loop=");
            return ruw.a(sb, this.b, ')');
        }
    }

    public static final class b implements oh0 {
        public final rn30 a;

        public b(rn30 rn30Var) {
            this.a = rn30Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NotifyNNDEvent(rcEvent=" + this.a + ')';
        }
    }

    public static final class c implements oh0 {
        public final String a;
        public final boolean b;

        public c(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + gmf0.a(Integer.hashCode(0) * 31, 31, this.a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetAnimation(channel=0, animationName=");
            sb.append(this.a);
            sb.append(", loop=");
            return ruw.a(sb, this.b, ')');
        }
    }
}
