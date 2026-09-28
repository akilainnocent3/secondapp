package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class r32 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r32(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (Fragment) obj;
            case 1:
                ((x5a0) ((fgb) obj).l1).setValue(Boolean.FALSE);
                return Unit.a;
            default:
                ((Function1) obj).invoke(new qve0.y(c0f0.d.a));
                return Unit.a;
        }
    }
}
