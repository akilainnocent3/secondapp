package defpackage;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.v;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class sai0 {
    public static final Pair a(a aVar) {
        Object objY = aVar.y();
        Object obj = a.C0041a.a;
        if (objY == obj) {
            objY = m.b(Boolean.FALSE);
            aVar.r(objY);
        }
        final ytw ytwVar = (ytw) objY;
        final View view = (View) aVar.O(AndroidCompositionLocals_androidKt.f);
        boolean zA = aVar.A(view);
        Object objY2 = aVar.y();
        if (zA || objY2 == obj) {
            objY2 = new Function1() { // from class: rai0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    urr urrVar = (urr) obj2;
                    urrVar.getClass();
                    int[] iArr = new int[2];
                    View view2 = view;
                    view2.getLocationOnScreen(iArr);
                    int i = iArr[1];
                    int height = view2.getHeight() + i;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (urrVar.T(0L) & 4294967295L));
                    ytwVar.setValue(Boolean.valueOf(fIntBitsToFloat >= ((float) i) && ((float) ((int) (urrVar.a() & 4294967295L))) + fIntBitsToFloat <= ((float) height)));
                    return Unit.a;
                }
            };
            aVar.r(objY2);
        }
        return new Pair(v.a(d.a.b, (Function1) objY2), ytwVar);
    }
}
