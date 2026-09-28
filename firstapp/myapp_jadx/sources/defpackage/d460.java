package defpackage;

import android.content.Context;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.LoadingState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d460 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d460(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ro80 binding;
        ro80 binding2;
        Context context;
        Integer code;
        xbg xbgVar;
        ro80 binding3;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                l560 l560Var = (l560) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = l560.b.a[loadingState.getStatus().ordinal()];
                int i3 = 1;
                if (i2 != 1) {
                    int i4 = 2;
                    if (i2 == 2) {
                        eo80 eo80Var = l560Var.l0;
                        if (eo80Var != null && (binding2 = eo80Var.W.getBinding()) != null) {
                            binding2.A.setVisibility(0);
                        }
                    } else {
                        if (i2 != 3) {
                            uhc.a();
                            return null;
                        }
                        e activity = l560Var.getActivity();
                        if (activity != null && (context = l560Var.getContext()) != null) {
                            eo80 eo80Var2 = l560Var.l0;
                            if (eo80Var2 != null && (binding3 = eo80Var2.W.getBinding()) != null) {
                                binding3.A.setVisibility(0);
                            }
                            if (loadingState.getError() != null && ((code = loadingState.getError().getCode()) == null || code.intValue() != 403)) {
                                Integer code2 = loadingState.getError().getCode();
                                if ((code2 != null && code2.intValue() == 403) || (xbgVar = l560Var.N) == null || xbgVar.isShowing()) {
                                    l260 l260Var = l260.e;
                                    l560Var.E0();
                                    jcg.d(l260Var, activity, "Rush", loadingState.getError(), new kba(l560Var, i3), new w460(), null, 0, context.getColor(R.color.try_again_color), null, null, null, new zw10(l560Var, i3), null, 97728);
                                } else {
                                    l260 l260Var2 = l260.e;
                                    l560Var.E0();
                                    jcg.d(l260Var2, activity, "Rush", loadingState.getError(), new hba(l560Var, i4), new v460(), null, 0, context.getColor(R.color.try_again_color), null, null, null, new jba(l560Var, i4), null, 97728);
                                }
                            }
                        }
                    }
                } else {
                    eo80 eo80Var3 = l560Var.l0;
                    if (eo80Var3 != null && (binding = eo80Var3.W.getBinding()) != null) {
                        binding.A.setVisibility(4);
                    }
                    ej5.c(ebs.a(l560Var.getLifecycle()), null, null, new u560(l560Var, loadingState, null), 3);
                }
                return Unit.a;
            default:
                eoa0 eoa0Var = (eoa0) obj2;
                f1e0 f1e0Var = (f1e0) obj;
                f1e0Var.getClass();
                eoa0Var.c.j("messageReceived");
                eoa0Var.b.j(f1e0Var.c);
                return Unit.a;
        }
    }
}
