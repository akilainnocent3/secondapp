package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface jse {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final c b = new c();
    }

    public static final class b implements jse {
        public final String b;
        public final String c;

        public b(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // defpackage.jse
        public final String a() {
            return this.c;
        }

        @Override // defpackage.jse
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
            return this.b.equals(bVar.b) && this.c.equals(bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("Selected(startDateUiText=", this.b, ", endDateUiText=", this.c, ")");
        }
    }

    public static final class c implements jse {
        @Override // defpackage.jse
        public final String a() {
            return "";
        }

        @Override // defpackage.jse
        public final String b() {
            return "";
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Unselected(startDateUiText=, endDateUiText=)";
        }
    }

    String a();

    String b();
}
