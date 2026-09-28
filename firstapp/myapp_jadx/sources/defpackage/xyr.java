package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xyr extends b<wyr> implements szr {
    public final rsw<wyr> a = new rsw<>();
    public lsw b;

    public static final class a implements iaj<gwr, Integer, androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ gaj<gwr, androidx.compose.runtime.a, Integer, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(gaj<? super gwr, ? super androidx.compose.runtime.a, ? super Integer, Unit> gajVar) {
            this.a = gajVar;
        }

        @Override // defpackage.iaj
        public final Unit d(gwr gwrVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            gwr gwrVar2 = gwrVar;
            num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num2.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= aVar2.M(gwrVar2) ? 4 : 2;
            }
            if (aVar2.q(iIntValue & 1, (iIntValue & 131) != 130)) {
                this.a.invoke(gwrVar2, aVar2, Integer.valueOf(iIntValue & 14));
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public xyr(Function1<? super szr, Unit> function1) {
        function1.invoke(this);
    }

    @Override // defpackage.szr
    public final void b(Object obj, String str, op8 op8Var) {
        lsw lswVar = this.b;
        if (lswVar == null) {
            lswVar = new lsw();
            this.b = lswVar;
        }
        rsw<wyr> rswVar = this.a;
        lswVar.a(rswVar.b);
        i(obj, str, new op8(-1588696110, new yyr(rswVar.b, op8Var), true));
    }

    @Override // defpackage.szr
    public final void d(int i, Function1 function1, Function1 function2, op8 op8Var) {
        this.a.a(i, new wyr(function1, function2, op8Var));
    }

    @Override // defpackage.szr
    public final void i(Object obj, Object obj2, gaj<? super gwr, ? super androidx.compose.runtime.a, ? super Integer, Unit> gajVar) {
        this.a.a(1, new wyr(obj != null ? new ql4(obj, 1) : null, new ql4(obj2, 1), new op8(-857469575, new a(gajVar), true)));
    }

    @Override // androidx.compose.foundation.lazy.layout.b
    public final rsw j() {
        return this.a;
    }
}
