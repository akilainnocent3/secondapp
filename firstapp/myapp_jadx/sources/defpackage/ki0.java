package defpackage;

import android.animation.AnimatorSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ki0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ki0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(new qve0.y(c0f0.b.a));
                break;
            case 1:
                ((Function0) obj).invoke();
                break;
            case 2:
                ((AnimatorSet) obj).start();
                break;
            default:
                ((osw) obj).k(4);
                break;
        }
        return Unit.a;
    }
}
