package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public interface c0w {

    public static final class a implements c0w {
        public final int a = R.string.common_feedback__something_went_wrong_please_try_again;

        public a(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "Error(errorString=null, errorStringRes=", ")");
        }
    }

    public static final class b implements c0w {
        public static final b a = new b();
    }

    public static final class c implements c0w {
        public static final c a = new c();
    }
}
