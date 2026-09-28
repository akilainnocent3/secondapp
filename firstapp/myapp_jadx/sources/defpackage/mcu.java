package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mcu implements Function1 {
    public final /* synthetic */ ocu a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ mcu(ocu ocuVar, boolean z) {
        this.a = ocuVar;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jox joxVar = (jox) obj;
        joxVar.getClass();
        ocu ocuVar = this.a;
        ej5.c(o8i0.d(ocuVar), null, null, new adu(joxVar, ocuVar, this.b, null), 3);
        return Unit.a;
    }
}
