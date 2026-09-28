package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class g9z {
    public static final alb0 a = new alb0(R.style.H4_M, new g7f(48.0f), h.a(2, 20.0f, 0.0f), jc1.a(20.0f, 20.0f), 12.0f);
    public static final alb0 b = new alb0(R.style.B1_M, new g7f(44.0f), h.a(2, 20.0f, 0.0f), jc1.a(18.0f, 18.0f), 12.0f);
    public static final alb0 c = new alb0(R.style.B2_M, new g7f(32.0f), h.a(2, 20.0f, 0.0f), jc1.a(14.0f, 14.0f), 8.0f);
    public static final alb0 d = new alb0(R.style.B2_M, new g7f(28.0f), h.a(2, 12.0f, 0.0f), jc1.a(12.0f, 12.0f), 8.0f);
    public static final alb0 e = new alb0(R.style.B2_M, null, new umz(12.0f, 6.0f, 12.0f, 6.0f), jc1.a(12.0f, 12.0f), 8.0f);

    public static e9z a(long j, long j2, a aVar, int i) {
        if ((i & 2) != 0) {
            j = c68.a(R.color.brand_secondary, aVar);
        }
        if ((i & 4) != 0) {
            j2 = c68.a(R.color.text_disable_type1_primary, aVar);
        }
        return new e9z(j, j2);
    }

    public static f9z b(long j, long j2, a aVar, int i) {
        long j3 = j58.l;
        if ((i & 2) != 0) {
            j = c68.a(R.color.brand_secondary, aVar);
        }
        long j4 = j;
        if ((i & 4) != 0) {
            j2 = c68.a(R.color.text_disable_type1_primary, aVar);
        }
        return new f9z(j3, j4, j2);
    }
}
