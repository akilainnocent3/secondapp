package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f2b implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f2b(kwv kwvVar, v0u v0uVar, Function0 function0, Function1 function1) {
        this.d = kwvVar;
        this.e = v0uVar;
        this.b = function0;
        this.c = function1;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0120  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        dtv dtvVar;
        dtv dtvVar2;
        int i = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                r2b.a((d) obj4, (bm7) obj3, this.c, this.b, (a) obj, qj40.a(7));
                return Unit.a;
            default:
                final kwv kwvVar = (kwv) obj4;
                v0u v0uVar = (v0u) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    umz umzVar = rrv.a;
                    d.a aVar2 = d.a.b;
                    d dVarE = h.e(aVar2, umzVar);
                    i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar, 0);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d dVarC = c.c(aVar, dVarE);
                    yka.k.getClass();
                    tsr.a aVar3 = yka.a.b;
                    if (aVar.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar.D();
                    if (aVar.g()) {
                        aVar.F(aVar3);
                    } else {
                        aVar.p();
                    }
                    hlh0.a(aVar, i78VarA, yka.a.f);
                    hlh0.a(aVar, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    hlh0.a(aVar, dVarC, yka.a.d);
                    String str = kwvVar.b;
                    dtv dtvVar3 = kwvVar.p;
                    axt.d(str, kwvVar.h, v0uVar, aVar, 0);
                    ty0.a(aVar, j.i(aVar2, rrv.b));
                    wwv wwvVar = kwvVar.l;
                    String str2 = kwvVar.c;
                    uxs uxsVar = kwvVar.k;
                    UiText uiText = kwvVar.n;
                    String str3 = kwvVar.f;
                    String str4 = kwvVar.m;
                    boolean z = kwvVar.t;
                    boolean z2 = kwvVar.u;
                    final Function1 function1 = this.c;
                    boolean zM = aVar.M(function1) | aVar.A(kwvVar);
                    Object objY = aVar.y();
                    if (zM) {
                        dtvVar = dtvVar3;
                    } else {
                        dtvVar = dtvVar3;
                        if (objY == a.C0041a.a) {
                        }
                        dtvVar2 = dtvVar;
                        axt.b(wwvVar, str2, uxsVar, uiText, str3, str4, z, v0uVar, z2, this.b, (Function0) objY, aVar, 0);
                        ty0.a(aVar, j.i(aVar2, rrv.x));
                        xuv.c(kwvVar.d, v0uVar, null, aVar, 0);
                        if (dtvVar2 == null && kwvVar.l == wwv.a) {
                            aVar.N(1240176132);
                            ty0.a(aVar, j.i(aVar2, rrv.l));
                            btv.a(dtvVar2, etv.b, v0uVar, aVar, 48);
                            aVar.H();
                        } else {
                            aVar.N(1240511521);
                            aVar.H();
                        }
                        aVar.s();
                    }
                    objY = new Function0() { // from class: wwt
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(kwvVar.e);
                            return Unit.a;
                        }
                    };
                    aVar.r(objY);
                    dtvVar2 = dtvVar;
                    axt.b(wwvVar, str2, uxsVar, uiText, str3, str4, z, v0uVar, z2, this.b, (Function0) objY, aVar, 0);
                    ty0.a(aVar, j.i(aVar2, rrv.x));
                    xuv.c(kwvVar.d, v0uVar, null, aVar, 0);
                    if (dtvVar2 == null) {
                        aVar.N(1240511521);
                        aVar.H();
                    } else {
                        aVar.N(1240511521);
                        aVar.H();
                    }
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ f2b(d dVar, bm7 bm7Var, Function1 function1, Function0 function0, int i) {
        this.d = dVar;
        this.e = bm7Var;
        this.c = function1;
        this.b = function0;
    }
}
