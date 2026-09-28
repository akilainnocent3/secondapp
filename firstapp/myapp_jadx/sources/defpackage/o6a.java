package defpackage;

import android.content.res.Resources;
import com.sportybet.android.gp.tz.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class o6a {
    public static final imf0 a(imf0 imf0Var, float f) {
        if (f == 1.0f) {
            return imf0Var;
        }
        long jG = imf0Var.a.b;
        long j = jG & 1095216660480L;
        if (j != 0) {
            d2l.a(jG);
            jG = d2l.g(omf0.c(jG) * f, j);
        }
        long jG2 = imf0Var.b.c;
        long j2 = 1095216660480L & jG2;
        if (j2 != 0) {
            d2l.a(jG2);
            jG2 = d2l.g(omf0.c(jG2) * f, j2);
        }
        return imf0.b(imf0Var, 0L, jG, null, null, null, 0L, null, null, null, 0, jG2, null, null, 16646141);
    }

    public static final n6a b(Resources resources, float f, float f2) {
        resources.getClass();
        n6a n6aVar = new n6a();
        if (f == 0.0f || f2 == 0.0f) {
            return n6aVar;
        }
        Map mapC = vu80.c(f, f2);
        float f3 = f / f2;
        Integer numValueOf = Integer.valueOf(R.dimen._11sdp);
        Pair pair = new Pair("bet_card_auto_cashout_height", numValueOf);
        Integer numValueOf2 = Integer.valueOf(R.dimen._28sdp);
        Map mapF = kpu.f(pair, new Pair("bet_card_auto_cashout_width", numValueOf2));
        if (f3 >= 2.1f) {
            mapF = kpu.f(new Pair("bet_card_auto_cashout_height", numValueOf), new Pair("bet_card_auto_cashout_width", numValueOf2));
        } else if (f3 >= 2.0f) {
            mapF = kpu.f(new Pair("bet_card_auto_cashout_height", numValueOf), new Pair("bet_card_auto_cashout_width", numValueOf2));
        } else if (f3 >= 1.5f) {
            mapF = kpu.f(new Pair("bet_card_auto_cashout_height", Integer.valueOf(R.dimen._10sdp)), new Pair("bet_card_auto_cashout_width", Integer.valueOf(R.dimen._26sdp)));
        }
        float f4 = resources.getDisplayMetrics().density;
        Integer num = (Integer) mapF.get("bet_card_auto_cashout_height");
        float dimensionPixelSize = num != null ? resources.getDimensionPixelSize(num.intValue()) / f4 : 16.0f;
        Integer num2 = (Integer) mapF.get("bet_card_auto_cashout_width");
        g7f g7fVar = num2 != null ? new g7f(resources.getDimensionPixelSize(num2.intValue()) / f4) : null;
        float dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen._34sdp) / f4;
        float dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen._16sdp) / f4;
        Float f5 = (Float) mapC.get("bet_auto_controls_text");
        return n6a.a(n6aVar, 0.0f, f5 != null ? f5.floatValue() : 1.0f, dimensionPixelSize, g7fVar, dimensionPixelSize2, dimensionPixelSize3, 0.0f, null, 0.0f, 0.0f, 0.0f, 0.0f, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3057, 1023);
    }
}
