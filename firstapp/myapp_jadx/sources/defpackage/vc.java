package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class vc extends cny {
    public final /* synthetic */ Function0<Unit> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(Function0<Unit> function0) {
        super(true);
        this.d = function0;
    }

    @Override // defpackage.cny
    public final void b() {
        this.d.invoke();
        f(false);
    }
}
