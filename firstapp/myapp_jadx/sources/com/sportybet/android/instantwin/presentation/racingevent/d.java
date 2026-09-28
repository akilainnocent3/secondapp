package com.sportybet.android.instantwin.presentation.racingevent;

import com.appsflyer.internal.p;
import com.sporty.android.permission.location.KN.qUnCRF;
import defpackage.fqk;
import defpackage.ngs;
import defpackage.tug;
import defpackage.u3o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface d {

    public static final class a implements d {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -171918504;
        }

        public final String toString() {
            return "CheckDeviceSecurity";
        }
    }

    public interface b extends d {

        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1883395611;
            }

            public final String toString() {
                return "Back";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.racingevent.d$b$b, reason: collision with other inner class name */
        public static final class C0313b implements b {
            public final String a;

            public C0313b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0313b) && this.a.equals(((C0313b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("NavigateToBetHistoryPage(sportId=", this.a, ")");
            }
        }

        public static final class c implements b {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1744747475;
            }

            public final String toString() {
                return "NavigateToDepositPage";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.racingevent.d$b$d, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes2.dex */
        public static final class C0314d implements b {
            public final fqk a;

            public C0314d(fqk fqkVar) {
                this.a = fqkVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0314d) && this.a.equals(((C0314d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return qUnCRF.HjjyuZwOwrcmZgk + this.a + ")";
            }
        }

        public static final class e implements b {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 415840814;
            }

            public final String toString() {
                return "NavigateToHomePage";
            }
        }

        public static final class f implements b {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 477935480;
            }

            public final String toString() {
                return "NavigateToLoginPage";
            }
        }

        public static final class g implements b {
            public final String a;
            public final u3o b;

            public g(String str, u3o u3oVar) {
                str.getClass();
                u3oVar.getClass();
                this.a = str;
                this.b = u3oVar;
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
                return "NavigateToResultPage(sportId=" + this.a + ", settleRound=" + this.b + ")";
            }
        }

        public static final class h implements b {
            public static final h a = new h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return 785932715;
            }

            public final String toString() {
                return "NavigateToVirtualLobby";
            }
        }
    }

    public static final class c implements d {
        public final List<String> a;

        public c(ngs ngsVar) {
            ngsVar.getClass();
            this.a = ngsVar;
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
            return p.a("PreloadRaceResources(lottieUrls=", ")", this.a);
        }
    }
}
