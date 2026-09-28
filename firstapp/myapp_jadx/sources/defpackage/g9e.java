package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface g9e {

    public static final class a implements g9e {
        public final int a;

        public a(int i) {
            this.a = (i & 2) != 0 ? R.string.common_feedback__something_went_wrong_please_try_again : R.string.page_payment__channel_issue_detected__NG;
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

    public static final class b implements g9e {
        public static final b a = new b();
    }

    public static final class c implements g9e {
        public final int a;
        public final wc8 b;
        public final t5e c;

        public c(int i, wc8 wc8Var, t5e t5eVar) {
            wc8Var.getClass();
            this.a = i;
            this.b = wc8Var;
            this.c = t5eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && Intrinsics.g(this.b, cVar.b) && this.c.equals(cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
        }

        public final String toString() {
            return "PageState(tabIndex=" + this.a + ", depositTab=" + this.b + ", depositPage=" + this.c + ")";
        }
    }
}
