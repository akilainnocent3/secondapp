package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a840 implements m9n {
    public static final /* synthetic */ int f = 0;
    public final a a;
    public final j1b b;
    public final pa0 c;
    public final ap8 d;
    public volatile /* synthetic */ int e;

    public static final class a {
        public final Context a;
        public final nan.b b;
        public final mpe0 c;
        public final mpe0 d;
        public final mpe0 e;
        public final ap8 f;
        public final kgt g;

        public a(Context context, nan.b bVar, mpe0 mpe0Var, mpe0 mpe0Var2, mpe0 mpe0Var3, ap8 ap8Var, b0d b0dVar) {
            this.a = context;
            this.b = bVar;
            this.c = mpe0Var;
            this.d = mpe0Var2;
            this.e = mpe0Var3;
            this.f = ap8Var;
            this.g = b0dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (Intrinsics.g(this.a, aVar.a) && this.b.equals(aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && Intrinsics.g(this.g, aVar.g)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = (this.f.hashCode() + ((rpg.b.a.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            kgt kgtVar = this.g;
            return iHashCode + (kgtVar == null ? 0 : kgtVar.hashCode());
        }

        public final String toString() {
            return "Options(application=" + this.a + ", defaults=" + this.b + ", mainCoroutineContextLazy=" + this.c + ", memoryCacheLazy=" + this.d + ", diskCacheLazy=" + this.e + ", eventListenerFactory=" + rpg.b.a + ", componentRegistry=" + this.f + ", logger=" + this.g + ')';
        }
    }

    @c0d(c = "coil3.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", l = {67}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<v5b, v1b<? super dbn>, Object> {
        public int a;
        public final /* synthetic */ nan c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(nan nanVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = nanVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return a840.this.new b(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super dbn> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            this.a = 1;
            int i2 = a840.f;
            Object objC = a840.this.c(this.c, 0, this);
            return objC == y5bVar ? y5bVar : objC;
        }
    }

    @c0d(c = "coil3.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {87}, m = "invokeSuspend")
    public static final class c extends tje0 implements Function2<v5b, v1b<? super dbn>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ nan d;

        @c0d(c = "coil3.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", l = {83}, m = "invokeSuspend")
        public static final class a extends tje0 implements Function2<v5b, v1b<? super dbn>, Object> {
            public int a;
            public final /* synthetic */ a840 b;
            public final /* synthetic */ nan c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a840 a840Var, nan nanVar, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = a840Var;
                this.c = nanVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super dbn> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        uj50.b(obj);
                        return obj;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                this.a = 1;
                int i2 = a840.f;
                Object objC = this.b.c(this.c, 1, this);
                return objC == y5bVar ? y5bVar : objC;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(nan nanVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.d = nanVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = a840.this.new c(this.d, v1bVar);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super dbn> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            a840 a840Var = a840.this;
            CoroutineContext coroutineContext = (CoroutineContext) a840Var.a.c.getValue();
            nan nanVar = this.d;
            ojd<dbn> ojdVarA = f840.a(nanVar, ej5.a(v5bVar, coroutineContext, new a(a840Var, nanVar, null), 2)).a();
            this.b = null;
            this.a = 1;
            Object objAwait = ojdVarA.await(this);
            return objAwait == y5bVar ? y5bVar : objAwait;
        }
    }

    @c0d(c = "coil3.RealImageLoader", f = "RealImageLoader.kt", l = {117, 129, 133}, m = "execute")
    public static final class d extends x1b {
        public la50 a;
        public nan b;
        public rpg c;
        public u7n d;
        public int e;
        public /* synthetic */ Object f;
        public int v;

        public d(v1b<? super d> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.v |= Integer.MIN_VALUE;
            int i = a840.f;
            return a840.this.c(null, 0, this);
        }
    }

    @c0d(c = "coil3.RealImageLoader$execute$result$1", f = "RealImageLoader.kt", l = {142}, m = "invokeSuspend")
    public static final class e extends tje0 implements Function2<v5b, v1b<? super dbn>, Object> {
        public int a;
        public final /* synthetic */ nan b;
        public final /* synthetic */ a840 c;
        public final /* synthetic */ ww90 d;
        public final /* synthetic */ rpg e;
        public final /* synthetic */ u7n f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(nan nanVar, a840 a840Var, ww90 ww90Var, rpg rpgVar, u7n u7nVar, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.b = nanVar;
            this.c = a840Var;
            this.d = ww90Var;
            this.e = rpgVar;
            this.f = u7nVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new e(this.b, this.c, this.d, this.e, this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super dbn> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            List<dyo> list = this.c.d.a;
            boolean z = this.f != null;
            nan nanVar = this.b;
            h840 h840Var = new h840(nanVar, list, 0, nanVar, this.d, this.e, z);
            this.a = 1;
            Object objB = h840Var.b(this);
            return objB == y5bVar ? y5bVar : objB;
        }
    }

    static {
        AtomicIntegerFieldUpdater.newUpdater(a840.class, "e");
    }

    public a840(a aVar) {
        this.a = aVar;
        kgt kgtVar = aVar.g;
        this.b = w5b.a(CoroutineContext.Element.a.d(lfe0.a(), new c840(kgtVar)));
        mb0 mb0Var = new mb0(this);
        pa0 pa0Var = new pa0(this, mb0Var, kgtVar);
        this.c = pa0Var;
        ap8.a aVar2 = new ap8.a(aVar.f);
        nan.b bVar = aVar.b;
        Object obj = bVar.n.a.get(t9n.a);
        if (((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue()) {
            aVar2.d.add(new b840());
            aVar2.e.add(new ii00(1));
        }
        aVar2.c(new xc0(), jq40.a(Uri.class));
        aVar2.c(new fh50(), jq40.a(Integer.class));
        Pair pair = new Pair(new ra0(), jq40.a(kmh0.class));
        ArrayList arrayList = aVar2.c;
        arrayList.add(pair);
        aVar2.b(new ry0.a(), jq40.a(kmh0.class));
        aVar2.b(new j0b.a(), jq40.a(kmh0.class));
        aVar2.b(new rh50.a(), jq40.a(kmh0.class));
        aVar2.b(new ddf.a(), jq40.a(Drawable.class));
        aVar2.b(new ne4.a(), jq40.a(Bitmap.class));
        p4h.b<Integer> bVar2 = u9n.a;
        Object obj2 = bVar.n.a.get(u9n.a);
        bc80 bc80VarA = cc80.a(((Number) (obj2 == null ? 4 : obj2)).intValue());
        int i = Build.VERSION.SDK_INT;
        Object obj3 = gvg.a;
        if (i >= 29) {
            Object obj4 = bVar.n.a.get(u9n.c);
            if (((Boolean) (obj4 == null ? Boolean.TRUE : obj4)).booleanValue()) {
                Object obj5 = bVar.n.a.get(u9n.b);
                if (((gvg) (obj5 == null ? obj3 : obj5)).equals(obj3)) {
                    aVar2.a(new eyd0.a(bc80VarA));
                }
            }
        }
        Object obj6 = bVar.n.a.get(u9n.b);
        aVar2.a(new ke4.b(bc80VarA, (gvg) (obj6 != null ? obj6 : obj3)));
        aVar2.c(new jkh(), jq40.a(File.class));
        aVar2.b(new r7p.a(), jq40.a(kmh0.class));
        aVar2.b(new zk5.a(), jq40.a(ByteBuffer.class));
        aVar2.c(new aae0(), jq40.a(String.class));
        aVar2.c(new nxz(), jq40.a(cxz.class));
        arrayList.add(new Pair(new hlh(), jq40.a(kmh0.class)));
        arrayList.add(new Pair(new mmh0(), jq40.a(kmh0.class)));
        aVar2.b(new glh.a(), jq40.a(kmh0.class));
        aVar2.b(new tk5.a(), jq40.a(byte[].class));
        aVar2.b(new bsc.a(), jq40.a(kmh0.class));
        aVar2.a.add(new p6g(this, mb0Var, pa0Var, kgtVar));
        this.d = aVar2.d();
    }

    @Override // defpackage.m9n
    public final qse a(nan nanVar) {
        return f840.a(nanVar, ej5.a(this.b, (CoroutineContext) this.a.c.getValue(), new b(nanVar, null), 2));
    }

    @Override // defpackage.m9n
    public final Object b(nan nanVar, v1b<? super dbn> v1bVar) {
        return ((nanVar.c instanceof vbn) || (nanVar.q instanceof p9i0) || ((s9s) q4h.a(nanVar, abn.e)) != null) ? w5b.d(new c(nanVar, null), v1bVar) : c(nanVar, 1, v1bVar);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x017f  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b6 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:137:0x021d, B:139:0x0223, B:140:0x022c, B:142:0x0230, B:145:0x023c, B:146:0x0241, B:28:0x006a, B:118:0x01af, B:120:0x01b6, B:122:0x01c0, B:123:0x01ca, B:124:0x01cd, B:126:0x01d4, B:127:0x01d7), top: B:172:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01c0 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:137:0x021d, B:139:0x0223, B:140:0x022c, B:142:0x0230, B:145:0x023c, B:146:0x0241, B:28:0x006a, B:118:0x01af, B:120:0x01b6, B:122:0x01c0, B:123:0x01ca, B:124:0x01cd, B:126:0x01d4, B:127:0x01d7), top: B:172:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:126:0x01d4 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:137:0x021d, B:139:0x0223, B:140:0x022c, B:142:0x0230, B:145:0x023c, B:146:0x0241, B:28:0x006a, B:118:0x01af, B:120:0x01b6, B:122:0x01c0, B:123:0x01ca, B:124:0x01cd, B:126:0x01d4, B:127:0x01d7), top: B:172:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:130:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:136:0x0219  */
    /* JADX WARN: Code duplicated, block: B:139:0x0223 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:137:0x021d, B:139:0x0223, B:140:0x022c, B:142:0x0230, B:145:0x023c, B:146:0x0241, B:28:0x006a, B:118:0x01af, B:120:0x01b6, B:122:0x01c0, B:123:0x01ca, B:124:0x01cd, B:126:0x01d4, B:127:0x01d7), top: B:172:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:140:0x022c A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:137:0x021d, B:139:0x0223, B:140:0x022c, B:142:0x0230, B:145:0x023c, B:146:0x0241, B:28:0x006a, B:118:0x01af, B:120:0x01b6, B:122:0x01c0, B:123:0x01ca, B:124:0x01cd, B:126:0x01d4, B:127:0x01d7), top: B:172:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0230 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:137:0x021d, B:139:0x0223, B:140:0x022c, B:142:0x0230, B:145:0x023c, B:146:0x0241, B:28:0x006a, B:118:0x01af, B:120:0x01b6, B:122:0x01c0, B:123:0x01ca, B:124:0x01cd, B:126:0x01d4, B:127:0x01d7), top: B:172:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:145:0x023c A[Catch: all -> 0x003f, TRY_ENTER, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:137:0x021d, B:139:0x0223, B:140:0x022c, B:142:0x0230, B:145:0x023c, B:146:0x0241, B:28:0x006a, B:118:0x01af, B:120:0x01b6, B:122:0x01c0, B:123:0x01ca, B:124:0x01cd, B:126:0x01d4, B:127:0x01d7), top: B:172:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:155:0x0256 A[Catch: all -> 0x0263, TRY_LEAVE, TryCatch #1 {all -> 0x0263, blocks: (B:153:0x0252, B:155:0x0256, B:160:0x0265, B:161:0x0268), top: B:166:0x0252 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x0265 A[Catch: all -> 0x0263, TRY_ENTER, TryCatch #1 {all -> 0x0263, blocks: (B:153:0x0252, B:155:0x0256, B:160:0x0265, B:161:0x0268), top: B:166:0x0252 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a6, code lost:
    
        if (r1.a(r9) == r10) goto L135;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [a840] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v26, types: [nan] */
    /* JADX WARN: Type inference failed for: r3v13, types: [rpg, rpg$a] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, rpg] */
    /* JADX WARN: Type inference failed for: r3v16, types: [nan] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [rpg] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4, types: [rpg] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, nan] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, rpg] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [nan] */
    /* JADX WARN: Type inference failed for: r4v2, types: [nan] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v5, types: [nan] */
    /* JADX WARN: Type inference failed for: r5v0, types: [nan] */
    /* JADX WARN: Type inference failed for: r5v1, types: [la50] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.nan r18, int r19, defpackage.v1b<? super defpackage.dbn> r20) {
        /*
            Method dump skipped, instruction units count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a840.c(nan, int, v1b):java.lang.Object");
    }

    public final vlv d() {
        return (vlv) this.a.d.getValue();
    }

    public final void e(nan nanVar, rpg rpgVar) {
        kgt kgtVar = this.a.g;
        if (kgtVar != null) {
            kgt.a aVar = kgt.a.c;
            if (kgtVar.a().compareTo(aVar) <= 0) {
                kgtVar.b("RealImageLoader", aVar, "🏗 Cancelled - " + nanVar.b, null);
            }
        }
        rpgVar.getClass();
        nan.d dVar = nanVar.d;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    public final void f(tcg tcgVar, e5f0 e5f0Var, rpg rpgVar) {
        nan nanVar = tcgVar.b;
        u7n u7nVar = tcgVar.a;
        kgt kgtVar = this.a.g;
        if (kgtVar != null) {
            Throwable th = tcgVar.c;
            kgt.a aVarA = kgtVar.a();
            kgt.a aVar = kgt.a.e;
            if (aVarA.compareTo(aVar) <= 0) {
                kgtVar.b("RealImageLoader", aVar, "🚨 Failed - " + nanVar.b, th);
            }
        }
        if (e5f0Var instanceof aug0) {
            ltg0 ltg0VarA = ((ltg0.a) q4h.a(nanVar, abn.a)).a((aug0) e5f0Var, tcgVar);
            if (ltg0VarA instanceof zxx) {
                e5f0Var.c(u7nVar);
            } else {
                rpgVar.getClass();
                ltg0VarA.a();
            }
        } else if (e5f0Var != null) {
            e5f0Var.c(u7nVar);
        }
        rpgVar.getClass();
        nan.d dVar = nanVar.d;
        if (dVar != null) {
            dVar.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    public final void g(dfe0 dfe0Var, e5f0 e5f0Var, rpg rpgVar) {
        String str;
        nan nanVar = dfe0Var.b;
        u7n u7nVar = dfe0Var.a;
        bqc bqcVar = dfe0Var.c;
        kgt kgtVar = this.a.g;
        if (kgtVar != null) {
            kgt.a aVar = kgt.a.c;
            if (kgtVar.a().compareTo(aVar) <= 0) {
                int iOrdinal = bqcVar.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    str = "🧠";
                } else if (iOrdinal == 2) {
                    str = "💾";
                } else {
                    if (iOrdinal != 3) {
                        uhc.a();
                        return;
                    }
                    str = "☁️";
                }
                kgtVar.b("RealImageLoader", aVar, str + " Successful (" + bqcVar.name() + ") - " + nanVar.b, null);
            }
        }
        if (e5f0Var instanceof aug0) {
            ltg0 ltg0VarA = ((ltg0.a) q4h.a(nanVar, abn.a)).a((aug0) e5f0Var, dfe0Var);
            if (ltg0VarA instanceof zxx) {
                e5f0Var.b(u7nVar);
            } else {
                rpgVar.getClass();
                ltg0VarA.a();
            }
        } else if (e5f0Var != null) {
            e5f0Var.b(u7nVar);
        }
        rpgVar.getClass();
        nan.d dVar = nanVar.d;
        if (dVar != null) {
            dVar.onSuccess();
        }
    }
}
