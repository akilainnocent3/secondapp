package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class vo70 {
    public final Function0<Float> a;
    public final Function0<Float> b;
    public final boolean c;

    public vo70(Function0<Float> function0, Function0<Float> function1, boolean z) {
        this.a = function0;
        this.b = function1;
        this.c = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(this.a.invoke().floatValue());
        sb.append(", maxValue=");
        sb.append(this.b.invoke().floatValue());
        sb.append(", reverseScrolling=");
        return ruw.a(sb, this.c, ')');
    }
}
