package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Sports;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface ld5 {

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a implements ld5 {
        public final Sports a;
        public final qcn<cf5> b;

        public a(Sports sports, qcn<cf5> qcnVar) {
            sports.getClass();
            qcnVar.getClass();
            this.a = sports;
            this.b = qcnVar;
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
            return "Content(sportConfig=" + this.a + ", items=" + this.b + ")";
        }
    }

    public static final class b implements ld5 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -483217650;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public static final class c implements ld5 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1444781757;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
