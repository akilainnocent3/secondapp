package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class g50 extends qlr implements Function1<bb80, Boolean> {
    public final /* synthetic */ gwo<eb80> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g50(gwo<eb80> gwoVar) {
        super(1);
        this.a = gwoVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(bb80 bb80Var) {
        return Boolean.valueOf(this.a.a(bb80Var.g));
    }
}
