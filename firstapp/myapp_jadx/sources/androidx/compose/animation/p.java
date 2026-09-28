package androidx.compose.animation;

import defpackage.qlr;
import defpackage.x5a0;
import defpackage.y290;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class p extends qlr implements Function0<Boolean> {
    public final /* synthetic */ l.d a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(l.d dVar) {
        super(0);
        this.a = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        y290 y290VarG;
        k kVar = (k) ((x5a0) this.a.b).getValue();
        return Boolean.valueOf((kVar == null || (y290VarG = kVar.g()) == null) ? false : y290VarG.b());
    }
}
