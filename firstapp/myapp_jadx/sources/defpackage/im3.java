package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class im3 {
    public static final im3 a;
    public static final im3 b;
    public static final /* synthetic */ im3[] c;

    static {
        im3 im3Var = new im3("SimulatedYellow", 0);
        a = im3Var;
        im3 im3Var2 = new im3("RealGreen", 1);
        b = im3Var2;
        c = new im3[]{im3Var, im3Var2};
    }

    public im3() {
        throw null;
    }

    public static im3 valueOf(String str) {
        return (im3) Enum.valueOf(im3.class, str);
    }

    public static im3[] values() {
        return (im3[]) c.clone();
    }

    public final long a(a aVar) {
        int i;
        int i2;
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            i = 2123678145;
            i2 = R.color.bg_inverse_primary_d_base;
        } else {
            if (iOrdinal != 1) {
                throw rg.a(2123676837, aVar);
            }
            i = 2123680764;
            i2 = R.color.text_inverse_primary;
        }
        return m7b.a(aVar, i, i2, aVar);
    }
}
