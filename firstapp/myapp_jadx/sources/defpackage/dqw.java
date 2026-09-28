package defpackage;

import android.animation.ValueAnimator;
import com.sportygames.pocketrocket.component.MultiplierContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dqw implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dqw(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = MultiplierContainer.k0;
                ((ValueAnimator) obj).cancel();
                return Unit.a;
            default:
                int size = ((z450) obj).a.size();
                if (size < 1) {
                    size = 1;
                }
                return Integer.valueOf(size);
        }
    }
}
