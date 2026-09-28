package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface mw1 {

    public static final class a implements mw1 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2117916507;
        }

        public final String toString() {
            return "GroupSpacing";
        }
    }

    public static final class b implements mw1 {
        public final lw1 a;

        public b(lw1 lw1Var) {
            this.a = lw1Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Header(headerType=" + this.a + ")";
        }
    }

    public static final class c implements mw1 {
        public final aoe0.a a;
        public final i060 b;
        public final boolean c;

        public c(aoe0.a aVar, i060 i060Var, boolean z) {
            aVar.getClass();
            this.a = aVar;
            this.b = i060Var;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && this.b.equals(cVar.b) && this.c == cVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Item(bank=");
            sb.append(this.a);
            sb.append(", corners=");
            sb.append(this.b);
            sb.append(", showDivider=");
            return mq0.a(sb, this.c, ")");
        }
    }
}
