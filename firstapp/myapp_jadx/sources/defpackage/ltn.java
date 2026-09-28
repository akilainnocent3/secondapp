package defpackage;

import com.appsflyer.internal.a0;
import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface ltn {

    public static final class a implements ltn {
        public final boolean a;
        public final int b;
        public final long c;
        public final List<C0836a> d;

        /* JADX INFO: renamed from: ltn$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes2.dex */
        public static final class C0836a {
            public final int a;
            public final int b;
            public final int c;

            public C0836a(int i, int i2, int i3) {
                this.a = i;
                this.b = i2;
                this.c = i3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0836a)) {
                    return false;
                }
                C0836a c0836a = (C0836a) obj;
                return this.a == c0836a.a && this.b == c0836a.b && this.c == c0836a.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + gpp.a(this.b, Integer.hashCode(this.a) * 31, 31);
            }

            public final String toString() {
                return zk1.a(this.c, ")", dy5.a("Ratio(selections=", this.a, this.b, ", min=", siPCzPFw.kqnaInWNxAv));
            }
        }

        public a(boolean z, int i, long j, List<C0836a> list) {
            list.getClass();
            this.a = z;
            this.b = i;
            this.c = j;
            this.d = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && Intrinsics.g(this.d, aVar.d);
        }

        @Override // defpackage.ltn
        public final mtn getValue() {
            return mtn.DYNAMIC_MULTI_BET_BONUS;
        }

        public final int hashCode() {
            return this.d.hashCode() + f87.a(gpp.a(this.b, Boolean.hashCode(this.a) * 31, 31), this.c, 31);
        }

        public final String toString() {
            StringBuilder sbA = zug0.a("DynamicMultiBetBonus(enable=", ", factor=", ", qualifyingOddsLimit=", this.b, this.a);
            sbA.append(this.c);
            sbA.append(", ratios=");
            sbA.append(this.d);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class b implements ltn {
        public final boolean a;
        public final long b;
        public final int c;
        public final int d;
        public final List<a> e;

        public static final class a {
            public final int a;
            public final long b;

            public a(int i, long j) {
                this.a = i;
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sbA = a0.a("Ratio(selections=", ", ratio=", this.a, this.b);
                sbA.append(")");
                return sbA.toString();
            }
        }

        public b(boolean z, long j, int i, int i2, List<a> list) {
            list.getClass();
            this.a = z;
            this.b = j;
            this.c = i;
            this.d = i2;
            this.e = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && Intrinsics.g(this.e, bVar.e);
        }

        @Override // defpackage.ltn
        public final mtn getValue() {
            return mtn.MULTI_BET_BONUS;
        }

        public final int hashCode() {
            return this.e.hashCode() + gpp.a(this.d, gpp.a(this.c, f87.a(Boolean.hashCode(this.a) * 31, this.b, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MultiBetBonus(enable=");
            sb.append(this.a);
            sb.append(", qualifyingOddsLimit=");
            sb.append(this.b);
            sb.append(", minSelections=");
            sb.append(this.c);
            sb.append(", maxSelections=");
            sb.append(this.d);
            return ka1.a(sb, ", ratios=", this.e, ")");
        }
    }

    public static final class c implements ltn {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        @Override // defpackage.ltn
        public final mtn getValue() {
            return mtn.SIMPLE;
        }

        public final int hashCode() {
            return -712141504;
        }

        public final String toString() {
            return "Simple";
        }
    }

    mtn getValue();
}
