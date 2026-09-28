package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class anf {
    public static final void a(final lk50<? extends List<? extends vpf>> lk50Var, final Function0<Unit> function0, final Function2<? super String, ? super Boolean, Unit> function2, a aVar, final int i) {
        int i2;
        final Function0<Unit> function1;
        lk50Var.getClass();
        function0.getClass();
        function2.getClass();
        b bVarI = aVar.i(1690998239);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(lk50Var) : bVarI.A(lk50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function2) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            function1 = function0;
            u60.a(function1, new yle(false, false, 3), pp8.b(1389991798, new Function2() { // from class: wmf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar3 = d.a.b;
                        d dVarG = j.g(aVar3, 0.9f);
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarG);
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
                        hlh0.a(aVar2, i78VarA, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        lk50 lk50Var2 = lk50Var;
                        boolean z = lk50Var2 instanceof lk50.c;
                        Function0 function3 = function0;
                        if (z) {
                            aVar2.N(-1388977929);
                            omf.b(function3, aVar2, 0);
                            List list = (List) ((lk50.c) lk50Var2).a;
                            final Function2 function4 = function2;
                            boolean zM = aVar2.M(function4);
                            Object objY = aVar2.y();
                            if (zM || objY == a.C0041a.a) {
                                objY = new Function2() { // from class: ymf
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        String str = (String) obj3;
                                        Boolean bool = (Boolean) obj4;
                                        bool.booleanValue();
                                        str.getClass();
                                        function4.invoke(str, bool);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY);
                            }
                            omf.c(list, (Function2) objY, aVar2, 0);
                            aVar2.H();
                        } else if (lk50Var2 instanceof lk50.a) {
                            aVar2.N(-1388651065);
                            omf.b(function3, aVar2, 0);
                            cdg.a(0, 0, aVar2, h.h(androidx.compose.foundation.a.b(aVar3, c68.a(R.color.background_type1_quaternary, aVar2), zk40.a), 0.0f, 20.0f, 1));
                            aVar2.H();
                        } else {
                            if (!Intrinsics.g(lk50Var2, lk50.b.a)) {
                                throw rg.a(-1430280231, aVar2);
                            }
                            aVar2.N(-1430255941);
                            twi0.a(null, null, aVar2, 0, 3);
                            aVar2.H();
                        }
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 3) & 14) | 432, 0);
        } else {
            function1 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xmf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    anf.a(lk50Var, function1, function2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final enf enfVar, final String str, final Function0 function0, a aVar, final int i) {
        function0.getClass();
        b bVarI = aVar.i(1210173846);
        int i2 = i | 2 | (bVarI.M(str) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                enfVar = (enf) p8i0.a(jq40.a(enf.class), w8i0VarA, null, null, w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            } else {
                bVarI.G();
            }
            int i3 = i2 & (-15);
            bVarI.Y();
            ytw ytwVarC = wyh.c(enfVar.e, bVarI, 0, 7);
            boolean zA = bVarI.A(enfVar) | ((i3 & 112) == 32);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new zmf(enfVar, str, null);
                bVarI.r(objY);
            }
            int i4 = i3 >> 3;
            xvf.e(bVarI, str, (Function2) objY);
            lk50 lk50Var = (lk50) ytwVarC.getValue();
            boolean zA2 = bVarI.A(enfVar);
            Object objY2 = bVarI.y();
            if (zA2 || objY2 == c0042a) {
                objY2 = new Function2() { // from class: umf
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Object value;
                        String str2 = (String) obj;
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        str2.getClass();
                        enf enfVar2 = enfVar;
                        uf00<vpf> uf00VarX1 = enfVar2.x1(str2, zBooleanValue);
                        wwd0 wwd0Var = enfVar2.d;
                        do {
                            value = wwd0Var.getValue();
                        } while (!wwd0Var.g(value, new lk50.c(uf00VarX1)));
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            a(lk50Var, function0, (Function2) objY2, bVarI, i4 & 112);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, function0, i) { // from class: vmf
                public final /* synthetic */ String b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    anf.b(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
