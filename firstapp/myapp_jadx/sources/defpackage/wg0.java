package defpackage;

import androidx.compose.animation.g;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class wg0 extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ d b;
    public final /* synthetic */ s9g c;
    public final /* synthetic */ g d;
    public final /* synthetic */ String e;
    public final /* synthetic */ op8 f;
    public final /* synthetic */ int i;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg0(boolean z, d dVar, s9g s9gVar, g gVar, String str, op8 op8Var, int i, int i2) {
        super(2);
        this.a = z;
        this.b = dVar;
        this.c = s9gVar;
        this.d = gVar;
        this.e = str;
        this.f = op8Var;
        this.i = i;
        this.v = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        num.intValue();
        hh0.e(this.a, this.b, this.c, this.d, this.e, this.f, aVar, qj40.a(this.i | 1), this.v);
        return Unit.a;
    }
}
