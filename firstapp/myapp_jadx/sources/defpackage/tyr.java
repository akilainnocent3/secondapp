package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tyr implements Function0 {
    public final /* synthetic */ uyr a;

    public /* synthetic */ tyr(uyr uyrVar) {
        this.a = uyrVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        uyr uyrVar = this.a;
        return Float.valueOf(uyrVar.E.d() - uyrVar.E.a());
    }
}
