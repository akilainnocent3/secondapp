package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface dha0 {

    public static final class a implements dha0 {
        public final aga0 a;

        public a(aga0 aga0Var) {
            aga0Var.getClass();
            this.a = aga0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AppNotAvailable(platform=" + this.a + ")";
        }
    }

    public static final class b implements dha0 {
        public final String a;

        public b(String str) {
            this.a = str;
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
            return tug.a("CopyLink(linkUrl=", this.a, ")");
        }
    }

    public static final class c implements dha0 {
        public final String a;
        public final Uri b;
        public final e190 c;
        public final String d;
        public final String e;
        public final String f;

        public c(String str, Uri uri, e190 e190Var, String str2, String str3, String str4) {
            str.getClass();
            this.a = str;
            this.b = uri;
            this.c = e190Var;
            this.d = str2;
            this.e = str3;
            this.f = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && this.c == cVar.c && Intrinsics.g(this.d, cVar.d) && Intrinsics.g(this.e, cVar.e) && Intrinsics.g(this.f, cVar.f);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Uri uri = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31)) * 31;
            String str = this.d;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MoreShare(linkUrl=");
            sb.append(this.a);
            sb.append(", imageUri=");
            sb.append(this.b);
            sb.append(", messageKey=");
            sb.append(this.c);
            sb.append(", userNote=");
            sb.append(this.d);
            sb.append(", description=");
            return kwi.a(sb, this.e, ", hashtag=", this.f, ")");
        }
    }

    public static final class d implements dha0 {
        public final Uri a;

        public d(Uri uri) {
            this.a = uri;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            Uri uri = this.a;
            if (uri == null) {
                return 0;
            }
            return uri.hashCode();
        }

        public final String toString() {
            return "SaveImage(imageUri=" + this.a + ")";
        }
    }

    public static final class e implements dha0 {
        public final aga0 a;
        public final String b;
        public final e190 c;
        public final String d;
        public final String e;
        public final String f;
        public final Uri g;
        public final Uri h;
        public final Uri i;
        public final String j;

        public e(aga0 aga0Var, String str, e190 e190Var, String str2, String str3, String str4, Uri uri, Uri uri2, Uri uri3, String str5) {
            aga0Var.getClass();
            str.getClass();
            this.a = aga0Var;
            this.b = str;
            this.c = e190Var;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = uri;
            this.h = uri2;
            this.i = uri3;
            this.j = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && Intrinsics.g(this.b, eVar.b) && this.c == eVar.c && Intrinsics.g(this.d, eVar.d) && Intrinsics.g(this.e, eVar.e) && Intrinsics.g(this.f, eVar.f) && Intrinsics.g(this.g, eVar.g) && Intrinsics.g(this.h, eVar.h) && Intrinsics.g(this.i, eVar.i) && Intrinsics.g(this.j, eVar.j);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31;
            String str = this.d;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Uri uri = this.g;
            int iHashCode5 = (iHashCode4 + (uri == null ? 0 : uri.hashCode())) * 31;
            Uri uri2 = this.h;
            int iHashCode6 = (iHashCode5 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
            Uri uri3 = this.i;
            int iHashCode7 = (iHashCode6 + (uri3 == null ? 0 : uri3.hashCode())) * 31;
            String str4 = this.j;
            return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShareReady(platform=");
            sb.append(this.a);
            sb.append(", linkUrl=");
            sb.append(this.b);
            sb.append(", messageKey=");
            sb.append(this.c);
            sb.append(", userNote=");
            sb.append(this.d);
            sb.append(", description=");
            hxa.c(sb, this.e, ", hashtag=", this.f, ", imageUri=");
            sb.append(this.g);
            sb.append(", parserTicketUri=");
            sb.append(this.h);
            sb.append(", parserWonUri=");
            sb.append(this.i);
            sb.append(", quote=");
            sb.append(this.j);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class f implements dha0 {
        public final String a;

        public f(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.g(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("ShareUrlError(errorMessage=", this.a, ")");
        }
    }

    public static final class g implements dha0 {
        public final aga0 a;
        public final String b;
        public final String c;

        public g(aga0 aga0Var, String str, String str2) {
            aga0Var.getClass();
            str2.getClass();
            this.a = aga0Var;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && this.b.equals(gVar.b) && Intrinsics.g(this.c, gVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShareWithGift(platform=");
            sb.append(this.a);
            sb.append(", linkUrl=");
            sb.append(this.b);
            sb.append(", giftId=");
            return uf80.a(sb, this.c, ")");
        }
    }
}
