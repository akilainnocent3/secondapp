package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class vwc0 implements Function1<String, Unit> {
    public final /* synthetic */ Function2<String, String, Unit> a;
    public final /* synthetic */ String b;

    public vwc0(String str, Function2 function2) {
        this.a = function2;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        str2.getClass();
        this.a.invoke(this.b, str2);
        return Unit.a;
    }
}
