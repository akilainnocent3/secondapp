package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.security.biometric.BioAuthLoginResponse;
import com.sporty.android.core.model.security.biometric.BioAuthOTPSessionToken;
import com.sporty.android.core.model.security.biometric.BioAuthPreRegisterResponse;
import com.sporty.android.core.model.security.biometric.BioAuthRegisterResponse;
import com.sporty.android.core.model.security.biometric.BioAuthUsageResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class x74 implements w74 {
    public final h64 a;
    public final k5b b;

    @c0d(c = "com.sporty.android.core.data.repository.biomeric.BioAuthRepositoryImpl$getBiometricUsageSettings$1", f = "BioAuthRepositoryImpl.kt", l = {80, 80}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super BaseResponse<BioAuthUsageResponse>>, v1b<? super Unit>, Object> {
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
            a aVar = x74.this.new a(this.e, this.f, this.i, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<BioAuthUsageResponse>> myhVar, v1b<? super Unit> v1bVar) {
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
                x74 r8 = defpackage.x74.this
                h64 r8 = r8.a
                r7.c = r5
                r7.a = r0
                r7.b = r4
                java.lang.String r2 = r7.e
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
            throw new UnsupportedOperationException("Method not decompiled: x74.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.biomeric.BioAuthRepositoryImpl$initiateBiometricRegistration$1", f = "BioAuthRepositoryImpl.kt", l = {30, 30}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super BaseResponse<BioAuthPreRegisterResponse>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.e = str;
            this.f = str2;
            this.i = str3;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = x74.this.new b(this.e, this.f, this.i, v1bVar);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<BioAuthPreRegisterResponse>> myhVar, v1b<? super Unit> v1bVar) {
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
                x74 r8 = defpackage.x74.this
                h64 r8 = r8.a
                r7.c = r5
                r7.a = r0
                r7.b = r4
                java.lang.String r2 = r7.e
                java.lang.String r4 = r7.f
                java.lang.String r6 = r7.i
                java.lang.Object r8 = r8.b(r2, r4, r6, r7)
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
            throw new UnsupportedOperationException("Method not decompiled: x74.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.biomeric.BioAuthRepositoryImpl$loginWithBioAuth$1", f = "BioAuthRepositoryImpl.kt", l = {72, 72}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<myh<? super BaseResponse<BioAuthLoginResponse>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String i;
        public final /* synthetic */ String v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, String str4, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.e = str;
            this.f = str2;
            this.i = str3;
            this.v = str4;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = x74.this.new c(this.e, this.f, this.i, this.v, v1bVar);
            cVar.c = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<BioAuthLoginResponse>> myhVar, v1b<? super Unit> v1bVar) {
            return ((c) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (r0.emit(r13, r11) == r1) goto L15;
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
                goto L4c
            L15:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r12)
                return r5
            L1b:
                myh r0 = r12.a
                defpackage.uj50.b(r13)
                r11 = r12
                goto L3f
            L22:
                defpackage.uj50.b(r13)
                x74 r13 = defpackage.x74.this
                h64 r6 = r13.a
                r12.c = r5
                r12.a = r0
                r12.b = r4
                java.lang.String r7 = r12.e
                java.lang.String r8 = r12.f
                java.lang.String r9 = r12.i
                java.lang.String r10 = r12.v
                r11 = r12
                java.lang.Object r13 = r6.g(r7, r8, r9, r10, r11)
                if (r13 != r1) goto L3f
                goto L4b
            L3f:
                r11.c = r5
                r11.a = r5
                r11.b = r3
                java.lang.Object r12 = r0.emit(r13, r11)
                if (r12 != r1) goto L4c
            L4b:
                return r1
            L4c:
                kotlin.Unit r12 = kotlin.Unit.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: x74.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.biomeric.BioAuthRepositoryImpl$registerBioAuth$1", f = "BioAuthRepositoryImpl.kt", l = {47, 47}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<myh<? super BaseResponse<BioAuthRegisterResponse>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String i;
        public final /* synthetic */ String v;
        public final /* synthetic */ String w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, String str3, String str4, String str5, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.e = str;
            this.f = str2;
            this.i = str3;
            this.v = str4;
            this.w = str5;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = x74.this.new d(this.e, this.f, this.i, this.v, this.w, v1bVar);
            dVar.c = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<BioAuthRegisterResponse>> myhVar, v1b<? super Unit> v1bVar) {
            return ((d) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r0.emit(r14, r12) == r1) goto L15;
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
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r14)
                goto L4e
            L15:
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r13)
                return r5
            L1b:
                myh r0 = r13.a
                defpackage.uj50.b(r14)
                r12 = r13
                goto L41
            L22:
                defpackage.uj50.b(r14)
                x74 r14 = defpackage.x74.this
                h64 r6 = r14.a
                r13.c = r5
                r13.a = r0
                r13.b = r4
                java.lang.String r7 = r13.e
                java.lang.String r8 = r13.f
                java.lang.String r9 = r13.i
                java.lang.String r10 = r13.v
                java.lang.String r11 = r13.w
                r12 = r13
                java.lang.Object r14 = r6.e(r7, r8, r9, r10, r11, r12)
                if (r14 != r1) goto L41
                goto L4d
            L41:
                r12.c = r5
                r12.a = r5
                r12.b = r3
                java.lang.Object r13 = r0.emit(r14, r12)
                if (r13 != r1) goto L4e
            L4d:
                return r1
            L4e:
                kotlin.Unit r13 = kotlin.Unit.a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: x74.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.biomeric.BioAuthRepositoryImpl$requestBiometricOtpSession$1", f = "BioAuthRepositoryImpl.kt", l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<myh<? super BaseResponse<BioAuthOTPSessionToken>>, v1b<? super Unit>, Object> {
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
            e eVar = x74.this.new e(this.e, this.f, v1bVar);
            eVar.c = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<BioAuthOTPSessionToken>> myhVar, v1b<? super Unit> v1bVar) {
            return ((e) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                x74 r7 = defpackage.x74.this
                h64 r7 = r7.a
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
            throw new UnsupportedOperationException("Method not decompiled: x74.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.biomeric.BioAuthRepositoryImpl$updateBiometricUsageSettings$1", f = "BioAuthRepositoryImpl.kt", l = {91, 90}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<myh<? super BaseResponse<BioAuthUsageResponse>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String i;
        public final /* synthetic */ boolean v;
        public final /* synthetic */ boolean w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, String str2, String str3, boolean z, boolean z2, v1b<? super f> v1bVar) {
            super(2, v1bVar);
            this.e = str;
            this.f = str2;
            this.i = str3;
            this.v = z;
            this.w = z2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            f fVar = x74.this.new f(this.e, this.f, this.i, this.v, this.w, v1bVar);
            fVar.c = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<BioAuthUsageResponse>> myhVar, v1b<? super Unit> v1bVar) {
            return ((f) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r0.emit(r14, r12) == r1) goto L15;
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
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r14)
                goto L4e
            L15:
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r13)
                return r5
            L1b:
                myh r0 = r13.a
                defpackage.uj50.b(r14)
                r12 = r13
                goto L41
            L22:
                defpackage.uj50.b(r14)
                x74 r14 = defpackage.x74.this
                h64 r6 = r14.a
                r13.c = r5
                r13.a = r0
                r13.b = r4
                java.lang.String r7 = r13.e
                java.lang.String r8 = r13.f
                java.lang.String r9 = r13.i
                boolean r10 = r13.v
                boolean r11 = r13.w
                r12 = r13
                java.lang.Object r14 = r6.a(r7, r8, r9, r10, r11, r12)
                if (r14 != r1) goto L41
                goto L4d
            L41:
                r12.c = r5
                r12.a = r5
                r12.b = r3
                java.lang.Object r13 = r0.emit(r14, r12)
                if (r13 != r1) goto L4e
            L4d:
                return r1
            L4e:
                kotlin.Unit r13 = kotlin.Unit.a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: x74.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public x74(h64 h64Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        h64Var.getClass();
        this.a = h64Var;
        this.b = k5bVar;
    }

    @Override // defpackage.w74
    public final lyh<BaseResponse<BioAuthLoginResponse>> a(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return ozh.c(new or60(new c(str, str2, str3, str4, null)), this.b);
    }

    @Override // defpackage.w74
    public final lyh<BaseResponse<BioAuthUsageResponse>> b(String str, String str2, String str3, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return ozh.c(new or60(new f(str, str2, str3, z, z2, null)), this.b);
    }

    @Override // defpackage.w74
    public final lyh<BaseResponse<BioAuthRegisterResponse>> c(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        return ozh.c(new or60(new d(str, str2, str3, str4, str5, null)), this.b);
    }

    @Override // defpackage.w74
    public final lyh<BaseResponse<BioAuthOTPSessionToken>> d(String str, String str2) {
        str.getClass();
        str2.getClass();
        return ozh.c(new or60(new e(str, str2, null)), this.b);
    }

    @Override // defpackage.w74
    public final lyh<BaseResponse<BioAuthUsageResponse>> e(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return ozh.c(new or60(new a(str, str2, str3, null)), this.b);
    }

    @Override // defpackage.w74
    public final lyh<BaseResponse<BioAuthPreRegisterResponse>> f(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        return ozh.c(new or60(new b(str, str2, str3, null)), this.b);
    }

    @Override // defpackage.w74
    public final Object g(String str, String str2, String str3, String str4, j6c j6cVar, f5z f5zVar) {
        return ej5.d(this.b, new y74(this, j6cVar, str, str2, str3, str4, null), f5zVar);
    }
}
