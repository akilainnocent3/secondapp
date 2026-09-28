package defpackage;

import androidx.compose.animation.g;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class jf0 extends qlr implements Function2<w7g, w7g, Boolean> {
    public final /* synthetic */ g a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf0(g gVar) {
        super(2);
        this.a = gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(w7g w7gVar, w7g w7gVar2) {
        w7g w7gVar3 = w7gVar;
        w7g w7gVar4 = w7gVar2;
        w7g w7gVar5 = w7g.c;
        return Boolean.valueOf(w7gVar3 == w7gVar5 && w7gVar4 == w7gVar5 && !this.a.a().e);
    }
}
