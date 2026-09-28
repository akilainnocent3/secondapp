package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.codehub.ui.PopularCodeFragment", f = "PopularCodeFragment.kt", l = {424}, m = "handleShareResult", v = 2)
public final class s320 extends x1b {
    public mg6 a;
    public zha0 b;
    public ArrayList c;
    public List d;
    public /* synthetic */ Object e;
    public final /* synthetic */ r320 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s320(r320 r320Var, x1b x1bVar) {
        super(x1bVar);
        this.f = r320Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.v0(null, null, null, this);
    }
}
