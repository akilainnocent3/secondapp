package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sk8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sk8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fme fmeVar = ((zk8) obj2).w;
                fmeVar.getClass();
                fmeVar.v.setText((String) obj);
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                yfx.h((hjx) obj2, new a0c.c(str), null, 6);
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                ((Function1) obj2).invoke(new zxq.r(str2));
                break;
        }
        return Unit.a;
    }
}
