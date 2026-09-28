package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import com.sportybet.android.share.presentation.activity.ShareCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x3w implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x3w(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                tcf tcfVar = (tcf) obj;
                tcfVar.getClass();
                j90 j90VarA = m90.a();
                j90VarA.a(Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f, 0.0f);
                j90VarA.c(0.0f, Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)));
                j90VarA.c(Float.intBitsToFloat((int) (tcfVar.d() >> 32)), Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)));
                j90VarA.close();
                tcf.Q1(tcfVar, j90VarA, ((mz1) obj2).a0, 0.0f, null, 60);
                return Unit.a;
            default:
                ShareCodeActivity shareCodeActivity = (ShareCodeActivity) obj2;
                a aVar = (a) obj;
                e eVar = shareCodeActivity.d;
                if (eVar == null) {
                    Intrinsics.n("commonUiEventProcessor");
                    throw null;
                }
                r490 r490Var = shareCodeActivity.y;
                if (r490Var != null) {
                    eVar.c(aVar, shareCodeActivity, r490Var.S, null);
                    return Unit.a;
                }
                Intrinsics.n("binding");
                throw null;
        }
    }
}
