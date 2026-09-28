package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.common.util.LocalizedDrawableProvider", f = "LocalizedDrawableProvider.kt", l = {10}, m = "getUpdateAvailableRes", v = 2)
public final class get extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ het b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public get(het hetVar, x1b x1bVar) {
        super(x1bVar);
        this.b = hetVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
