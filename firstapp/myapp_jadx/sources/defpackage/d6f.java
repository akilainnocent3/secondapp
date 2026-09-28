package defpackage;

import java.text.NumberFormat;

/* JADX INFO: loaded from: classes7.dex */
public final class d6f {
    public static final NumberFormat a;

    static {
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        numberInstance.setMinimumFractionDigits(2);
        a = numberInstance;
    }

    public static String a(double d) {
        String str = a.format(d);
        str.getClass();
        return str;
    }
}
