package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface a9r {

    public static final class a implements a9r {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 857728572;
        }

        public final String toString() {
            return "Failed";
        }
    }

    public interface b extends a9r {
    }

    public static final class c implements b {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 50389085;
        }

        public final String toString() {
            return "UploadFailed";
        }
    }

    public static final class d implements b {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a.equals(((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("UploadSuccess(shareLink=", this.a, ")");
        }
    }
}
