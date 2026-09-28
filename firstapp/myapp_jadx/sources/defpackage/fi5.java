package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fi5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fi5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = ((qh5) obj).l;
                if (i2 == 1) {
                    return Integer.valueOf(R.string.common_functions__cash_gift);
                }
                if (i2 == 2) {
                    return Integer.valueOf(R.string.common_functions__discount_gift);
                }
                if (i2 == 3) {
                    return Integer.valueOf(R.string.common_functions__free_bet_gift);
                }
                return null;
            default:
                u6j u6jVar = (u6j) obj;
                if (u6jVar.Y) {
                    u6jVar.o0(new a1j(false, u6jVar, m7i0.a(R.string.cannot_use_chips_free_bet_cms, R.string.cannot_use_chips_free_bet, u6jVar)));
                    ej5.c(o8i0.d(u6jVar.t0()), null, null, new r3j(u6jVar, null), 3);
                }
                return Unit.a;
        }
    }
}
