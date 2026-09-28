package defpackage;

import com.esotericsoftware.spine.android.b;
import com.sportygames.sportyherov2.components.ShMultiplierContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jh40 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jh40(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                mz7 mz7Var = (mz7) obj2;
                String str = (String) obj;
                str.getClass();
                mz7Var.D1();
                ej5.c(o8i0.d(mz7Var), null, null, new wz7(mz7Var, null, str), 3);
                break;
            default:
                ((ShMultiplierContainer) obj2).y = (b) obj;
                break;
        }
        return Unit.a;
    }
}
