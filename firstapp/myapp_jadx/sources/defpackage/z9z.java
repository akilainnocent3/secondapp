package defpackage;

import androidx.compose.runtime.a;
import androidx.recyclerview.widget.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class z9z implements Function2<a, Integer, Unit> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ psw b;
    public final /* synthetic */ lff0 c;
    public final /* synthetic */ qx80 d;

    public z9z(boolean z, psw pswVar, lff0 lff0Var, qx80 qx80Var) {
        this.a = z;
        this.b = pswVar;
        this.c = lff0Var;
        this.d = qx80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            t9z.a.a(this.a, false, this.b, null, this.c, this.d, 0.0f, 0.0f, aVar2, 100663296, r.d.DEFAULT_DRAG_ANIMATION_DURATION);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
