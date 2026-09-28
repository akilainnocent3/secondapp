package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface lk50<T> {

    public static final class b implements lk50 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1910722120;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c<T> implements lk50<T> {
        public final T a;
        public final long b;

        public c(T t, long j) {
            this.a = t;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!c.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            return Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            T t = this.a;
            if (t != null) {
                return t.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Success(data=" + this.a + ", timestamp=" + this.b + ")";
        }

        public /* synthetic */ c(Object obj) {
            this(obj, System.currentTimeMillis());
        }
    }

    public static final class a implements lk50 {
        public final Throwable a;
        public final UiText b;

        public a(Throwable th, UiText uiText) {
            th.getClass();
            uiText.getClass();
            this.a = th;
            this.b = uiText;
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
            return "Failure(throwable=" + this.a + ", errorText=" + this.b + ")";
        }

        public a(Throwable th) {
            this(th, vch0.a);
        }
    }
}
