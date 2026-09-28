package defpackage;

import com.sportybet.android.cashoutphase3.AutoCashoutResultView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pc1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pc1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                AutoCashoutResultView.b bVar = (AutoCashoutResultView.b) obj3;
                pl6 pl6Var = (pl6) obj2;
                int i2 = AutoCashoutResultView.i;
                if (bVar == null) {
                    return null;
                }
                bVar.a(pl6Var);
                return null;
            default:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.B(((Number) ((wd0) obj3).d()).floatValue());
                a7lVar.f(((Number) ((wd0) obj2).d()).floatValue());
                return Unit.a;
        }
    }
}
