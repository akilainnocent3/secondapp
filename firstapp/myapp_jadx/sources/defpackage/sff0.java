package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class sff0 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ psw c;
    public final /* synthetic */ lff0 d;
    public final /* synthetic */ qx80 e;

    public sff0(boolean z, boolean z2, psw pswVar, lff0 lff0Var, qx80 qx80Var) {
        this.a = z;
        this.b = z2;
        this.c = pswVar;
        this.d = lff0Var;
        this.e = qx80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            uff0.a.a(this.a, this.b, this.c, this.d, this.e, aVar2, 114822144);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
