package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sporty.android.platform.features.newotp.feature.register.revamp.RegisterRevampConfig;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class m6z {
    public static final void a(z6z z6zVar, OtpData.Register register, Function1<? super o6z, Unit> function1, a aVar, int i) {
        z6zVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(393213915);
        int i2 = (bVarI.M(z6zVar) ? 4 : 2) | i | (bVarI.M(register) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            if ((register != null ? register.e : null) instanceof RegisterRevampConfig.Revamp) {
                bVarI.N(-78542580);
                ev40.b(z6zVar, function1, bVarI, ((i2 >> 3) & 112) | (i2 & 14));
                bVarI.X(false);
            } else {
                bVarI.N(-78540479);
                y6z.b(z6zVar, function1, bVarI, ((i2 >> 3) & 112) | (i2 & 14));
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new gsk(z6zVar, register, function1, i);
        }
    }
}
