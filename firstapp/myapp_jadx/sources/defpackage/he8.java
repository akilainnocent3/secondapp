package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class he8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ he8(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                re8.a aVar = re8.P;
                ow.c(((re8) fragment).n0().b);
                break;
            default:
                q1c0 q1c0Var = (q1c0) fragment;
                q1c0Var.K0 = false;
                q1c0Var.G0();
                q1c0Var.p2();
                break;
        }
        return Unit.a;
    }
}
