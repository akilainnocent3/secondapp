package androidx.compose.ui.layout;

import defpackage.qlr;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class e extends qlr implements Function2<y.a, Float, Float> {
    public final /* synthetic */ f[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f[] fVarArr) {
        super(2);
        this.a = fVarArr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Float invoke(y.a aVar, Float f) {
        return Float.valueOf(c0.a(aVar, false, this.a, f.floatValue()));
    }
}
