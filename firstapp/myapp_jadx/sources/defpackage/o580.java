package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigDeserializeOption;
import com.sporty.android.core.model.config.bo.BOConfigParamDto;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.enums.BOConfigAppId;
import com.sporty.android.core.model.config.bo.enums.BOConfigNamespace;
import com.sportybet.core.segmentation.HomeSegment;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes6.dex */
public final class o580 implements l580, rdd {
    public final y8d0 a;
    public final i580 b;
    public final psm c;
    public final mgb0 d;
    public final lq1 e;
    public final k5b f;
    public jvd0 i;
    public final j1b v;
    public final BOConfigParamDto w;
    public final BOConfigParamDto y;

    @c0d(c = "com.sportybet.core.segmentation.repository.SegmentationRepositoryImpl$onStart$1", f = "SegmentationRepositoryImpl.kt", l = {83}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ o580 b;

        /* JADX INFO: renamed from: o580$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.core.segmentation.repository.SegmentationRepositoryImpl$onStart$1$2", f = "SegmentationRepositoryImpl.kt", l = {90}, m = "invokeSuspend", v = 2)
        public static final class C0911a extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ o580 c;

            /* JADX INFO: renamed from: o580$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.core.segmentation.repository.SegmentationRepositoryImpl$onStart$1$2$1", f = "SegmentationRepositoryImpl.kt", l = {HttpStatusCodesKt.HTTP_PROCESSING, 111, 116}, m = "invokeSuspend", v = 2)
            public static final class C0912a extends tje0 implements Function2<lk50<? extends BOConfigValueBundle>, v1b<? super Unit>, Object> {
                public int a;
                public int b;
                public /* synthetic */ Object c;
                public final /* synthetic */ o580 d;
                public final /* synthetic */ String e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0912a(o580 o580Var, String str, v1b<? super C0912a> v1bVar) {
                    super(2, v1bVar);
                    this.d = o580Var;
                    this.e = str;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    C0912a c0912a = new C0912a(this.d, this.e, v1bVar);
                    c0912a.c = obj;
                    return c0912a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(lk50<? extends BOConfigValueBundle> lk50Var, v1b<? super Unit> v1bVar) {
                    return ((C0912a) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
                }

                /* JADX WARN: Code duplicated, block: B:100:0x0193  */
                /* JADX WARN: Code duplicated, block: B:103:0x01a4  */
                /* JADX WARN: Code duplicated, block: B:105:0x01a8  */
                /* JADX WARN: Code duplicated, block: B:107:0x01ac  */
                /* JADX WARN: Code duplicated, block: B:109:0x01b1  */
                /* JADX WARN: Code duplicated, block: B:111:0x01b5  */
                /* JADX WARN: Code duplicated, block: B:113:0x01bd  */
                /* JADX WARN: Code duplicated, block: B:115:0x01c7  */
                /* JADX WARN: Code duplicated, block: B:117:0x01cb  */
                /* JADX WARN: Code duplicated, block: B:120:0x01d0  */
                /* JADX WARN: Code duplicated, block: B:122:0x01d4  */
                /* JADX WARN: Code duplicated, block: B:123:0x01da  */
                /* JADX WARN: Code duplicated, block: B:125:0x01e4  */
                /* JADX WARN: Code duplicated, block: B:127:0x01e8  */
                /* JADX WARN: Code duplicated, block: B:130:0x01ed  */
                /* JADX WARN: Code duplicated, block: B:132:0x01f1  */
                /* JADX WARN: Code duplicated, block: B:133:0x01f7  */
                /* JADX WARN: Code duplicated, block: B:135:0x0201  */
                /* JADX WARN: Code duplicated, block: B:137:0x0205  */
                /* JADX WARN: Code duplicated, block: B:140:0x020a  */
                /* JADX WARN: Code duplicated, block: B:142:0x020e  */
                /* JADX WARN: Code duplicated, block: B:143:0x0214  */
                /* JADX WARN: Code duplicated, block: B:145:0x021e  */
                /* JADX WARN: Code duplicated, block: B:147:0x0222  */
                /* JADX WARN: Code duplicated, block: B:150:0x0227  */
                /* JADX WARN: Code duplicated, block: B:152:0x022b  */
                /* JADX WARN: Code duplicated, block: B:153:0x0231  */
                /* JADX WARN: Code duplicated, block: B:155:0x023b A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:156:0x023d  */
                /* JADX WARN: Code duplicated, block: B:157:0x0243 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:158:0x0245  */
                /* JADX WARN: Code duplicated, block: B:162:0x024d  */
                /* JADX WARN: Code duplicated, block: B:165:0x0267  */
                /* JADX WARN: Code duplicated, block: B:167:0x026a  */
                /* JADX WARN: Code duplicated, block: B:29:0x009d  */
                /* JADX WARN: Code duplicated, block: B:96:0x016b  */
                /* JADX WARN: Code duplicated, block: B:99:0x018e  */
                /* JADX WARN: Code restructure failed: missing block: B:168:0x0277, code lost:
                
                    if (r1.b(r18.e, r18) == r4) goto L169;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v21 */
                /* JADX WARN: Type inference failed for: r5v22, types: [int] */
                /* JADX WARN: Type inference failed for: r5v29 */
                /* JADX WARN: Type inference failed for: r5v30, types: [int] */
                /* JADX WARN: Type inference failed for: r5v32 */
                /* JADX WARN: Type inference failed for: r5v34 */
                /* JADX WARN: Type inference failed for: r5v35 */
                /* JADX WARN: Type inference failed for: r5v36 */
                /* JADX WARN: Type inference failed for: r5v37 */
                /* JADX WARN: Type inference failed for: r5v38 */
                @Override // defpackage.pz1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                    /*
                        Method dump skipped, instruction units count: 643
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o580.a.C0911a.C0912a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0911a(v1b v1bVar, o580 o580Var) {
                super(2, v1bVar);
                this.c = o580Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0911a c0911a = new C0911a(v1bVar, this.c);
                c0911a.b = obj;
                return c0911a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, v1b<? super Unit> v1bVar) {
                return ((C0911a) create(str, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                String str = (String) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    o580 o580Var = this.c;
                    yzh yzhVarC = o580Var.e.c(kotlin.collections.b.k(o580Var.w, o580Var.y));
                    C0912a c0912a = new C0912a(o580Var, str, null);
                    this.b = null;
                    this.a = 1;
                    if (kzh.b(yzhVarC, c0912a, this) == y5bVar) {
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

        public static final class b implements lyh<String> {
            public final /* synthetic */ lyh a;

            /* JADX INFO: renamed from: o580$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.core.segmentation.repository.SegmentationRepositoryImpl$onStart$1$invokeSuspend$$inlined$map$1", f = "SegmentationRepositoryImpl.kt", l = {109}, m = "collect", v = 2)
            public static final class C0913a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0913a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.collect(null, this);
                }
            }

            /* JADX INFO: renamed from: o580$a$b$b, reason: collision with other inner class name */
            public static final class C0914b<T> implements myh {
                public final /* synthetic */ myh a;

                /* JADX INFO: renamed from: o580$a$b$b$a, reason: collision with other inner class name */
                @c0d(c = "com.sportybet.core.segmentation.repository.SegmentationRepositoryImpl$onStart$1$invokeSuspend$$inlined$map$1$2", f = "SegmentationRepositoryImpl.kt", l = {50}, m = "emit", v = 2)
                public static final class C0915a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public C0915a(v1b v1bVar) {
                        super(v1bVar);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return C0914b.this.emit(null, this);
                    }
                }

                public C0914b(myh myhVar) {
                    this.a = myhVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    C0915a c0915a;
                    if (v1bVar instanceof C0915a) {
                        c0915a = (C0915a) v1bVar;
                        int i = c0915a.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c0915a.b = i - Integer.MIN_VALUE;
                        } else {
                            c0915a = new C0915a(v1bVar);
                        }
                    } else {
                        c0915a = new C0915a(v1bVar);
                    }
                    Object obj2 = c0915a.a;
                    y5b y5bVar = y5b.a;
                    int i2 = c0915a.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        t8 t8Var = (t8) obj;
                        String str = t8Var != null ? t8Var.f : null;
                        c0915a.b = 1;
                        if (this.a.emit(str, c0915a) == y5bVar) {
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

            public b(lyh lyhVar) {
                this.a = lyhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.lyh
            public final Object collect(myh<? super String> myhVar, v1b v1bVar) {
                C0913a c0913a;
                if (v1bVar instanceof C0913a) {
                    c0913a = (C0913a) v1bVar;
                    int i = c0913a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0913a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0913a = new C0913a(v1bVar);
                    }
                } else {
                    c0913a = new C0913a(v1bVar);
                }
                Object obj = c0913a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0913a.b;
                if (i2 == 0) {
                    uj50.b(obj);
                    C0914b c0914b = new C0914b(myhVar);
                    c0913a.b = 1;
                    if (this.a.collect(c0914b, c0913a) == y5bVar) {
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
        public a(v1b v1bVar, o580 o580Var) {
            super(2, v1bVar);
            this.b = o580Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                o580 o580Var = this.b;
                lyh lyhVarB = uzh.b(new b(o580Var.d.getAccountHolderFlow()));
                C0911a c0911a = new C0911a(null, o580Var);
                this.a = 1;
                if (kzh.b(lyhVarB, c0911a, this) == y5bVar) {
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

    public static final class b extends kotlin.coroutines.a implements l5b {
        @Override // defpackage.l5b
        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
            itf0.a.d(a320.a("SegmentationRepositoryImp error: ", th), new Object[0]);
        }
    }

    public o580(y8d0 y8d0Var, i580 i580Var, psm psmVar, ibs ibsVar, mgb0 mgb0Var, lq1 lq1Var, k5b k5bVar) {
        this.a = y8d0Var;
        this.b = i580Var;
        this.c = psmVar;
        this.d = mgb0Var;
        this.e = lq1Var;
        this.f = k5bVar;
        this.v = w5b.a(CoroutineContext.Element.a.d(lfe0.a(), k5bVar).plus(new b(l5b.a.a)));
        BOConfigNamespace bOConfigNamespace = BOConfigNamespace.APPLICATION;
        BOConfigAppId bOConfigAppId = BOConfigAppId.COMMON;
        this.w = new BOConfigParamDto(bOConfigAppId, bOConfigNamespace, "user_segmentation_enabled", null, 8, null);
        this.y = new BOConfigParamDto(bOConfigAppId, bOConfigNamespace, "user_segmentation_default", new BOConfigDeserializeOption.WithKClass(jq40.a(HomeSegment.class)));
        ibsVar.getLifecycle().a(this);
    }

    @Override // defpackage.l580
    public final g1i a() {
        i580 i580Var = this.b;
        return new g1i(r0i.f(i580Var.b.a(i580Var, i580.c[0]).d(i580.a.c), new m580(null, this)), new n580(2, null));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00af A[Catch: Exception -> 0x0036, TRY_LEAVE, TryCatch #0 {Exception -> 0x0036, blocks: (B:13:0x0031, B:20:0x0043, B:34:0x00a9, B:36:0x00af, B:21:0x0047, B:27:0x005a, B:29:0x007c, B:31:0x0082, B:24:0x004e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d3, code lost:
    
        if (r13.g(r1, r11) == r2) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r12, defpackage.x1b r13) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o580.b(java.lang.String, x1b):java.lang.Object");
    }

    @Override // defpackage.rdd
    public final void onStart(ibs ibsVar) {
        jvd0 jvd0Var = this.i;
        if (jvd0Var == null || !jvd0Var.isActive()) {
            this.i = ej5.c(this.v, null, null, new a(null, this), 3);
        }
    }

    @Override // defpackage.rdd
    public final void onStop(ibs ibsVar) {
        jvd0 jvd0Var = this.i;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.i = null;
    }
}
