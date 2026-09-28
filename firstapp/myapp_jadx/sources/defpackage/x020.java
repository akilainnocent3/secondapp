package defpackage;

import android.view.MotionEvent;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class x020 extends qlr implements gaj<d, a, Integer, d> {
    public final /* synthetic */ Function1<MotionEvent, Boolean> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x020(Function1 function1) {
        super(3);
        this.a = function1;
    }

    @Override // defpackage.gaj
    public final d invoke(d dVar, a aVar, Integer num) {
        a aVar2 = aVar;
        num.intValue();
        aVar2.N(374375707);
        Object objY = aVar2.y();
        if (objY == a.C0041a.a) {
            objY = new v020();
            aVar2.r(objY);
        }
        v020 v020Var = (v020) objY;
        v020Var.b = this.a;
        ma50 ma50Var = v020Var.c;
        if (ma50Var != null) {
            ma50Var.a = null;
        }
        v020Var.c = null;
        aVar2.H();
        return v020Var;
    }
}
