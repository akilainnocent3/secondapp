package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.a;
import com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mc70 {

    public static final /* synthetic */ class a extends saj implements Function1<com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.a, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.a aVar) {
            com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.a aVar2 = aVar;
            aVar2.getClass();
            ((b) this.receiver).z1(aVar2);
            return Unit.a;
        }
    }

    public static final void a(final wc70 wc70Var, final Function1<? super com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.a, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(1405036416);
        int i2 = (bVarI.M(wc70Var) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        int i3 = 1;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarB = androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), ((lib0) bVarI.O(oib0.a)).d1, zk40.a);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            fqo fqoVar = wc70Var.a;
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new deb(function1, i3);
                bVarI.r(objY);
            }
            Function0 function0 = (Function0) objY;
            boolean z2 = i4 == 32;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new Function0() { // from class: ic70
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(a.b.C0340b.a);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            Function0 function2 = (Function0) objY2;
            int i5 = 0;
            eqo.b(fqoVar, function0, null, null, function2, null, bVarI, 0, 44);
            bVarI = bVarI;
            qb70.a(wc70Var.b, bVarI, 0);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, layoutWeightElement);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            bb70 bb70Var = wc70Var.c;
            if (bb70Var instanceof bb70.c) {
                bVarI.N(-113644907);
                ab70.a(0, bVarI);
                bVarI.X(false);
            } else if (bb70Var instanceof bb70.b) {
                bVarI.N(-113490806);
                boolean z3 = i4 == 32;
                Object objY3 = bVarI.y();
                if (z3 || objY3 == c0042a) {
                    objY3 = new jc70(function1, i5);
                    bVarI.r(objY3);
                }
                ya70.a((Function0) objY3, bVarI, 0);
                bVarI.X(false);
            } else if (bb70Var instanceof bb70.a) {
                bVarI.N(-113235893);
                boolean z4 = i4 == 32;
                Object objY4 = bVarI.y();
                if (z4 || objY4 == c0042a) {
                    objY4 = new eeb(function1, 2);
                    bVarI.r(objY4);
                }
                wa70.a((Function0) objY4, bVarI, 0);
                bVarI.X(false);
            } else {
                if (!(bb70Var instanceof bb70.d)) {
                    throw igf0.a(bVarI, 1935994193, false);
                }
                bVarI.N(-112966286);
                bb70.d dVar2 = (bb70.d) bb70Var;
                qcn<ua70> qcnVar = dVar2.a;
                boolean z5 = dVar2.b;
                boolean z6 = i4 == 32;
                Object objY5 = bVarI.y();
                if (z6 || objY5 == c0042a) {
                    objY5 = new Function1() { // from class: kc70
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            String str = (String) obj;
                            str.getClass();
                            function1.invoke(new a.d.b(str));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                }
                Function1 function3 = (Function1) objY5;
                boolean z7 = i4 == 32;
                Object objY6 = bVarI.y();
                if (z7 || objY6 == c0042a) {
                    objY6 = new feb(function1, 2);
                    bVarI.r(objY6);
                }
                eb70.a(qcnVar, z5, function3, (Function0) objY6, bVarI, 8);
                bVarI.X(false);
            }
            bVarI.X(true);
            boolean z8 = i4 == 32;
            Object objY7 = bVarI.y();
            if (z8 || objY7 == c0042a) {
                objY7 = new geb(function1, 2);
                bVarI.r(objY7);
            }
            Function0 function4 = (Function0) objY7;
            boolean z9 = i4 == 32;
            Object objY8 = bVarI.y();
            if (z9 || objY8 == c0042a) {
                objY8 = new heb(function1, 2);
                bVarI.r(objY8);
            }
            ma70.c(function4, (Function0) objY8, bVarI, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, i) { // from class: lc70
                public final /* synthetic */ Function1 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    mc70.a(this.a, this.b, (androidx.compose.runtime.a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-1508047194);
        if (bVarI.q(i & 1, i != 0)) {
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            b bVar = (b) p8i0.a(jq40.a(b.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            wc70 wc70Var = (wc70) wyh.c(bVar.A, bVarI, 0, 7).getValue();
            boolean zA = bVarI.A(bVar);
            Object objY = bVarI.y();
            if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                a aVar2 = new a(1, bVar, b.class, "handleUiAction", "handleUiAction(Lcom/sportybet/android/instantwin/presentation/scheduledfootballopenbets/ScheduledFootballOpenBetsUiAction;)V", 0);
                bVarI.r(aVar2);
                objY = aVar2;
            }
            a(wc70Var, (Function1) ((chp) objY), bVarI, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new hc70();
        }
    }
}
