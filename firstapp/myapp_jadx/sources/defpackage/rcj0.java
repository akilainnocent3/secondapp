package defpackage;

import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;

/* JADX INFO: loaded from: classes5.dex */
public interface rcj0 {

    public static final class a implements rcj0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1069814562;
        }

        public final String toString() {
            return "Error";
        }
    }

    public static final class b implements rcj0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -884718634;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class c implements rcj0 {
        public final mdj0 a;

        static {
            int i = mdj0.u;
        }

        public c(mdj0 mdj0Var) {
            this.a = mdj0Var;
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
            return iKBWavCysVP.VetIsnNTYUgO + this.a + ")";
        }
    }
}
