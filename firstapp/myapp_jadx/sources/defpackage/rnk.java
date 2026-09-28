package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.feature.gift.gift.presentation.b;
import com.sportybet.feature.gift.gift.presentation.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rnk implements gaj {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rnk(jbu jbuVar, Function1 function1) {
        this.c = jbuVar;
        this.b = function1;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        d.a aVar = d.a.b;
        final Function1 function1 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                final c.a aVar2 = (c.a) obj4;
                a aVar3 = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d) obj).getClass();
                if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    d dVarG = j.g(aVar, 1.0f);
                    boolean zM = aVar3.M(function1) | aVar3.M(aVar2);
                    Object objY = aVar3.y();
                    if (zM || objY == a.C0041a.a) {
                        objY = new Function0() { // from class: pnk
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(new b.e(aVar2.b, false));
                                return Unit.a;
                            }
                        };
                        aVar3.r(objY);
                    }
                    ddd0.a(dVarG, false, null, null, null, false, null, null, (Function0) objY, g49.a, aVar3, 805306374, 254);
                } else {
                    aVar3.G();
                }
                return Unit.a;
            default:
                jbu jbuVar = (jbu) obj4;
                tmz tmzVar = (tmz) obj;
                a aVar4 = (a) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                tmzVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= aVar4.M(tmzVar) ? 4 : 2;
                }
                if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    d dVarE = h.e(aVar, tmzVar);
                    aiv aivVarC = g75.c(ht.a.a, false);
                    int iHashCode = Long.hashCode(aVar4.m());
                    ne00 ne00VarO = aVar4.o();
                    d dVarC = androidx.compose.ui.c.c(aVar4, dVarE);
                    yka.k.getClass();
                    tsr.a aVar5 = yka.a.b;
                    if (aVar4.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar4.D();
                    if (aVar4.g()) {
                        aVar4.F(aVar5);
                    } else {
                        aVar4.p();
                    }
                    hlh0.a(aVar4, aivVarC, yka.a.f);
                    hlh0.a(aVar4, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar4, iHashCode, c1350a);
                    }
                    hlh0.a(aVar4, dVarC, yka.a.d);
                    boolean z = jbuVar.a;
                    u8u u8uVar = jbuVar.j;
                    if (z) {
                        aVar4.N(1244468646);
                        m9u.a(false, function1, aVar4, 6);
                        aVar4.H();
                    } else if (jbuVar.b) {
                        aVar4.N(1244610471);
                        m9u.a(true, function1, aVar4, 6);
                        aVar4.H();
                    } else {
                        aVar4.N(1244742438);
                        o9u.a(jbuVar, function1, aVar4, 0);
                        aVar4.H();
                    }
                    aVar4.s();
                    if (u8uVar != null) {
                        aVar4.N(-1992950163);
                        w8u.a(u8uVar, aVar4, 0);
                        aVar4.H();
                    } else {
                        aVar4.N(-1992889620);
                        aVar4.H();
                    }
                } else {
                    aVar4.G();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ rnk(Function1 function1, c.a aVar) {
        this.b = function1;
        this.c = aVar;
    }
}
