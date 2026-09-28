package com.sportybet.android.instantwin.presentation.footballfamilysettlement;

import com.sportybet.android.instantwin.newtork.model.response.Round;
import defpackage.tug;
import defpackage.tx5;
import defpackage.tzx;

/* JADX INFO: loaded from: classes5.dex */
public interface b {

    public static final class a implements b {
        public final String a;
        public final Round b;

        public a(String str, Round round) {
            this.a = str;
            this.b = round;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DisplayShowOffDialog(sportId=" + this.a + ", networkRound=" + this.b + ")";
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.footballfamilysettlement.b$b, reason: collision with other inner class name */
    public interface InterfaceC0270b extends b {

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.footballfamilysettlement.b$b$a */
        public static final class a implements InterfaceC0270b {
            public final String a;

            public a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a.equals(((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("NavigateToBetHistoryPage(sportId=", this.a, ")");
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.footballfamilysettlement.b$b$b, reason: collision with other inner class name */
        public static final class C0271b implements InterfaceC0270b {
            public final String a;
            public final boolean b;

            public C0271b(String str, boolean z) {
                this.a = str;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0271b)) {
                    return false;
                }
                C0271b c0271b = (C0271b) obj;
                return this.a.equals(c0271b.a) && this.b == c0271b.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return tzx.a("NavigateToSportEventPage(sportId=", this.a, ", isBetBuilderMode=", ")", this.b);
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.footballfamilysettlement.b$b$c */
        public static final class c implements InterfaceC0270b {
            public final String a;
            public final String b;

            public c(String str, String str2) {
                this.a = str;
                this.b = str2;
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
                return tx5.a("NavigateToTicketDetailPage(sportId=", this.a, ", ticketId=", this.b, ")");
            }
        }
    }
}
