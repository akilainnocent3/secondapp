package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ob30 {

    public static final class a extends ob30 {
        public final ypk a;

        public a(ypk ypkVar) {
            ypkVar.getClass();
            this.a = ypkVar;
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
            return "Gift(state=" + this.a + ")";
        }
    }

    public static final class b extends ob30 {
        public final cov a;

        public b(cov covVar) {
            this.a = covVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Message(state=" + this.a + ")";
        }
    }

    public static final class c extends ob30 {
        public final rv30 a;

        public c(rv30 rv30Var) {
            this.a = rv30Var;
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

        public final String toString() {
            return "Rain(state=" + this.a + ")";
        }
    }

    public static final class d extends ob30 {
        public final wdi0.a a;

        public d(wdi0.a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "VipToasts(state=" + this.a + ")";
        }
    }
}
