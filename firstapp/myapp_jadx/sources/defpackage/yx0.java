package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class yx0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yx0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new hx0((Object[]) obj);
            case 1:
                return Boolean.valueOf(((zy10) obj).i1());
            case 2:
                ((gwt) obj).invoke();
                return Unit.a;
            default:
                ((Function1) obj).invoke(bri0.p.a);
                return Unit.a;
        }
    }
}
