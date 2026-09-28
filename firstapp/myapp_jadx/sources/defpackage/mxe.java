package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.core.model.dateofbirth.DobVerificationReminderData;
import com.sporty.android.platform.features.dateofbirth.ui.screens.reminder.DobVerificationReminderActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mxe implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mxe(ce90.b bVar, Function0 function0, int i) {
        this.b = bVar;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                DobVerificationReminderData dobVerificationReminderData = (DobVerificationReminderData) obj4;
                final DobVerificationReminderActivity dobVerificationReminderActivity = (DobVerificationReminderActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = DobVerificationReminderActivity.c;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zA = aVar.A(dobVerificationReminderActivity);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new Function0() { // from class: nxe
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i4 = DobVerificationReminderActivity.c;
                                dobVerificationReminderActivity.finish();
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(dobVerificationReminderActivity);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new bja(dobVerificationReminderActivity, i2);
                        aVar.r(objY2);
                    }
                    sxe.a(dobVerificationReminderData, function0, (Function0) objY2, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                jui0.f((ce90.b) obj4, (Function0) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ mxe(DobVerificationReminderData dobVerificationReminderData, DobVerificationReminderActivity dobVerificationReminderActivity) {
        this.b = dobVerificationReminderData;
        this.c = dobVerificationReminderActivity;
    }
}
