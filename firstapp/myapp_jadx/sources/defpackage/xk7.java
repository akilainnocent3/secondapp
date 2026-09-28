package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xk7 implements Function1 {
    public final /* synthetic */ cl7 a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        op5.a.getClass();
        String str = op5.c;
        if (str == null) {
            str = "";
        }
        wz.a("FBGIconClicked", krh0.e(str), new String[0]);
        Function1<? super Boolean, Unit> function1 = this.a.e;
        if (function1 != null) {
            function1.invoke(bool);
            return Unit.a;
        }
        Intrinsics.n("fbgClickListener");
        throw null;
    }
}
