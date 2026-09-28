package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.limits.edit.EditLimitsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ypf implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ypf(int i, d dVar, Function0 function0) {
        this.b = dVar;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                EditLimitsActivity editLimitsActivity = (EditLimitsActivity) obj4;
                rcs rcsVar = (rcs) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = EditLimitsActivity.i;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    or0.a(null, false, false, null, pp8.b(1540964189, new zpf(editLimitsActivity, rcsVar), aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                b0f0.a(qj40.a(7), (a) obj, (d) obj4, (Function0) obj3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ypf(EditLimitsActivity editLimitsActivity, rcs rcsVar) {
        this.b = editLimitsActivity;
        this.c = rcsVar;
    }
}
