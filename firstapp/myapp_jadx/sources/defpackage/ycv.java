package defpackage;

import com.google.protobuf.Reader;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/math/MathKt")
public class ycv extends xcv {
    public static int a(double d) {
        if (Double.isNaN(d)) {
            hb5.a("Cannot round NaN value.");
            return 0;
        }
        if (d > 2.147483647E9d) {
            return Reader.READ_DONE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    public static int b(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        hb5.a("Cannot round NaN value.");
        return 0;
    }

    public static long c(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        hb5.a(gvQvkPPtA.YprFRgkPVj);
        return 0L;
    }
}
