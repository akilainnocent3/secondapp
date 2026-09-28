package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface f860 {

    public static final class b implements f860 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -828074814;
        }

        public final String toString() {
            return "Init";
        }
    }

    public static final class a implements f860 {
        public final qcn<r860> a;
        public final boolean b;

        public a(qcn<r860> qcnVar, boolean z) {
            qcnVar.getClass();
            this.a = qcnVar;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HasData(list=");
            sb.append(this.a);
            sb.append(", isEnded=");
            return ruw.a(sb, this.b, ')');
        }

        public a() {
            this(n1a0.c, false);
        }
    }
}
