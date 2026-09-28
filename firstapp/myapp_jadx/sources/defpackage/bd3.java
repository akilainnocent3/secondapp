package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import com.sportybet.plugin.realsports.data.RTicket;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.share.manager.BetTicketSharingManagerImpl$generateTicketShareUri$2", f = "BetTicketSharingManagerImpl.kt", l = {48, 52, 74}, m = "invokeSuspend", v = 2)
public final class bd3 extends tje0 implements Function2<myh<? super g090>, v1b<? super Unit>, Object> {
    public Context a;
    public ad3.a b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ad3 e;
    public final /* synthetic */ Configuration f;
    public final /* synthetic */ String i;

    @c0d(c = "com.sportybet.android.share.manager.BetTicketSharingManagerImpl$generateTicketShareUri$2$3$1", f = "BetTicketSharingManagerImpl.kt", l = {61}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super g090>, Object> {
        public zy80 a;
        public int b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ ad3 d;
        public final /* synthetic */ RTicket e;
        public final /* synthetic */ ad3.a f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ad3 ad3Var, RTicket rTicket, ad3.a aVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = context;
            this.d = ad3Var;
            this.e = rTicket;
            this.f = aVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.c, this.d, this.e, this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super g090> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            zy80 zy80Var;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                Context context = this.c;
                context.getClass();
                zy80 zy80Var2 = new zy80(context, this.d.c);
                RTicket rTicket = this.e;
                this.a = zy80Var2;
                this.b = 1;
                if (zy80Var2.i(rTicket, this) == y5bVar) {
                    return y5bVar;
                }
                zy80Var = zy80Var2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zy80Var = this.a;
                uj50.b(obj);
            }
            String strB = zy80Var.b("showoff", this.e.winningStatus == 20);
            if (strB == null) {
                return g090.a.a;
            }
            this.d.e = this.f;
            return new g090.b(Uri.parse(strB));
        }
    }

    @c0d(c = "com.sportybet.android.share.manager.BetTicketSharingManagerImpl$generateTicketShareUri$2$4", f = "BetTicketSharingManagerImpl.kt", l = {73}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<myh<? super g090>, Throwable, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super g090> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            b bVar = new b(3, v1bVar);
            bVar.b = myhVar;
            return bVar.invokeSuspend(Unit.a);
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

    public static final class c<T> implements myh {
        public final /* synthetic */ myh<g090> a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(myh<? super g090> myhVar) {
            this.a = myhVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            return this.a.emit((g090) obj, v1bVar);
        }
    }

    @c0d(c = "com.sportybet.android.share.manager.BetTicketSharingManagerImpl$generateTicketShareUri$2$cached$1", f = "BetTicketSharingManagerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Uri>, Object> {
        public final /* synthetic */ ad3 a;
        public final /* synthetic */ ad3.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ad3 ad3Var, ad3.a aVar, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.a = ad3Var;
            this.b = aVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Uri> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Context context = this.a.a;
            File file = new File(context.getFilesDir(), "sportybetImage");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, "betshare_showoff.jpg");
            Uri uriC = (!file2.exists() || file2.length() <= 0) ? null : mkh.c(context, yrh0.h(context), file2);
            if (uriC != null) {
                if (Intrinsics.g(this.a.e, this.b)) {
                    return uriC;
                }
            }
            return null;
        }
    }

    public static final class e implements lyh<g090> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ ad3 b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ ad3.a d;

        @c0d(c = "com.sportybet.android.share.manager.BetTicketSharingManagerImpl$generateTicketShareUri$2$invokeSuspend$$inlined$map$1", f = "BetTicketSharingManagerImpl.kt", l = {109}, m = "collect", v = 2)
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
                return e.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ ad3 b;
            public final /* synthetic */ Context c;
            public final /* synthetic */ ad3.a d;

            @c0d(c = "com.sportybet.android.share.manager.BetTicketSharingManagerImpl$generateTicketShareUri$2$invokeSuspend$$inlined$map$1$2", f = "BetTicketSharingManagerImpl.kt", l = {51, 50}, m = "emit", v = 2)
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

            public b(myh myhVar, ad3 ad3Var, Context context, ad3.a aVar) {
                this.a = myhVar;
                this.b = ad3Var;
                this.c = context;
                this.d = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
            
                if (r12.emit(r14, r0) == r1) goto L21;
             */
            @Override // defpackage.myh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r13, defpackage.v1b r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof bd3.e.b.a
                    if (r0 == 0) goto L13
                    r0 = r14
                    bd3$e$b$a r0 = (bd3.e.b.a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    bd3$e$b$a r0 = new bd3$e$b$a
                    r0.<init>(r14)
                L18:
                    java.lang.Object r14 = r0.a
                    y5b r1 = defpackage.y5b.a
                    int r2 = r0.b
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L37
                    if (r2 == r4) goto L31
                    if (r2 != r3) goto L2b
                    defpackage.uj50.b(r14)
                    goto L63
                L2b:
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r12)
                    return r5
                L31:
                    myh r12 = r0.d
                    defpackage.uj50.b(r14)
                    goto L58
                L37:
                    defpackage.uj50.b(r14)
                    r9 = r13
                    com.sportybet.plugin.realsports.data.RTicket r9 = (com.sportybet.plugin.realsports.data.RTicket) r9
                    ad3 r8 = r12.b
                    k5b r13 = r8.d
                    bd3$a r6 = new bd3$a
                    ad3$a r10 = r12.d
                    r11 = 0
                    android.content.Context r7 = r12.c
                    r6.<init>(r7, r8, r9, r10, r11)
                    myh r12 = r12.a
                    r0.d = r12
                    r0.b = r4
                    java.lang.Object r14 = defpackage.ej5.d(r13, r6, r0)
                    if (r14 != r1) goto L58
                    goto L62
                L58:
                    r0.d = r5
                    r0.b = r3
                    java.lang.Object r12 = r12.emit(r14, r0)
                    if (r12 != r1) goto L63
                L62:
                    return r1
                L63:
                    kotlin.Unit r12 = kotlin.Unit.a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: bd3.e.b.emit(java.lang.Object, v1b):java.lang.Object");
            }
        }

        public e(lyh lyhVar, ad3 ad3Var, Context context, ad3.a aVar) {
            this.a = lyhVar;
            this.b = ad3Var;
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
    public bd3(ad3 ad3Var, Configuration configuration, String str, v1b<? super bd3> v1bVar) {
        super(2, v1bVar);
        this.e = ad3Var;
        this.f = configuration;
        this.i = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        bd3 bd3Var = new bd3(this.e, this.f, this.i, v1bVar);
        bd3Var.d = obj;
        return bd3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super g090> myhVar, v1b<? super Unit> v1bVar) {
        return ((bd3) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (r2.emit(r0, r13) == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
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
            ad3 r0 = r13.e
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
            goto Lb6
        L1f:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r13)
            return r9
        L25:
            defpackage.uj50.b(r14)
            goto L80
        L29:
            ad3$a r4 = r13.b
            android.content.Context r7 = r13.a
            defpackage.uj50.b(r14)
            goto L68
        L31:
            defpackage.uj50.b(r14)
            android.content.Context r14 = r0.a
            android.content.res.Configuration r4 = r13.f
            if (r4 != 0) goto L42
            android.content.res.Resources r4 = r14.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
        L42:
            android.content.Context r14 = r14.createConfigurationContext(r4)
            ad3$a r4 = new ad3$a
            int r10 = defpackage.zch0.f(r14)
            r4.<init>(r5, r10)
            k5b r10 = r0.d
            bd3$d r11 = new bd3$d
            r11.<init>(r0, r4, r9)
            r13.d = r2
            r13.a = r14
            r13.b = r4
            r13.c = r7
            java.lang.Object r7 = defpackage.ej5.d(r10, r11, r13)
            if (r7 != r3) goto L65
            goto Lb5
        L65:
            r12 = r7
            r7 = r14
            r14 = r12
        L68:
            android.net.Uri r14 = (android.net.Uri) r14
            if (r14 == 0) goto L83
            g090$b r0 = new g090$b
            r0.<init>(r14)
            r13.d = r9
            r13.a = r9
            r13.b = r9
            r13.c = r6
            java.lang.Object r13 = r2.emit(r0, r13)
            if (r13 != r3) goto L80
            goto Lb5
        L80:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        L83:
            com.sportybet.plugin.realsports.data.RTicket r14 = r1.y()
            if (r14 == 0) goto L8f
            gzh r1 = new gzh
            r1.<init>(r14)
            goto L93
        L8f:
            lyh r1 = r1.q(r5)
        L93:
            bd3$e r14 = new bd3$e
            r14.<init>(r1, r0, r7, r4)
            bd3$b r0 = new bd3$b
            r0.<init>(r8, r9)
            yzh r1 = new yzh
            r1.<init>(r14, r0)
            bd3$c r14 = new bd3$c
            r14.<init>(r2)
            r13.d = r9
            r13.a = r9
            r13.b = r9
            r13.c = r8
            java.lang.Object r13 = r1.collect(r14, r13)
            if (r13 != r3) goto Lb6
        Lb5:
            return r3
        Lb6:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bd3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
