package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.share.manager.WonPopupSharingManagerImpl$generateWonPopupShareUri$2", f = "WonPopupSharingManagerImpl.kt", l = {74, 78, HttpStatusCodesKt.HTTP_PROCESSING}, m = "invokeSuspend", v = 2)
public final class kuj0 extends tje0 implements Function2<myh<? super g090>, v1b<? super Unit>, Object> {
    public Context a;
    public euj0.a b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ euj0 e;
    public final /* synthetic */ Configuration f;
    public final /* synthetic */ String i;

    @c0d(c = "com.sportybet.android.share.manager.WonPopupSharingManagerImpl$generateWonPopupShareUri$2$4", f = "WonPopupSharingManagerImpl.kt", l = {HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<myh<? super g090>, Throwable, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super g090> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            a aVar = new a(3, v1bVar);
            aVar.b = myhVar;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            myh myhVar = this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                g090.a aVar = g090.a.a;
                this.b = null;
                this.a = 1;
                if (myhVar.emit(aVar, this) == y5bVar) {
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

    public static final class b<T> implements myh {
        public final /* synthetic */ myh<g090> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(myh<? super g090> myhVar) {
            this.a = myhVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            return this.a.emit((g090) obj, v1bVar);
        }
    }

    @c0d(c = "com.sportybet.android.share.manager.WonPopupSharingManagerImpl$generateWonPopupShareUri$2$cached$1", f = "WonPopupSharingManagerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Uri>, Object> {
        public final /* synthetic */ euj0 a;
        public final /* synthetic */ euj0.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(euj0 euj0Var, euj0.a aVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.a = euj0Var;
            this.b = aVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Uri> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Uri uriC;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            euj0 euj0Var = this.a;
            File fileF = euj0Var.f();
            if (!fileF.exists() || fileF.length() <= 0) {
                uriC = null;
            } else {
                Context context = euj0Var.a;
                uriC = mkh.c(context, yrh0.h(context), fileF);
                uriC.getClass();
            }
            if (uriC != null) {
                if (Intrinsics.g(this.a.f, this.b)) {
                    return uriC;
                }
            }
            return null;
        }
    }

    public static final class d implements lyh<g090> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ euj0 b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ euj0.a d;

        @c0d(c = "com.sportybet.android.share.manager.WonPopupSharingManagerImpl$generateWonPopupShareUri$2$invokeSuspend$$inlined$map$1", f = "WonPopupSharingManagerImpl.kt", l = {109}, m = "collect", v = 2)
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
                return d.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ euj0 b;
            public final /* synthetic */ Context c;
            public final /* synthetic */ euj0.a d;

            @c0d(c = "com.sportybet.android.share.manager.WonPopupSharingManagerImpl$generateWonPopupShareUri$2$invokeSuspend$$inlined$map$1$2", f = "WonPopupSharingManagerImpl.kt", l = {62, 50}, m = "emit", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;
                public myh d;

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

            public b(myh myhVar, euj0 euj0Var, Context context, euj0.a aVar) {
                this.a = myhVar;
                this.b = euj0Var;
                this.c = context;
                this.d = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
            
                if (r14.emit(r13, r0) == r1) goto L26;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r14, defpackage.v1b r15) {
                /*
                    r13 = this;
                    boolean r0 = r15 instanceof kuj0.d.b.a
                    if (r0 == 0) goto L13
                    r0 = r15
                    kuj0$d$b$a r0 = (kuj0.d.b.a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    kuj0$d$b$a r0 = new kuj0$d$b$a
                    r0.<init>(r15)
                L18:
                    java.lang.Object r15 = r0.a
                    y5b r1 = defpackage.y5b.a
                    int r2 = r0.b
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L37
                    if (r2 == r4) goto L31
                    if (r2 != r3) goto L2b
                    defpackage.uj50.b(r15)
                    goto L8e
                L2b:
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r13)
                    return r5
                L31:
                    myh r14 = r0.d
                    defpackage.uj50.b(r15)
                    goto L71
                L37:
                    defpackage.uj50.b(r15)
                    myh r15 = r13.a
                    com.sportybet.plugin.realsports.data.RTicket r14 = (com.sportybet.plugin.realsports.data.RTicket) r14
                    java.lang.String r7 = r14.totalWinnings
                    r7.getClass()
                    java.lang.String r10 = r14.verifyCode
                    int r2 = r14.settleType
                    int r14 = r14.percent
                    java.lang.Integer r6 = new java.lang.Integer
                    r6.<init>(r14)
                    lr00$a r14 = defpackage.lr00.b
                    int r9 = r6.intValue()
                    com.sportybet.feature.winning.domain.model.WinningShareData r6 = new com.sportybet.feature.winning.domain.model.WinningShareData
                    java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
                    java.lang.String r8 = "recent_winning_order"
                    r6.<init>(r7, r8, r9, r10, r11)
                    euj0 r14 = r13.b
                    android.content.Context r2 = r13.c
                    r0.d = r15
                    r0.b = r4
                    java.lang.Comparable r14 = r14.e(r6, r2, r0)
                    if (r14 != r1) goto L6e
                    goto L8d
                L6e:
                    r12 = r15
                    r15 = r14
                    r14 = r12
                L71:
                    android.net.Uri r15 = (android.net.Uri) r15
                    if (r15 == 0) goto L81
                    euj0 r2 = r13.b
                    euj0$a r13 = r13.d
                    r2.f = r13
                    g090$b r13 = new g090$b
                    r13.<init>(r15)
                    goto L83
                L81:
                    g090$a r13 = g090.a.a
                L83:
                    r0.d = r5
                    r0.b = r3
                    java.lang.Object r13 = r14.emit(r13, r0)
                    if (r13 != r1) goto L8e
                L8d:
                    return r1
                L8e:
                    kotlin.Unit r13 = kotlin.Unit.a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: kuj0.d.b.emit(java.lang.Object, v1b):java.lang.Object");
            }
        }

        public d(lyh lyhVar, euj0 euj0Var, Context context, euj0.a aVar) {
            this.a = lyhVar;
            this.b = euj0Var;
            this.c = context;
            this.d = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super g090> myhVar, v1b v1bVar) {
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
                b bVar = new b(myhVar, this.b, this.c, this.d);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuj0(euj0 euj0Var, Configuration configuration, String str, v1b<? super kuj0> v1bVar) {
        super(2, v1bVar);
        this.e = euj0Var;
        this.f = configuration;
        this.i = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kuj0 kuj0Var = new kuj0(this.e, this.f, this.i, v1bVar);
        kuj0Var.d = obj;
        return kuj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super g090> myhVar, v1b<? super Unit> v1bVar) {
        return ((kuj0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        if (r2.emit(r0, r13) == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bc, code lost:
    
        if (r1.collect(r14, r13) == r3) goto L32;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            euj0 r0 = r13.e
            h940 r1 = r0.b
            java.lang.Object r2 = r13.d
            myh r2 = (defpackage.myh) r2
            y5b r3 = defpackage.y5b.a
            int r4 = r13.c
            java.lang.String r5 = r13.i
            r6 = 2
            r7 = 1
            r8 = 3
            r9 = 0
            if (r4 == 0) goto L31
            if (r4 == r7) goto L29
            if (r4 == r6) goto L25
            if (r4 != r8) goto L1f
            defpackage.uj50.b(r14)
            goto Lbf
        L1f:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r13)
            return r9
        L25:
            defpackage.uj50.b(r14)
            goto L89
        L29:
            euj0$a r4 = r13.b
            android.content.Context r7 = r13.a
            defpackage.uj50.b(r14)
            goto L71
        L31:
            defpackage.uj50.b(r14)
            android.content.Context r14 = r0.a
            android.content.res.Configuration r4 = r13.f
            if (r4 != 0) goto L42
            android.content.res.Resources r4 = r14.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
        L42:
            android.content.Context r14 = r14.createConfigurationContext(r4)
            r14.getClass()
            euj0$a r4 = new euj0$a
            android.content.res.Resources r10 = r14.getResources()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            int r10 = r10.widthPixels
            r4.<init>(r5, r10)
            k5b r10 = r0.e
            kuj0$c r11 = new kuj0$c
            r11.<init>(r0, r4, r9)
            r13.d = r2
            r13.a = r14
            r13.b = r4
            r13.c = r7
            java.lang.Object r7 = defpackage.ej5.d(r10, r11, r13)
            if (r7 != r3) goto L6e
            goto Lbe
        L6e:
            r12 = r7
            r7 = r14
            r14 = r12
        L71:
            android.net.Uri r14 = (android.net.Uri) r14
            if (r14 == 0) goto L8c
            g090$b r0 = new g090$b
            r0.<init>(r14)
            r13.d = r9
            r13.a = r9
            r13.b = r9
            r13.c = r6
            java.lang.Object r13 = r2.emit(r0, r13)
            if (r13 != r3) goto L89
            goto Lbe
        L89:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        L8c:
            com.sportybet.plugin.realsports.data.RTicket r14 = r1.y()
            if (r14 == 0) goto L98
            gzh r1 = new gzh
            r1.<init>(r14)
            goto L9c
        L98:
            lyh r1 = r1.q(r5)
        L9c:
            kuj0$d r14 = new kuj0$d
            r14.<init>(r1, r0, r7, r4)
            kuj0$a r0 = new kuj0$a
            r0.<init>(r8, r9)
            yzh r1 = new yzh
            r1.<init>(r14, r0)
            kuj0$b r14 = new kuj0$b
            r14.<init>(r2)
            r13.d = r9
            r13.a = r9
            r13.b = r9
            r13.c = r8
            java.lang.Object r13 = r1.collect(r14, r13)
            if (r13 != r3) goto Lbf
        Lbe:
            return r3
        Lbf:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kuj0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
