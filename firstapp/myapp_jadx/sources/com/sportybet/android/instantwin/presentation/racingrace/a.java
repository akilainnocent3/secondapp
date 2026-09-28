package com.sportybet.android.instantwin.presentation.racingrace;

import defpackage.tug;

/* JADX INFO: loaded from: classes5.dex */
public interface a {

    /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.racingrace.a$a, reason: collision with other inner class name */
    public interface InterfaceC0315a extends a {

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.racingrace.a$a$a, reason: collision with other inner class name */
        public static final class C0316a implements InterfaceC0315a {
            public static final C0316a a = new C0316a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0316a);
            }

            public final int hashCode() {
                return -955416030;
            }

            public final String toString() {
                return "SendAnimationErrorEvent";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.racingrace.a$a$b */
        public static final class b implements InterfaceC0315a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1106477859;
            }

            public final String toString() {
                return "SendSkipToResultClickEvent";
            }
        }
    }

    public interface b extends a {

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.racingrace.a$b$a, reason: collision with other inner class name */
        public static final class C0317a implements b {
            public static final C0317a a = new C0317a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0317a);
            }

            public final int hashCode() {
                return -706563826;
            }

            public final String toString() {
                return "GoToSportEventPage";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.racingrace.a$b$b, reason: collision with other inner class name */
        public static final class C0318b implements b {
            public final String a;

            public C0318b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0318b) && this.a.equals(((C0318b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("GoToTicketDetailPage(ticketId=", this.a, ")");
            }
        }
    }

    public static final class c implements a {
        public static final c a = new c();
    }
}
