package defpackage;

import androidx.compose.foundation.gestures.a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class a10 implements y4a0 {
    public final /* synthetic */ i20<Object> a;
    public final /* synthetic */ Function1<Float, Float> b;
    public final /* synthetic */ z00 c;

    public a10(i20 i20Var, Function1 function1, z00 z00Var) {
        this.a = i20Var;
        this.b = function1;
        this.c = z00Var;
    }

    @Override // defpackage.y4a0
    public final float a(float f) {
        i20<Object> i20Var = this.a;
        float fE = i20Var.e();
        return i20Var.b().d(a.h(i20Var.b(), fE, f, this.b, this.c)) - fE;
    }

    @Override // defpackage.y4a0
    public final float b(float f, float f2) {
        return 0.0f;
    }
}
