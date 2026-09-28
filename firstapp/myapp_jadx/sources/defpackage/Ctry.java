package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: try, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class Ctry {
    public static final Ctry d = new Ctry(false, new a(null, "", "", ""), null);
    public final boolean a;
    public final a b;
    public final b c;

    /* JADX INFO: renamed from: try$a */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public a(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d);
        }

        public final int hashCode() {
            String str = this.a;
            return this.d.hashCode() + gmf0.a(gmf0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return kwi.a(ux5.a("Banner(iconUrl=", this.a, ", title=", this.b, ", description="), this.c, ", learnMoreText=", this.d, ")");
        }
    }

    /* JADX INFO: renamed from: try$b */
    public static final class b {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public b(String str, String str2, String str3, String str4, String str5) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d) && this.e.equals(bVar.e);
        }

        public final int hashCode() {
            String str = this.a;
            return this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("BottomSheetContent(logoUrl=", this.a, ", title=", this.b, ", benefit=");
            hxa.c(sbA, this.c, ", legalDescription=", this.d, ", registrationNumber=");
            return uf80.a(sbA, this.e, ")");
        }
    }

    public Ctry(boolean z, a aVar, b bVar) {
        this.a = z;
        this.b = aVar;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ctry)) {
            return false;
        }
        Ctry ctry = (Ctry) obj;
        return this.a == ctry.a && this.b.equals(ctry.b) && Intrinsics.g(this.c, ctry.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        b bVar = this.c;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "OneTimeBankPromotion(enabled=" + this.a + ", banner=" + this.b + ", bottomSheetContent=" + this.c + ")";
    }
}
