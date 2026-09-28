package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common.uievent.b;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vh7 {
    public final uy0 a;

    public vh7(uy0 uy0Var) {
        uy0Var.getClass();
        this.a = uy0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(vtw vtwVar, vtw vtwVar2, x1b x1bVar) {
        uh7 uh7Var;
        final vtw vtwVar3;
        final vtw vtwVar4;
        l41 l41Var;
        AssetsInfo assetsInfo;
        if (x1bVar instanceof uh7) {
            uh7Var = (uh7) x1bVar;
            int i = uh7Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                uh7Var.e = i - Integer.MIN_VALUE;
            } else {
                uh7Var = new uh7(this, x1bVar);
            }
        } else {
            uh7Var = new uh7(this, x1bVar);
        }
        Object obj = uh7Var.c;
        y5b y5bVar = y5b.a;
        int i2 = uh7Var.e;
        final i41 i41VarA = null;
        if (i2 == 0) {
            uj50.b(obj);
            lyh lyhVarH = this.a.h(new pu0.a(0));
            uh7Var.a = vtwVar;
            uh7Var.b = vtwVar2;
            uh7Var.e = 1;
            Object objP = bm50.p(lyhVarH, uh7Var);
            if (objP == y5bVar) {
                return y5bVar;
            }
            vtwVar3 = vtwVar;
            obj = objP;
            vtwVar4 = vtwVar2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vtwVar4 = uh7Var.b;
            vtw vtwVar5 = uh7Var.a;
            uj50.b(obj);
            vtwVar3 = vtwVar5;
        }
        lk50.c cVar = obj instanceof lk50.c ? (lk50.c) obj : null;
        if (cVar != null && (assetsInfo = (AssetsInfo) cVar.a) != null) {
            i41VarA = k41.a(assetsInfo);
        }
        i41.d dVar = i41.d.a;
        if (Intrinsics.g(i41VarA, dVar)) {
            return Boolean.TRUE;
        }
        if (i41VarA == null) {
            return Boolean.FALSE;
        }
        if (i41VarA.equals(dVar)) {
            l41Var = l41.d.a;
        } else if (i41VarA.equals(i41.a.a)) {
            l41Var = l41.a.a;
        } else if (i41VarA.equals(i41.c.a)) {
            l41Var = l41.c.a;
        } else {
            l41Var = i41VarA.equals(i41.b.a) ? l41.b.a : l41.e.a;
        }
        b.e(vtwVar3, l41Var.getTitle(), null, l41Var.b(), l41Var.a(), null, null, new Function1() { // from class: th7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj2;
                alertDialogCallbackType.getClass();
                if (!(alertDialogCallbackType instanceof AlertDialogCallbackType.Positive)) {
                    return Unit.a;
                }
                i41.a aVar = i41.a.a;
                i41 i41Var = i41VarA;
                if (i41Var.equals(aVar)) {
                    ucv ucvVar = ucv.None;
                    vtw vtwVar6 = vtwVar4;
                    vtwVar6.getClass();
                    vtwVar6.a(new m480.a(ucvVar));
                } else if (i41Var.equals(i41.b.a)) {
                    b.c(vtwVar3, snb0.WITHDRAW);
                }
                return Unit.a;
            }
        }, 242);
        return Boolean.FALSE;
    }
}
