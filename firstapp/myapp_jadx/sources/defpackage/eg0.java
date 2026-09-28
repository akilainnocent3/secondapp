package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class eg0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ ytw c;

    public /* synthetic */ eg0(Object obj, ytw ytwVar, int i) {
        this.a = i;
        this.b = obj;
        this.c = ytwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ytw ytwVar = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                ytwVar.setValue(Boolean.valueOf(!((Boolean) ytwVar.getValue()).booleanValue()));
                ((Function0) obj).invoke();
                break;
            default:
                ((ssd0) obj).d(((osw) ytwVar).D() == 2);
                break;
        }
        return Unit.a;
    }
}
