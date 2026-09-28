package defpackage;

import android.graphics.Color;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class d09 {
    public static final op8 a = new op8(-718453443, new yz8(), false);
    public static final op8 b = new op8(1286362836, new zz8(), false);
    public static final op8 c = new op8(-1203462389, new a09(), false);
    public static final op8 d = new op8(-1547693756, new b09(), false);
    public static final op8 e = new op8(-426479785, new c09(), false);

    public static String a(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d)};
        String str = jrh0.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }
}
