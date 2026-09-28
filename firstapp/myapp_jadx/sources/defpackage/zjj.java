package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zjj implements Function0 {
    public final /* synthetic */ bkj a;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        bkj bkjVar = this.a;
        if (bkjVar.b == null) {
            Intrinsics.n("dismissListener");
            throw null;
        }
        Unit unit = Unit.a;
        bkjVar.dismiss();
        return Unit.a;
    }
}
