package defpackage;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zah implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ zah(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                return new r(new bbh.c((bbh) fragment));
            default:
                rgg0 rgg0Var = (rgg0) fragment;
                kzb0 kzb0Var = rgg0Var.c;
                if (kzb0Var != null) {
                    kzb0Var.invoke(Long.valueOf(rgg0Var.f));
                }
                if (!rgg0Var.isRemoving()) {
                    rgg0Var.getParentFragmentManager().Y();
                }
                return Unit.a;
        }
    }
}
