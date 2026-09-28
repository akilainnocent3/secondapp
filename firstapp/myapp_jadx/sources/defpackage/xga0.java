package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.android.social.data.local.SocShareCodeEntity;
import com.sportybet.android.social.data.local.SocialDatabase;
import com.sportybet.android.social.data.local.SocialFollowerEntity;
import com.sportybet.android.social.data.local.SocialFollowingEntity;
import com.sportybet.android.social.data.remote.entity.SocShareCode;
import com.sportybet.android.social.data.remote.entity.SocialMetaData;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class xga0 implements vga0 {
    public final SocialDatabase a;
    public final x7a0 b;
    public final g3z c;
    public final gbd0 d;
    public final k5b e;
    public final bnh0 f;
    public final LinkedHashMap g = new LinkedHashMap();
    public final LinkedHashMap h = new LinkedHashMap();
    public final LinkedHashMap i = new LinkedHashMap();

    @c0d(c = "com.sportybet.android.social.data.repository.SocialRepositoryImpl$addMyShareCode$1", f = "SocialRepositoryImpl.kt", l = {270, 270}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super BaseResponse<Void>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.e = str;
            this.f = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = xga0.this.new a(this.e, this.f, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<Void>> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                xga0 r7 = defpackage.xga0.this
                x7a0 r7 = r7.b
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.String r4 = r6.f
                java.lang.Object r7 = r7.j(r2, r4, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: xga0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.android.social.data.repository.SocialRepositoryImpl$createBookingCode$1", f = "SocialRepositoryImpl.kt", l = {290, 290}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super BaseResponse<BookingData>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, boolean z, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.e = str;
            this.f = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = xga0.this.new b(this.e, this.f, v1bVar);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<BookingData>> myhVar, v1b<? super Unit> v1bVar) {
            return ((b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                xga0 r7 = defpackage.xga0.this
                x7a0 r7 = r7.b
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                boolean r4 = r6.f
                java.lang.Object r7 = r7.g(r2, r4, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: xga0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.android.social.data.repository.SocialRepositoryImpl$deleteShareCode$1", f = "SocialRepositoryImpl.kt", l = {257, 257}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<myh<? super BaseResponse<Boolean>>, v1b<? super Unit>, Object> {
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
            c cVar = xga0.this.new c(this.e, v1bVar);
            cVar.c = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<Boolean>> myhVar, v1b<? super Unit> v1bVar) {
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
                xga0 r7 = defpackage.xga0.this
                x7a0 r7 = r7.b
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.a(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: xga0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.android.social.data.repository.SocialRepositoryImpl$followUserSocialPage$1", f = "SocialRepositoryImpl.kt", l = {65, 67, 68, 70}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<myh<? super BaseResponse<Void>>, v1b<? super Unit>, Object> {
        public BaseResponse a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = xga0.this.new d(this.e, v1bVar);
            dVar.c = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<Void>> myhVar, v1b<? super Unit> v1bVar) {
            return ((d) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
        
            if (r12.b(r9, true, r11) == r3) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
        
            if (r2.emit(r12, r11) == r3) goto L29;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                xga0 r0 = defpackage.xga0.this
                com.sportybet.android.social.data.local.SocialDatabase r1 = r0.a
                java.lang.Object r2 = r11.c
                myh r2 = (defpackage.myh) r2
                y5b r3 = defpackage.y5b.a
                int r4 = r11.b
                r5 = 0
                r6 = 4
                r7 = 3
                r8 = 2
                java.lang.String r9 = r11.e
                r10 = 1
                if (r4 == 0) goto L37
                if (r4 == r10) goto L33
                if (r4 == r8) goto L2d
                if (r4 == r7) goto L27
                if (r4 != r6) goto L21
                defpackage.uj50.b(r12)
                goto L80
            L21:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r11)
                return r5
            L27:
                com.sporty.android.common.network.data.BaseResponse r0 = r11.a
                defpackage.uj50.b(r12)
                goto L72
            L2d:
                com.sporty.android.common.network.data.BaseResponse r0 = r11.a
                defpackage.uj50.b(r12)
                goto L61
            L33:
                defpackage.uj50.b(r12)
                goto L47
            L37:
                defpackage.uj50.b(r12)
                x7a0 r12 = r0.b
                r11.c = r2
                r11.b = r10
                java.lang.Object r12 = r12.k(r9, r11)
                if (r12 != r3) goto L47
                goto L7f
            L47:
                com.sporty.android.common.network.data.BaseResponse r12 = (com.sporty.android.common.network.data.BaseResponse) r12
                boolean r0 = r12.isSuccessful()
                if (r0 == 0) goto L73
                j9a0 r0 = r1.y()
                r11.c = r2
                r11.a = r12
                r11.b = r8
                java.lang.Object r0 = r0.b(r9, r10, r11)
                if (r0 != r3) goto L60
                goto L7f
            L60:
                r0 = r12
            L61:
                z9a0 r12 = r1.A()
                r11.c = r2
                r11.a = r0
                r11.b = r7
                java.lang.Object r12 = r12.b(r9, r10, r11)
                if (r12 != r3) goto L72
                goto L7f
            L72:
                r12 = r0
            L73:
                r11.c = r5
                r11.a = r5
                r11.b = r6
                java.lang.Object r11 = r2.emit(r12, r11)
                if (r11 != r3) goto L80
            L7f:
                return r3
            L80:
                kotlin.Unit r11 = kotlin.Unit.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: xga0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.android.social.data.repository.SocialRepositoryImpl$getBookingCodeInfo$1", f = "SocialRepositoryImpl.kt", l = {283, 283}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<myh<? super BaseResponse<BookingData>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = xga0.this.new e(this.e, v1bVar);
            eVar.c = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<BookingData>> myhVar, v1b<? super Unit> v1bVar) {
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
                xga0 r7 = defpackage.xga0.this
                gbd0 r7 = r7.d
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.f(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: xga0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.android.social.data.repository.SocialRepositoryImpl$getMyShareCode$1", f = "SocialRepositoryImpl.kt", l = {252, 252}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<myh<? super BaseResponse<SocShareCode>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, v1b<? super f> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            f fVar = xga0.this.new f(this.e, v1bVar);
            fVar.c = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<SocShareCode>> myhVar, v1b<? super Unit> v1bVar) {
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
                xga0 r7 = defpackage.xga0.this
                x7a0 r7 = r7.b
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.b(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: xga0.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.android.social.data.repository.SocialRepositoryImpl$getMySocialMetaData$1", f = "SocialRepositoryImpl.kt", l = {60, 60}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements Function2<myh<? super BaseResponse<SocialMetaData>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public g(v1b<? super g> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            g gVar = xga0.this.new g(v1bVar);
            gVar.c = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<SocialMetaData>> myhVar, v1b<? super Unit> v1bVar) {
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
                xga0 r7 = defpackage.xga0.this
                x7a0 r7 = r7.b
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.f(r6)
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
            throw new UnsupportedOperationException("Method not decompiled: xga0.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.android.social.data.repository.SocialRepositoryImpl$getUserShareCode$1", f = "SocialRepositoryImpl.kt", l = {265, 265}, m = "invokeSuspend", v = 2)
    public static final class h extends tje0 implements Function2<myh<? super BaseResponse<SocShareCode>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2, v1b<? super h> v1bVar) {
            super(2, v1bVar);
            this.e = str;
            this.f = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            h hVar = xga0.this.new h(this.e, this.f, v1bVar);
            hVar.c = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<SocShareCode>> myhVar, v1b<? super Unit> v1bVar) {
            return ((h) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                xga0 r7 = defpackage.xga0.this
                gbd0 r7 = r7.d
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.String r4 = r6.f
                java.lang.Object r7 = r7.a(r2, r4, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: xga0.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.android.social.data.repository.SocialRepositoryImpl$getUserSocialMetaData$1", f = "SocialRepositoryImpl.kt", l = {55, 55}, m = "invokeSuspend", v = 2)
    public static final class i extends tje0 implements Function2<myh<? super BaseResponse<SocialMetaData>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, v1b<? super i> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            i iVar = xga0.this.new i(this.e, v1bVar);
            iVar.c = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<SocialMetaData>> myhVar, v1b<? super Unit> v1bVar) {
            return ((i) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                xga0 r7 = defpackage.xga0.this
                gbd0 r7 = r7.d
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
            throw new UnsupportedOperationException("Method not decompiled: xga0.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.android.social.data.repository.SocialRepositoryImpl$isMyShareCodePublished$1", f = "SocialRepositoryImpl.kt", l = {275, 275}, m = "invokeSuspend", v = 2)
    public static final class j extends tje0 implements Function2<myh<? super BaseResponse<Boolean>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, v1b<? super j> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            j jVar = xga0.this.new j(this.e, v1bVar);
            jVar.c = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<Boolean>> myhVar, v1b<? super Unit> v1bVar) {
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
                xga0 r7 = defpackage.xga0.this
                g3z r7 = r7.c
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.l(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: xga0.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.android.social.data.repository.SocialRepositoryImpl$unfollowUserSocialPage$1", f = "SocialRepositoryImpl.kt", l = {75, 77, 78, 80}, m = "invokeSuspend", v = 2)
    public static final class k extends tje0 implements Function2<myh<? super BaseResponse<Void>>, v1b<? super Unit>, Object> {
        public BaseResponse a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, v1b<? super k> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            k kVar = xga0.this.new k(this.e, v1bVar);
            kVar.c = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<Void>> myhVar, v1b<? super Unit> v1bVar) {
            return ((k) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
        
            if (r13.b(r11, false, r12) == r3) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        
            if (r2.emit(r13, r12) == r3) goto L29;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                xga0 r0 = defpackage.xga0.this
                com.sportybet.android.social.data.local.SocialDatabase r1 = r0.a
                java.lang.Object r2 = r12.c
                myh r2 = (defpackage.myh) r2
                y5b r3 = defpackage.y5b.a
                int r4 = r12.b
                r5 = 0
                r6 = 0
                r7 = 4
                r8 = 3
                r9 = 2
                r10 = 1
                java.lang.String r11 = r12.e
                if (r4 == 0) goto L38
                if (r4 == r10) goto L34
                if (r4 == r9) goto L2e
                if (r4 == r8) goto L28
                if (r4 != r7) goto L22
                defpackage.uj50.b(r13)
                goto L81
            L22:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r12)
                return r5
            L28:
                com.sporty.android.common.network.data.BaseResponse r0 = r12.a
                defpackage.uj50.b(r13)
                goto L73
            L2e:
                com.sporty.android.common.network.data.BaseResponse r0 = r12.a
                defpackage.uj50.b(r13)
                goto L62
            L34:
                defpackage.uj50.b(r13)
                goto L48
            L38:
                defpackage.uj50.b(r13)
                x7a0 r13 = r0.b
                r12.c = r2
                r12.b = r10
                java.lang.Object r13 = r13.h(r11, r12)
                if (r13 != r3) goto L48
                goto L80
            L48:
                com.sporty.android.common.network.data.BaseResponse r13 = (com.sporty.android.common.network.data.BaseResponse) r13
                boolean r0 = r13.isSuccessful()
                if (r0 == 0) goto L74
                j9a0 r0 = r1.y()
                r12.c = r2
                r12.a = r13
                r12.b = r9
                java.lang.Object r0 = r0.b(r11, r6, r12)
                if (r0 != r3) goto L61
                goto L80
            L61:
                r0 = r13
            L62:
                z9a0 r13 = r1.A()
                r12.c = r2
                r12.a = r0
                r12.b = r8
                java.lang.Object r13 = r13.b(r11, r6, r12)
                if (r13 != r3) goto L73
                goto L80
            L73:
                r13 = r0
            L74:
                r12.c = r5
                r12.a = r5
                r12.b = r7
                java.lang.Object r12 = r2.emit(r13, r12)
                if (r12 != r3) goto L81
            L80:
                return r3
            L81:
                kotlin.Unit r12 = kotlin.Unit.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: xga0.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.android.social.data.repository.SocialRepositoryImpl$updateBioInfo$1", f = "SocialRepositoryImpl.kt", l = {320, 320}, m = "invokeSuspend", v = 2)
    public static final class l extends tje0 implements Function2<myh<? super BaseResponse<Void>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, v1b<? super l> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            l lVar = xga0.this.new l(this.e, v1bVar);
            lVar.c = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<Void>> myhVar, v1b<? super Unit> v1bVar) {
            return ((l) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                xga0 r7 = defpackage.xga0.this
                x7a0 r7 = r7.b
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
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
            throw new UnsupportedOperationException("Method not decompiled: xga0.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public xga0(SocialDatabase socialDatabase, x7a0 x7a0Var, g3z g3zVar, gbd0 gbd0Var, k5b k5bVar, bnh0 bnh0Var) {
        this.a = socialDatabase;
        this.b = x7a0Var;
        this.c = g3zVar;
        this.d = gbd0Var;
        this.e = k5bVar;
        this.f = bnh0Var;
        new LinkedHashMap();
    }

    @Override // defpackage.vga0
    public final lyh<BaseResponse<BookingData>> a(String str, boolean z) {
        str.getClass();
        or60 or60Var = new or60(new b(str, z, null));
        pfd pfdVar = fse.a;
        return ozh.c(or60Var, odd.b);
    }

    @Override // defpackage.vga0
    public final lyh<BaseResponse<Void>> b(String str) {
        str.getClass();
        return ozh.c(new or60(new d(str, null)), this.e);
    }

    @Override // defpackage.vga0
    public final lyh c(int i2, String str) {
        return ozh.c(new or60(new aha0(this, i2, str, null)), this.e);
    }

    @Override // defpackage.vga0
    public final lyh<BaseResponse<SocShareCode>> d(String str, String str2) {
        return ozh.c(new or60(new h(str, str2, null)), this.e);
    }

    @Override // defpackage.vga0
    public final lyh e(int i2, String str) {
        return ozh.c(new or60(new bha0(this, i2, str, null)), this.e);
    }

    @Override // defpackage.vga0
    public final lyh<BaseResponse<Void>> f(String str, String str2) {
        str.getClass();
        return ozh.c(new or60(new a(str, str2, null)), this.e);
    }

    @Override // defpackage.vga0
    public final lyh g(String str) {
        return ozh.c(new or60(new zga0(this, str, null)), this.e);
    }

    @Override // defpackage.vga0
    public final lyh<BaseResponse<SocialMetaData>> i(String str) {
        return ozh.c(new or60(new i(str, null)), this.e);
    }

    @Override // defpackage.vga0
    public final lyh<BaseResponse<BookingData>> k(String str, String str2) {
        str.getClass();
        return ozh.c(new or60(new e(str, null)), this.e);
    }

    @Override // defpackage.vga0
    public final lyh<BaseResponse<Void>> l(String str) {
        return ozh.c(new or60(new k(str, null)), this.e);
    }

    @Override // defpackage.vga0
    public final lyh<kqz<SocShareCodeEntity>> m(final y7a0 y7a0Var) {
        LinkedHashMap linkedHashMap = this.g;
        koz kozVar = (koz) linkedHashMap.get(y7a0Var);
        if (kozVar == null) {
            kozVar = new koz(new iqz(20, 0, false, 0, 0, 62), new tha0(y7a0Var, this.a, this.b, this.d), new Function0() { // from class: wga0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.a.C().a(y7a0Var.a);
                }
            });
            linkedHashMap.put(y7a0Var, kozVar);
        }
        return ozh.c(kozVar.a, this.e);
    }

    @Override // defpackage.vga0
    public final lyh<BaseResponse<SocShareCode>> n(String str) {
        return ozh.c(new or60(new f(str, null)), this.e);
    }

    @Override // defpackage.vga0
    public final lyh o(int i2, String str) {
        return ozh.c(new or60(new yga0(this, i2, str, null)), this.e);
    }

    @Override // defpackage.vga0
    public final lyh<BaseResponse<Boolean>> p(String str) {
        str.getClass();
        return ozh.c(new or60(new j(str, null)), this.e);
    }

    @Override // defpackage.vga0
    public final lyh<kqz<SocialFollowerEntity>> q(v8a0 v8a0Var) {
        LinkedHashMap linkedHashMap = this.h;
        koz kozVar = (koz) linkedHashMap.get(v8a0Var);
        if (kozVar == null) {
            kozVar = new koz(new iqz(20, 0, false, 0, 0, 62), new t9a0(v8a0Var, this.a, this.b, this.d, this.f), new x5j(1, this, v8a0Var));
            linkedHashMap.put(v8a0Var, kozVar);
        }
        return ozh.c(kozVar.a, this.e);
    }

    @Override // defpackage.vga0
    public final lyh<BaseResponse<Void>> r(String str) {
        return ozh.c(new or60(new l(str, null)), this.e);
    }

    @Override // defpackage.vga0
    public final lyh<BaseResponse<SocialMetaData>> s() {
        return ozh.c(new or60(new g(null)), this.e);
    }

    @Override // defpackage.vga0
    public final lyh<BaseResponse<Boolean>> t(String str) {
        str.getClass();
        return ozh.c(new or60(new c(str, null)), this.e);
    }

    @Override // defpackage.vga0
    public final lyh<kqz<SocialFollowingEntity>> u(v8a0 v8a0Var) {
        LinkedHashMap linkedHashMap = this.i;
        koz kozVar = (koz) linkedHashMap.get(v8a0Var);
        if (kozVar == null) {
            kozVar = new koz(new iqz(20, 0, false, 0, 0, 62), new iaa0(v8a0Var, this.a, this.b, this.d, this.f), new vq10(1, this, v8a0Var));
            linkedHashMap.put(v8a0Var, kozVar);
        }
        return ozh.c(kozVar.a, this.e);
    }
}
