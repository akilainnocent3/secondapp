package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.multilevel.sportycar.views.SportyCarFragment", f = "SportyCarFragment.kt", l = {335, 343, 350, 362}, m = "loadSpineFilesSuspend", v = 1)
public final class cmb0 extends x1b {
    public String a;
    public String b;
    public String c;
    public Context d;
    public bq40 e;
    public int f;
    public /* synthetic */ Object i;
    public final /* synthetic */ ylb0 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmb0(ylb0 ylb0Var, x1b x1bVar) {
        super(x1bVar);
        this.v = ylb0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.J3(null, null, null, this);
    }
}
