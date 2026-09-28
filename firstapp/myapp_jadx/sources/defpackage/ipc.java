package defpackage;

import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import com.sportygames.fruithunt.network.models.FHBetHistoryItem;
import com.sportygames.spindabottle.remote.models.BetHistoryItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ipc {

    public static final class a extends ipc {
        public static final a a = new a();
        public static final long b = Long.MAX_VALUE;

        @Override // defpackage.ipc
        public final long a() {
            return b;
        }
    }

    public static final class b extends ipc {
        public final BetHistoryItem a;
        public final long b;

        public b(BetHistoryItem betHistoryItem) {
            betHistoryItem.getClass();
            this.a = betHistoryItem;
            this.b = betHistoryItem.getId();
        }

        @Override // defpackage.ipc
        public final long a() {
            return this.b;
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
            return "BetHistoryBottleTypeItem(betHistoryItem=" + this.a + ")";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class c extends ipc {
        public final com.sportygames.crashInitiated.model.response.BetHistoryItem a;
        public final long b;

        public c(com.sportygames.crashInitiated.model.response.BetHistoryItem betHistoryItem) {
            betHistoryItem.getClass();
            this.a = betHistoryItem;
            this.b = betHistoryItem.getId();
        }

        @Override // defpackage.ipc
        public final long a() {
            return this.b;
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
            return iKBWavCysVP.EfeSjcq + this.a + ")";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class d extends ipc {
        public final com.sportygames.crash.remote.models.BetHistoryItem a;
        public final long b;

        public d(com.sportygames.crash.remote.models.BetHistoryItem betHistoryItem) {
            betHistoryItem.getClass();
            this.a = betHistoryItem;
            this.b = betHistoryItem.getId();
        }

        @Override // defpackage.ipc
        public final long a() {
            return this.b;
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
            return xOgHBQVl.iziS + this.a + ")";
        }
    }

    public static final class e extends ipc {
        public final com.sportygames.evenodd.remote.models.BetHistoryItem a;
        public final long b;

        public e(com.sportygames.evenodd.remote.models.BetHistoryItem betHistoryItem) {
            betHistoryItem.getClass();
            this.a = betHistoryItem;
            this.b = betHistoryItem.getId();
        }

        @Override // defpackage.ipc
        public final long a() {
            return this.b;
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
            return "BetHistoryEvenOddTypeItem(betHistoryItem=" + this.a + ")";
        }
    }

    public static final class f extends ipc {
        public final com.sportygames.sportyherov2.remote.models.BetHistoryItem a;
        public final long b;

        public f(com.sportygames.sportyherov2.remote.models.BetHistoryItem betHistoryItem) {
            betHistoryItem.getClass();
            this.a = betHistoryItem;
            this.b = betHistoryItem.getId();
        }

        @Override // defpackage.ipc
        public final long a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.g(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "BetHistoryHeroTypeItem(betHistoryItem=" + this.a + ")";
        }
    }

    public static final class g extends ipc {
        public final com.sportygames.pingpong.remote.models.BetHistoryItem a;
        public final long b;

        public g(com.sportygames.pingpong.remote.models.BetHistoryItem betHistoryItem) {
            betHistoryItem.getClass();
            this.a = betHistoryItem;
            this.b = betHistoryItem.getId();
        }

        @Override // defpackage.ipc
        public final long a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.g(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "BetHistoryPingPongTypeItem(betHistoryItem=" + this.a + ")";
        }
    }

    public static final class h extends ipc {
        public final com.sportygames.redblack.remote.models.BetHistoryItem a;
        public final long b;

        public h(com.sportygames.redblack.remote.models.BetHistoryItem betHistoryItem) {
            betHistoryItem.getClass();
            this.a = betHistoryItem;
            this.b = betHistoryItem.getId();
        }

        @Override // defpackage.ipc
        public final long a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.g(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "BetHistoryRedBlackTypeItem(betHistoryItem=" + this.a + ")";
        }
    }

    public static final class i extends ipc {
        public final com.sportygames.pocketrocket.model.response.BetHistoryItem a;
        public final long b;

        public i(com.sportygames.pocketrocket.model.response.BetHistoryItem betHistoryItem) {
            betHistoryItem.getClass();
            this.a = betHistoryItem;
            this.b = betHistoryItem.getId();
        }

        @Override // defpackage.ipc
        public final long a() {
            return this.b;
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
            return "BetHistoryRocketTypeItem(betHistoryItem=" + this.a + ")";
        }
    }

    public static final class j extends ipc {
        public final com.sportygames.rush.model.response.BetHistoryItem a;
        public final long b;

        public j(com.sportygames.rush.model.response.BetHistoryItem betHistoryItem) {
            betHistoryItem.getClass();
            this.a = betHistoryItem;
            this.b = betHistoryItem.getId();
        }

        @Override // defpackage.ipc
        public final long a() {
            return this.b;
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
            return "BetHistoryRushTypeItem(betHistoryItem=" + this.a + ")";
        }
    }

    public static final class k extends ipc {
        public final com.sportygames.spin2win.model.BetHistoryItem a;
        public final long b;

        public k(com.sportygames.spin2win.model.BetHistoryItem betHistoryItem) {
            betHistoryItem.getClass();
            this.a = betHistoryItem;
            this.b = betHistoryItem.getId();
        }

        @Override // defpackage.ipc
        public final long a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && Intrinsics.g(this.a, ((k) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "BetHistorySpin2WinTypeItem(betHistoryItem=" + this.a + ")";
        }
    }

    public static final class l extends ipc {
        public final com.sportygames.spinmatch.model.response.BetHistoryItem a;
        public final long b;

        public l(com.sportygames.spinmatch.model.response.BetHistoryItem betHistoryItem) {
            betHistoryItem.getClass();
            this.a = betHistoryItem;
            this.b = betHistoryItem.getId();
        }

        @Override // defpackage.ipc
        public final long a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Intrinsics.g(this.a, ((l) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "BetHistorySpinMatchTypeItem(betHistoryItem=" + this.a + ")";
        }
    }

    public static final class m extends ipc {
        public final FHBetHistoryItem a;
        public final long b;

        public m(FHBetHistoryItem fHBetHistoryItem) {
            fHBetHistoryItem.getClass();
            this.a = fHBetHistoryItem;
            this.b = fHBetHistoryItem.getId();
        }

        @Override // defpackage.ipc
        public final long a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && Intrinsics.g(this.a, ((m) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "FHBetHistoryTypeItem(betHistoryItem=" + this.a + ")";
        }
    }

    public static final class n extends ipc {
        public static final n a = new n();
        public static final long b = 9223372036854775806L;

        @Override // defpackage.ipc
        public final long a() {
            return b;
        }
    }

    public abstract long a();
}
