package com.sportybet.android.globalpay.pixBtg.withdraw;

import defpackage.jme;
import defpackage.nrg0;
import defpackage.s610;
import defpackage.shl;
import defpackage.uxs;
import defpackage.y45;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface e {

    public static final class a implements e {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1448522830;
        }

        public final String toString() {
            return "ComingSoonPlaceholderState";
        }
    }

    public static final class b implements e {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1867193629;
        }

        public final String toString() {
            return "ErrorState";
        }
    }

    public static final class d implements e {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1042596096;
        }

        public final String toString() {
            return "LoadingRequiredDataState";
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.globalpay.pixBtg.withdraw.e$e, reason: collision with other inner class name */
    public static final class C0241e implements e {
        public static final C0241e a = new C0241e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0241e);
        }

        public final int hashCode() {
            return -1653523314;
        }

        public final String toString() {
            return "MakeFirstDepositPlaceholderState";
        }
    }

    public static final class f implements e {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -464781617;
        }

        public final String toString() {
            return "PendingFirstDepositPlaceholderState";
        }
    }

    public static final class c implements e {
        public final String a;
        public final double b;
        public final shl c;
        public final s610 d;
        public final uxs e;
        public final jme f;

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ c(shl shlVar, int i) {
            if ((i & 4) != 0) {
                shlVar = new shl(null, 0 == true ? 1 : 0, 63);
            }
            this("", 0.0d, shlVar, new s610(0), uxs.DISABLE, new jme(0));
        }

        public static c a(c cVar, String str, double d, shl shlVar, s610 s610Var, uxs uxsVar, jme jmeVar, int i) {
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
                s610Var = cVar.d;
            }
            s610 s610Var2 = s610Var;
            if ((i & 16) != 0) {
                uxsVar = cVar.e;
            }
            uxs uxsVar2 = uxsVar;
            if ((i & 32) != 0) {
                jmeVar = cVar.f;
            }
            jme jmeVar2 = jmeVar;
            cVar.getClass();
            str2.getClass();
            shlVar2.getClass();
            s610Var2.getClass();
            uxsVar2.getClass();
            jmeVar2.getClass();
            return new c(str2, d2, shlVar2, s610Var2, uxsVar2, jmeVar2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Double.compare(this.b, cVar.b) == 0 && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d) && this.e == cVar.e && Intrinsics.g(this.f, cVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + y45.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + nrg0.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31);
        }

        public final String toString() {
            return "LoadedState(currencySymbol=" + this.a + ", balance=" + this.b + ", headerAndBanks=" + this.c + ", balanceInfo=" + this.d + ", withdrawButtonStatus=" + this.e + ", dialogs=" + this.f + ")";
        }

        public c(String str, double d, shl shlVar, s610 s610Var, uxs uxsVar, jme jmeVar) {
            shlVar.getClass();
            this.a = str;
            this.b = d;
            this.c = shlVar;
            this.d = s610Var;
            this.e = uxsVar;
            this.f = jmeVar;
        }

        public c() {
            this(null, 63);
        }
    }
}
