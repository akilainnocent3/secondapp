package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel", f = "NightNDayViewModel.kt", l = {601}, m = "safeAwait", v = 1)
public final class lux<T> extends x1b {
    public ojd a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gux c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lux(gux guxVar, x1b x1bVar) {
        super(x1bVar);
        this.c = guxVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.C1(null, this);
    }
}
