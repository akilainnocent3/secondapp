package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.account.PasswordResetStatusResponse;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.security.otp.OTPGeneralResult;
import com.sporty.android.core.model.security.otp.OTPVerificationRequest;
import com.sporty.android.core.model.security.otp.PhoneOTPSessionData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class nc50 implements kc50 {
    public final xxz a;
    public final k5b b;
    public final tb50 c;

    @c0d(c = "com.sporty.android.platform.features.account.resetpassword.data.repository.ResetPasswordRepoImpl$resetPwdCreateSession$1", f = "ResetPasswordRepoImpl.kt", l = {30, 30}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super BaseResponse<OTPGeneralResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ PhoneOTPSessionData e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PhoneOTPSessionData phoneOTPSessionData, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.e = phoneOTPSessionData;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = nc50.this.new a(this.e, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<OTPGeneralResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r6.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r7)
                goto L44
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L37
            L21:
                defpackage.uj50.b(r7)
                nc50 r7 = defpackage.nc50.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                com.sporty.android.core.model.security.otp.PhoneOTPSessionData r2 = r6.e
                java.lang.Object r7 = r7.e(r2, r6)
                if (r7 != r1) goto L37
                goto L43
            L37:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L44
            L43:
                return r1
            L44:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nc50.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.platform.features.account.resetpassword.data.repository.ResetPasswordRepoImpl$resetPwdOTPVerify$1", f = "ResetPasswordRepoImpl.kt", l = {41, 40}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super BaseResponse<OTPGeneralResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ OTPVerificationRequest e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ boolean i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(OTPVerificationRequest oTPVerificationRequest, boolean z, boolean z2, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.e = oTPVerificationRequest;
            this.f = z;
            this.i = z2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = nc50.this.new b(this.e, this.f, this.i, v1bVar);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<OTPGeneralResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r7.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r8)
                goto L48
            L15:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r5
            L1b:
                myh r0 = r7.a
                defpackage.uj50.b(r8)
                goto L3b
            L21:
                defpackage.uj50.b(r8)
                nc50 r8 = defpackage.nc50.this
                xxz r8 = r8.a
                r7.c = r5
                r7.a = r0
                r7.b = r4
                com.sporty.android.core.model.security.otp.OTPVerificationRequest r2 = r7.e
                boolean r4 = r7.f
                boolean r6 = r7.i
                java.lang.Object r8 = r8.d(r2, r4, r6, r7)
                if (r8 != r1) goto L3b
                goto L47
            L3b:
                r7.c = r5
                r7.a = r5
                r7.b = r3
                java.lang.Object r7 = r0.emit(r8, r7)
                if (r7 != r1) goto L48
            L47:
                return r1
            L48:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: nc50.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public nc50(xxz xxzVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, tb50 tb50Var) {
        xxzVar.getClass();
        tb50Var.getClass();
        this.a = xxzVar;
        this.b = k5bVar;
        this.c = tb50Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.kc50
    public final Object a(x1b x1bVar) {
        lc50 lc50Var;
        UiText uiText;
        Object bVar;
        UiText text;
        if (x1bVar instanceof lc50) {
            lc50Var = (lc50) x1bVar;
            int i = lc50Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lc50Var.d = i - Integer.MIN_VALUE;
            } else {
                lc50Var = new lc50(this, x1bVar);
            }
        } else {
            lc50Var = new lc50(this, x1bVar);
        }
        Object obj = lc50Var.b;
        y5b y5bVar = y5b.a;
        int i2 = lc50Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                xxz xxzVar = this.a;
                lc50Var.a = resourceUiText;
                lc50Var.d = 1;
                Object objE = xxzVar.E(lc50Var);
                if (objE == y5bVar) {
                    return y5bVar;
                }
                uiText = resourceUiText;
                obj = objE;
            } catch (Throwable th) {
                th = th;
                uiText = resourceUiText;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uiText = lc50Var.a;
            try {
                uj50.b(obj);
            } catch (Throwable th2) {
                th = th2;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        PasswordResetStatusResponse passwordResetStatusResponse = (PasswordResetStatusResponse) n52.b((BaseResponse) obj);
        this.c.getClass();
        passwordResetStatusResponse.getClass();
        bVar = new usi(passwordResetStatusResponse.getPasswordResetForced());
        zi50.a aVar4 = zi50.b;
        Object obj2 = bVar instanceof zi50.b ? null : bVar;
        if (obj2 != null) {
            return new lk50.c(obj2);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            thA = new Throwable("Unknown error");
        }
        Throwable thA2 = zi50.a(bVar);
        if (thA2 != null) {
            fk50 fk50Var = (fk50) (thA2 instanceof fk50 ? thA2 : null);
            if (fk50Var != null && (text = fk50Var.getText()) != null) {
                uiText = text;
            }
        }
        return new lk50.a(thA, uiText);
    }

    @Override // defpackage.kc50
    public final lyh<BaseResponse<OTPGeneralResult>> c(PhoneOTPSessionData phoneOTPSessionData) {
        return ozh.c(new or60(new a(phoneOTPSessionData, null)), this.b);
    }

    @Override // defpackage.kc50
    public final yzh d(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        return bm50.a(ozh.c(new or60(new mc50(this, str, str2, str3, null)), this.b));
    }

    @Override // defpackage.kc50
    public final lyh<BaseResponse<OTPGeneralResult>> e(OTPVerificationRequest oTPVerificationRequest, boolean z, boolean z2) {
        return ozh.c(new or60(new b(oTPVerificationRequest, z, z2, null)), this.b);
    }
}
