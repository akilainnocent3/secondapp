package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class is9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((j78) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            d dVarG = j.g(d.a.b, 1.0f);
            List listK = b.k(new jmh0("1", "First Game", "", 123, "", "Fun Games"), new jmh0("2", "Second Game", "", 66, "", "Fun Games"), new jmh0("3", "Game With a Big Big Name", "", null, "", "Fun Games"));
            Object objY = aVar.y();
            if (objY == a.C0041a.a) {
                objY = new wr9();
                aVar.r(objY);
            }
            imh0.a(dVarG, null, listK, (Function2) objY, aVar, 3078, 2);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
