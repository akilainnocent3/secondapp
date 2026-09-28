package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface llv {

    public static final class a implements d {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        @Override // llv.d
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("AwayWin(teamNameText=", this.a, ")");
        }
    }

    public static final class b implements llv {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1093347285;
        }

        public final String toString() {
            return "Draw";
        }
    }

    public static final class c implements d {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        @Override // llv.d
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("HomeWin(teamNameText=", this.a, ")");
        }
    }

    public interface d extends llv {
        String a();
    }
}
