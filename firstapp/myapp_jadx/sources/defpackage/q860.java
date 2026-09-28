package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface q860 {

    public static final class a implements c {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            str.getClass();
            str3.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // q860.c
        public final String a() {
            return this.c;
        }

        @Override // q860.c
        public final String b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b.equals(aVar.b) && Intrinsics.g(this.c, aVar.c);
        }

        @Override // q860.c
        public final String getTotalStake() {
            return this.a;
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GiftLost(totalStake=");
            sb.append(this.a);
            sb.append(", freeBetGift=");
            sb.append(this.b);
            sb.append(", youPaid=");
            return j26.a(sb, this.c, ')');
        }
    }

    public static final class b implements c {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public b(String str, String str2, String str3, String str4, String str5) {
            wd7.a(str, str3, str4, str5);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        @Override // q860.c
        public final String a() {
            return this.c;
        }

        @Override // q860.c
        public final String b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && this.b.equals(bVar.b) && Intrinsics.g(this.c, bVar.c) && Intrinsics.g(this.d, bVar.d) && Intrinsics.g(this.e, bVar.e);
        }

        @Override // q860.c
        public final String getTotalStake() {
            return this.a;
        }

        public final int hashCode() {
            return this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GiftWin(totalStake=");
            sb.append(this.a);
            sb.append(", freeBetGift=");
            sb.append(this.b);
            sb.append(", youPaid=");
            sb.append(this.c);
            sb.append(", totalWin=");
            sb.append(this.d);
            sb.append(", youWon=");
            return j26.a(sb, this.e, ')');
        }
    }

    public interface c extends q860 {
        String a();

        String b();

        String getTotalStake();
    }

    public static final class d implements q860 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1011360053;
        }

        public final String toString() {
            return "NoGift";
        }
    }
}
