package com.sportybet.feature.gift.gift.presentation;

import com.sporty.android.core.model.luckywheel.TicketInfo;
import defpackage.c04;
import defpackage.eik;
import defpackage.k00;
import defpackage.tug;
import defpackage.uvk;
import defpackage.z15;
import defpackage.zvk;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface b {

    public static final class a implements b {
        public final List<c04> a;
        public final String b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends c04> list, String str) {
            list.getClass();
            str.getClass();
            this.a = list;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ClickBetNow(applicableCategories=" + this.a + ", giftId=" + this.b + ")";
        }
    }

    /* JADX INFO: renamed from: com.sportybet.feature.gift.gift.presentation.b$b, reason: collision with other inner class name */
    public static final class C0362b implements b {
        public static final C0362b a = new C0362b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0362b);
        }

        public final int hashCode() {
            return 1185948041;
        }

        public final String toString() {
            return "ClickCloseBottomSheet";
        }
    }

    public static final class c implements b {
        public final String a;

        public c(String str) {
            str.getClass();
            this.a = str;
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
            return tug.a("ClickDeposit(url=", this.a, ")");
        }
    }

    public static final class d implements b {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1745141307;
        }

        public final String toString() {
            return "ClickDepositNow";
        }
    }

    public static final class e implements b {
        public final boolean a;
        public final boolean b;

        public e(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "ClickHowToUse(onlyForCasinoGames=" + this.a + ", fromTopAppBar=" + this.b + ")";
        }
    }

    public static final class f implements b {
        public final z15 a;

        public f(z15 z15Var) {
            this.a = z15Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a.equals(((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ClickUseBoostGift(boostGift=" + this.a + ")";
        }
    }

    public static final class g implements b {
        public final eik a;

        public g(eik eikVar) {
            this.a = eikVar;
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
            return "ClickUseGift(gift=" + this.a + ")";
        }
    }

    public static final class h implements b {
        public final TicketInfo a;

        public h(TicketInfo ticketInfo) {
            this.a = ticketInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a.equals(((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ClickUseTicket(ticket=" + this.a + ")";
        }
    }

    public static final class i implements b {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -803837907;
        }

        public final String toString() {
            return "ConfirmDialog";
        }
    }

    public static final class j implements b {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -869288841;
        }

        public final String toString() {
            return "DismissDialog";
        }
    }

    public static final class k implements b {
        public final uvk a;

        public k(uvk uvkVar) {
            this.a = uvkVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.a == ((k) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SelectTab(tab=" + this.a + ")";
        }
    }

    public static final class l implements b {
        public final zvk a;
        public final List<k00> b;

        /* JADX WARN: Multi-variable type inference failed */
        public l(zvk zvkVar, List<? extends k00> list) {
            zvkVar.getClass();
            list.getClass();
            this.a = zvkVar;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return Intrinsics.g(this.a, lVar.a) && Intrinsics.g(this.b, lVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SendTrackingEvent(event=" + this.a + ", platforms=" + this.b + ")";
        }
    }
}
