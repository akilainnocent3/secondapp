package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class omt extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ xmt a;
    public final /* synthetic */ d b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ d0b f;
    public final /* synthetic */ int i;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omt(xmt xmtVar, d dVar, boolean z, boolean z2, int i, d0b d0bVar, int i2, int i3, int i4) {
        super(2);
        this.a = xmtVar;
        this.b = dVar;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = d0bVar;
        this.i = i2;
        this.v = i3;
        this.w = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        num.intValue();
        mmt.a(this.a, this.b, this.c, this.d, this.e, this.f, aVar, qj40.a(this.i | 1), qj40.a(this.v), this.w);
        return Unit.a;
    }
}
