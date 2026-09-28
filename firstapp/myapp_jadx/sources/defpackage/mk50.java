package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface mk50<T> {

    public static final class a implements mk50 {
        public final Throwable a;

        public a(Throwable th) {
            th.getClass();
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return vt5.b(new StringBuilder("Failure(throwable="), this.a, ')');
        }
    }

    public static final class b implements mk50 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -372356536;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c<T> implements mk50<T> {
        public final T a;
        public final long b;

        public c() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(Object obj) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.a = obj;
            this.b = jCurrentTimeMillis;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            T t = this.a;
            return Long.hashCode(this.b) + ((t == null ? 0 : t.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(data=");
            sb.append(this.a);
            sb.append(", timestamp=");
            return uvh.a(sb, this.b, ')');
        }
    }
}
