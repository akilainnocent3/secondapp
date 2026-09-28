package defpackage;

import com.sportybet.android.instantwin.presentation.racingevent.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vvn implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vvn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((Function1) obj2).invoke(new c.d(str));
                break;
            default:
                w0a0 w0a0Var = (w0a0) obj2;
                jxo jxoVar = (jxo) obj;
                ((u5a0) w0a0Var.k).k((int) (jxoVar.a >> 32));
                ((u5a0) w0a0Var.l).k((int) (jxoVar.a & 4294967295L));
                break;
        }
        return Unit.a;
    }
}
