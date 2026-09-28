package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface c0f0 {

    public static final class a implements c0f0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2019205524;
        }

        public final String toString() {
            return "BetHistory";
        }
    }

    public static final class b implements c0f0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1754847476;
        }

        public final String toString() {
            return "Collections";
        }
    }

    public static final class c implements c0f0 {
        public final boolean a;

        public c(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return ruw.a(new StringBuilder("HowToPlay(haveCollection="), this.a, ')');
        }
    }

    public static final class d implements c0f0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 18961825;
        }

        public final String toString() {
            return "None";
        }
    }

    public static final class e implements c0f0 {
        public final String a;
        public final String b;
        public final boolean c;

        public e(String str, String str2, boolean z) {
            str.getClass();
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.g(this.a, eVar.a) && this.b.equals(eVar.b) && this.c == eVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SidePanel(nickName=");
            sb.append(this.a);
            sb.append(", avatar=");
            sb.append(this.b);
            sb.append(", haveCollection=");
            return ruw.a(sb, this.c, ')');
        }
    }
}
