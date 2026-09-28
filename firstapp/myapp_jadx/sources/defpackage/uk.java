package defpackage;

import com.sportybet.feature.remixbet.presentation.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uk implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uk(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                sh8.c().e(o7d.a(wae.HOME));
                ((wk) obj).requireActivity().finish();
                break;
            default:
                ((Function1) obj).invoke(a.b.a);
                break;
        }
        return Unit.a;
    }
}
