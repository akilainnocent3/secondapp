package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zxh implements Function2<a, Integer, Unit> {
    public final /* synthetic */ long a;
    public final /* synthetic */ imf0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ op8 d;

    public zxh(long j, imf0 imf0Var, float f, op8 op8Var) {
        this.a = j;
        this.b = imf0Var;
        this.c = f;
        this.d = op8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            i730.a(this.a, this.b, pp8.b(-1767363041, new yxh(this.c, this.d), aVar2), aVar2, 384);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
