package defpackage;

import android.net.Uri;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public abstract class p9f0 {
    public static final uf00<p9f0> c = a4h.a(c.d, b.d, a.d, d.d);
    public final int a;
    public final String b;

    public static final class a extends p9f0 {
        public static final a d = new a(R.string.common_functions__matches, "team_matches");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 887293232;
        }

        public final String toString() {
            return "Matches";
        }
    }

    public static final class b extends p9f0 {
        public static final b d = new b(R.string.dedicated_team_pages__tab_news, "team_news");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1560270838;
        }

        public final String toString() {
            return "News";
        }
    }

    public static final class c extends p9f0 {
        public static final c d = new c(R.string.dedicated_team_pages__tab_overview, "team_overview");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1969484060;
        }

        public final String toString() {
            return "Overview";
        }
    }

    public static final class d extends p9f0 {
        public static final d d = new d(R.string.dedicated_team_pages__tab_standings, "team_standings");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -587219356;
        }

        public final String toString() {
            return "Standings";
        }
    }

    public p9f0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final String a(String str, String str2) {
        return tx5.a(this.b, "?team_id=", Uri.encode(str), "&matches_tab=", Uri.encode(str2));
    }

    public final String b() {
        return this.b.concat("?team_id={team_id}&matches_tab={matches_tab}");
    }
}
