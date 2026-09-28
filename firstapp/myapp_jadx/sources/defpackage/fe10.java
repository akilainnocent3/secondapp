package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class fe10 {
    public static final void a(final Function0 function0, final Function0 function1, a aVar, final int i) {
        b bVarA = v2g.a(function0, function1, aVar, -830584099);
        int i2 = (bVarA.A(function0) ? 4 : 2) | i | (bVarA.A(function1) ? 32 : 16);
        if (bVarA.q(i2 & 1, (i2 & 19) != 18)) {
            ra8.b(cb40.a(R.string.register_login_br__facial_recognition, new Object[0], bVarA), cb40.a(R.string.page_payment__please_confirm_facial_recognition, new Object[0], bVarA), mla.l(R.style.B1_R, bVarA), Integer.valueOf(R.drawable.ic_security), null, cb40.a(R.string.common_functions__verify, new Object[0], bVarA), null, new yle(false, false, 5), function0, function1, null, bVarA, ((i2 << 27) & 1879048192) | 113246208, (i2 >> 3) & 14, 2096);
        } else {
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function0, function1) { // from class: ee10
                public final /* synthetic */ Function0 a;
                public final /* synthetic */ Function0 b;

                {
                    this.a = function0;
                    this.b = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    fe10.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final int b(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }
}
