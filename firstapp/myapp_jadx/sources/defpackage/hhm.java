package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hhm implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ haj b;

    public /* synthetic */ hhm(haj hajVar, int i) {
        this.a = i;
        this.b = hajVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        haj hajVar = this.b;
        switch (i) {
            case 0:
                ((xbm) hajVar).invoke(zgm.c.a);
                break;
            default:
                ((Function0) hajVar).invoke();
                break;
        }
        return Unit.a;
    }
}
