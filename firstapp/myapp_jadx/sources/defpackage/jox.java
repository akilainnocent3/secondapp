package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jox<R> {

    public static final class a<T> extends jox<T> {
        public final T a;

        public a(T t) {
            this.a = t;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            T t = this.a;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        @Override // defpackage.jox
        public final String toString() {
            return aya.b(this.a, "Data(data=", ")");
        }
    }

    public static final class b extends jox {
        public static final b a = new b();
    }

    public static final class c extends jox {
        public final Throwable a;

        public c(Throwable th) {
            th.getClass();
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // defpackage.jox
        public final String toString() {
            return kox.a("Error(throwable=", ")", this.a);
        }
    }

    public static final class d extends jox {
    }

    public static final class e extends jox {
        public static final e a = new e();
    }

    public String toString() {
        if (this instanceof a) {
            return aya.b(((a) this).a, "Data[data=", "]");
        }
        if (this instanceof c) {
            return tug.a("Error[throwable=", ((c) this).a.getMessage(), "]");
        }
        if (this instanceof b) {
            return "Empty";
        }
        if (this instanceof e) {
            return "Loading";
        }
        if (this instanceof d) {
            return "ErrorMessage";
        }
        uhc.a();
        return null;
    }
}
