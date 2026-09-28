package defpackage;

import androidx.compose.animation.g;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ah0 extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ j78 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ d c;
    public final /* synthetic */ s9g d;
    public final /* synthetic */ g e;
    public final /* synthetic */ String f;
    public final /* synthetic */ op8 i;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah0(j78 j78Var, boolean z, d dVar, s9g s9gVar, g gVar, String str, op8 op8Var, int i, int i2) {
        super(2);
        this.a = j78Var;
        this.b = z;
        this.c = dVar;
        this.d = s9gVar;
        this.e = gVar;
        this.f = str;
        this.i = op8Var;
        this.v = i;
        this.w = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        num.intValue();
        hh0.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, aVar, qj40.a(this.v | 1), this.w);
        return Unit.a;
    }
}
