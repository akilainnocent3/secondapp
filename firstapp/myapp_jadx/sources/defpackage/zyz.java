package defpackage;

import com.sporty.android.core.model.patron.UserPhone;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class zyz implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zyz(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj2;
                List<UserPhone> list = (List) obj;
                ArrayList arrayList = new ArrayList(l48.r(list, 10));
                for (UserPhone userPhone : list) {
                    arrayList.add(UserPhone.copy$default(userPhone, null, null, false, Intrinsics.g(userPhone.getPhone(), str), 7, null));
                }
                return arrayList;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                long jLongValue = ((Long) obj).longValue();
                kn1 kn1VarF1 = q1c0Var.f1();
                ej5.c(o8i0.d(kn1VarF1), null, null, new xn1(kn1VarF1, jLongValue, null), 3);
                q1c0Var.P1("tournament_joined", true);
                return Unit.a;
        }
    }
}
