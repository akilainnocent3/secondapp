package defpackage;

import androidx.compose.animation.g;
import androidx.work.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class d8g extends qlr implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d8g(int i, Object obj, Object obj2) {
        super(1);
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                int iOrdinal = ((w7g) obj).ordinal();
                float f = 1.0f;
                if (iOrdinal == 0) {
                    wy60 wy60Var = ((s9g) obj3).a().d;
                    if (wy60Var != null) {
                        f = wy60Var.a;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        uhc.a();
                        return null;
                    }
                    wy60 wy60Var2 = ((g) obj2).a().d;
                    if (wy60Var2 != null) {
                        f = wy60Var2.a;
                    }
                }
                return Float.valueOf(f);
            default:
                Throwable th = (Throwable) obj;
                if (th instanceof xxj0) {
                    ((d) obj3).c.compareAndSet(-256, ((xxj0) th).a);
                }
                ((qis) obj2).cancel(false);
                return Unit.a;
        }
    }
}
