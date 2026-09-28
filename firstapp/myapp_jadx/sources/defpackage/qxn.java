package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qxn implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qxn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                osw oswVar = (osw) obj2;
                int i2 = (int) (((jxo) obj).a >> 32);
                if (oswVar.D() == 0 || oswVar.D() < i2) {
                    oswVar.k(i2);
                }
                return Unit.a;
            default:
                String str = (String) obj;
                str.getClass();
                return new asa0((Context) obj2, str);
        }
    }
}
