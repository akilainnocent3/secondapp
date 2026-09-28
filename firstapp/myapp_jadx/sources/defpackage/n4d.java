package defpackage;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class n4d {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;

    public static final String a(BigDecimal bigDecimal) {
        return bigDecimal != null ? String.format(Locale.US, "%,.2f", Arrays.copyOf(new Object[]{bigDecimal}, 1)) : "--";
    }
}
