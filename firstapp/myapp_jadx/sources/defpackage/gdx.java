package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gdx extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object value;
        jdx jdxVar = (jdx) this.receiver;
        wwd0 wwd0Var = jdxVar.d;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, new hdx(0)));
        w4x w4xVar = (w4x) ((x5a0) jdxVar.c).getValue();
        ijf0 ijf0Var = new ijf0("", 0L, 6);
        w4xVar.getClass();
        ((x5a0) w4xVar.c).setValue(ijf0Var);
        return Unit.a;
    }
}
