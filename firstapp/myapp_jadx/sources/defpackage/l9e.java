package defpackage;

import com.sportybet.android.instantwin.presentation.bethistory2.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l9e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l9e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                r9e r9eVar = (r9e) obj;
                iod.a aVar = r9eVar.A;
                w9e w9eVar = r9eVar.f;
                aVar.getClass();
                w9eVar.getClass();
                return new iod(aVar.a, aVar.b, w9eVar);
            default:
                ((Function1) obj).invoke(a.m.a);
                return Unit.a;
        }
    }
}
