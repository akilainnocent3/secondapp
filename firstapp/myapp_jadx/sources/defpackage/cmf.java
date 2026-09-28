package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.editbet.domain.usecase.EditBetEventUseCase", f = "EditBetEventUseCase.kt", l = {40, 49, 54}, m = "getEditBetDetailSuspend", v = 2)
public final class cmf extends x1b {
    public String a;
    public String b;
    public List c;
    public List d;
    public /* synthetic */ Object e;
    public final /* synthetic */ emf f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmf(emf emfVar, x1b x1bVar) {
        super(x1bVar);
        this.f = emfVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
