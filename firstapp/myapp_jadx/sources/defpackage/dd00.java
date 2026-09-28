package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class dd00<T> implements myh {
    public final /* synthetic */ hd00 a;

    public dd00(hd00 hd00Var) {
        this.a = hd00Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.myh
    public final Object emit(Object obj, v1b v1bVar) {
        Object value;
        bd00 bd00Var;
        m3y m3yVar;
        Boolean bool = (Boolean) obj;
        wwd0 wwd0Var = this.a.c;
        do {
            value = wwd0Var.getValue();
            bd00Var = (bd00) value;
            if (bool != null) {
                m3y.a aVar = m3y.a;
                boolean zBooleanValue = bool.booleanValue();
                aVar.getClass();
                m3yVar = zBooleanValue ? m3y.b : m3y.c;
            } else {
                m3yVar = null;
            }
        } while (!wwd0Var.g(value, bd00.a(bd00Var, null, m3yVar, 1)));
        return Unit.a;
    }
}
