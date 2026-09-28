package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {281, 295}, m = "load")
public final class rz0 extends x1b {
    public List a;
    public z7i b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ vz0 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz0(vz0 vz0Var, x1b x1bVar) {
        super(x1bVar);
        this.f = vz0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.b(this);
    }
}
