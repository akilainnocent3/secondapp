package com.sportybet.plugin.webcontainer.viewmodel;

import com.sporty.android.core.model.account.AccountActivationData;
import com.sporty.android.core.model.kyc.phonemigration.KYCDuplicateIDWebViewResponse;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.account.RegistrationKYC$Result;
import com.sportybet.android.data.LaunchOTP;
import com.sportybet.feature.horseracing.model.BmSdkResult;
import com.sportybet.plugin.webcontainer.WebviewEffect;
import defpackage.a390;
import defpackage.c0d;
import defpackage.c9p;
import defpackage.e1i;
import defpackage.ej5;
import defpackage.et7;
import defpackage.fse;
import defpackage.ib5;
import defpackage.j8i0;
import defpackage.k00;
import defpackage.ku90;
import defpackage.lyz;
import defpackage.mgb0;
import defpackage.njs;
import defpackage.o8i0;
import defpackage.odd;
import defpackage.pfd;
import defpackage.rdd0;
import defpackage.ssw;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.vu90;
import defpackage.w430;
import defpackage.xq00;
import defpackage.y5b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020$¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\f018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00110.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00100R\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020\u0011018\u0006¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0014098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0014018\u0006¢\u0006\f\n\u0004\b<\u00103\u001a\u0004\b=\u00105R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00180.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00100R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\u0018018\u0006¢\u0006\f\n\u0004\b?\u00103\u001a\u0004\b@\u00105R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001b0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001b0D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020$0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010CR\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020$0D8\u0006¢\u0006\f\n\u0004\bJ\u0010F\u001a\u0004\bK\u0010HR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020L0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010CR\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020L0D8F¢\u0006\u0006\u001a\u0004\bN\u0010H¨\u0006P"}, d2 = {"Lcom/sportybet/plugin/webcontainer/viewmodel/WebViewViewModel;", "Lj8i0;", "Lrdd0;", "sportyTrackingUseCase", "Llyz;", "patronRepository", "Lmgb0;", "accountStorage", "Lxq00;", "preferenceDataStore", "<init>", "(Lrdd0;Llyz;Lmgb0;Lxq00;)V", "Lcom/sportybet/android/account/RegistrationKYC$Result;", AnalyticsParam.EVENT_PARAM_RESULT, "", "setRegistrationKYCResult", "(Lcom/sportybet/android/account/RegistrationKYC$Result;)V", "Lcom/sporty/android/core/model/account/AccountActivationData;", "setAccountActivationResult", "(Lcom/sporty/android/core/model/account/AccountActivationData;)V", "Lcom/sportybet/android/data/LaunchOTP;", "launchOTP", "setNameMissMatchOTP", "(Lcom/sportybet/android/data/LaunchOTP;)V", "Lcom/sporty/android/core/model/kyc/phonemigration/KYCDuplicateIDWebViewResponse;", "setKYCDuplicateIdResult", "(Lcom/sporty/android/core/model/kyc/phonemigration/KYCDuplicateIDWebViewResponse;)V", "", "setFacialRecognitionResult", "(Ljava/lang/String;)V", "Lw430;", AnalyticsEvent.BI_TRACKING_KIND_EVENT, "onShareButtonEvent", "(Lw430;)V", "updateUserCertStatus", "()V", "Lcom/sportybet/feature/horseracing/model/BmSdkResult;", "setBmSdkResult", "(Lcom/sportybet/feature/horseracing/model/BmSdkResult;)V", "Lc9p;", "updateShouldShowTwoFASuccessSnackbar", "()Lc9p;", "Lrdd0;", "Llyz;", "Lmgb0;", "Lxq00;", "Lssw;", "_registrationKYCResult", "Lssw;", "Lnjs;", "registrationKYCResult", "Lnjs;", "getRegistrationKYCResult", "()Lnjs;", "_accountActivationResult", "accountActivationResult", "getAccountActivationResult", "Lvu90;", "_nameMissMatchOTP", "Lvu90;", "nameMissMatchOTP", "getNameMissMatchOTP", "_kycDuplicateIdResult", "kycDuplicateIdResult", "getKycDuplicateIdResult", "Lku90;", "_facialRecognitionSdkResult", "Lku90;", "La390;", "facialRecognitionSdkResult", "La390;", "getFacialRecognitionSdkResult", "()La390;", "_bmSdkResult", "bmSdkResult", "getBmSdkResult", "Lcom/sportybet/plugin/webcontainer/WebviewEffect;", "_effect", "getEffect", "effect", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class WebViewViewModel extends j8i0 {
    public static final int $stable = 8;
    private final ssw<AccountActivationData> _accountActivationResult;
    private final ku90<BmSdkResult> _bmSdkResult;
    private final ku90<WebviewEffect> _effect;
    private final ku90<String> _facialRecognitionSdkResult;
    private final ssw<KYCDuplicateIDWebViewResponse> _kycDuplicateIdResult;
    private final vu90<LaunchOTP> _nameMissMatchOTP;
    private final ssw<RegistrationKYC$Result> _registrationKYCResult;
    private final njs<AccountActivationData> accountActivationResult;
    private final mgb0 accountStorage;
    private final a390<BmSdkResult> bmSdkResult;
    private final a390<String> facialRecognitionSdkResult;
    private final njs<KYCDuplicateIDWebViewResponse> kycDuplicateIdResult;
    private final njs<LaunchOTP> nameMissMatchOTP;
    private final lyz patronRepository;
    private final xq00 preferenceDataStore;
    private final njs<RegistrationKYC$Result> registrationKYCResult;
    private final rdd0 sportyTrackingUseCase;

    /* JADX INFO: renamed from: com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel$setBmSdkResult$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv5b;", "", "<anonymous>", "(Lv5b;)V"}, k = 3, mv = {2, 4, 0})
    @c0d(c = "com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel$setBmSdkResult$1", f = "WebViewViewModel.kt", l = {HttpStatusCodesKt.HTTP_PROCESSING}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        final /* synthetic */ BmSdkResult $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BmSdkResult bmSdkResult, v1b<? super AnonymousClass1> v1bVar) {
            super(2, v1bVar);
            this.$result = bmSdkResult;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return WebViewViewModel.this.new AnonymousClass1(this.$result, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((AnonymousClass1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.label;
            if (i == 0) {
                uj50.b(obj);
                ku90 ku90Var = WebViewViewModel.this._bmSdkResult;
                BmSdkResult bmSdkResult = this.$result;
                this.label = 1;
                if (ku90Var.a.emit(bmSdkResult, this) == y5bVar) {
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

    /* JADX INFO: renamed from: com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel$setFacialRecognitionResult$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv5b;", "", "<anonymous>", "(Lv5b;)V"}, k = 3, mv = {2, 4, 0})
    @c0d(c = "com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel$setFacialRecognitionResult$1", f = "WebViewViewModel.kt", l = {78}, m = "invokeSuspend", v = 2)
    public static final class C14601 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        final /* synthetic */ String $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14601(String str, v1b<? super C14601> v1bVar) {
            super(2, v1bVar);
            this.$result = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return WebViewViewModel.this.new C14601(this.$result, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((C14601) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.label;
            if (i == 0) {
                uj50.b(obj);
                ku90 ku90Var = WebViewViewModel.this._facialRecognitionSdkResult;
                String str = this.$result;
                this.label = 1;
                if (ku90Var.a.emit(str, this) == y5bVar) {
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

    /* JADX INFO: renamed from: com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel$updateShouldShowTwoFASuccessSnackbar$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv5b;", "", "<anonymous>", "(Lv5b;)V"}, k = 3, mv = {2, 4, 0})
    @c0d(c = "com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel$updateShouldShowTwoFASuccessSnackbar$1", f = "WebViewViewModel.kt", l = {107, 108}, m = "invokeSuspend", v = 2)
    public static final class C14611 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        int label;

        public C14611(v1b<? super C14611> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return WebViewViewModel.this.new C14611(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((C14611) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            if (r7.a.emit(r1, r6) == r0) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto L10
                defpackage.uj50.b(r7)
                goto L4d
            L10:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                r6 = 0
                return r6
            L17:
                defpackage.uj50.b(r7)
                goto L3a
            L1b:
                defpackage.uj50.b(r7)
                com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel r7 = com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel.this
                xq00 r7 = com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel.access$getPreferenceDataStore$p(r7)
                rkd r1 = r7.b
                ohp<java.lang.Object>[] r4 = defpackage.xq00.c
                r5 = 0
                r4 = r4[r5]
                wm20 r7 = r1.a(r7, r4)
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r6.label = r3
                java.lang.Object r7 = r7.g(r6, r1)
                if (r7 != r0) goto L3a
                goto L4c
            L3a:
                com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel r7 = com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel.this
                ku90 r7 = com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel.access$get_effect$p(r7)
                com.sportybet.plugin.webcontainer.WebviewEffect$Leave r1 = com.sportybet.plugin.webcontainer.WebviewEffect.Leave.INSTANCE
                r6.label = r2
                b390 r7 = r7.a
                java.lang.Object r6 = r7.emit(r1, r6)
                if (r6 != r0) goto L4d
            L4c:
                return r0
            L4d:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel.C14611.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel$updateUserCertStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv5b;", "", "<anonymous>", "(Lv5b;)V"}, k = 3, mv = {2, 4, 0})
    @c0d(c = "com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel$updateUserCertStatus$1", f = "WebViewViewModel.kt", l = {92, 95}, m = "invokeSuspend", v = 2)
    public static final class C14621 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        int I$0;
        Object L$0;
        Object L$1;
        int label;

        public C14621(v1b<? super C14621> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return WebViewViewModel.this.new C14621(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((C14621) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        
            if (r1.setUserCertStatus(r6, r5) == r0) goto L23;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r5.label
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L19
                java.lang.Object r0 = r5.L$1
                com.sporty.android.core.model.patron.NameConfirmationStatus r0 = (com.sporty.android.core.model.patron.NameConfirmationStatus) r0
                java.lang.Object r5 = r5.L$0
                lk50 r5 = (defpackage.lk50) r5
                defpackage.uj50.b(r6)
                goto L66
            L19:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                return r4
            L1f:
                defpackage.uj50.b(r6)
                goto L3b
            L23:
                defpackage.uj50.b(r6)
                com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel r6 = com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel.this
                lyz r6 = com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel.access$getPatronRepository$p(r6)
                pu0$c r1 = pu0.c.a
                lyh r6 = r6.j0(r1)
                r5.label = r3
                java.lang.Object r6 = defpackage.bm50.p(r6, r5)
                if (r6 != r0) goto L3b
                goto L65
            L3b:
                lk50 r6 = (defpackage.lk50) r6
                boolean r1 = r6 instanceof lk50.c
                if (r1 == 0) goto L44
                lk50$c r6 = (lk50.c) r6
                goto L45
            L44:
                r6 = r4
            L45:
                if (r6 == 0) goto L4c
                T r6 = r6.a
                com.sporty.android.core.model.patron.NameConfirmationStatus r6 = (com.sporty.android.core.model.patron.NameConfirmationStatus) r6
                goto L4d
            L4c:
                r6 = r4
            L4d:
                if (r6 == 0) goto L66
                int r6 = r6.status
                com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel r1 = com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel.this
                mgb0 r1 = com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel.access$getAccountStorage$p(r1)
                r5.L$0 = r4
                r5.L$1 = r4
                r5.I$0 = r6
                r5.label = r2
                java.lang.Object r5 = r1.setUserCertStatus(r6, r5)
                if (r5 != r0) goto L66
            L65:
                return r0
            L66:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel.C14621.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public WebViewViewModel(rdd0 rdd0Var, lyz lyzVar, mgb0 mgb0Var, xq00 xq00Var) {
        rdd0Var.getClass();
        lyzVar.getClass();
        mgb0Var.getClass();
        xq00Var.getClass();
        this.sportyTrackingUseCase = rdd0Var;
        this.patronRepository = lyzVar;
        this.accountStorage = mgb0Var;
        this.preferenceDataStore = xq00Var;
        ssw<RegistrationKYC$Result> sswVar = new ssw<>();
        this._registrationKYCResult = sswVar;
        this.registrationKYCResult = sswVar;
        ssw<AccountActivationData> sswVar2 = new ssw<>();
        this._accountActivationResult = sswVar2;
        this.accountActivationResult = sswVar2;
        vu90<LaunchOTP> vu90Var = new vu90<>();
        this._nameMissMatchOTP = vu90Var;
        this.nameMissMatchOTP = vu90Var;
        ssw<KYCDuplicateIDWebViewResponse> sswVar3 = new ssw<>();
        this._kycDuplicateIdResult = sswVar3;
        this.kycDuplicateIdResult = sswVar3;
        ku90<String> ku90Var = new ku90<>();
        this._facialRecognitionSdkResult = ku90Var;
        this.facialRecognitionSdkResult = e1i.a(ku90Var);
        ku90<BmSdkResult> ku90Var2 = new ku90<>();
        this._bmSdkResult = ku90Var2;
        this.bmSdkResult = e1i.a(ku90Var2);
        this._effect = new ku90<>();
    }

    public final njs<AccountActivationData> getAccountActivationResult() {
        return this.accountActivationResult;
    }

    public final a390<BmSdkResult> getBmSdkResult() {
        return this.bmSdkResult;
    }

    public final a390<WebviewEffect> getEffect() {
        return this._effect;
    }

    public final a390<String> getFacialRecognitionSdkResult() {
        return this.facialRecognitionSdkResult;
    }

    public final njs<KYCDuplicateIDWebViewResponse> getKycDuplicateIdResult() {
        return this.kycDuplicateIdResult;
    }

    public final njs<LaunchOTP> getNameMissMatchOTP() {
        return this.nameMissMatchOTP;
    }

    public final njs<RegistrationKYC$Result> getRegistrationKYCResult() {
        return this.registrationKYCResult;
    }

    public final void onShareButtonEvent(w430 event) {
        event.getClass();
        this.sportyTrackingUseCase.a(event, k00.d);
    }

    public final void setAccountActivationResult(AccountActivationData result) {
        result.getClass();
        this._accountActivationResult.m(result);
    }

    public final void setBmSdkResult(BmSdkResult result) {
        result.getClass();
        ej5.c(o8i0.d(this), null, null, new AnonymousClass1(result, null), 3);
    }

    public final void setFacialRecognitionResult(String result) {
        result.getClass();
        ej5.c(o8i0.d(this), null, null, new C14601(result, null), 3);
    }

    public final void setKYCDuplicateIdResult(KYCDuplicateIDWebViewResponse result) {
        result.getClass();
        this._kycDuplicateIdResult.m(result);
    }

    public final void setNameMissMatchOTP(LaunchOTP launchOTP) {
        launchOTP.getClass();
        this._nameMissMatchOTP.m(launchOTP);
    }

    public final void setRegistrationKYCResult(RegistrationKYC$Result result) {
        result.getClass();
        this._registrationKYCResult.m(result);
    }

    public final c9p updateShouldShowTwoFASuccessSnackbar() {
        return ej5.c(o8i0.d(this), null, null, new C14611(null), 3);
    }

    public final void updateUserCertStatus() {
        et7 et7VarD = o8i0.d(this);
        pfd pfdVar = fse.a;
        ej5.c(et7VarD, odd.b, null, new C14621(null), 2);
    }
}
