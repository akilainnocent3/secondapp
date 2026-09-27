package yads;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class lq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DecimalFormat f152086a;

    public lq2() {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setGroupingSeparator(' ');
        this.f152086a = new DecimalFormat("#,###,###", decimalFormatSymbols);
    }

    public final String a(String str) throws IOException, z02 {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (!cv.e.r(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            String string = sb2.toString();
            kotlin.jvm.internal.m0.o(string, "toString(...)");
            return this.f152086a.format(Long.parseLong(string));
        } catch (NumberFormatException unused) {
            kotlin.jvm.internal.u1 u1Var = kotlin.jvm.internal.u1.f102789a;
            kotlin.jvm.internal.m0.o(String.format("Could not parse review count value. Review Count value is %s", Arrays.copyOf(new Object[]{str}, 1)), "format(...)");
            boolean z10 = ad1.f146762a;
            throw new z02("Native Ad json has not required attributes");
        }
    }
}
