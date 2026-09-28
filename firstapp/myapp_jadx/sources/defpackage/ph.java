package defpackage;

import com.sporty.android.book.domain.entity.RelatedBet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ph implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ph(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                mjj0 mjj0Var = (mjj0) obj2;
                yi.c cVar = yi.c.a;
                mjj0Var.getClass();
                cVar.getClass();
                mjj0Var.A0.a(cVar);
                ((yfx) obj).k();
                break;
            default:
                ((Function1) obj2).invoke(((RelatedBet) obj).getEvent());
                break;
        }
        return Unit.a;
    }
}
