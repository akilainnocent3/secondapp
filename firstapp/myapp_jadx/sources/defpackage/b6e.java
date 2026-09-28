package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.social.domain.SocialRouter$MySocialCreation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b6e implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ b6e(uca0 uca0Var) {
        this.b = uca0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                e6e.c((String) obj3, (a) obj, qj40.a(1));
                return Unit.a;
            default:
                uca0 uca0Var = (uca0) obj3;
                String str = (String) obj;
                String str2 = (String) obj2;
                SocialRouter$MySocialCreation socialRouter$MySocialCreation = SocialRouter$MySocialCreation.a;
                psm psmVar = uca0Var.w;
                if (psmVar == null) {
                    Intrinsics.n("countryManager");
                    throw null;
                }
                SocialRouter$MySocialCreation.Data data = new SocialRouter$MySocialCreation.Data(str, psmVar.getCountryCode(), str2);
                socialRouter$MySocialCreation.getClass();
                xnu xnuVarA = ej0.a(SocialRouter$MySocialCreation.a(data));
                yfx yfxVar = uca0Var.B;
                if (yfxVar != null) {
                    wix.a(yfxVar, socialRouter$MySocialCreation, xnuVarA);
                    return Unit.a;
                }
                Intrinsics.n("navController");
                throw null;
        }
    }
}
