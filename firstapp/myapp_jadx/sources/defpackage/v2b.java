package defpackage;

import com.appsflyer.internal.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface v2b {

    public static final class a implements v2b {
        public final String a;
        public final String b;
        public final boolean c;
        public final String d;

        public a(String str, String str2, boolean z, String str3) {
            m.a(str, str2, str3);
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && this.c == aVar.c && Intrinsics.g(this.d, aVar.d);
        }

        @Override // defpackage.v2b
        public final String getBookingCode() {
            return this.b;
        }

        public final int hashCode() {
            return this.d.hashCode() + mtg0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return nyf.a(", countryCode=", this.d, ")", ux5.a("AliasCode(aliasCode=", this.a, ", bookingCode=", this.b, ", isCreator="), this.c);
        }
    }

    public static final class b implements v2b {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        @Override // defpackage.v2b
        public final String getBookingCode() {
            return this.a;
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return tug.a("BookingCode(bookingCode=", this.a, ")");
        }
    }

    String getBookingCode();
}
