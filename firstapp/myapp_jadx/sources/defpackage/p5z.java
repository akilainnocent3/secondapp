package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.feature.register.revamp.RegisterRevampConfig;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class p5z {
    public static final void a(e6z e6zVar, OtpData.Register register, Function1<? super q5z, Unit> function1, Function0<Unit> function0, UiText uiText, a aVar, int i, int i2) {
        int i3;
        e6z e6zVar2;
        Function0<Unit> function2;
        Function1<? super q5z, Unit> function3;
        UiText uiText2;
        e6zVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(57141804);
        int i4 = (bVarI.A(e6zVar) ? 4 : 2) | i | (bVarI.M(register) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024);
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 = i4 | 24576;
        } else {
            i3 = i4 | (bVarI.M(uiText) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        }
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            UiText uiText3 = i5 != 0 ? null : uiText;
            if ((register != null ? register.e : null) instanceof RegisterRevampConfig.Revamp) {
                bVarI.N(-921290949);
                int i6 = (i3 & 14) | 8;
                int i7 = i3 >> 3;
                e6zVar2 = e6zVar;
                function2 = function0;
                uv40.b(e6zVar2, function1, function2, uiText3, bVarI, i6 | (i7 & 112) | (i7 & 896) | (i7 & 7168));
                function3 = function1;
                bVarI.X(false);
            } else {
                e6zVar2 = e6zVar;
                function2 = function0;
                function3 = function1;
                bVarI.N(-921283948);
                d6z.b(e6zVar2, function3, bVarI, (i3 & 14) | 8 | ((i3 >> 3) & 112));
                bVarI.X(false);
            }
            uiText2 = uiText3;
        } else {
            e6zVar2 = e6zVar;
            function2 = function0;
            function3 = function1;
            bVarI.G();
            uiText2 = uiText;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new qqk(e6zVar2, register, function3, function2, uiText2, i, i2);
        }
    }
}
