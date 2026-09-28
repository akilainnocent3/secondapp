package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.book.presentation.sportsmenu.time.TimePickerItem;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class omh implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ omh(d dVar, int i) {
        this.a = 1;
        this.b = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:40:0x0109  */
    /* JADX WARN: Code duplicated, block: B:42:0x010f  */
    /* JADX WARN: Code duplicated, block: B:43:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x012c  */
    /* JADX WARN: Code duplicated, block: B:47:0x015a  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        PreMatchSportActivity.b bVar;
        int i2 = this.a;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                ymh ymhVar = (ymh) obj3;
                xvf0 xvf0Var = (xvf0) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                xvf0Var.getClass();
                yec yecVar = ymhVar.c;
                ArrayList arrayList = ymhVar.k;
                if (yecVar != null) {
                    yecVar.dismiss();
                }
                if (xvf0Var.c) {
                    xvf0Var = null;
                }
                if (xvf0Var != null) {
                    int size = arrayList.size();
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        i = -1;
                        if (i4 < size) {
                            Object obj4 = arrayList.get(i4);
                            i4++;
                            if (!((xvf0) obj4).d()) {
                                i3++;
                            }
                        } else {
                            i3 = -1;
                        }
                    }
                    int size2 = arrayList.size();
                    int i5 = 0;
                    int i6 = 0;
                    while (i6 < size2) {
                        Object obj5 = arrayList.get(i6);
                        i6++;
                        if (((xvf0) obj5).c()) {
                            i = i5;
                            if (xvf0Var.d()) {
                                arrayList.set(i3, xvf0Var);
                                TimePickerItem.INSTANCE.getClass();
                                arrayList.set(i, qwf0.a(TimePickerItem.Companion.a(0L), false));
                            } else if (xvf0Var.c()) {
                                TimePickerItem.Companion companion = TimePickerItem.INSTANCE;
                                Calendar calendar = Calendar.getInstance();
                                calendar.getClass();
                                companion.getClass();
                                arrayList.set(i3, qwf0.a(TimePickerItem.Companion.b(calendar, calendar), false));
                                arrayList.set(i, xvf0Var);
                            } else if (zBooleanValue) {
                                TimePickerItem.Companion companion2 = TimePickerItem.INSTANCE;
                                Calendar calendar2 = Calendar.getInstance();
                                calendar2.getClass();
                                companion2.getClass();
                                arrayList.set(i3, qwf0.a(TimePickerItem.Companion.b(calendar2, calendar2), false));
                                arrayList.set(i, qwf0.a(TimePickerItem.Companion.a(0L), false));
                            }
                            String str = xvf0Var.a;
                            str.getClass();
                            ymh.d(str, arrayList);
                            bVar = ymhVar.b;
                            if (bVar != null) {
                                PreMatchSportActivity preMatchSportActivity = bVar.a;
                                preMatchSportActivity.P = true;
                                bVar.b.c.d(xvf0Var);
                                jk20 jk20VarI1 = preMatchSportActivity.I1();
                                jk20VarI1.y = xvf0Var;
                                jk20VarI1.x1();
                                preMatchSportActivity.P1();
                            }
                        } else {
                            i5++;
                        }
                    }
                    if (xvf0Var.d()) {
                        arrayList.set(i3, xvf0Var);
                        TimePickerItem.INSTANCE.getClass();
                        arrayList.set(i, qwf0.a(TimePickerItem.Companion.a(0L), false));
                    } else if (xvf0Var.c()) {
                        TimePickerItem.Companion companion3 = TimePickerItem.INSTANCE;
                        Calendar calendar3 = Calendar.getInstance();
                        calendar3.getClass();
                        companion3.getClass();
                        arrayList.set(i3, qwf0.a(TimePickerItem.Companion.b(calendar3, calendar3), false));
                        arrayList.set(i, xvf0Var);
                    } else if (zBooleanValue) {
                        TimePickerItem.Companion companion4 = TimePickerItem.INSTANCE;
                        Calendar calendar4 = Calendar.getInstance();
                        calendar4.getClass();
                        companion4.getClass();
                        arrayList.set(i3, qwf0.a(TimePickerItem.Companion.b(calendar4, calendar4), false));
                        arrayList.set(i, qwf0.a(TimePickerItem.Companion.a(0L), false));
                    }
                    String str2 = xvf0Var.a;
                    str2.getClass();
                    ymh.d(str2, arrayList);
                    bVar = ymhVar.b;
                    if (bVar != null) {
                        PreMatchSportActivity preMatchSportActivity2 = bVar.a;
                        preMatchSportActivity2.P = true;
                        bVar.b.c.d(xvf0Var);
                        jk20 jk20VarI2 = preMatchSportActivity2.I1();
                        jk20VarI2.y = xvf0Var;
                        jk20VarI2.x1();
                        preMatchSportActivity2.P1();
                    }
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                jhr.f((d) obj3, (a) obj, qj40.a(7));
                break;
            default:
                UiText uiText = (UiText) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uiText.getClass();
                    lkf0.d(uiText.g((Context) aVar.O(AndroidCompositionLocals_androidKt.b)), null, syj.a(0L, 0L, 0L, null, null, aVar, 31).e.b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar), aVar, 0, 0, 131066);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ omh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
