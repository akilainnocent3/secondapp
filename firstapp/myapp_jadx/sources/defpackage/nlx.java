package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class nlx extends qlr implements Function1<Object, Boolean> {
    public final /* synthetic */ dq40<Object> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nlx(dq40<Object> dq40Var) {
        super(1);
        this.a = dq40Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, hvg0, okd] */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        boolean z;
        ?? r2 = (hvg0) obj;
        if (r2.i().C) {
            this.a.a = r2;
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
