package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class snf implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ snf(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        final Window window;
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ftf.b(scs.BETTING_LIMIT_TYPE, vfb0.CASINO, null, this.b, aVar, 54);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ViewParent parent = ((View) aVar2.O(AndroidCompositionLocals_androidKt.f)).getParent();
                    if (parent == null) {
                        window = null;
                    } else {
                        eme emeVar = parent instanceof eme ? (eme) parent : null;
                        if (emeVar != null) {
                            window = emeVar.getWindow();
                        } else {
                            window = null;
                        }
                    }
                    boolean zA = aVar2.A(window);
                    Object objY = aVar2.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new Function0() { // from class: cye0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Window window2 = window;
                                if (window2 != null) {
                                    window2.setGravity(80);
                                }
                                return Unit.a;
                            }
                        };
                        aVar2.r(objY);
                    }
                    use useVar = xvf.a;
                    aVar2.t((Function0) objY);
                    d.a aVar3 = d.a.b;
                    d dVarE = j.e(aVar3, 1.0f);
                    Object objY2 = aVar2.y();
                    if (objY2 == c0042a) {
                        objY2 = pr7.a(aVar2);
                    }
                    Function0 function0 = this.b;
                    d dVarB = androidx.compose.foundation.d.b(dVarE, (psw) objY2, null, false, null, function0, 28);
                    aiv aivVarC = g75.c(ht.a.e, false);
                    int iHashCode = Long.hashCode(aVar2.m());
                    ne00 ne00VarO = aVar2.o();
                    d dVarC = c.c(aVar2, dVarB);
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
                    yka.a.b bVar = yka.a.f;
                    hlh0.a(aVar2, aivVarC, bVar);
                    yka.a.d dVar = yka.a.e;
                    hlh0.a(aVar2, ne00VarO, dVar);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                    }
                    yka.a.c cVar = yka.a.d;
                    hlh0.a(aVar2, dVarC, cVar);
                    gye0.c(function0, aVar2, 0);
                    d dVarG = j.g(j.i(aVar3, 552.0f), 1.0f);
                    aiv aivVarC2 = g75.c(ht.a.h, false);
                    int iHashCode2 = Long.hashCode(aVar2.m());
                    ne00 ne00VarO2 = aVar2.o();
                    d dVarC2 = c.c(aVar2, dVarG);
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
                    hlh0.a(aVar2, aivVarC2, bVar);
                    hlh0.a(aVar2, ne00VarO2, dVar);
                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                        j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                    }
                    hlh0.a(aVar2, dVarC2, cVar);
                    gye0.a(function0, aVar2, 6);
                    aVar2.s();
                    aVar2.s();
                } else {
                    aVar2.G();
                }
                return Unit.a;
        }
    }
}
