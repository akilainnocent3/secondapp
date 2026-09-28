package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zp9 {
    public static final op8 a = new op8(984817901, a.a, false);

    public static final class a implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public static final a a = new a();

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                rbn rbnVarB = j6n.a;
                if (rbnVarB == null) {
                    rbn.a aVar3 = new rbn.a("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                    m2g m2gVar = lwh0.a;
                    soa0 soa0Var = new soa0(j58.b);
                    fxz fxzVar = new fxz();
                    fxzVar.f(19.0f, 6.41f);
                    fxzVar.d(17.59f, 5.0f);
                    fxzVar.d(12.0f, 10.59f);
                    fxzVar.d(6.41f, 5.0f);
                    fxzVar.d(5.0f, 6.41f);
                    fxzVar.d(10.59f, 12.0f);
                    fxzVar.d(5.0f, 17.59f);
                    fxzVar.d(6.41f, 19.0f);
                    fxzVar.d(12.0f, 13.41f);
                    fxzVar.d(17.59f, 19.0f);
                    fxzVar.d(19.0f, 17.59f);
                    fxzVar.d(13.41f, 12.0f);
                    fxzVar.a();
                    rbn.a.a(aVar3, fxzVar.a, soa0Var);
                    rbnVarB = aVar3.b();
                    j6n.a = rbnVarB;
                }
                h6n.a(rbnVarB, xae0.a(R.string.m3c_snackbar_dismiss, aVar2), null, 0L, aVar2, 0, 12);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }
}
