package defpackage;

import com.sportybet.android.globalpay.pixBtg.deposit.f;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l910 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l910(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                wu1 wu1Var = (wu1) obj2;
                f.c cVar = (f.c) obj;
                cVar.getClass();
                return f.c.a(cVar, null, wu1Var.a, null, null, null, s610.a(cVar.f, wu1Var.b, null, 2), null, null, 221);
            default:
                ytw ytwVar = (ytw) obj2;
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.k(0.0965f);
                a7lVar.v(0.0965f);
                a7lVar.B(((Number) ((Pair) ytwVar.getValue()).a).floatValue() + a7lVar.z());
                a7lVar.f(((Number) ((Pair) ytwVar.getValue()).b).floatValue() + a7lVar.y());
                return Unit.a;
        }
    }
}
