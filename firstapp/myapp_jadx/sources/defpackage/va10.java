package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class va10 extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ ytw a;
    public final /* synthetic */ nwa b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va10(ytw ytwVar, nwa nwaVar, Function0 function0, Function0 function1, String str, Function0 function2, Function0 function3) {
        super(2);
        this.a = ytwVar;
        this.b = nwaVar;
        this.c = function0;
        this.d = function1;
        this.e = str;
        this.f = function2;
        this.i = function3;
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
            cwa cwaVarE3 = nwaVar2.e();
            cwa cwaVarE4 = nwaVar2.e();
            cwa cwaVarE5 = nwaVar2.e();
            d.a aVar3 = d.a.b;
            d dVarR = j.r(aVar3, 36.0f);
            Object objY = aVar2.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = wa10.a;
                aVar2.r(objY);
            }
            c6n.a(this.d, nwa.d(dVarR, cwaVarE, (Function1) objY), false, null, null, hj9.a, aVar2, 1572864, 60);
            Object objY2 = aVar2.y();
            if (objY2 == c0042a) {
                objY2 = xa10.a;
                aVar2.r(objY2);
            }
            lkf0.d(this.e, nwa.d(aVar3, cwaVarE2, (Function1) objY2), c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_M, aVar2), aVar2, 0, 0, 131064);
            d dVarR2 = j.r(aVar3, 32.0f);
            boolean zM = aVar2.M(cwaVarE4);
            Object objY3 = aVar2.y();
            if (zM || objY3 == c0042a) {
                objY3 = new ya10(cwaVarE4);
                aVar2.r(objY3);
            }
            c6n.a(this.f, nwa.d(dVarR2, cwaVarE3, (Function1) objY3), false, null, null, hj9.b, aVar2, 1572864, 60);
            d dVarR3 = j.r(aVar3, 32.0f);
            Object objY4 = aVar2.y();
            if (objY4 == c0042a) {
                objY4 = za10.a;
                aVar2.r(objY4);
            }
            c6n.a(this.i, h.j(nwa.d(dVarR3, cwaVarE4, (Function1) objY4), 0.0f, 0.0f, 4.0f, 0.0f, 11), false, null, null, hj9.c, aVar2, 1572864, 60);
            d dVarI = j.i(j.g(aVar3, 1.0f), 1.0f);
            Object objY5 = aVar2.y();
            if (objY5 == c0042a) {
                objY5 = ab10.a;
                aVar2.r(objY5);
            }
            g75.a(androidx.compose.foundation.a.b(nwa.d(dVarI, cwaVarE5, (Function1) objY5), c68.a(R.color.border_primary, aVar2), zk40.a), aVar2, 0);
            aVar2.H();
            if (nwaVar.b != i) {
                use useVar = xvf.a;
                aVar2.t(this.c);
            }
        }
        return Unit.a;
    }
}
