package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class vcl0 extends yqk0 {
    public final /* synthetic */ nfl0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vcl0(nfl0 nfl0Var, zal0 zal0Var) {
        super(zal0Var);
        Objects.requireNonNull(nfl0Var);
        this.e = nfl0Var;
    }

    @Override // defpackage.yqk0
    public final void a() {
        this.e.m();
    }
}
