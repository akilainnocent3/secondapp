package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f17 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f17(int i, Function0 function0, Function0 function1) {
        this.b = function0;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                UiText uiText = (UiText) obj4;
                Integer num = (Integer) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    aVar.N(1437343386);
                    nk0.b bVar = new nk0.b((Object) null);
                    bVar.g(uiText.g((Context) aVar.O(AndroidCompositionLocals_androidKt.b)));
                    if (num != null) {
                        aVar.N(-2097200752);
                        int iL = bVar.l(new ora0(((lib0) aVar.O(oib0.a)).q, mla.m(10.0f, aVar), (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65532));
                        try {
                            bVar.g(" (" + num + ")");
                            Unit unit = Unit.a;
                            bVar.i(iL);
                            aVar.H();
                        } catch (Throwable th) {
                            bVar.i(iL);
                            throw th;
                        }
                    } else {
                        aVar.N(-2096860558);
                        aVar.H();
                    }
                    nk0 nk0VarM = bVar.m();
                    aVar.H();
                    lkf0.e(nk0VarM, null, ((lib0) aVar.O(oib0.a)).o, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((ijb0) aVar.O(kjb0.a)).o, aVar, 0, 0, 262138);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                rxe0.b((Function0) obj4, (Function0) obj3, (a) obj, qj40.a(1));
                return Unit.a;
        }
    }

    public /* synthetic */ f17(UiText uiText, Integer num) {
        this.b = uiText;
        this.c = num;
    }
}
