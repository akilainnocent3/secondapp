package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class adb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ adb(int i, Object obj, Object obj2) {
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
                ul2 ul2Var = (ul2) obj2;
                fgb fgbVar = (fgb) obj;
                ul2Var.Q1(-1);
                ul2Var.P1(3);
                ((x5a0) fgbVar.j1).setValue(Boolean.TRUE);
                fgbVar.Z0().g(true);
                return Unit.a;
            default:
                return ((Function1) obj2).invoke(((gkb0) obj).a.getValue());
        }
    }
}
