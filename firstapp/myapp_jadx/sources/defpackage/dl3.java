package defpackage;

import androidx.compose.animation.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dl3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dl3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                f0b f0bVar = (f0b) obj2;
                ((d) obj).getClass();
                return f0bVar;
            default:
                String str = (String) obj;
                str.getClass();
                ((Function1) obj2).invoke(new zxq.e0(str));
                return Unit.a;
        }
    }
}
