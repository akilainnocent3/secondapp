package defpackage;

import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface jae0<T> {

    public static final class a<T> implements jae0<T> {
        public final anf0<? extends T> a;
        public final Throwable b;

        public a(anf0<? extends T> anf0Var, Throwable th) {
            anf0Var.getClass();
            th.getClass();
            this.a = anf0Var;
            this.b = th;
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

        @Override // defpackage.jae0
        public final anf0<? extends T> getValue() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ErrorString(value=" + this.a + ", error=" + this.b + ")";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class b<T> implements jae0<T> {
        public final anf0<? extends T> a;

        public b(anf0<? extends T> anf0Var) {
            anf0Var.getClass();
            this.a = anf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        @Override // defpackage.jae0
        public final anf0<? extends T> getValue() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oLsIjJCWb.NMVGr + this.a + ")";
        }
    }

    public static final class c<T> implements jae0<T> {
        public final anf0<? extends T> a;
        public final long b;

        public c(anf0<? extends T> anf0Var, long j) {
            anf0Var.getClass();
            this.a = anf0Var;
            this.b = j;
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

        @Override // defpackage.jae0
        public final anf0<? extends T> getValue() {
            return this.a;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "RemoteString(value=" + this.a + ", version=" + this.b + ")";
        }
    }

    anf0<? extends T> getValue();
}
