package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class tvx implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tvx(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((b5) sjj.b().c.d.a(jq40.a(b5.class), null, null)).gotoSportyBet(xae.c, null);
                ((Function0) obj).invoke();
                break;
            case 1:
                ((zy10) obj).R0();
                break;
            default:
                ((Function1) obj).invoke(bri0.g.a);
                break;
        }
        return Unit.a;
    }
}
