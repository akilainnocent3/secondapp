package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.antest.repository.AnTestRepositoryImpl", f = "AnTestRepositoryImpl.kt", l = {183}, m = "canConvert", v = 2)
public final class jz extends x1b {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tz c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz(tz tzVar, x1b x1bVar) {
        super(x1bVar);
        this.c = tzVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.h(null, this);
    }
}
