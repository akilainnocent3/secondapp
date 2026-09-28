package defpackage;

import com.sporty.android.core.model.patron.UserCertConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zf0 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        hpp.b bVar = (hpp.b) obj;
        bVar.getClass();
        bVar.a = 2800;
        Float fValueOf = Float.valueOf(0.0f);
        hpp.a aVarA = bVar.a(0, fValueOf);
        wkf wkfVar = xkf.d;
        aVarA.b = wkfVar;
        bVar.a(700, Float.valueOf(-3.0f)).b = wkfVar;
        bVar.a(1400, fValueOf).b = wkfVar;
        bVar.a(UserCertConstants.REQUEST_CODE_BVN, Float.valueOf(3.0f)).b = wkfVar;
        bVar.a(2800, fValueOf);
        return Unit.a;
    }
}
