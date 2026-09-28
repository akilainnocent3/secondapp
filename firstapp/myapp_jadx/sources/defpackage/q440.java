package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.sporty.android.core.model.remixbet.RemixBetRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q440 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ q440(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                o540 o540Var = (o540) fragment;
                RemixBetRequest remixBetRequest = (RemixBetRequest) obj;
                remixBetRequest.getClass();
                if (o540Var.isAdded() && !o540Var.isStateSaved()) {
                    Context contextRequireContext = o540Var.requireContext();
                    contextRequireContext.getClass();
                    jrm jrmVar = o540Var.A;
                    if (jrmVar == null) {
                        Intrinsics.n("betItem");
                        throw null;
                    }
                    ej5.c(ebs.a(o540Var.getLifecycle()), null, null, new p540(o540Var, !jrmVar.U().isEmpty(), contextRequireContext, remixBetRequest, null), 3);
                }
                return Unit.a;
            default:
                tn80 tn80Var = (tn80) fragment;
                String str = (String) obj;
                int i2 = Integer.parseInt(tn80Var.c) > 0 ? Integer.parseInt(tn80Var.c) : 100;
                if (str == null || str.length() == 0 || Integer.parseInt(str) > i2 - 1) {
                    str.getClass();
                    tn80Var.p0(str);
                    ej5.c(ebs.a(tn80Var.getLifecycle()), null, null, new un80(tn80Var, null), 3);
                } else {
                    tn80Var.p0(str);
                }
                return Unit.a;
        }
    }
}
