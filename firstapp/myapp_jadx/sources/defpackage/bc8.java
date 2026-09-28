package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bc8 implements gaj {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ bc8(long j, Function0 function0, boolean z) {
        this.a = z;
        this.b = j;
        this.c = function0;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        d dVar = (d) obj;
        a aVar = (a) obj2;
        ((Integer) obj3).getClass();
        dVar.getClass();
        aVar.N(-681804989);
        Object objY = aVar.y();
        a.C0041a.C0042a c0042a = a.C0041a.a;
        if (objY == c0042a) {
            objY = m.b(0L);
            aVar.r(objY);
        }
        final ytw ytwVar = (ytw) objY;
        final long j = this.b;
        boolean zE = aVar.e(j);
        final Function0 function0 = this.c;
        boolean zM = zE | aVar.M(function0);
        Object objY2 = aVar.y();
        if (zM || objY2 == c0042a) {
            objY2 = new Function0() { // from class: cc8
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    ytw ytwVar2 = ytwVar;
                    if (jCurrentTimeMillis - ((Number) ytwVar2.getValue()).longValue() >= j) {
                        ytwVar2.setValue(Long.valueOf(jCurrentTimeMillis));
                        function0.invoke();
                    }
                    return Unit.a;
                }
            };
            aVar.r(objY2);
        }
        d dVarD = androidx.compose.foundation.d.d(dVar, this.a, null, null, (Function0) objY2, 14);
        aVar.H();
        return dVarD;
    }
}
