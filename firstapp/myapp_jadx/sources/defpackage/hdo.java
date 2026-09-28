package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.android.instantwin.presentation.model.BetSlipData;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class hdo implements fdo {
    public final yho a;
    public final JsonSerializeService b;
    public final j1b c;
    public final Type d;

    @c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinBetslipCacheRepoImpl$clearAllSelectionsForSport$1", f = "InstantWinBetslipCacheRepoImpl.kt", l = {74, 75}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return hdo.this.new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (r0.a.b(defpackage.inm.a("iw_last_round_id_", r3), r6) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                hdo r0 = defpackage.hdo.this
                yho r0 = r0.a
                y5b r1 = defpackage.y5b.a
                int r2 = r6.a
                java.lang.String r3 = r6.c
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L21
                if (r2 == r5) goto L1d
                if (r2 != r4) goto L16
                defpackage.uj50.b(r7)
                goto L46
            L16:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                r6 = 0
                return r6
            L1d:
                defpackage.uj50.b(r7)
                goto L35
            L21:
                defpackage.uj50.b(r7)
                r6.a = r5
                java.lang.String r7 = "iw_cache_selections_"
                java.lang.String r7 = defpackage.inm.a(r7, r3)
                zed r2 = r0.a
                java.lang.Object r7 = r2.b(r7, r6)
                if (r7 != r1) goto L35
                goto L45
            L35:
                r6.a = r4
                java.lang.String r7 = "iw_last_round_id_"
                java.lang.String r7 = defpackage.inm.a(r7, r3)
                zed r0 = r0.a
                java.lang.Object r6 = r0.b(r7, r6)
                if (r6 != r1) goto L46
            L45:
                return r1
            L46:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: hdo.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinBetslipCacheRepoImpl$saveBetslipIndex$1", f = "InstantWinBetslipCacheRepoImpl.kt", l = {81}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, int i, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = str;
            this.d = i;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return hdo.this.new b(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                yho yhoVar = hdo.this.a;
                String strA = inm.a("iw_last_betslip_type_", this.c);
                Integer num = new Integer(this.d);
                this.a = 1;
                if (yhoVar.a.putInt(strA, num, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinBetslipCacheRepoImpl$saveSelections$1", f = "InstantWinBetslipCacheRepoImpl.kt", l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, 29, 30, 40, 41}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public yho a;
        public hdo b;
        public String c;
        public String d;
        public yho e;
        public int f;
        public /* synthetic */ Object i;
        public final /* synthetic */ String w;
        public final /* synthetic */ String y;
        public final /* synthetic */ Collection<BetSlipData> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, String str2, Collection<? extends BetSlipData> collection, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.w = str;
            this.y = str2;
            this.z = collection;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = hdo.this.new c(this.w, this.y, this.z, v1bVar);
            cVar.i = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x009e  */
        /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:42:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:44:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:47:0x00e9  */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x010d, code lost:
        
            if (r3.a.putString(r2, r8, r16) == r4) goto L50;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 275
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: hdo.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public hdo(yho yhoVar, JsonSerializeService jsonSerializeService, j1b j1bVar) {
        jsonSerializeService.getClass();
        this.a = yhoVar;
        this.b = jsonSerializeService;
        this.c = j1bVar;
        this.d = new gdo().getType();
    }

    @Override // defpackage.fdo
    public final void a(String str, String str2, Collection<? extends BetSlipData> collection) {
        str.getClass();
        str2.getClass();
        ej5.c(this.c, null, null, new c(str, str2, collection, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x010f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0103, code lost:
    
        if (r5.a.b(defpackage.inm.a("iw_last_round_id_", r13), r0) == r1) goto L61;
     */
    @Override // defpackage.fdo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r13, java.lang.String r14, defpackage.x1b r15) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hdo.b(java.lang.String, java.lang.String, x1b):java.lang.Object");
    }

    @Override // defpackage.fdo
    public final zed.s c(String str) {
        str.getClass();
        return (zed.s) this.a.a.getIntFlow("iw_last_betslip_type_".concat(str), -1);
    }

    @Override // defpackage.fdo
    public final void d(String str) {
        str.getClass();
        ej5.c(this.c, null, null, new a(str, null), 3);
    }

    @Override // defpackage.fdo
    public final void e(int i, String str) {
        str.getClass();
        ej5.c(this.c, null, null, new b(str, i, null), 3);
    }
}
