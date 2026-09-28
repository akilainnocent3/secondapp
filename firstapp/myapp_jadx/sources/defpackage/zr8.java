package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zr8 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e160) obj).getClass();
        int i = 0;
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            String strE = pwo.e(R.string.common_functions__reset, aVar);
            long jA = c68.a(R.color.brand_quaternary, aVar);
            t9i t9iVar = t9i.E;
            imf0 imf0VarL = mla.l(R.style.B2_M, aVar);
            Object objY = aVar.y();
            if (objY == a.C0041a.a) {
                objY = new as8(i);
                aVar.r(objY);
            }
            lkf0.d(strE, xa80.b(d.a.b, false, (Function1) objY), jA, null, 0L, null, t9iVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL, aVar, 1572864, 0, 131000);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
