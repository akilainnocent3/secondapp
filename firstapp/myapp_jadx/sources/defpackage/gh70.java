package defpackage;

import com.sportybet.android.instantwin.presentation.scheduledfootball.b;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gh70 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gh70(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(b.r.a.a);
                break;
            default:
                fpb0 fpb0Var = (fpb0) obj;
                fpb0Var.f.invoke(0);
                Unit unit = Unit.a;
                fpb0Var.h.x1(CollectionsKt.A0(fpb0Var.n), !fpb0Var.n.isEmpty());
                break;
        }
        return Unit.a;
    }
}
