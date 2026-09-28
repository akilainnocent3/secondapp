package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e6u implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ e6u(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                dsq dsqVar = (dsq) obj;
                dsqVar.getClass();
                return dsqVar.a;
            default:
                return Unit.a;
        }
    }
}
