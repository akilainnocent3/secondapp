package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface me90 {

    public static final class b implements me90 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 343533921;
        }

        public final String toString() {
            return "None";
        }
    }

    public static final class a implements me90 {
        public final String a;
        public final iph0 b;

        public a(String str, iph0 iph0Var) {
            str.getClass();
            iph0Var.getClass();
            this.a = str;
            this.b = iph0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Display(gameName=" + this.a + ", userInfo=" + this.b + ')';
        }

        public a() {
            this(0);
        }

        public /* synthetic */ a(int i) {
            this("", new iph0(0));
        }
    }
}
