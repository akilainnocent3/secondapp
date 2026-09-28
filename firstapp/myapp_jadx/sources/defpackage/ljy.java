package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public enum ljy {
    DECIMAL(R.string.odds_format__decimal_odds, "2.40"),
    US(R.string.odds_format__american_odds, "+140");

    public static final a c = new a();
    public final int a;
    public final String b;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
        public static ljy a(String str) {
            if (Intrinsics.g(str, "DECIMAL")) {
                return ljy.DECIMAL;
            }
            return Intrinsics.g(str, "US") ? ljy.US : ljy.DECIMAL;
        }
    }

    ljy(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
