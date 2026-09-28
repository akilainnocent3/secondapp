package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class jy70 implements Function0<Unit> {
    public final /* synthetic */ v5b a;
    public final /* synthetic */ ved b;
    public final /* synthetic */ int c;

    public jy70(v5b v5bVar, ved vedVar, int i) {
        this.a = v5bVar;
        this.b = vedVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ej5.c(this.a, null, null, new iy70(this.c, null, this.b), 3);
        return Unit.a;
    }
}
