package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface ixe {

    public static final class a implements ixe {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -407756166;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    public static final class b implements ixe {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 695904698;
        }

        public final String toString() {
            return "ToCustomerService";
        }
    }

    public static final class c implements ixe {
        public final boolean a;
        public final String b;

        public c(boolean z, String str) {
            str.getClass();
            this.a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && Intrinsics.g(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "ToSuccess(qualifiedForGift=" + this.a + ", message=" + this.b + ")";
        }
    }
}
