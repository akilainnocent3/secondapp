package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class nc00 {
    public static final alb0 a = new alb0(R.style.B2_M, new g7f(28.0f), new umz(8.0f, 8.0f, 8.0f, 8.0f), jc1.a(16.0f, 16.0f), 4.0f);

    public static final void a(int i, a aVar) {
        b bVarI = aVar.i(2073238468);
        if (bVarI.q(i & 1, i != 0)) {
            d160 d160VarA = b160.a(new kw0.i(((cjb0) bVarI.O(ejb0.a)).c, true, new hw0()), ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar2 = d.a.b;
            d dVarC = c.c(bVarI, aVar2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.d(cb40.a(R.string.page_payment__enabled, new Object[0], bVarI), null, ((lib0) bVarI.O(oib0.a)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).o, bVarI, 0, 0, 131066);
            bVarI = bVarI;
            h9n.a(erz.a(R.drawable.ic__feature__match_status_won, 0, bVarI), null, j.r(aVar2, 12.0f), null, null, 0.0f, null, bVarI, 432, 120);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new dc00();
        }
    }

    public static final void b(final bd00 bd00Var, final Function1<? super ac00, Unit> function1, a aVar, final int i) {
        b bVarI = aVar.i(-1430235907);
        int i2 = (bVarI.M(bd00Var) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            ac8.c(48, 1, pp8.b(744166594, new Function2() { // from class: jc00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i3 = 0;
                    int i4 = 2;
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarG = j.g(d.a.b, 1.0f);
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarG);
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
                        hlh0.a(aVar2, i78VarA, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        String strA = cb40.a(R.string.page_payment__push_notification, new Object[0], aVar2);
                        bd00 bd00Var2 = bd00Var;
                        m3y m3yVar = bd00Var2.a;
                        Function1 function2 = function1;
                        boolean zM = aVar2.M(function2);
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zM || objY == c0042a) {
                            objY = new mc00(function2, i3);
                            aVar2.r(objY);
                        }
                        nc00.c(strA, m3yVar, R.drawable.ic__open_it, (Function0) objY, aVar2, 0);
                        m3y m3yVar2 = bd00Var2.b;
                        if (m3yVar2 == null) {
                            aVar2.N(73554158);
                            aVar2.H();
                        } else {
                            aVar2.N(73554159);
                            String strA2 = cb40.a(R.string.page_payment__in_app_notification, new Object[0], aVar2);
                            boolean zM2 = aVar2.M(function2);
                            Object objY2 = aVar2.y();
                            if (zM2 || objY2 == c0042a) {
                                objY2 = new vdc(function2, i4);
                                aVar2.r(objY2);
                            }
                            nc00.c(strA2, m3yVar2, R.drawable.ic__notification, (Function0) objY2, aVar2, 0);
                            aVar2.H();
                        }
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, false);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, i) { // from class: kc00
                public final /* synthetic */ Function1 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    nc00.b(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final String str, final m3y m3yVar, final int i, final Function0<Unit> function0, a aVar, final int i2) {
        b bVar;
        b bVarI = aVar.i(916960089);
        int i3 = i2 | (bVarI.M(str) ? 4 : 2) | (bVarI.d(m3yVar.ordinal()) ? 32 : 16) | (bVarI.d(i) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024);
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            d dVarG = j.g(d.a.b, 1.0f);
            qyd0 qyd0Var = ejb0.a;
            d dVarG2 = h.g(dVarG, ((cjb0) bVarI.O(qyd0Var)).e, ((cjb0) bVarI.O(qyd0Var)).d);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG2);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            lkf0.d(str, yy.a(bVarI, dVarC, yka.a.d, 1.0f, true), ((lib0) bVarI.O(oib0.a)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).j, bVarI, i3 & 14, 0, 131064);
            bVar = bVarI;
            int iOrdinal = m3yVar.ordinal();
            if (iOrdinal == 0) {
                bVar.N(840129516);
                a(0, bVar);
                bVar.X(false);
            } else {
                if (iOrdinal != 1) {
                    throw igf0.a(bVar, 840127738, false);
                }
                bVar.N(840131541);
                f(i, (i3 >> 6) & WebSocketProtocol.PAYLOAD_SHORT, bVar, function0);
                bVar.X(false);
            }
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, m3yVar, i, function0, i2) { // from class: cc00
                public final /* synthetic */ String a;
                public final /* synthetic */ m3y b;
                public final /* synthetic */ int c;
                public final /* synthetic */ Function0 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    nc00.c(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final bd00 bd00Var, final Function1<? super ac00, Unit> function1, a aVar, int i) {
        bd00Var.getClass();
        function1.getClass();
        b bVarI = aVar.i(440554331);
        int i2 = (bVarI.M(bd00Var) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarG = j.g(d.a.b, 1.0f);
            qyd0 qyd0Var = ajb0.a;
            ihe0.a(dVarG, j060.e(((zib0) bVarI.O(qyd0Var)).d, ((zib0) bVarI.O(qyd0Var)).d, 0.0f, 0.0f, 12), ((lib0) bVarI.O(oib0.a)).i0, 0L, 0.0f, 0.0f, null, pp8.b(1086637600, new Function2() { // from class: bc00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarJ = g3w.j(d.a.b, 14);
                        StringUiText stringUiText = vch0.a;
                        iyf0 iyf0Var = iyf0.a;
                        final Function1 function2 = function1;
                        z45.c cVar = new z45.c(new w45.b(pp8.b(1147422112, new gaj() { // from class: lc00
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                d dVar = (d) obj3;
                                a aVar3 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                dVar.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= aVar3.M(dVar) ? 4 : 2;
                                }
                                int i3 = 1;
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    d dVarG2 = j.g(dVar, 1.0f);
                                    String strA = cb40.a(R.string.page_payment__view_transaction, new Object[0], aVar3);
                                    alb0 alb0Var = y9a.a;
                                    alb0 alb0Var2 = g9z.a;
                                    qyd0 qyd0Var2 = oib0.a;
                                    f9z f9zVarB = g9z.b(((lib0) aVar3.O(qyd0Var2)).h, 0L, aVar3, 5);
                                    e9z e9zVarA = g9z.a(((lib0) aVar3.O(qyd0Var2)).D, 0L, aVar3, 5);
                                    Function1 function3 = function2;
                                    boolean zM = aVar3.M(function3);
                                    Object objY = aVar3.y();
                                    if (zM || objY == a.C0041a.a) {
                                        objY = new pl3(function3, i3);
                                        aVar3.r(objY);
                                    }
                                    p9z.a(dVarG2, strA, null, f9zVarB, e9zVarA, alb0Var, "pending_request_view_transaction_button", (Function0) objY, null, aVar3, 1572864, 260);
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2)));
                        qyd0 qyd0Var2 = ejb0.a;
                        m65 m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, ((cjb0) aVar2.O(qyd0Var2)).g, aVar2, 12);
                        h55 h55VarA = h55.a.a(new umz(0.0f, 0.0f, 0.0f, 0.0f), h.a(2, ((cjb0) aVar2.O(qyd0Var2)).g, 0.0f), h.a(2, ((cjb0) aVar2.O(qyd0Var2)).g, 0.0f), new umz(0.0f, 0.0f, 0.0f, 0.0f), aVar2, 0);
                        Object objY = aVar2.y();
                        if (objY == a.C0041a.a) {
                            objY = new hc00();
                            aVar2.r(objY);
                        }
                        final bd00 bd00Var2 = bd00Var;
                        jib0.e(dVarJ, stringUiText, 0L, iyf0Var, null, cVar, m65VarA, h55VarA, (Function0) objY, null, pp8.b(1844581599, new gaj() { // from class: ic00
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                a aVar3 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((j78) obj3).getClass();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    nc00.e(0, aVar3);
                                    ty0.a(aVar3, j.i(d.a.b, ((cjb0) aVar3.O(ejb0.a)).g));
                                    nc00.b(bd00Var2, function2, aVar3, 0);
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 100690944, 6, 516);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 12582918, 120);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new gc00(bd00Var, function1, i);
        }
    }

    public static final void e(int i, a aVar) {
        b bVarI = aVar.i(974017583);
        if (bVarI.q(i & 1, i != 0)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            i78 i78VarA = g78.a(new kw0.i(((cjb0) bVarI.O(ejb0.a)).e, true, new hw0()), ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            h9n.a(erz.a(R.drawable.ic__feature__match_status_won, 0, bVarI), null, j.r(aVar2, 48.0f), null, null, 0.0f, null, bVarI, 432, 120);
            String strA = cb40.a(R.string.page_payment__deposit_submitted_successfully, new Object[0], bVarI);
            imf0 imf0Var = ((ijb0) bVarI.O(kjb0.a)).d;
            qyd0 qyd0Var = oib0.a;
            lkf0.d(strA, null, ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 131066);
            bVarI = bVarI;
            bt50.a(cb40.a(R.string.page_payment__waiting_for_financial_institution_to_confirm, new Object[0], bVarI), null, null, imf0.b(mla.l(R.style.B1_R_21, bVarI), ((lib0) bVarI.O(qyd0Var)).a, 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777182), null, bVarI, 0, 22);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new tp8(i);
        }
    }

    public static final void f(final int i, final int i2, a aVar, final Function0 function0) {
        int i3;
        b bVarI = aVar.i(678406584);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            xya.b(null, false, null, a, null, Float.NaN, "pending_request_turn_on_button", function0, pp8.b(1136977378, new gaj() { // from class: ec00
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d160 d160VarA = b160.a(new kw0.i(((cjb0) aVar2.O(ejb0.a)).c, true, new hw0()), ht.a.k, aVar2, 48);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d.a aVar3 = d.a.b;
                        d dVarC = c.c(aVar2, aVar3);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, d160VarA, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        h6n.b(erz.a(i, 0, aVar2), null, j.s(nc00.a.d, aVar3), 0L, aVar2, 48, 8);
                        lkf0.d(cb40.a(R.string.page_payment__turn_on, new Object[0], aVar2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(kjb0.a)).n, aVar2, 0, 0, 131070);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 102432768 | ((i3 << 18) & 29360128), 23);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: fc00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    nc00.f(i, iA, (a) obj, function0);
                    return Unit.a;
                }
            };
        }
    }
}
