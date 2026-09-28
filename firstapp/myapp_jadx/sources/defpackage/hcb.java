package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class hcb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hcb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((fgb) obj2).N0(str);
                break;
            default:
                f0z f0zVar = (f0z) obj2;
                g0z item = f0zVar.getItem(((Integer) obj).intValue());
                item.getClass();
                g0z.a aVar = (g0z.a) item;
                fz4 fz4Var = f0zVar.b;
                if (fz4Var != null) {
                    gz4 gz4Var = aVar.a;
                    fz4Var.a(new ez4.a(gz4Var.a, gz4Var.d.size()));
                }
                break;
        }
        return Unit.a;
    }
}
