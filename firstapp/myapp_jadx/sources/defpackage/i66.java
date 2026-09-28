package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i66 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ haj b;

    public /* synthetic */ i66(haj hajVar, int i) {
        this.a = i;
        this.b = hajVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        haj hajVar = this.b;
        switch (i) {
            case 0:
                ((Function0) hajVar).invoke();
                break;
            case 1:
                ((Function0) hajVar).invoke();
                break;
            default:
                ((Function1) hajVar).invoke(new z8x.b(fbx.e, true));
                break;
        }
        return Unit.a;
    }
}
