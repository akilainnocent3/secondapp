package com.sportybet.android.instantwin.presentation.scheduledfootballopenbets;

import defpackage.tug;

/* JADX INFO: loaded from: classes5.dex */
public interface a {

    /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.a$a, reason: collision with other inner class name */
    public interface InterfaceC0337a extends a {

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.a$a$a, reason: collision with other inner class name */
        public static final class C0338a implements InterfaceC0337a {
            public static final C0338a a = new C0338a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0338a);
            }

            public final int hashCode() {
                return 722373162;
            }

            public final String toString() {
                return "SendOpenBetKeepBettingClickEvent";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.a$a$b */
        public static final class b implements InterfaceC0337a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1349573421;
            }

            public final String toString() {
                return "SendOpenBetViewEvent";
            }
        }
    }

    public interface b extends a {

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.a$b$a, reason: collision with other inner class name */
        public static final class C0339a implements b {
            public static final C0339a a = new C0339a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0339a);
            }

            public final int hashCode() {
                return -415530444;
            }

            public final String toString() {
                return "GoBack";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.a$b$b, reason: collision with other inner class name */
        public static final class C0340b implements b {
            public static final C0340b a = new C0340b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0340b);
            }

            public final int hashCode() {
                return -383778534;
            }

            public final String toString() {
                return "GoToBetHistoryPage";
            }
        }
    }

    public static final class c implements a {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -413041724;
        }

        public final String toString() {
            return "ReloadOpenBetsData";
        }
    }

    public interface d extends a {

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.a$d$a, reason: collision with other inner class name */
        public static final class C0341a implements d {
            public static final C0341a a = new C0341a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0341a);
            }

            public final int hashCode() {
                return -631855798;
            }

            public final String toString() {
                return "Dismiss";
            }
        }

        public static final class b implements d {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a.equals(((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("Show(selectionId=", this.a, ")");
            }
        }
    }
}
