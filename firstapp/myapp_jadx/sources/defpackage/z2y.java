package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class z2y extends Dialog {
    public final boolean a;
    public final Activity b;
    public final xb3 c;
    public final yb3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2y(boolean z, e eVar, xb3 xb3Var, yb3 yb3Var) {
        super(eVar);
        eVar.getClass();
        this.a = z;
        this.b = eVar;
        this.c = xb3Var;
        this.d = yb3Var;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        ComposeView composeView = new ComposeView(this.b, null, 6, 0);
        composeView.setViewCompositionStrategy(u6i0.a.a);
        Object context = composeView.getContext();
        ibs ibsVar = context instanceof ibs ? (ibs) context : null;
        if (ibsVar != null) {
            composeView.setTag(R.id.view_tree_lifecycle_owner, ibsVar);
        }
        Object context2 = composeView.getContext();
        w8i0 w8i0Var = context2 instanceof w8i0 ? (w8i0) context2 : null;
        if (w8i0Var != null) {
            composeView.setTag(R.id.view_tree_view_model_store_owner, w8i0Var);
        }
        Object context3 = composeView.getContext();
        nv60 nv60Var = context3 instanceof nv60 ? (nv60) context3 : null;
        if (nv60Var != null) {
            composeView.setTag(R.id.view_tree_saved_state_registry_owner, nv60Var);
        }
        composeView.setContent(new op8(1563663025, new Function2() { // from class: v2y
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final z2y z2yVar = this.a;
                    scv.b(null, null, null, pp8.b(-1563305123, new Function2() { // from class: w2y
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                final z2y z2yVar2 = z2yVar;
                                boolean z = z2yVar2.a;
                                boolean zA = aVar2.A(z2yVar2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    objY = new Function0() { // from class: x2y
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            z2y z2yVar3 = z2yVar2;
                                            z2yVar3.c.invoke();
                                            z2yVar3.dismiss();
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                boolean zA2 = aVar2.A(z2yVar2);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new Function0() { // from class: y2y
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            z2y z2yVar3 = z2yVar2;
                                            z2yVar3.d.invoke();
                                            z2yVar3.dismiss();
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY2);
                                }
                                l3y.a(z, function0, (Function0) objY2, aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 3072, 7);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        setContentView(composeView);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }
}
