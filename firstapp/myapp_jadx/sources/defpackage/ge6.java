package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ge6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ge6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ema emaVar = (ema) obj;
                c9p c9pVar = (c9p) ((dq40) obj2).a;
                if (c9pVar != null) {
                    c9pVar.cancel((CancellationException) null);
                }
                emaVar.d();
                break;
            default:
                ((Function1) obj2).invoke(((ce90.b) obj).d);
                break;
        }
        return Unit.a;
    }
}
