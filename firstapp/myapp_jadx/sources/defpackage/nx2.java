package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public interface nx2 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[fbx.values().length];
            try {
                iArr[fbx.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    static String k(double d, String str) {
        return str + ' ' + String.format(Locale.ROOT, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
    }
}
