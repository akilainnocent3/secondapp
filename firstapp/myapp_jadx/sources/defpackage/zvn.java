package defpackage;

import com.sportybet.android.instantwin.presentation.racingevent.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zvn implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zvn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zrd0 zrd0Var = (zrd0) obj;
                zrd0Var.getClass();
                ((Function1) obj2).invoke(new c.r.d(zrd0Var));
                break;
            default:
                j040 j040Var = (j040) obj2;
                jxo jxoVar = (jxo) obj;
                ((t5a0) j040Var.i).A((int) (jxoVar.a >> 32));
                ((t5a0) j040Var.j).A((int) (jxoVar.a & 4294967295L));
                break;
        }
        return Unit.a;
    }
}
