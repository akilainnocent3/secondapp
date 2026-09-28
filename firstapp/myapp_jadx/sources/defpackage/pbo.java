package defpackage;

import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;

/* JADX INFO: loaded from: classes5.dex */
public interface pbo {

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a implements pbo {
        public final nbo a;

        public a(nbo nboVar) {
            this.a = nboVar;
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
            return "Failure(error=" + this.a + CaxEybC.WAnmwK;
        }
    }

    public static final class b implements pbo {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -51882536;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements pbo {
        public final obo a;

        public c(obo oboVar) {
            this.a = oboVar;
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
            return "Success(result=" + this.a + ")";
        }
    }
}
