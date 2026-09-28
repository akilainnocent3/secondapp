package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class l800 {

    public static final class a extends l800 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1619913050;
        }

        public final String toString() {
            return "Canceled";
        }
    }

    public static final class b extends l800 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -130038689;
        }

        public final String toString() {
            return "Fail";
        }
    }

    public static final class c extends l800 {
        public final String a;
        public final String b;
        public final boolean c;

        public c(String str, String str2, boolean z) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
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
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && this.c == cVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return mq0.a(ux5.a("Success(otpCode=", this.a, ", otpToken=", this.b, ", isTrustedDevice="), this.c, ")");
        }
    }
}
