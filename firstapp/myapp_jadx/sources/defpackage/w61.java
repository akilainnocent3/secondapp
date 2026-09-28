package defpackage;

import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w61 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w61(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(((u5a0) ((zp70) obj).a).D());
            case 1:
                Window window = (Window) obj;
                if (window != null) {
                    window.setGravity(17);
                }
                return Unit.a;
            case 2:
                return Boolean.valueOf(((zzr) obj).h() > 0);
            default:
                ((Function0) obj).invoke();
                return Unit.a;
        }
    }
}
