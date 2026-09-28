package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.bo.images.ImageBOTypes;
import com.sporty.android.core.model.cms.CMSRequest;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class wq1 implements vq1 {
    public final wo5 a;
    public final psm b;
    public final k650 c;
    public final mgb0 d;
    public final k5b e;
    public final gq1 f;
    public final wsm g;
    public final t340 h;

    @c0d(c = "com.sportybet.repository.imageBOConfigs.BOImageRepositoryImpl$1", f = "BOImageRepositoryImpl.kt", l = {59, 59}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super ImageBOTypes.ImageResult>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = wq1.this.new a(v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super ImageBOTypes.ImageResult> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.io.IOException {
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
                goto L40
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L33
            L21:
                defpackage.uj50.b(r7)
                r6.c = r5
                r6.a = r0
                r6.b = r4
                wq1 r7 = defpackage.wq1.this
                java.lang.Object r7 = r7.d(r6)
                if (r7 != r1) goto L33
                goto L3f
            L33:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L40
            L3f:
                return r1
            L40:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: wq1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.repository.imageBOConfigs.BOImageRepositoryImpl$2", f = "BOImageRepositoryImpl.kt", l = {62, 62, WebSocketProtocol.B0_FLAG_RSV1}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<myh<? super ImageBOTypes.ImageResult>, Throwable, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ myh c;

        public b(v1b<? super b> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super ImageBOTypes.ImageResult> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            b bVar = wq1.this.new b(v1bVar);
            bVar.c = myhVar;
            return bVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        
            if (defpackage.kzh.c(r2, (defpackage.lyh) r8, r7) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L25;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                myh r0 = r7.c
                y5b r1 = defpackage.y5b.a
                int r2 = r7.b
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L2a
                if (r2 == r5) goto L24
                if (r2 == r4) goto L20
                if (r2 != r3) goto L1a
                myh r7 = r7.a
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                defpackage.uj50.b(r8)
                goto L5b
            L1a:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r6
            L20:
                defpackage.uj50.b(r8)     // Catch: java.lang.Throwable -> L4c
                goto L5b
            L24:
                myh r2 = r7.a
                defpackage.uj50.b(r8)     // Catch: java.lang.Throwable -> L4c
                goto L3d
            L2a:
                defpackage.uj50.b(r8)
                wq1 r8 = defpackage.wq1.this     // Catch: java.lang.Throwable -> L4c
                r7.c = r0     // Catch: java.lang.Throwable -> L4c
                r7.a = r0     // Catch: java.lang.Throwable -> L4c
                r7.b = r5     // Catch: java.lang.Throwable -> L4c
                yzh r8 = r8.c()     // Catch: java.lang.Throwable -> L4c
                if (r8 != r1) goto L3c
                goto L5a
            L3c:
                r2 = r0
            L3d:
                lyh r8 = (defpackage.lyh) r8     // Catch: java.lang.Throwable -> L4c
                r7.c = r0     // Catch: java.lang.Throwable -> L4c
                r7.a = r6     // Catch: java.lang.Throwable -> L4c
                r7.b = r4     // Catch: java.lang.Throwable -> L4c
                java.lang.Object r7 = defpackage.kzh.c(r2, r8, r7)     // Catch: java.lang.Throwable -> L4c
                if (r7 != r1) goto L5b
                goto L5a
            L4c:
                com.sporty.android.core.model.bo.images.ImageBOTypes$ImageResult$Empty r8 = com.sporty.android.core.model.bo.images.ImageBOTypes.ImageResult.Empty.INSTANCE
                r7.c = r6
                r7.a = r6
                r7.b = r3
                java.lang.Object r7 = r0.emit(r8, r7)
                if (r7 != r1) goto L5b
            L5a:
                return r1
            L5b:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: wq1.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class c extends IllegalStateException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, boolean z) {
            super(oxc.a(str, " is not found in ", z ? "API" : "storage"));
            str.getClass();
        }
    }

    @c0d(c = "com.sportybet.repository.imageBOConfigs.BOImageRepositoryImpl$getImageUrl$$inlined$filterIsInstanceOrThrow$1", f = "BOImageRepositoryImpl.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<myh<? super ImageBOTypes.ImageResult.ImageMap>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;

        /* JADX INFO: loaded from: classes2.dex */
        public static final class a<T> implements myh {
            public final /* synthetic */ myh<T> a;

            public a(myh myhVar) {
                this.a = myhVar;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                if (obj instanceof ImageBOTypes.ImageResult.ImageMap) {
                    Object objEmit = this.a.emit(obj, v1bVar);
                    return objEmit == y5b.a ? objEmit : Unit.a;
                }
                sza.a(obj, gvQvkPPtA.BVWy, " to be of type ", ImageBOTypes.ImageResult.ImageMap.class, " but wasn't");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(lyh lyhVar, v1b v1bVar) {
            super(2, v1bVar);
            this.c = lyhVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = new d(this.c, v1bVar);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super ImageBOTypes.ImageResult.ImageMap> myhVar, v1b<? super Unit> v1bVar) {
            return ((d) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                a aVar = new a((myh) this.b);
                this.b = null;
                this.a = 1;
                if (this.c.collect(aVar, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.repository.imageBOConfigs.BOImageRepositoryImpl$getImageUrl$1", f = "BOImageRepositoryImpl.kt", l = {88}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<ImageBOTypes.ImageResult.ImageMap, v1b<? super lyh<? extends ImageBOTypes.ImageResource>>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ ImageBOTypes.Image c;
        public final /* synthetic */ wq1 d;

        public static final class a implements lyh<ImageBOTypes.ImageResource> {
            public final /* synthetic */ lyh a;
            public final /* synthetic */ ImageBOTypes.Image b;

            /* JADX INFO: renamed from: wq1$e$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.repository.imageBOConfigs.BOImageRepositoryImpl$getImageUrl$1$invokeSuspend$$inlined$map$1", f = "BOImageRepositoryImpl.kt", l = {109}, m = "collect", v = 2)
            public static final class C1254a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1254a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.collect(null, this);
                }
            }

            public static final class b<T> implements myh {
                public final /* synthetic */ myh a;
                public final /* synthetic */ ImageBOTypes.Image b;

                /* JADX INFO: renamed from: wq1$e$a$b$a, reason: collision with other inner class name */
                @c0d(c = "com.sportybet.repository.imageBOConfigs.BOImageRepositoryImpl$getImageUrl$1$invokeSuspend$$inlined$map$1$2", f = "BOImageRepositoryImpl.kt", l = {50}, m = "emit", v = 2)
                public static final class C1255a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public C1255a(v1b v1bVar) {
                        super(v1bVar);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return b.this.emit(null, this);
                    }
                }

                public b(myh myhVar, ImageBOTypes.Image image) {
                    this.a = myhVar;
                    this.b = image;
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
                    C1255a c1255a;
                    Map<ImageBOTypes.Image, String> map;
                    String str;
                    if (v1bVar instanceof C1255a) {
                        c1255a = (C1255a) v1bVar;
                        int i = c1255a.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c1255a.b = i - Integer.MIN_VALUE;
                        } else {
                            c1255a = new C1255a(v1bVar);
                        }
                    } else {
                        c1255a = new C1255a(v1bVar);
                    }
                    Object obj2 = c1255a.a;
                    y5b y5bVar = y5b.a;
                    int i2 = c1255a.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        ImageBOTypes.ImageResult imageResult = (ImageBOTypes.ImageResult) obj;
                        ImageBOTypes.ImageResult.ImageMap imageMap = imageResult instanceof ImageBOTypes.ImageResult.ImageMap ? (ImageBOTypes.ImageResult.ImageMap) imageResult : null;
                        ImageBOTypes.Image image = this.b;
                        Object error = (imageMap == null || (map = imageMap.getMap()) == null || (str = map.get(image)) == null) ? new ImageBOTypes.ImageResource.Error(new c(image.getKey(), true)) : new ImageBOTypes.ImageResource.Data(str);
                        c1255a.b = 1;
                        if (this.a.emit(error, c1255a) == y5bVar) {
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

            public a(lyh lyhVar, ImageBOTypes.Image image) {
                this.a = lyhVar;
                this.b = image;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.lyh
            public final Object collect(myh<? super ImageBOTypes.ImageResource> myhVar, v1b v1bVar) {
                C1254a c1254a;
                if (v1bVar instanceof C1254a) {
                    c1254a = (C1254a) v1bVar;
                    int i = c1254a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1254a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1254a = new C1254a(v1bVar);
                    }
                } else {
                    c1254a = new C1254a(v1bVar);
                }
                Object obj = c1254a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1254a.b;
                if (i2 == 0) {
                    uj50.b(obj);
                    b bVar = new b(myhVar, this.b);
                    c1254a.b = 1;
                    if (this.a.collect(bVar, c1254a) == y5bVar) {
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
        public e(ImageBOTypes.Image image, wq1 wq1Var, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.c = image;
            this.d = wq1Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = new e(this.c, this.d, v1bVar);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ImageBOTypes.ImageResult.ImageMap imageMap, v1b<? super lyh<? extends ImageBOTypes.ImageResource>> v1bVar) {
            return ((e) create(imageMap, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ImageBOTypes.ImageResult.ImageMap imageMap = (ImageBOTypes.ImageResult.ImageMap) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            ImageBOTypes.Image image = this.c;
            if (i == 0) {
                uj50.b(obj);
                String str = imageMap.getMap().get(image);
                wq1 wq1Var = this.d;
                if (System.currentTimeMillis() - imageMap.getUpdateTime() < wq1Var.c.c("bo_config_image_expired_time")) {
                    return str != null ? new gzh(new ImageBOTypes.ImageResource.Data(str)) : new gzh(new ImageBOTypes.ImageResource.Error(new c(image.getKey(), imageMap.isFromApi())));
                }
                this.b = null;
                this.a = 1;
                obj = wq1Var.c();
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
            return new a((lyh) obj, image);
        }
    }

    @c0d(c = "com.sportybet.repository.imageBOConfigs.BOImageRepositoryImpl$getImageUrl$2", f = "BOImageRepositoryImpl.kt", l = {107}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements gaj<myh<? super ImageBOTypes.ImageResource>, Throwable, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Throwable c;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super ImageBOTypes.ImageResource> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            f fVar = new f(3, v1bVar);
            fVar.b = myhVar;
            fVar.c = th;
            return fVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            myh myhVar = this.b;
            Throwable th = this.c;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ImageBOTypes.ImageResource.Error error = new ImageBOTypes.ImageResource.Error(th);
                this.b = null;
                this.c = null;
                this.a = 1;
                if (myhVar.emit(error, this) == y5bVar) {
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

    public static final class g extends kotlin.coroutines.a implements l5b {
        public g() {
            super(l5b.a.a);
        }

        @Override // defpackage.l5b
        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
            wsm.d(wq1.this.g, th);
        }
    }

    public wq1(wo5 wo5Var, psm psmVar, k650 k650Var, mgb0 mgb0Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, gq1 gq1Var, wsm wsmVar) {
        wo5Var.getClass();
        psmVar.getClass();
        k650Var.getClass();
        mgb0Var.getClass();
        wsmVar.getClass();
        this.a = wo5Var;
        this.b = psmVar;
        this.c = k650Var;
        this.d = mgb0Var;
        this.e = k5bVar;
        this.f = gq1Var;
        this.g = wsmVar;
        this.h = e1i.d(new yzh(new or60(new a(null)), new b(null)), w5b.a(CoroutineContext.Element.a.d(lfe0.a(), k5bVar).plus(new g())), q490.a.b, 1);
    }

    @Override // defpackage.vq1
    public final Object a(q57 q57Var) {
        return this.f.a.a(q57Var);
    }

    @Override // defpackage.vq1
    public final lyh<ImageBOTypes.ImageResource> b(ImageBOTypes.Image image) {
        image.getClass();
        return ozh.c(new yzh(r0i.b(new or60(new d(this.h, null)), new e(image, this, null)), new f(3, null)), this.e);
    }

    public final yzh c() {
        tag<ImageBOTypes.Image> entries = ImageBOTypes.Image.getEntries();
        ArrayList arrayList = new ArrayList(l48.r(entries, 10));
        for (ImageBOTypes.Image image : entries) {
            arrayList.add(new CMSRequest(image.getKey(), image.getPage(), this.b.getCountryCode().getCode(), this.d.getLanguageCode(null)));
        }
        return new yzh(new yq1(new or60(new xq1(new zq1(this.a.a(arrayList)), null)), this), new ar1(3, null));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (r1.a(r2) == r14) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
    
        if (r13 == r14) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00bd -> B:34:0x00c0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.x1b r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq1.d(x1b):java.lang.Object");
    }
}
