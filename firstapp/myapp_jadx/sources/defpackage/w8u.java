package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class w8u {
    public static final void a(final u8u u8uVar, a aVar, final int i) {
        b bVar;
        u8uVar.getClass();
        b bVarI = aVar.i(361404349);
        int i2 = (bVarI.M(u8uVar) ? 4 : 2) | i;
        if (!bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            bVar = bVarI;
            bVar.G();
        } else if (u8uVar instanceof u8u.a) {
            bVarI.N(-885947711);
            u8u.a aVar2 = (u8u.a) u8uVar;
            UiText uiText = aVar2.a;
            uiText.getClass();
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            String strG = uiText.g((Context) bVarI.O(qyd0Var));
            UiText uiText2 = aVar2.b;
            uiText2.getClass();
            nzj.b(null, strG, uiText2.g((Context) bVarI.O(qyd0Var)), null, null, null, null, null, null, null, null, null, aVar2.c, null, bVarI, 0, 0, 12281);
            bVar = bVarI;
            bVar.X(false);
        } else {
            bVar = bVarI;
            bVar.N(-885759355);
            bVar.X(false);
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: v8u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    w8u.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
