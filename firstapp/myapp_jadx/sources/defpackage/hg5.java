package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hg5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hg5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ytw) obj).setValue(Boolean.FALSE);
                return Unit.a;
            case 1:
                lke lkeVar = ((u3e) obj).i;
                if (lkeVar != null) {
                    ow.c(lkeVar.e.c);
                    return Unit.a;
                }
                Intrinsics.n("binding");
                throw null;
            default:
                ((Function1) obj).invoke(xia0.b);
                return Unit.a;
        }
    }
}
