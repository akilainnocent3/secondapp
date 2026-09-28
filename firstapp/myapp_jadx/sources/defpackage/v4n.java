package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class v4n implements Function1<String, Unit> {
    public final /* synthetic */ Function1<String, Unit> a;

    /* JADX WARN: Multi-variable type inference failed */
    public v4n(Function1<? super String, Unit> function1) {
        this.a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        if (str2 == null) {
            str2 = "";
        }
        this.a.invoke(str2);
        return Unit.a;
    }
}
