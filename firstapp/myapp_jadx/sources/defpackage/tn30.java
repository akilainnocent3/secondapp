package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface tn30 {

    public static final class a implements tn30 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -832252761;
        }

        public final String toString() {
            return "Betting";
        }
    }

    public static final class b implements tn30 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 70111336;
        }

        public final String toString() {
            return "Init";
        }
    }

    public static final class c implements tn30 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1590275817;
        }

        public final String toString() {
            return "ResultIdle";
        }
    }

    public static final class d implements tn30 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1474347888;
        }

        public final String toString() {
            return "ResultShowing";
        }
    }

    public static final class e implements tn30 {
        public final ojd<Unit> a;

        public e(ojd<Unit> ojdVar) {
            ojdVar.getClass();
            this.a = ojdVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.g(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Spinning(betJob=" + this.a + ')';
        }
    }
}
