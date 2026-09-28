package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sporty.android.core.model.dateofbirth.DobVerificationReminderData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class sxe {
    public static final void a(DobVerificationReminderData dobVerificationReminderData, Function0<Unit> function0, Function0<Unit> function1, a aVar, int i) {
        b bVarA = v2g.a(function0, function1, aVar, -1026882197);
        int i2 = (bVarA.A(dobVerificationReminderData) ? 4 : 2) | i | (bVarA.A(function0) ? 32 : 16) | (bVarA.A(function1) ? 256 : 128);
        if (bVarA.q(i2 & 1, (i2 & 147) != 146)) {
            b(dobVerificationReminderData, function0, function1, bVarA, i2 & 1022);
        } else {
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new pxe(dobVerificationReminderData, function0, function1, i);
        }
    }

    public static final void b(DobVerificationReminderData dobVerificationReminderData, Function0<Unit> function0, Function0<Unit> function1, a aVar, int i) {
        b bVarI = aVar.i(1372493882);
        int i2 = (bVarI.A(dobVerificationReminderData) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            u60.a(function0, null, pp8.b(-1985908783, new qxe(dobVerificationReminderData, function0, function1), bVarI), bVarI, ((i2 >> 3) & 14) | 384, 2);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new rxe(i, 0, function1, dobVerificationReminderData, function0);
        }
    }
}
