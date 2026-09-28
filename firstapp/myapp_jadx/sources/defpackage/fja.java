package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fja implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ytw b;

    public /* synthetic */ fja(ytw ytwVar, int i) {
        this.a = i;
        this.b = ytwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ytw ytwVar = this.b;
        switch (i) {
            case 0:
                ytwVar.setValue(Boolean.valueOf(!((Boolean) ytwVar.getValue()).booleanValue()));
                break;
            default:
                ytwVar.setValue(dpj.d.a);
                break;
        }
        return Unit.a;
    }
}
