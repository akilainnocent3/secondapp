package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.captcha.CaptchaData;
import com.sporty.android.core.model.captcha.CaptchaHeader;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.android.account.international.data.model.INTRegisterRequest;
import com.sportybet.android.account.international.data.model.INTRegisterResponse;
import com.sportybet.android.account.international.data.model.UserPreferenceRequest;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vce0 {
    public final kwm a;
    public final fe6 b;
    public final k5b c;

    public static abstract class a {

        /* JADX INFO: renamed from: vce0$a$a, reason: collision with other inner class name */
        public static final class C1208a extends a {
            public final Throwable a;
            public final UiText b;

            public C1208a(Throwable th, UiText uiText) {
                uiText.getClass();
                this.a = th;
                this.b = uiText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1208a)) {
                    return false;
                }
                C1208a c1208a = (C1208a) obj;
                return Intrinsics.g(this.a, c1208a.a) && Intrinsics.g(this.b, c1208a.b);
            }

            public final int hashCode() {
                Throwable th = this.a;
                return this.b.hashCode() + ((th == null ? 0 : th.hashCode()) * 31);
            }

            public final String toString() {
                return "Error(throwable=" + this.a + ", defaultMessage=" + this.b + ")";
            }
        }

        public static final class b extends a {
            public final INTRegisterResponse a;

            public b(INTRegisterResponse iNTRegisterResponse) {
                iNTRegisterResponse.getClass();
                this.a = iNTRegisterResponse;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Success(data=" + this.a + ")";
            }
        }
    }

    public vce0(kwm kwmVar, fe6 fe6Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        kwmVar.getClass();
        fe6Var.getClass();
        this.a = kwmVar;
        this.b = fe6Var;
        this.c = k5bVar;
    }

    public static /* synthetic */ Object b(vce0 vce0Var, String str, String str2, String str3, String str4, Map map, xnu xnuVar, List list, x1b x1bVar, int i) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            xnuVar = null;
        }
        if ((i & 64) != 0) {
            list = null;
        }
        return vce0Var.a(str, str2, str3, str4, map, xnuVar, list, x1bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, String str2, String str3, String str4, Map map, Map map2, List list, x1b x1bVar) {
        wce0 wce0Var;
        if (x1bVar instanceof wce0) {
            wce0Var = (wce0) x1bVar;
            int i = wce0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wce0Var.c = i - Integer.MIN_VALUE;
            } else {
                wce0Var = new wce0(this, x1bVar);
            }
        } else {
            wce0Var = new wce0(this, x1bVar);
        }
        Object objA = wce0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = wce0Var.c;
        if (i2 == 0) {
            uj50.b(objA);
            kwm kwmVar = this.a;
            kwmVar.getClass();
            str.getClass();
            str2.getClass();
            map.getClass();
            INTRegisterRequest iNTRegisterRequest = kwmVar.c;
            iNTRegisterRequest.setEmail(str);
            iNTRegisterRequest.setPassword(kwmVar.b.a(str2));
            iNTRegisterRequest.setKycFields(psp.a(map));
            if (map2 != null) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map2.entrySet()) {
                    String str5 = (String) entry.getKey();
                    String str6 = (String) entry.getValue();
                    UserPreferenceRequest.Key keyFromKeyName = UserPreferenceRequest.INSTANCE.fromKeyName(str5);
                    UserPreferenceRequest userPreferenceRequest = keyFromKeyName != null ? new UserPreferenceRequest(keyFromKeyName, str6) : null;
                    if (userPreferenceRequest != null) {
                        arrayList.add(userPreferenceRequest);
                    }
                }
                iNTRegisterRequest.setUserPreferences(arrayList);
            }
            if (str3 != null) {
                iNTRegisterRequest.setPhoneCountryCode(str3);
            }
            if (str4 != null) {
                iNTRegisterRequest.setPhone(str4);
            }
            if (list != null) {
                iNTRegisterRequest.setBettorLimits(list);
                Unit unit = Unit.a;
            }
            sl50 sl50Var = new sl50(bm50.b(ozh.c(this.b.d(j6c.INT_REGISTER, new CaptchaData.Email(str), new Function1() { // from class: uce0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CaptchaHeader captchaHeader = (CaptchaHeader) obj;
                    captchaHeader.getClass();
                    kwm kwmVar2 = this.a.a;
                    kwmVar2.getClass();
                    return kwmVar2.a.j(kwmVar2.c, captchaHeader);
                }
            }), this.c), vch0.b));
            wce0Var.c = 1;
            objA = s0i.a(sl50Var, wce0Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA);
        }
        lk50 lk50Var = (lk50) objA;
        if (lk50Var instanceof lk50.c) {
            return new a.b((INTRegisterResponse) ((lk50.c) lk50Var).a);
        }
        if (lk50Var instanceof lk50.a) {
            lk50.a aVar = (lk50.a) lk50Var;
            return new a.C1208a(aVar.a, aVar.b);
        }
        if (lk50Var instanceof lk50.b) {
            StringUiText stringUiText = vch0.a;
            return new a.C1208a(null, new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again_later_thank_you));
        }
        uhc.a();
        return null;
    }
}
