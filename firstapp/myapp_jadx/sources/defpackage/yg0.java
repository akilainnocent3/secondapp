package defpackage;

import androidx.compose.animation.g;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class yg0 extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ e160 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ d c;
    public final /* synthetic */ t9g d;
    public final /* synthetic */ g e;
    public final /* synthetic */ String f;
    public final /* synthetic */ op8 i;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg0(e160 e160Var, boolean z, d dVar, t9g t9gVar, g gVar, String str, op8 op8Var, int i, int i2) {
        super(2);
        this.a = e160Var;
        this.b = z;
        this.c = dVar;
        this.d = t9gVar;
        this.e = gVar;
        this.f = str;
        this.i = op8Var;
        this.v = i;
        this.w = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        num.intValue();
        hh0.d(this.a, this.b, this.c, this.d, this.e, this.f, this.i, aVar, qj40.a(this.v | 1), this.w);
        return Unit.a;
    }
}
