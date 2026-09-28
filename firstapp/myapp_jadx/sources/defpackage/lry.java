package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class lry implements Function1<Boolean, Unit> {
    public final /* synthetic */ zqy a;

    public lry(zqy zqyVar) {
        this.a = zqyVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        bool2.getClass();
        ((x5a0) this.a.p0().W).setValue(bool2);
        return Unit.a;
    }
}
