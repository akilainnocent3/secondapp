package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.captcha.InHoseCaptchaResult;
import com.sporty.android.core.model.captcha.OTPCodeRequest;
import com.sporty.android.core.model.captcha.Quiz;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.security.otp.OtpChannelsResponse;
import com.sporty.android.core.model.security.otp.OtpResultV2;
import com.sporty.android.core.model.security.otp.ReversedOTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class w8w implements v8w {
    public final t8w a;
    public final k5b b;

    @c0d(c = "com.sporty.android.core.data.repository.msg.MsgRepositoryImpl$fetchOtpChannels$1", f = "MsgRepositoryImpl.kt", l = {57, 56}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super BaseResponse<OtpChannelsResponse>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.e = str;
            this.f = str2;
            this.i = str3;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = w8w.this.new a(this.e, this.f, this.i, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<OtpChannelsResponse>> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                w8w r8 = defpackage.w8w.this
                t8w r8 = r8.a
                r7.c = r5
                r7.a = r0
                r7.b = r4
                java.lang.String r2 = r7.e
                java.lang.String r4 = r7.f
                java.lang.String r6 = r7.i
                java.lang.Object r8 = r8.g(r2, r4, r6, r7)
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
            throw new UnsupportedOperationException("Method not decompiled: w8w.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.msg.MsgRepositoryImpl$generateOtp$1", f = "MsgRepositoryImpl.kt", l = {47, 47}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super BaseResponse<OtpResultV2>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ OTPCodeRequest e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(OTPCodeRequest oTPCodeRequest, String str, String str2, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.e = oTPCodeRequest;
            this.f = str;
            this.i = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = w8w.this.new b(this.e, this.f, this.i, v1bVar);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<OtpResultV2>> myhVar, v1b<? super Unit> v1bVar) {
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
                w8w r8 = defpackage.w8w.this
                t8w r8 = r8.a
                r7.c = r5
                r7.a = r0
                r7.b = r4
                com.sporty.android.core.model.captcha.OTPCodeRequest r2 = r7.e
                java.lang.String r4 = r7.f
                java.lang.String r6 = r7.i
                java.lang.Object r8 = r8.f(r2, r4, r6, r7)
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
            throw new UnsupportedOperationException("Method not decompiled: w8w.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.msg.MsgRepositoryImpl$quiz$1", f = "MsgRepositoryImpl.kt", l = {28, 28}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<myh<? super BaseResponse<Quiz>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = w8w.this.new c(this.e, v1bVar);
            cVar.c = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<Quiz>> myhVar, v1b<? super Unit> v1bVar) {
            return ((c) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
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
                goto L49
            L15:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r5
            L1b:
                myh r0 = r7.a
                defpackage.uj50.b(r8)
                goto L3c
            L21:
                defpackage.uj50.b(r8)
                w8w r8 = defpackage.w8w.this
                t8w r8 = r8.a
                com.sporty.android.core.model.captcha.QuizRequest r2 = new com.sporty.android.core.model.captcha.QuizRequest
                java.lang.String r6 = r7.e
                r2.<init>(r6)
                r7.c = r5
                r7.a = r0
                r7.b = r4
                java.lang.Object r8 = r8.a(r2, r7)
                if (r8 != r1) goto L3c
                goto L48
            L3c:
                r7.c = r5
                r7.a = r5
                r7.b = r3
                java.lang.Object r7 = r0.emit(r8, r7)
                if (r7 != r1) goto L49
            L48:
                return r1
            L49:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: w8w.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.msg.MsgRepositoryImpl$reversedOTPVerify$1", f = "MsgRepositoryImpl.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER, DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<myh<? super BaseResponse<ReversedOTPResponse>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.e = str;
            this.f = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = w8w.this.new d(this.e, this.f, v1bVar);
            dVar.c = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<ReversedOTPResponse>> myhVar, v1b<? super Unit> v1bVar) {
            return ((d) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
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
                goto L46
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L39
            L21:
                defpackage.uj50.b(r7)
                w8w r7 = defpackage.w8w.this
                t8w r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.String r4 = r6.f
                java.lang.Object r7 = r7.c(r2, r4, r6)
                if (r7 != r1) goto L39
                goto L45
            L39:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L46
            L45:
                return r1
            L46:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: w8w.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.msg.MsgRepositoryImpl$verify$1", f = "MsgRepositoryImpl.kt", l = {32, 32}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<myh<? super BaseResponse<InHoseCaptchaResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.e = str;
            this.f = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = w8w.this.new e(this.e, this.f, v1bVar);
            eVar.c = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<InHoseCaptchaResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((e) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r8.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r9)
                goto L4b
            L15:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                return r5
            L1b:
                myh r0 = r8.a
                defpackage.uj50.b(r9)
                goto L3e
            L21:
                defpackage.uj50.b(r9)
                w8w r9 = defpackage.w8w.this
                t8w r9 = r9.a
                com.sporty.android.core.model.captcha.VerifyRequest r2 = new com.sporty.android.core.model.captcha.VerifyRequest
                java.lang.String r6 = r8.e
                java.lang.String r7 = r8.f
                r2.<init>(r6, r7)
                r8.c = r5
                r8.a = r0
                r8.b = r4
                java.lang.Object r9 = r9.e(r2, r8)
                if (r9 != r1) goto L3e
                goto L4a
            L3e:
                r8.c = r5
                r8.a = r5
                r8.b = r3
                java.lang.Object r8 = r0.emit(r9, r8)
                if (r8 != r1) goto L4b
            L4a:
                return r1
            L4b:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: w8w.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public w8w(t8w t8wVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        t8wVar.getClass();
        this.a = t8wVar;
        this.b = k5bVar;
    }

    @Override // defpackage.v8w
    public final lyh<BaseResponse<InHoseCaptchaResult>> a(String str, String str2) {
        str.getClass();
        str2.getClass();
        return ozh.c(new or60(new e(str, str2, null)), this.b);
    }

    @Override // defpackage.v8w
    public final lyh<BaseResponse<OtpResultV2>> b(OTPCodeRequest oTPCodeRequest, String str, String str2) {
        str.getClass();
        return ozh.c(new or60(new b(oTPCodeRequest, str, str2, null)), this.b);
    }

    @Override // defpackage.v8w
    public final lyh<BaseResponse<OtpChannelsResponse>> c(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        return ozh.c(new or60(new a(str2, str, str3, null)), this.b);
    }

    @Override // defpackage.v8w
    public final lyh<BaseResponse<Quiz>> d(String str) {
        str.getClass();
        return ozh.c(new or60(new c(str, null)), this.b);
    }

    @Override // defpackage.v8w
    public final lyh<BaseResponse<ReversedOTPResponse>> e(String str, String str2) {
        str.getClass();
        str2.getClass();
        return ozh.c(new or60(new d(str, str2, null)), this.b);
    }
}
