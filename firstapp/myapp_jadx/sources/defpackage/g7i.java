package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g7i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g7i(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function0) obj).invoke();
                return Unit.a;
            case 1:
                m410 m410Var = (m410) obj;
                m410Var.t0 = false;
                m410Var.z0();
                m410Var.m1();
                return Unit.a;
            default:
                ee<Unit> eeVar = ((fx40) obj).f;
                Unit unit = Unit.a;
                eeVar.b(unit);
                return unit;
        }
    }
}
