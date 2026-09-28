package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l8j implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ l8j(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Unit.a;
            default:
                nex nexVar = (nex) obj;
                nexVar.getClass();
                String str = nexVar.a;
                return v70.b(str, "={", str, "}");
        }
    }
}
