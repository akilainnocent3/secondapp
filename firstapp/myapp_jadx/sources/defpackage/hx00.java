package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class hx00 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ haj b;

    public /* synthetic */ hx00(haj hajVar, int i) {
        this.a = i;
        this.b = hajVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        haj hajVar = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).booleanValue();
                ((Function0) hajVar).invoke();
                break;
            default:
                q5z q5zVar = (q5z) obj;
                q5zVar.getClass();
                ((Function1) hajVar).invoke(q5zVar);
                break;
        }
        return Unit.a;
    }
}
