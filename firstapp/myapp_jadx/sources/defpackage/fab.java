package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fab implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fab(int i, String str, String str2, Function0 function0, Function0 function1, Function0 function2) {
        this.b = str;
        this.c = str2;
        this.d = function0;
        this.e = function1;
        this.f = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i) {
            case 0:
                ComposeView composeView = (ComposeView) obj7;
                fgb fgbVar = (fgb) obj6;
                LoadingState loadingState = (LoadingState) obj5;
                Context context = (Context) obj4;
                e eVar = (e) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    aVar.G();
                } else if (composeView.getContext() == null) {
                    aVar.N(-788773166);
                    aVar.H();
                } else {
                    aVar.N(-788773165);
                    q8b q8bVar = q8b.d;
                    String str = (String) ((x5a0) fgbVar.c1().D).getValue();
                    ResultWrapper.GenericError error = loadingState.getError();
                    context.getColor(R.color.sh_error_btn_color);
                    cj5 cj5VarU0 = fgbVar.U0();
                    boolean zA = aVar.A(fgbVar);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new cbb(fgbVar, 0);
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    Object objY2 = aVar.y();
                    if (objY2 == c0042a) {
                        objY2 = new ebb(0);
                        aVar.r(objY2);
                    }
                    Function0 function1 = (Function0) objY2;
                    boolean zA2 = aVar.A(fgbVar);
                    Object objY3 = aVar.y();
                    if (zA2 || objY3 == c0042a) {
                        objY3 = new f92(fgbVar, 1);
                        aVar.r(objY3);
                    }
                    Function0 function2 = (Function0) objY3;
                    Object objY4 = aVar.y();
                    if (objY4 == c0042a) {
                        objY4 = new fbb(0);
                        aVar.r(objY4);
                    }
                    Function1 function3 = (Function1) objY4;
                    boolean zA3 = aVar.A(fgbVar);
                    Object objY5 = aVar.y();
                    if (zA3 || objY5 == c0042a) {
                        objY5 = new gbb(fgbVar, 0);
                        aVar.r(objY5);
                    }
                    Function1 function4 = (Function1) objY5;
                    Object objY6 = aVar.y();
                    if (objY6 == c0042a) {
                        objY6 = new hbb(0);
                        aVar.r(objY6);
                    }
                    q8bVar.a(eVar, str, error, function0, function1, function2, function3, function4, (Function1) objY6, cj5VarU0, aVar, 14180352);
                    aVar.H();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                vup.a((String) obj7, (String) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ fab(ComposeView composeView, fgb fgbVar, LoadingState loadingState, Context context, e eVar) {
        this.b = composeView;
        this.c = fgbVar;
        this.d = loadingState;
        this.e = context;
        this.f = eVar;
    }
}
