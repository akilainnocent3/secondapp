package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class lny extends cny {
    public final /* synthetic */ Function1<cny, Unit> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lny(Function1 function1) {
        super(true);
        this.d = function1;
    }

    @Override // defpackage.cny
    public final void b() {
        this.d.invoke(this);
    }
}
