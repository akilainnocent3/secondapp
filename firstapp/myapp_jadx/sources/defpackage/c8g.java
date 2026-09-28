package defpackage;

import androidx.compose.animation.f;
import androidx.compose.animation.g;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class c8g extends qlr implements Function1<dtg0.b<w7g>, goh<Float>> {
    public final /* synthetic */ s9g a;
    public final /* synthetic */ g b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8g(s9g s9gVar, g gVar) {
        super(1);
        this.a = s9gVar;
        this.b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final goh<Float> invoke(dtg0.b<w7g> bVar) {
        goh<Float> gohVar;
        goh<Float> gohVar2;
        dtg0.b<w7g> bVar2 = bVar;
        w7g w7gVar = w7g.a;
        w7g w7gVar2 = w7g.b;
        if (bVar2.d(w7gVar, w7gVar2)) {
            wy60 wy60Var = this.a.a().d;
            return (wy60Var == null || (gohVar2 = wy60Var.c) == null) ? f.b : gohVar2;
        }
        if (!bVar2.d(w7gVar2, w7g.c)) {
            return f.b;
        }
        wy60 wy60Var2 = this.b.a().d;
        return (wy60Var2 == null || (gohVar = wy60Var2.c) == null) ? f.b : gohVar;
    }
}
