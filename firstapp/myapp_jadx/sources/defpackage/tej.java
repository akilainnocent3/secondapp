package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tej implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ tej(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        iny onBackPressedDispatcher;
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                ((tgj) fragment).V1();
                break;
            default:
                l560 l560Var = (l560) fragment;
                l560Var.Q0();
                e activity = l560Var.getActivity();
                if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher.d();
                }
                break;
        }
        return Unit.a;
    }
}
