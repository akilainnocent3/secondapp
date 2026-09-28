package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface us00 {

    public static final class a implements us00 {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        @Override // defpackage.us00
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return tug.a("HubtelApiFail(errorMsg=", this.a, ")");
        }
    }

    public static final class b implements us00 {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        @Override // defpackage.us00
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return tug.a("NameMismatched(errorMsg=", this.a, ")");
        }
    }

    public static final class c implements us00 {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        @Override // defpackage.us00
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return tug.a("NameUnverifiable(errorMsg=", this.a, ")");
        }
    }

    public static final class d implements us00 {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        @Override // defpackage.us00
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return tug.a("TransferBalanceFail(errorMsg=", this.a, ")");
        }
    }

    public static final class e implements us00 {
        public final String a;

        public e(String str) {
            this.a = str;
        }

        @Override // defpackage.us00
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.g(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return tug.a("UnKnownError(errorMsg=", this.a, ")");
        }
    }

    String a();
}
