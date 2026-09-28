package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class unc implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ unc(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                mb80.a(pb80Var);
                return Unit.a;
            default:
                MatchResult matchResult = (MatchResult) obj;
                matchResult.getClass();
                return StringsKt.Z(2, matchResult.getValue());
        }
    }
}
