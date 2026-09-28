package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cdx implements Function0 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ cdx(Function1 function1, String str, Function0 function0) {
        this.a = function1;
        this.b = str;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke(this.b);
        this.c.invoke();
        return Unit.a;
    }
}
