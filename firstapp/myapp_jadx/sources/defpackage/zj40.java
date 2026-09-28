package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {1159}, m = "invokeSuspend")
public final class zj40 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public b5a0 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ wj40 d;
    public final /* synthetic */ bk40 e;
    public final /* synthetic */ r4w f;

    @c0d(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", l = {1159}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ bk40 c;
        public final /* synthetic */ r4w d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bk40 bk40Var, r4w r4wVar, v1b v1bVar) {
            super(2, v1bVar);
            this.c = bk40Var;
            this.d = r4wVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            v5b v5bVar = (v5b) this.b;
            this.a = 1;
            this.c.invoke(v5bVar, this.d, this);
            return y5bVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj40(wj40 wj40Var, bk40 bk40Var, r4w r4wVar, v1b v1bVar) {
        super(2, v1bVar);
        this.d = wj40Var;
        this.e = bk40Var;
        this.f = r4wVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zj40 zj40Var = new zj40(this.d, this.e, this.f, v1bVar);
        zj40Var.c = obj;
        return zj40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zj40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011a A[EDGE_INSN: B:101:0x011a->B:76:0x011a BREAK  A[LOOP:1: B:71:0x0105->B:103:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:42:0x00bb, B:44:0x00bf, B:47:0x00c4), top: B:88:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f6 A[Catch: all -> 0x00f9, TryCatch #4 {all -> 0x00f9, blocks: (B:63:0x00f2, B:65:0x00f6, B:68:0x00fb), top: B:95:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0113  */
    /* JADX WARN: Code duplicated, block: B:88:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00e2 A[EDGE_INSN: B:98:0x00e2->B:54:0x00e2 BREAK  A[LOOP:0: B:50:0x00ce->B:100:?], SYNTHETIC] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        c9p c9pVarF;
        wwd0 wwd0Var;
        zg00 zg00Var;
        qg00 qg00VarAdd;
        b5a0 b5a0Var;
        Throwable th;
        List<t2b> listC;
        wj40 wj40Var;
        wj40.b bVar;
        wwd0 wwd0Var2;
        zg00 zg00Var2;
        qg00 qg00VarRemove;
        wj40 wj40Var2;
        wj40.b bVar2;
        wwd0 wwd0Var3;
        zg00 zg00Var3;
        qg00 qg00VarRemove2;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b5a0Var = this.a;
            c9pVarF = (c9p) this.c;
            try {
                uj50.b(obj);
                b5a0Var.a();
                wj40Var2 = this.d;
                synchronized (wj40Var2.b) {
                    try {
                        if (wj40Var2.c == c9pVarF) {
                            wj40Var2.c = null;
                        }
                        wj40Var2.z();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                wwd0 wwd0Var4 = wj40.y;
                bVar2 = this.d.x;
                do {
                    wwd0Var3 = wj40.y;
                    zg00Var3 = (zg00) wwd0Var3.getValue();
                    qg00VarRemove2 = zg00Var3.remove((Object) bVar2);
                    if (zg00Var3 != qg00VarRemove2) {
                        break;
                    }
                } while (!wwd0Var3.g(zg00Var3, qg00VarRemove2));
                return Unit.a;
            } catch (Throwable th3) {
                th = th3;
                b5a0Var.a();
                wj40Var = this.d;
                synchronized (wj40Var.b) {
                    try {
                        if (wj40Var.c == c9pVarF) {
                            wj40Var.c = null;
                        }
                        wj40Var.z();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                wwd0 wwd0Var5 = wj40.y;
                bVar = this.d.x;
                do {
                    wwd0Var2 = wj40.y;
                    zg00Var2 = (zg00) wwd0Var2.getValue();
                    qg00VarRemove = zg00Var2.remove((Object) bVar);
                    if (zg00Var2 != qg00VarRemove) {
                        break;
                    }
                } while (!wwd0Var2.g(zg00Var2, qg00VarRemove));
                throw th;
            }
        }
        uj50.b(obj);
        c9pVarF = i9p.f(((v5b) this.c).getCoroutineContext());
        wj40 wj40Var3 = this.d;
        wwd0 wwd0Var6 = wj40.y;
        synchronized (wj40Var3.b) {
            Throwable th5 = wj40Var3.d;
            if (th5 != null) {
                throw th5;
            }
            if (((wj40.c) wj40Var3.t.getValue()).compareTo(wj40.c.b) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (wj40Var3.c != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            wj40Var3.c = c9pVarF;
            wj40Var3.z();
        }
        c5a0.a aVar = c5a0.e;
        yj40 yj40Var = new yj40(this.d, 0);
        aVar.getClass();
        b5a0 b5a0VarD = c5a0.a.d(yj40Var);
        wj40.b bVar3 = this.d.x;
        do {
            wwd0Var = wj40.y;
            zg00Var = (zg00) wwd0Var.getValue();
            qg00VarAdd = zg00Var.add((Object) bVar3);
            if (zg00Var == qg00VarAdd) {
                break;
            }
        } while (!wwd0Var.g(zg00Var, qg00VarAdd));
        try {
            wj40 wj40Var4 = this.d;
            synchronized (wj40Var4.b) {
                listC = wj40Var4.C();
            }
            int size = listC.size();
            for (int i2 = 0; i2 < size; i2++) {
                listC.get(i2).x();
            }
            a aVar2 = new a(this.e, this.f, null);
            this.c = c9pVarF;
            this.a = b5a0VarD;
            this.b = 1;
            if (w5b.d(aVar2, this) == y5bVar) {
                return y5bVar;
            }
            b5a0Var = b5a0VarD;
            b5a0Var.a();
            wj40Var2 = this.d;
            synchronized (wj40Var2.b) {
                if (wj40Var2.c == c9pVarF) {
                    wj40Var2.c = null;
                }
                wj40Var2.z();
                wwd0 wwd0Var7 = wj40.y;
                bVar2 = this.d.x;
                do {
                    wwd0Var3 = wj40.y;
                    zg00Var3 = (zg00) wwd0Var3.getValue();
                    qg00VarRemove2 = zg00Var3.remove((Object) bVar2);
                    if (zg00Var3 != qg00VarRemove2) {
                        break;
                        break;
                    }
                } while (!wwd0Var3.g(zg00Var3, qg00VarRemove2));
                return Unit.a;
            }
        } catch (Throwable th6) {
            b5a0Var = b5a0VarD;
            th = th6;
            b5a0Var.a();
            wj40Var = this.d;
            synchronized (wj40Var.b) {
                if (wj40Var.c == c9pVarF) {
                    wj40Var.c = null;
                }
                wj40Var.z();
                wwd0 wwd0Var8 = wj40.y;
                bVar = this.d.x;
                do {
                    wwd0Var2 = wj40.y;
                    zg00Var2 = (zg00) wwd0Var2.getValue();
                    qg00VarRemove = zg00Var2.remove((Object) bVar);
                    if (zg00Var2 != qg00VarRemove) {
                        break;
                        break;
                    }
                } while (!wwd0Var2.g(zg00Var2, qg00VarRemove));
                throw th;
            }
        }
    }
}
