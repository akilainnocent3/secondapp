package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jpf implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jpf(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                ytw ytwVar = (ytw) obj4;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((gwr) obj).getClass();
                if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
                    Object objY = aVar.y();
                    if (objY == a.C0041a.a) {
                        objY = new npf(ytwVar, i2);
                        aVar.r(objY);
                    }
                    dpf.a(zBooleanValue, (Function1) objY, aVar, 48);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                f2u f2uVar = (f2u) obj4;
                a aVar2 = (a) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((j78) obj).getClass();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    d dVarE = j.e(d.a.b, 1.0f);
                    uf00<j58> uf00Var = f2uVar.c;
                    float f = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
                    d dVarA = androidx.compose.foundation.a.a(dVarE, new hfs(uf00Var, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), null, 0.0f, 6);
                    aiv aivVarC = g75.c(ht.a.e, false);
                    int iHashCode = Long.hashCode(aVar2.m());
                    ne00 ne00VarO = aVar2.o();
                    d dVarC = c.c(aVar2, dVarA);
                    yka.k.getClass();
                    tsr.a aVar3 = yka.a.b;
                    if (aVar2.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar2.D();
                    if (aVar2.g()) {
                        aVar2.F(aVar3);
                    } else {
                        aVar2.p();
                    }
                    hlh0.a(aVar2, aivVarC, yka.a.f);
                    hlh0.a(aVar2, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                    }
                    hlh0.a(aVar2, dVarC, yka.a.d);
                    lkf0.d(cb40.a(R.string.page_loyalty__check_benefit, new Object[0], aVar2), null, c68.a(R.color.text_type2_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, aVar2), aVar2, 0, 0, 130042);
                    aVar2.s();
                } else {
                    aVar2.G();
                }
                return Unit.a;
        }
    }
}
