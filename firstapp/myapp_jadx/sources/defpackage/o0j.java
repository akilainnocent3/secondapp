package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o0j implements Function0 {
    public final /* synthetic */ n2j a;

    public /* synthetic */ o0j(n2j n2jVar) {
        this.a = n2jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        djh djhVar = this.a.b;
        if (djhVar != null) {
            djhVar.d.d();
        }
        return Unit.a;
    }
}
