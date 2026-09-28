package defpackage;

import com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckResultTypeDto;
import com.sportybet.plugin.realsports.betslip.liabilitycheck.domain.model.LiabilityCheckSelection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface j8s {

    public static final class a implements j8s {
        public final m8s a;

        public a(m8s m8sVar) {
            this.a = m8sVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Accepted(liabilityCheckSource=" + this.a + ")";
        }
    }

    public static final class b implements j8s {
        public final m8s a;
        public final LiabilityCheckResultTypeDto b;
        public final List<LiabilityCheckSelection> c;

        public b(m8s m8sVar, LiabilityCheckResultTypeDto liabilityCheckResultTypeDto, List<LiabilityCheckSelection> list) {
            liabilityCheckResultTypeDto.getClass();
            list.getClass();
            this.a = m8sVar;
            this.b = liabilityCheckResultTypeDto;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && Intrinsics.g(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RejectedByBetOrMarket(liabilityCheckSource=");
            sb.append(this.a);
            sb.append(", type=");
            sb.append(this.b);
            sb.append(", rejectedSelections=");
            return ng1.a(sb, this.c, ")");
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class c implements j8s {
        public final m8s a;
        public final String b;
        public final boolean c;
        public final List<LiabilityCheckSelection> d;
        public final boolean e;
        public final boolean f;

        public c(m8s m8sVar, String str, boolean z, List<LiabilityCheckSelection> list, boolean z2, boolean z3) {
            this.a = m8sVar;
            this.b = str;
            this.c = z;
            this.d = list;
            this.e = z2;
            this.f = z3;
        }

        public static c a(c cVar, boolean z) {
            return new c(cVar.a, cVar.b, cVar.c, cVar.d, z, cVar.f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && Intrinsics.g(this.b, cVar.b) && this.c == cVar.c && this.d.equals(cVar.d) && this.e == cVar.e && this.f == cVar.f;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return Boolean.hashCode(this.f) + mtg0.a(ai50.a(mtg0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RejectedByBookingCode(liabilityCheckSource=");
            sb.append(this.a);
            sb.append(", bookingCode=");
            sb.append(this.b);
            sb.append(", allowMultiMaker=");
            sb.append(this.c);
            sb.append(", selectionsSnapshot=");
            sb.append(this.d);
            sb.append(", isChangedSelectionsPassedCheck=");
            return lng.a(", isSmartRemixAvailable=", ")", sb, this.e, this.f);
        }
    }

    public static final class d implements j8s {
        public final m8s a;
        public final Throwable b;

        public d(m8s m8sVar) {
            this.a = m8sVar;
            this.b = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && Intrinsics.g(this.b, dVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Throwable th = this.b;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        public final String toString() {
            return "WithException(liabilityCheckSource=" + this.a + ", throwable=" + this.b + ")";
        }

        public d(m8s m8sVar, Throwable th) {
            this.a = m8sVar;
            this.b = th;
        }
    }
}
