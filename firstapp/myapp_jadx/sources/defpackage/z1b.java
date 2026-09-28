package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z1b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z1b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(rn30.c.a);
                break;
            default:
                b8b0 b8b0Var = (b8b0) obj;
                if (!(b8b0Var.requireActivity().getSupportFragmentManager().G(R.id.flContent) instanceof a)) {
                    b8b0Var.K0();
                }
                break;
        }
        return Unit.a;
    }
}
