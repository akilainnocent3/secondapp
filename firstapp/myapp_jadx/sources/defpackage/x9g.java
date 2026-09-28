package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x9g implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                MatchResult matchResult = (MatchResult) obj;
                matchResult.getClass();
                String str = y9g.b.get(matchResult.a().get(1));
                return str != null ? str : matchResult.getValue();
            case 1:
                q470 q470Var = (q470) obj;
                q470Var.getClass();
                t470 t470Var = q470Var.e;
                return Boolean.valueOf(t470Var != null && t470Var == t470.LOTTIE);
            default:
                ((String) obj).getClass();
                return Boolean.TRUE;
        }
    }
}
