package defpackage;

import com.sportybet.android.globalpay.pixBtg.withdraw.e;
import com.sportybet.android.globalpay.pixBtg.withdraw.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zyn implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zyn(Object obj, int i) {
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
                e.c cVar = (e.c) obj;
                cVar.getClass();
                return e.c.a(cVar, ((h) obj2).a.f(), 0.0d, null, null, null, null, 62);
        }
    }
}
