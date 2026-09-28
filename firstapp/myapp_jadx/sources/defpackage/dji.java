package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dji implements Function0 {
    public final /* synthetic */ mmd a;
    public final /* synthetic */ ytw b;

    public /* synthetic */ dji(mmd mmdVar, ytw ytwVar) {
        this.a = mmdVar;
        this.b = ytwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Float.valueOf(this.a.C1(((g7f) this.b.getValue()).a));
    }
}
