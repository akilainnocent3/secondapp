package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class fh0 extends qlr implements Function2<w7g, w7g, Boolean> {
    public static final fh0 a = new fh0(2);

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(w7g w7gVar, w7g w7gVar2) {
        w7g w7gVar3 = w7gVar2;
        return Boolean.valueOf(w7gVar == w7gVar3 && w7gVar3 == w7g.c);
    }
}
