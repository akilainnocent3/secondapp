package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class nfe0 {

    public static class a<T> implements mfe0<T>, Serializable {
        public final transient Object a = new Object();
        public final mfe0<T> b;
        public volatile transient boolean c;
        public transient T d;

        public a(mfe0<T> mfe0Var) {
            this.b = mfe0Var;
        }

        @Override // defpackage.mfe0
        public final T get() {
            if (!this.c) {
                synchronized (this.a) {
                    try {
                        if (!this.c) {
                            T t = this.b.get();
                            this.d = t;
                            this.c = true;
                            return t;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.d;
        }

        public final String toString() {
            Object obj;
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            if (this.c) {
                obj = "<supplier that returned " + this.d + ">";
            } else {
                obj = this.b;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class b<T> implements mfe0<T> {
        public static final ofe0 d = new ofe0();
        public final Object a = new Object();
        public volatile mfe0<T> b;
        public T c;

        public b(mfe0<T> mfe0Var) {
            this.b = mfe0Var;
        }

        @Override // defpackage.mfe0
        public final T get() {
            mfe0<T> mfe0Var = this.b;
            ofe0 ofe0Var = d;
            if (mfe0Var != ofe0Var) {
                synchronized (this.a) {
                    try {
                        if (this.b != ofe0Var) {
                            T t = this.b.get();
                            this.c = t;
                            this.b = ofe0Var;
                            return t;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.c;
        }

        public final String toString() {
            Object obj = this.b;
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            if (obj == d) {
                obj = "<supplier that returned " + this.c + ">";
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class c<T> implements mfe0<T>, Serializable {
        public final T a;

        public c(T t) {
            this.a = t;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return sgp.a(this.a, ((c) obj).a);
            }
            return false;
        }

        @Override // defpackage.mfe0
        public final T get() {
            return this.a;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a});
        }

        public final String toString() {
            return "Suppliers.ofInstance(" + this.a + ")";
        }
    }

    public static <T> mfe0<T> a(mfe0<T> mfe0Var) {
        if ((mfe0Var instanceof b) || (mfe0Var instanceof a)) {
            return mfe0Var;
        }
        return mfe0Var instanceof Serializable ? new a(mfe0Var) : new b(mfe0Var);
    }
}
