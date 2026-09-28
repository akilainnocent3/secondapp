package defpackage;

import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wtt implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wtt(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                b3u b3uVar = (b3u) obj;
                b3uVar.P1(igm.d.a.a);
                b3uVar.P1(new igm.s(fx3.a, a.c(k00.d)));
                break;
            default:
                ((Function1) obj).invoke(bri0.w.a);
                break;
        }
        return Unit.a;
    }
}
