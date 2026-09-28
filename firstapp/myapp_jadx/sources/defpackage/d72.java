package defpackage;

import com.sporty.android.common.uievent.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d72 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d72(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Function0<Unit> function0 = ((a.m) ((a) obj)).c;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.a;
            case 1:
                ((fgb) obj).P0 = null;
                return Unit.a;
            case 2:
                ((ytw) obj).setValue(Boolean.FALSE);
                return Unit.a;
            default:
                return ((ruy) obj).a.d();
        }
    }
}
