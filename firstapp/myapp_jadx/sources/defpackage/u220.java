package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.book.data.entity.UserPref;
import com.sporty.android.book.domain.entity.PopoverCategory;
import com.sporty.android.book.domain.entity.UIState;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u220 {

    @c0d(c = "com.sporty.android.book.presentation.popovers.PopoversViewKt$PopoversView$1$1", f = "PopoversView.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ e320 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e320 e320Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = e320Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            e320 e320Var = this.a;
            eck eckVar = e320Var.a;
            kzh.d(new yzh(new g1i(new xzh(ozh.c(eckVar.a.d(), eckVar.b), new x220(e320Var, null)), new y220(e320Var, null)), new z220(e320Var, null)), o8i0.d(e320Var));
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i, androidx.compose.runtime.a aVar) {
        b bVarI = aVar.i(795126676);
        if (bVarI.q(i & 1, i != 0)) {
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final e320 e320Var = (e320) p8i0.a(jq40.a(e320.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            ytw ytwVarC = wyh.c(e320Var.e, bVarI, 0, 7);
            Unit unit = Unit.a;
            boolean zA = bVarI.A(e320Var);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new a(e320Var, null);
                bVarI.r(objY);
            }
            xvf.e(bVarI, unit, (Function2) objY);
            UIState uIState = (UIState) ytwVarC.getValue();
            boolean zA2 = bVarI.A(e320Var);
            Object objY2 = bVarI.y();
            if (zA2 || objY2 == c0042a) {
                objY2 = new Function1() { // from class: o220
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        PopoverCategory popoverCategory = (PopoverCategory) obj;
                        popoverCategory.getClass();
                        String key = popoverCategory.getKey();
                        boolean z = !popoverCategory.getValue();
                        e320 e320Var2 = e320Var;
                        ki80 ki80Var = e320Var2.b;
                        ki80Var.getClass();
                        key.getClass();
                        kzh.d(new yzh(new g1i(ozh.c(ki80Var.a.e(new UserPref(key, String.valueOf(z))), ki80Var.b), new c320(e320Var2, key, z, null)), new d320(3, null)), o8i0.d(e320Var2));
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            b(uIState, (Function1) objY2, bVarI, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new p220();
        }
    }

    public static final void b(final UIState uIState, final Function1 function1, androidx.compose.runtime.a aVar, int i) {
        int i2;
        b bVar;
        uIState.getClass();
        b bVarI = aVar.i(621206919);
        int i3 = (bVarI.M(uIState) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            boolean z = uIState instanceof UIState.Idle;
            d.a aVar2 = d.a.b;
            if (z || (uIState instanceof UIState.Loading)) {
                i2 = 0;
                bVarI.N(-20598505);
                d dVarC = j.c(j.g(aVar2, 1.0f), 1.0f);
                aiv aivVarC = g75.c(ht.a.e, false);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarC);
                yka.k.getClass();
                tsr.a aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, yka.a.d);
                q330.a(null, c68.a(R.color.brand_secondary_disable, bVarI), 0.0f, 0L, 0, 0.0f, bVarI, 0, 61);
                bVar = bVarI;
                bVar.X(true);
                bVar.X(false);
            } else if (uIState instanceof UIState.Success) {
                bVarI.N(-20588523);
                d dVarC3 = j.c(j.g(aVar2, 1.0f), 1.0f);
                boolean z2 = ((i3 & 14) == 4) | ((i3 & 112) == 32);
                Object objY = bVarI.y();
                if (z2 || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new Function1() { // from class: q220
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            szr szrVar = (szr) obj;
                            szrVar.getClass();
                            final UIState uIState2 = uIState;
                            int size = ((List) ((UIState.Success) uIState2).getData()).size();
                            final Function1 function2 = function1;
                            szr.f(szrVar, size, null, new op8(-498454650, new iaj() { // from class: s220
                                @Override // defpackage.iaj
                                public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                    int iIntValue = ((Integer) obj3).intValue();
                                    a aVar4 = (a) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    ((gwr) obj2).getClass();
                                    if ((iIntValue2 & 48) == 0) {
                                        iIntValue2 |= aVar4.d(iIntValue) ? 32 : 16;
                                    }
                                    if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                        final PopoverCategory popoverCategory = (PopoverCategory) ((List) ((UIState.Success) uIState2).getData()).get(iIntValue);
                                        final Function1 function3 = function2;
                                        boolean zM = aVar4.M(function3) | aVar4.A(popoverCategory);
                                        Object objY2 = aVar4.y();
                                        if (zM || objY2 == a.C0041a.a) {
                                            objY2 = new Function0() { // from class: t220
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    function3.invoke(popoverCategory);
                                                    return Unit.a;
                                                }
                                            };
                                            aVar4.r(objY2);
                                        }
                                        k220.a(popoverCategory, (Function0) objY2, aVar4, PopoverCategory.$stable);
                                        ute.a(null, 0.0f, c68.a(R.color.custom_line_type1_primary_type1, aVar4), aVar4, 0, 3);
                                    } else {
                                        aVar4.G();
                                    }
                                    return Unit.a;
                                }
                            }, true), 6);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                i2 = 0;
                bVar = bVarI;
                aur.a(dVarC3, null, null, false, null, null, null, false, null, (Function1) objY, bVar, 6, 510);
                bVar.X(false);
            } else {
                i2 = 0;
                bVar = bVarI;
                bVar.N(-20571637);
                bVar.X(false);
            }
        } else {
            i2 = 0;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new r220(uIState, function1, i, i2);
        }
    }
}
