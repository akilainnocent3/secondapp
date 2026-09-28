package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xwf implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xwf(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ywf ywfVar = (ywf) obj3;
                q8i0 q8i0Var = ywfVar.f;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lxf lxfVar = (lxf) wyh.c(((mxf) q8i0Var.getValue()).e, aVar, 0, 7).getValue();
                    boolean zA = aVar.A(ywfVar);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new wb7(ywfVar, 1);
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(ywfVar);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new xb7(ywfVar, 1);
                        aVar.r(objY2);
                    }
                    Function0 function1 = (Function0) objY2;
                    mxf mxfVar = (mxf) q8i0Var.getValue();
                    boolean zA3 = aVar.A(mxfVar);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        ywf.a aVar2 = new ywf.a(1, mxfVar, mxf.class, "handleEvent", "handleEvent(Lcom/sporty/android/platform/features/account/verifiedemailchange/newemail/model/EmailChangeNewEmailEvent;)V", 0);
                        aVar.r(aVar2);
                        objY3 = aVar2;
                    }
                    kxf.a(lxfVar, function0, function1, (Function1) ((chp) objY3), aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                Function0 function2 = (Function0) obj3;
                a aVar3 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    d.a aVar4 = d.a.b;
                    d dVarW = j.w(aVar4, 320.0f);
                    qyd0 qyd0Var = oib0.a;
                    d dVarF = h.f(androidx.compose.foundation.a.b(dVarW, ((lib0) aVar3.O(qyd0Var)).i0, j060.c(8.0f)), 24.0f);
                    i78 i78VarA = g78.a(kw0.c, ht.a.o, aVar3, 48);
                    int iHashCode = Long.hashCode(aVar3.m());
                    ne00 ne00VarO = aVar3.o();
                    d dVarC = c.c(aVar3, dVarF);
                    yka.k.getClass();
                    tsr.a aVar5 = yka.a.b;
                    if (aVar3.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar3.D();
                    if (aVar3.g()) {
                        aVar3.F(aVar5);
                    } else {
                        aVar3.p();
                    }
                    hlh0.a(aVar3, i78VarA, yka.a.f);
                    hlh0.a(aVar3, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                    }
                    hlh0.a(aVar3, dVarC, yka.a.d);
                    d dVarG = j.g(aVar4, 1.0f);
                    String strA = cb40.a(R.string.page_lucky_numbers__draw_unavailable, new Object[0], aVar3);
                    qyd0 qyd0Var2 = kjb0.a;
                    lkf0.d(strA, dVarG, ((lib0) aVar3.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar3.O(qyd0Var2)).b, aVar3, 48, 0, 131064);
                    lkf0.d(cb40.a(R.string.page_lucky_numbers__draw_unavailable_description, new Object[0], aVar3), j.g(h.j(aVar4, 0.0f, 16.0f, 0.0f, 0.0f, 13), 1.0f), ((lib0) aVar3.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar3.O(qyd0Var2)).k, aVar3, 48, 0, 131064);
                    ddd0.a(h.j(aVar4, 0.0f, 24.0f, 0.0f, 0.0f, 13), false, null, null, null, false, null, null, function2, q89.a, aVar3, 805306374, 254);
                    aVar3.s();
                } else {
                    aVar3.G();
                }
                return Unit.a;
        }
    }
}
