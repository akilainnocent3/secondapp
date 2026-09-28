package com.sportybet.android.instantwin.presentation.ticketdetail;

import defpackage.ng1;
import defpackage.tug;
import defpackage.tx5;
import defpackage.wae;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface c {

    public static final class a implements c {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
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
            return tx5.a("DisplayShowOffDialog(sportId=", this.a, ", ticketId=", this.b, ")");
        }
    }

    public interface b extends c {

        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 2048664255;
            }

            public final String toString() {
                return "Back";
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.ticketdetail.c$b$b, reason: collision with other inner class name */
        public static final class C0348b implements b {
            public final boolean a;
            public final wae b;
            public final List<Pair<String, String>> c;

            public C0348b(boolean z, wae waeVar, List<Pair<String, String>> list) {
                list.getClass();
                this.a = z;
                this.b = waeVar;
                this.c = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0348b)) {
                    return false;
                }
                C0348b c0348b = (C0348b) obj;
                return this.a == c0348b.a && this.b == c0348b.b && Intrinsics.g(this.c, c0348b.c);
            }

            public final int hashCode() {
                int iHashCode = Boolean.hashCode(this.a) * 31;
                wae waeVar = this.b;
                return this.c.hashCode() + ((iHashCode + (waeVar == null ? 0 : waeVar.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("NavigateToSportEventPage(openMePage=");
                sb.append(this.a);
                sb.append(", destination=");
                sb.append(this.b);
                sb.append(", uriQueryParameters=");
                return ng1.a(sb, this.c, ")");
            }
        }

        /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.ticketdetail.c$b$c, reason: collision with other inner class name */
        public static final class C0349c implements b {
            public final String a;

            public C0349c(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0349c) && this.a.equals(((C0349c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("NavigateToTransactionSearchPage(ticketNumber=", this.a, ")");
            }
        }
    }
}
