package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.sportytv.data.Program;
import com.sporty.android.sportytv.data.TvConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class bfd0 implements afd0 {
    public final vdd0 a;

    @c0d(c = "com.sporty.android.sportytv.repository.SportyTvRepoImpl$addNotification$1", f = "SportyTvRepoImpl.kt", l = {24, 24}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super BaseResponse<xdp>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = bfd0.this.new a(this.e, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<xdp>> myhVar, v1b<? super Unit> v1bVar) {
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
                bfd0 r7 = defpackage.bfd0.this
                vdd0 r7 = r7.a
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
            throw new UnsupportedOperationException("Method not decompiled: bfd0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.sportytv.repository.SportyTvRepoImpl$deleteNotification$1", f = "SportyTvRepoImpl.kt", l = {28, 28}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super BaseResponse<xdp>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = bfd0.this.new b(this.e, v1bVar);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<xdp>> myhVar, v1b<? super Unit> v1bVar) {
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
                bfd0 r7 = defpackage.bfd0.this
                vdd0 r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.d(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: bfd0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.sportytv.repository.SportyTvRepoImpl$getConfig$1", f = "SportyTvRepoImpl.kt", l = {16, 16}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<myh<? super BaseResponse<TvConfig>>, v1b<? super Unit>, Object> {
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
            c cVar = bfd0.this.new c(this.e, v1bVar);
            cVar.c = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<TvConfig>> myhVar, v1b<? super Unit> v1bVar) {
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
                bfd0 r7 = defpackage.bfd0.this
                vdd0 r7 = r7.a
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
            throw new UnsupportedOperationException("Method not decompiled: bfd0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.sportytv.repository.SportyTvRepoImpl$getProgramList$1", f = "SportyTvRepoImpl.kt", l = {20, 20}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<myh<? super BaseResponse<List<? extends Program>>>, v1b<? super Unit>, Object> {
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
            d dVar = bfd0.this.new d(this.e, this.f, v1bVar);
            dVar.c = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<List<? extends Program>>> myhVar, v1b<? super Unit> v1bVar) {
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
                bfd0 r7 = defpackage.bfd0.this
                vdd0 r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.String r4 = r6.f
                java.lang.Object r7 = r7.e(r2, r4, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: bfd0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public bfd0(vdd0 vdd0Var) {
        this.a = vdd0Var;
    }

    @Override // defpackage.afd0
    public final lyh<BaseResponse<xdp>> a(String str) {
        str.getClass();
        or60 or60Var = new or60(new a(str, null));
        pfd pfdVar = fse.a;
        return ozh.c(or60Var, odd.b);
    }

    @Override // defpackage.afd0
    public final lyh<BaseResponse<xdp>> b(String str) {
        str.getClass();
        or60 or60Var = new or60(new b(str, null));
        pfd pfdVar = fse.a;
        return ozh.c(or60Var, odd.b);
    }

    @Override // defpackage.afd0
    public final lyh<BaseResponse<TvConfig>> c(String str) {
        str.getClass();
        or60 or60Var = new or60(new c(str, null));
        pfd pfdVar = fse.a;
        return ozh.c(or60Var, odd.b);
    }

    @Override // defpackage.afd0
    public final lyh<BaseResponse<List<Program>>> d(String str, String str2) {
        str.getClass();
        or60 or60Var = new or60(new d(str, str2, null));
        pfd pfdVar = fse.a;
        return ozh.c(or60Var, odd.b);
    }

    @Override // defpackage.afd0
    public final lyh e(String str, String str2) {
        str.getClass();
        str2.getClass();
        or60 or60Var = new or60(new cfd0(this, str, str2, null));
        pfd pfdVar = fse.a;
        return ozh.c(or60Var, odd.b);
    }
}
