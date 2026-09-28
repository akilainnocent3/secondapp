package defpackage;

import androidx.fragment.app.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m320 implements Function1 {
    public final /* synthetic */ r320 a;

    public /* synthetic */ m320(r320 r320Var) {
        this.a = r320Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        r320 r320Var = this.a;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        e activity = r320Var.getActivity();
        if (activity != null && ((br3) mmc.a(hp0.A, br3.class)).U().I != (z = !zBooleanValue)) {
            ((br3) mmc.a(hp0.A, br3.class)).U().a(activity, z);
        }
        return Unit.a;
    }
}
