package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yv30 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ yv30(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qq80 binding;
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                gw30 gw30Var = (gw30) fragment;
                ((View) obj).getClass();
                oxi oxiVar = gw30Var.a;
                if (oxiVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                oxiVar.e.setClickable(false);
                oxi oxiVar2 = gw30Var.a;
                if (oxiVar2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                oxiVar2.e.setAlpha(0.7f);
                Intent intent = new Intent("cashoutCall");
                intent.putExtra("betIndex", 1);
                intent.putExtra("clickType", gw30Var.E);
                Context context = gw30Var.getContext();
                if (context != null) {
                    fdt.a(context).c(intent);
                }
                return Unit.a;
            default:
                q1c0 q1c0Var = (q1c0) fragment;
                ((Boolean) obj).getClass();
                w3c0 w3c0Var = (w3c0) q1c0Var.b;
                if (w3c0Var != null && (binding = w3c0Var.e.getBinding()) != null) {
                    binding.d.setStatus(false);
                }
                ((x5a0) q1c0Var.R1).setValue(Boolean.TRUE);
                return Unit.a;
        }
    }
}
