package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class f8e {
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object a(vtw vtwVar, ResourceUiText resourceUiText, ConcatUiText concatUiText, kyf0 kyf0Var, ResourceUiText resourceUiText2, n67 n67Var, tb40 tb40Var, ResourceUiText resourceUiText3, n67 n67Var2, ub40 ub40Var, x1b x1bVar) {
        e8e e8eVar;
        if (x1bVar instanceof e8e) {
            e8eVar = (e8e) x1bVar;
            int i = e8eVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e8eVar.c = i - Integer.MIN_VALUE;
            } else {
                e8eVar = new e8e(x1bVar);
            }
        } else {
            e8eVar = new e8e(x1bVar);
        }
        Object obj = e8eVar.b;
        y5b y5bVar = y5b.a;
        int i2 = e8eVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            e8eVar.a = vtwVar;
            e8eVar.c = 1;
            bc6 bc6Var = new bc6(1, yzo.b(e8eVar));
            bc6Var.q();
            vtwVar.a(new z7e.h(resourceUiText, concatUiText, kyf0Var, resourceUiText2, n67Var, tb40Var, resourceUiText3, n67Var2, ub40Var, bc6Var));
            if (bc6Var.o() == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }

    public static Object b(vtw vtwVar, ResourceUiText resourceUiText, UiText uiText, ResourceUiText resourceUiText2, ResourceUiText resourceUiText3, kyf0 kyf0Var, n67 n67Var, x1b x1bVar, int i) throws Throwable {
        if ((i & 32) != 0) {
            n67Var = n67.b.a;
        }
        bc6 bc6Var = new bc6(1, yzo.b(x1bVar));
        bc6Var.q();
        vtwVar.a(new z7e.i(resourceUiText, uiText, resourceUiText2, resourceUiText3, kyf0Var, n67Var, bc6Var));
        Object objO = bc6Var.o();
        y5b y5bVar = y5b.a;
        return objO;
    }
}
