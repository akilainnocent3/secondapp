package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xs3 implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xs3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                kt3 kt3Var = (kt3) obj4;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e160) obj).getClass();
                if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    d160 d160VarA = b160.a(kw0.a, ht.a.j, aVar, 0);
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
                    String strA = gky.a.a(kt3Var.b, false);
                    qyd0 qyd0Var = oib0.a;
                    lkf0.d(strA, j.x(aVar2, 44.0f, 50.0f), ((lib0) aVar.O(qyd0Var)).i, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) aVar.O(kjb0.a)).i, aVar, 48, 0, 130040);
                    h9n.a(erz.a(R.drawable.ic__plus_circle, 0, aVar), null, j.r(aVar2, 16.0f), null, null, 0.0f, new gf4(((lib0) aVar.O(qyd0Var)).i, 5), aVar, 432, 56);
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                Function1 function1 = (Function1) obj4;
                a aVar4 = (a) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((e160) obj).getClass();
                if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zM = aVar4.M(function1);
                    Object objY = aVar4.y();
                    if (zM || objY == a.C0041a.a) {
                        objY = new afh(function1, 1);
                        aVar4.r(objY);
                    }
                    c6n.a((Function0) objY, null, false, null, null, al9.a, aVar4, 1572864, 62);
                } else {
                    aVar4.G();
                }
                return Unit.a;
        }
    }
}
