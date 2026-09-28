package defpackage;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a3w implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        d dVar = (d) obj;
        a aVar = (a) obj2;
        e3w.a((Integer) obj3, dVar, aVar, 1702545616);
        View view = (View) aVar.O(AndroidCompositionLocals_androidKt.f);
        int i = 0;
        boolean zA = aVar.A(view) | aVar.b(false) | aVar.b(false);
        Object objY = aVar.y();
        if (zA || objY == a.C0041a.a) {
            objY = new n2w(view, i);
            aVar.r(objY);
        }
        use useVar = xvf.a;
        aVar.t((Function0) objY);
        aVar.H();
        return dVar;
    }
}
