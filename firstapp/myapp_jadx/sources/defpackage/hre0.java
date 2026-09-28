package defpackage;

import com.sportygames.newcms.CMSRes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface hre0 {

    public static final class a implements hre0 {
        public final qcn<ure0<? extends gre0>> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(qcn<? extends ure0<? extends gre0>> qcnVar) {
            qcnVar.getClass();
            this.a = qcnVar;
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
            return "AssignAnimations(animations=" + this.a + ')';
        }
    }

    public static final class b implements hre0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1960503618;
        }

        public final String toString() {
            return "OnResultShown";
        }
    }

    public static final class c implements hre0 {
        public final CMSRes a;

        public c(CMSRes cMSRes) {
            cMSRes.getClass();
            this.a = cMSRes;
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
            return "PlaySound(cmsRes=" + this.a + ')';
        }
    }

    public static final class d implements hre0 {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + (Integer.hashCode(0) * 31);
        }

        public final String toString() {
            return "UpdateLoop(channel=0, loop=false)";
        }
    }
}
