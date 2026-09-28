package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class hry implements Function1<Boolean, Unit> {
    public final /* synthetic */ zqy a;

    public hry(zqy zqyVar) {
        this.a = zqyVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        bool.getClass();
        zqy zqyVar = this.a;
        ((x5a0) zqyVar.p0().e).setValue(Boolean.FALSE);
        ((x5a0) zqyVar.p0().B).setValue(0);
        v91.b.j("0");
        return Unit.a;
    }
}
