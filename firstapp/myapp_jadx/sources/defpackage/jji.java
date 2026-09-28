package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jji implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ytw b;

    public /* synthetic */ jji(ytw ytwVar, int i) {
        this.a = i;
        this.b = ytwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                this.b.setValue(new g7f(fFloatValue));
                break;
            default:
                isw iswVar = (isw) this.b;
                float fFloatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                iswVar.A(fFloatValue2);
                break;
        }
        return Unit.a;
    }
}
