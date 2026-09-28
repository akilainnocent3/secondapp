package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bwg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ haj c;

    public /* synthetic */ bwg(int i, haj hajVar, Object obj) {
        this.a = i;
        this.b = obj;
        this.c = hajVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        haj hajVar = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                List list = (List) obj2;
                szr szrVar = (szr) obj;
                szrVar.getClass();
                szrVar.d(list.size(), new ewg(new uvg(), list), new fwg(list), new op8(2039820996, new gwg(list, (Function0) hajVar), true));
                break;
            default:
                final cuq.d dVar = (cuq.d) obj2;
                final Function1 function1 = (Function1) hajVar;
                szr szrVar2 = (szr) obj;
                szrVar2.getClass();
                szr.h(szrVar2, "notice_board", new op8(-1395777348, new gaj() { // from class: dtq
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        gwr gwrVar = (gwr) obj3;
                        a aVar = (a) obj4;
                        int iIntValue = ((Integer) obj5).intValue();
                        gwrVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= aVar.M(gwrVar) ? 4 : 2;
                        }
                        if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                            gzg0 gzg0VarE = yi0.e(300, 0, null, 6);
                            gzg0 gzg0VarE2 = yi0.e(300, 0, null, 6);
                            fkd0 fkd0VarD = yi0.d(0.0f, 200.0f, null, 5);
                            d.a aVar2 = d.a.b;
                            d dVarC = gwrVar.c(aVar2, gzg0VarE, fkd0VarD, gzg0VarE2);
                            kw0.k kVar = kw0.c;
                            n54.a aVar3 = ht.a.n;
                            i78 i78VarA = g78.a(kVar, aVar3, aVar, 48);
                            int iHashCode = Long.hashCode(aVar.m());
                            ne00 ne00VarO = aVar.o();
                            d dVarC2 = c.c(aVar, dVarC);
                            yka.k.getClass();
                            tsr.a aVar4 = yka.a.b;
                            if (aVar.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar.D();
                            if (aVar.g()) {
                                aVar.F(aVar4);
                            } else {
                                aVar.p();
                            }
                            yka.a.b bVar = yka.a.f;
                            hlh0.a(aVar, i78VarA, bVar);
                            yka.a.d dVar2 = yka.a.e;
                            hlh0.a(aVar, ne00VarO, dVar2);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar, iHashCode, c1350a);
                            }
                            yka.a.c cVar = yka.a.d;
                            hlh0.a(aVar, dVarC2, cVar);
                            cuq.d dVar3 = dVar;
                            txt.a(dVar3.c, dVar3.d, 0, aVar);
                            ty0.a(aVar, j.i(aVar2, 4.0f));
                            d dVarG = h.g(j.i(aVar2, 20.0f), 8.0f, 4.0f);
                            Function1 function2 = function1;
                            boolean zM = aVar.M(function2);
                            Object objY = aVar.y();
                            if (zM || objY == a.C0041a.a) {
                                objY = new zg8(function2, 1);
                                aVar.r(objY);
                            }
                            d dVarH = g3w.h(g3w.f(dVarG, true, (Function0) objY), "go_to_sporty_loyalty_button");
                            d160 d160VarA = b160.a(new kw0.i(2.0f, true, new iw0(aVar3)), ht.a.k, aVar, 54);
                            int iHashCode2 = Long.hashCode(aVar.m());
                            ne00 ne00VarO2 = aVar.o();
                            d dVarC3 = c.c(aVar, dVarH);
                            if (aVar.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar.D();
                            if (aVar.g()) {
                                aVar.F(aVar4);
                            } else {
                                aVar.p();
                            }
                            hlh0.a(aVar, d160VarA, bVar);
                            hlh0.a(aVar, ne00VarO2, dVar2);
                            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar, iHashCode2, c1350a);
                            }
                            hlh0.a(aVar, dVarC3, cVar);
                            lkf0.d(cb40.a(R.string.page_virtuals_lobby__go_to_sporty_loyalty, new Object[0], aVar), null, c68.a(R.color.text_inverse_brand_sub, aVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.C1_R, aVar), aVar, 0, 0, 131066);
                            h9n.a(erz.a(R.drawable.icon_arrow1_right, 0, aVar), null, null, null, null, 0.0f, new gf4(c68.a(R.color.text_inverse_brand_sub, aVar), 5), aVar, 48, 60);
                            aVar.s();
                            aVar.s();
                        } else {
                            aVar.G();
                        }
                        return Unit.a;
                    }
                }, true), 2);
                qcn<kwv> qcnVar = dVar.a;
                szrVar2.d(qcnVar.size(), new ktq(new etq(0), qcnVar), new ltq(qcnVar), new op8(802480018, new mtq(qcnVar, dVar, function1), true));
                break;
        }
        return Unit.a;
    }
}
