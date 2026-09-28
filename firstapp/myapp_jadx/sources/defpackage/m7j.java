package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.views.FruitHuntFragment", f = "FruitHuntFragment.kt", l = {1939, 1940, 1941, 1942, 1943, 1944, 1945}, m = "launchDroplets", v = 1)
public final class m7j extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ u6j b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7j(u6j u6jVar, x1b x1bVar) {
        super(x1bVar);
        this.b = u6jVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.m1(this);
    }
}
