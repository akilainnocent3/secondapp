package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vfx implements Function0 {
    public final /* synthetic */ yfx a;

    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        yfx yfxVar = this.a;
        yfx.c cVar = yfxVar.f;
        if (yfxVar.g) {
            z = yfxVar.d() > 1;
        }
        cVar.f(z);
        return Unit.a;
    }
}
