package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d0z implements Function1 {
    public final /* synthetic */ f0z a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        f0z f0zVar = this.a;
        g0z item = f0zVar.getItem(iIntValue);
        item.getClass();
        g0z.a aVar = (g0z.a) item;
        fz4 fz4Var = f0zVar.b;
        if (fz4Var != null) {
            fz4Var.a(new ez4.b(aVar.a.a));
        }
        return Unit.a;
    }
}
