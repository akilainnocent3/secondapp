package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportygames.multilevel.common.model.UserLevelProgressDto;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a6n implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ d c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ a6n(List list, UserLevelProgressDto userLevelProgressDto, boolean z, mz1 mz1Var, Function1 function1, d dVar, String str, int i) {
        this.e = list;
        this.f = userLevelProgressDto;
        this.b = z;
        this.i = mz1Var;
        this.v = function1;
        this.c = dVar;
        this.w = str;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        Object obj3 = this.w;
        Object obj4 = this.v;
        Object obj5 = this.i;
        Object obj6 = this.f;
        Object obj7 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = qj40.a(i2 | 1);
                c6n.e((Function0) obj7, this.c, this.b, (qx80) obj6, (u5n) obj5, (l35) obj4, (op8) obj3, (a) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = qj40.a(i2 | 1);
                tdw.e((List) obj7, (UserLevelProgressDto) obj6, this.b, (mz1) obj5, (Function1) obj4, this.c, (String) obj3, (a) obj, iA2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ a6n(Function0 function0, d dVar, boolean z, qx80 qx80Var, u5n u5nVar, l35 l35Var, op8 op8Var, int i) {
        this.e = function0;
        this.c = dVar;
        this.b = z;
        this.f = qx80Var;
        this.i = u5nVar;
        this.v = l35Var;
        this.w = op8Var;
        this.d = i;
    }
}
