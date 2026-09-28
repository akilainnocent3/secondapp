package com.sportybet.android.instantwin.presentation.racingrace;

import defpackage.tug;
import defpackage.tx5;

/* JADX INFO: loaded from: classes5.dex */
public interface b {

    public static final class a implements b {
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
            return tug.a("NavigateToSportEventPage(sportId=", this.a, ")");
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.racingrace.b$b, reason: collision with other inner class name */
    public static final class C0319b implements b {
        public final String a;
        public final String b;

        public C0319b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0319b)) {
                return false;
            }
            C0319b c0319b = (C0319b) obj;
            return this.a.equals(c0319b.a) && this.b.equals(c0319b.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("NavigateToTicketDetailPage(sportId=", this.a, ", ticketId=", this.b, ")");
        }
    }
}
