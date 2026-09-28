package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.platform.features.account.addemailprompt.AddEmailPromptBottomSheetActivity;
import com.sporty.android.platform.features.account.addemailprompt.b;
import com.sporty.android.platform.features.account.addemailprompt.c;
import com.sporty.android.platform.features.account.addemailprompt.e;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class eg implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                final AddEmailPromptBottomSheetActivity addEmailPromptBottomSheetActivity = (AddEmailPromptBottomSheetActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = AddEmailPromptBottomSheetActivity.c;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o0z.a(null, null, null, null, null, pp8.b(-216614290, new Function2() { // from class: fg
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            a aVar2 = (a) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            int i3 = AddEmailPromptBottomSheetActivity.c;
                            int i4 = 0;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                AddEmailPromptBottomSheetActivity addEmailPromptBottomSheetActivity2 = addEmailPromptBottomSheetActivity;
                                c cVar = (c) wyh.c(((e) addEmailPromptBottomSheetActivity2.b.getValue()).f, aVar2, 0, 7).getValue();
                                boolean zA = aVar2.A(addEmailPromptBottomSheetActivity2);
                                Object objY = aVar2.y();
                                if (zA || objY == a.C0041a.a) {
                                    objY = new gg(addEmailPromptBottomSheetActivity2, i4);
                                    aVar2.r(objY);
                                }
                                b.a(cVar, (Function1) objY, aVar2, 8);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                break;
            default:
                Function0 function0 = (Function0) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    odd0.b(0, aVar2, null, cb40.a(R.string.unique_codes__about_more_about_unique_code_title, new Object[0], aVar2), function0);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
