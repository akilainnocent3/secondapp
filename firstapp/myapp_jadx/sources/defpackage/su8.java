package defpackage;

import androidx.compose.runtime.a;
import com.google.android.gms.common.annotation.LjLk.llGRV;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class su8 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            lkf0.b(llGRV.XOFNuVKJgZJT, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, aVar, 6, 0, 131070);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
