package defpackage;

import com.sportybet.integrity.DeviceIntegrityActivity;
import com.sportybet.integrity.DeviceIntegrityActivity.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ede implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ede(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = DeviceIntegrityActivity.b;
                return ((DeviceIntegrityActivity) obj).new b();
            case 1:
                ((n8j) ((u6j) obj).j0.getValue()).x1(true);
                return Unit.a;
            default:
                ((ytw) obj).setValue(Boolean.FALSE);
                return Unit.a;
        }
    }
}
