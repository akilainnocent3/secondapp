package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.wheelanddeal.model.WDAmountConfigModel;
import com.sportygames.wheelanddeal.model.WDAvailable;
import com.sportygames.wheelanddeal.model.WDBetResponseModel;
import com.sportygames.wheelanddeal.model.WDPayTableModel;
import com.sportygames.wheelanddeal.model.WDUserInfoModel;
import com.sportygames.wheelanddeal.model.WDUserModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes8.dex */
public final class lti0 implements kti0 {
    public final e6j0 a;
    public final odd b;

    @c0d(c = "com.sportygames.wheelanddeal.repository.WDRepositoryImpl$available$1", f = "WDRepositoryImpl.kt", l = {68, 68}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<myh<? super HTTPResponse<WDAvailable>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = lti0.this.new a(v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super HTTPResponse<WDAvailable>> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                lti0 r7 = defpackage.lti0.this
                e6j0 r7 = r7.a
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
            throw new UnsupportedOperationException("Method not decompiled: lti0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.wheelanddeal.repository.WDRepositoryImpl$bet$1", f = "WDRepositoryImpl.kt", l = {41, 40}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<myh<? super HTTPResponse<WDBetResponseModel>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ oti0 e;
        public final /* synthetic */ int f;
        public final /* synthetic */ double i;
        public final /* synthetic */ long v;
        public final /* synthetic */ String w;
        public final /* synthetic */ Double y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(oti0 oti0Var, int i, double d, long j, String str, Double d2, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.e = oti0Var;
            this.f = i;
            this.i = d;
            this.v = j;
            this.w = str;
            this.y = d2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = lti0.this.new b(this.e, this.f, this.i, this.v, this.w, this.y, v1bVar);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super HTTPResponse<WDBetResponseModel>> myhVar, v1b<? super Unit> v1bVar) {
            return ((b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
        
            if (r0.emit(r15, r14) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r14.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r15)
                goto L5a
            L15:
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r14)
                return r5
            L1b:
                myh r0 = r14.a
                defpackage.uj50.b(r15)
                goto L4d
            L21:
                defpackage.uj50.b(r15)
                lti0 r15 = defpackage.lti0.this
                e6j0 r15 = r15.a
                com.sportygames.wheelanddeal.model.WDBetRequestModel r6 = new com.sportygames.wheelanddeal.model.WDBetRequestModel
                com.sportygames.wheelanddeal.model.WDUserSelectionModel r7 = new com.sportygames.wheelanddeal.model.WDUserSelectionModel
                oti0 r2 = r14.e
                java.lang.String r2 = r2.a
                int r8 = r14.f
                r7.<init>(r2, r8)
                java.lang.String r12 = r14.w
                java.lang.Double r13 = r14.y
                double r8 = r14.i
                long r10 = r14.v
                r6.<init>(r7, r8, r10, r12, r13)
                r14.c = r5
                r14.a = r0
                r14.b = r4
                java.lang.Object r15 = r15.c(r6, r14)
                if (r15 != r1) goto L4d
                goto L59
            L4d:
                r14.c = r5
                r14.a = r5
                r14.b = r3
                java.lang.Object r14 = r0.emit(r15, r14)
                if (r14 != r1) goto L5a
            L59:
                return r1
            L5a:
                kotlin.Unit r14 = kotlin.Unit.a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: lti0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.wheelanddeal.repository.WDRepositoryImpl$getPayTable$1", f = "WDRepositoryImpl.kt", l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<myh<? super HTTPResponse<WDPayTableModel>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = lti0.this.new c(v1bVar);
            cVar.c = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super HTTPResponse<WDPayTableModel>> myhVar, v1b<? super Unit> v1bVar) {
            return ((c) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                lti0 r7 = defpackage.lti0.this
                e6j0 r7 = r7.a
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
            throw new UnsupportedOperationException("Method not decompiled: lti0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.wheelanddeal.repository.WDRepositoryImpl$getPetConfig$1", f = "WDRepositoryImpl.kt", l = {30, 30}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<myh<? super HTTPResponse<WDAmountConfigModel>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = lti0.this.new d(v1bVar);
            dVar.c = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super HTTPResponse<WDAmountConfigModel>> myhVar, v1b<? super Unit> v1bVar) {
            return ((d) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                lti0 r7 = defpackage.lti0.this
                e6j0 r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.g(r6)
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
            throw new UnsupportedOperationException("Method not decompiled: lti0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.wheelanddeal.repository.WDRepositoryImpl$user$1", f = "WDRepositoryImpl.kt", l = {WebSocketProtocol.B0_FLAG_RSV1, WebSocketProtocol.B0_FLAG_RSV1}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<myh<? super HTTPResponse<WDUserModel>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = lti0.this.new e(v1bVar);
            eVar.c = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super HTTPResponse<WDUserModel>> myhVar, v1b<? super Unit> v1bVar) {
            return ((e) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                lti0 r7 = defpackage.lti0.this
                e6j0 r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.d(r6)
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
            throw new UnsupportedOperationException("Method not decompiled: lti0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.wheelanddeal.repository.WDRepositoryImpl$userInfo$1", f = "WDRepositoryImpl.kt", l = {72, 72}, m = "invokeSuspend", v = 1)
    public static final class f extends tje0 implements Function2<myh<? super HTTPResponse<WDUserInfoModel>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            f fVar = lti0.this.new f(v1bVar);
            fVar.c = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super HTTPResponse<WDUserInfoModel>> myhVar, v1b<? super Unit> v1bVar) {
            return ((f) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                lti0 r7 = defpackage.lti0.this
                e6j0 r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.a(r6)
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
            throw new UnsupportedOperationException("Method not decompiled: lti0.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public lti0(e6j0 e6j0Var) {
        e6j0Var.getClass();
        this.a = e6j0Var;
        pfd pfdVar = fse.a;
        this.b = odd.b;
    }

    @Override // defpackage.kti0
    public final lyh<HTTPResponse<WDBetResponseModel>> a(oti0 oti0Var, int i, double d2, long j, String str, Double d3) {
        oti0Var.getClass();
        return ozh.c(new or60(new b(oti0Var, i, d2, j, str, d3, null)), this.b);
    }

    @Override // defpackage.kti0
    public final lyh<HTTPResponse<WDAvailable>> available() {
        return ozh.c(new or60(new a(null)), this.b);
    }

    @Override // defpackage.kti0
    public final lyh<HTTPResponse<WDPayTableModel>> b() {
        return ozh.c(new or60(new c(null)), this.b);
    }

    @Override // defpackage.kti0
    public final lyh c(Integer num) {
        return ozh.c(new or60(new mti0(this, num, null)), this.b);
    }

    @Override // defpackage.kti0
    public final lyh<HTTPResponse<WDUserInfoModel>> d() {
        return ozh.c(new or60(new f(null)), this.b);
    }

    @Override // defpackage.kti0
    public final lyh<HTTPResponse<WDUserModel>> e() {
        return ozh.c(new or60(new e(null)), this.b);
    }

    @Override // defpackage.kti0
    public final or60 f() {
        return new or60(new nti0(this, null));
    }

    @Override // defpackage.kti0
    public final lyh<HTTPResponse<WDAmountConfigModel>> g() {
        return ozh.c(new or60(new d(null)), this.b);
    }
}
