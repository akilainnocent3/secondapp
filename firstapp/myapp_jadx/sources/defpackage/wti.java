package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.core.domain.usecase.FormatCurrencyAmountUseCase", f = "FormatCurrencyAmountUseCase.kt", l = {169}, m = "formatWithSymbol", v = 2)
public final class wti extends x1b {
    public String a;
    public String b;
    public String c;
    public Locale d;
    public String e;
    public boolean f;
    public boolean i;
    public double v;
    public /* synthetic */ Object w;
    public final /* synthetic */ uti y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wti(uti utiVar, x1b x1bVar) {
        super(x1bVar);
        this.y = utiVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.c(null, null, null, false, false, null, this);
    }
}
