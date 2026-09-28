package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class ryv {
    public static final void a(final int i, a aVar, String str, Function0 function0) {
        final String str2;
        final Function0 function1;
        function0.getClass();
        b bVarI = aVar.i(2127240759);
        int i2 = (bVarI.M(str) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            str2 = str;
            function1 = function0;
            c3b.a(((i2 << 3) & 112) | 384 | ((i2 << 6) & 7168), 0, bVarI, h.h(j.g(d.a.b, 1.0f), 16.0f, 0.0f, 2), cb40.a(R.string.page_payment__processing_your_deposit, new Object[0], bVarI), str2, function1);
        } else {
            str2 = str;
            function1 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, str2, function1) { // from class: qyv
                public final /* synthetic */ String a;
                public final /* synthetic */ Function0 b;

                {
                    this.a = str2;
                    this.b = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ryv.a(qj40.a(1), (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }
}
