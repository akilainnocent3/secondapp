package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class gs90 implements Function1<String, Unit> {
    public final /* synthetic */ Function1<ss90, Unit> a;

    /* JADX WARN: Multi-variable type inference failed */
    public gs90(Function1<? super ss90, Unit> function1) {
        this.a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        str2.getClass();
        this.a.invoke(new ss90.d.b(str2));
        return Unit.a;
    }
}
