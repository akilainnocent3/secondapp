package defpackage;

import com.sporty.android.core.model.account.verifiedemailchange.EmailChangeBindOtpSessionDTO;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangeConfigResponse;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangeOtpVerificationRequest;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangePasswordCheckRequest;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangePinCheckRequest;
import com.sporty.android.core.model.account.verifiedemailchange.EmailUpdateRequest;
import com.sporty.android.core.model.security.otp.OTPGeneralResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class pyf implements oyf {
    public final xxz a;
    public final k5b b;

    @c0d(c = "com.sporty.android.core.data.repository.account.verifiedemailchange.EmailChangeRepositoryImpl$bindEmailChangeOtpSession$1", f = "EmailChangeRepositoryImpl.kt", l = {53, 53}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super EmailChangeBindOtpSessionDTO>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ EmailChangeBindOtpSessionDTO e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EmailChangeBindOtpSessionDTO emailChangeBindOtpSessionDTO, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.e = emailChangeBindOtpSessionDTO;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = pyf.this.new a(this.e, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super EmailChangeBindOtpSessionDTO> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws com.sporty.android.common.network.data.SprThrowable {
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
                goto L4a
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
                pyf r7 = defpackage.pyf.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                com.sporty.android.core.model.account.verifiedemailchange.EmailChangeBindOtpSessionDTO r2 = r6.e
                java.lang.Object r7 = r7.z0(r2, r6)
                if (r7 != r1) goto L37
                goto L49
            L37:
                com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
                java.lang.Object r7 = defpackage.n52.b(r7)
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L4a
            L49:
                return r1
            L4a:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pyf.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.account.verifiedemailchange.EmailChangeRepositoryImpl$checkIsEmailBound$1", f = "EmailChangeRepositoryImpl.kt", l = {28, 28}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super Boolean>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = pyf.this.new b(v1bVar);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super Boolean> myhVar, v1b<? super Unit> v1bVar) {
            return ((b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws com.sporty.android.common.network.data.SprThrowable {
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
                goto L48
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L35
            L21:
                defpackage.uj50.b(r7)
                pyf r7 = defpackage.pyf.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.i1(r6)
                if (r7 != r1) goto L35
                goto L47
            L35:
                com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
                java.lang.Object r7 = defpackage.n52.b(r7)
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L48
            L47:
                return r1
            L48:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pyf.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.account.verifiedemailchange.EmailChangeRepositoryImpl$getEmailChangeConfig$1", f = "EmailChangeRepositoryImpl.kt", l = {32, 33}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<myh<? super EmailChangeConfigResponse>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = pyf.this.new c(v1bVar);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super EmailChangeConfigResponse> myhVar, v1b<? super Unit> v1bVar) {
            return ((c) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                java.lang.Object r0 = r6.b
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r6.a
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L1f
                if (r2 == r5) goto L1b
                if (r2 != r4) goto L15
                defpackage.uj50.b(r7)
                goto L44
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r3
            L1b:
                defpackage.uj50.b(r7)
                goto L31
            L1f:
                defpackage.uj50.b(r7)
                pyf r7 = defpackage.pyf.this
                xxz r7 = r7.a
                r6.b = r0
                r6.a = r5
                java.lang.Object r7 = r7.J1(r6)
                if (r7 != r1) goto L31
                goto L43
            L31:
                com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
                java.lang.Object r7 = defpackage.n52.b(r7)
                com.sporty.android.core.model.account.verifiedemailchange.EmailChangeConfigResponse r7 = (com.sporty.android.core.model.account.verifiedemailchange.EmailChangeConfigResponse) r7
                r6.b = r3
                r6.a = r4
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L44
            L43:
                return r1
            L44:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pyf.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.account.verifiedemailchange.EmailChangeRepositoryImpl$verifyEmailChangeOtp$1", f = "EmailChangeRepositoryImpl.kt", l = {59, 58}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<myh<? super OTPGeneralResult>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ EmailChangeOtpVerificationRequest e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(EmailChangeOtpVerificationRequest emailChangeOtpVerificationRequest, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.e = emailChangeOtpVerificationRequest;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = pyf.this.new d(this.e, v1bVar);
            dVar.c = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super OTPGeneralResult> myhVar, v1b<? super Unit> v1bVar) {
            return ((d) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws com.sporty.android.common.network.data.SprThrowable {
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
                goto L4a
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
                pyf r7 = defpackage.pyf.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                com.sporty.android.core.model.account.verifiedemailchange.EmailChangeOtpVerificationRequest r2 = r6.e
                java.lang.Object r7 = r7.i(r2, r6)
                if (r7 != r1) goto L37
                goto L49
            L37:
                com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
                java.lang.Object r7 = defpackage.n52.b(r7)
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L4a
            L49:
                return r1
            L4a:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pyf.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public pyf(xxz xxzVar, k5b k5bVar) {
        this.a = xxzVar;
        this.b = k5bVar;
    }

    @Override // defpackage.oyf
    public final Object a(EmailChangePinCheckRequest emailChangePinCheckRequest, wtj0.a aVar) {
        return ej5.d(this.b, new ryf(this, emailChangePinCheckRequest, null), aVar);
    }

    @Override // defpackage.oyf
    public final lyh<EmailChangeBindOtpSessionDTO> b(EmailChangeBindOtpSessionDTO emailChangeBindOtpSessionDTO) {
        return ozh.c(new or60(new a(emailChangeBindOtpSessionDTO, null)), this.b);
    }

    @Override // defpackage.oyf
    public final Object c(tje0 tje0Var) {
        Object objD = ej5.d(this.b, new tyf(this, null), tje0Var);
        return objD == y5b.a ? objD : Unit.a;
    }

    @Override // defpackage.oyf
    public final lyh<OTPGeneralResult> d(EmailChangeOtpVerificationRequest emailChangeOtpVerificationRequest) {
        return ozh.c(new or60(new d(emailChangeOtpVerificationRequest, null)), this.b);
    }

    @Override // defpackage.oyf
    public final Object e(tje0 tje0Var) {
        return ej5.d(this.b, new syf(this, null), tje0Var);
    }

    @Override // defpackage.oyf
    public final lyh<EmailChangeConfigResponse> f() {
        return ozh.c(new or60(new c(null)), this.b);
    }

    @Override // defpackage.oyf
    public final Object g(EmailChangePasswordCheckRequest emailChangePasswordCheckRequest, zzf.a aVar) {
        return ej5.d(this.b, new qyf(this, emailChangePasswordCheckRequest, null), aVar);
    }

    @Override // defpackage.oyf
    public final lyh<Boolean> h() {
        return ozh.c(new or60(new b(null)), this.b);
    }

    @Override // defpackage.oyf
    public final Object i(EmailUpdateRequest emailUpdateRequest, nxf.a aVar) {
        Object objD = ej5.d(this.b, new uyf(this, emailUpdateRequest, null), aVar);
        return objD == y5b.a ? objD : Unit.a;
    }
}
