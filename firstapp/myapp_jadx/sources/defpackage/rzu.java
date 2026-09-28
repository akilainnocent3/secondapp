package defpackage;

import com.sportybet.android.virtual.presentation.activity.MatchEventDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rzu implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rzu(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = MatchEventDetailActivity.U;
                ((MatchEventDetailActivity) obj).I1().r(2);
                return Unit.a;
            case 1:
                zpz zpzVar = (zpz) obj;
                return Integer.valueOf(zpzVar.k.c() ? ((u5a0) zpzVar.t).D() : zpzVar.k());
            default:
                ((Function1) obj).invoke(vdv.a);
                return Unit.a;
        }
    }
}
