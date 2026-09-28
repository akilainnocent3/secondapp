package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class g3c extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ Object a;
    public final /* synthetic */ d b;
    public final /* synthetic */ goh<Float> c;
    public final /* synthetic */ String d;
    public final /* synthetic */ op8 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3c(Object obj, d dVar, goh gohVar, String str, op8 op8Var, int i, int i2) {
        super(2);
        this.a = obj;
        this.b = dVar;
        this.c = gohVar;
        this.d = str;
        this.e = op8Var;
        this.f = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        num.intValue();
        q3c.b(this.a, this.b, this.c, this.d, this.e, aVar, qj40.a(this.f | 1), this.i);
        return Unit.a;
    }
}
