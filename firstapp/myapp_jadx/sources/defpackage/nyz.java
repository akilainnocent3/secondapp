package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.account.CpfData;
import com.sporty.android.core.model.account.telegram.BindTelegramBody;
import com.sporty.android.core.model.account.telegram.TelegramBindingActionType;
import com.sporty.android.core.model.account.telegram.TelegramBindingPreCheckResponse;
import com.sporty.android.core.model.account.telegram.TelegramBotInfo;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.kyc.phonemigration.MigratePhoneBody;
import com.sporty.android.core.model.kyc.phonemigration.VerifyMainOTPBody;
import com.sporty.android.core.model.kyc.phonemigration.VerifyNameMatchResult;
import com.sporty.android.core.model.kyc.phonemigration.VerifySubsidiaryOTPBody;
import com.sporty.android.core.model.nin.SubmitNINBody;
import com.sporty.android.core.model.patron.BindNewPhoneApiResult;
import com.sporty.android.core.model.patron.Country;
import com.sporty.android.core.model.patron.DefaultGift;
import com.sporty.android.core.model.patron.DocumentAudit;
import com.sporty.android.core.model.patron.FeedbackDescription;
import com.sporty.android.core.model.patron.GooglePlayAvailableData;
import com.sporty.android.core.model.patron.KYCBannerItem;
import com.sporty.android.core.model.patron.KYCReminder;
import com.sporty.android.core.model.patron.KycHintExtra;
import com.sporty.android.core.model.patron.LoginResponse;
import com.sporty.android.core.model.patron.NINConfigResponse;
import com.sporty.android.core.model.patron.NINInfoResponse;
import com.sporty.android.core.model.patron.NameConfirmationStatus;
import com.sporty.android.core.model.patron.NicknameAvailabilityResponse;
import com.sporty.android.core.model.patron.PersonalInfo;
import com.sporty.android.core.model.patron.UpdateNicknameResponse;
import com.sporty.android.core.model.patron.UserCertInfo;
import com.sporty.android.core.model.patron.UserPhone;
import com.sporty.android.core.model.patron.VerifyOtpRequest;
import com.sporty.android.core.model.patron.VerifyPersonalInfoResult;
import com.sporty.android.core.model.primaryphone.GetReviewedPrimaryPhoneResult;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneBindOTPSessionForNewPhoneBody;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneConfig;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneVerifyNameBody;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneVerifyNameResult;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneVerifyOTPBody;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneVerifyOTPResult;
import com.sporty.android.core.model.primaryphone.UpdatePrimaryPhoneNumberBody;
import com.sporty.android.core.model.primaryphone.UpdatePrimaryPhoneNumberResult;
import com.sporty.android.core.model.primaryphone.VerifyIdentityBody;
import com.sporty.android.core.model.primaryphone.VerifyIdentityResult;
import com.sporty.android.core.model.profile.UserInfoProperty;
import com.sporty.android.core.model.security.otp.BindNewPhoneOTPSessionData;
import com.sporty.android.core.model.security.otp.CheckIsTrustedDeviceResponse;
import com.sporty.android.core.model.security.otp.OTPCompleteResult;
import com.sporty.android.core.model.security.otp.OTPGeneralResult;
import com.sporty.android.core.model.security.otp.OTPUpdateNameResult;
import com.sporty.android.core.model.security.otp.OTPVerificationRequest;
import com.sporty.android.core.model.security.otp.PreRegisterResponse;
import com.sporty.android.core.model.security.otp.ReactivateAccountResult;
import com.sporty.android.core.model.security.otp.RegisterBrVerifyCode;
import com.sporty.android.core.model.security.otp.RegisterCompleteBody;
import com.sporty.android.core.model.security.otp.ResetSportyPINResult;
import com.sporty.android.core.model.security.otp.SportyPinSessionToken;
import com.sporty.android.core.model.security.sportypin.WithdrawalPinStatusInfo;
import com.sporty.android.core.model.security.twofa.GetTwoFAHintStatusResponse;
import com.sporty.android.core.model.security.twofa.TwoFAIndicatorPage;
import com.sporty.android.core.model.timecontrol.SelfExclusionRequest;
import com.sporty.android.core.model.timecontrol.SelfExclusionResponse;
import com.sporty.android.core.model.timecontrol.TimeSelfExclusionRequest;
import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class nyz implements lyz, fjt {
    public final xxz a;
    public final k5b b;
    public final psm c;
    public final mgb0 d;
    public final iyz e;
    public final wwd0 f;
    public final wwd0 i;
    public final wwd0 v;

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$applySelfExclusion$1", f = "PatronRepositoryImpl.kt", l = {667, 667}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super BaseResponse<SelfExclusionResponse>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ SelfExclusionRequest e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SelfExclusionRequest selfExclusionRequest, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.e = selfExclusionRequest;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = nyz.this.new a(this.e, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<SelfExclusionResponse>> myhVar, v1b<? super Unit> v1bVar) {
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                com.sporty.android.core.model.timecontrol.SelfExclusionRequest r2 = r6.e
                java.lang.Object r7 = r7.x0(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$getPersonalInfo$1", f = "PatronRepositoryImpl.kt", l = {422, 422}, m = "invokeSuspend", v = 2)
    public static final class a0 extends tje0 implements Function2<myh<? super BaseResponse<PersonalInfo>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ nyz d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(v1b v1bVar, nyz nyzVar, String str) {
            super(2, v1bVar);
            this.d = nyzVar;
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a0 a0Var = new a0(v1bVar, this.d, this.e);
            a0Var.c = obj;
            return a0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<PersonalInfo>> myhVar, v1b<? super Unit> v1bVar) {
            return ((a0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = r6.d
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.C1(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.a0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$updatePrimaryPhoneNumber$1", f = "PatronRepositoryImpl.kt", l = {633, 633}, m = "invokeSuspend", v = 2)
    public static final class a1 extends tje0 implements Function2<myh<? super BaseResponse<UpdatePrimaryPhoneNumberResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ UpdatePrimaryPhoneNumberBody e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a1(UpdatePrimaryPhoneNumberBody updatePrimaryPhoneNumberBody, v1b<? super a1> v1bVar) {
            super(2, v1bVar);
            this.e = updatePrimaryPhoneNumberBody;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a1 a1Var = nyz.this.new a1(this.e, v1bVar);
            a1Var.c = obj;
            return a1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<UpdatePrimaryPhoneNumberResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((a1) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                com.sporty.android.core.model.primaryphone.UpdatePrimaryPhoneNumberBody r2 = r6.e
                java.lang.Object r7 = r7.K0(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.a1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$applyTimeExclusion$1", f = "PatronRepositoryImpl.kt", l = {662, 662}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super BaseResponse<SelfExclusionResponse>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ TimeSelfExclusionRequest e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TimeSelfExclusionRequest timeSelfExclusionRequest, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.e = timeSelfExclusionRequest;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = nyz.this.new b(this.e, v1bVar);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<SelfExclusionResponse>> myhVar, v1b<? super Unit> v1bVar) {
            return ((b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                com.sporty.android.core.model.timecontrol.TimeSelfExclusionRequest r2 = r6.e
                java.lang.Object r7 = r7.n0(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$getPrimaryPhoneConfig$1", f = "PatronRepositoryImpl.kt", l = {617, 617}, m = "invokeSuspend", v = 2)
    public static final class b0 extends tje0 implements Function2<myh<? super PrimaryPhoneConfig>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public b0(v1b<? super b0> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b0 b0Var = nyz.this.new b0(v1bVar);
            b0Var.c = obj;
            return b0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super PrimaryPhoneConfig> myhVar, v1b<? super Unit> v1bVar) {
            return ((b0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
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
                goto L4e
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.P(r6)
                if (r7 != r1) goto L35
                goto L4d
            L35:
                com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
                java.lang.Object r7 = defpackage.n52.b(r7)
                com.sporty.android.core.model.primaryphone.PrimaryPhoneConfigResponse r7 = (com.sporty.android.core.model.primaryphone.PrimaryPhoneConfigResponse) r7
                com.sporty.android.core.model.primaryphone.PrimaryPhoneConfig r7 = com.sporty.android.core.model.primaryphone.PrimaryPhoneConfigMapperKt.toPrimaryPhoneConfig(r7)
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L4e
            L4d:
                return r1
            L4e:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.b0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$updateTheme$1", f = "PatronRepositoryImpl.kt", l = {628, 628}, m = "invokeSuspend", v = 2)
    public static final class b1 extends tje0 implements Function2<myh<? super BaseResponse<Void>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ nyz d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b1(v1b v1bVar, nyz nyzVar, String str) {
            super(2, v1bVar);
            this.d = nyzVar;
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b1 b1Var = new b1(v1bVar, this.d, this.e);
            b1Var.c = obj;
            return b1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<Void>> myhVar, v1b<? super Unit> v1bVar) {
            return ((b1) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = r6.d
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.C0(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.b1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$bindOTPSessionForNewPhone$1", f = "PatronRepositoryImpl.kt", l = {259, 260}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<myh<? super String>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ PrimaryPhoneBindOTPSessionForNewPhoneBody d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PrimaryPhoneBindOTPSessionForNewPhoneBody primaryPhoneBindOTPSessionForNewPhoneBody, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.d = primaryPhoneBindOTPSessionForNewPhoneBody;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = nyz.this.new c(this.d, v1bVar);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super String> myhVar, v1b<? super Unit> v1bVar) {
            return ((c) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
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
                goto L4a
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r3
            L1b:
                defpackage.uj50.b(r7)
                goto L33
            L1f:
                defpackage.uj50.b(r7)
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.b = r0
                r6.a = r5
                com.sporty.android.core.model.primaryphone.PrimaryPhoneBindOTPSessionForNewPhoneBody r2 = r6.d
                java.lang.Object r7 = r7.B1(r2, r6)
                if (r7 != r1) goto L33
                goto L49
            L33:
                com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
                java.lang.Object r7 = defpackage.n52.b(r7)
                com.sporty.android.core.model.security.otp.OTPGeneralResult r7 = (com.sporty.android.core.model.security.otp.OTPGeneralResult) r7
                java.lang.String r7 = r7.getToken()
                r6.b = r3
                r6.a = r4
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L4a
            L49:
                return r1
            L4a:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$getPrimaryPhoneOtpSession$1", f = "PatronRepositoryImpl.kt", l = {332, 332}, m = "invokeSuspend", v = 2)
    public static final class c0 extends tje0 implements Function2<myh<? super BaseResponse<OTPGeneralResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public c0(v1b<? super c0> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c0 c0Var = nyz.this.new c0(v1bVar);
            c0Var.c = obj;
            return c0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<OTPGeneralResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((c0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
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
                goto L42
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.t0(r6)
                if (r7 != r1) goto L35
                goto L41
            L35:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L42
            L41:
                return r1
            L42:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.c0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$updateVerifiedUserNickname$1", f = "PatronRepositoryImpl.kt", l = {559, 558}, m = "invokeSuspend", v = 2)
    public static final class c1 extends tje0 implements Function2<myh<? super BaseResponse<UpdateNicknameResponse>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ nyz d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c1(v1b v1bVar, nyz nyzVar, String str) {
            super(2, v1bVar);
            this.d = nyzVar;
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c1 c1Var = new c1(v1bVar, this.d, this.e);
            c1Var.c = obj;
            return c1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<UpdateNicknameResponse>> myhVar, v1b<? super Unit> v1bVar) {
            return ((c1) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r8 = r7.d
                xxz r8 = r8.a
                com.sporty.android.core.model.patron.UpdateNicknameRequest r2 = new com.sporty.android.core.model.patron.UpdateNicknameRequest
                java.lang.String r6 = r7.e
                r2.<init>(r6)
                r7.c = r5
                r7.a = r0
                r7.b = r4
                java.lang.Object r8 = r8.r(r2, r7)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.c1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$bindOTPSessionForOldPhone$1", f = "PatronRepositoryImpl.kt", l = {237, 238}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<myh<? super String>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = nyz.this.new d(v1bVar);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super String> myhVar, v1b<? super Unit> v1bVar) {
            return ((d) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
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
                goto L48
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r3
            L1b:
                defpackage.uj50.b(r7)
                goto L31
            L1f:
                defpackage.uj50.b(r7)
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.b = r0
                r6.a = r5
                java.lang.Object r7 = r7.D1(r6)
                if (r7 != r1) goto L31
                goto L47
            L31:
                com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
                java.lang.Object r7 = defpackage.n52.b(r7)
                com.sporty.android.core.model.security.otp.OTPGeneralResult r7 = (com.sporty.android.core.model.security.otp.OTPGeneralResult) r7
                java.lang.String r7 = r7.getToken()
                r6.b = r3
                r6.a = r4
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L48
            L47:
                return r1
            L48:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$getReviewedPrimaryPhone$1", f = "PatronRepositoryImpl.kt", l = {504, 504}, m = "invokeSuspend", v = 2)
    public static final class d0 extends tje0 implements Function2<myh<? super BaseResponse<GetReviewedPrimaryPhoneResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public d0(v1b<? super d0> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d0 d0Var = nyz.this.new d0(v1bVar);
            d0Var.c = obj;
            return d0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<GetReviewedPrimaryPhoneResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((d0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
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
                goto L42
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.f0(r6)
                if (r7 != r1) goto L35
                goto L41
            L35:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L42
            L41:
                return r1
            L42:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.d0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$verifyDeactivate$1", f = "PatronRepositoryImpl.kt", l = {159, 159}, m = "invokeSuspend", v = 2)
    public static final class d1 extends tje0 implements Function2<myh<? super BaseResponse<Void>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ nyz d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d1(v1b v1bVar, nyz nyzVar, String str) {
            super(2, v1bVar);
            this.d = nyzVar;
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d1 d1Var = new d1(v1bVar, this.d, this.e);
            d1Var.c = obj;
            return d1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<Void>> myhVar, v1b<? super Unit> v1bVar) {
            return ((d1) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = r6.d
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.Q0(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.d1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$bindTelegramAccount$1", f = "PatronRepositoryImpl.kt", l = {709, 709}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<myh<? super BaseResponse<Unit>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ BindTelegramBody e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(BindTelegramBody bindTelegramBody, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.e = bindTelegramBody;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = nyz.this.new e(this.e, v1bVar);
            eVar.c = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<Unit>> myhVar, v1b<? super Unit> v1bVar) {
            return ((e) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                com.sporty.android.core.model.account.telegram.BindTelegramBody r2 = r6.e
                java.lang.Object r7 = r7.g1(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$getSelfExclusionStatus$1", f = "PatronRepositoryImpl.kt", l = {657, 657}, m = "invokeSuspend", v = 2)
    public static final class e0 extends tje0 implements Function2<myh<? super BaseResponse<SelfExclusionResponse>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public e0(v1b<? super e0> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e0 e0Var = nyz.this.new e0(v1bVar);
            e0Var.c = obj;
            return e0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<SelfExclusionResponse>> myhVar, v1b<? super Unit> v1bVar) {
            return ((e0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
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
                goto L42
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.n1(r6)
                if (r7 != r1) goto L35
                goto L41
            L35:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L42
            L41:
                return r1
            L42:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.e0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$verifyIdentity$1", f = "PatronRepositoryImpl.kt", l = {517, 517}, m = "invokeSuspend", v = 2)
    public static final class e1 extends tje0 implements Function2<myh<? super BaseResponse<VerifyIdentityResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ VerifyIdentityBody e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e1(VerifyIdentityBody verifyIdentityBody, v1b<? super e1> v1bVar) {
            super(2, v1bVar);
            this.e = verifyIdentityBody;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e1 e1Var = nyz.this.new e1(this.e, v1bVar);
            e1Var.c = obj;
            return e1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<VerifyIdentityResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((e1) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                com.sporty.android.core.model.primaryphone.VerifyIdentityBody r2 = r6.e
                java.lang.Object r7 = r7.N(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.e1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$cancelPrimaryPhoneReview$1", f = "PatronRepositoryImpl.kt", l = {508, 508}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<myh<? super BaseResponse<Unit>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ nyz d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(v1b v1bVar, nyz nyzVar, String str) {
            super(2, v1bVar);
            this.d = nyzVar;
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            f fVar = new f(v1bVar, this.d, this.e);
            fVar.c = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<Unit>> myhVar, v1b<? super Unit> v1bVar) {
            return ((f) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = r6.d
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.A0(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$getSportyPinStatus$1", f = "PatronRepositoryImpl.kt", l = {391}, m = "invokeSuspend", v = 2)
    public static final class f0 extends tje0 implements Function1<v1b<? super WithdrawalPinStatusInfo>, Object> {
        public int a;

        public f0(v1b<? super f0> v1bVar) {
            super(1, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return nyz.this.new f0(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super WithdrawalPinStatusInfo> v1bVar) {
            return ((f0) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                xxz xxzVar = nyz.this.a;
                this.a = 1;
                obj = xxzVar.b(this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return n52.b((BaseResponse) obj);
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$verifyMainOTPForPhoneMigration$1", f = "PatronRepositoryImpl.kt", l = {304, 304}, m = "invokeSuspend", v = 2)
    public static final class f1 extends tje0 implements Function2<myh<? super BaseResponse<OTPGeneralResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ VerifyMainOTPBody e;
        public final /* synthetic */ boolean f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f1(VerifyMainOTPBody verifyMainOTPBody, boolean z, v1b<? super f1> v1bVar) {
            super(2, v1bVar);
            this.e = verifyMainOTPBody;
            this.f = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            f1 f1Var = nyz.this.new f1(this.e, this.f, v1bVar);
            f1Var.c = obj;
            return f1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<OTPGeneralResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((f1) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                com.sporty.android.core.model.kyc.phonemigration.VerifyMainOTPBody r2 = r6.e
                boolean r4 = r6.f
                java.lang.Object r7 = r7.T0(r2, r4, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.f1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$cancelSelfExclusion$1", f = "PatronRepositoryImpl.kt", l = {671, 671}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements Function2<myh<? super BaseResponse<Void>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public g(v1b<? super g> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            g gVar = nyz.this.new g(v1bVar);
            gVar.c = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<Void>> myhVar, v1b<? super Unit> v1bVar) {
            return ((g) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
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
                goto L42
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.x1(r6)
                if (r7 != r1) goto L35
                goto L41
            L35:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L42
            L41:
                return r1
            L42:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$getSubsidiaryOTPSessionForPhoneMigration$1", f = "PatronRepositoryImpl.kt", l = {309, 309}, m = "invokeSuspend", v = 2)
    public static final class g0 extends tje0 implements Function2<myh<? super BaseResponse<OTPGeneralResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public g0(v1b<? super g0> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            g0 g0Var = nyz.this.new g0(v1bVar);
            g0Var.c = obj;
            return g0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<OTPGeneralResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((g0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
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
                goto L42
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.P0(r6)
                if (r7 != r1) goto L35
                goto L41
            L35:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L42
            L41:
                return r1
            L42:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.g0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$verifyNameMatchForPhoneMigration$1", f = "PatronRepositoryImpl.kt", l = {290, 290}, m = "invokeSuspend", v = 2)
    public static final class g1 extends tje0 implements Function2<myh<? super BaseResponse<VerifyNameMatchResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ nyz d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g1(v1b v1bVar, nyz nyzVar, String str) {
            super(2, v1bVar);
            this.d = nyzVar;
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            g1 g1Var = new g1(v1bVar, this.d, this.e);
            g1Var.c = obj;
            return g1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<VerifyNameMatchResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((g1) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r8 = r7.d
                xxz r8 = r8.a
                com.sporty.android.core.model.kyc.phonemigration.PasswordVerifyToken r2 = new com.sporty.android.core.model.kyc.phonemigration.PasswordVerifyToken
                java.lang.String r6 = r7.e
                r2.<init>(r6)
                r7.c = r5
                r7.a = r0
                r7.b = r4
                java.lang.Object r8 = r8.y(r2, r7)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.g1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$checkIsNINConfigEnabled$1", f = "PatronRepositoryImpl.kt", l = {410, 410}, m = "invokeSuspend", v = 2)
    public static final class h extends tje0 implements Function2<myh<? super NINConfigResponse>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public h(v1b<? super h> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            h hVar = nyz.this.new h(v1bVar);
            hVar.c = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super NINConfigResponse> myhVar, v1b<? super Unit> v1bVar) {
            return ((h) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.D(r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$getTelegramBotInfo$1", f = "PatronRepositoryImpl.kt", l = {716, 716}, m = "invokeSuspend", v = 2)
    public static final class h0 extends tje0 implements Function2<myh<? super BaseResponse<TelegramBotInfo>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public h0(v1b<? super h0> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            h0 h0Var = nyz.this.new h0(v1bVar);
            h0Var.c = obj;
            return h0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<TelegramBotInfo>> myhVar, v1b<? super Unit> v1bVar) {
            return ((h0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
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
                goto L42
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.S0(r6)
                if (r7 != r1) goto L35
                goto L41
            L35:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L42
            L41:
                return r1
            L42:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.h0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$verifyNameUnderPrimaryPhone$1", f = "PatronRepositoryImpl.kt", l = {638, 638}, m = "invokeSuspend", v = 2)
    public static final class h1 extends tje0 implements Function2<myh<? super BaseResponse<PrimaryPhoneVerifyNameResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ PrimaryPhoneVerifyNameBody e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h1(PrimaryPhoneVerifyNameBody primaryPhoneVerifyNameBody, v1b<? super h1> v1bVar) {
            super(2, v1bVar);
            this.e = primaryPhoneVerifyNameBody;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            h1 h1Var = nyz.this.new h1(this.e, v1bVar);
            h1Var.c = obj;
            return h1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<PrimaryPhoneVerifyNameResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((h1) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                com.sporty.android.core.model.primaryphone.PrimaryPhoneVerifyNameBody r2 = r6.e
                java.lang.Object r7 = r7.q0(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.h1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$checkIsTrustedDevice$1", f = "PatronRepositoryImpl.kt", l = {652, 652}, m = "invokeSuspend", v = 2)
    public static final class i extends tje0 implements Function2<myh<? super BaseResponse<CheckIsTrustedDeviceResponse>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ j6c e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(j6c j6cVar, v1b<? super i> v1bVar) {
            super(2, v1bVar);
            this.e = j6cVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            i iVar = nyz.this.new i(this.e, v1bVar);
            iVar.c = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<CheckIsTrustedDeviceResponse>> myhVar, v1b<? super Unit> v1bVar) {
            return ((i) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                j6c r2 = r6.e
                java.lang.String r2 = r2.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.x(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$getTwoFAHintStatus$1", f = "PatronRepositoryImpl.kt", l = {682, 682}, m = "invokeSuspend", v = 2)
    public static final class i0 extends tje0 implements Function2<myh<? super BaseResponse<GetTwoFAHintStatusResponse>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public i0(v1b<? super i0> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            i0 i0Var = nyz.this.new i0(v1bVar);
            i0Var.c = obj;
            return i0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<GetTwoFAHintStatusResponse>> myhVar, v1b<? super Unit> v1bVar) {
            return ((i0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
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
                goto L42
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.g0(r6)
                if (r7 != r1) goto L35
                goto L41
            L35:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L42
            L41:
                return r1
            L42:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.i0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$verifyOTPForNewPhone$1", f = "PatronRepositoryImpl.kt", l = {266, 266}, m = "invokeSuspend", v = 2)
    public static final class i1 extends tje0 implements Function2<myh<? super BaseResponse<PrimaryPhoneVerifyOTPResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ PrimaryPhoneVerifyOTPBody e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i1(PrimaryPhoneVerifyOTPBody primaryPhoneVerifyOTPBody, v1b<? super i1> v1bVar) {
            super(2, v1bVar);
            this.e = primaryPhoneVerifyOTPBody;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            i1 i1Var = nyz.this.new i1(this.e, v1bVar);
            i1Var.c = obj;
            return i1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<PrimaryPhoneVerifyOTPResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((i1) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                com.sporty.android.core.model.primaryphone.PrimaryPhoneVerifyOTPBody r2 = r6.e
                java.lang.Object r7 = r7.Z(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.i1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$checkNicknameAvailability$1", f = "PatronRepositoryImpl.kt", l = {569, 569}, m = "invokeSuspend", v = 2)
    public static final class j extends tje0 implements Function2<myh<? super BaseResponse<NicknameAvailabilityResponse>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ nyz d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(v1b v1bVar, nyz nyzVar, String str) {
            super(2, v1bVar);
            this.d = nyzVar;
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            j jVar = new j(v1bVar, this.d, this.e);
            jVar.c = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<NicknameAvailabilityResponse>> myhVar, v1b<? super Unit> v1bVar) {
            return ((j) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = r6.d
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.I0(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$getUserCertInfo$1", f = "PatronRepositoryImpl.kt", l = {402, 402}, m = "invokeSuspend", v = 2)
    public static final class j0 extends tje0 implements Function2<myh<? super BaseResponse<UserCertInfo>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public j0(v1b<? super j0> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            j0 j0Var = nyz.this.new j0(v1bVar);
            j0Var.c = obj;
            return j0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<UserCertInfo>> myhVar, v1b<? super Unit> v1bVar) {
            return ((j0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
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
                goto L42
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.a0(r6)
                if (r7 != r1) goto L35
                goto L41
            L35:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L42
            L41:
                return r1
            L42:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.j0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$verifyOTPForOldPhone$1", f = "PatronRepositoryImpl.kt", l = {249, 248}, m = "invokeSuspend", v = 2)
    public static final class j1 extends tje0 implements Function2<myh<? super BaseResponse<PrimaryPhoneVerifyOTPResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ PrimaryPhoneVerifyOTPBody e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ boolean i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j1(PrimaryPhoneVerifyOTPBody primaryPhoneVerifyOTPBody, boolean z, boolean z2, v1b<? super j1> v1bVar) {
            super(2, v1bVar);
            this.e = primaryPhoneVerifyOTPBody;
            this.f = z;
            this.i = z2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            j1 j1Var = nyz.this.new j1(this.e, this.f, this.i, v1bVar);
            j1Var.c = obj;
            return j1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<PrimaryPhoneVerifyOTPResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((j1) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r8 = defpackage.nyz.this
                xxz r8 = r8.a
                r7.c = r5
                r7.a = r0
                r7.b = r4
                com.sporty.android.core.model.primaryphone.PrimaryPhoneVerifyOTPBody r2 = r7.e
                boolean r4 = r7.f
                boolean r6 = r7.i
                java.lang.Object r8 = r8.e1(r2, r4, r6, r7)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.j1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$confirmAccountInfo$1", f = "PatronRepositoryImpl.kt", l = {406, 406}, m = "invokeSuspend", v = 2)
    public static final class k extends tje0 implements Function2<myh<? super UserCertInfo>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ UserCertInfo e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(UserCertInfo userCertInfo, v1b<? super k> v1bVar) {
            super(2, v1bVar);
            this.e = userCertInfo;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            k kVar = nyz.this.new k(this.e, v1bVar);
            kVar.c = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super UserCertInfo> myhVar, v1b<? super Unit> v1bVar) {
            return ((k) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                com.sporty.android.core.model.patron.UserCertInfo r2 = r6.e
                java.lang.Object r7 = r7.L0(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$getUserCpf$1", f = "PatronRepositoryImpl.kt", l = {356, 356}, m = "invokeSuspend", v = 2)
    public static final class k0 extends tje0 implements Function2<myh<? super BaseResponse<CpfData>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ nyz d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(v1b v1bVar, nyz nyzVar, String str) {
            super(2, v1bVar);
            this.d = nyzVar;
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            k0 k0Var = new k0(v1bVar, this.d, this.e);
            k0Var.c = obj;
            return k0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<CpfData>> myhVar, v1b<? super Unit> v1bVar) {
            return ((k0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = r6.d
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.k1(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.k0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$verifyOtpForResetSportyPIN$1", f = "PatronRepositoryImpl.kt", l = {210, 209}, m = "invokeSuspend", v = 2)
    public static final class k1 extends tje0 implements Function2<myh<? super BaseResponse<ResetSportyPINResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ boolean v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k1(String str, String str2, boolean z, boolean z2, v1b<? super k1> v1bVar) {
            super(2, v1bVar);
            this.e = str;
            this.f = str2;
            this.i = z;
            this.v = z2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            k1 k1Var = nyz.this.new k1(this.e, this.f, this.i, this.v, v1bVar);
            k1Var.c = obj;
            return k1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<ResetSportyPINResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((k1) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
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
                goto L4f
            L15:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                return r5
            L1b:
                myh r0 = r8.a
                defpackage.uj50.b(r9)
                goto L42
            L21:
                defpackage.uj50.b(r9)
                nyz r9 = defpackage.nyz.this
                xxz r9 = r9.a
                com.sporty.android.core.model.security.otp.SportyPinRequestBody r2 = new com.sporty.android.core.model.security.otp.SportyPinRequestBody
                java.lang.String r6 = r8.e
                java.lang.String r7 = r8.f
                r2.<init>(r6, r7)
                r8.c = r5
                r8.a = r0
                r8.b = r4
                boolean r4 = r8.i
                boolean r6 = r8.v
                java.lang.Object r9 = r9.M0(r2, r4, r6, r8)
                if (r9 != r1) goto L42
                goto L4e
            L42:
                r8.c = r5
                r8.a = r5
                r8.b = r3
                java.lang.Object r8 = r0.emit(r9, r8)
                if (r8 != r1) goto L4f
            L4e:
                return r1
            L4f:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.k1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$createRegisterBrOTPSession$1", f = "PatronRepositoryImpl.kt", l = {179, 178}, m = "invokeSuspend", v = 2)
    public static final class l extends tje0 implements Function2<myh<? super BaseResponse<OTPGeneralResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, String str2, String str3, v1b<? super l> v1bVar) {
            super(2, v1bVar);
            this.e = str;
            this.f = str2;
            this.i = str3;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            l lVar = nyz.this.new l(this.e, this.f, this.i, v1bVar);
            lVar.c = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<OTPGeneralResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((l) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (r0.emit(r14, r13) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r13.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r14)
                goto L51
            L15:
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r13)
                return r5
            L1b:
                myh r0 = r13.a
                defpackage.uj50.b(r14)
                goto L44
            L21:
                defpackage.uj50.b(r14)
                nyz r14 = defpackage.nyz.this
                xxz r14 = r14.a
                com.sporty.android.core.model.security.otp.RegisterBrSessionData r6 = new com.sporty.android.core.model.security.otp.RegisterBrSessionData
                r11 = 8
                r12 = 0
                java.lang.String r7 = r13.e
                java.lang.String r8 = r13.f
                java.lang.String r9 = r13.i
                r10 = 0
                r6.<init>(r7, r8, r9, r10, r11, r12)
                r13.c = r5
                r13.a = r0
                r13.b = r4
                java.lang.Object r14 = r14.w0(r6, r13)
                if (r14 != r1) goto L44
                goto L50
            L44:
                r13.c = r5
                r13.a = r5
                r13.b = r3
                java.lang.Object r13 = r0.emit(r14, r13)
                if (r13 != r1) goto L51
            L50:
                return r1
            L51:
                kotlin.Unit r13 = kotlin.Unit.a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$getUserPhones$1", f = "PatronRepositoryImpl.kt", l = {428}, m = "invokeSuspend", v = 2)
    public static final class l0 extends tje0 implements Function1<v1b<? super List<? extends UserPhone>>, Object> {
        public int a;

        public l0(v1b<? super l0> v1bVar) {
            super(1, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return nyz.this.new l0(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super List<? extends UserPhone>> v1bVar) {
            return ((l0) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                xxz xxzVar = nyz.this.a;
                this.a = 1;
                obj = xxzVar.z1(this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return n52.b((BaseResponse) obj);
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$verifyPersonalInfoByNIN$1", f = "PatronRepositoryImpl.kt", l = {624, 624}, m = "invokeSuspend", v = 2)
    public static final class l1 extends tje0 implements Function2<myh<? super BaseResponse<VerifyPersonalInfoResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l1(String str, String str2, v1b<? super l1> v1bVar) {
            super(2, v1bVar);
            this.e = str;
            this.f = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            l1 l1Var = nyz.this.new l1(this.e, this.f, v1bVar);
            l1Var.c = obj;
            return l1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<VerifyPersonalInfoResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((l1) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
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
                goto L4b
            L15:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r5
            L1b:
                myh r0 = r7.a
                defpackage.uj50.b(r8)
                goto L3e
            L21:
                defpackage.uj50.b(r8)
                nyz r8 = defpackage.nyz.this
                xxz r8 = r8.a
                com.sporty.android.core.model.patron.VerifyPersonalInfoBody r2 = new com.sporty.android.core.model.patron.VerifyPersonalInfoBody
                java.lang.String r6 = r7.f
                r2.<init>(r6)
                r7.c = r5
                r7.a = r0
                r7.b = r4
                java.lang.String r4 = r7.e
                java.lang.Object r8 = r8.o0(r4, r2, r7)
                if (r8 != r1) goto L3e
                goto L4a
            L3e:
                r7.c = r5
                r7.a = r5
                r7.b = r3
                java.lang.Object r7 = r0.emit(r8, r7)
                if (r7 != r1) goto L4b
            L4a:
                return r1
            L4b:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.l1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$createRegisterOTPSession$1", f = "PatronRepositoryImpl.kt", l = {167, 166}, m = "invokeSuspend", v = 2)
    public static final class m extends tje0 implements Function2<myh<? super BaseResponse<OTPGeneralResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, String str2, v1b<? super m> v1bVar) {
            super(2, v1bVar);
            this.e = str;
            this.f = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            m mVar = nyz.this.new m(this.e, this.f, v1bVar);
            mVar.c = obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<OTPGeneralResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((m) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r9 = defpackage.nyz.this
                xxz r9 = r9.a
                com.sporty.android.core.model.security.otp.PhoneOTPSessionData r2 = new com.sporty.android.core.model.security.otp.PhoneOTPSessionData
                java.lang.String r6 = r8.e
                java.lang.String r7 = r8.f
                r2.<init>(r6, r7)
                r8.c = r5
                r8.a = r0
                r8.b = r4
                java.lang.Object r9 = r9.m(r2, r8)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$login$1", f = "PatronRepositoryImpl.kt", l = {361, 361}, m = "invokeSuspend", v = 2)
    public static final class m0 extends tje0 implements Function2<myh<? super BaseResponse<LoginResponse>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(String str, String str2, v1b<? super m0> v1bVar) {
            super(2, v1bVar);
            this.e = str;
            this.f = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            m0 m0Var = nyz.this.new m0(this.e, this.f, v1bVar);
            m0Var.c = obj;
            return m0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<LoginResponse>> myhVar, v1b<? super Unit> v1bVar) {
            return ((m0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.String r4 = r6.f
                java.lang.Object r7 = r7.B(r2, r4, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.m0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$verifyPrimaryPhoneOtp$1", f = "PatronRepositoryImpl.kt", l = {342, 341}, m = "invokeSuspend", v = 2)
    public static final class m1 extends tje0 implements Function2<myh<? super BaseResponse<OTPGeneralResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ VerifyOtpRequest e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ boolean i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m1(VerifyOtpRequest verifyOtpRequest, boolean z, boolean z2, v1b<? super m1> v1bVar) {
            super(2, v1bVar);
            this.e = verifyOtpRequest;
            this.f = z;
            this.i = z2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            m1 m1Var = nyz.this.new m1(this.e, this.f, this.i, v1bVar);
            m1Var.c = obj;
            return m1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<OTPGeneralResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((m1) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r8 = defpackage.nyz.this
                xxz r8 = r8.a
                r7.c = r5
                r7.a = r0
                r7.b = r4
                com.sporty.android.core.model.patron.VerifyOtpRequest r2 = r7.e
                boolean r4 = r7.f
                boolean r6 = r7.i
                java.lang.Object r8 = r8.u0(r2, r4, r6, r7)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.m1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$deactivateSessionToken$1", f = "PatronRepositoryImpl.kt", l = {ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
    public static final class n extends tje0 implements Function2<myh<? super BaseResponse<OTPGeneralResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, String str2, v1b<? super n> v1bVar) {
            super(2, v1bVar);
            this.e = str;
            this.f = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            n nVar = nyz.this.new n(this.e, this.f, v1bVar);
            nVar.c = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<OTPGeneralResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((n) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.String r4 = r6.f
                java.lang.Object r7 = r7.N0(r2, r4, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$logoutAllDevices$1", f = "PatronRepositoryImpl.kt", l = {284, 284}, m = "invokeSuspend", v = 2)
    public static final class n0 extends tje0 implements Function2<myh<? super Unit>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public n0(v1b<? super n0> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            n0 n0Var = nyz.this.new n0(v1bVar);
            n0Var.c = obj;
            return n0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super Unit> myhVar, v1b<? super Unit> v1bVar) {
            return ((n0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
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
                goto L49
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.Z0(r6)
                if (r7 != r1) goto L35
                goto L48
            L35:
                com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
                defpackage.n52.c(r7)
                kotlin.Unit r7 = kotlin.Unit.a
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L49
            L48:
                return r1
            L49:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.n0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$verifyReactivate$1", f = "PatronRepositoryImpl.kt", l = {229, 229}, m = "invokeSuspend", v = 2)
    public static final class n1 extends tje0 implements Function2<myh<? super BaseResponse<ReactivateAccountResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ nyz d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n1(v1b v1bVar, nyz nyzVar, String str) {
            super(2, v1bVar);
            this.d = nyzVar;
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            n1 n1Var = new n1(v1bVar, this.d, this.e);
            n1Var.c = obj;
            return n1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<ReactivateAccountResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((n1) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = r6.d
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.c(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.n1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$feedback$1", f = "PatronRepositoryImpl.kt", l = {613, 613}, m = "invokeSuspend", v = 2)
    public static final class o extends tje0 implements Function2<myh<? super BaseResponse<Unit>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ FeedbackDescription e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(FeedbackDescription feedbackDescription, v1b<? super o> v1bVar) {
            super(2, v1bVar);
            this.e = feedbackDescription;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            o oVar = nyz.this.new o(this.e, v1bVar);
            oVar.c = obj;
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<Unit>> myhVar, v1b<? super Unit> v1bVar) {
            return ((o) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                com.sporty.android.core.model.patron.FeedbackDescription r2 = r6.e
                java.lang.Object r7 = r7.t(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$migratePhone$1", f = "PatronRepositoryImpl.kt", l = {318, 318}, m = "invokeSuspend", v = 2)
    public static final class o0 extends tje0 implements Function2<myh<? super BaseResponse<Unit>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ MigratePhoneBody e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(MigratePhoneBody migratePhoneBody, v1b<? super o0> v1bVar) {
            super(2, v1bVar);
            this.e = migratePhoneBody;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            o0 o0Var = nyz.this.new o0(this.e, v1bVar);
            o0Var.c = obj;
            return o0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<Unit>> myhVar, v1b<? super Unit> v1bVar) {
            return ((o0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                com.sporty.android.core.model.kyc.phonemigration.MigratePhoneBody r2 = r6.e
                java.lang.Object r7 = r7.m1(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.o0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$verifySubsidiaryOTPForPhoneMigration$1", f = "PatronRepositoryImpl.kt", l = {314, 314}, m = "invokeSuspend", v = 2)
    public static final class o1 extends tje0 implements Function2<myh<? super BaseResponse<OTPGeneralResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ VerifySubsidiaryOTPBody e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o1(VerifySubsidiaryOTPBody verifySubsidiaryOTPBody, v1b<? super o1> v1bVar) {
            super(2, v1bVar);
            this.e = verifySubsidiaryOTPBody;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            o1 o1Var = nyz.this.new o1(this.e, v1bVar);
            o1Var.c = obj;
            return o1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<OTPGeneralResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((o1) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                com.sporty.android.core.model.kyc.phonemigration.VerifySubsidiaryOTPBody r2 = r6.e
                java.lang.Object r7 = r7.z(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.o1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$fetchWithdrawPINStatus$1", f = "PatronRepositoryImpl.kt", l = {521, 521}, m = "invokeSuspend", v = 2)
    public static final class p extends tje0 implements Function2<myh<? super BaseResponse<WithdrawalPinStatusInfo>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public p(v1b<? super p> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            p pVar = nyz.this.new p(v1bVar);
            pVar.c = obj;
            return pVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<WithdrawalPinStatusInfo>> myhVar, v1b<? super Unit> v1bVar) {
            return ((p) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
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
                goto L42
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.b(r6)
                if (r7 != r1) goto L35
                goto L41
            L35:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L42
            L41:
                return r1
            L42:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$preCheckTelegramBindingStatus$1", f = "PatronRepositoryImpl.kt", l = {702, 701}, m = "invokeSuspend", v = 2)
    public static final class p0 extends tje0 implements Function2<myh<? super BaseResponse<TelegramBindingPreCheckResponse>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ TelegramBindingActionType e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(TelegramBindingActionType telegramBindingActionType, String str, v1b<? super p0> v1bVar) {
            super(2, v1bVar);
            this.e = telegramBindingActionType;
            this.f = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            p0 p0Var = nyz.this.new p0(this.e, this.f, v1bVar);
            p0Var.c = obj;
            return p0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<TelegramBindingPreCheckResponse>> myhVar, v1b<? super Unit> v1bVar) {
            return ((p0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
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
                goto L4f
            L15:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                return r5
            L1b:
                myh r0 = r8.a
                defpackage.uj50.b(r9)
                goto L42
            L21:
                defpackage.uj50.b(r9)
                nyz r9 = defpackage.nyz.this
                xxz r9 = r9.a
                com.sporty.android.core.model.account.telegram.TelegramBindingPreCheckBody r2 = new com.sporty.android.core.model.account.telegram.TelegramBindingPreCheckBody
                com.sporty.android.core.model.account.telegram.TelegramBindingActionType r6 = r8.e
                int r6 = r6.getValue()
                java.lang.String r7 = r8.f
                r2.<init>(r6, r7)
                r8.c = r5
                r8.a = r0
                r8.b = r4
                java.lang.Object r9 = r9.F0(r2, r8)
                if (r9 != r1) goto L42
                goto L4e
            L42:
                r8.c = r5
                r8.a = r5
                r8.b = r3
                java.lang.Object r8 = r0.emit(r9, r8)
                if (r8 != r1) goto L4f
            L4e:
                return r1
            L4f:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.p0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$getAllCountries$1", f = "PatronRepositoryImpl.kt", l = {734, 734}, m = "invokeSuspend", v = 2)
    public static final class q extends tje0 implements Function2<myh<? super BaseResponse<List<? extends Country>>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public q(v1b<? super q> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            q qVar = nyz.this.new q(v1bVar);
            qVar.c = obj;
            return qVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<List<? extends Country>>> myhVar, v1b<? super Unit> v1bVar) {
            return ((q) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
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
                goto L42
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.F(r6)
                if (r7 != r1) goto L35
                goto L41
            L35:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L42
            L41:
                return r1
            L42:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$reactivateSessionToken$1", f = "PatronRepositoryImpl.kt", l = {225, 225}, m = "invokeSuspend", v = 2)
    public static final class q0 extends tje0 implements Function2<myh<? super BaseResponse<OTPGeneralResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(String str, String str2, v1b<? super q0> v1bVar) {
            super(2, v1bVar);
            this.e = str;
            this.f = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            q0 q0Var = nyz.this.new q0(this.e, this.f, v1bVar);
            q0Var.c = obj;
            return q0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<OTPGeneralResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((q0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.String r4 = r6.f
                java.lang.Object r7 = r7.L1(r2, r4, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.q0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$getBetslipDefaultGift$1", f = "PatronRepositoryImpl.kt", l = {738, 738}, m = "invokeSuspend", v = 2)
    public static final class r extends tje0 implements Function2<myh<? super BaseResponse<DefaultGift>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public r(v1b<? super r> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            r rVar = nyz.this.new r(v1bVar);
            rVar.c = obj;
            return rVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<DefaultGift>> myhVar, v1b<? super Unit> v1bVar) {
            return ((r) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
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
                goto L42
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.R0(r6)
                if (r7 != r1) goto L35
                goto L41
            L35:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L42
            L41:
                return r1
            L42:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$registerComplete$1", f = "PatronRepositoryImpl.kt", l = {196, 196}, m = "invokeSuspend", v = 2)
    public static final class r0 extends tje0 implements Function2<myh<? super BaseResponse<OTPCompleteResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ RegisterCompleteBody e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(RegisterCompleteBody registerCompleteBody, v1b<? super r0> v1bVar) {
            super(2, v1bVar);
            this.e = registerCompleteBody;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            r0 r0Var = nyz.this.new r0(this.e, v1bVar);
            r0Var.c = obj;
            return r0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<OTPCompleteResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((r0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                com.sporty.android.core.model.security.otp.RegisterCompleteBody r2 = r6.e
                java.lang.Object r7 = r7.q(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.r0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$getBindNewPhoneOtpSession$1", f = "PatronRepositoryImpl.kt", l = {352, 352}, m = "invokeSuspend", v = 2)
    public static final class s extends tje0 implements Function2<myh<? super BaseResponse<OTPGeneralResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ BindNewPhoneOTPSessionData e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(BindNewPhoneOTPSessionData bindNewPhoneOTPSessionData, v1b<? super s> v1bVar) {
            super(2, v1bVar);
            this.e = bindNewPhoneOTPSessionData;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s sVar = nyz.this.new s(this.e, v1bVar);
            sVar.c = obj;
            return sVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<OTPGeneralResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((s) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                com.sporty.android.core.model.security.otp.BindNewPhoneOTPSessionData r2 = r6.e
                java.lang.Object r7 = r7.n(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$sportyPinSessionToken$1", f = "PatronRepositoryImpl.kt", l = {androidx.recyclerview.widget.r.d.DEFAULT_DRAG_ANIMATION_DURATION, androidx.recyclerview.widget.r.d.DEFAULT_DRAG_ANIMATION_DURATION}, m = "invokeSuspend", v = 2)
    public static final class s0 extends tje0 implements Function2<myh<? super BaseResponse<SportyPinSessionToken>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public s0(v1b<? super s0> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s0 s0Var = nyz.this.new s0(v1bVar);
            s0Var.c = obj;
            return s0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<SportyPinSessionToken>> myhVar, v1b<? super Unit> v1bVar) {
            return ((s0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
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
                goto L42
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.F1(r6)
                if (r7 != r1) goto L35
                goto L41
            L35:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L42
            L41:
                return r1
            L42:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.s0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$getGooglePlayAvailableData$1", f = "PatronRepositoryImpl.kt", l = {526, 526}, m = "invokeSuspend", v = 2)
    public static final class t extends tje0 implements Function2<myh<? super bi50<BaseResponse<GooglePlayAvailableData>>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public t(v1b<? super t> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            t tVar = nyz.this.new t(v1bVar);
            tVar.c = obj;
            return tVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super bi50<BaseResponse<GooglePlayAvailableData>>> myhVar, v1b<? super Unit> v1bVar) {
            return ((t) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
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
                goto L42
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.W0(r6)
                if (r7 != r1) goto L35
                goto L41
            L35:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L42
            L41:
                return r1
            L42:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.t.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$submitNIN$1", f = "PatronRepositoryImpl.kt", l = {418, 418}, m = "invokeSuspend", v = 2)
    public static final class t0 extends tje0 implements Function2<myh<? super Unit>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ SubmitNINBody e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(SubmitNINBody submitNINBody, v1b<? super t0> v1bVar) {
            super(2, v1bVar);
            this.e = submitNINBody;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            t0 t0Var = nyz.this.new t0(this.e, v1bVar);
            t0Var.c = obj;
            return t0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super Unit> myhVar, v1b<? super Unit> v1bVar) {
            return ((t0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
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
                goto L4b
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                com.sporty.android.core.model.nin.SubmitNINBody r2 = r6.e
                java.lang.Object r7 = r7.D0(r2, r6)
                if (r7 != r1) goto L37
                goto L4a
            L37:
                com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
                defpackage.n52.c(r7)
                kotlin.Unit r7 = kotlin.Unit.a
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L4b
            L4a:
                return r1
            L4b:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.t0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$getKYCReminder$1", f = "PatronRepositoryImpl.kt", l = {395, 395}, m = "invokeSuspend", v = 2)
    public static final class u extends tje0 implements Function2<myh<? super BaseResponse<KYCReminder>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public u(v1b<? super u> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            u uVar = nyz.this.new u(v1bVar);
            uVar.c = obj;
            return uVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<KYCReminder>> myhVar, v1b<? super Unit> v1bVar) {
            return ((u) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
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
                goto L42
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.C(r6)
                if (r7 != r1) goto L35
                goto L41
            L35:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L42
            L41:
                return r1
            L42:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.u.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$submitNINForGreyList$1", f = "PatronRepositoryImpl.kt", l = {280, 280}, m = "invokeSuspend", v = 2)
    public static final class u0 extends tje0 implements Function2<myh<? super BaseResponse<Unit>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String d;
        public final /* synthetic */ nyz e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(v1b v1bVar, nyz nyzVar, String str) {
            super(2, v1bVar);
            this.d = str;
            this.e = nyzVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            u0 u0Var = new u0(v1bVar, this.e, this.d);
            u0Var.c = obj;
            return u0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<Unit>> myhVar, v1b<? super Unit> v1bVar) {
            return ((u0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
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
                goto L4b
            L15:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r5
            L1b:
                myh r0 = r7.a
                defpackage.uj50.b(r8)
                goto L3e
            L21:
                defpackage.uj50.b(r8)
                com.sporty.android.core.model.nin.SubmitNINBody r8 = new com.sporty.android.core.model.nin.SubmitNINBody
                java.lang.String r2 = r7.d
                java.lang.String r6 = ""
                r8.<init>(r6, r6, r2, r4)
                nyz r2 = r7.e
                xxz r2 = r2.a
                r7.c = r5
                r7.a = r0
                r7.b = r4
                java.lang.Object r8 = r2.S(r8, r7)
                if (r8 != r1) goto L3e
                goto L4a
            L3e:
                r7.c = r5
                r7.a = r5
                r7.b = r3
                java.lang.Object r7 = r0.emit(r8, r7)
                if (r7 != r1) goto L4b
            L4a:
                return r1
            L4b:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.u0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$getKYCTiers$1", f = "PatronRepositoryImpl.kt", l = {719, 719}, m = "invokeSuspend", v = 2)
    public static final class v extends tje0 implements Function2<myh<? super BaseResponse<List<? extends KYCBannerItem>>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public v(v1b<? super v> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            v vVar = nyz.this.new v(v1bVar);
            vVar.c = obj;
            return vVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<List<? extends KYCBannerItem>>> myhVar, v1b<? super Unit> v1bVar) {
            return ((v) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
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
                goto L42
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.Y0(r6)
                if (r7 != r1) goto L35
                goto L41
            L35:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L42
            L41:
                return r1
            L42:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.v.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$unbindTelegramAccount$1", f = "PatronRepositoryImpl.kt", l = {712, 712}, m = "invokeSuspend", v = 2)
    public static final class v0 extends tje0 implements Function2<myh<? super BaseResponse<Unit>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public v0(v1b<? super v0> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            v0 v0Var = nyz.this.new v0(v1bVar);
            v0Var.c = obj;
            return v0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<Unit>> myhVar, v1b<? super Unit> v1bVar) {
            return ((v0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
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
                goto L42
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.M(r6)
                if (r7 != r1) goto L35
                goto L41
            L35:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L42
            L41:
                return r1
            L42:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.v0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$getMainOTPSessionForPhoneMigration$1", f = "PatronRepositoryImpl.kt", l = {295, 295}, m = "invokeSuspend", v = 2)
    public static final class w extends tje0 implements Function2<myh<? super BaseResponse<OTPGeneralResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ nyz d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(v1b v1bVar, nyz nyzVar, String str) {
            super(2, v1bVar);
            this.d = nyzVar;
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            w wVar = new w(v1bVar, this.d, this.e);
            wVar.c = obj;
            return wVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<OTPGeneralResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((w) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r8 = r7.d
                xxz r8 = r8.a
                com.sporty.android.core.model.kyc.phonemigration.PasswordVerifyToken r2 = new com.sporty.android.core.model.kyc.phonemigration.PasswordVerifyToken
                java.lang.String r6 = r7.e
                r2.<init>(r6)
                r7.c = r5
                r7.a = r0
                r7.b = r4
                java.lang.Object r8 = r8.K(r2, r7)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.w.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$updateAvatar$1", f = "PatronRepositoryImpl.kt", l = {537, 536}, m = "invokeSuspend", v = 2)
    public static final class w0 extends tje0 implements Function2<myh<? super BaseResponse<Void>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String i;
        public final /* synthetic */ Boolean v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(String str, String str2, String str3, Boolean bool, v1b<? super w0> v1bVar) {
            super(2, v1bVar);
            this.e = str;
            this.f = str2;
            this.i = str3;
            this.v = bool;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            w0 w0Var = nyz.this.new w0(this.e, this.f, this.i, this.v, v1bVar);
            w0Var.c = obj;
            return w0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<Void>> myhVar, v1b<? super Unit> v1bVar) {
            return ((w0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        
            if (r0.emit(r13, r11) == r1) goto L19;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = r12.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r12.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r13)
                goto L59
            L15:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r12)
                return r5
            L1b:
                myh r0 = r12.a
                defpackage.uj50.b(r13)
                r11 = r12
                goto L4c
            L22:
                defpackage.uj50.b(r13)
                nyz r13 = defpackage.nyz.this
                xxz r6 = r13.a
                java.lang.Boolean r13 = r12.v
                if (r13 == 0) goto L37
                boolean r13 = r13.booleanValue()
                java.lang.String r13 = java.lang.String.valueOf(r13)
                r10 = r13
                goto L38
            L37:
                r10 = r5
            L38:
                r12.c = r5
                r12.a = r0
                r12.b = r4
                java.lang.String r7 = r12.e
                java.lang.String r8 = r12.f
                java.lang.String r9 = r12.i
                r11 = r12
                java.lang.Object r13 = r6.I1(r7, r8, r9, r10, r11)
                if (r13 != r1) goto L4c
                goto L58
            L4c:
                r11.c = r5
                r11.a = r5
                r11.b = r3
                java.lang.Object r12 = r0.emit(r13, r11)
                if (r12 != r1) goto L59
            L58:
                return r1
            L59:
                kotlin.Unit r12 = kotlin.Unit.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.w0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$getNINInfo$1", f = "PatronRepositoryImpl.kt", l = {414, 414}, m = "invokeSuspend", v = 2)
    public static final class x extends tje0 implements Function2<myh<? super NINInfoResponse>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public x(v1b<? super x> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            x xVar = nyz.this.new x(v1bVar);
            xVar.c = obj;
            return xVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super NINInfoResponse> myhVar, v1b<? super Unit> v1bVar) {
            return ((x) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.U(r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.x.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$updateBetslipDefaultGift$1", f = "PatronRepositoryImpl.kt", l = {742, 742}, m = "invokeSuspend", v = 2)
    public static final class x0 extends tje0 implements Function2<myh<? super BaseResponse<Unit>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ DefaultGift e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x0(DefaultGift defaultGift, v1b<? super x0> v1bVar) {
            super(2, v1bVar);
            this.e = defaultGift;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            x0 x0Var = nyz.this.new x0(this.e, v1bVar);
            x0Var.c = obj;
            return x0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<Unit>> myhVar, v1b<? super Unit> v1bVar) {
            return ((x0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                com.sporty.android.core.model.patron.DefaultGift r2 = r6.e
                java.lang.Object r7 = r7.u(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.x0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$getNameConfirmationStatus$1", f = "PatronRepositoryImpl.kt", l = {369, 371, 372, 375}, m = "invokeSuspend", v = 2)
    public static final class y extends tje0 implements Function1<v1b<? super NameConfirmationStatus>, Object> {
        public NameConfirmationStatus a;
        public nyz b;
        public int c;

        public y(v1b<? super y> v1bVar) {
            super(1, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return nyz.this.new y(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super NameConfirmationStatus> v1bVar) {
            return ((y) create(v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0075 A[Catch: all -> 0x0078, TryCatch #1 {all -> 0x0078, blocks: (B:43:0x008c, B:46:0x0096, B:50:0x009d, B:54:0x00a3, B:33:0x006f, B:35:0x0075, B:39:0x007e, B:30:0x005c), top: B:67:0x005c }] */
        /* JADX WARN: Code duplicated, block: B:38:0x007d  */
        /* JADX WARN: Code duplicated, block: B:41:0x008a  */
        /* JADX WARN: Code duplicated, block: B:42:0x008b  */
        /* JADX WARN: Code duplicated, block: B:46:0x0096 A[Catch: all -> 0x0078, TRY_ENTER, TryCatch #1 {all -> 0x0078, blocks: (B:43:0x008c, B:46:0x0096, B:50:0x009d, B:54:0x00a3, B:33:0x006f, B:35:0x0075, B:39:0x007e, B:30:0x005c), top: B:67:0x005c }] */
        /* JADX WARN: Code duplicated, block: B:48:0x009a  */
        /* JADX WARN: Code duplicated, block: B:50:0x009d A[Catch: all -> 0x0078, TryCatch #1 {all -> 0x0078, blocks: (B:43:0x008c, B:46:0x0096, B:50:0x009d, B:54:0x00a3, B:33:0x006f, B:35:0x0075, B:39:0x007e, B:30:0x005c), top: B:67:0x005c }] */
        /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:63:0x00c7  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            NameConfirmationStatus nameConfirmationStatus;
            mgb0 mgb0Var;
            DocumentAudit documentAudit;
            int i;
            nyz nyzVar;
            Throwable th;
            NameConfirmationStatus nameConfirmationStatus2;
            mgb0 mgb0Var2;
            KycHintExtra kycHintExtra;
            DocumentAudit documentAudit2;
            String str;
            String str2;
            String str3;
            Object bVar;
            Throwable thA;
            y5b y5bVar = y5b.a;
            int i2 = this.c;
            nyz nyzVar2 = nyz.this;
            try {
                if (i2 == 0) {
                    uj50.b(obj);
                    xxz xxzVar = nyzVar2.a;
                    this.c = 1;
                    obj = xxzVar.O0(this);
                    if (obj != y5bVar) {
                    }
                    return y5bVar;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        nyzVar2 = this.b;
                        NameConfirmationStatus nameConfirmationStatus3 = this.a;
                        try {
                            uj50.b(obj);
                            nameConfirmationStatus = nameConfirmationStatus3;
                            mgb0Var = nyzVar2.d;
                            documentAudit = nameConfirmationStatus.documentAudit;
                            if (documentAudit != null) {
                                i = documentAudit.status;
                            } else {
                                i = 0;
                            }
                            this.a = nameConfirmationStatus;
                            this.b = nyzVar2;
                            this.c = 3;
                            if (mgb0Var.setDocumentAuditStatus(i, this) == y5bVar) {
                                nyzVar = nyzVar2;
                                mgb0Var2 = nyzVar.d;
                                documentAudit2 = nameConfirmationStatus.documentAudit;
                                str = "";
                                if (documentAudit2 != null) {
                                    str2 = "";
                                } else {
                                    str2 = "";
                                }
                                if (documentAudit2 != null) {
                                    str = str3;
                                }
                                kycHintExtra = new KycHintExtra(str2, str);
                                this.a = nameConfirmationStatus;
                                this.b = null;
                                this.c = 4;
                                if (mgb0Var2.setKycHintExtra(kycHintExtra, this) != y5bVar) {
                                    nameConfirmationStatus2 = nameConfirmationStatus;
                                    bVar = Unit.a;
                                    zi50.a aVar = zi50.b;
                                    thA = zi50.a(bVar);
                                    if (thA != null) {
                                        itf0.a aVar2 = itf0.a;
                                        aVar2.q(MyLog.TAG_ACCOUNT);
                                        aVar2.f(thA, "set nameConfirmationStatus into accountHelper fail", new Object[0]);
                                    }
                                    return nameConfirmationStatus2;
                                }
                            }
                            return y5bVar;
                        } catch (Throwable th2) {
                            th = th2;
                            nameConfirmationStatus2 = nameConfirmationStatus3;
                            zi50.a aVar3 = zi50.b;
                            bVar = new zi50.b(th);
                        }
                    } else {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                ib5.a("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            nameConfirmationStatus2 = this.a;
                            try {
                                uj50.b(obj);
                                bVar = Unit.a;
                                zi50.a aVar4 = zi50.b;
                            } catch (Throwable th3) {
                                th = th3;
                                zi50.a aVar5 = zi50.b;
                                bVar = new zi50.b(th);
                            }
                            thA = zi50.a(bVar);
                            if (thA != null) {
                                itf0.a aVar6 = itf0.a;
                                aVar6.q(MyLog.TAG_ACCOUNT);
                                aVar6.f(thA, "set nameConfirmationStatus into accountHelper fail", new Object[0]);
                            }
                            return nameConfirmationStatus2;
                        }
                        nyzVar = this.b;
                        NameConfirmationStatus nameConfirmationStatus4 = this.a;
                        try {
                            uj50.b(obj);
                            nameConfirmationStatus = nameConfirmationStatus4;
                            mgb0Var2 = nyzVar.d;
                            documentAudit2 = nameConfirmationStatus.documentAudit;
                            str = "";
                            if (documentAudit2 != null || (str2 = documentAudit2.rejectTitle) == null) {
                                str2 = "";
                            }
                            if (documentAudit2 != null && (str3 = documentAudit2.rejectReason) != null) {
                                str = str3;
                            }
                            kycHintExtra = new KycHintExtra(str2, str);
                            this.a = nameConfirmationStatus;
                            this.b = null;
                            this.c = 4;
                            if (mgb0Var2.setKycHintExtra(kycHintExtra, this) != y5bVar) {
                                nameConfirmationStatus2 = nameConfirmationStatus;
                                bVar = Unit.a;
                                zi50.a aVar7 = zi50.b;
                                thA = zi50.a(bVar);
                                if (thA != null) {
                                    itf0.a aVar8 = itf0.a;
                                    aVar8.q(MyLog.TAG_ACCOUNT);
                                    aVar8.f(thA, "set nameConfirmationStatus into accountHelper fail", new Object[0]);
                                }
                                return nameConfirmationStatus2;
                            }
                            return y5bVar;
                        } catch (Throwable th4) {
                            th = th4;
                            nameConfirmationStatus2 = nameConfirmationStatus4;
                            zi50.a aVar9 = zi50.b;
                            bVar = new zi50.b(th);
                        }
                    }
                    zi50.a aVar10 = zi50.b;
                    bVar = new zi50.b(th);
                    thA = zi50.a(bVar);
                    if (thA != null) {
                        itf0.a aVar11 = itf0.a;
                        aVar11.q(MyLog.TAG_ACCOUNT);
                        aVar11.f(thA, "set nameConfirmationStatus into accountHelper fail", new Object[0]);
                    }
                    return nameConfirmationStatus2;
                }
                uj50.b(obj);
                zi50.a aVar12 = zi50.b;
                mgb0 mgb0Var3 = nyzVar2.d;
                int i3 = nameConfirmationStatus.status;
                this.a = nameConfirmationStatus;
                this.b = nyzVar2;
                this.c = 2;
                if (mgb0Var3.setUserCertStatus(i3, this) != y5bVar) {
                    mgb0Var = nyzVar2.d;
                    documentAudit = nameConfirmationStatus.documentAudit;
                    if (documentAudit != null) {
                        i = documentAudit.status;
                    } else {
                        i = 0;
                    }
                    this.a = nameConfirmationStatus;
                    this.b = nyzVar2;
                    this.c = 3;
                    if (mgb0Var.setDocumentAuditStatus(i, this) == y5bVar) {
                        nyzVar = nyzVar2;
                        mgb0Var2 = nyzVar.d;
                        documentAudit2 = nameConfirmationStatus.documentAudit;
                        str = "";
                        if (documentAudit2 != null) {
                            str2 = "";
                        } else {
                            str2 = "";
                        }
                        if (documentAudit2 != null) {
                            str = str3;
                        }
                        kycHintExtra = new KycHintExtra(str2, str);
                        this.a = nameConfirmationStatus;
                        this.b = null;
                        this.c = 4;
                        if (mgb0Var2.setKycHintExtra(kycHintExtra, this) != y5bVar) {
                            nameConfirmationStatus2 = nameConfirmationStatus;
                            bVar = Unit.a;
                            zi50.a aVar13 = zi50.b;
                            thA = zi50.a(bVar);
                            if (thA != null) {
                                itf0.a aVar14 = itf0.a;
                                aVar14.q(MyLog.TAG_ACCOUNT);
                                aVar14.f(thA, "set nameConfirmationStatus into accountHelper fail", new Object[0]);
                            }
                            return nameConfirmationStatus2;
                        }
                    }
                }
                return y5bVar;
            } catch (Throwable th5) {
                NameConfirmationStatus nameConfirmationStatus5 = nameConfirmationStatus;
                th = th5;
                nameConfirmationStatus2 = nameConfirmationStatus5;
                zi50.a aVar15 = zi50.b;
                bVar = new zi50.b(th);
            }
            nameConfirmationStatus = (NameConfirmationStatus) n52.b((BaseResponse) obj);
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$updateName$1", f = "PatronRepositoryImpl.kt", l = {233, 233}, m = "invokeSuspend", v = 2)
    public static final class y0 extends tje0 implements Function2<myh<? super BaseResponse<OTPUpdateNameResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ OTPVerificationRequest e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y0(OTPVerificationRequest oTPVerificationRequest, v1b<? super y0> v1bVar) {
            super(2, v1bVar);
            this.e = oTPVerificationRequest;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            y0 y0Var = nyz.this.new y0(this.e, v1bVar);
            y0Var.c = obj;
            return y0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<OTPUpdateNameResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((y0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                com.sporty.android.core.model.security.otp.OTPVerificationRequest r2 = r6.e
                java.lang.Object r7 = r7.k(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: nyz.y0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$getNickName$1", f = "PatronRepositoryImpl.kt", l = {512, 512}, m = "invokeSuspend", v = 2)
    public static final class z extends tje0 implements Function2<myh<? super BaseResponse<String>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public z(v1b<? super z> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            z zVar = nyz.this.new z(v1bVar);
            zVar.c = obj;
            return zVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<String>> myhVar, v1b<? super Unit> v1bVar) {
            return ((z) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
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
                goto L42
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
                nyz r7 = defpackage.nyz.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.h(r6)
                if (r7 != r1) goto L35
                goto L41
            L35:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L42
            L41:
                return r1
            L42:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.z.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$updateOddsFormat$1", f = "PatronRepositoryImpl.kt", l = {274, 274}, m = "invokeSuspend", v = 2)
    public static final class z0 extends tje0 implements Function2<myh<? super BaseResponse<Unit>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ ljy e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z0(ljy ljyVar, v1b<? super z0> v1bVar) {
            super(2, v1bVar);
            this.e = ljyVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            z0 z0Var = nyz.this.new z0(this.e, v1bVar);
            z0Var.c = obj;
            return z0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<Unit>> myhVar, v1b<? super Unit> v1bVar) {
            return ((z0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
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
                goto L4d
            L15:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r5
            L1b:
                myh r0 = r7.a
                defpackage.uj50.b(r8)
                goto L40
            L21:
                defpackage.uj50.b(r8)
                nyz r8 = defpackage.nyz.this
                xxz r8 = r8.a
                com.sporty.android.core.model.oddsformat.OddsFormatRequest r2 = new com.sporty.android.core.model.oddsformat.OddsFormatRequest
                ljy r6 = r7.e
                java.lang.String r6 = r6.name()
                r2.<init>(r6)
                r7.c = r5
                r7.a = r0
                r7.b = r4
                java.lang.Object r8 = r8.y0(r2, r7)
                if (r8 != r1) goto L40
                goto L4c
            L40:
                r7.c = r5
                r7.a = r5
                r7.b = r3
                java.lang.Object r7 = r0.emit(r8, r7)
                if (r7 != r1) goto L4d
            L4c:
                return r1
            L4d:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: nyz.z0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public nyz(xxz xxzVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, uqm uqmVar, psm psmVar, mgb0 mgb0Var, iyz iyzVar) {
        xxzVar.getClass();
        uqmVar.getClass();
        psmVar.getClass();
        mgb0Var.getClass();
        iyzVar.getClass();
        this.a = xxzVar;
        this.b = k5bVar;
        this.c = psmVar;
        this.d = mgb0Var;
        this.e = iyzVar;
        lk50.b bVar = lk50.b.a;
        this.f = xwd0.a(bVar);
        this.i = xwd0.a(bVar);
        this.v = xwd0.a(bVar);
        uqmVar.addLogoutEventListener(this);
        xwd0.a(bVar);
    }

    public static BindNewPhoneApiResult I0(Integer num, String str) {
        if (num.intValue() == 10000) {
            return BindNewPhoneApiResult.Success.INSTANCE;
        }
        if (num.intValue() == 11000) {
            return new BindNewPhoneApiResult.InvalidPhoneNumber(str);
        }
        if (num.intValue() == 11600) {
            return new BindNewPhoneApiResult.PhoneAlreadyRegisteredToAnotherAcc(str);
        }
        if (num.intValue() == 11604) {
            return new BindNewPhoneApiResult.PhoneAlreadyBoundedToCurrentAcc(str);
        }
        if (num.intValue() == 11616) {
            return new BindNewPhoneApiResult.MultiPhoneDisabled(str);
        }
        if (num.intValue() == 11617) {
            return new BindNewPhoneApiResult.ReachedPhoneNumberLimit(str);
        }
        if (num.intValue() == 11618) {
            return new BindNewPhoneApiResult.NameConfirmNotVerified(str);
        }
        if (num.intValue() == 11619) {
            return new BindNewPhoneApiResult.NameUnverifiable(str);
        }
        if (num.intValue() == 11620) {
            return new BindNewPhoneApiResult.NameMismatched(str);
        }
        return num.intValue() == 12203 ? new BindNewPhoneApiResult.HubtelApiFail(str) : new BindNewPhoneApiResult.UnknownError(str);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<Unit>> A(ljy ljyVar) {
        ljyVar.getClass();
        return ozh.c(new or60(new z0(ljyVar, null)), this.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyz
    public final Object A0(String str, String str2, x1b x1bVar) {
        yyz yyzVar;
        UiText uiText;
        Object bVar;
        UiText text;
        if (x1bVar instanceof yyz) {
            yyzVar = (yyz) x1bVar;
            int i2 = yyzVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yyzVar.d = i2 - Integer.MIN_VALUE;
            } else {
                yyzVar = new yyz(this, x1bVar);
            }
        } else {
            yyzVar = new yyz(this, x1bVar);
        }
        Object obj = yyzVar.b;
        y5b y5bVar = y5b.a;
        int i3 = yyzVar.d;
        if (i3 == 0) {
            uj50.b(obj);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                xxz xxzVar = this.a;
                yyzVar.a = resourceUiText;
                yyzVar.d = 1;
                Object objP0 = xxzVar.p0(str, str2, yyzVar);
                if (objP0 == y5bVar) {
                    return y5bVar;
                }
                obj = objP0;
                uiText = resourceUiText;
            } catch (Throwable th) {
                th = th;
                uiText = resourceUiText;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uiText = yyzVar.a;
            try {
                uj50.b(obj);
            } catch (Throwable th2) {
                th = th2;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        bVar = (OTPCompleteResult) n52.b((BaseResponse) obj);
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

    @Override // defpackage.lyz
    public final lyh<BaseResponse<OTPGeneralResult>> B(String str, String str2) {
        str.getClass();
        str2.getClass();
        return ozh.c(new or60(new m(str2, str, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<WithdrawalPinStatusInfo>> B0() {
        return ozh.c(new or60(new p(null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<Unit>> C() {
        return ozh.c(new or60(new v0(null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh C0(Boolean bool, String str, String str2, String str3) {
        return ozh.c(new or60(new w0(str, str2, str3, bool, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<ResetSportyPINResult>> D(String str, String str2, boolean z2, boolean z3) {
        str.getClass();
        str2.getClass();
        return ozh.c(new or60(new k1(str, str2, z2, z3, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<KYCReminder>> D0() {
        return ozh.c(new or60(new u(null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<lk50<GetTwoFAHintStatusResponse>> E() {
        return ozh.c(bm50.b(new or60(new i0(null)), vch0.b), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<PrimaryPhoneConfig> E0() {
        return ozh.c(new or60(new b0(null)), this.b);
    }

    @Override // defpackage.lyz
    public final or60 F(String str) {
        str.getClass();
        return new or60(new myz(null, this, str));
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<TelegramBotInfo>> F0() {
        return ozh.c(new or60(new h0(null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<OTPGeneralResult>> G0(VerifySubsidiaryOTPBody verifySubsidiaryOTPBody) {
        return ozh.c(new or60(new o1(verifySubsidiaryOTPBody, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<Unit>> H(DefaultGift defaultGift) {
        return ozh.c(new or60(new x0(defaultGift, null)), this.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyz
    public final Object H0(x1b x1bVar) {
        tyz tyzVar;
        Throwable th;
        UiText uiText;
        Object bVar;
        UiText text;
        if (x1bVar instanceof tyz) {
            tyzVar = (tyz) x1bVar;
            int i2 = tyzVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tyzVar.d = i2 - Integer.MIN_VALUE;
            } else {
                tyzVar = new tyz(this, x1bVar);
            }
        } else {
            tyzVar = new tyz(this, x1bVar);
        }
        Object obj = tyzVar.b;
        y5b y5bVar = y5b.a;
        int i3 = tyzVar.d;
        if (i3 == 0) {
            uj50.b(obj);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                xxz xxzVar = this.a;
                tyzVar.a = resourceUiText;
                tyzVar.d = 1;
                Object objV0 = xxzVar.v0(tyzVar);
                if (objV0 == y5bVar) {
                    return y5bVar;
                }
                obj = objV0;
                uiText = resourceUiText;
            } catch (Throwable th2) {
                th = th2;
                uiText = resourceUiText;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uiText = tyzVar.a;
            try {
                uj50.b(obj);
            } catch (Throwable th3) {
                th = th3;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        bVar = (Boolean) n52.b((BaseResponse) obj);
        bVar.getClass();
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

    @Override // defpackage.lyz
    public final lyh<BaseResponse<Void>> I() {
        return ozh.c(new or60(new g(null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<OTPGeneralResult>> J() {
        return ozh.c(new or60(new g0(null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<VerifyIdentityResult>> K(VerifyIdentityBody verifyIdentityBody) {
        return ozh.c(new or60(new e1(verifyIdentityBody, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh L(String str) {
        return ozh.c(new or60(new bzz(null, this, str)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<Unit>> M(FeedbackDescription feedbackDescription) {
        return ozh.c(new or60(new o(feedbackDescription, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<UpdatePrimaryPhoneNumberResult>> N(UpdatePrimaryPhoneNumberBody updatePrimaryPhoneNumberBody) {
        return ozh.c(new or60(new a1(updatePrimaryPhoneNumberBody, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<DefaultGift>> O() {
        return ozh.c(new or60(new r(null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<OTPGeneralResult>> P(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return ozh.c(new or60(new l(str2, str, str3, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<VerifyPersonalInfoResult>> Q(String str, String str2) {
        str.getClass();
        str2.getClass();
        return ozh.c(new or60(new l1(str, str2, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<Unit> R(SubmitNINBody submitNINBody) {
        return ozh.c(new or60(new t0(submitNINBody, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<GetReviewedPrimaryPhoneResult>> S() {
        return ozh.c(new or60(new d0(null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<NINConfigResponse> T() {
        return ozh.c(new or60(new h(null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<String> U(PrimaryPhoneBindOTPSessionForNewPhoneBody primaryPhoneBindOTPSessionForNewPhoneBody) {
        return ozh.c(new or60(new c(primaryPhoneBindOTPSessionForNewPhoneBody, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<VerifyNameMatchResult>> V(String str) {
        str.getClass();
        return ozh.c(new or60(new g1(null, this, str)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<OTPUpdateNameResult>> W(OTPVerificationRequest oTPVerificationRequest) {
        return ozh.c(new or60(new y0(oTPVerificationRequest, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<Unit> X() {
        return ozh.c(new or60(new n0(null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<PrimaryPhoneVerifyOTPResult>> Y(PrimaryPhoneVerifyOTPBody primaryPhoneVerifyOTPBody) {
        return ozh.c(new or60(new i1(primaryPhoneVerifyOTPBody, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<SportyPinSessionToken>> Z() {
        return ozh.c(new or60(new s0(null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<lk50<AccountInfo>> a(pu0 pu0Var) {
        pu0Var.getClass();
        return this.e.a(pu0Var);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<OTPGeneralResult>> a0(String str) {
        str.getClass();
        return ozh.c(new or60(new w(null, this, str)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<List<KYCBannerItem>>> b() {
        return ozh.c(new or60(new v(null)), this.b);
    }

    @Override // defpackage.lyz
    public final Object b0(TwoFAIndicatorPage twoFAIndicatorPage, x1b x1bVar) {
        return ej5.d(this.b, new czz(this, twoFAIndicatorPage, null), x1bVar);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<PersonalInfo>> c(String str) {
        str.getClass();
        return ozh.c(new or60(new a0(null, this, str)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<OTPGeneralResult>> c0(VerifyMainOTPBody verifyMainOTPBody, boolean z2) {
        return ozh.c(new or60(new f1(verifyMainOTPBody, z2, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<SelfExclusionResponse>> d() {
        return ozh.c(new or60(new e0(null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<UserCertInfo>> d0() {
        return ozh.c(new or60(new j0(null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<PrimaryPhoneVerifyOTPResult>> e(PrimaryPhoneVerifyOTPBody primaryPhoneVerifyOTPBody, boolean z2, boolean z3) {
        return ozh.c(new or60(new j1(primaryPhoneVerifyOTPBody, z2, z3, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<String> e0() {
        return ozh.c(new or60(new d(null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<OTPGeneralResult>> f(BindNewPhoneOTPSessionData bindNewPhoneOTPSessionData) {
        return ozh.c(new or60(new s(bindNewPhoneOTPSessionData, null)), this.b);
    }

    @Override // defpackage.lyz
    public final Object f0(String str, String str2, fk fkVar) {
        return ej5.d(this.b, new ezz(this, str, str2, null), fkVar);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<OTPGeneralResult>> g() {
        return ozh.c(new or60(new c0(null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<SelfExclusionResponse>> g0(SelfExclusionRequest selfExclusionRequest) {
        return ozh.c(new or60(new a(selfExclusionRequest, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<String>> getNickName() {
        return ozh.c(new or60(new z(null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<LoginResponse>> h(String str, String str2) {
        str.getClass();
        str2.getClass();
        return ozh.c(new or60(new m0(str, str2, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<UpdateNicknameResponse>> h0(String str) {
        str.getClass();
        return ozh.c(new or60(new c1(null, this, str)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<OTPCompleteResult>> i(RegisterCompleteBody registerCompleteBody) {
        return ozh.c(new or60(new r0(registerCompleteBody, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<lk50<WithdrawalPinStatusInfo>> i0(pu0 pu0Var) {
        pu0Var.getClass();
        return ozh.c(su0.a(this.i, pu0Var, new f0(null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<CpfData>> j(String str) {
        return ozh.c(new or60(new k0(null, this, str)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<lk50<NameConfirmationStatus>> j0(pu0 pu0Var) {
        pu0Var.getClass();
        return ozh.c(su0.a(this.f, pu0Var, new y(null)), this.b);
    }

    @Override // defpackage.lyz
    public final Object k(String str, String str2, String str3, tje0 tje0Var) {
        return ej5.d(this.b, new oyz(this, str, str2, str3, null), tje0Var);
    }

    @Override // defpackage.lyz
    public final Object k0(String str, String str2, String str3, String str4, String str5, fk fkVar) {
        return ej5.d(this.b, new qyz(str, this, str2, str3, str4, str5, null), fkVar);
    }

    @Override // defpackage.lyz
    public final lyh<NINInfoResponse> l() {
        return ozh.c(new or60(new x(null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<Unit>> l0(String str) {
        str.getClass();
        return ozh.c(new or60(new u0(null, this, str)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<Void>> m(String str) {
        return ozh.c(new or60(new d1(null, this, str)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<TelegramBindingPreCheckResponse>> m0(TelegramBindingActionType telegramBindingActionType, String str) {
        telegramBindingActionType.getClass();
        return ozh.c(new or60(new p0(telegramBindingActionType, str, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<SelfExclusionResponse>> n0(TimeSelfExclusionRequest timeSelfExclusionRequest) {
        return ozh.c(new or60(new b(timeSelfExclusionRequest, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<Unit>> o(MigratePhoneBody migratePhoneBody) {
        migratePhoneBody.getClass();
        return ozh.c(new or60(new o0(migratePhoneBody, null)), this.b);
    }

    @Override // defpackage.fjt
    public final void p() {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_ACCOUNT);
        aVar.g("PatronRepository: clearUserCachedData()", new Object[0]);
        lk50.b bVar = lk50.b.a;
        this.f.setValue(bVar);
        this.i.setValue(bVar);
        this.v.setValue(bVar);
        this.e.b();
    }

    @Override // defpackage.lyz
    public final Object p0(upj0 upj0Var) {
        return this.a.X("TRANSFER_ENABLE", upj0Var);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<Unit>> q(BindTelegramBody bindTelegramBody) {
        return ozh.c(new or60(new e(bindTelegramBody, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<OTPGeneralResult>> q0(VerifyOtpRequest verifyOtpRequest, boolean z2, boolean z3) {
        return ozh.c(new or60(new m1(verifyOtpRequest, z2, z3, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<NicknameAvailabilityResponse>> r(String str) {
        str.getClass();
        return ozh.c(new or60(new j(null, this, str)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<ReactivateAccountResult>> r0(String str) {
        return ozh.c(new or60(new n1(null, this, str)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<Unit>> s(String str) {
        return ozh.c(new or60(new f(null, this, str)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<PrimaryPhoneVerifyNameResult>> s0(PrimaryPhoneVerifyNameBody primaryPhoneVerifyNameBody) {
        return ozh.c(new or60(new h1(primaryPhoneVerifyNameBody, null)), this.b);
    }

    @Override // defpackage.lyz
    public final Object t(String str, String str2, x1b x1bVar) {
        return ej5.d(this.b, new azz(this, str, str2, null), x1bVar);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<Void>> t0(String str) {
        return ozh.c(new or60(new b1(null, this, str)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<OTPGeneralResult>> u(String str, String str2) {
        return ozh.c(new or60(new q0(str, str2, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh u0(UserInfoProperty userInfoProperty, String str) {
        return ozh.c(new or60(new uyz(this, userInfoProperty, str, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<CheckIsTrustedDeviceResponse>> v(j6c j6cVar) {
        return ozh.c(new or60(new i(j6cVar, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<UserCertInfo> v0(UserCertInfo userCertInfo) {
        userCertInfo.getClass();
        return ozh.c(new or60(new k(userCertInfo, null)), this.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyz
    public final Object w(String str, String str2, String str3, String str4, x1b x1bVar) {
        wyz wyzVar;
        UiText uiText;
        Object bVar;
        UiText text;
        if (x1bVar instanceof wyz) {
            wyzVar = (wyz) x1bVar;
            int i2 = wyzVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wyzVar.d = i2 - Integer.MIN_VALUE;
            } else {
                wyzVar = new wyz(this, x1bVar);
            }
        } else {
            wyzVar = new wyz(this, x1bVar);
        }
        Object obj = wyzVar.b;
        y5b y5bVar = y5b.a;
        int i3 = wyzVar.d;
        if (i3 == 0) {
            uj50.b(obj);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                xxz xxzVar = this.a;
                RegisterCompleteBody registerCompleteBody = new RegisterCompleteBody(str3, str4, str, str2);
                wyzVar.a = resourceUiText;
                wyzVar.d = 1;
                Object objQ = xxzVar.q(registerCompleteBody, wyzVar);
                if (objQ == y5bVar) {
                    return y5bVar;
                }
                obj = objQ;
                uiText = resourceUiText;
            } catch (Throwable th) {
                th = th;
                uiText = resourceUiText;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uiText = wyzVar.a;
            try {
                uj50.b(obj);
            } catch (Throwable th2) {
                th = th2;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        bVar = (OTPCompleteResult) n52.b((BaseResponse) obj);
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

    @Override // defpackage.lyz
    public final lyh<lk50<List<Country>>> w0() {
        return ozh.c(bm50.b(new or60(new q(null)), vch0.b), this.b);
    }

    @Override // defpackage.lyz
    public final or60 x(RegisterBrVerifyCode registerBrVerifyCode) {
        return new or60(new dzz(this, registerBrVerifyCode, null));
    }

    @Override // defpackage.lyz
    public final lyh<BaseResponse<OTPGeneralResult>> x0(String str, String str2) {
        return ozh.c(new or60(new n(str, str2, null)), this.b);
    }

    @Override // defpackage.lyz
    public final lyh<lk50<List<UserPhone>>> y(pu0 pu0Var) {
        pu0Var.getClass();
        return ozh.c(su0.a(this.v, pu0Var, new l0(null)), this.b);
    }

    @Override // defpackage.lyz
    public final Object y0(h7n h7nVar) {
        pfd pfdVar = fse.a;
        return ej5.d(odd.b, new xyz(this, null), h7nVar);
    }

    @Override // defpackage.lyz
    public final lyh<bi50<BaseResponse<GooglePlayAvailableData>>> z() {
        return ozh.c(new or60(new t(null)), this.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyz
    public final Object z0(String str, String str2, x1b x1bVar) {
        ryz ryzVar;
        UiText uiText;
        Object bVar;
        UiText text;
        if (x1bVar instanceof ryz) {
            ryzVar = (ryz) x1bVar;
            int i2 = ryzVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ryzVar.d = i2 - Integer.MIN_VALUE;
            } else {
                ryzVar = new ryz(this, x1bVar);
            }
        } else {
            ryzVar = new ryz(this, x1bVar);
        }
        Object obj = ryzVar.b;
        y5b y5bVar = y5b.a;
        int i3 = ryzVar.d;
        if (i3 == 0) {
            uj50.b(obj);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                k5b k5bVar = this.b;
                syz syzVar = new syz(this, str, str2, null);
                ryzVar.a = resourceUiText;
                ryzVar.d = 1;
                if (ej5.d(k5bVar, syzVar, ryzVar) == y5bVar) {
                    return y5bVar;
                }
                uiText = resourceUiText;
            } catch (Throwable th) {
                th = th;
                uiText = resourceUiText;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uiText = ryzVar.a;
            try {
                uj50.b(obj);
            } catch (Throwable th2) {
                th = th2;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        bVar = Unit.a;
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

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.lyz
    public final Object o0(String str, String str2, String str3, Map map, x1b x1bVar) {
        vyz vyzVar;
        Throwable th;
        UiText uiText;
        Object bVar;
        UiText text;
        if (x1bVar instanceof vyz) {
            vyzVar = (vyz) x1bVar;
            int i2 = vyzVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vyzVar.d = i2 - Integer.MIN_VALUE;
            } else {
                vyzVar = new vyz(this, x1bVar);
            }
        } else {
            vyzVar = new vyz(this, x1bVar);
        }
        vyz vyzVar2 = vyzVar;
        Object objG = vyzVar2.b;
        y5b y5bVar = y5b.a;
        int i3 = vyzVar2.d;
        if (i3 == 0) {
            uj50.b(objG);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                xxz xxzVar = this.a;
                vyzVar2.a = resourceUiText;
                vyzVar2.d = 1;
                objG = xxzVar.g(str, str2, str3, map, vyzVar2);
                if (objG == y5bVar) {
                    return y5bVar;
                }
                uiText = resourceUiText;
            } catch (Throwable th2) {
                th = th2;
                uiText = resourceUiText;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uiText = vyzVar2.a;
            try {
                uj50.b(objG);
            } catch (Throwable th3) {
                th = th3;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        bVar = (PreRegisterResponse) n52.b((BaseResponse) objG);
        zi50.a aVar4 = zi50.b;
        Object obj = bVar instanceof zi50.b ? null : bVar;
        if (obj != null) {
            return new lk50.c(obj);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            thA = new Throwable(tYcQsJyaojE.fAVOoaqeeKCR);
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
}
