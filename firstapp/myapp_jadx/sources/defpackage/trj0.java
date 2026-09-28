package defpackage;

import com.sporty.android.common_ui.widgets.ClearEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class trj0 implements Function0 {
    public final /* synthetic */ lsj0 a;
    public final /* synthetic */ ClearEditText b;

    public /* synthetic */ trj0(lsj0 lsj0Var, ClearEditText clearEditText) {
        this.a = lsj0Var;
        this.b = clearEditText;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        lsj0 lsj0Var = this.a;
        wwd0 wwd0Var = lsj0Var.V;
        Boolean boolValueOf = Boolean.valueOf(lsj0Var.Z0(this.b));
        wwd0Var.getClass();
        wwd0Var.k(null, boolValueOf);
        return Unit.a;
    }
}
