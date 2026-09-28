package defpackage;

import com.sportybet.android.globalpay.pixBtg.withdraw.b;
import com.sportybet.android.instantwin.presentation.racingevent.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xvn implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xvn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(c.InterfaceC0309c.b.a);
                return Unit.a;
            case 1:
                ((Function1) obj).invoke(b.i.a);
                return Unit.a;
            default:
                k5b k5bVar = ((p35) obj).b.get();
                k5bVar.getClass();
                return w5b.a(k5bVar);
        }
    }
}
