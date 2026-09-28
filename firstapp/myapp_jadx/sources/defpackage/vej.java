package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class vej implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ vej(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                tgj tgjVar = (tgj) fragment;
                z83 z83Var = (z83) obj;
                z83Var.getClass();
                tgjVar.r2(z83Var, tgjVar.R0());
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((l560) fragment).z0(str);
                break;
        }
        return Unit.a;
    }
}
