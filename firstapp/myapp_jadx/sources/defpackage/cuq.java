package defpackage;

import androidx.camera.core.impl.utils.TP.sgwpmp;
import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface cuq {

    public static final class a implements cuq {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 886186753;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public static final class b implements cuq {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 886337468;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class c implements cuq {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1112546832;
        }

        public final String toString() {
            return LxHElgWAiSeM.CIPbKQCoP;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class d implements cuq {
        public final qcn<kwv> a;
        public final ucn<Integer> b;
        public final int c;
        public final int d;

        public d(qcn<kwv> qcnVar, ucn<Integer> ucnVar, int i, int i2) {
            qcnVar.getClass();
            ucnVar.getClass();
            this.a = qcnVar;
            this.b = ucnVar;
            this.c = i;
            this.d = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && Intrinsics.g(this.b, dVar.b) && this.c == dVar.c && this.d == dVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + gpp.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(missions=");
            sb.append(this.a);
            sb.append(", expandedMissionIds=");
            sb.append(this.b);
            sb.append(", ongoingCount=");
            return b7f.a(sb, this.c, sgwpmp.orHsUyHkaRRei, this.d, ")");
        }
    }
}
