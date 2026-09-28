package defpackage;

import android.os.Bundle;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.security.biometric.BioAuthLoginResponse;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.viewmodel.AccountLoginViewModel$loginWithBiometric$1", f = "AccountLoginViewModel.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
public final class x9 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ aa b;
    public final /* synthetic */ String c;

    public static final class a<T> implements myh {
        public final /* synthetic */ aa a;

        public a(aa aaVar) {
            this.a = aaVar;
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0117  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            Object value2;
            Object value3;
            String str;
            Object value4;
            Object value5;
            lk50 lk50Var = (lk50) obj;
            boolean z = lk50Var instanceof lk50.c;
            aa aaVar = this.a;
            if (z) {
                BioAuthLoginResponse bioAuthLoginResponse = (BioAuthLoginResponse) ((lk50.c) lk50Var).a;
                long jResolveLoginTime = bioAuthLoginResponse.getSelfExclusion().resolveLoginTime();
                wwd0 wwd0Var = aaVar.C;
                do {
                    value5 = wwd0Var.getValue();
                } while (!wwd0Var.g(value5, q74.a((q74) value5, bioAuthLoginResponse, false, null, null, false, null, null, jResolveLoginTime, 110)));
                f00 f00Var = vgb0.a;
                Bundle bundleA = x6.a("bio_login_success", true);
                Unit unit = Unit.a;
                vgb0.b("bio_login_success_rate", bundleA);
                vgb0.a("bio_login_complete");
            } else if (lk50Var instanceof lk50.a) {
                wwd0 wwd0Var2 = aaVar.C;
                do {
                    value2 = wwd0Var2.getValue();
                } while (!wwd0Var2.g(value2, q74.a((q74) value2, null, false, null, null, false, null, null, 0L, 239)));
                Throwable th = ((lk50.a) lk50Var).a;
                List listK = b.k(new Integer(16003), new Integer(16004), new Integer(16007), new Integer(16008));
                if (th instanceof SprThrowable) {
                    SprThrowable sprThrowable = (SprThrowable) th;
                    if (listK.contains(new Integer(sprThrowable.getD()))) {
                        Integer num = new Integer(sprThrowable.getD());
                        if (num.intValue() == 16003) {
                            str = "bio_auth_not_exist";
                        } else if (num.intValue() == 16004) {
                            str = "bio_auth_incorrect_credential";
                        } else if (num.intValue() == 16007) {
                            str = "bio_auth_login_not_allowed";
                        } else {
                            str = num.intValue() == 16008 ? "bio_auth_account_frozen" : "bio_auth_unknown";
                        }
                        aa.A1(aaVar, str, "biometric", new Integer(sprThrowable.getD()), null, 8);
                        do {
                            value4 = wwd0Var2.getValue();
                        } while (!wwd0Var2.g(value4, q74.a((q74) value4, null, false, null, null, false, null, vch0.d(sprThrowable.getE()), 0L, 191)));
                    } else {
                        aa.A1(this.a, "network_error", "biometric", null, th, 4);
                        do {
                            value3 = wwd0Var2.getValue();
                            StringUiText stringUiText = vch0.a;
                        } while (!wwd0Var2.g(value3, q74.a((q74) value3, null, false, null, null, false, null, new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again_later), 0L, 191)));
                    }
                } else {
                    aa.A1(this.a, "network_error", "biometric", null, th, 4);
                    do {
                        value3 = wwd0Var2.getValue();
                        StringUiText stringUiText2 = vch0.a;
                    } while (!wwd0Var2.g(value3, q74.a((q74) value3, null, false, null, null, false, null, new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again_later), 0L, 191)));
                }
                f00 f00Var2 = vgb0.a;
                Bundle bundleA2 = x6.a("bio_login_success", false);
                Unit unit2 = Unit.a;
                vgb0.b("bio_login_success_rate", bundleA2);
            } else {
                wwd0 wwd0Var3 = aaVar.C;
                do {
                    value = wwd0Var3.getValue();
                } while (!wwd0Var3.g(value, q74.a((q74) value, null, false, null, null, true, null, null, 0L, 239)));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(aa aaVar, String str, v1b<? super x9> v1bVar) {
        super(2, v1bVar);
        this.b = aaVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new x9(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((x9) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            aa aaVar = this.b;
            yzh yzhVarB = bm50.b(aaVar.i.a(aaVar.v.P(), ((q74) aaVar.C.getValue()).d, aaVar.w.a().a, this.c), vch0.b);
            a aVar = new a(aaVar);
            this.a = 1;
            if (yzhVarB.collect(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
