package androidx.compose.animation;

import defpackage.qlr;
import defpackage.w7g;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class t extends qlr implements Function1<w7g, Boolean> {
    public static final t a = new t(1);

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(w7g w7gVar) {
        return Boolean.valueOf(w7gVar == w7g.b);
    }
}
