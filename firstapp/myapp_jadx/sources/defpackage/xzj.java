package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class xzj extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ ytw a;
    public final /* synthetic */ nwa b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ imf0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzj(ytw ytwVar, nwa nwaVar, Function0 function0, Integer num, imf0 imf0Var) {
        super(2);
        this.a = ytwVar;
        this.b = nwaVar;
        this.c = function0;
        this.d = num;
        this.e = imf0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        if ((num.intValue() & 3) == 2 && aVar2.j()) {
            aVar2.G();
        } else {
            this.a.setValue(Unit.a);
            nwa nwaVar = this.b;
            int i = nwaVar.b;
            nwa nwaVar2 = nwa.this;
            cwa cwaVarE = nwaVar2.e();
            cwa cwaVarE2 = nwaVar2.e();
            nwaVar2.e();
            aVar2.N(-838330411);
            aVar2.H();
            String strA = null;
            boolean zM = aVar2.M(cwaVarE) | aVar2.M(null);
            Object objY = aVar2.y();
            if (zM || objY == a.C0041a.a) {
                objY = new szj();
                aVar2.r(objY);
            }
            d dVarH = h.h(nwa.d(d.a.b, cwaVarE2, (Function1) objY), 0.0f, 0.0f, 2);
            Integer num2 = this.d;
            if (num2 == null) {
                aVar2.N(-837832614);
            } else {
                aVar2.N(-837832613);
                strA = cb40.a(num2.intValue(), new Object[0], aVar2);
            }
            aVar2.H();
            if (strA == null) {
                strA = "";
            }
            lkf0.d(strA, dVarH, 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, this.e, aVar2, 0, 0, 130044);
            aVar2.N(-837684217);
            aVar2.H();
            aVar2.H();
            if (nwaVar.b != i) {
                use useVar = xvf.a;
                aVar2.t(this.c);
            }
        }
        return Unit.a;
    }
}
