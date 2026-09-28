package defpackage;

import com.sporty.android.core.model.MyLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class koh implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        if (str == null) {
            return Unit.a;
        }
        soh.c.getClass();
        if (!Intrinsics.g(soh.d, str)) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_FIREBASE);
            aVar.a("onFirebaseInstanceIdChanged: ".concat(str), new Object[0]);
            soh.d = str;
        }
        return Unit.a;
    }
}
