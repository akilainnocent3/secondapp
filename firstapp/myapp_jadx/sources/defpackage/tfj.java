package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tfj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tfj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((tgj) obj).W1();
                break;
            case 1:
                ((xw4) obj).y1();
                break;
            default:
                asx.a aVar = asx.b;
                ((asx) obj).j0(AlertDialogCallbackType.Positive.a);
                break;
        }
        return Unit.a;
    }
}
