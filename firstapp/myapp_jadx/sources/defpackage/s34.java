package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s34 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s34(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(i04.g.a);
                break;
            case 1:
                ytw ytwVar = (ytw) obj;
                ytwVar.setValue(Boolean.valueOf(!((Boolean) ytwVar.getValue()).booleanValue()));
                break;
            default:
                nn40 nn40Var = (nn40) obj;
                if (!(nn40Var.requireActivity().getSupportFragmentManager().G(R.id.flContent) instanceof a)) {
                    nn40Var.R0(false, new jm40());
                }
                break;
        }
        return Unit.a;
    }
}
