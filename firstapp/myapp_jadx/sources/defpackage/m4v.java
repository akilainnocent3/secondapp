package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m4v {
    public final String a;
    public final qcn<a> b;

    public static final class a {
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
            return tx5.a("Tab(leagueId=", this.a, ", leagueNameText=", this.b, ")");
        }
    }

    public m4v(qcn qcnVar, String str) {
        str.getClass();
        qcnVar.getClass();
        this.a = str;
        this.b = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4v)) {
            return false;
        }
        m4v m4vVar = (m4v) obj;
        return Intrinsics.g(this.a, m4vVar.a) && Intrinsics.g(this.b, m4vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchEventLeagueTabState(selectedLeagueId=" + this.a + ", tabs=" + this.b + ")";
    }
}
