package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class hbl implements ulc0 {
    public static final hbl b = new hbl();
    public static final String c = "https://s.sporty.net/cms/halftime_86a088702b.mp4";
    public static final int d = R.string.page_instant_virtual__lottie_sporty_legends_half_time;

    @Override // defpackage.ulc0
    public final Integer c() {
        return Integer.valueOf(d);
    }

    @Override // defpackage.ulc0
    public final String d() {
        return c;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hbl);
    }

    public final int hashCode() {
        return -1377984342;
    }

    public final String toString() {
        return "HalfTime";
    }
}
