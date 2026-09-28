package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.account.AccountInfoKt;
import com.sporty.android.core.model.account.themes.ThemeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$bindAccountInfoState$2", f = "MeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ogv extends tje0 implements Function2<bxg0<? extends AccountInfo, ? extends so1, ? extends ThemeConfig>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ rhv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogv(rhv rhvVar, v1b<? super ogv> v1bVar) {
        super(2, v1bVar);
        this.b = rhvVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ogv ogvVar = new ogv(this.b, v1bVar);
        ogvVar.a = obj;
        return ogvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(bxg0<? extends AccountInfo, ? extends so1, ? extends ThemeConfig> bxg0Var, v1b<? super Unit> v1bVar) {
        return ((ogv) create(bxg0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0051 A[PHI: r13
      0x0051: PHI (r13v6 java.lang.String) = (r13v1 java.lang.String), (r13v2 java.lang.String), (r13v8 java.lang.String) binds: [B:28:0x0064, B:33:0x0072, B:18:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String email;
        String str;
        bxg0 bxg0Var = (bxg0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        AccountInfo accountInfo = (AccountInfo) bxg0Var.a;
        so1 so1Var = (so1) bxg0Var.b;
        ThemeConfig themeConfig = (ThemeConfig) bxg0Var.c;
        rhv rhvVar = this.b;
        wwd0 wwd0Var = rhvVar.O;
        while (true) {
            Object value = wwd0Var.getValue();
            cgv cgvVar = (cgv) value;
            rhvVar.D.getClass();
            so1Var.getClass();
            themeConfig.getClass();
            boolean z = accountInfo != null;
            boolean z2 = accountInfo == null;
            if (accountInfo == null || (email = accountInfo.getNickname()) == null) {
                if (accountInfo != null || (email = AccountInfoKt.getPhoneNumber(accountInfo)) == null || StringsKt.U(email)) {
                    email = null;
                }
                if (email == null || !(accountInfo == null || (email = accountInfo.getEmail()) == null || StringsKt.U(email))) {
                    str = email;
                } else {
                    str = null;
                }
            } else {
                if (StringsKt.U(email)) {
                    email = null;
                }
                if (email == null) {
                    if (accountInfo != null) {
                        email = null;
                    } else {
                        email = null;
                    }
                    if (email == null) {
                        str = email;
                    } else {
                        str = email;
                    }
                } else {
                    str = email;
                }
            }
            cil cilVar = new cil(z, z2, str, so1Var, themeConfig);
            so1Var = so1Var;
            ThemeConfig themeConfig2 = themeConfig;
            gv1 gv1Var = cgvVar.e;
            boolean z3 = accountInfo != null;
            boolean z4 = gv1Var.a;
            boolean z5 = gv1Var.c;
            String str2 = gv1Var.d;
            zsp zspVar = gv1Var.e;
            zu1 zu1Var = gv1Var.f;
            str2.getClass();
            zspVar.getClass();
            zu1Var.getClass();
            if (wwd0Var.g(value, cgv.a(cgvVar, false, null, so1Var, cilVar, new gv1(z4, z3, z5, str2, zspVar, zu1Var), null, 0, 0, null, null, null, false, accountInfo != null, null, 98247))) {
                return Unit.a;
            }
            themeConfig = themeConfig2;
        }
    }
}
