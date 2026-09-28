package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bki implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bki(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(((fmt) obj).g());
            default:
                vad0 vad0Var = (vad0) obj;
                vad0Var.S0().T1(true);
                vad0Var.R0().T1(false);
                ((x5a0) vad0Var.j1).setValue(Boolean.FALSE);
                vad0Var.R0().R1(false);
                vad0Var.S0().R1(false);
                return Unit.a;
        }
    }
}
