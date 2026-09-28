package defpackage;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class gp40 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final Function0 function0, final Function0 function1, final Function0 function2, final Function1 function3, pp40 pp40Var, a aVar, final int i) {
        b bVar;
        final pp40 pp40Var2;
        b bVar2;
        int i2;
        pp40 pp40Var3;
        pp40 pp40Var4;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        b bVarI = aVar.i(-709814858);
        int i3 = i | (bVarI.A(function0) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128) | (bVarI.A(function3) ? 2048 : 1024) | 8192;
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    bVar2 = bVarI;
                    i2 = i3 & (-57345);
                    pp40Var3 = (pp40) p8i0.a(jq40.a(pp40.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVar2);
                }
            } else {
                bVarI.G();
                i2 = i3 & (-57345);
                bVar2 = bVarI;
                pp40Var3 = pp40Var;
            }
            bVar2.Y();
            final Context context = (Context) bVar2.O(AndroidCompositionLocals_androidKt.b);
            ytw ytwVarC = wyh.c(pp40Var3.c, bVar2, 0, 7);
            o67 o67Var = pp40Var3.e;
            boolean zA = bVar2.A(context) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object objY = bVar2.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new Function1() { // from class: cp40
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        bp40 bp40Var = (bp40) obj;
                        bp40Var.getClass();
                        boolean z = bp40Var instanceof bp40.d;
                        Context context2 = context;
                        if (z) {
                            Toast.makeText(context2, R.string.gift__gift_code_was_applied_successfully, 1).show();
                        } else if (bp40Var instanceof bp40.c) {
                            Toast.makeText(context2, R.string.page_transaction__session_timeout, 0).show();
                        } else if (bp40Var instanceof bp40.b) {
                            function3.invoke(((bp40.b) bp40Var).a.g(context2));
                        } else {
                            if (!(bp40Var instanceof bp40.a)) {
                                uhc.a();
                                return null;
                            }
                            function2.invoke();
                        }
                        return Unit.a;
                    }
                };
                bVar2.r(objY);
            }
            b bVar3 = bVar2;
            abs.a(o67Var, null, null, (Function1) objY, bVar3, 0);
            np40 np40Var = (np40) ytwVarC.getValue();
            boolean zA2 = bVar3.A(pp40Var3);
            Object objY2 = bVar3.y();
            if (zA2 || objY2 == c0042a) {
                ep40 ep40Var = new ep40(1, pp40Var3, pp40.class, "onCodeChanged", "onCodeChanged(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0);
                bVar3.r(ep40Var);
                objY2 = ep40Var;
            }
            Function1 function4 = (Function1) ((chp) objY2);
            boolean zA3 = bVar3.A(pp40Var3);
            Object objY3 = bVar3.y();
            if (zA3 || objY3 == c0042a) {
                pp40Var4 = pp40Var3;
                fp40 fp40Var = new fp40(0, pp40Var4, pp40.class, "onRedeemClick", "onRedeemClick()V", 0);
                bVar3.r(fp40Var);
                objY3 = fp40Var;
            } else {
                pp40Var4 = pp40Var3;
            }
            mp40.c(np40Var, function4, (Function0) ((chp) objY3), function0, function1, null, bVar3, (i2 << 9) & 64512);
            bVar = bVar3;
            pp40Var2 = pp40Var4;
        } else {
            bVar = bVarI;
            bVar.G();
            pp40Var2 = pp40Var;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, function2, function3, pp40Var2, i) { // from class: dp40
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ pp40 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    gp40.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
