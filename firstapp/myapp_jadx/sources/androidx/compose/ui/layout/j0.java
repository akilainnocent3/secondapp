package androidx.compose.ui.layout;

import defpackage.qlr;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends qlr implements Function2<y.a, Float, Float> {
    public final /* synthetic */ k0[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0[] k0VarArr) {
        super(2);
        this.a = k0VarArr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Float invoke(y.a aVar, Float f) {
        return Float.valueOf(c0.a(aVar, false, this.a, f.floatValue()));
    }
}
