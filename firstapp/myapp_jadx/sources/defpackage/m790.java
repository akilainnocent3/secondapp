package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class m790 implements lyh<uf00<? extends x690>> {
    public final /* synthetic */ or60 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ List c;
    public final /* synthetic */ l790 d;

    @c0d(c = "com.sporty.android.platform.features.homeshortcut.ShortcutUseCase$getDisplayedHomeShortcuts$$inlined$map$1", f = "ShortcutUseCase.kt", l = {109}, m = "collect", v = 2)
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
            return m790.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ List c;
        public final /* synthetic */ l790 d;

        @c0d(c = "com.sporty.android.platform.features.homeshortcut.ShortcutUseCase$getDisplayedHomeShortcuts$$inlined$map$1$2", f = "ShortcutUseCase.kt", l = {62, 50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;
            public myh d;
            public Iterator e;
            public List f;

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

        public b(myh myhVar, boolean z, List list, l790 l790Var) {
            this.a = myhVar;
            this.b = z;
            this.c = list;
            this.d = l790Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
        
            if (r2.emit(r10, r0) == r1) goto L37;
         */
        @Override // defpackage.myh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r11, defpackage.v1b r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof m790.b.a
                if (r0 == 0) goto L13
                r0 = r12
                m790$b$a r0 = (m790.b.a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                m790$b$a r0 = new m790$b$a
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.a
                y5b r1 = defpackage.y5b.a
                int r2 = r0.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2c
                defpackage.uj50.b(r12)
                goto Lc4
            L2c:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r10)
                return r5
            L32:
                java.util.List r11 = r0.f
                java.util.Iterator r2 = r0.e
                myh r6 = r0.d
                defpackage.uj50.b(r12)
                goto L80
            L3c:
                defpackage.uj50.b(r12)
                java.util.List r11 = (java.util.List) r11
                boolean r12 = r11.isEmpty()
                myh r2 = r10.a
                if (r12 == 0) goto Lb1
                boolean r12 = r10.b
                if (r12 != 0) goto Lb1
                java.util.List r11 = r10.c
                r12 = 5
                java.util.List r11 = kotlin.collections.CollectionsKt.t0(r11, r12)
                java.util.ArrayList r12 = new java.util.ArrayList
                r6 = 10
                int r6 = defpackage.l48.r(r11, r6)
                r12.<init>(r6)
                java.util.Iterator r11 = r11.iterator()
            L63:
                boolean r6 = r11.hasNext()
                if (r6 == 0) goto L79
                java.lang.Object r6 = r11.next()
                x690 r6 = (defpackage.x690) r6
                r7 = 255(0xff, float:3.57E-43)
                x690 r6 = defpackage.x690.a(r6, r5, r4, r7)
                r12.add(r6)
                goto L63
            L79:
                java.util.Iterator r11 = r12.iterator()
                r6 = r2
                r2 = r11
                r11 = r12
            L80:
                boolean r12 = r2.hasNext()
                if (r12 == 0) goto Lab
                java.lang.Object r12 = r2.next()
                x690 r12 = (defpackage.x690) r12
                r0.d = r6
                r0.e = r2
                r0.f = r11
                r0.b = r4
                l790 r7 = r10.d
                k5b r8 = r7.b
                p790 r9 = new p790
                r9.<init>(r7, r12, r5)
                java.lang.Object r12 = defpackage.ej5.d(r8, r9, r0)
                y5b r7 = defpackage.y5b.a
                if (r12 != r7) goto La6
                goto La8
            La6:
                kotlin.Unit r12 = kotlin.Unit.a
            La8:
                if (r12 != r1) goto L80
                goto Lc3
            Lab:
                uf00 r10 = defpackage.a4h.f(r11)
                r2 = r6
                goto Lb5
            Lb1:
                uf00 r10 = defpackage.a4h.f(r11)
            Lb5:
                r0.d = r5
                r0.e = r5
                r0.f = r5
                r0.b = r3
                java.lang.Object r10 = r2.emit(r10, r0)
                if (r10 != r1) goto Lc4
            Lc3:
                return r1
            Lc4:
                kotlin.Unit r10 = kotlin.Unit.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: m790.b.emit(java.lang.Object, v1b):java.lang.Object");
        }
    }

    public m790(or60 or60Var, boolean z, List list, l790 l790Var) {
        this.a = or60Var;
        this.b = z;
        this.c = list;
        this.d = l790Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super uf00<? extends x690>> myhVar, v1b v1bVar) {
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
