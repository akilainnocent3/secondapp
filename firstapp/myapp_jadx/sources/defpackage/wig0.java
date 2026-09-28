package defpackage;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class wig0 implements ss60 {
    public static final ti1 c = ti1.c;
    public static final ti1 d = ti1.d;
    public final long a;
    public final String b;

    public wig0(double d2, long j) {
        this.a = j;
        StringBuilder sb = new StringBuilder("TraceIdRatioBased{");
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(Locale.ROOT);
        decimalFormatSymbols.setDecimalSeparator('.');
        sb.append(new DecimalFormat("0.000000", decimalFormatSymbols).format(d2));
        sb.append("}");
        this.b = sb.toString();
    }

    @Override // defpackage.ss60
    public final String a() {
        return this.b;
    }

    @Override // defpackage.ss60
    public final ti1 b(m0b m0bVar, String str, String str2, wqa0 wqa0Var, m21 m21Var, List<sfs> list) {
        char[] cArr = l3z.a;
        return Math.abs((((long) l3z.a(str.charAt(30), str.charAt(31))) & 255) | ((((((((((long) l3z.a(str.charAt(16), str.charAt(17))) & 255) << 56) | ((((long) l3z.a(str.charAt(18), str.charAt(19))) & 255) << 48)) | ((((long) l3z.a(str.charAt(20), str.charAt(21))) & 255) << 40)) | ((((long) l3z.a(str.charAt(22), str.charAt(23))) & 255) << 32)) | ((((long) l3z.a(str.charAt(24), str.charAt(25))) & 255) << 24)) | ((((long) l3z.a(str.charAt(26), str.charAt(27))) & 255) << 16)) | ((((long) l3z.a(str.charAt(28), str.charAt(29))) & 255) << 8))) < this.a ? c : d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wig0) && this.a == ((wig0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return this.b;
    }
}
