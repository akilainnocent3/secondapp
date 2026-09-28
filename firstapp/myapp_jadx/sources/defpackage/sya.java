package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class sya {
    public static final alb0 a = new alb0(R.style.H4_M, new g7f(48.0f), h.a(2, 20.0f, 0.0f), jc1.a(20.0f, 20.0f), 12.0f);
    public static final alb0 b = new alb0(R.style.B1_M, new g7f(44.0f), h.a(2, 20.0f, 0.0f), jc1.a(18.0f, 18.0f), 12.0f);
    public static final alb0 c = new alb0(R.style.B1_M, new g7f(40.0f), new umz(12.0f, 12.0f, 12.0f, 12.0f), jc1.a(20.0f, 20.0f), 4.0f);
    public static final alb0 d = new alb0(R.style.B2_M, new g7f(32.0f), h.a(2, 20.0f, 0.0f), jc1.a(14.0f, 14.0f), 8.0f);
    public static final alb0 e = new alb0(R.style.B2_M, new g7f(28.0f), h.a(2, 12.0f, 0.0f), jc1.a(12.0f, 12.0f), 8.0f);

    public static ak5 a(long j, long j2, long j3, long j4, a aVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = c68.a(R.color.bg_brand_sub_primary_d_base, aVar);
        }
        long j5 = j;
        if ((i2 & 2) != 0) {
            j2 = c68.a(R.color.text_inverse_primary, aVar);
        }
        long j6 = j2;
        if ((i2 & 4) != 0) {
            j3 = c68.a(R.color.brand_secondary_disable, aVar);
        }
        return ek5.a(j5, j6, j3, (i2 & 8) != 0 ? c68.a(R.color.text_disable_type1_primary, aVar) : j4, aVar, 0);
    }

    public static ak5 b(a aVar) {
        return ek5.a(c68.a(R.color.brand_secondary_variable_type1, aVar), c68.a(R.color.brand_secondary, aVar), c68.a(R.color.brand_secondary_disable, aVar), c68.a(R.color.text_disable_type1_primary, aVar), aVar, 0);
    }

    public static ak5 c(long j, long j2, a aVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = c68.a(R.color.brand_secondary, aVar);
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = c68.a(R.color.text_inverse_primary, aVar);
        }
        long j4 = j2;
        return ek5.a(j3, j4, j3, j4, aVar, 0);
    }
}
