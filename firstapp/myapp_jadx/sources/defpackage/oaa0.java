package defpackage;

import android.util.LruCache;
import com.bumptech.glide.a;

/* JADX INFO: loaded from: classes7.dex */
public final class oaa0 {
    public static final oaa0 a = new oaa0();
    public static LruCache<String, maa0> b = new LruCache<>(10);
    public static maa0 c;

    public static void a(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        int iA = zch0.a(hp0.A, 24);
        int iA2 = zch0.a(hp0.A, 24);
        if (str.length() == 0 || str2.length() == 0) {
            return;
        }
        ea50 ea50VarE = a.d(hp0.A).p(str2).e(hre.c);
        ea50VarE.L(new naa0(iA, iA2, str, z), null, ea50VarE, fug.a);
    }
}
