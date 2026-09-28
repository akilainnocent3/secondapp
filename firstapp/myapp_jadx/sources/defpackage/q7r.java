package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q7r implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                a8r a8rVar = (a8r) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d160 d160VarA = b160.a(new kw0.i(5.0f, true, new hw0()), ht.a.k, aVar, 54);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d.a aVar2 = d.a.b;
                    d dVarC = c.c(aVar, aVar2);
                    yka.k.getClass();
                    tsr.a aVar3 = yka.a.b;
                    if (aVar.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar.D();
                    if (aVar.g()) {
                        aVar.F(aVar3);
                    } else {
                        aVar.p();
                    }
                    hlh0.a(aVar, d160VarA, yka.a.f);
                    hlh0.a(aVar, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    hlh0.a(aVar, dVarC, yka.a.d);
                    d dVarR = j.r(aVar2, 16.0f);
                    int i2 = a8rVar.b;
                    ResourceUiText resourceUiText = a8rVar.a;
                    crz crzVarA = erz.a(i2, 0, aVar);
                    qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
                    h6n.b(crzVarA, resourceUiText.g((Context) aVar.O(qyd0Var)), dVarR, 0L, aVar, 384, 8);
                    lkf0.d(resourceUiText.g((Context) aVar.O(qyd0Var)), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar.O(kjb0.a)).j, aVar, 0, 0, 131070);
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                vi00.a((kl00) obj3, (a) obj, qj40.a(1));
                return Unit.a;
        }
    }
}
