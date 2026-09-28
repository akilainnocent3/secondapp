package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class slv {
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;

    public slv(int i, int i2, String str, int i3, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slv)) {
            return false;
        }
        slv slvVar = (slv) obj;
        return this.a.equals(slvVar.a) && this.b == slvVar.b && this.c.equals(slvVar.c) && this.d == slvVar.d && this.e == slvVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + gpp.a(this.d, gmf0.a(gpp.a(R.color.bg_brand_main_primary, gpp.a(this.b, gmf0.a(Integer.hashCode(R.color.bg_brand_sub_primary_d_lightest) * 31, 31, this.a), 31), 31), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbA = ml5.a(this.b, "MeetingSummaryState(homeColorResId=2131099768, homeTeamNameText=", this.a, ", homeTeamWins=", ", awayColorResId=2131099762, awayTeamNameText=");
        wxa.b(this.d, this.c, ", awayTeamWins=", ", draws=", sbA);
        return zk1.a(this.e, ")", sbA);
    }
}
