package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class emz implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ emz(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((Function1) obj3).invoke(new zlz.a(str, ((zsq.c) obj2).b));
                break;
            default:
                tcf tcfVar = (tcf) obj;
                tcfVar.getClass();
                tcf.I(tcfVar, j58.f, -90.0f, ((Number) ((wd0) obj3).d()).floatValue(), false, 0L, 0L, 0.0f, (yae0) obj2, 880);
                break;
        }
        return Unit.a;
    }
}
