package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class j95<T> implements myh {
    public final /* synthetic */ d95 a;

    public j95(d95 d95Var) {
        this.a = d95Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.myh
    public final Object emit(Object obj, v1b v1bVar) {
        Object value;
        String str = (String) obj;
        wwd0 wwd0Var = this.a.y;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, c95.a((c95) value, str, null, null, 6)));
        return Unit.a;
    }
}
