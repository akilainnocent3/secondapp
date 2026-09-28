package defpackage;

import com.sportybet.android.cashoutphase3.a;
import com.sportybet.android.cashoutphase3.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hl6 implements Function0 {
    public final /* synthetic */ b a;
    public final /* synthetic */ String b;
    public final /* synthetic */ a.d.c c;

    public /* synthetic */ hl6(b bVar, String str, a.d.c cVar) {
        this.a = bVar;
        this.b = str;
        this.c = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z = this.c.b >= 0;
        b bVar = this.a;
        bVar.o0 = true;
        bVar.p0 = this.b;
        bVar.q0 = z;
        wq3 wq3Var = bVar.R;
        if (wq3Var != null) {
            wq3Var.w(false);
            return Unit.a;
        }
        Intrinsics.n("betslipManager");
        throw null;
    }
}
