package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t1i implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t1i(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                duw duwVar = (duw) obj2;
                Object[] objArr = duwVar.a;
                int i2 = duwVar.c;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((biv) objArr[i3]).l();
                }
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((fbw) obj2).invoke(str);
                break;
        }
        return Unit.a;
    }
}
