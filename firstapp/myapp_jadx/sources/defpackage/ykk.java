package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.lgg.GiftGrabInfoUseCase", f = "GiftGrabInfoUseCase.kt", l = {56}, m = "getRecordFromDataStore", v = 2)
public final class ykk extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ alk b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ykk(alk alkVar, x1b x1bVar) {
        super(x1bVar);
        this.b = alkVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
