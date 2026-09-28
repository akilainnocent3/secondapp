package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.viewinterop.b;
import com.sportygames.sportyherov2.components.SHKeypadContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zh80 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zh80(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        a.C0041a.C0042a c0042a = a.C0041a.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                q8i0 q8i0Var = ((ci80) obj3).f;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tvz tvzVar = (tvz) wyh.c(((ii80) q8i0Var.getValue()).f, aVar, 0, 7).getValue();
                    fvz fvzVar = new fvz(true, false, true);
                    ii80 ii80Var = (ii80) q8i0Var.getValue();
                    boolean zA = aVar.A(ii80Var);
                    Object objY = aVar.y();
                    if (zA || objY == c0042a) {
                        ci80.b bVar = new ci80.b(1, ii80Var, ii80.class, "handleAction", "handleAction(Lcom/sportybet/feature/passwordentry/impl/presentation/PasswordEntryAction;)V", 0);
                        aVar.r(bVar);
                        objY = bVar;
                    }
                    svz.c(tvzVar, fvzVar, (Function1) ((chp) objY), aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                final a6c0 a6c0Var = (a6c0) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    d.a aVar3 = d.a.b;
                    d dVarG = j.g(aVar3, 1.0f);
                    aiv aivVarC = g75.c(ht.a.a, false);
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
                    hlh0.a(aVar2, aivVarC, yka.a.f);
                    hlh0.a(aVar2, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                    }
                    hlh0.a(aVar2, dVarC, yka.a.d);
                    boolean zA2 = aVar2.A(a6c0Var);
                    Object objY2 = aVar2.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new Function1() { // from class: l5c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                Context context = (Context) obj4;
                                context.getClass();
                                SHKeypadContainer sHKeypadContainer = new SHKeypadContainer(context, null);
                                sHKeypadContainer.setVisibility(8);
                                a6c0 a6c0Var2 = a6c0Var;
                                a6c0Var2.m = sHKeypadContainer;
                                a6c0Var2.d();
                                return sHKeypadContainer;
                            }
                        };
                        aVar2.r(objY2);
                    }
                    Function1 function1 = (Function1) objY2;
                    androidx.compose.foundation.layout.d dVar = androidx.compose.foundation.layout.d.a;
                    n54 n54Var = ht.a.h;
                    b.a(function1, dVar.b(aVar3, n54Var), null, aVar2, 0, 4);
                    boolean zA3 = aVar2.A(a6c0Var);
                    Object objY3 = aVar2.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new m5c0(a6c0Var, 0);
                        aVar2.r(objY3);
                    }
                    b.a((Function1) objY3, dVar.b(aVar3, n54Var), null, aVar2, 0, 4);
                    boolean zA4 = aVar2.A(a6c0Var);
                    Object objY4 = aVar2.y();
                    if (zA4 || objY4 == c0042a) {
                        objY4 = new n5c0(a6c0Var, 0);
                        aVar2.r(objY4);
                    }
                    b.a((Function1) objY4, dVar.b(aVar3, n54Var), null, aVar2, 0, 4);
                    boolean zA5 = aVar2.A(a6c0Var);
                    Object objY5 = aVar2.y();
                    if (zA5 || objY5 == c0042a) {
                        objY5 = new Function1() { // from class: o5c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                Context context = (Context) obj4;
                                context.getClass();
                                SHKeypadContainer sHKeypadContainer = new SHKeypadContainer(context, null);
                                sHKeypadContainer.setVisibility(8);
                                a6c0 a6c0Var2 = a6c0Var;
                                a6c0Var2.p = sHKeypadContainer;
                                a6c0Var2.d();
                                return sHKeypadContainer;
                            }
                        };
                        aVar2.r(objY5);
                    }
                    b.a((Function1) objY5, dVar.b(aVar3, n54Var), null, aVar2, 0, 4);
                    aVar2.s();
                } else {
                    aVar2.G();
                }
                return Unit.a;
        }
    }
}
