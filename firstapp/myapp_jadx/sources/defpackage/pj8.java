package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pj8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pj8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke(new ech0.f(((q5d) obj).a));
                break;
            case 1:
                ((Function1) obj2).invoke(((gdc) obj).b);
                break;
            case 2:
                ((uyg) obj2).c.j((String) obj);
                break;
            default:
                ((ytw) obj).setValue(Boolean.FALSE);
                ((Function0) obj2).invoke();
                break;
        }
        return Unit.a;
    }
}
