package defpackage;

import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ynf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ynf(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ytw) obj).setValue(Boolean.TRUE);
                return Unit.a;
            case 1:
                return Float.valueOf(((fmt) obj).g());
            default:
                PreMatchSportActivity preMatchSportActivity = (PreMatchSportActivity) obj;
                hjd0 hjd0Var = preMatchSportActivity.b;
                if (hjd0Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ymh ymhVar = new ymh(preMatchSportActivity);
                ymhVar.b = new PreMatchSportActivity.b(hjd0Var, preMatchSportActivity);
                return ymhVar;
        }
    }
}
