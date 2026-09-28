package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.language.LanguageUtil", f = "LanguageUtil.kt", l = {121, 123, 128}, m = "fetchAndStoreLanguageList", v = 2)
public final class emr extends x1b {
    public jmr a;
    public bcp b;
    public /* synthetic */ Object c;
    public final /* synthetic */ jmr d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emr(jmr jmrVar, x1b x1bVar) {
        super(x1bVar);
        this.d = jmrVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
