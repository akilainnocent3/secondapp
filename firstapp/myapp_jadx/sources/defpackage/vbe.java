package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class vbe {
    public static final void a(final int i, a aVar, final String str, final Function0 function0, final Function0 function1) {
        str.getClass();
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1130578140);
        int i2 = (bVarI.M(str) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            nzj.d(cb40.a(R.string.common_feedback__something_went_wrong, new Object[0], bVarI), str, null, null, null, cb40.a(R.string.wap_me__contact_support, new Object[0], bVarI), null, null, null, null, null, function1, function0, null, bVarI, (i2 << 3) & 112, (i2 & 896) | ((i2 << 6) & 7168), 20412);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, str, function0, function1) { // from class: ube
                public final /* synthetic */ String a;
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;

                {
                    this.a = str;
                    this.b = function0;
                    this.c = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vbe.a(qj40.a(1), (a) obj, this.a, this.b, this.c);
                    return Unit.a;
                }
            };
        }
    }
}
