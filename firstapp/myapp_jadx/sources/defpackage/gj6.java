package defpackage;

import com.sportybet.android.cashoutphase3.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gj6 implements Function0 {
    public final /* synthetic */ b a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ gj6(b bVar, String str, int i) {
        this.a = bVar;
        this.b = str;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b bVar = this.a;
        bVar.D0().m();
        String str = this.b;
        if (str != null) {
            bVar.s0().L1(str, this.c >= 0);
        }
        return Unit.a;
    }
}
