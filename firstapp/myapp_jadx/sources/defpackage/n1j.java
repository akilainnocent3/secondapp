package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.playTimeControlDialog.PlayTimeControlDialogActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n1j implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n1j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        a.C0041a.C0042a c0042a = a.C0041a.a;
        Object obj3 = this.b;
        Object[] objArr = 0;
        int i2 = 1;
        switch (i) {
            case 0:
                final u6j u6jVar = (u6j) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d4j d4jVar = (d4j) wyh.c(u6jVar.t0().J, aVar, 0, 7).getValue();
                    boolean zA = aVar.A(u6jVar);
                    Object objY = aVar.y();
                    if (zA || objY == c0042a) {
                        objY = new s1j(u6jVar, objArr == true ? 1 : 0);
                        aVar.r(objY);
                    }
                    Function1 function1 = (Function1) objY;
                    boolean zA2 = aVar.A(u6jVar);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new fi5(u6jVar, i2);
                        aVar.r(objY2);
                    }
                    Function0 function0 = (Function0) objY2;
                    boolean zA3 = aVar.A(u6jVar);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new Function0() { // from class: u1j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                u6jVar.K0(R.string.sg_fruit_hunt_select_stake_click);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY3);
                    }
                    Function0 function2 = (Function0) objY3;
                    boolean zA4 = aVar.A(u6jVar);
                    Object objY4 = aVar.y();
                    if (zA4 || objY4 == c0042a) {
                        objY4 = new Function1() { // from class: v1j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                u6j u6jVar2 = u6jVar;
                                if (zBooleanValue) {
                                    u6jVar2.K0(R.string.sg_fruit_hunt_select_stake_open);
                                } else {
                                    u6jVar2.K0(R.string.sg_fruit_hunt_select_stake_close);
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY4);
                    }
                    n4j.c(d4jVar, function1, function0, function2, (Function1) objY4, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            default:
                PlayTimeControlDialogActivity playTimeControlDialogActivity = (PlayTimeControlDialogActivity) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i3 = PlayTimeControlDialogActivity.c;
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zA5 = aVar2.A(playTimeControlDialogActivity);
                    Object objY5 = aVar2.y();
                    if (zA5 || objY5 == c0042a) {
                        objY5 = new ih5(playTimeControlDialogActivity, 1);
                        aVar2.r(objY5);
                    }
                    Function0 function3 = (Function0) objY5;
                    boolean zA6 = aVar2.A(playTimeControlDialogActivity);
                    Object objY6 = aVar2.y();
                    int i4 = 4;
                    if (zA6 || objY6 == c0042a) {
                        objY6 = new jh5(playTimeControlDialogActivity, 4);
                        aVar2.r(objY6);
                    }
                    Function0 function4 = (Function0) objY6;
                    boolean zA7 = aVar2.A(playTimeControlDialogActivity);
                    Object objY7 = aVar2.y();
                    if (zA7 || objY7 == c0042a) {
                        objY7 = new kh5(playTimeControlDialogActivity, 4);
                        aVar2.r(objY7);
                    }
                    Function0 function5 = (Function0) objY7;
                    boolean zA8 = aVar2.A(playTimeControlDialogActivity);
                    Object objY8 = aVar2.y();
                    if (zA8 || objY8 == c0042a) {
                        objY8 = new o5e(playTimeControlDialogActivity, i4);
                        aVar2.r(objY8);
                    }
                    bm10.b(null, function3, function4, function5, (Function0) objY8, aVar2, 0);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
