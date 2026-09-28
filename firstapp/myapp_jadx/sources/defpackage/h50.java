package defpackage;

import android.content.res.Resources;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class h50 extends qlr implements Function1<bb80, Boolean> {
    public final /* synthetic */ Resources a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h50(Resources resources) {
        super(1);
        this.a = resources;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(bb80 bb80Var) {
        return Boolean.valueOf(i50.f(bb80Var, this.a));
    }
}
