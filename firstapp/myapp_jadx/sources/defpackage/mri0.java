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

/* JADX INFO: loaded from: classes8.dex */
public final class mri0 {

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

    public static final void a(final nri0.b bVar, final Function1<? super bri0, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        e eVarZ;
        Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function2;
        bVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(-872716513);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Object objO = bVarI.O(zct.a);
            final fq0 fq0Var = objO instanceof fq0 ? (fq0) objO : null;
            if (fq0Var == null) {
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: gri0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int iA = qj40.a(i | 1);
                            mri0.a(bVar, function1, (a) obj, iA);
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
                    objY2 = new Function1() { // from class: hri0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            fq0 fq0Var2 = fq0Var;
                            final nri0.b bVar2 = bVar;
                            final Function1 function3 = function1;
                            use useVar = (use) obj;
                            useVar.getClass();
                            w4 w4Var = (w4) sjj.b().c.d.a(jq40.a(w4.class), null, null);
                            final ytw ytwVar2 = ytwVar;
                            ytwVar2.setValue(w4Var);
                            try {
                                zi50.a aVar2 = zi50.b;
                                w4 w4Var2 = (w4) ytwVar2.getValue();
                                if (w4Var2 != null) {
                                    FragmentManager supportFragmentManager = fq0Var2.getSupportFragmentManager();
                                    supportFragmentManager.getClass();
                                    w4Var2.m0(supportFragmentManager, new Function0() { // from class: jri0
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            w4 w4Var3 = (w4) ytwVar2.getValue();
                                            if (w4Var3 != null) {
                                                nri0.b bVar3 = bVar2;
                                                w4Var3.n0(bVar3.a, bVar3.b, bVar3.c, bVar3.d);
                                            }
                                            return Unit.a;
                                        }
                                    }, new gaj() { // from class: kri0
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            GiftItem giftItem = (GiftItem) obj2;
                                            double dDoubleValue = ((Double) obj3).doubleValue();
                                            ((Boolean) obj4).getClass();
                                            giftItem.getClass();
                                            function3.invoke(new bri0.e0(giftItem, dDoubleValue));
                                            return Unit.a;
                                        }
                                    }, new Function0() { // from class: lri0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function3.invoke(bri0.j.a);
                                            return Unit.a;
                                        }
                                    });
                                    Unit unit2 = Unit.a;
                                }
                            } catch (Throwable unused) {
                                zi50.a aVar3 = zi50.b;
                            }
                            return new mri0.a(useVar, ytwVar2);
                        }
                    };
                    bVarI.r(objY2);
                }
                xvf.c(unit, (Function1) objY2, bVarI);
            }
            eVarZ.d = function2;
        }
        bVarI.G();
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            function2 = new Function2() { // from class: iri0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    mri0.a(bVar, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
            eVarZ.d = function2;
        }
    }
}
