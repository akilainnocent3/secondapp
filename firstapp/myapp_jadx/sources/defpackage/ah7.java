package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ah7 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("CLASSIC_CHIP", 0);
            a = aVar;
            a aVar2 = new a("OVER_UNDER", 1);
            b = aVar2;
            a aVar3 = new a("RANGE", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    public static final class b extends ah7 {
        public final String a;
        public final String b;
        public final String c;

        public b(String str, String str2, String str3) {
            str3.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextMessage(nickname=");
            sb.append(this.a);
            sb.append(", avatar=");
            sb.append(this.b);
            sb.append(", text=");
            return j26.a(sb, this.c, ')');
        }
    }

    public static final class c extends ah7 {
        public final String a;
        public final String b;
        public final boolean c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final double i;
        public final String j;
        public final a k;

        public c(String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, double d, String str8, a aVar) {
            qn4.b(str2, str3, str4, str5, str6);
            str7.getClass();
            str8.getClass();
            aVar.getClass();
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = d;
            this.j = str8;
            this.k = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && this.c == cVar.c && Intrinsics.g(this.d, cVar.d) && Intrinsics.g(this.e, cVar.e) && Intrinsics.g(this.f, cVar.f) && Intrinsics.g(this.g, cVar.g) && Intrinsics.g(this.h, cVar.h) && Double.compare(this.i, cVar.i) == 0 && Intrinsics.g(this.j, cVar.j) && this.k == cVar.k;
        }

        public final int hashCode() {
            return this.k.hashCode() + gmf0.a(nrg0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(mtg0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        }

        public final String toString() {
            return "WinMessage(nickname=" + this.a + ", avatar=" + this.b + ", isBot=" + this.c + ", roundId=" + this.d + ", currency=" + this.e + ", stake=" + this.f + ", payout=" + this.g + ", coefficient=" + this.h + ", rawCoefficient=" + this.i + ", botComment=" + this.j + ", coefficientDisplayType=" + this.k + ')';
        }
    }
}
