package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface h8c {

    public static final class a implements h8c {
        public final String a;
        public final String b;
        public final BookingData c;

        public a(String str, String str2, BookingData bookingData) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = bookingData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("ShareCustomCode(aliasCode=", this.a, ", countryCode=", this.b, ", bookingData=");
            sbA.append(this.c);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class b implements h8c {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 116552137;
        }

        public final String toString() {
            return "ShowEditCodeSuccess";
        }
    }

    public static final class c implements h8c {
        public final Throwable a;
        public final UiText b;

        public c(Throwable th, UiText uiText) {
            th.getClass();
            this.a = th;
            this.b = uiText;
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
            int iHashCode = this.a.hashCode() * 31;
            UiText uiText = this.b;
            return iHashCode + (uiText == null ? 0 : uiText.hashCode());
        }

        public final String toString() {
            return "ShowError(error=" + this.a + ", errorText=" + this.b + ")";
        }
    }

    public static final class d implements h8c {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 505977861;
        }

        public final String toString() {
            return "ShowReplaceCodeSuccess";
        }
    }
}
