package com.sportybet.android.instantwin.presentation.ticketdetail;

import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import defpackage.moo;
import defpackage.tug;
import defpackage.tx5;
import defpackage.v4f;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    public interface a extends b {

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.ticketdetail.b$a$a, reason: collision with other inner class name */
        public static final class C0342a implements a {
            public static final C0342a a = new C0342a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0342a);
            }

            public final int hashCode() {
                return 1255190736;
            }

            public final String toString() {
                return "SendBetHistoryDetailsViewEvent";
            }
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.ticketdetail.b$b, reason: collision with other inner class name */
    public static final class C0343b implements b {
        public final String a;
        public final String b;

        public C0343b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0343b)) {
                return false;
            }
            C0343b c0343b = (C0343b) obj;
            return this.a.equals(c0343b.a) && this.b.equals(c0343b.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("DisplayShowOff(sportId=", this.a, ", ticketId=", this.b, siPCzPFw.CdDP);
        }
    }

    public interface c extends b {

        public static final class a implements c {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1536250415;
            }

            public final String toString() {
                return "DismissGuide";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.ticketdetail.b$c$b, reason: collision with other inner class name */
        public static final class C0344b implements c {
            public final v4f a;

            public C0344b(v4f v4fVar) {
                this.a = v4fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0344b) && this.a == ((C0344b) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ShowGuide(type=" + this.a + ")";
            }
        }
    }

    public interface d extends b {

        public static final class a implements d {
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
                return tug.a("GoToTransactionSearchPage(ticketNumber=", this.a, ")");
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.ticketdetail.b$d$b, reason: collision with other inner class name */
        public static final class C0345b implements d {
            public static final C0345b a = new C0345b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0345b);
            }

            public final int hashCode() {
                return 205167340;
            }

            public final String toString() {
                return "HandleNavigation";
            }
        }
    }

    public static final class e implements b {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 798652158;
        }

        public final String toString() {
            return "Retry";
        }
    }

    public interface f extends b {

        public static final class a implements f {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1000241578;
            }

            public final String toString() {
                return "Dismiss";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.ticketdetail.b$f$b, reason: collision with other inner class name */
        public static final class C0346b implements f {
            public final moo a;

            public C0346b(moo mooVar) {
                this.a = mooVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0346b) && this.a == ((C0346b) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Show(descriptionType=" + this.a + ")";
            }
        }
    }

    public interface g extends b {

        public static final class a implements g {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1227698144;
            }

            public final String toString() {
                return "Dismiss";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.ticketdetail.b$g$b, reason: collision with other inner class name */
        public static final class C0347b implements g {
            public final String a;

            public C0347b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0347b) && this.a.equals(((C0347b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("Show(selectionId=", this.a, ")");
            }
        }
    }

    public static final class h implements b {
        public final String a;

        public h(String str) {
            this.a = str;
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
            return tug.a("UpdateExpandedBetIds(betGroupId=", this.a, ")");
        }
    }
}
