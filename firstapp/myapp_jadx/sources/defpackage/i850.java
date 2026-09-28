package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i850 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i850(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(i04.g.a);
                return Unit.a;
            case 1:
                ((Function0) obj).invoke();
                return Unit.a;
            default:
                return bnh0.g(((knh0) obj).f.a.b().d, new String[]{"patron", "accessToken", "extend"});
        }
    }
}
