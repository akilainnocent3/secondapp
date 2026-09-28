package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eb2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eb2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                hlf0 hlf0Var = (hlf0) obj;
                return Boolean.valueOf(hlf0Var != null ? ((Boolean) new dlf0(hlf0Var).invoke()).booleanValue() : false);
            default:
                fgb fgbVar = (fgb) obj;
                fgbVar.B = false;
                fgbVar.z0();
                fgbVar.o2();
                return Unit.a;
        }
    }
}
