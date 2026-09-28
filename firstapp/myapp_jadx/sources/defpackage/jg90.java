package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jg90 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ jg90(String str, int i, int i2) {
        this.a = i2;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        String str = this.b;
        a aVar = (a) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                kg90.a(str, aVar, qj40.a(1));
                break;
            default:
                ceh0.a(str, aVar, qj40.a(1));
                break;
        }
        return Unit.a;
    }
}
