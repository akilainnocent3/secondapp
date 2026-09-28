package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h3d0 {
    public final f2d0 a;
    public final r3d0 b;
    public final a c;
    public final a d;

    public static final class a {
        public final String a;
        public final String b;
        public final int c;
        public final qcn<AbstractC0619a> d;

        /* JADX INFO: renamed from: h3d0$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0619a {
            public final String a;
            public final int b;
            public final int c;
            public final Integer d;
            public final Integer e;
            public final Integer f;

            /* JADX INFO: renamed from: h3d0$a$a$a, reason: collision with other inner class name */
            public static final class C0620a extends AbstractC0619a {
                public final int g;

                public C0620a(int i) {
                    super(String.valueOf(i), R.color.transparent, 0, null, 26);
                    this.g = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0620a) && this.g == ((C0620a) obj).g;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.g);
                }

                public final String toString() {
                    return pe4.b(this.g, "Missed(kickNumber=", ")");
                }
            }

            /* JADX INFO: renamed from: h3d0$a$a$b */
            public static final class b extends AbstractC0619a {
                public final int g;

                public b(int i) {
                    super(String.valueOf(i), R.color.bg_inverse_secondary, 0, null, 122);
                    this.g = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && this.g == ((b) obj).g;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.g);
                }

                public final String toString() {
                    return pe4.b(this.g, "NotStarted(kickNumber=", ")");
                }
            }

            /* JADX INFO: renamed from: h3d0$a$a$c */
            public static final class c extends AbstractC0619a {
                public final int g;

                public c(int i) {
                    super(String.valueOf(i), R.color.transparent, R.color.bg_brand_sub_quaternary, 3, 98);
                    this.g = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && this.g == ((c) obj).g;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.g);
                }

                public final String toString() {
                    return pe4.b(this.g, "Scored(kickNumber=", ")");
                }
            }

            /* JADX INFO: renamed from: h3d0$a$a$d */
            public static final class d extends AbstractC0619a {
                public final int g;

                public d(int i) {
                    super(String.valueOf(i), R.color.bg_inverse_secondary, R.color.text_warning, 1, 98);
                    this.g = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof d) && this.g == ((d) obj).g;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.g);
                }

                public final String toString() {
                    return pe4.b(this.g, "Shooting(kickNumber=", ")");
                }
            }

            public AbstractC0619a(String str, int i, int i2, Integer num, int i3) {
                Integer numValueOf = Integer.valueOf(R.drawable.ic__cancel);
                Integer numValueOf2 = Integer.valueOf(R.color.bg_brand_main_primary);
                i2 = (i3 & 8) != 0 ? R.color.transparent : i2;
                num = (i3 & 16) != 0 ? null : num;
                numValueOf = (i3 & 32) != 0 ? null : numValueOf;
                numValueOf2 = (i3 & 64) != 0 ? null : numValueOf2;
                this.a = str;
                this.b = i;
                this.c = i2;
                this.d = num;
                this.e = numValueOf;
                this.f = numValueOf2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, String str2, int i, qcn<? extends AbstractC0619a> qcnVar) {
            qcnVar.getClass();
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = qcnVar;
        }

        public static a a(a aVar, int i, qcn qcnVar, int i2) {
            String str = aVar.a;
            String str2 = aVar.b;
            if ((i2 & 4) != 0) {
                i = aVar.c;
            }
            aVar.getClass();
            qcnVar.getClass();
            return new a(str, str2, i, qcnVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c == aVar.c && Intrinsics.g(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("TeamState(name=", this.a, ", logoUrl=", this.b, ", score=");
            sbA.append(this.c);
            sbA.append(", scoreSequence=");
            sbA.append(this.d);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public h3d0(f2d0 f2d0Var, r3d0 r3d0Var, a aVar, a aVar2) {
        f2d0Var.getClass();
        r3d0Var.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.a = f2d0Var;
        this.b = r3d0Var;
        this.c = aVar;
        this.d = aVar2;
    }

    public static h3d0 a(f2d0 f2d0Var, r3d0 r3d0Var, a aVar, a aVar2) {
        f2d0Var.getClass();
        r3d0Var.getClass();
        aVar.getClass();
        aVar2.getClass();
        return new h3d0(f2d0Var, r3d0Var, aVar, aVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3d0)) {
            return false;
        }
        h3d0 h3d0Var = (h3d0) obj;
        return this.a == h3d0Var.a && this.b == h3d0Var.b && Intrinsics.g(this.c, h3d0Var.c) && Intrinsics.g(this.d, h3d0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SportyPenaltySettlementScorePanelState(kickingStage=" + this.a + ", kickingTeam=" + this.b + ", teamLeftState=" + this.c + ", teamRightState=" + this.d + ")";
    }
}
