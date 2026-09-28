package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class t8j0 implements gaj<d, a, Integer, d> {
    public final /* synthetic */ Function1<g8j0, Unit> a;

    /* JADX WARN: Multi-variable type inference failed */
    public t8j0(Function1<? super g8j0, Unit> function1) {
        this.a = function1;
    }

    @Override // defpackage.gaj
    public final d invoke(d dVar, a aVar, Integer num) {
        a aVar2 = aVar;
        num.intValue();
        aVar2.N(-1608161351);
        Function1<g8j0, Unit> function1 = this.a;
        boolean zM = aVar2.M(function1);
        Object objY = aVar2.y();
        if (zM || objY == a.C0041a.a) {
            objY = new nya(function1);
            aVar2.r(objY);
        }
        nya nyaVar = (nya) objY;
        aVar2.H();
        return nyaVar;
    }
}
