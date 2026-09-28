package defpackage;

import android.os.Parcelable;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.security.otp.OTPCompleteResult;
import com.sporty.android.core.model.security.otp.OTPVerificationBrVariant;
import com.sporty.android.core.model.security.otp.RegisterBrOtpVerifyResult;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ht40 implements lyh<RegisterBrOtpVerifyResult> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ it40 b;

    @c0d(c = "com.sporty.android.platform.features.newotp.feature.register.br.RegisterBrOtpUseCase$verifyOTP$$inlined$map$1", f = "RegisterBrOtpUseCase.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return ht40.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ it40 b;

        @c0d(c = "com.sporty.android.platform.features.newotp.feature.register.br.RegisterBrOtpUseCase$verifyOTP$$inlined$map$1$2", f = "RegisterBrOtpUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(myh myhVar, it40 it40Var) {
            this.a = myhVar;
            this.b = it40Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) throws SprThrowable {
            a aVar;
            Parcelable verifiedWithData;
            String strName;
            String accessToken;
            String refreshToken;
            String userId;
            String currency;
            String countryCode;
            String language;
            String phoneCountryCode;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj2 = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj2);
                BaseResponse baseResponse = (BaseResponse) obj;
                OTPCompleteResult oTPCompleteResult = (OTPCompleteResult) baseResponse.data;
                if (baseResponse.isSuccessful() && oTPCompleteResult != null && (accessToken = oTPCompleteResult.getAccessToken()) != null && !StringsKt.U(accessToken) && (refreshToken = oTPCompleteResult.getRefreshToken()) != null && !StringsKt.U(refreshToken) && (userId = oTPCompleteResult.getUserId()) != null && !StringsKt.U(userId) && (currency = oTPCompleteResult.getCurrency()) != null && !StringsKt.U(currency) && (countryCode = oTPCompleteResult.getCountryCode()) != null && !StringsKt.U(countryCode) && (language = oTPCompleteResult.getLanguage()) != null && !StringsKt.U(language) && (phoneCountryCode = oTPCompleteResult.getPhoneCountryCode()) != null && !StringsKt.U(phoneCountryCode)) {
                    oTPCompleteResult.getRegistrationStatus();
                    oTPCompleteResult.getMaxAge();
                    oTPCompleteResult.getUserCert();
                    verifiedWithData = new RegisterBrOtpVerifyResult.VerifiedWithData(oTPCompleteResult);
                } else {
                    if (!baseResponse.isSuccessful()) {
                        int i3 = baseResponse.bizCode;
                        String str = baseResponse.message;
                        if (str == null) {
                            str = "";
                        }
                        throw new SprThrowable(i3, str, baseResponse.data == null);
                    }
                    if (oTPCompleteResult != null) {
                        rdd0 rdd0Var = this.b.b;
                        OTPVerificationBrVariant variant = oTPCompleteResult.getVariant();
                        if (variant == null || (strName = variant.name()) == null) {
                            strName = "empty";
                        }
                        ngs ngsVarB = kotlin.collections.a.b();
                        String accessToken2 = oTPCompleteResult.getAccessToken();
                        if (accessToken2 == null || StringsKt.U(accessToken2)) {
                            ngsVarB.add("accessToken");
                        }
                        String refreshToken2 = oTPCompleteResult.getRefreshToken();
                        if (refreshToken2 == null || StringsKt.U(refreshToken2)) {
                            ngsVarB.add("refreshToken");
                        }
                        String userId2 = oTPCompleteResult.getUserId();
                        if (userId2 == null || StringsKt.U(userId2)) {
                            ngsVarB.add("userId");
                        }
                        String currency2 = oTPCompleteResult.getCurrency();
                        if (currency2 == null || StringsKt.U(currency2)) {
                            ngsVarB.add("currency");
                        }
                        String countryCode2 = oTPCompleteResult.getCountryCode();
                        if (countryCode2 == null || StringsKt.U(countryCode2)) {
                            ngsVarB.add("countryCode");
                        }
                        String language2 = oTPCompleteResult.getLanguage();
                        if (language2 == null || StringsKt.U(language2)) {
                            ngsVarB.add("language");
                        }
                        String phoneCountryCode2 = oTPCompleteResult.getPhoneCountryCode();
                        if (phoneCountryCode2 == null || StringsKt.U(phoneCountryCode2)) {
                            ngsVarB.add("phoneCountryCode");
                        }
                        oTPCompleteResult.getRegistrationStatus();
                        oTPCompleteResult.getMaxAge();
                        oTPCompleteResult.getUserCert();
                        rdd0Var.a(new ts40.o(strName, CollectionsKt.a0(kotlin.collections.a.a(ngsVarB), ", ", null, null, null, 62)), k00.d);
                    }
                    verifiedWithData = RegisterBrOtpVerifyResult.VerifiedWithoutData.INSTANCE;
                }
                aVar.b = 1;
                if (this.a.emit(verifiedWithData, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj2);
            }
            return Unit.a;
        }
    }

    public ht40(lyh lyhVar, it40 it40Var) {
        this.a = lyhVar;
        this.b = it40Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super RegisterBrOtpVerifyResult> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            b bVar = new b(myhVar, this.b);
            aVar.b = 1;
            if (this.a.collect(bVar, aVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
