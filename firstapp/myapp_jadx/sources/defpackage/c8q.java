package defpackage;

import com.sportygames.goldmine.data.dto.oBji.dLRYz;

/* JADX INFO: loaded from: classes6.dex */
public interface c8q {

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a implements c8q {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a(dLRYz.SNQ, ")", this.a);
        }
    }

    public static final class b implements c8q {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -964202534;
        }

        public final String toString() {
            return "Unselected";
        }
    }
}
