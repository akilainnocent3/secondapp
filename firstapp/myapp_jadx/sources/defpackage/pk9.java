package defpackage;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pk9 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ pk9(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ViewParent parent = ((View) aVar.O(AndroidCompositionLocals_androidKt.f)).getParent();
                    parent.getClass();
                    ((eme) parent).getWindow().setDimAmount(0.0f);
                    d dVarF = h.f(androidx.compose.foundation.a.b(lx80.d(d.a.b, 4.0f, null, false, 0L, 0L, 30), c68.a(R.color.background_type1_secondary, aVar), j060.c(4.0f)), 24.0f);
                    aiv aivVarC = g75.c(ht.a.e, false);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d dVarC = c.c(aVar, dVarF);
                    yka.k.getClass();
                    tsr.a aVar2 = yka.a.b;
                    if (aVar.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar.D();
                    if (aVar.g()) {
                        aVar.F(aVar2);
                    } else {
                        aVar.p();
                    }
                    hlh0.a(aVar, aivVarC, yka.a.f);
                    hlh0.a(aVar, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    hlh0.a(aVar, dVarC, yka.a.d);
                    q330.a(null, c68.a(R.color.brand_secondary, aVar), 0.0f, 0L, 0, 0.0f, aVar, 0, 61);
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                ved vedVar = (ved) obj2;
                return b.k(Integer.valueOf(vedVar.k()), Float.valueOf(f.d(vedVar.l(), -0.5f, 0.5f)), Integer.valueOf(vedVar.n()));
        }
    }
}
