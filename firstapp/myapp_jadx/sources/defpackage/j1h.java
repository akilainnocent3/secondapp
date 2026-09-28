package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j1h implements Function0 {
    public final /* synthetic */ ytw a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ j1h(ytw ytwVar, Function1 function1, boolean z) {
        this.a = ytwVar;
        this.b = function1;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.setValue(new z0h());
        this.b.invoke(Boolean.valueOf(!this.c));
        return Unit.a;
    }
}
