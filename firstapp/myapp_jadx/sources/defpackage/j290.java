package defpackage;

import android.content.res.Configuration;
import android.net.Uri;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.ShareWinViewModel$getShareTicketUri$1", f = "ShareWinViewModel.kt", l = {169, 189}, m = "invokeSuspend", v = 2)
public final class j290 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ f290 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Configuration d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ x9h i;

    @c0d(c = "com.sportybet.plugin.realsports.viewmodel.ShareWinViewModel$getShareTicketUri$1$2", f = "ShareWinViewModel.kt", l = {188}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super r190>, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ f290 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, f290 f290Var) {
            super(2, v1bVar);
            this.b = f290Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super r190> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ku90<r190> ku90Var = this.b.A;
                r190.a aVar = r190.a.a;
                this.a = 1;
                if (ku90Var.a.emit(aVar, this) == y5bVar) {
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
        public final /* synthetic */ f290 a;
        public final /* synthetic */ x9h b;

        @c0d(c = "com.sportybet.plugin.realsports.viewmodel.ShareWinViewModel$getShareTicketUri$1$3", f = "ShareWinViewModel.kt", l = {190, 192}, m = "emit", v = 2)
        public static final class a extends x1b {
            public r190 a;
            public /* synthetic */ Object b;
            public final /* synthetic */ b<T> c;
            public int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, v1b<? super a> v1bVar) {
                super(v1bVar);
                this.c = bVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.d |= Integer.MIN_VALUE;
                return this.c.emit(null, this);
            }
        }

        public b(f290 f290Var, x9h x9hVar) {
            this.a = f290Var;
            this.b = x9hVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
        
            if (r5.C.a.emit(r8 != null ? defpackage.yk10.a(r7.a, r8) : null, r0) == r1) goto L40;
         */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(defpackage.r190 r8, defpackage.v1b<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof j290.b.a
                if (r0 == 0) goto L13
                r0 = r9
                j290$b$a r0 = (j290.b.a) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.d = r1
                goto L18
            L13:
                j290$b$a r0 = new j290$b$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.b
                y5b r1 = defpackage.y5b.a
                int r2 = r0.d
                r3 = 2
                r4 = 1
                f290 r5 = r7.a
                r6 = 0
                if (r2 == 0) goto L39
                if (r2 == r4) goto L33
                if (r2 != r3) goto L2d
                defpackage.uj50.b(r9)
                goto L8c
            L2d:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r6
            L33:
                r190 r8 = r0.a
                defpackage.uj50.b(r9)
                goto L4b
            L39:
                defpackage.uj50.b(r9)
                ku90<r190> r9 = r5.A
                r0.a = r8
                r0.d = r4
                b390 r9 = r9.a
                java.lang.Object r9 = r9.emit(r8, r0)
                if (r9 != r1) goto L4b
                goto L8b
            L4b:
                wwd0 r9 = r5.v
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                r9.getClass()
                r9.k(r6, r2)
                x9h r7 = r7.b
                if (r7 == 0) goto L8c
                r0.a = r6
                r0.d = r3
                boolean r9 = r8 instanceof r190.c
                if (r9 == 0) goto L64
                r190$c r8 = (r190.c) r8
                goto L65
            L64:
                r8 = r6
            L65:
                if (r8 == 0) goto L6a
                java.lang.String r8 = r8.a
                goto L6b
            L6a:
                r8 = r6
            L6b:
                if (r8 != 0) goto L79
                java.lang.String r8 = r7.b
                if (r8 == 0) goto L78
                int r9 = r8.length()
                if (r9 <= 0) goto L78
                goto L79
            L78:
                r8 = r6
            L79:
                ku90<java.lang.String> r9 = r5.C
                if (r8 == 0) goto L83
                java.lang.String r7 = r7.a
                java.lang.String r6 = defpackage.yk10.a(r7, r8)
            L83:
                b390 r7 = r9.a
                java.lang.Object r7 = r7.emit(r6, r0)
                if (r7 != r1) goto L8c
            L8b:
                return r1
            L8c:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: j290.b.emit(r190, v1b):java.lang.Object");
        }
    }

    public static final class c implements lyh<r190> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ f290 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        @c0d(c = "com.sportybet.plugin.realsports.viewmodel.ShareWinViewModel$getShareTicketUri$1$invokeSuspend$$inlined$map$1", f = "ShareWinViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return c.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ f290 b;
            public final /* synthetic */ String c;
            public final /* synthetic */ String d;
            public final /* synthetic */ String e;

            @c0d(c = "com.sportybet.plugin.realsports.viewmodel.ShareWinViewModel$getShareTicketUri$1$invokeSuspend$$inlined$map$1$2", f = "ShareWinViewModel.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, f290 f290Var, String str, String str2, String str3) {
                q190 q190Var = q190.a;
                this.a = myhVar;
                this.b = f290Var;
                this.c = str;
                this.d = str2;
                this.e = str3;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
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
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                r190 cVar;
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
                    Pair pair = (Pair) obj;
                    String str = (String) pair.a;
                    String str2 = (String) pair.b;
                    if (str == null && str2 == null) {
                        cVar = r190.b.a;
                    } else {
                        q190 q190Var = q190.a;
                        StringBuilder sb = new StringBuilder(inm.a("&orderId=", Uri.encode(this.c)));
                        sb.append("&showOffType=" + Uri.encode("SHOW_OFF"));
                        if (str != null) {
                            sb.append("&ticketDetailImageUri=" + Uri.encode(str));
                        }
                        if (str2 != null) {
                            sb.append("&winPopupImageUri=" + Uri.encode(str2));
                        }
                        sb.append("&description=" + Uri.encode(this.d));
                        sb.append("&hashtag=" + Uri.encode(this.e));
                        String string = sb.toString();
                        wwd0 wwd0Var = this.b.H;
                        wwd0Var.getClass();
                        wwd0Var.k(null, string);
                        cVar = new r190.c(string);
                    }
                    aVar.b = 1;
                    if (this.a.emit(cVar, aVar) == y5bVar) {
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

        public c(lyh lyhVar, f290 f290Var, String str, String str2, String str3) {
            q190 q190Var = q190.a;
            this.a = lyhVar;
            this.b = f290Var;
            this.c = str;
            this.d = str2;
            this.e = str3;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super r190> myhVar, v1b v1bVar) {
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
                q190 q190Var = q190.a;
                b bVar = new b(myhVar, this.b, this.c, this.d, this.e);
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
    public j290(f290 f290Var, String str, Configuration configuration, String str2, String str3, x9h x9hVar, v1b v1bVar) {
        super(2, v1bVar);
        q190 q190Var = q190.a;
        this.b = f290Var;
        this.c = str;
        this.d = configuration;
        this.e = str2;
        this.f = str3;
        this.i = x9hVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        q190 q190Var = q190.a;
        return new j290(this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((j290) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        if (r1.collect(r11, r10) == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r10.a
            r2 = 0
            f290 r5 = r10.b
            r9 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r9) goto L13
            defpackage.uj50.b(r11)
            goto L59
        L13:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r10)
            return r2
        L19:
            defpackage.uj50.b(r11)
            goto L2f
        L1d:
            defpackage.uj50.b(r11)
            eb90 r11 = r5.f
            r10.a = r3
            java.lang.String r1 = r10.c
            android.content.res.Configuration r3 = r10.d
            java.lang.Object r11 = r11.a(r1, r3, r10)
            if (r11 != r0) goto L2f
            goto L58
        L2f:
            r4 = r11
            lyh r4 = (defpackage.lyh) r4
            q190 r11 = defpackage.q190.a
            j290$c r3 = new j290$c
            java.lang.String r6 = r10.c
            java.lang.String r7 = r10.e
            java.lang.String r8 = r10.f
            r3.<init>(r4, r5, r6, r7, r8)
            j290$a r11 = new j290$a
            r11.<init>(r2, r5)
            xzh r1 = new xzh
            r1.<init>(r3, r11)
            j290$b r11 = new j290$b
            x9h r2 = r10.i
            r11.<init>(r5, r2)
            r10.a = r9
            java.lang.Object r10 = r1.collect(r11, r10)
            if (r10 != r0) goto L59
        L58:
            return r0
        L59:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j290.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
