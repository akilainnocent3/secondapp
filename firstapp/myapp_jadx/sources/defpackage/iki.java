package defpackage;

import com.sportygames.commons.models.GiftItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class iki implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iki(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                osw oswVar = (osw) obj;
                oswVar.k(oswVar.D() + 1);
                break;
            case 1:
                vad0 vad0Var = (vad0) obj;
                ((x5a0) vad0Var.y2).setValue(Boolean.FALSE);
                ((x5a0) vad0Var.R0().R).setValue(Boolean.TRUE);
                vad0Var.R0().O1(new GiftItem(0.0d, "", "", "", 0.0d, 0L, 0, Double.valueOf(0.0d), null));
                break;
            default:
                ((Function0) obj).invoke();
                break;
        }
        return Unit.a;
    }
}
