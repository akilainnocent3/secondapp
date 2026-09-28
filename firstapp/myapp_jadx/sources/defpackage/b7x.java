package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface b7x {

    public static final class b implements b7x {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 420972536;
        }

        public final String toString() {
            return "Init";
        }
    }

    public static final class a implements b7x {
        public final int a;
        public final qcn<f7x> b;
        public final boolean c;

        public a(int i, qcn<f7x> qcnVar, boolean z) {
            qcnVar.getClass();
            this.a = i;
            this.b = qcnVar;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.g(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + shu.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HasData(offset=");
            sb.append(this.a);
            sb.append(", list=");
            sb.append(this.b);
            sb.append(", isEnded=");
            return ruw.a(sb, this.c, ')');
        }

        public a() {
            this(0, n1a0.c, false);
        }
    }
}
