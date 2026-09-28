package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface sp7 {

    public static final class a implements sp7 {
        public final Throwable a;

        public a(int i, Throwable th) {
            this.a = (i & 1) != 0 ? null : th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            Throwable th = this.a;
            return (th == null ? 0 : th.hashCode()) * 31;
        }

        public final String toString() {
            return kox.a("Error(error=", ", errorText=null)", this.a);
        }
    }

    public static final class b implements sp7 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -762789880;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements sp7 {
        public final ArrayList a;

        public c(ArrayList arrayList) {
            this.a = arrayList;
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
            return "Success(claimedContents=" + this.a + ")";
        }
    }
}
