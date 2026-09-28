package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cxb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cxb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                j5i j5iVar = (j5i) obj;
                j5iVar.getClass();
                ((ytw) obj2).setValue(Boolean.valueOf(j5iVar.a()));
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((Function1) obj2).invoke(new ot70.l(str));
                break;
        }
        return Unit.a;
    }
}
