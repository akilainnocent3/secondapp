package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v0a implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ v0a(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    kw0.i iVar = new kw0.i(fjb0.d(aVar).d, true, new hw0());
                    float f = fjb0.d(aVar).e;
                    float f2 = fjb0.d(aVar).e;
                    float f3 = fjb0.d(aVar).e;
                    d.a aVar2 = d.a.b;
                    d dVarJ = h.j(aVar2, f, f2, 0.0f, f3, 4);
                    i78 i78VarA = g78.a(iVar, ht.a.m, aVar, 0);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d dVarC = c.c(aVar, dVarJ);
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
                    yka.a.b bVar = yka.a.f;
                    hlh0.a(aVar, i78VarA, bVar);
                    yka.a.d dVar = yka.a.e;
                    hlh0.a(aVar, ne00VarO, dVar);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    yka.a.c cVar = yka.a.d;
                    hlh0.a(aVar, dVarC, cVar);
                    lkf0.d("1 Free Lucky Spin", null, fjb0.b(aVar).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(aVar).m, aVar, 6, 0, 131066);
                    lkf0.d("Win up to Y GHS instantly!\n *Top up X GHS to spin.", null, fjb0.b(aVar).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(aVar).o, aVar, 6, 0, 131066);
                    d dVarG = h.g(androidx.compose.foundation.a.b(aVar2, fjb0.b(aVar).d1, j060.c(fjb0.c(aVar).c)), fjb0.d(aVar).d, fjb0.d(aVar).c);
                    d160 d160VarA = b160.a(new kw0.i(fjb0.d(aVar).c, true, new iw0(ht.a.n)), ht.a.k, aVar, 48);
                    int iHashCode2 = Long.hashCode(aVar.m());
                    ne00 ne00VarO2 = aVar.o();
                    d dVarC2 = c.c(aVar, dVarG);
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
                    hlh0.a(aVar, d160VarA, bVar);
                    hlh0.a(aVar, ne00VarO2, dVar);
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode2))) {
                        j3c.a(iHashCode2, aVar, iHashCode2, c1350a);
                    }
                    hlh0.a(aVar, dVarC2, cVar);
                    h9n.a(erz.a(R.drawable.mission_coin, 0, aVar), null, j.r(aVar2, 16.0f), null, null, 0.0f, null, aVar, 432, 120);
                    lkf0.d("NGN 5.00", null, fjb0.b(aVar).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(aVar).o, aVar, 6, 0, 131066);
                    aVar.s();
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                return new ule((asm) qn70Var.a(jq40.a(asm.class), null, null), (kum) qn70Var.a(jq40.a(kum.class), null, null));
        }
    }
}
