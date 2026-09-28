package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface hdi {

    public static final class a implements hdi {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
        }

        @Override // defpackage.hdi
        public final String a() {
            return this.a;
        }

        @Override // defpackage.hdi
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
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("NonLeading(homeTeamScoreText=", this.a, ", awayTeamScoreText=", this.b, ")");
        }
    }

    public static final class b implements hdi {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // defpackage.hdi
        public final String a() {
            return this.a;
        }

        @Override // defpackage.hdi
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
            return this.a.equals(bVar.a) && this.b.equals(bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("None(homeTeamScoreText=", this.a, ", awayTeamScoreText=", this.b, ")");
        }
    }

    String a();

    String b();
}
