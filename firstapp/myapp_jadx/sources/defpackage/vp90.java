package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class vp90 extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ ytw a;
    public final /* synthetic */ nwa b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp90(ytw ytwVar, nwa nwaVar, Function0 function0, float f) {
        super(2);
        this.a = ytwVar;
        this.b = nwaVar;
        this.c = function0;
        this.d = f;
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
            crz crzVarA = erz.a(R.drawable.ic_football_light, 0, aVar2);
            Object objY = aVar2.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = wp90.a;
                aVar2.r(objY);
            }
            d.a aVar3 = d.a.b;
            h9n.a(crzVarA, null, nwa.d(aVar3, cwaVarE, (Function1) objY), null, null, 0.0f, null, aVar2, 48, 120);
            boolean zM = aVar2.M(cwaVarE);
            Object objY2 = aVar2.y();
            if (zM || objY2 == c0042a) {
                objY2 = new xp90(cwaVarE);
                aVar2.r(objY2);
            }
            ty0.a(aVar2, nwa.d(aVar3, cwaVarE2, (Function1) objY2));
            crz crzVarA2 = erz.a(R.drawable.ic_football, 0, aVar2);
            boolean zM2 = aVar2.M(cwaVarE2);
            Object objY3 = aVar2.y();
            if (zM2 || objY3 == c0042a) {
                objY3 = new yp90(cwaVarE2);
                aVar2.r(objY3);
            }
            d dVarD = nwa.d(aVar3, cwaVarE3, (Function1) objY3);
            float f = this.d;
            boolean zC = aVar2.c(f);
            Object objY4 = aVar2.y();
            if (zC || objY4 == c0042a) {
                objY4 = new zp90(f);
                aVar2.r(objY4);
            }
            h9n.a(crzVarA2, "Football image", androidx.compose.ui.graphics.a.a(dVarD, (Function1) objY4), null, null, 0.0f, null, aVar2, 48, 120);
            aVar2.H();
            if (nwaVar.b != i) {
                use useVar = xvf.a;
                aVar2.t(this.c);
            }
        }
        return Unit.a;
    }
}
