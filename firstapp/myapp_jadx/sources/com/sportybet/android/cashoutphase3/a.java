package com.sportybet.android.cashoutphase3;

import androidx.window.layout.oKr.TEFcJcMqR;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.cashout.AutoCashOut;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.kox;
import defpackage.ml5;
import defpackage.mq0;
import defpackage.pl6;
import defpackage.plf;
import defpackage.tug;
import defpackage.uf80;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.sportybet.android.cashoutphase3.a$a, reason: collision with other inner class name */
    public static final class C0221a extends a {
        public final pl6 a;
        public final AutoCashOut b;

        public C0221a(pl6 pl6Var, AutoCashOut autoCashOut) {
            autoCashOut.getClass();
            this.a = pl6Var;
            this.b = autoCashOut;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0221a)) {
                return false;
            }
            C0221a c0221a = (C0221a) obj;
            return Intrinsics.g(this.a, c0221a.a) && Intrinsics.g(this.b, c0221a.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AutoCashOutSuccess(wrapper=" + this.a + ", data=" + this.b + ")";
        }
    }

    public static final class b extends a {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return tug.a("BetSettledDialogConfirmed(betId=", this.a, ")");
        }
    }

    public static abstract class c extends a {

        /* JADX INFO: renamed from: com.sportybet.android.cashoutphase3.a$c$a, reason: collision with other inner class name */
        public static final class C0222a extends c {
            public final pl6 a;
            public final Throwable b;

            public C0222a(pl6 pl6Var, Throwable th) {
                th.getClass();
                this.a = pl6Var;
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0222a)) {
                    return false;
                }
                C0222a c0222a = (C0222a) obj;
                return Intrinsics.g(this.a, c0222a.a) && Intrinsics.g(this.b, c0222a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "AutoCashoutInvalidUseStake(wrapper=" + this.a + ", throwable=" + this.b + ")";
            }
        }

        public static final class b extends c {
            public final String a;

            public b(String str) {
                str.getClass();
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("CashoutBetSettled(betId=", this.a, ")");
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.cashoutphase3.a$c$c, reason: collision with other inner class name */
        public static final class C0223c extends c {
            public final pl6 a;
            public final String b;

            public C0223c(pl6 pl6Var, String str) {
                str.getClass();
                this.a = pl6Var;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0223c)) {
                    return false;
                }
                C0223c c0223c = (C0223c) obj;
                return Intrinsics.g(this.a, c0223c.a) && Intrinsics.g(this.b, c0223c.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "CashoutCurrentOdds(wrapper=" + this.a + ", message=" + this.b + ")";
            }
        }

        public static final class d extends c {
            public final Throwable a;

            public d(Throwable th) {
                th.getClass();
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return kox.a("CashoutFallbackFail(throwable=", ")", this.a);
            }
        }

        public static final class e extends c {
            public final pl6 a;

            public e(pl6 pl6Var) {
                this.a = pl6Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && Intrinsics.g(this.a, ((e) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "CashoutTimes(wrapper=" + this.a + ")";
            }
        }

        public static final class f extends c {
            public final pl6 a;
            public final Throwable b;
            public final UiText c;

            public f(pl6 pl6Var, Throwable th, UiText uiText) {
                th.getClass();
                uiText.getClass();
                this.a = pl6Var;
                this.b = th;
                this.c = uiText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Intrinsics.g(this.a, fVar.a) && Intrinsics.g(this.b, fVar.b) && Intrinsics.g(this.c, fVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CashoutWrongAmount(wrapper=");
                sb.append(this.a);
                sb.append(", throwable=");
                sb.append(this.b);
                sb.append(", errorText=");
                return plf.a(sb, this.c, ")");
            }
        }

        public static final class g extends c {
            public final Throwable a;
            public final UiText b;

            public g(Throwable th, UiText uiText) {
                th.getClass();
                uiText.getClass();
                this.a = th;
                this.b = uiText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return Intrinsics.g(this.a, gVar.a) && Intrinsics.g(this.b, gVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "DefaultError(throwable=" + this.a + ", errorText=" + this.b + ")";
            }
        }
    }

    public static abstract class d extends a {

        /* JADX INFO: renamed from: com.sportybet.android.cashoutphase3.a$d$a, reason: collision with other inner class name */
        public static final class C0224a extends d {
            public final String a;
            public final int b;
            public final String c;
            public final String d;
            public final boolean e;

            public C0224a(String str, String str2, String str3, int i, boolean z) {
                str2.getClass();
                str3.getClass();
                this.a = str;
                this.b = i;
                this.c = str2;
                this.d = str3;
                this.e = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0224a)) {
                    return false;
                }
                C0224a c0224a = (C0224a) obj;
                return Intrinsics.g(this.a, c0224a.a) && this.b == c0224a.b && Intrinsics.g(this.c, c0224a.c) && Intrinsics.g(this.d, c0224a.d) && this.e == c0224a.e;
            }

            public final int hashCode() {
                String str = this.a;
                return Boolean.hashCode(this.e) + gmf0.a(gmf0.a(gpp.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.c), 31, this.d);
            }

            public final String toString() {
                StringBuilder sbA = ml5.a(this.b, "MultipleRebet(betId=", this.a, ", partialLeft=", ", currencyAmount=");
                hxa.c(sbA, this.c, ", shareCode=", this.d, ", canRebetSim=");
                return mq0.a(sbA, this.e, ")");
            }
        }

        public static final class b extends d {
            public final String a;
            public final int b;
            public final String c;

            public b(String str, int i, String str2) {
                this.a = str;
                this.b = i;
                this.c = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b && Intrinsics.g(this.c, bVar.c);
            }

            public final int hashCode() {
                String str = this.a;
                return this.c.hashCode() + gpp.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
            }

            public final String toString() {
                return uf80.a(ml5.a(this.b, "NoRebet(betId=", this.a, ", partialLeft=", ", currencyAmount="), this.c, ")");
            }
        }

        /* JADX INFO: loaded from: classes2.dex */
        public static final class c extends d {
            public final String a;
            public final int b;
            public final String c;
            public final String d;
            public final String e;
            public final String f;
            public final String g;
            public final String h;
            public final String i;
            public final String j;
            public final boolean k;

            public c(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
                this.a = str;
                this.b = i;
                this.c = str2;
                this.d = str3;
                this.e = str4;
                this.f = str5;
                this.g = str6;
                this.h = str7;
                this.i = str8;
                this.j = str9;
                this.k = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.g(this.a, cVar.a) && this.b == cVar.b && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d) && Intrinsics.g(this.e, cVar.e) && Intrinsics.g(this.f, cVar.f) && Intrinsics.g(this.g, cVar.g) && Intrinsics.g(this.h, cVar.h) && Intrinsics.g(this.i, cVar.i) && Intrinsics.g(this.j, cVar.j) && this.k == cVar.k;
            }

            public final int hashCode() {
                String str = this.a;
                int iA = gmf0.a(gpp.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.c);
                String str2 = this.d;
                int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.e;
                int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f;
                int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.g;
                int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.h;
                int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.i;
                int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.j;
                return Boolean.hashCode(this.k) + ((iHashCode6 + (str8 != null ? str8.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sbA = ml5.a(this.b, "SingleRebet(betId=", this.a, ", partialLeft=", TEFcJcMqR.Jaw);
                hxa.c(sbA, this.c, ", eventId=", this.d, ", homeTeam=");
                hxa.c(sbA, this.e, ", awayTeam=", this.f, ", tournamentName=");
                hxa.c(sbA, this.g, ", marketId=", this.h, ", specifier=");
                hxa.c(sbA, this.i, ", sportId=", this.j, ", isLive=");
                return mq0.a(sbA, this.k, ")");
            }
        }
    }

    public static final class e extends a {
        public final pl6 a;

        public e(pl6 pl6Var) {
            this.a = pl6Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.g(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DeleteAutoCashOutSuccess(wrapper=" + this.a + ")";
        }
    }
}
