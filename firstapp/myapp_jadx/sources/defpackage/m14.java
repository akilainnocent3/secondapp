package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m14 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                lza lzaVar = (lza) obj;
                lzaVar.getClass();
                float f = (-Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L))) / 2.0f;
                lzaVar.F1().a.i(0.0f, f);
                try {
                    lzaVar.b2();
                    return Unit.a;
                } finally {
                    lzaVar.F1().a.i(-0.0f, -f);
                }
            default:
                lb80.j((pb80) obj);
                return Unit.a;
        }
    }
}
