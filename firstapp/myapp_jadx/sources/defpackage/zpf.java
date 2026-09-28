package defpackage;

import android.content.Intent;
import androidx.compose.runtime.a;
import com.sportybet.android.limits.edit.EditLimitsActivity;
import com.sportybet.android.limits.success.LimitsSuccessActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zpf implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zpf(c0f0.e eVar, Function1 function1, int i) {
        this.b = eVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                final EditLimitsActivity editLimitsActivity = (EditLimitsActivity) obj4;
                final rcs rcsVar = (rcs) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = EditLimitsActivity.i;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zA = aVar.A(editLimitsActivity);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new d9b(editLimitsActivity, 1);
                        aVar.r(objY);
                    }
                    Function0<Unit> function0 = (Function0) objY;
                    Object objY2 = aVar.y();
                    if (objY2 == c0042a) {
                        objY2 = new aqf();
                        aVar.r(objY2);
                    }
                    Function0<Unit> function1 = (Function0) objY2;
                    boolean zA2 = aVar.A(editLimitsActivity) | aVar.d(rcsVar.ordinal());
                    Object objY3 = aVar.y();
                    if (zA2 || objY3 == c0042a) {
                        objY3 = new Function0() { // from class: bqf
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i3 = EditLimitsActivity.i;
                                EditLimitsActivity editLimitsActivity2 = editLimitsActivity;
                                editLimitsActivity2.finish();
                                Intent intent = new Intent(editLimitsActivity2, (Class<?>) LimitsSuccessActivity.class);
                                intent.putExtra("limit_type", rcsVar.a);
                                yrh0.s(editLimitsActivity2, intent, true);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY3);
                    }
                    editLimitsActivity.z1(rcsVar, function0, function1, (Function0) objY3, aVar, 33152);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                b0f0.g((c0f0.e) obj4, (Function1) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ zpf(EditLimitsActivity editLimitsActivity, rcs rcsVar) {
        this.b = editLimitsActivity;
        this.c = rcsVar;
    }
}
