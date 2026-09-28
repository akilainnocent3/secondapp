package defpackage;

import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class bxx extends qlr implements Function0<Unit> {
    public final /* synthetic */ ywx a;
    public final /* synthetic */ d.c b;
    public final /* synthetic */ ywx.e c;
    public final /* synthetic */ long d;
    public final /* synthetic */ iam e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ float v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxx(ywx ywxVar, d.c cVar, ywx.e eVar, long j, iam iamVar, int i, boolean z, float f) {
        super(0);
        this.a = ywxVar;
        this.b = cVar;
        this.c = eVar;
        this.d = j;
        this.e = iamVar;
        this.f = i;
        this.i = z;
        this.v = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.a.h2(cxx.a(this.b, this.c.a()), this.c, this.d, this.e, this.f, this.i, this.v, false);
        return Unit.a;
    }
}
