package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x6w implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x6w(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(((y6w) obj2).a.b(((z6w) obj).e));
            case 1:
                String str = (String) obj;
                str.getClass();
                ((nn40) obj2).v0(str);
                return Unit.a;
            default:
                f290 f290Var = (f290) obj2;
                f290Var.y.setValue(rdk.a.a);
                f290Var.G.setValue(null);
                ej5.c(o8i0.d(f290Var), null, null, new h290(null, f290Var), 3);
                return Unit.a;
        }
    }
}
