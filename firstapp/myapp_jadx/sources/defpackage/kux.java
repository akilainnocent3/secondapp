package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel", f = "NightNDayViewModel.kt", l = {580, 585}, m = "handleError", v = 1)
public final class kux extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ gux b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kux(gux guxVar, x1b x1bVar) {
        super(x1bVar);
        this.b = guxVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.y1(null, this);
    }
}
