package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface kxq {

    public interface a extends kxq {
        zxq a();
    }

    public static final class b implements a {
        public final int a;
        public final qcn<j58> b;
        public final zxq c;

        public b(int i, qcn<j58> qcnVar, zxq zxqVar) {
            zxqVar.getClass();
            this.a = i;
            this.b = qcnVar;
            this.c = zxqVar;
        }

        @Override // kxq.a
        public final zxq a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c);
        }

        @Override // defpackage.kxq
        public final int getNumber() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.a) * 31;
            qcn<j58> qcnVar = this.b;
            return this.c.hashCode() + ((iHashCode + (qcnVar == null ? 0 : qcnVar.hashCode())) * 31);
        }

        public final String toString() {
            return "Cold(number=" + this.a + ", colors=" + this.b + ", clickedAction=" + this.c + ")";
        }
    }

    public static final class c implements kxq {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        @Override // defpackage.kxq
        public final int getNumber() {
            return this.a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "Disabled(number=", ")");
        }
    }

    public static final class d implements a {
        public final int a;
        public final qcn<j58> b;
        public final zxq c;

        public d(int i, qcn<j58> qcnVar, zxq zxqVar) {
            zxqVar.getClass();
            this.a = i;
            this.b = qcnVar;
            this.c = zxqVar;
        }

        @Override // kxq.a
        public final zxq a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && Intrinsics.g(this.b, dVar.b) && Intrinsics.g(this.c, dVar.c);
        }

        @Override // defpackage.kxq
        public final int getNumber() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.a) * 31;
            qcn<j58> qcnVar = this.b;
            return this.c.hashCode() + ((iHashCode + (qcnVar == null ? 0 : qcnVar.hashCode())) * 31);
        }

        public final String toString() {
            return "Hot(number=" + this.a + ", colors=" + this.b + ", clickedAction=" + this.c + ")";
        }
    }

    public static final class e implements a {
        public final int a;
        public final qcn<j58> b;
        public final zxq c;

        public e(int i, qcn<j58> qcnVar, zxq zxqVar) {
            zxqVar.getClass();
            this.a = i;
            this.b = qcnVar;
            this.c = zxqVar;
        }

        @Override // kxq.a
        public final zxq a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && Intrinsics.g(this.b, eVar.b) && Intrinsics.g(this.c, eVar.c);
        }

        @Override // defpackage.kxq
        public final int getNumber() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.a) * 31;
            qcn<j58> qcnVar = this.b;
            return this.c.hashCode() + ((iHashCode + (qcnVar == null ? 0 : qcnVar.hashCode())) * 31);
        }

        public final String toString() {
            return "Normal(number=" + this.a + ", colors=" + this.b + ", clickedAction=" + this.c + ")";
        }
    }

    public static final class f implements a {
        public final int a;
        public final qcn<j58> b;
        public final zxq c;

        public f(int i, qcn<j58> qcnVar, zxq zxqVar) {
            zxqVar.getClass();
            this.a = i;
            this.b = qcnVar;
            this.c = zxqVar;
        }

        @Override // kxq.a
        public final zxq a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && Intrinsics.g(this.b, fVar.b) && Intrinsics.g(this.c, fVar.c);
        }

        @Override // defpackage.kxq
        public final int getNumber() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.a) * 31;
            qcn<j58> qcnVar = this.b;
            return this.c.hashCode() + ((iHashCode + (qcnVar == null ? 0 : qcnVar.hashCode())) * 31);
        }

        public final String toString() {
            return "Selected(number=" + this.a + ", colors=" + this.b + ", clickedAction=" + this.c + ")";
        }
    }

    int getNumber();
}
