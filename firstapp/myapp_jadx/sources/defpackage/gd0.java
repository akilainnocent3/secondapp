package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gd0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gd0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                FragmentManager fragmentManager = (FragmentManager) obj2;
                Fragment fragmentG = fragmentManager != null ? fragmentManager.G(((FragmentContainerView) obj).getId()) : null;
                if (fragmentG != null && !fragmentManager.V()) {
                    a aVar = new a(fragmentManager);
                    aVar.p(fragmentG);
                    aVar.l();
                }
                break;
            default:
                hq60 hq60Var = (hq60) obj;
                hq60Var.getClass();
                ((Function1) obj2).invoke(new d64(hq60Var));
                break;
        }
        return Unit.a;
    }
}
