package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface wok {

    public static final class a implements wok {
        public final String a;
        public final j25 b;

        public a(String str, j25 j25Var) {
            this.a = str;
            this.b = j25Var;
        }

        @Override // defpackage.wok
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "BoostGift(itemKey=" + this.a + ", uiModel=" + this.b + ")";
        }
    }

    public static final class b implements wok {
        public final String a;
        public final fok b;

        public b(String str, fok fokVar) {
            this.a = str;
            this.b = fokVar;
        }

        @Override // defpackage.wok
        public final String a() {
            return this.a;
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
            return "Gift(itemKey=" + this.a + ", uiModel=" + this.b + ")";
        }
    }

    public static final class c implements wok {
        public final String a;
        public final pqf0 b;

        public c(String str, pqf0 pqf0Var) {
            this.a = str;
            this.b = pqf0Var;
        }

        @Override // defpackage.wok
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b.equals(cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Ticket(itemKey=" + this.a + ", uiModel=" + this.b + ")";
        }
    }

    String a();
}
