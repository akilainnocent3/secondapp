package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.usecase.GetPayHintDescriptionLinesUseCase", f = "GetPayHintDescriptionLinesUseCase.kt", l = {48}, m = "invoke-0E7RQCE", v = 2)
public final class bak extends x1b {
    public ArrayList a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dak c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bak(dak dakVar, x1b x1bVar) {
        super(x1bVar);
        this.c = dakVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Serializable serializableA = this.c.a(this, null, null);
        return serializableA == y5b.a ? serializableA : new zi50(serializableA);
    }
}
