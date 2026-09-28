package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cmb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ cmb(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                zqy zqyVar = (zqy) fragment;
                zqyVar.b0 = 1;
                zqyVar.w0().z1();
                break;
            default:
                qub0 qub0Var = (qub0) fragment;
                qub0Var.v0(qub0Var.S0(), null);
                break;
        }
        return Unit.a;
    }
}
