package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class de10 {
    public static final /* synthetic */ int a = 0;

    public static final void a(Function0 function0, Function0 function1, a aVar, int i) {
        b bVarA = v2g.a(function0, function1, aVar, -328734971);
        int i2 = (bVarA.A(function0) ? 4 : 2) | i | (bVarA.A(function1) ? 32 : 16);
        if (bVarA.q(i2 & 1, (i2 & 19) != 18)) {
            v910.a(cb40.a(R.string.common_functions__error, new Object[0], bVarA), cb40.a(R.string.page_payment__facial_recognition_error_msg, new Object[0], bVarA), cb40.a(R.string.common_functions__try_again, new Object[0], bVarA), cb40.a(R.string.common_functions__cancel, new Object[0], bVarA), function1, function0, function0, false, bVarA, ((i2 << 9) & 57344) | ((i2 << 15) & 458752) | ((i2 << 18) & 3670016), 128);
        } else {
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new x0o(function0, i, 1, function1);
        }
    }
}
