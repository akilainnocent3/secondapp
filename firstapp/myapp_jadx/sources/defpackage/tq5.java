package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.globalpay.data.CPFStatus;
import com.sportybet.android.globalpay.data.CPFValidateResult;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.UUID;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class tq5 implements isp {
    public final lwm a;

    public tq5(lwm lwmVar, a1k a1kVar) {
        lwmVar.getClass();
        this.a = lwmVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (defpackage.hkd.b(1000, r7) == r0) goto L26;
     */
    @Override // defpackage.isp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, boolean r6, java.lang.Long r7, defpackage.x1b r8) {
        /*
            r4 = this;
            boolean r7 = r8 instanceof defpackage.rq5
            if (r7 == 0) goto L13
            r7 = r8
            rq5 r7 = (defpackage.rq5) r7
            int r0 = r7.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.c = r0
            goto L18
        L13:
            rq5 r7 = new rq5
            r7.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r7.a
            y5b r0 = defpackage.y5b.a
            int r1 = r7.c
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L35
            if (r1 == r2) goto L31
            if (r1 != r3) goto L2a
            defpackage.uj50.b(r8)
            return r8
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r4)
            r4 = 0
            return r4
        L31:
            defpackage.uj50.b(r8)
            goto L4b
        L35:
            defpackage.uj50.b(r8)
            int r8 = r5.length()
            r1 = 11
            if (r8 == r1) goto L54
            r7.c = r2
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r4 = defpackage.hkd.b(r4, r7)
            if (r4 != r0) goto L4b
            goto L5c
        L4b:
            com.sporty.android.common_ui.uitext.ResourceUiText r4 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r5 = 2132023784(0x7f1419e8, float:1.9686026E38)
            r4.<init>(r5)
            return r4
        L54:
            r7.c = r3
            java.lang.Object r4 = r4.c(r5, r6, r7)
            if (r4 != r0) goto L5d
        L5c:
            return r0
        L5d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tq5.a(java.lang.String, boolean, java.lang.Long, x1b):java.lang.Object");
    }

    @Override // defpackage.isp
    public final boolean b(String str) {
        str.getClass();
        if (str.length() <= 11) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(String str, boolean z, x1b x1bVar) {
        sq5 sq5Var;
        String string;
        String str2;
        Throwable th;
        UiText uiText;
        Object bVar;
        Object aVar;
        UiText text;
        Object resourceUiText;
        if (x1bVar instanceof sq5) {
            sq5Var = (sq5) x1bVar;
            int i = sq5Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                sq5Var.e = i - Integer.MIN_VALUE;
            } else {
                sq5Var = new sq5(this, x1bVar);
            }
        } else {
            sq5Var = new sq5(this, x1bVar);
        }
        Object obj = sq5Var.c;
        y5b y5bVar = y5b.a;
        int i2 = sq5Var.e;
        if (i2 == 0) {
            uj50.b(obj);
            if (z) {
                string = UUID.randomUUID().toString();
                string.getClass();
            } else {
                string = null;
            }
            ResourceUiText resourceUiText2 = vch0.b;
            try {
                zi50.a aVar2 = zi50.b;
                lwm lwmVar = this.a;
                sq5Var.a = string;
                sq5Var.b = resourceUiText2;
                sq5Var.e = 1;
                Object objB = lwmVar.b(string, str, sq5Var);
                if (objB == y5bVar) {
                    return y5bVar;
                }
                obj = objB;
                uiText = resourceUiText2;
                str2 = string;
            } catch (Throwable th2) {
                str2 = string;
                th = th2;
                uiText = resourceUiText2;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uiText = sq5Var.b;
            str2 = sq5Var.a;
            try {
                uj50.b(obj);
            } catch (Throwable th3) {
                th = th3;
                zi50.a aVar4 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        bVar = (BaseResponse) obj;
        zi50.a aVar5 = zi50.b;
        Object obj2 = bVar instanceof zi50.b ? null : bVar;
        if (obj2 != null) {
            aVar = new lk50.c(obj2);
        } else {
            Throwable thA = zi50.a(bVar);
            if (thA == null) {
                thA = new Throwable("Unknown error");
            }
            Throwable thA2 = zi50.a(bVar);
            if (thA2 != null) {
                if (!(thA2 instanceof fk50)) {
                    thA2 = null;
                }
                fk50 fk50Var = (fk50) thA2;
                if (fk50Var != null && (text = fk50Var.getText()) != null) {
                    uiText = text;
                }
            }
            aVar = new lk50.a(thA, uiText);
        }
        if (!(aVar instanceof lk50.c)) {
            if (aVar instanceof lk50.a) {
                StringUiText stringUiText = vch0.a;
                return new ResourceUiText(R.string.common_feedback__something_went_wrong);
            }
            if (aVar.equals(lk50.b.a)) {
                return null;
            }
            uhc.a();
            return null;
        }
        BaseResponse baseResponse = (BaseResponse) ((lk50.c) aVar).a;
        CPFValidateResult cPFValidateResult = (CPFValidateResult) baseResponse.data;
        if (baseResponse.isSuccessful()) {
            if (CPFStatus.INSTANCE.isValid(cPFValidateResult != null ? cPFValidateResult.getStatus() : null)) {
                if (str2 == null) {
                    return null;
                }
                f00 f00Var = vgb0.a;
                Iterator<T> it = vgb0.b.iterator();
                while (it.hasNext()) {
                    ((zqm) it.next()).d(AnalyticsEvent.BR_REGISTER_STARTED, str2);
                }
                return null;
            }
        }
        String str3 = baseResponse.message;
        String message = cPFValidateResult != null ? cPFValidateResult.getMessage() : null;
        if (message != null && !StringsKt.U(message)) {
            resourceUiText = new StringUiText(message);
        } else {
            if (str3 != null && !StringsKt.U(str3)) {
                return new StringUiText(str3);
            }
            StringUiText stringUiText2 = vch0.a;
            resourceUiText = new ResourceUiText(R.string.common_feedback__something_went_wrong);
        }
        return resourceUiText;
    }
}
