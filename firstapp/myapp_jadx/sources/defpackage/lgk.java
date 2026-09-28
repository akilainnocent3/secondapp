package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.domain.GetUserCpfUseCase", f = "GetUserCpfUseCase.kt", l = {18}, m = "invoke-IoAF18A", v = 2)
public final class lgk extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ mgk b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgk(mgk mgkVar, x1b x1bVar) {
        super(x1bVar);
        this.b = mgkVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Serializable serializableA = this.b.a(this);
        return serializableA == y5b.a ? serializableA : new zi50(serializableA);
    }
}
