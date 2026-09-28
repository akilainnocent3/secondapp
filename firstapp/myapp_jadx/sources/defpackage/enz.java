package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class enz<Key, Value> {
    public final Key a;
    public final wqz<Key, Value> b;
    public final iqz c;
    public final lyh<Unit> d;
    public final y650<Key, Value> e;
    public final xqz<Key, Value> f;
    public final x8m g;
    public final AtomicBoolean h;
    public final tb5 i;
    public final onz.a<Key, Value> j;
    public final e9p k;
    public final xzh l;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[kxs.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @c0d(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {647, 658, 415, 424, 679, 720, 472, 741, 495, 521, 752}, m = "doLoad")
    public static final class b extends x1b {
        public int A;
        public int B;
        public /* synthetic */ Object C;
        public final /* synthetic */ enz<Key, Value> D;
        public int E;
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object i;
        public Object v;
        public Object w;
        public Object y;
        public tuw z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(enz<Key, Value> enzVar, v1b<? super b> v1bVar) {
            super(v1bVar);
            this.D = enzVar;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.C = obj;
            this.E |= Integer.MIN_VALUE;
            return this.D.d(null, null, this);
        }
    }

    @c0d(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$2", f = "PageFetcherSnapshot.kt", l = {646, 233}, m = "invokeSuspend")
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public onz.a a;
        public tuw b;
        public enz c;
        public int d;
        public final /* synthetic */ enz<Key, Value> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(enz<Key, Value> enzVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.e = enzVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
        
            if (r1.a(r8, defpackage.kxs.b, r7) == r0) goto L17;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r7.d
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L21
                if (r1 == r3) goto L17
                if (r1 != r2) goto L11
                defpackage.uj50.b(r8)
                goto L60
            L11:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r4
            L17:
                enz r1 = r7.c
                tuw r3 = r7.b
                onz$a r5 = r7.a
                defpackage.uj50.b(r8)
                goto L3a
            L21:
                defpackage.uj50.b(r8)
                enz<Key, Value> r1 = r7.e
                onz$a<Key, Value> r5 = r1.j
                tuw r8 = r5.a
                r7.a = r5
                r7.b = r8
                r7.c = r1
                r7.d = r3
                java.lang.Object r3 = r8.d(r7)
                if (r3 != r0) goto L39
                goto L5f
            L39:
                r3 = r8
            L3a:
                onz<Key, Value> r8 = r5.b     // Catch: java.lang.Throwable -> L63
                tb5 r5 = r8.i     // Catch: java.lang.Throwable -> L63
                o67 r5 = defpackage.izh.a(r5)     // Catch: java.lang.Throwable -> L63
                qnz r6 = new qnz     // Catch: java.lang.Throwable -> L63
                r6.<init>(r8, r4)     // Catch: java.lang.Throwable -> L63
                xzh r8 = new xzh     // Catch: java.lang.Throwable -> L63
                r8.<init>(r5, r6)     // Catch: java.lang.Throwable -> L63
                r3.f(r4)
                r7.a = r4
                r7.b = r4
                r7.c = r4
                r7.d = r2
                kxs r2 = defpackage.kxs.b
                java.lang.Object r7 = r1.a(r8, r2, r7)
                if (r7 != r0) goto L60
            L5f:
                return r0
            L60:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            L63:
                r7 = move-exception
                r3.f(r4)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: enz.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$3", f = "PageFetcherSnapshot.kt", l = {646, 238}, m = "invokeSuspend")
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public onz.a a;
        public tuw b;
        public enz c;
        public int d;
        public final /* synthetic */ enz<Key, Value> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(enz<Key, Value> enzVar, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.e = enzVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
        
            if (r1.a(r8, defpackage.kxs.c, r7) == r0) goto L17;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r7.d
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L21
                if (r1 == r3) goto L17
                if (r1 != r2) goto L11
                defpackage.uj50.b(r8)
                goto L60
            L11:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r4
            L17:
                enz r1 = r7.c
                tuw r3 = r7.b
                onz$a r5 = r7.a
                defpackage.uj50.b(r8)
                goto L3a
            L21:
                defpackage.uj50.b(r8)
                enz<Key, Value> r1 = r7.e
                onz$a<Key, Value> r5 = r1.j
                tuw r8 = r5.a
                r7.a = r5
                r7.b = r8
                r7.c = r1
                r7.d = r3
                java.lang.Object r3 = r8.d(r7)
                if (r3 != r0) goto L39
                goto L5f
            L39:
                r3 = r8
            L3a:
                onz<Key, Value> r8 = r5.b     // Catch: java.lang.Throwable -> L63
                tb5 r5 = r8.j     // Catch: java.lang.Throwable -> L63
                o67 r5 = defpackage.izh.a(r5)     // Catch: java.lang.Throwable -> L63
                pnz r6 = new pnz     // Catch: java.lang.Throwable -> L63
                r6.<init>(r8, r4)     // Catch: java.lang.Throwable -> L63
                xzh r8 = new xzh     // Catch: java.lang.Throwable -> L63
                r8.<init>(r5, r6)     // Catch: java.lang.Throwable -> L63
                r3.f(r4)
                r7.a = r4
                r7.b = r4
                r7.c = r4
                r7.d = r2
                kxs r2 = defpackage.kxs.c
                java.lang.Object r7 = r1.a(r8, r2, r7)
                if (r7 != r0) goto L60
            L5f:
                return r0
            L60:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            L63:
                r7 = move-exception
                r3.f(r4)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: enz.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public enz(Object obj, wqz wqzVar, iqz iqzVar, fua fuaVar, y650 y650Var, xqz xqzVar, zmz.b.a aVar) {
        wqzVar.getClass();
        fuaVar.getClass();
        this.a = obj;
        this.b = wqzVar;
        this.c = iqzVar;
        this.d = fuaVar;
        this.e = y650Var;
        this.f = xqzVar;
        this.g = new x8m();
        this.h = new AtomicBoolean(false);
        this.i = d77.b(-2, 6, null);
        this.j = new onz.a<>(iqzVar);
        e9p e9pVarA = i9p.a();
        this.k = e9pVarA;
        this.l = new xzh(rj90.a(new vb6(e9pVarA, new lnz(this, null), null)), new nnz(this, null));
    }

    public static String f(kxs kxsVar, Object obj, wqz.b bVar) {
        if (bVar == null) {
            return "End " + kxsVar + " with loadkey " + obj + ". Load CANCELLED.";
        }
        return "End " + kxsVar + " with loadKey " + obj + ". Returned " + bVar;
    }

    public final Object a(xzh xzhVar, kxs kxsVar, tje0 tje0Var) {
        lyh lyhVarA = rj90.a(new vyh(xzhVar, new fnz(null, this, kxsVar), null));
        gnz gnzVar = new gnz(kxsVar, null);
        lyhVarA.getClass();
        Object objCollect = ozh.b(new or60(new tyh(lyhVarA, gnzVar, null)), -1, 2).collect(new hnz(this, kxsVar), tje0Var);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(x1b x1bVar) {
        jnz jnzVar;
        tuw tuwVar;
        onz.a<Key, Value> aVar;
        if (x1bVar instanceof jnz) {
            jnzVar = (jnz) x1bVar;
            int i = jnzVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                jnzVar.f = i - Integer.MIN_VALUE;
            } else {
                jnzVar = new jnz(this, x1bVar);
            }
        } else {
            jnzVar = new jnz(this, x1bVar);
        }
        Object obj = jnzVar.d;
        y5b y5bVar = y5b.a;
        int i2 = jnzVar.f;
        if (i2 == 0) {
            uj50.b(obj);
            onz.a<Key, Value> aVar2 = this.j;
            tuwVar = aVar2.a;
            jnzVar.a = this;
            jnzVar.b = aVar2;
            jnzVar.c = tuwVar;
            jnzVar.f = 1;
            if (tuwVar.d(jnzVar) == y5bVar) {
                return y5bVar;
            }
            aVar = aVar2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tuw tuwVar2 = jnzVar.c;
            aVar = jnzVar.b;
            enz<Key, Value> enzVar = jnzVar.a;
            uj50.b(obj);
            tuwVar = tuwVar2;
            this = enzVar;
        }
        try {
            return aVar.b.a(this.g.a.c);
        } finally {
            tuwVar.f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0225  */
    /* JADX WARN: Code duplicated, block: B:104:0x023e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0245  */
    /* JADX WARN: Code duplicated, block: B:113:0x0253  */
    /* JADX WARN: Code duplicated, block: B:115:0x0257  */
    /* JADX WARN: Code duplicated, block: B:117:0x025b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0281  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:135:0x02af  */
    /* JADX WARN: Code duplicated, block: B:137:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:139:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:39:0x0101  */
    /* JADX WARN: Code duplicated, block: B:43:0x0113  */
    /* JADX WARN: Code duplicated, block: B:49:0x0142 A[PHI: r0 r1
      0x0142: PHI (r0v12 enz<Key, Value>) = (r0v8 enz<Key, Value>), (r0v15 enz<Key, Value>) binds: [B:47:0x013e, B:26:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r1v9 java.lang.Object) = (r1v8 java.lang.Object), (r1v1 java.lang.Object) binds: [B:47:0x013e, B:26:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0148  */
    /* JADX WARN: Code duplicated, block: B:54:0x015f  */
    /* JADX WARN: Code duplicated, block: B:58:0x017a A[Catch: all -> 0x017e, TRY_ENTER, TryCatch #6 {all -> 0x017e, blocks: (B:55:0x0160, B:58:0x017a, B:61:0x0181, B:63:0x0188), top: B:161:0x0160 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0188 A[Catch: all -> 0x017e, TRY_LEAVE, TryCatch #6 {all -> 0x017e, blocks: (B:55:0x0160, B:58:0x017a, B:61:0x0181, B:63:0x0188), top: B:161:0x0160 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0190  */
    /* JADX WARN: Code duplicated, block: B:68:0x0194  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:78:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:93:0x0203  */
    /* JADX WARN: Code duplicated, block: B:95:0x020a  */
    public final Object c(x1b x1bVar) throws Throwable {
        knz knzVar;
        onz.a<Key, Value> aVar;
        quw quwVar;
        quw quwVar2;
        onz<Key, Value> onzVar;
        wqz<Key, Value> wqzVar;
        wqz.b bVar;
        onz.a<Key, Value> aVar2;
        tuw tuwVar;
        enz<Key, Value> enzVar;
        onz.a<Key, Value> aVar3;
        tuw tuwVar2;
        enz<Key, Value> enzVar2;
        boolean zE;
        tsw tswVar;
        Key key;
        hxs.c cVar;
        wqz.b bVar2;
        enz<Key, Value> enzVar3;
        onz.a<Key, Value> aVar4;
        tuw tuwVar3;
        tuw tuwVar4;
        wqz.b bVar3;
        quw quwVar3;
        tb5 tb5Var;
        xmz.b bVarF;
        wqz.b.c cVar2;
        onz.a<Key, Value> aVar5;
        tuw tuwVar5;
        onz.a<Key, Value> aVar6;
        enz<Key, Value> enzVar4;
        y650<Key, Value> y650Var;
        xqz<Key, Value> xqzVarA;
        wqz.b.c cVar3;
        quw quwVar4;
        onz<Key, Value> onzVar2;
        hxs.a aVar7;
        enz<Key, Value> enzVar5 = this;
        if (x1bVar instanceof knz) {
            knzVar = (knz) x1bVar;
            int i = knzVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                knzVar.i = i - Integer.MIN_VALUE;
            } else {
                knzVar = new knz(enzVar5, x1bVar);
            }
        } else {
            knzVar = new knz(enzVar5, x1bVar);
        }
        Object objD = knzVar.e;
        y5b y5bVar = y5b.a;
        int i2 = knzVar.i;
        kxs kxsVar = kxs.c;
        kxs kxsVar2 = kxs.b;
        kxs kxsVar3 = kxs.a;
        switch (i2) {
            case 0:
                uj50.b(objD);
                aVar = enzVar5.j;
                quwVar = aVar.a;
                knzVar.a = enzVar5;
                knzVar.b = aVar;
                knzVar.c = quwVar;
                knzVar.i = 1;
                if (quwVar.d(knzVar) != y5bVar) {
                    try {
                        onzVar = aVar.b;
                        knzVar.a = enzVar5;
                        knzVar.b = quwVar;
                        knzVar.c = null;
                        knzVar.i = 2;
                        if (enzVar5.j(onzVar, kxsVar3, knzVar) != y5bVar) {
                            quwVar2 = quwVar;
                            Unit unit = Unit.a;
                            quwVar2.f(null);
                            Key key2 = enzVar5.a;
                            wqzVar = enzVar5.b;
                            wqz.a<Key> aVarE = enzVar5.e(kxsVar3, key2);
                            if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                                Log.d("Paging", "Start REFRESH with loadKey " + enzVar5.a + " on " + wqzVar, null);
                            }
                            knzVar.a = enzVar5;
                            knzVar.b = null;
                            knzVar.i = 3;
                            objD = wqzVar.d(aVarE, knzVar);
                            if (objD != y5bVar) {
                                bVar = (wqz.b) objD;
                                if (bVar instanceof wqz.b.c) {
                                    aVar3 = enzVar5.j;
                                    tuwVar2 = aVar3.a;
                                    knzVar.a = enzVar5;
                                    knzVar.b = bVar;
                                    knzVar.c = aVar3;
                                    knzVar.d = tuwVar2;
                                    knzVar.i = 4;
                                    if (tuwVar2.d(knzVar) != y5bVar) {
                                        enzVar2 = enzVar5;
                                        try {
                                            onz<Key, Value> onzVar3 = aVar3.b;
                                            zE = onzVar3.e(0, kxsVar3, (wqz.b.c) bVar);
                                            tswVar = onzVar3.l;
                                            tswVar.c(kxsVar3, hxs.c.c);
                                            key = ((wqz.b.c) bVar).b;
                                            cVar = hxs.c.b;
                                            if (key == null) {
                                                tswVar.c(kxsVar2, cVar);
                                            }
                                            if (((wqz.b.c) bVar).c == null) {
                                                tswVar.c(kxsVar, cVar);
                                            }
                                            tuwVar2.f(null);
                                            if (!zE) {
                                                if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                                                    Log.v("Paging", f(kxsVar3, enzVar2.a, null), null);
                                                }
                                                bVar2 = bVar;
                                                enzVar3 = enzVar2;
                                                if (enzVar3.e != null) {
                                                    cVar2 = (wqz.b.c) bVar2;
                                                    if (cVar2.b != null) {
                                                    }
                                                    aVar5 = enzVar3.j;
                                                    tuwVar5 = aVar5.a;
                                                    knzVar.a = enzVar3;
                                                    knzVar.b = bVar2;
                                                    knzVar.c = aVar5;
                                                    knzVar.d = tuwVar5;
                                                    knzVar.i = 7;
                                                    if (tuwVar5.d(knzVar) != y5bVar) {
                                                        aVar6 = aVar5;
                                                        enzVar4 = enzVar3;
                                                        onz<Key, Value> onzVar4 = aVar6.b;
                                                        x8m x8mVar = enzVar4.g;
                                                        y650Var = enzVar4.e;
                                                        xqzVarA = onzVar4.a(x8mVar.a.c);
                                                        tuwVar5.f(null);
                                                        cVar3 = (wqz.b.c) bVar2;
                                                        if (cVar3.b == null) {
                                                            y650Var.c(kxsVar2, xqzVarA);
                                                        }
                                                        if (cVar3.c == null) {
                                                            y650Var.c(kxsVar, xqzVarA);
                                                        }
                                                    }
                                                }
                                                return Unit.a;
                                            }
                                            if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                                                Log.d("Paging", f(kxsVar3, enzVar2.a, bVar), null);
                                            }
                                            aVar4 = enzVar2.j;
                                            tuwVar3 = aVar4.a;
                                            knzVar.a = enzVar2;
                                            knzVar.b = bVar;
                                            knzVar.c = aVar4;
                                            knzVar.d = tuwVar3;
                                            knzVar.i = 5;
                                            if (tuwVar3.d(knzVar) != y5bVar) {
                                                wqz.b bVar4 = bVar;
                                                tuwVar4 = tuwVar3;
                                                bVar3 = bVar4;
                                                enzVar3 = enzVar2;
                                                try {
                                                    onz<Key, Value> onzVar5 = aVar4.b;
                                                    tb5Var = enzVar3.i;
                                                    bVarF = onzVar5.f(kxsVar3, (wqz.b.c) bVar3);
                                                    knzVar.a = enzVar3;
                                                    knzVar.b = bVar3;
                                                    knzVar.c = tuwVar4;
                                                    knzVar.d = null;
                                                    knzVar.i = 6;
                                                    if (tb5Var.j(knzVar, bVarF) != y5bVar) {
                                                        quwVar3 = tuwVar4;
                                                        Unit unit2 = Unit.a;
                                                        quwVar3.f(null);
                                                        bVar2 = bVar3;
                                                        if (enzVar3.e != null) {
                                                            cVar2 = (wqz.b.c) bVar2;
                                                            if (cVar2.b != null || cVar2.c == null) {
                                                                aVar5 = enzVar3.j;
                                                                tuwVar5 = aVar5.a;
                                                                knzVar.a = enzVar3;
                                                                knzVar.b = bVar2;
                                                                knzVar.c = aVar5;
                                                                knzVar.d = tuwVar5;
                                                                knzVar.i = 7;
                                                                if (tuwVar5.d(knzVar) != y5bVar) {
                                                                    aVar6 = aVar5;
                                                                    enzVar4 = enzVar3;
                                                                    try {
                                                                        onz<Key, Value> onzVar6 = aVar6.b;
                                                                        x8m x8mVar2 = enzVar4.g;
                                                                        y650Var = enzVar4.e;
                                                                        xqzVarA = onzVar6.a(x8mVar2.a.c);
                                                                        tuwVar5.f(null);
                                                                        cVar3 = (wqz.b.c) bVar2;
                                                                        if (cVar3.b == null) {
                                                                            y650Var.c(kxsVar2, xqzVarA);
                                                                        }
                                                                        if (cVar3.c == null) {
                                                                            y650Var.c(kxsVar, xqzVarA);
                                                                        }
                                                                    } catch (Throwable th) {
                                                                        tuwVar5.f(null);
                                                                        throw th;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        return Unit.a;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    quwVar3 = tuwVar4;
                                                    quwVar3.f(null);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            tuwVar2.f(null);
                                            throw th3;
                                        }
                                    }
                                    break;
                                } else {
                                    if (bVar instanceof wqz.b.a) {
                                        if (bVar instanceof wqz.b.C1263b) {
                                            if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                                                Log.v("Paging", f(kxsVar3, enzVar5.a, bVar), null);
                                            }
                                            enzVar5.k.cancel((CancellationException) null);
                                            enzVar5.b.c();
                                        }
                                        return Unit.a;
                                    }
                                    if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                                        Log.v("Paging", f(kxsVar3, enzVar5.a, bVar), null);
                                    }
                                    aVar2 = enzVar5.j;
                                    tuwVar = aVar2.a;
                                    knzVar.a = enzVar5;
                                    knzVar.b = bVar;
                                    knzVar.c = aVar2;
                                    knzVar.d = tuwVar;
                                    knzVar.i = 8;
                                    if (tuwVar.d(knzVar) != y5bVar) {
                                        enzVar = enzVar5;
                                        try {
                                            onzVar2 = aVar2.b;
                                            aVar7 = new hxs.a(((wqz.b.a) bVar).a);
                                            knzVar.a = tuwVar;
                                            knzVar.b = null;
                                            knzVar.c = null;
                                            knzVar.d = null;
                                            knzVar.i = 9;
                                            if (enzVar.i(onzVar2, kxsVar3, aVar7, knzVar) != y5bVar) {
                                                quwVar4 = tuwVar;
                                                Unit unit3 = Unit.a;
                                                quwVar4.f(null);
                                                return Unit.a;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            quwVar4 = tuwVar;
                                            quwVar4.f(null);
                                            throw th;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        quwVar2 = quwVar;
                        quwVar2.f(null);
                        throw th;
                    }
                }
                return y5bVar;
            case 1:
                quw quwVar5 = (quw) knzVar.c;
                aVar = (onz.a) knzVar.b;
                enz<Key, Value> enzVar6 = (enz) knzVar.a;
                uj50.b(objD);
                quwVar = quwVar5;
                enzVar5 = enzVar6;
                onzVar = aVar.b;
                knzVar.a = enzVar5;
                knzVar.b = quwVar;
                knzVar.c = null;
                knzVar.i = 2;
                if (enzVar5.j(onzVar, kxsVar3, knzVar) != y5bVar) {
                    quwVar2 = quwVar;
                    Unit unit4 = Unit.a;
                    quwVar2.f(null);
                    Key key3 = enzVar5.a;
                    wqzVar = enzVar5.b;
                    wqz.a<Key> aVarE2 = enzVar5.e(kxsVar3, key3);
                    if (Build.ID != null) {
                        Log.d("Paging", "Start REFRESH with loadKey " + enzVar5.a + " on " + wqzVar, null);
                    }
                    knzVar.a = enzVar5;
                    knzVar.b = null;
                    knzVar.i = 3;
                    objD = wqzVar.d(aVarE2, knzVar);
                    if (objD != y5bVar) {
                        bVar = (wqz.b) objD;
                        if (bVar instanceof wqz.b.c) {
                            aVar3 = enzVar5.j;
                            tuwVar2 = aVar3.a;
                            knzVar.a = enzVar5;
                            knzVar.b = bVar;
                            knzVar.c = aVar3;
                            knzVar.d = tuwVar2;
                            knzVar.i = 4;
                            if (tuwVar2.d(knzVar) != y5bVar) {
                                enzVar2 = enzVar5;
                                onz<Key, Value> onzVar7 = aVar3.b;
                                zE = onzVar7.e(0, kxsVar3, (wqz.b.c) bVar);
                                tswVar = onzVar7.l;
                                tswVar.c(kxsVar3, hxs.c.c);
                                key = ((wqz.b.c) bVar).b;
                                cVar = hxs.c.b;
                                if (key == null) {
                                    tswVar.c(kxsVar2, cVar);
                                }
                                if (((wqz.b.c) bVar).c == null) {
                                    tswVar.c(kxsVar, cVar);
                                }
                                tuwVar2.f(null);
                                if (!zE) {
                                    if (Build.ID != null) {
                                        Log.v("Paging", f(kxsVar3, enzVar2.a, null), null);
                                    }
                                    bVar2 = bVar;
                                    enzVar3 = enzVar2;
                                    if (enzVar3.e != null) {
                                        cVar2 = (wqz.b.c) bVar2;
                                        if (cVar2.b != null) {
                                        }
                                        aVar5 = enzVar3.j;
                                        tuwVar5 = aVar5.a;
                                        knzVar.a = enzVar3;
                                        knzVar.b = bVar2;
                                        knzVar.c = aVar5;
                                        knzVar.d = tuwVar5;
                                        knzVar.i = 7;
                                        if (tuwVar5.d(knzVar) != y5bVar) {
                                            aVar6 = aVar5;
                                            enzVar4 = enzVar3;
                                            onz<Key, Value> onzVar8 = aVar6.b;
                                            x8m x8mVar3 = enzVar4.g;
                                            y650Var = enzVar4.e;
                                            xqzVarA = onzVar8.a(x8mVar3.a.c);
                                            tuwVar5.f(null);
                                            cVar3 = (wqz.b.c) bVar2;
                                            if (cVar3.b == null) {
                                                y650Var.c(kxsVar2, xqzVarA);
                                            }
                                            if (cVar3.c == null) {
                                                y650Var.c(kxsVar, xqzVarA);
                                            }
                                        }
                                        break;
                                    }
                                    return Unit.a;
                                }
                                if (Build.ID != null) {
                                    Log.d("Paging", f(kxsVar3, enzVar2.a, bVar), null);
                                }
                                aVar4 = enzVar2.j;
                                tuwVar3 = aVar4.a;
                                knzVar.a = enzVar2;
                                knzVar.b = bVar;
                                knzVar.c = aVar4;
                                knzVar.d = tuwVar3;
                                knzVar.i = 5;
                                if (tuwVar3.d(knzVar) != y5bVar) {
                                    wqz.b bVar5 = bVar;
                                    tuwVar4 = tuwVar3;
                                    bVar3 = bVar5;
                                    enzVar3 = enzVar2;
                                    onz<Key, Value> onzVar9 = aVar4.b;
                                    tb5Var = enzVar3.i;
                                    bVarF = onzVar9.f(kxsVar3, (wqz.b.c) bVar3);
                                    knzVar.a = enzVar3;
                                    knzVar.b = bVar3;
                                    knzVar.c = tuwVar4;
                                    knzVar.d = null;
                                    knzVar.i = 6;
                                    if (tb5Var.j(knzVar, bVarF) != y5bVar) {
                                        quwVar3 = tuwVar4;
                                        Unit unit5 = Unit.a;
                                        quwVar3.f(null);
                                        bVar2 = bVar3;
                                        if (enzVar3.e != null) {
                                            cVar2 = (wqz.b.c) bVar2;
                                            if (cVar2.b != null) {
                                            }
                                            aVar5 = enzVar3.j;
                                            tuwVar5 = aVar5.a;
                                            knzVar.a = enzVar3;
                                            knzVar.b = bVar2;
                                            knzVar.c = aVar5;
                                            knzVar.d = tuwVar5;
                                            knzVar.i = 7;
                                            if (tuwVar5.d(knzVar) != y5bVar) {
                                                aVar6 = aVar5;
                                                enzVar4 = enzVar3;
                                                onz<Key, Value> onzVar10 = aVar6.b;
                                                x8m x8mVar4 = enzVar4.g;
                                                y650Var = enzVar4.e;
                                                xqzVarA = onzVar10.a(x8mVar4.a.c);
                                                tuwVar5.f(null);
                                                cVar3 = (wqz.b.c) bVar2;
                                                if (cVar3.b == null) {
                                                    y650Var.c(kxsVar2, xqzVarA);
                                                }
                                                if (cVar3.c == null) {
                                                    y650Var.c(kxsVar, xqzVarA);
                                                }
                                            }
                                            break;
                                        }
                                        return Unit.a;
                                    }
                                }
                            }
                        } else {
                            if (bVar instanceof wqz.b.a) {
                                if (bVar instanceof wqz.b.C1263b) {
                                    if (Build.ID != null) {
                                        Log.v("Paging", f(kxsVar3, enzVar5.a, bVar), null);
                                    }
                                    enzVar5.k.cancel((CancellationException) null);
                                    enzVar5.b.c();
                                }
                                return Unit.a;
                            }
                            if (Build.ID != null) {
                                Log.v("Paging", f(kxsVar3, enzVar5.a, bVar), null);
                            }
                            aVar2 = enzVar5.j;
                            tuwVar = aVar2.a;
                            knzVar.a = enzVar5;
                            knzVar.b = bVar;
                            knzVar.c = aVar2;
                            knzVar.d = tuwVar;
                            knzVar.i = 8;
                            if (tuwVar.d(knzVar) != y5bVar) {
                                enzVar = enzVar5;
                                onzVar2 = aVar2.b;
                                aVar7 = new hxs.a(((wqz.b.a) bVar).a);
                                knzVar.a = tuwVar;
                                knzVar.b = null;
                                knzVar.c = null;
                                knzVar.d = null;
                                knzVar.i = 9;
                                if (enzVar.i(onzVar2, kxsVar3, aVar7, knzVar) != y5bVar) {
                                    quwVar4 = tuwVar;
                                    Unit unit6 = Unit.a;
                                    quwVar4.f(null);
                                    return Unit.a;
                                }
                            }
                        }
                    }
                    break;
                }
                return y5bVar;
            case 2:
                quwVar2 = (quw) knzVar.b;
                enzVar5 = (enz) knzVar.a;
                try {
                    uj50.b(objD);
                    Unit unit7 = Unit.a;
                    quwVar2.f(null);
                    Key key4 = enzVar5.a;
                    wqzVar = enzVar5.b;
                    wqz.a<Key> aVarE3 = enzVar5.e(kxsVar3, key4);
                    if (Build.ID != null) {
                        Log.d("Paging", "Start REFRESH with loadKey " + enzVar5.a + " on " + wqzVar, null);
                    }
                    knzVar.a = enzVar5;
                    knzVar.b = null;
                    knzVar.i = 3;
                    objD = wqzVar.d(aVarE3, knzVar);
                    if (objD != y5bVar) {
                        bVar = (wqz.b) objD;
                        if (bVar instanceof wqz.b.c) {
                            aVar3 = enzVar5.j;
                            tuwVar2 = aVar3.a;
                            knzVar.a = enzVar5;
                            knzVar.b = bVar;
                            knzVar.c = aVar3;
                            knzVar.d = tuwVar2;
                            knzVar.i = 4;
                            if (tuwVar2.d(knzVar) != y5bVar) {
                                enzVar2 = enzVar5;
                                onz<Key, Value> onzVar11 = aVar3.b;
                                zE = onzVar11.e(0, kxsVar3, (wqz.b.c) bVar);
                                tswVar = onzVar11.l;
                                tswVar.c(kxsVar3, hxs.c.c);
                                key = ((wqz.b.c) bVar).b;
                                cVar = hxs.c.b;
                                if (key == null) {
                                    tswVar.c(kxsVar2, cVar);
                                }
                                if (((wqz.b.c) bVar).c == null) {
                                    tswVar.c(kxsVar, cVar);
                                }
                                tuwVar2.f(null);
                                if (!zE) {
                                    if (Build.ID != null) {
                                        Log.v("Paging", f(kxsVar3, enzVar2.a, null), null);
                                    }
                                    bVar2 = bVar;
                                    enzVar3 = enzVar2;
                                    if (enzVar3.e != null) {
                                        cVar2 = (wqz.b.c) bVar2;
                                        if (cVar2.b != null) {
                                        }
                                        aVar5 = enzVar3.j;
                                        tuwVar5 = aVar5.a;
                                        knzVar.a = enzVar3;
                                        knzVar.b = bVar2;
                                        knzVar.c = aVar5;
                                        knzVar.d = tuwVar5;
                                        knzVar.i = 7;
                                        if (tuwVar5.d(knzVar) != y5bVar) {
                                            aVar6 = aVar5;
                                            enzVar4 = enzVar3;
                                            onz<Key, Value> onzVar12 = aVar6.b;
                                            x8m x8mVar5 = enzVar4.g;
                                            y650Var = enzVar4.e;
                                            xqzVarA = onzVar12.a(x8mVar5.a.c);
                                            tuwVar5.f(null);
                                            cVar3 = (wqz.b.c) bVar2;
                                            if (cVar3.b == null) {
                                                y650Var.c(kxsVar2, xqzVarA);
                                            }
                                            if (cVar3.c == null) {
                                                y650Var.c(kxsVar, xqzVarA);
                                            }
                                        }
                                        break;
                                    }
                                    return Unit.a;
                                }
                                if (Build.ID != null) {
                                    Log.d("Paging", f(kxsVar3, enzVar2.a, bVar), null);
                                }
                                aVar4 = enzVar2.j;
                                tuwVar3 = aVar4.a;
                                knzVar.a = enzVar2;
                                knzVar.b = bVar;
                                knzVar.c = aVar4;
                                knzVar.d = tuwVar3;
                                knzVar.i = 5;
                                if (tuwVar3.d(knzVar) != y5bVar) {
                                    wqz.b bVar6 = bVar;
                                    tuwVar4 = tuwVar3;
                                    bVar3 = bVar6;
                                    enzVar3 = enzVar2;
                                    onz<Key, Value> onzVar13 = aVar4.b;
                                    tb5Var = enzVar3.i;
                                    bVarF = onzVar13.f(kxsVar3, (wqz.b.c) bVar3);
                                    knzVar.a = enzVar3;
                                    knzVar.b = bVar3;
                                    knzVar.c = tuwVar4;
                                    knzVar.d = null;
                                    knzVar.i = 6;
                                    if (tb5Var.j(knzVar, bVarF) != y5bVar) {
                                        quwVar3 = tuwVar4;
                                        Unit unit8 = Unit.a;
                                        quwVar3.f(null);
                                        bVar2 = bVar3;
                                        if (enzVar3.e != null) {
                                            cVar2 = (wqz.b.c) bVar2;
                                            if (cVar2.b != null) {
                                            }
                                            aVar5 = enzVar3.j;
                                            tuwVar5 = aVar5.a;
                                            knzVar.a = enzVar3;
                                            knzVar.b = bVar2;
                                            knzVar.c = aVar5;
                                            knzVar.d = tuwVar5;
                                            knzVar.i = 7;
                                            if (tuwVar5.d(knzVar) != y5bVar) {
                                                aVar6 = aVar5;
                                                enzVar4 = enzVar3;
                                                onz<Key, Value> onzVar14 = aVar6.b;
                                                x8m x8mVar6 = enzVar4.g;
                                                y650Var = enzVar4.e;
                                                xqzVarA = onzVar14.a(x8mVar6.a.c);
                                                tuwVar5.f(null);
                                                cVar3 = (wqz.b.c) bVar2;
                                                if (cVar3.b == null) {
                                                    y650Var.c(kxsVar2, xqzVarA);
                                                }
                                                if (cVar3.c == null) {
                                                    y650Var.c(kxsVar, xqzVarA);
                                                }
                                            }
                                            break;
                                        }
                                        return Unit.a;
                                    }
                                }
                            }
                        } else {
                            if (bVar instanceof wqz.b.a) {
                                if (bVar instanceof wqz.b.C1263b) {
                                    if (Build.ID != null) {
                                        Log.v("Paging", f(kxsVar3, enzVar5.a, bVar), null);
                                    }
                                    enzVar5.k.cancel((CancellationException) null);
                                    enzVar5.b.c();
                                }
                                return Unit.a;
                            }
                            if (Build.ID != null) {
                                Log.v("Paging", f(kxsVar3, enzVar5.a, bVar), null);
                            }
                            aVar2 = enzVar5.j;
                            tuwVar = aVar2.a;
                            knzVar.a = enzVar5;
                            knzVar.b = bVar;
                            knzVar.c = aVar2;
                            knzVar.d = tuwVar;
                            knzVar.i = 8;
                            if (tuwVar.d(knzVar) != y5bVar) {
                                enzVar = enzVar5;
                                onzVar2 = aVar2.b;
                                aVar7 = new hxs.a(((wqz.b.a) bVar).a);
                                knzVar.a = tuwVar;
                                knzVar.b = null;
                                knzVar.c = null;
                                knzVar.d = null;
                                knzVar.i = 9;
                                if (enzVar.i(onzVar2, kxsVar3, aVar7, knzVar) != y5bVar) {
                                    quwVar4 = tuwVar;
                                    Unit unit9 = Unit.a;
                                    quwVar4.f(null);
                                    return Unit.a;
                                }
                            }
                        }
                    }
                    return y5bVar;
                } catch (Throwable th6) {
                    th = th6;
                    quwVar2.f(null);
                    throw th;
                }
            case 3:
                enzVar5 = (enz) knzVar.a;
                uj50.b(objD);
                bVar = (wqz.b) objD;
                if (bVar instanceof wqz.b.c) {
                    aVar3 = enzVar5.j;
                    tuwVar2 = aVar3.a;
                    knzVar.a = enzVar5;
                    knzVar.b = bVar;
                    knzVar.c = aVar3;
                    knzVar.d = tuwVar2;
                    knzVar.i = 4;
                    if (tuwVar2.d(knzVar) != y5bVar) {
                        enzVar2 = enzVar5;
                        onz<Key, Value> onzVar15 = aVar3.b;
                        zE = onzVar15.e(0, kxsVar3, (wqz.b.c) bVar);
                        tswVar = onzVar15.l;
                        tswVar.c(kxsVar3, hxs.c.c);
                        key = ((wqz.b.c) bVar).b;
                        cVar = hxs.c.b;
                        if (key == null) {
                            tswVar.c(kxsVar2, cVar);
                        }
                        if (((wqz.b.c) bVar).c == null) {
                            tswVar.c(kxsVar, cVar);
                        }
                        tuwVar2.f(null);
                        if (!zE) {
                            if (Build.ID != null) {
                                Log.v("Paging", f(kxsVar3, enzVar2.a, null), null);
                            }
                            bVar2 = bVar;
                            enzVar3 = enzVar2;
                            if (enzVar3.e != null) {
                                cVar2 = (wqz.b.c) bVar2;
                                if (cVar2.b != null) {
                                }
                                aVar5 = enzVar3.j;
                                tuwVar5 = aVar5.a;
                                knzVar.a = enzVar3;
                                knzVar.b = bVar2;
                                knzVar.c = aVar5;
                                knzVar.d = tuwVar5;
                                knzVar.i = 7;
                                if (tuwVar5.d(knzVar) != y5bVar) {
                                    aVar6 = aVar5;
                                    enzVar4 = enzVar3;
                                    onz<Key, Value> onzVar16 = aVar6.b;
                                    x8m x8mVar7 = enzVar4.g;
                                    y650Var = enzVar4.e;
                                    xqzVarA = onzVar16.a(x8mVar7.a.c);
                                    tuwVar5.f(null);
                                    cVar3 = (wqz.b.c) bVar2;
                                    if (cVar3.b == null) {
                                        y650Var.c(kxsVar2, xqzVarA);
                                    }
                                    if (cVar3.c == null) {
                                        y650Var.c(kxsVar, xqzVarA);
                                    }
                                }
                                break;
                            }
                            return Unit.a;
                        }
                        if (Build.ID != null) {
                            Log.d("Paging", f(kxsVar3, enzVar2.a, bVar), null);
                        }
                        aVar4 = enzVar2.j;
                        tuwVar3 = aVar4.a;
                        knzVar.a = enzVar2;
                        knzVar.b = bVar;
                        knzVar.c = aVar4;
                        knzVar.d = tuwVar3;
                        knzVar.i = 5;
                        if (tuwVar3.d(knzVar) != y5bVar) {
                            wqz.b bVar7 = bVar;
                            tuwVar4 = tuwVar3;
                            bVar3 = bVar7;
                            enzVar3 = enzVar2;
                            onz<Key, Value> onzVar17 = aVar4.b;
                            tb5Var = enzVar3.i;
                            bVarF = onzVar17.f(kxsVar3, (wqz.b.c) bVar3);
                            knzVar.a = enzVar3;
                            knzVar.b = bVar3;
                            knzVar.c = tuwVar4;
                            knzVar.d = null;
                            knzVar.i = 6;
                            if (tb5Var.j(knzVar, bVarF) != y5bVar) {
                                quwVar3 = tuwVar4;
                                Unit unit10 = Unit.a;
                                quwVar3.f(null);
                                bVar2 = bVar3;
                                if (enzVar3.e != null) {
                                    cVar2 = (wqz.b.c) bVar2;
                                    if (cVar2.b != null) {
                                    }
                                    aVar5 = enzVar3.j;
                                    tuwVar5 = aVar5.a;
                                    knzVar.a = enzVar3;
                                    knzVar.b = bVar2;
                                    knzVar.c = aVar5;
                                    knzVar.d = tuwVar5;
                                    knzVar.i = 7;
                                    if (tuwVar5.d(knzVar) != y5bVar) {
                                        aVar6 = aVar5;
                                        enzVar4 = enzVar3;
                                        onz<Key, Value> onzVar18 = aVar6.b;
                                        x8m x8mVar8 = enzVar4.g;
                                        y650Var = enzVar4.e;
                                        xqzVarA = onzVar18.a(x8mVar8.a.c);
                                        tuwVar5.f(null);
                                        cVar3 = (wqz.b.c) bVar2;
                                        if (cVar3.b == null) {
                                            y650Var.c(kxsVar2, xqzVarA);
                                        }
                                        if (cVar3.c == null) {
                                            y650Var.c(kxsVar, xqzVarA);
                                        }
                                    }
                                    break;
                                }
                                return Unit.a;
                            }
                        }
                    }
                    break;
                } else {
                    if (bVar instanceof wqz.b.a) {
                        if (bVar instanceof wqz.b.C1263b) {
                            if (Build.ID != null) {
                                Log.v("Paging", f(kxsVar3, enzVar5.a, bVar), null);
                            }
                            enzVar5.k.cancel((CancellationException) null);
                            enzVar5.b.c();
                        }
                        return Unit.a;
                    }
                    if (Build.ID != null) {
                        Log.v("Paging", f(kxsVar3, enzVar5.a, bVar), null);
                    }
                    aVar2 = enzVar5.j;
                    tuwVar = aVar2.a;
                    knzVar.a = enzVar5;
                    knzVar.b = bVar;
                    knzVar.c = aVar2;
                    knzVar.d = tuwVar;
                    knzVar.i = 8;
                    if (tuwVar.d(knzVar) != y5bVar) {
                        enzVar = enzVar5;
                        onzVar2 = aVar2.b;
                        aVar7 = new hxs.a(((wqz.b.a) bVar).a);
                        knzVar.a = tuwVar;
                        knzVar.b = null;
                        knzVar.c = null;
                        knzVar.d = null;
                        knzVar.i = 9;
                        if (enzVar.i(onzVar2, kxsVar3, aVar7, knzVar) != y5bVar) {
                            quwVar4 = tuwVar;
                            Unit unit11 = Unit.a;
                            quwVar4.f(null);
                            return Unit.a;
                        }
                    }
                }
                return y5bVar;
            case 4:
                tuw tuwVar6 = knzVar.d;
                aVar3 = (onz.a) knzVar.c;
                wqz.b bVar8 = (wqz.b) knzVar.b;
                enzVar2 = (enz) knzVar.a;
                uj50.b(objD);
                bVar = bVar8;
                tuwVar2 = tuwVar6;
                onz<Key, Value> onzVar19 = aVar3.b;
                zE = onzVar19.e(0, kxsVar3, (wqz.b.c) bVar);
                tswVar = onzVar19.l;
                tswVar.c(kxsVar3, hxs.c.c);
                key = ((wqz.b.c) bVar).b;
                cVar = hxs.c.b;
                if (key == null) {
                    tswVar.c(kxsVar2, cVar);
                }
                if (((wqz.b.c) bVar).c == null) {
                    tswVar.c(kxsVar, cVar);
                    break;
                }
                tuwVar2.f(null);
                if (!zE) {
                    if (Build.ID != null) {
                        Log.v("Paging", f(kxsVar3, enzVar2.a, null), null);
                    }
                    bVar2 = bVar;
                    enzVar3 = enzVar2;
                    if (enzVar3.e != null) {
                        cVar2 = (wqz.b.c) bVar2;
                        if (cVar2.b != null) {
                        }
                        aVar5 = enzVar3.j;
                        tuwVar5 = aVar5.a;
                        knzVar.a = enzVar3;
                        knzVar.b = bVar2;
                        knzVar.c = aVar5;
                        knzVar.d = tuwVar5;
                        knzVar.i = 7;
                        if (tuwVar5.d(knzVar) != y5bVar) {
                            aVar6 = aVar5;
                            enzVar4 = enzVar3;
                            onz<Key, Value> onzVar110 = aVar6.b;
                            x8m x8mVar9 = enzVar4.g;
                            y650Var = enzVar4.e;
                            xqzVarA = onzVar110.a(x8mVar9.a.c);
                            tuwVar5.f(null);
                            cVar3 = (wqz.b.c) bVar2;
                            if (cVar3.b == null) {
                                y650Var.c(kxsVar2, xqzVarA);
                            }
                            if (cVar3.c == null) {
                                y650Var.c(kxsVar, xqzVarA);
                            }
                        }
                        break;
                    }
                    return Unit.a;
                }
                if (Build.ID != null) {
                    Log.d("Paging", f(kxsVar3, enzVar2.a, bVar), null);
                }
                aVar4 = enzVar2.j;
                tuwVar3 = aVar4.a;
                knzVar.a = enzVar2;
                knzVar.b = bVar;
                knzVar.c = aVar4;
                knzVar.d = tuwVar3;
                knzVar.i = 5;
                if (tuwVar3.d(knzVar) != y5bVar) {
                    wqz.b bVar9 = bVar;
                    tuwVar4 = tuwVar3;
                    bVar3 = bVar9;
                    enzVar3 = enzVar2;
                    onz<Key, Value> onzVar111 = aVar4.b;
                    tb5Var = enzVar3.i;
                    bVarF = onzVar111.f(kxsVar3, (wqz.b.c) bVar3);
                    knzVar.a = enzVar3;
                    knzVar.b = bVar3;
                    knzVar.c = tuwVar4;
                    knzVar.d = null;
                    knzVar.i = 6;
                    if (tb5Var.j(knzVar, bVarF) != y5bVar) {
                        quwVar3 = tuwVar4;
                        Unit unit12 = Unit.a;
                        quwVar3.f(null);
                        bVar2 = bVar3;
                        if (enzVar3.e != null) {
                            cVar2 = (wqz.b.c) bVar2;
                            if (cVar2.b != null) {
                            }
                            aVar5 = enzVar3.j;
                            tuwVar5 = aVar5.a;
                            knzVar.a = enzVar3;
                            knzVar.b = bVar2;
                            knzVar.c = aVar5;
                            knzVar.d = tuwVar5;
                            knzVar.i = 7;
                            if (tuwVar5.d(knzVar) != y5bVar) {
                                aVar6 = aVar5;
                                enzVar4 = enzVar3;
                                onz<Key, Value> onzVar112 = aVar6.b;
                                x8m x8mVar10 = enzVar4.g;
                                y650Var = enzVar4.e;
                                xqzVarA = onzVar112.a(x8mVar10.a.c);
                                tuwVar5.f(null);
                                cVar3 = (wqz.b.c) bVar2;
                                if (cVar3.b == null) {
                                    y650Var.c(kxsVar2, xqzVarA);
                                }
                                if (cVar3.c == null) {
                                    y650Var.c(kxsVar, xqzVarA);
                                }
                            }
                            break;
                        }
                        return Unit.a;
                    }
                }
                return y5bVar;
            case 5:
                tuw tuwVar7 = knzVar.d;
                aVar4 = (onz.a) knzVar.c;
                wqz.b bVar10 = (wqz.b) knzVar.b;
                enz<Key, Value> enzVar7 = (enz) knzVar.a;
                uj50.b(objD);
                tuwVar4 = tuwVar7;
                bVar3 = bVar10;
                enzVar3 = enzVar7;
                onz<Key, Value> onzVar113 = aVar4.b;
                tb5Var = enzVar3.i;
                bVarF = onzVar113.f(kxsVar3, (wqz.b.c) bVar3);
                knzVar.a = enzVar3;
                knzVar.b = bVar3;
                knzVar.c = tuwVar4;
                knzVar.d = null;
                knzVar.i = 6;
                if (tb5Var.j(knzVar, bVarF) != y5bVar) {
                    quwVar3 = tuwVar4;
                    Unit unit13 = Unit.a;
                    quwVar3.f(null);
                    bVar2 = bVar3;
                    if (enzVar3.e != null) {
                        cVar2 = (wqz.b.c) bVar2;
                        if (cVar2.b != null) {
                        }
                        aVar5 = enzVar3.j;
                        tuwVar5 = aVar5.a;
                        knzVar.a = enzVar3;
                        knzVar.b = bVar2;
                        knzVar.c = aVar5;
                        knzVar.d = tuwVar5;
                        knzVar.i = 7;
                        if (tuwVar5.d(knzVar) != y5bVar) {
                            aVar6 = aVar5;
                            enzVar4 = enzVar3;
                            onz<Key, Value> onzVar114 = aVar6.b;
                            x8m x8mVar11 = enzVar4.g;
                            y650Var = enzVar4.e;
                            xqzVarA = onzVar114.a(x8mVar11.a.c);
                            tuwVar5.f(null);
                            cVar3 = (wqz.b.c) bVar2;
                            if (cVar3.b == null) {
                                y650Var.c(kxsVar2, xqzVarA);
                            }
                            if (cVar3.c == null) {
                                y650Var.c(kxsVar, xqzVarA);
                            }
                        }
                        break;
                    }
                    return Unit.a;
                }
                return y5bVar;
            case 6:
                quwVar3 = (quw) knzVar.c;
                bVar3 = (wqz.b) knzVar.b;
                enzVar3 = (enz) knzVar.a;
                try {
                    uj50.b(objD);
                    Unit unit14 = Unit.a;
                    quwVar3.f(null);
                    bVar2 = bVar3;
                    if (enzVar3.e != null) {
                        cVar2 = (wqz.b.c) bVar2;
                        if (cVar2.b != null) {
                            break;
                        }
                        aVar5 = enzVar3.j;
                        tuwVar5 = aVar5.a;
                        knzVar.a = enzVar3;
                        knzVar.b = bVar2;
                        knzVar.c = aVar5;
                        knzVar.d = tuwVar5;
                        knzVar.i = 7;
                        if (tuwVar5.d(knzVar) != y5bVar) {
                            aVar6 = aVar5;
                            enzVar4 = enzVar3;
                            onz<Key, Value> onzVar115 = aVar6.b;
                            x8m x8mVar12 = enzVar4.g;
                            y650Var = enzVar4.e;
                            xqzVarA = onzVar115.a(x8mVar12.a.c);
                            tuwVar5.f(null);
                            cVar3 = (wqz.b.c) bVar2;
                            if (cVar3.b == null) {
                                y650Var.c(kxsVar2, xqzVarA);
                            }
                            if (cVar3.c == null) {
                                y650Var.c(kxsVar, xqzVarA);
                            }
                        }
                        return y5bVar;
                    }
                    return Unit.a;
                } catch (Throwable th7) {
                    th = th7;
                    quwVar3.f(null);
                    throw th;
                }
            case 7:
                tuw tuwVar8 = knzVar.d;
                aVar6 = (onz.a) knzVar.c;
                bVar2 = (wqz.b) knzVar.b;
                enzVar4 = (enz) knzVar.a;
                uj50.b(objD);
                tuwVar5 = tuwVar8;
                onz<Key, Value> onzVar116 = aVar6.b;
                x8m x8mVar13 = enzVar4.g;
                y650Var = enzVar4.e;
                xqzVarA = onzVar116.a(x8mVar13.a.c);
                tuwVar5.f(null);
                cVar3 = (wqz.b.c) bVar2;
                if (cVar3.b == null) {
                    y650Var.c(kxsVar2, xqzVarA);
                }
                if (cVar3.c == null) {
                    y650Var.c(kxsVar, xqzVarA);
                }
                return Unit.a;
            case 8:
                tuw tuwVar9 = knzVar.d;
                aVar2 = (onz.a) knzVar.c;
                wqz.b bVar11 = (wqz.b) knzVar.b;
                enzVar = (enz) knzVar.a;
                uj50.b(objD);
                bVar = bVar11;
                tuwVar = tuwVar9;
                onzVar2 = aVar2.b;
                aVar7 = new hxs.a(((wqz.b.a) bVar).a);
                knzVar.a = tuwVar;
                knzVar.b = null;
                knzVar.c = null;
                knzVar.d = null;
                knzVar.i = 9;
                if (enzVar.i(onzVar2, kxsVar3, aVar7, knzVar) != y5bVar) {
                    quwVar4 = tuwVar;
                    Unit unit15 = Unit.a;
                    quwVar4.f(null);
                    return Unit.a;
                }
                return y5bVar;
            case 9:
                quwVar4 = (quw) knzVar.a;
                try {
                    uj50.b(objD);
                    Unit unit16 = Unit.a;
                    quwVar4.f(null);
                    return Unit.a;
                } catch (Throwable th8) {
                    th = th8;
                    quwVar4.f(null);
                    throw th;
                }
            default:
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public final wqz.a<Key> e(kxs kxsVar, Key key) {
        kxs kxsVar2 = kxs.a;
        iqz iqzVar = this.c;
        int i = kxsVar == kxsVar2 ? iqzVar.d : iqzVar.a;
        boolean z = iqzVar.c;
        kxsVar.getClass();
        int iOrdinal = kxsVar.ordinal();
        if (iOrdinal == 0) {
            return new wqz.a.c(i, key, z);
        }
        if (iOrdinal == 1) {
            if (key != null) {
                return new wqz.a.b(i, key, z);
            }
            hb5.a("key cannot be null for prepend");
            return null;
        }
        if (iOrdinal != 2) {
            uhc.a();
            return null;
        }
        if (key != null) {
            return new wqz.a.C1262a(i, key, z);
        }
        hb5.a("key cannot be null for append");
        return null;
    }

    public final Key g(onz<Key, Value> onzVar, kxs kxsVar, int i, int i2) {
        int i3;
        onzVar.getClass();
        int iOrdinal = kxsVar.ordinal();
        if (iOrdinal == 0) {
            hb5.a("Cannot get loadId for loadType: REFRESH");
            return null;
        }
        if (iOrdinal == 1) {
            i3 = onzVar.g;
        } else {
            if (iOrdinal != 2) {
                uhc.a();
                return null;
            }
            i3 = onzVar.h;
        }
        if (i != i3 || (onzVar.l.a(kxsVar) instanceof hxs.a) || i2 >= this.c.b) {
            return null;
        }
        ArrayList arrayList = onzVar.c;
        return kxsVar == kxs.b ? ((wqz.b.c) CollectionsKt.T(arrayList)).b : ((wqz.b.c) CollectionsKt.b0(arrayList)).c;
    }

    public final Object h(kxs kxsVar, qai0 qai0Var, mnz mnzVar) throws Throwable {
        if (a.a[kxsVar.ordinal()] == 1) {
            Object objC = c(mnzVar);
            return objC == y5b.a ? objC : Unit.a;
        }
        if (qai0Var == null) {
            ib5.a("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
            return null;
        }
        x8m x8mVar = this.g;
        x8mVar.getClass();
        if (kxsVar == kxs.b || kxsVar == kxs.c) {
            x8mVar.a.a(null, new y8m(kxsVar, qai0Var));
            return Unit.a;
        }
        r2z.a(kxsVar, "invalid load type for reset: ");
        return null;
    }

    public final Object i(onz onzVar, kxs kxsVar, hxs.a aVar, x1b x1bVar) {
        tsw tswVar = onzVar.l;
        if (Intrinsics.g(tswVar.a(kxsVar), aVar)) {
            return Unit.a;
        }
        tswVar.c(kxsVar, aVar);
        Object objJ = this.i.j(x1bVar, new xmz.c(tswVar.d(), null));
        return objJ == y5b.a ? objJ : Unit.a;
    }

    public final Object j(onz onzVar, kxs kxsVar, x1b x1bVar) {
        tsw tswVar = onzVar.l;
        hxs hxsVarA = tswVar.a(kxsVar);
        hxs.b bVar = hxs.b.b;
        if (Intrinsics.g(hxsVarA, bVar)) {
            return Unit.a;
        }
        tswVar.c(kxsVar, bVar);
        Object objJ = this.i.j(x1bVar, new xmz.c(tswVar.d(), null));
        return objJ == y5b.a ? objJ : Unit.a;
    }

    public final void k(v5b v5bVar) {
        ej5.c(v5bVar, null, null, new c(this, null), 3);
        ej5.c(v5bVar, null, null, new d(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:148:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:170:0x052b  */
    /* JADX WARN: Code duplicated, block: B:172:0x052f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0533  */
    /* JADX WARN: Code duplicated, block: B:179:0x0553  */
    /* JADX WARN: Code duplicated, block: B:182:0x0560  */
    /* JADX WARN: Code duplicated, block: B:183:0x0562  */
    /* JADX WARN: Code duplicated, block: B:187:0x058d  */
    /* JADX WARN: Code duplicated, block: B:190:0x05a3 A[Catch: all -> 0x05de, TryCatch #8 {all -> 0x05de, blocks: (B:188:0x0597, B:190:0x05a3, B:194:0x05d6, B:198:0x05e6, B:200:0x05fe, B:202:0x0606, B:204:0x060a, B:206:0x060f, B:205:0x060d, B:207:0x0612), top: B:269:0x0597 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:193:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:200:0x05fe A[Catch: all -> 0x05de, TryCatch #8 {all -> 0x05de, blocks: (B:188:0x0597, B:190:0x05a3, B:194:0x05d6, B:198:0x05e6, B:200:0x05fe, B:202:0x0606, B:204:0x060a, B:206:0x060f, B:205:0x060d, B:207:0x0612), top: B:269:0x0597 }] */
    /* JADX WARN: Code duplicated, block: B:204:0x060a A[Catch: all -> 0x05de, TryCatch #8 {all -> 0x05de, blocks: (B:188:0x0597, B:190:0x05a3, B:194:0x05d6, B:198:0x05e6, B:200:0x05fe, B:202:0x0606, B:204:0x060a, B:206:0x060f, B:205:0x060d, B:207:0x0612), top: B:269:0x0597 }] */
    /* JADX WARN: Code duplicated, block: B:205:0x060d A[Catch: all -> 0x05de, TryCatch #8 {all -> 0x05de, blocks: (B:188:0x0597, B:190:0x05a3, B:194:0x05d6, B:198:0x05e6, B:200:0x05fe, B:202:0x0606, B:204:0x060a, B:206:0x060f, B:205:0x060d, B:207:0x0612), top: B:269:0x0597 }] */
    /* JADX WARN: Code duplicated, block: B:210:0x063d  */
    /* JADX WARN: Code duplicated, block: B:214:0x0650  */
    /* JADX WARN: Code duplicated, block: B:217:0x0659  */
    /* JADX WARN: Code duplicated, block: B:220:0x065e  */
    /* JADX WARN: Code duplicated, block: B:223:0x0666  */
    /* JADX WARN: Code duplicated, block: B:226:0x066b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:88:0x0356  */
    /* JADX WARN: Code duplicated, block: B:90:0x0360  */
    /* JADX WARN: Code duplicated, block: B:96:0x03a9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v122 */
    /* JADX WARN: Type inference failed for: r0v123 */
    /* JADX WARN: Type inference failed for: r0v124 */
    /* JADX WARN: Type inference failed for: r0v125 */
    /* JADX WARN: Type inference failed for: r0v126 */
    /* JADX WARN: Type inference failed for: r0v127 */
    /* JADX WARN: Type inference failed for: r0v62, types: [enz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65, types: [enz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r10v26, types: [qai0] */
    /* JADX WARN: Type inference failed for: r10v30, types: [tsw] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.lang.Object, kxs] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v40, types: [enz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44, types: [enz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v46, types: [java.lang.Object, kxs] */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v54 */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r13v56 */
    /* JADX WARN: Type inference failed for: r13v57 */
    /* JADX WARN: Type inference failed for: r13v58 */
    /* JADX WARN: Type inference failed for: r13v59 */
    /* JADX WARN: Type inference failed for: r13v60 */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r14v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v43, types: [enz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v50 */
    /* JADX WARN: Type inference failed for: r14v51 */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r14v53 */
    /* JADX WARN: Type inference failed for: r15v12, types: [qai0] */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v26, types: [enz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33, types: [java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v35, types: [kxs] */
    /* JADX WARN: Type inference failed for: r15v36, types: [java.lang.Enum, java.lang.Object, kxs] */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46, types: [enz] */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [quw] */
    /* JADX WARN: Type inference failed for: r1v39, types: [quw] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r1v90 */
    /* JADX WARN: Type inference failed for: r1v91 */
    /* JADX WARN: Type inference failed for: r21v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v14, types: [T] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, kxs] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kxs] */
    /* JADX WARN: Type inference failed for: r5v79, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [enz] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v8, types: [T, java.lang.Object] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:225:0x0669 -> B:237:0x06b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:227:0x066d -> B:237:0x06b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:229:0x0692 -> B:263:0x0695). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(defpackage.kxs r22, defpackage.p1k r23, defpackage.v1b<? super kotlin.Unit> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enz.d(kxs, p1k, v1b):java.lang.Object");
    }
}
