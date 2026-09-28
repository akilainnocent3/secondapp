package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.pocket.withdraw.WithDrawInfo;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class xzf {
    public static final void a(final ijf0 ijf0Var, final uxs uxsVar, final boolean z, final UiText uiText, final boolean z2, final Function1 function1, final Function0 function0, final Function0 function2, a aVar, final int i) {
        ijf0Var.getClass();
        uxsVar.getClass();
        uiText.getClass();
        function1.getClass();
        function0.getClass();
        function2.getClass();
        b bVarI = aVar.i(1790891589);
        int i2 = i | (bVarI.M(ijf0Var) ? 4 : 2) | (bVarI.d(uxsVar.ordinal()) ? 32 : 16) | (bVarI.b(z) ? 256 : 128) | (bVarI.M(uiText) ? 2048 : 1024) | (bVarI.b(z2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function1) ? 131072 : 65536) | (bVarI.A(function0) ? 1048576 : 524288) | (bVarI.A(function2) ? 8388608 : 4194304);
        if (bVarI.q(i2 & 1, (4793491 & i2) != 4793490)) {
            int i3 = 524286 & i2;
            int i4 = i2 << 3;
            ywz.a(ijf0Var, uxsVar, z, uiText, z2, function1, null, function0, function2, bVarI, i3 | (29360128 & i4) | (i4 & 234881024), 64);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(uxsVar, z, uiText, z2, function1, function0, function2, i) { // from class: wzf
                public final /* synthetic */ uxs b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ UiText d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function0 v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    xzf.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final BigDecimal b(WithDrawInfo withDrawInfo) {
        String str;
        withDrawInfo.getClass();
        if (withDrawInfo.hasInfo && (str = withDrawInfo.maxWithdrawAmount) != null) {
            return p54.b(new BigDecimal(str));
        }
        return null;
    }
}
