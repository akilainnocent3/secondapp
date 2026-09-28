package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v32 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v32(Fragment fragment, Object obj, int i) {
        this.a = i;
        this.b = fragment;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        r8i0.c defaultViewModelProviderFactory;
        int i = this.a;
        Object obj = this.c;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                w8i0 w8i0Var = (w8i0) ((ttr) obj).getValue();
                iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
                if (ielVar != null && (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                r8i0.c defaultViewModelProviderFactory2 = fragment.getDefaultViewModelProviderFactory();
                defaultViewModelProviderFactory2.getClass();
                return defaultViewModelProviderFactory2;
            default:
                fgb fgbVar = (fgb) fragment;
                cgb.a(fgbVar.e1(), (String) ((x5a0) fgbVar.c1().v).getValue(), "placeBet", (String) obj);
                return Unit.a;
        }
    }
}
