package com.sportybet.feature.gift.gift.presentation;

import com.sporty.android.core.model.luckywheel.TicketInfo;
import defpackage.c04;
import defpackage.tug;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface e {

    public static final class a implements e {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2041265314;
        }

        public final String toString() {
            return "FinishActivity";
        }
    }

    public static final class b implements e {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -831962751;
        }

        public final String toString() {
            return "NavigateToBetslipThemeSection";
        }
    }

    public static final class c implements e {
        public final List<c04> a;
        public final String b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends c04> list, String str) {
            list.getClass();
            str.getClass();
            this.a = list;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "NavigateToBettingProduct(applicableCategories=" + this.a + ", giftId=" + this.b + ")";
        }
    }

    public static final class d implements e {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1099566766;
        }

        public final String toString() {
            return "NavigateToDeposit";
        }
    }

    /* JADX INFO: renamed from: com.sportybet.feature.gift.gift.presentation.e$e, reason: collision with other inner class name */
    public static final class C0364e implements e {
        public static final C0364e a = new C0364e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0364e);
        }

        public final int hashCode() {
            return 1679901880;
        }

        public final String toString() {
            return "NavigateToGameLobby";
        }
    }

    public static final class f implements e {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1999675130;
        }

        public final String toString() {
            return "NavigateToLoyalty";
        }
    }

    public static final class g implements e {
        public final TicketInfo a;

        public g(TicketInfo ticketInfo) {
            this.a = ticketInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a.equals(((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NavigateToLuckyWheel(ticket=" + this.a + ")";
        }
    }

    public static final class h implements e {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 200744744;
        }

        public final String toString() {
            return "NavigateToSport";
        }
    }

    public static final class i implements e {
        public final String a;

        public i(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && Intrinsics.g(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("OpenDeposit(url=", this.a, ")");
        }
    }

    public static final class j implements e {
        public final String a;

        public j(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.g(this.a, ((j) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("OpenHowToUseGift(url=", this.a, ")");
        }
    }
}
