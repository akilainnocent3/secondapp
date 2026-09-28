package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gaf0 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        qz70 qz70Var = (qz70) obj;
        a aVar = (a) obj2;
        ((Integer) obj3).getClass();
        qz70Var.getClass();
        aVar.N(483410973);
        aVar.N(1941798493);
        ArrayList arrayList = qz70Var.d;
        if (arrayList.isEmpty()) {
            aVar.H();
            str = null;
        } else {
            List listT0 = CollectionsKt.t0(arrayList, 2);
            Object objY = aVar.y();
            if (objY == a.C0041a.a) {
                objY = new vdu(1);
                aVar.r(objY);
            }
            String strA0 = CollectionsKt.a0(listT0, ", ", null, null, (Function1) objY, 30);
            int size = arrayList.size() - 2;
            if (size <= 0) {
                aVar.H();
                str = strA0;
            } else {
                str = strA0 + " " + cb40.a(R.string.common_functions__and_x_others, new Object[]{Integer.valueOf(size)}, aVar);
                aVar.H();
            }
        }
        aVar.H();
        return str;
    }
}
