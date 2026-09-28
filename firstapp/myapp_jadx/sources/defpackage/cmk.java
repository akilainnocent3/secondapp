package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface cmk {

    public static final class a implements cmk {
        public static final a a = new a();
    }

    public static final class c implements cmk {
        public final String a;
        public final String b;

        public c(String str, String str2) {
            str2.getClass();
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("GrabSuccess(giftValueString=", this.a, ", currency=", this.b, ")");
        }
    }

    public static final class d implements cmk {
        public static final d a = new d();
    }

    public static final class b implements cmk {
        public final String a;
        public final String b;
        public final uxs c;
        public final boolean d;

        public /* synthetic */ b(int i, String str, String str2, boolean z) {
            this(uxs.ENABLE, (i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 8) != 0 ? false : z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + y45.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("GrabScreen(giftValueString=", this.a, ", currency=", this.b, ", grabButtonState=");
            sbA.append(this.c);
            sbA.append(", blockedCashOut=");
            sbA.append(this.d);
            sbA.append(")");
            return sbA.toString();
        }

        public b(uxs uxsVar, String str, String str2, boolean z) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = uxsVar;
            this.d = z;
        }
    }
}
