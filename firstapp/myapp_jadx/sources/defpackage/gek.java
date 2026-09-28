package defpackage;

import com.google.protobuf.RuntimeVersion;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.home.domain.GetSportySimConfigUseCase", f = "GetSportySimConfigUseCase.kt", l = {RuntimeVersion.MINOR}, m = "invoke-IoAF18A", v = 2)
public final class gek extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ hek b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gek(hek hekVar, x1b x1bVar) {
        super(x1bVar);
        this.b = hekVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
