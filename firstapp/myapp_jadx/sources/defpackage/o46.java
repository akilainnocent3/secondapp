package defpackage;

import androidx.fragment.app.Fragment;
import com.sportygames.crash.remote.models.MultiplierResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o46 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ o46(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                t46 t46Var = (t46) fragment;
                t46Var.dismiss();
                Function0<Unit> function0 = t46Var.f;
                if (function0 != null) {
                    function0.invoke();
                    return Unit.a;
                }
                Intrinsics.n("onCloseClick");
                throw null;
            default:
                tgj tgjVar = (tgj) fragment;
                tgjVar.f = true;
                if (tgjVar.j0) {
                    MultiplierResponse multiplierResponse = tgjVar.x0;
                    if (multiplierResponse != null) {
                        tgjVar.c1().B1(multiplierResponse, tgjVar.l2(), tgjVar.y0, tgjVar.h2, 1, new fgj(tgjVar, 0), null);
                    }
                } else {
                    tgjVar.v0(tgjVar.S0(), null);
                }
                return Unit.a;
        }
    }
}
