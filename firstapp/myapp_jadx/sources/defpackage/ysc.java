package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ysc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ysc(int i, Object obj, Object obj2) {
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
                k4i k4iVar = (k4i) obj3;
                ytw ytwVar = (ytw) obj2;
                j5i j5iVar = (j5i) obj;
                j5iVar.getClass();
                if (j5iVar.a()) {
                    ytwVar.setValue(Boolean.TRUE);
                    k4iVar.t(false);
                }
                break;
            default:
                pb80 pb80Var = (pb80) obj;
                ohp<Object>[] ohpVarArr = lb80.a;
                ob80<Float> ob80Var = hb80.s;
                ohp<Object> ohpVar = lb80.a[10];
                pb80Var.b(ob80Var, Float.valueOf(1.0f));
                lb80.c(pb80Var, (String) obj3);
                pb80Var.b(ra80.b, new c6(null, new a14((Function0) obj2, 1)));
                break;
        }
        return Unit.a;
    }
}
