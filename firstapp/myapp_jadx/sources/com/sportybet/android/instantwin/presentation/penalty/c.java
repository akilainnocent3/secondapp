package com.sportybet.android.instantwin.presentation.penalty;

import com.appsflyer.internal.p;
import defpackage.fqk;
import defpackage.ngs;
import defpackage.r1d0;
import defpackage.tug;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface c {

    public static final class a implements c {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1727527206;
        }

        public final String toString() {
            return "CheckDeviceSecurity";
        }
    }

    public interface b extends c {

        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -613635351;
            }

            public final String toString() {
                return "Back";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.penalty.c$b$b, reason: collision with other inner class name */
        public static final class C0302b implements b {
            public final String a;

            public C0302b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0302b) && this.a.equals(((C0302b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("NavigateToBetHistoryPage(sportId=", this.a, ")");
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.penalty.c$b$c, reason: collision with other inner class name */
        public static final class C0303c implements b {
            public static final C0303c a = new C0303c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0303c);
            }

            public final int hashCode() {
                return -1314036449;
            }

            public final String toString() {
                return "NavigateToDepositPage";
            }
        }

        public static final class d implements b {
            public final fqk a;

            public d(fqk fqkVar) {
                this.a = fqkVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a.equals(((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "NavigateToGiftPickerPage(giftPickerInput=" + this.a + ")";
            }
        }

        public static final class e implements b {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -2093444;
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
                return 406875370;
            }

            public final String toString() {
                return "NavigateToLoginPage";
            }
        }

        public static final class g implements b {
            public final String a;
            public final r1d0 b;

            public g(String str, r1d0 r1d0Var) {
                r1d0Var.getClass();
                this.a = str;
                this.b = r1d0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return this.a.equals(gVar.a) && Intrinsics.g(this.b, gVar.b);
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
                return 1253072633;
            }

            public final String toString() {
                return "NavigateToVirtualLobby";
            }
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.penalty.c$c, reason: collision with other inner class name */
    public static final class C0304c implements c {
        public final List<String> a;

        public C0304c(ngs ngsVar) {
            ngsVar.getClass();
            this.a = ngsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0304c) && Intrinsics.g(this.a, ((C0304c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return p.a("PreloadRunningResources(lottieUrls=", ")", this.a);
        }
    }
}
