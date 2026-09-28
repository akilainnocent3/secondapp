package defpackage;

import androidx.recyclerview.widget.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class lhc implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ lhc(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return bool;
            default:
                hpp.b bVar = (hpp.b) obj;
                bVar.getClass();
                bVar.a = 1750;
                bVar.a(r.d.DEFAULT_SWIPE_ANIMATION_DURATION, Float.valueOf(0.0f)).b = k6r.a;
                bVar.a(1250, Float.valueOf(1.0f));
                return Unit.a;
        }
    }
}
