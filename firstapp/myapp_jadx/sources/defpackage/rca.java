package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class rca implements Function0<Unit> {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0<Unit> b;
    public final /* synthetic */ ytw<Integer> c;

    public rca(int i, Function0<Unit> function0, ytw<Integer> ytwVar) {
        this.a = i;
        this.b = function0;
        this.c = ytwVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.c.setValue(Integer.valueOf(this.a));
        this.b.invoke();
        return Unit.a;
    }
}
