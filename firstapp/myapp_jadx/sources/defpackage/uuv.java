package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class uuv implements Function1<Boolean, Unit> {
    public final /* synthetic */ ytw<Boolean> a;

    public uuv(ytw<Boolean> ytwVar) {
        this.a = ytwVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        bool2.getClass();
        float f = xuv.a;
        this.a.setValue(bool2);
        return Unit.a;
    }
}
