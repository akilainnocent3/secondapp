package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gcb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gcb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fgb fgbVar = (fgb) obj2;
                String str = (String) obj;
                str.getClass();
                ((x5a0) fgbVar.c1().H).setValue(str);
                ((x5a0) fgbVar.c1().K).setValue(new j58(fgbVar.b1().P()));
                ((x5a0) fgbVar.c1().L).setValue(new j58(fgbVar.b1().x0));
                break;
            default:
                f0z f0zVar = (f0z) obj2;
                g0z item = f0zVar.getItem(((Integer) obj).intValue());
                item.getClass();
                g0z.a aVar = (g0z.a) item;
                fz4 fz4Var = f0zVar.b;
                if (fz4Var != null) {
                    fz4Var.a(new ez4.c(aVar.a.a));
                }
                break;
        }
        return Unit.a;
    }
}
