package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class omi implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ haj b;

    public /* synthetic */ omi(haj hajVar, int i, int i2) {
        this.a = i2;
        this.b = hajVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        haj hajVar = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                rmi.a(qj40.a(7), (op8) hajVar, (a) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                ip9.a((Function0) hajVar, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }
}
