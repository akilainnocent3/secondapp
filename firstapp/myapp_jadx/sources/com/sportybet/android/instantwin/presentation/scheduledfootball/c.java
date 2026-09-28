package com.sportybet.android.instantwin.presentation.scheduledfootball;

import com.sportybet.android.instantwin.model.scheduledfootball.ScheduledFootballServerTime;
import defpackage.fqk;
import defpackage.tug;
import defpackage.tx5;

/* JADX INFO: loaded from: classes5.dex */
public interface c {

    public static final class a implements c {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -36942401;
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
                return 1447900162;
            }

            public final String toString() {
                return "Back";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootball.c$b$b, reason: collision with other inner class name */
        public static final class C0335b implements b {
            public final String a;

            public C0335b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0335b) && this.a.equals(((C0335b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("NavigateToBetHistoryPage(sportId=", this.a, ")");
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootball.c$b$c, reason: collision with other inner class name */
        public static final class C0336c implements b {
            public static final C0336c a = new C0336c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0336c);
            }

            public final int hashCode() {
                return -1760620250;
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
                return -1738838351;
            }

            public final String toString() {
                return "NavigateToLoginPage";
            }
        }

        public static final class f implements b {
            public final String a;
            public final ScheduledFootballServerTime b;

            public f(String str, ScheduledFootballServerTime scheduledFootballServerTime) {
                this.a = str;
                this.b = scheduledFootballServerTime;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof f) {
                    f fVar = (f) obj;
                    return this.a.equals(fVar.a) && this.b == fVar.b;
                }
                return false;
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "NavigateToOpenBetsPage(sportId=" + this.a + ", serverTime=" + this.b + ")";
            }
        }

        public static final class g implements b {
            public final String a;
            public final String b;

            public g(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return this.a.equals(gVar.a) && this.b.equals(gVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return tx5.a("NavigateToTicketDetailPage(sportId=", this.a, ", ticketId=", this.b, ")");
            }
        }
    }
}
