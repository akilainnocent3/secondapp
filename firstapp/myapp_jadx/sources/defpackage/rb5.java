package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class rb5 implements gaj {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rb5(Object obj, Function1 function1) {
        this.a = function1;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        lpy.a(this.a, this.b, (CoroutineContext) obj3);
        return Unit.a;
    }
}
