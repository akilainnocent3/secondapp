package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class kj60 implements Function0 {
    public final /* synthetic */ mj60 a;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        mj60 mj60Var = this.a;
        if (mj60Var.b == null) {
            Intrinsics.n("dismissListener");
            throw null;
        }
        Unit unit = Unit.a;
        mj60Var.dismiss();
        return Unit.a;
    }
}
