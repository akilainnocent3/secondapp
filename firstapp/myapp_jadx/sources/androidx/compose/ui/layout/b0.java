package androidx.compose.ui.layout;

import defpackage.urr;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {
    public final Function2<y.a, Float, Float> a;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(Function2<? super y.a, ? super Float, Float> function2) {
        this.a = function2;
    }

    public abstract float a(float f, urr urrVar, urr urrVar2);
}
