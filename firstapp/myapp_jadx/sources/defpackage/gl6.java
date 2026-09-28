package defpackage;

import com.sportybet.android.cashoutphase3.a;
import com.sportybet.android.cashoutphase3.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gl6 implements Function0 {
    public final /* synthetic */ b a;
    public final /* synthetic */ String b;
    public final /* synthetic */ a.d.c c;

    public /* synthetic */ gl6(b bVar, String str, a.d.c cVar) {
        this.a = bVar;
        this.b = str;
        this.c = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b bVar = this.a;
        bVar.D0().m();
        bVar.s0().L1(this.b, this.c.b >= 0);
        return Unit.a;
    }
}
