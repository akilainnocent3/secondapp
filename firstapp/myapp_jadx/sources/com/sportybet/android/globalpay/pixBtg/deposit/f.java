package com.sportybet.android.globalpay.pixBtg.deposit;

import defpackage.af10;
import defpackage.kme;
import defpackage.n1a0;
import defpackage.nrg0;
import defpackage.qpi;
import defpackage.s610;
import defpackage.shl;
import defpackage.uf00;
import defpackage.yvz;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface f {

    public static final class a implements f {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1123874882;
        }

        public final String toString() {
            return "ComingSoonPlaceholderState";
        }
    }

    public static final class b implements f {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1790953745;
        }

        public final String toString() {
            return "ErrorState";
        }
    }

    public static final class d implements f {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1874284637;
        }

        public final String toString() {
            return "LoadingState";
        }
    }

    public static final class c implements f {
        public final String a;
        public final double b;
        public final shl c;
        public final uf00<af10> d;
        public final Integer e;
        public final s610 f;
        public final qpi g;
        public final kme h;

        public c(shl shlVar, qpi qpiVar, kme kmeVar, int i) {
            this("", 0.0d, (i & 4) != 0 ? new shl(null, null, 63) : shlVar, n1a0.c, null, new s610(0), (i & 64) != 0 ? new qpi(7, false) : qpiVar, (i & 128) != 0 ? new kme(511, false) : kmeVar);
        }

        public static c a(c cVar, String str, double d, shl shlVar, uf00 uf00Var, Integer num, s610 s610Var, qpi qpiVar, kme kmeVar, int i) {
            if ((i & 1) != 0) {
                str = cVar.a;
            }
            String str2 = str;
            if ((i & 2) != 0) {
                d = cVar.b;
            }
            double d2 = d;
            if ((i & 4) != 0) {
                shlVar = cVar.c;
            }
            shl shlVar2 = shlVar;
            if ((i & 8) != 0) {
                uf00Var = cVar.d;
            }
            uf00 uf00Var2 = uf00Var;
            Integer num2 = (i & 16) != 0 ? cVar.e : num;
            s610 s610Var2 = (i & 32) != 0 ? cVar.f : s610Var;
            qpi qpiVar2 = (i & 64) != 0 ? cVar.g : qpiVar;
            kme kmeVar2 = (i & 128) != 0 ? cVar.h : kmeVar;
            cVar.getClass();
            str2.getClass();
            shlVar2.getClass();
            uf00Var2.getClass();
            s610Var2.getClass();
            qpiVar2.getClass();
            kmeVar2.getClass();
            return new c(str2, d2, shlVar2, uf00Var2, num2, s610Var2, qpiVar2, kmeVar2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Double.compare(this.b, cVar.b) == 0 && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d) && Intrinsics.g(this.e, cVar.e) && Intrinsics.g(this.f, cVar.f) && Intrinsics.g(this.g, cVar.g) && Intrinsics.g(this.h, cVar.h);
        }

        public final int hashCode() {
            int iA = yvz.a(this.d, (this.c.hashCode() + nrg0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31);
            Integer num = this.e;
            return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((iA + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "LoadedState(currencySymbol=" + this.a + ", balance=" + this.b + ", headerAndBanks=" + this.c + ", quickInputEntries=" + this.d + ", selectedAmount=" + this.e + ", balanceInfo=" + this.f + ", footerState=" + this.g + ", dialogs=" + this.h + ")";
        }

        public c(String str, double d, shl shlVar, uf00<af10> uf00Var, Integer num, s610 s610Var, qpi qpiVar, kme kmeVar) {
            shlVar.getClass();
            uf00Var.getClass();
            qpiVar.getClass();
            kmeVar.getClass();
            this.a = str;
            this.b = d;
            this.c = shlVar;
            this.d = uf00Var;
            this.e = num;
            this.f = s610Var;
            this.g = qpiVar;
            this.h = kmeVar;
        }

        public c() {
            this(null, null, null, 255);
        }
    }
}
