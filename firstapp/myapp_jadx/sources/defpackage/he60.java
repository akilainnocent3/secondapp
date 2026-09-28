package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.fragment.app.FragmentManager;
import com.sportygames.common.ui.model.GiftItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class he60 {

    public static final class a implements tse {
        public final /* synthetic */ ytw a;

        public a(use useVar, ytw ytwVar) {
            this.a = ytwVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.tse
        public final void dispose() {
            w4 w4Var;
            ytw ytwVar = this.a;
            try {
                zi50.a aVar = zi50.b;
                w4 w4Var2 = (w4) ytwVar.getValue();
                if (w4Var2 != null && w4Var2.isAdded() && (w4Var = (w4) ytwVar.getValue()) != null) {
                    w4Var.j0();
                }
                Unit unit = Unit.a;
            } catch (Throwable unused) {
                zi50.a aVar2 = zi50.b;
            }
        }
    }

    public static final void a(final xw2.a aVar, final Function1<? super yw2, Unit> function1, androidx.compose.runtime.a aVar2, final int i) {
        e eVarZ;
        Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> r220Var;
        function1.getClass();
        b bVarI = aVar2.i(1051210290);
        int i2 = (bVarI.M(aVar) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Object objO = bVarI.O(zct.a);
            final fq0 fq0Var = objO instanceof fq0 ? (fq0) objO : null;
            if (fq0Var == null) {
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    r220Var = new Function2(function1, i) { // from class: fe60
                        public final /* synthetic */ Function1 b;

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(1);
                            he60.a(this.a, this.b, (a) obj, iA);
                            return Unit.a;
                        }
                    };
                }
            } else {
                Object objY = bVarI.y();
                androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                if (objY == c0042a) {
                    objY = m.b(null);
                    bVarI.r(objY);
                }
                final ytw ytwVar = (ytw) objY;
                Unit unit = Unit.a;
                boolean zA = ((i2 & 14) == 4) | bVarI.A(fq0Var) | ((i2 & 112) == 32);
                Object objY2 = bVarI.y();
                if (zA || objY2 == c0042a) {
                    objY2 = new Function1() { // from class: ge60
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            fq0 fq0Var2 = fq0Var;
                            final xw2.a aVar3 = aVar;
                            final Function1 function2 = function1;
                            use useVar = (use) obj;
                            useVar.getClass();
                            w4 w4Var = (w4) sjj.b().c.d.a(jq40.a(w4.class), null, null);
                            final ytw ytwVar2 = ytwVar;
                            ytwVar2.setValue(w4Var);
                            try {
                                zi50.a aVar4 = zi50.b;
                                w4 w4Var2 = (w4) ytwVar2.getValue();
                                if (w4Var2 != null) {
                                    FragmentManager supportFragmentManager = fq0Var2.getSupportFragmentManager();
                                    supportFragmentManager.getClass();
                                    w4Var2.m0(supportFragmentManager, new Function0() { // from class: ce60
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            w4 w4Var3 = (w4) ytwVar2.getValue();
                                            if (w4Var3 != null) {
                                                xw2.a aVar5 = aVar3;
                                                w4Var3.n0(aVar5.a, aVar5.b, aVar5.c, aVar5.d);
                                            }
                                            return Unit.a;
                                        }
                                    }, new gaj() { // from class: de60
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            GiftItem giftItem = (GiftItem) obj2;
                                            double dDoubleValue = ((Double) obj3).doubleValue();
                                            ((Boolean) obj4).getClass();
                                            giftItem.getClass();
                                            function2.invoke(new yw2.n(giftItem, dDoubleValue));
                                            return Unit.a;
                                        }
                                    }, new ee60(0, function2));
                                    Unit unit2 = Unit.a;
                                }
                            } catch (Throwable unused) {
                                zi50.a aVar5 = zi50.b;
                            }
                            return new he60.a(useVar, ytwVar2);
                        }
                    };
                    bVarI.r(objY2);
                }
                xvf.c(unit, (Function1) objY2, bVarI);
            }
            eVarZ.d = r220Var;
        }
        bVarI.G();
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            r220Var = new r220(aVar, function1, i, 1);
            eVarZ.d = r220Var;
        }
    }
}
