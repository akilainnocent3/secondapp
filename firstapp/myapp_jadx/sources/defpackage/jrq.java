package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface jrq {

    public static final class b implements jrq {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("SingleResult(name=", this.a, ")");
        }
    }

    public static final class a implements jrq {
        public final qcn<Integer> a;
        public final qcn<Integer> b;

        public /* synthetic */ a(qcn qcnVar, qcn qcnVar2, int i) {
            this((i & 1) != 0 ? null : qcnVar, (i & 2) != 0 ? null : qcnVar2);
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
            qcn<Integer> qcnVar = this.a;
            int iHashCode = (qcnVar == null ? 0 : qcnVar.hashCode()) * 31;
            qcn<Integer> qcnVar2 = this.b;
            return iHashCode + (qcnVar2 != null ? qcnVar2.hashCode() : 0);
        }

        public final String toString() {
            return "NumberResult(mainBalls=" + this.a + ", bonusBalls=" + this.b + ")";
        }

        public a(qcn<Integer> qcnVar, qcn<Integer> qcnVar2) {
            this.a = qcnVar;
            this.b = qcnVar2;
        }
    }
}
