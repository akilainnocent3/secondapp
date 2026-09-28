package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.MarketExtend;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u7u {
    public static final void a(final int i, final op8 op8Var, a aVar) {
        e eVarZ;
        Function2<? super a, ? super Integer, Unit> function2;
        Object obj;
        b bVarI = aVar.i(1892922778);
        int i2 = 1;
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            chf chfVar = AndroidCompositionLocals_androidKt.a;
            Configuration configuration = (Configuration) bVarI.O(chfVar);
            if ((configuration.uiMode & 48) == 32) {
                bVarI.N(-857868832);
                op8Var.invoke(bVarI, 6);
                bVarI.X(false);
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    function2 = new Function2(i, op8Var) { // from class: o7u
                        public final /* synthetic */ op8 a;

                        {
                            this.a = op8Var;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            u7u.a(qj40.a(7), this.a, (a) obj2);
                            return Unit.a;
                        }
                    };
                }
            } else {
                bVarI.N(-857830392);
                bVarI.X(false);
                qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
                Context context = (Context) bVarI.O(qyd0Var);
                boolean zM = bVarI.M(configuration);
                Object objY = bVarI.y();
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (zM || objY == c0042a) {
                    obj = objY;
                    Configuration configuration2 = new Configuration(configuration);
                    configuration2.uiMode = (configuration2.uiMode & (-49)) | 32;
                    bVarI.r(configuration2);
                    obj = configuration2;
                }
                Configuration configuration3 = (Configuration) obj;
                boolean zM2 = bVarI.M(context) | bVarI.M(configuration3);
                Object objY2 = bVarI.y();
                if (zM2 || objY2 == c0042a) {
                    objY2 = context.createConfigurationContext(configuration3);
                    bVarI.r(objY2);
                }
                Context context2 = (Context) objY2;
                j730 j730VarA = chfVar.a(configuration3);
                context2.getClass();
                hna.b(new j730[]{j730VarA, qyd0Var.a(context2)}, pp8.b(-285455782, new lkk(op8Var, i2), bVarI), bVarI, 48);
            }
            eVarZ.d = function2;
        }
        bVarI.G();
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            function2 = new Function2(i, op8Var) { // from class: p7u
                public final /* synthetic */ op8 a;

                {
                    this.a = op8Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    u7u.a(qj40.a(7), this.a, (a) obj2);
                    return Unit.a;
                }
            };
            eVarZ.d = function2;
        }
    }

    public static final void b(final int i, final int i2, final op8 op8Var, a aVar, final boolean z) {
        int i3;
        b bVarI = aVar.i(-1108373434);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = 1;
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                z = false;
            }
            if (z) {
                bVarI.N(155722054);
                a(6, pp8.b(600390482, new bkk(op8Var, i5), bVarI), bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(155812140);
                c(6, op8Var, bVarI);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: n7u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u7u.b(qj40.a(i | 1), i2, op8Var, (a) obj, z);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final int i, final op8 op8Var, a aVar) {
        int i2;
        b bVarI = aVar.i(-1324070217);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(op8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            boolean zA = doc.a(bVarI);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(new ot50(zA ? j58.f : j58.b, new nt50(0.2f, 0.2f, 0.2f, 0.2f)));
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            Boolean boolValueOf = Boolean.valueOf(zA);
            boolean zB = bVarI.b(zA);
            Object objY2 = bVarI.y();
            if (zB || objY2 == c0042a) {
                objY2 = new t7u(zA, ytwVar, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, boolValueOf, (Function2) objY2);
            o0z.a(null, null, null, null, null, pp8.b(1728557094, new Function2() { // from class: q7u
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        qyd0 qyd0Var = oib0.a;
                        j730[] j730VarArr = {ut50.a.a((ot50) ytwVar.getValue()), cmf0.a.a(new bmf0(((lib0) aVar2.O(qyd0Var)).x0, ((lib0) aVar2.O(qyd0Var)).B0))};
                        final op8 op8Var2 = op8Var;
                        hna.b(j730VarArr, pp8.b(99144934, new Function2() { // from class: s7u
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar3 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    op8Var2.invoke(aVar3, 0);
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 48);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 196608);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: r7u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u7u.c(qj40.a(i | 1), op8Var, (a) obj);
                    return Unit.a;
                }
            };
        }
    }

    public static final boolean d(Selection selection, Selection selection2) {
        if (selection == null || selection2 == null || !Intrinsics.g(selection.a, selection2.a) || !Intrinsics.g(selection.b.specifier, selection2.b.specifier)) {
            return false;
        }
        return Intrinsics.g(selection.c, selection2.c);
    }

    public static final boolean e(Selection selection) {
        return xvy.a(selection != null ? selection.b : null) != null;
    }

    public static final boolean f(Selection selection) {
        return xvy.b(selection != null ? selection.b : null) != null;
    }

    public static final boolean g(Selection selection) {
        Market market;
        MarketExtend marketExtendA;
        if (selection == null || (market = selection.b) == null || (marketExtendA = xvy.a(market)) == null) {
            return false;
        }
        return Intrinsics.g(market.id, marketExtendA.nodeMarketId);
    }

    public static final boolean h(Selection selection) {
        Market market;
        MarketExtend marketExtendA;
        if (selection == null || selection.q() || (market = selection.b) == null || (marketExtendA = xvy.a(market)) == null) {
            return false;
        }
        return !marketExtendA.notSupport && e(selection);
    }

    public static final boolean i(Selection selection) {
        Market market;
        MarketExtend marketExtendB;
        if (selection == null || selection.q() || (market = selection.b) == null || (marketExtendB = xvy.b(market)) == null) {
            return false;
        }
        return !marketExtendB.notSupport && f(selection);
    }

    public static final boolean j(Selection selection) {
        Market market;
        MarketExtend marketExtendB;
        if (selection == null || (market = selection.b) == null || (marketExtendB = xvy.b(market)) == null) {
            return false;
        }
        return Intrinsics.g(market.id, marketExtendB.nodeMarketId);
    }
}
