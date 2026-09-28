package defpackage;

import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ao90 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final a e;
    public final qeo f;
    public final bo90 g;
    public final np90 h;

    public interface a {

        /* JADX INFO: renamed from: ao90$a$a, reason: collision with other inner class name */
        public interface InterfaceC0080a extends a {

            /* JADX INFO: renamed from: ao90$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes2.dex */
            public static final class C0081a implements InterfaceC0080a {
                public static final C0081a a = new C0081a();

                @Override // ao90.a
                public final String a() {
                    return "0";
                }

                @Override // ao90.a
                public final String b() {
                    return "0";
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0081a);
                }

                public final int hashCode() {
                    return -1500029521;
                }

                public final String toString() {
                    return DZsoPoBl.huhdCqXwwar;
                }
            }

            /* JADX INFO: renamed from: ao90$a$a$b */
            public static final class b implements InterfaceC0080a {
                public final String a;
                public final String b;

                public b(String str, String str2) {
                    str.getClass();
                    str2.getClass();
                    this.a = str;
                    this.b = str2;
                }

                @Override // ao90.a
                public final String a() {
                    return this.a;
                }

                @Override // ao90.a
                public final String b() {
                    return this.b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return tx5.a("Running(homeTeamScoreText=", this.a, ", awayTeamScoreText=", this.b, ")");
                }
            }
        }

        public static final class b implements a {
            public final String a;
            public final String b;

            public b(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.a = str;
                this.b = str2;
            }

            @Override // ao90.a
            public final String a() {
                return this.a;
            }

            @Override // ao90.a
            public final String b() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return tx5.a("NonLeading(homeTeamScoreText=", this.a, ", awayTeamScoreText=", this.b, ")");
            }
        }

        public static final class c implements a {
            public final String a;
            public final String b;

            public c(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // ao90.a
            public final String a() {
                return this.a;
            }

            @Override // ao90.a
            public final String b() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a.equals(cVar.a) && this.b.equals(cVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return tx5.a("None(homeTeamScoreText=", this.a, ", awayTeamScoreText=", this.b, ")");
            }
        }

        String a();

        String b();
    }

    public ao90(String str, String str2, String str3, String str4, a aVar, qeo qeoVar, bo90 bo90Var, np90 np90Var) {
        aVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = aVar;
        this.f = qeoVar;
        this.g = bo90Var;
        this.h = np90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao90)) {
            return false;
        }
        ao90 ao90Var = (ao90) obj;
        return this.a.equals(ao90Var.a) && this.b.equals(ao90Var.b) && this.c.equals(ao90Var.c) && this.d.equals(ao90Var.d) && Intrinsics.g(this.e, ao90Var.e) && Intrinsics.g(this.f, ao90Var.f) && this.g == ao90Var.g && this.h.equals(ao90Var.h);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        qeo qeoVar = this.f;
        int iHashCode2 = (iHashCode + (qeoVar == null ? 0 : qeoVar.hashCode())) * 31;
        bo90 bo90Var = this.g;
        return this.h.hashCode() + ((iHashCode2 + (bo90Var != null ? bo90Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SimulationSettlementEventState(ticketId=", this.a, ", eventId=", this.b, ", homeTeamNameText=");
        hxa.c(sbA, this.c, ", awayTeamNameText=", this.d, ", scoreAnimationState=");
        sbA.append(this.e);
        sbA.append(", footballScoreInfoState=");
        sbA.append(this.f);
        sbA.append(", expansionState=");
        sbA.append(this.g);
        sbA.append(", selectionState=");
        sbA.append(this.h);
        sbA.append(")");
        return sbA.toString();
    }
}
