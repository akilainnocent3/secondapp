package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.register.presentation.br.BrRegistrationSuccessfulViewModel", f = "BrRegistrationSuccessfulViewModel.kt", l = {227, 236}, m = "toUiModel", v = 2)
public final class m95 extends x1b {
    public boolean A;
    public long B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ d95 E;
    public int F;
    public qlw a;
    public String b;
    public qcn c;
    public Object d;
    public Iterator e;
    public Float f;
    public String i;
    public String v;
    public Collection w;
    public boolean y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m95(d95 d95Var, x1b x1bVar) {
        super(x1bVar);
        this.E = d95Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        int i = d95.B;
        return this.E.B1(null, false, this);
    }
}
