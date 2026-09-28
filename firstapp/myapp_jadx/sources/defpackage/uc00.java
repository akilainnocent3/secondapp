package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class uc00 {
    public static final void a(String str, final nk0 nk0Var, final Function0 function0, final Function0 function1, final Function0 function2, a aVar, final int i) {
        final String str2;
        b bVarI = aVar.i(13070026);
        int i2 = i | 6 | (bVarI.M(nk0Var) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024) | (bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            nzj.b(null, cb40.a(R.string.page_payment__pending_request, new Object[0], bVarI), "", null, null, nk0Var, cb40.a(R.string.common_functions__home, new Object[0], bVarI), null, null, new yle(false, false, 4), hi9.a, function2, function0, function1, bVarI, 805306752 | ((i2 << 12) & 458752), ((i2 >> 9) & 112) | 6 | (i2 & 896) | (i2 & 7168), 409);
            str2 = "";
        } else {
            bVarI.G();
            str2 = str;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str2, nk0Var, function0, function1, function2, i) { // from class: tc00
                public final /* synthetic */ String a;
                public final /* synthetic */ nk0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    uc00.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
