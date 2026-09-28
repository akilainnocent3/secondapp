package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class k9j0 implements cbs {
    public final /* synthetic */ j1b a;
    public final /* synthetic */ lzz b;
    public final /* synthetic */ wj40 c;
    public final /* synthetic */ dq40<p5w> d;
    public final /* synthetic */ View e;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[s9s.a.values().length];
            try {
                iArr[s9s.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s9s.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s9s.a.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s9s.a.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s9s.a.ON_PAUSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s9s.a.ON_RESUME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[s9s.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    @c0d(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {388}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ dq40<p5w> c;
        public final /* synthetic */ wj40 d;
        public final /* synthetic */ ibs e;
        public final /* synthetic */ k9j0 f;
        public final /* synthetic */ View i;

        @c0d(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", l = {383}, m = "invokeSuspend")
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ uwd0<Float> b;
            public final /* synthetic */ p5w c;

            /* JADX INFO: renamed from: k9j0$b$a$a, reason: collision with other inner class name */
            public static final class C0754a<T> implements myh {
                public final /* synthetic */ p5w a;

                public C0754a(p5w p5wVar) {
                    this.a = p5wVar;
                }

                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    ((t5a0) this.a.a).A(((Number) obj).floatValue());
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(uwd0<Float> uwd0Var, p5w p5wVar, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = uwd0Var;
                this.c = p5wVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                return y5b.a;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    C0754a c0754a = new C0754a(this.c);
                    this.a = 1;
                    if (this.b.collect(c0754a, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                fkd.a();
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(dq40<p5w> dq40Var, wj40 wj40Var, ibs ibsVar, k9j0 k9j0Var, View view, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = dq40Var;
            this.d = wj40Var;
            this.e = ibsVar;
            this.f = k9j0Var;
            this.i = view;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.c, this.d, this.e, this.f, this.i, v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x008f  */
        /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            c9p c9pVar;
            jvd0 jvd0VarC;
            Object obj2 = y5b.a;
            int i = this.a;
            k9j0 k9j0Var = this.f;
            ibs ibsVar = this.e;
            if (i != 0) {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c9pVar = (c9p) this.b;
                try {
                    uj50.b(obj);
                    if (c9pVar != null) {
                        c9pVar.cancel((CancellationException) null);
                    }
                    ibsVar.getLifecycle().d(k9j0Var);
                    return Unit.a;
                } catch (Throwable th) {
                    th = th;
                    if (c9pVar != null) {
                        c9pVar.cancel((CancellationException) null);
                    }
                    ibsVar.getLifecycle().d(k9j0Var);
                    throw th;
                }
            }
            uj50.b(obj);
            v5b v5bVar = (v5b) this.b;
            try {
                p5w p5wVar = this.c.a;
                if (p5wVar != null) {
                    uwd0<Float> uwd0VarA = l9j0.a(this.i.getContext().getApplicationContext());
                    try {
                        ((t5a0) p5wVar.a).A(uwd0VarA.getValue().floatValue());
                        jvd0VarC = ej5.c(v5bVar, null, null, new a(uwd0VarA, p5wVar, null), 3);
                    } catch (Throwable th2) {
                        th = th2;
                        c9pVar = null;
                        if (c9pVar != null) {
                            c9pVar.cancel((CancellationException) null);
                        }
                        ibsVar.getLifecycle().d(k9j0Var);
                        throw th;
                    }
                } else {
                    jvd0VarC = null;
                }
                try {
                    wj40 wj40Var = this.d;
                    this.b = jvd0VarC;
                    this.a = 1;
                    Object objD = ej5.d(wj40Var.a, new zj40(wj40Var, new bk40(wj40Var, null), t4w.a(getContext()), null), this);
                    if (objD != obj2) {
                        objD = Unit.a;
                    }
                    if (objD != obj2) {
                        objD = Unit.a;
                    }
                    if (objD == obj2) {
                        return obj2;
                    }
                    c9pVar = jvd0VarC;
                    if (c9pVar != null) {
                        c9pVar.cancel((CancellationException) null);
                    }
                    ibsVar.getLifecycle().d(k9j0Var);
                    return Unit.a;
                } catch (Throwable th3) {
                    jvd0 jvd0Var = jvd0VarC;
                    th = th3;
                    c9pVar = jvd0Var;
                    if (c9pVar != null) {
                        c9pVar.cancel((CancellationException) null);
                    }
                    ibsVar.getLifecycle().d(k9j0Var);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public k9j0(j1b j1bVar, lzz lzzVar, wj40 wj40Var, dq40 dq40Var, View view) {
        this.a = j1bVar;
        this.b = lzzVar;
        this.c = wj40Var;
        this.d = dq40Var;
        this.e = view;
    }

    @Override // defpackage.cbs
    public final void F0(ibs ibsVar, s9s.a aVar) {
        boolean z;
        zb6<Unit> zb6VarZ = null;
        switch (a.a[aVar.ordinal()]) {
            case 1:
                ej5.c(this.a, null, a6b.d, new b(this.d, this.c, ibsVar, this, this.e, null), 1);
                return;
            case 2:
                lzz lzzVar = this.b;
                if (lzzVar != null) {
                    xqr xqrVar = lzzVar.b;
                    synchronized (xqrVar.a) {
                        try {
                            synchronized (xqrVar.a) {
                                z = xqrVar.d;
                            }
                            if (!z) {
                                ArrayList arrayList = xqrVar.b;
                                xqrVar.b = xqrVar.c;
                                xqrVar.c = arrayList;
                                xqrVar.d = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    v1b v1bVar = (v1b) arrayList.get(i);
                                    zi50.a aVar2 = zi50.b;
                                    v1bVar.resumeWith(Unit.a);
                                }
                                arrayList.clear();
                                Unit unit = Unit.a;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                wj40 wj40Var = this.c;
                synchronized (wj40Var.b) {
                    if (wj40Var.s) {
                        wj40Var.s = false;
                        zb6VarZ = wj40Var.z();
                    }
                    break;
                }
                if (zb6VarZ != null) {
                    zi50.a aVar3 = zi50.b;
                    ((bc6) zb6VarZ).resumeWith(Unit.a);
                    return;
                }
                return;
            case 3:
                wj40 wj40Var2 = this.c;
                synchronized (wj40Var2.b) {
                    wj40Var2.s = true;
                    Unit unit2 = Unit.a;
                }
                return;
            case 4:
                this.c.x();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                uhc.a();
                return;
        }
    }
}
