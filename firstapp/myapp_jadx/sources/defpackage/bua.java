package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class bua {
    public static final void a(int i, a aVar, String str, Function0 function0, Function0 function1) {
        b bVarA = v2g.a(function0, function1, aVar, 1098011268);
        int i2 = i | (bVarA.M(str) ? 4 : 2) | (bVarA.A(function0) ? 32 : 16) | (bVarA.A(function1) ? 256 : 128);
        if (bVarA.q(i2 & 1, (i2 & 147) != 146)) {
            long jA = c68.a(R.color.background_general_primary, bVarA);
            alb0 alb0Var = qdf0.a;
            nzj.a(null, cb40.a(R.string.page_payment__mobile_money_network_confirmation_title, new Object[0], bVarA), null, syj.a(jA, 0L, 0L, qdf0.a(384, 2, c68.a(R.color.text_danger, bVarA), bVarA), qdf0.a(384, 2, c68.a(R.color.text_secondary, bVarA), bVarA), bVarA, 6), pp8.b(-98237535, new zta(str, 0), bVarA), cb40.a(R.string.common_functions__confirm, new Object[0], bVarA), null, null, null, qv8.a, null, function1, function0, bVarA, 805330944, ((i2 >> 3) & 112) | ((i2 << 3) & 896), 1477);
        } else {
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new aua(str, function0, function1, i, 0);
        }
    }
}
