package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zha implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ytw b;

    public /* synthetic */ zha(ytw ytwVar, int i) {
        this.a = i;
        this.b = ytwVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ytw ytwVar = this.b;
        switch (i) {
            case 0:
                ytwVar.setValue(Boolean.TRUE);
                break;
            default:
                ytwVar.setValue(Boolean.TRUE);
                break;
        }
        return Unit.a;
    }
}
