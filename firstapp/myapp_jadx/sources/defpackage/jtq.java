package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class jtq implements Function1<String, Unit> {
    public final /* synthetic */ Function1<buq, Unit> a;

    /* JADX WARN: Multi-variable type inference failed */
    public jtq(Function1<? super buq, Unit> function1) {
        this.a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        str2.getClass();
        this.a.invoke(new buq.b(str2));
        return Unit.a;
    }
}
