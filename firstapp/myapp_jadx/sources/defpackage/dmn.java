package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class dmn extends qlr implements Function1<l5y, Unit> {
    public final /* synthetic */ emn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmn(emn emnVar) {
        super(1);
        this.a = emnVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(l5y l5yVar) {
        l5y l5yVar2 = l5yVar;
        l5yVar2.a();
        emn emnVar = this.a;
        duw<lyi0<l5y>> duwVar = emnVar.d;
        lyi0<l5y>[] lyi0VarArr = duwVar.a;
        int i = duwVar.c;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            }
            if (Intrinsics.g(lyi0VarArr[i2], l5yVar2)) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            duwVar.k(i2);
        }
        if (duwVar.c == 0) {
            emnVar.b.invoke();
        }
        return Unit.a;
    }
}
