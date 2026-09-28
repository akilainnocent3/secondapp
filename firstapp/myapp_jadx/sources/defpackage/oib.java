package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class oib implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oib(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zqy zqyVar = (zqy) obj;
                ((x5a0) mhb.d.b).setValue(Boolean.FALSE);
                hvi hviVar = zqyVar.a;
                if (hviVar != null) {
                    hviVar.f.setVisibility(8);
                }
                hvi hviVar2 = zqyVar.a;
                if (hviVar2 == null) {
                    return null;
                }
                hviVar2.f.setContent(zv8.a);
                return Unit.a;
            default:
                ((Function1) obj).invoke(vs40.d.a);
                return Unit.a;
        }
    }
}
