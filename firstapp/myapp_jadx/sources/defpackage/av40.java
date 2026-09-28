package defpackage;

import com.sporty.android.sportynews.ui.SportyNewsVideoDetailFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class av40 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ av40(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                g74 g74Var = (g74) obj;
                g74Var.getClass();
                ((Function1) obj2).invoke(new o6z.c(g74Var));
                return Unit.a;
            default:
                String str = (String) obj;
                ohp<Object>[] ohpVarArr = SportyNewsVideoDetailFragment.X;
                str.getClass();
                azm azmVar = ((SportyNewsVideoDetailFragment) obj2).J;
                if (azmVar != null) {
                    azm.c(azmVar, str, null, null, 6);
                    return Unit.a;
                }
                Intrinsics.n("router");
                throw null;
        }
    }
}
