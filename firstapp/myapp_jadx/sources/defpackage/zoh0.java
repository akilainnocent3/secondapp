package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class zoh0 {
    public static final void a(Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, a aVar, int i) {
        int i2;
        b bVar;
        b bVarA = yoh0.a(function0, function1, function2, aVar, -334195607);
        if ((i & 6) == 0) {
            i2 = (bVarA.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarA.A(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarA.A(function2) ? 256 : 128;
        }
        if (bVarA.q(i2 & 1, (i2 & 147) != 146)) {
            String strA = cb40.a(R.string.wap_me__share_your_thought_popup_title, new Object[0], bVarA);
            String strA2 = cb40.a(R.string.wap_me__share_your_thought_popup_content, new Object[0], bVarA);
            String strA3 = cb40.a(R.string.wap_me__contact_support, new Object[0], bVarA);
            String strA4 = cb40.a(R.string.wap_me__share_idea, new Object[0], bVarA);
            int i3 = i2 & 896;
            boolean z = (i3 == 256) | ((i2 & 14) == 4);
            Object objY = bVarA.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new nhd(function2, function0);
                bVarA.r(objY);
            }
            Function0 function3 = (Function0) objY;
            boolean z2 = (i3 == 256) | ((i2 & 112) == 32);
            Object objY2 = bVarA.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new Function0() { // from class: xoh0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function2.invoke();
                        function1.invoke();
                        return Unit.a;
                    }
                };
                bVarA.r(objY2);
            }
            bVar = bVarA;
            nzj.d(strA, strA2, null, null, strA4, strA3, null, null, null, null, function2, function3, (Function0) objY2, null, bVar, 0, (i2 >> 3) & 112, 18332);
        } else {
            bVar = bVarA;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new phd(function0, function1, function2, i);
        }
    }
}
