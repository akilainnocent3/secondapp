package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.recentcode.RecentCodeConfigData;
import com.sporty.android.core.model.recentcode.RecentShareCode;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes7.dex */
public final class xg40 implements vg40 {
    public final g3z a;
    public final m2l b;
    public final mgb0 c;
    public final JsonSerializeService d;
    public final wwd0 e = xwd0.a(lk50.b.a);

    @c0d(c = "com.sportybet.plugin.realsports.betslip.recentcode.repo.RecentCodeRepoImpl$checkRecentCodeEnabled$1", f = "RecentCodeRepoImpl.kt", l = {DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super Boolean>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(1, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return xg40.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super Boolean> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                g3z g3zVar = xg40.this.a;
                this.a = 1;
                obj = g3zVar.h(this);
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
            return Boolean.valueOf(((RecentCodeConfigData) n52.b((BaseResponse) obj)).getFeatureEnabled());
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.betslip.recentcode.repo.RecentCodeRepoImpl$fetchRecentCodeList$1", f = "RecentCodeRepoImpl.kt", l = {35, 35}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super BaseResponse<RecentShareCode>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ List<String> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<String> list, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.e = list;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = xg40.this.new b(this.e, v1bVar);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<RecentShareCode>> myhVar, v1b<? super Unit> v1bVar) {
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
                xg40 r7 = defpackage.xg40.this
                g3z r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.util.List<java.lang.String> r2 = r6.e
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
            throw new UnsupportedOperationException("Method not decompiled: xg40.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public xg40(g3z g3zVar, m2l m2lVar, mgb0 mgb0Var, JsonSerializeService jsonSerializeService) {
        this.a = g3zVar;
        this.b = m2lVar;
        this.c = mgb0Var;
        this.d = jsonSerializeService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r7 == r1) goto L28;
     */
    @Override // defpackage.vg40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.x1b r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.yg40
            if (r0 == 0) goto L13
            r0 = r7
            yg40 r0 = (defpackage.yg40) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yg40 r0 = new yg40
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.uj50.b(r7)
            goto L69
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L31:
            defpackage.uj50.b(r7)
            goto L43
        L35:
            defpackage.uj50.b(r7)
            r0.c = r5
            mgb0 r7 = r6.c
            java.lang.Object r7 = r7.getUserId(r0)
            if (r7 != r1) goto L43
            goto L68
        L43:
            r2 = r7
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L4d
            r3 = r7
        L4d:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L54
            m2g r6 = defpackage.m2g.a
            return r6
        L54:
            java.lang.String r7 = "recent_booking_codes_"
            java.lang.String r7 = r7.concat(r3)
            r0.c = r4
            m2l r2 = r6.b
            zed r2 = r2.a
            java.lang.String r3 = "[]"
            java.lang.Object r7 = r2.getString(r7, r3, r0)
            if (r7 != r1) goto L69
        L68:
            return r1
        L69:
            java.lang.String r7 = (java.lang.String) r7
            zg40 r0 = new zg40
            r0.<init>()
            java.lang.reflect.Type r0 = r0.getType()
            com.sporty.android.core.model.json.JsonSerializeService r6 = r6.d
            java.lang.Object r6 = r6.fromJson(r7, r0)
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L80
            m2g r6 = defpackage.m2g.a
        L80:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg40.a(x1b):java.lang.Object");
    }

    @Override // defpackage.vg40
    public final lyh<BaseResponse<RecentShareCode>> b(List<String> list) {
        list.getClass();
        or60 or60Var = new or60(new b(list, null));
        pfd pfdVar = fse.a;
        return ozh.c(or60Var, odd.b);
    }

    @Override // defpackage.vg40
    public final jvd0 c(List list) {
        list.getClass();
        zu7.a aVar = zu7.a;
        return ej5.c(zu7.a(), null, null, new ah40(this, list, null), 3);
    }

    @Override // defpackage.vg40
    public final lyh<lk50<Boolean>> d(pu0 pu0Var) {
        pu0Var.getClass();
        return su0.a(this.e, new pu0.a(RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS), new a(null));
    }

    @Override // defpackage.vg40
    public final jvd0 e(String str) {
        str.getClass();
        zu7.a aVar = zu7.a;
        return ej5.c(zu7.a(), null, null, new wg40(this, str, null), 3);
    }
}
