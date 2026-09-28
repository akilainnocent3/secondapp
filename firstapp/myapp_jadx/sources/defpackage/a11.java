package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", l = {412}, m = "runCached")
public final class a11 extends x1b {
    public z01.b a;
    public /* synthetic */ Object b;
    public final /* synthetic */ z01 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a11(z01 z01Var, x1b x1bVar) {
        super(x1bVar);
        this.c = z01Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, null, null, this);
    }
}
