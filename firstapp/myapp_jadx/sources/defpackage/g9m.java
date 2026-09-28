package defpackage;

import com.sportybet.feature.luckynumber.placebet.presentation.HowToPlayPresentation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g9m implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ haj b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g9m(int i, haj hajVar, Object obj) {
        this.a = i;
        this.b = hajVar;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        haj hajVar = this.b;
        switch (i) {
            case 0:
                ((Function0) hajVar).invoke();
                ((b1g0) obj).a();
                break;
            default:
                ((Function1) hajVar).invoke(new zxq.l(((zsq.f) ((e0q.a) obj).a).c, HowToPlayPresentation.MAIN_DRAW_DIALOG));
                break;
        }
        return Unit.a;
    }
}
