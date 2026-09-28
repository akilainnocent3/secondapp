package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class e2l {
    public static final /* synthetic */ int a = 0;

    public static final void a(final int i, a aVar, final String str, Function0 function0, Function0 function1) {
        final Function0 function2;
        final Function0 function3;
        str.getClass();
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1375836995);
        int i2 = (bVarI.M(str) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            StringUiText stringUiText = vch0.a;
            function2 = function0;
            function3 = function1;
            r1k0.a(new ResourceUiText(R.string.world_cup_mission__wc_pass_insufficient_title), new ResourceUiText(R.string.world_cup_mission__wc_pass_insufficient_body, ay0.S(new Object[]{str})), new ResourceUiText(R.string.world_cup_mission__wc_pass_insufficient_deposit_cta, ay0.S(new Object[]{str})), function2, null, null, function3, bVarI, ((i2 << 6) & 7168) | 24576 | ((i2 << 12) & 3670016), 32);
        } else {
            function2 = function0;
            function3 = function1;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, str, function2, function3) { // from class: r2k0
                public final /* synthetic */ String a;
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;

                {
                    this.a = str;
                    this.b = function2;
                    this.c = function3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e2l.a(qj40.a(1), (a) obj, this.a, this.b, this.c);
                    return Unit.a;
                }
            };
        }
    }
}
