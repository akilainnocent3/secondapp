package defpackage;

import android.os.Build;
import android.os.Trace;
import androidx.compose.runtime.a;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class ub2 {
    public static final qyd0 a = new qyd0(new rb2(0));
    public static Boolean b;

    /* JADX WARN: Code duplicated, block: B:10:0x003e A[Catch: RejectedExecutionException -> 0x008d, TryCatch #0 {RejectedExecutionException -> 0x008d, blocks: (B:8:0x0038, B:14:0x0045, B:16:0x005a, B:21:0x0065, B:23:0x0077, B:26:0x0088, B:25:0x007b, B:18:0x0060, B:10:0x003e), top: B:32:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0042  */
    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x007b A[Catch: RejectedExecutionException -> 0x008d, TryCatch #0 {RejectedExecutionException -> 0x008d, blocks: (B:8:0x0038, B:14:0x0045, B:16:0x005a, B:21:0x0065, B:23:0x0077, B:26:0x0088, B:25:0x007b, B:18:0x0060, B:10:0x003e), top: B:32:0x0038 }] */
    public static final void a(final nk0 nk0Var, final imf0 imf0Var, final f8i.a aVar, final List<nk0.d<ji10>> list, a aVar2, int i) {
        boolean z;
        boolean zD;
        Object objY;
        Executor executor = (Executor) aVar2.O(a);
        if (executor == null || !b(nk0Var.b.length())) {
            aVar2.N(-517807721);
            aVar2.H();
            return;
        }
        aVar2.N(-518708178);
        final asr asrVar = (asr) aVar2.O(kna.n);
        final mmd mmdVar = (mmd) aVar2.O(kna.h);
        if (((i & 112) ^ 48) > 32) {
            try {
                if (aVar2.M(imf0Var)) {
                    z = true;
                } else if ((i & 48) == 32) {
                    z = true;
                } else {
                    z = false;
                }
                zD = z | aVar2.d(asrVar.ordinal()) | aVar2.A(list) | ((((i & 14) ^ 6) <= 4 && aVar2.M(nk0Var)) || (i & 6) == 4) | aVar2.M(mmdVar) | aVar2.A(aVar);
                objY = aVar2.y();
                if (zD || objY == a.C0041a.a) {
                    Object obj = new Runnable() { // from class: tb2
                        @Override // java.lang.Runnable
                        public final void run() {
                            imf0 imf0Var2 = imf0Var;
                            asr asrVar2 = asrVar;
                            nk0 nk0Var2 = nk0Var;
                            mmd mmdVar2 = mmdVar;
                            f8i.a aVar3 = aVar;
                            Trace.beginSection("BackgroundTextMeasurement");
                            try {
                                c5a0.e.getClass();
                                wtw wtwVarG = c5a0.a.g(null, null);
                                try {
                                    c5a0 c5a0VarJ = wtwVarG.j();
                                    try {
                                        imf0 imf0VarC = ib30.c(imf0Var2, asrVar2);
                                        List list2 = list;
                                        if (list2 == null) {
                                            list2 = m2g.a;
                                        }
                                        new ckw(nk0Var2, imf0VarC, list2, mmdVar2, aVar3).b();
                                        Unit unit = Unit.a;
                                        c5a0.q(c5a0VarJ);
                                        wtwVarG.w().a();
                                        wtwVarG.c();
                                        Trace.endSection();
                                    } catch (Throwable th) {
                                        c5a0.q(c5a0VarJ);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        wtwVarG.c();
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th4) {
                                Trace.endSection();
                                throw th4;
                            }
                        }
                    };
                    aVar2.r(obj);
                    objY = obj;
                }
                executor.execute((Runnable) objY);
            } catch (RejectedExecutionException unused) {
            }
        } else {
            if ((i & 48) == 32) {
                z = true;
            } else {
                z = false;
            }
            zD = z | aVar2.d(asrVar.ordinal()) | aVar2.A(list) | ((((i & 14) ^ 6) <= 4 && aVar2.M(nk0Var)) || (i & 6) == 4) | aVar2.M(mmdVar) | aVar2.A(aVar);
            objY = aVar2.y();
            if (zD) {
                Object obj2 = new Runnable() { // from class: tb2
                    @Override // java.lang.Runnable
                    public final void run() {
                        imf0 imf0Var2 = imf0Var;
                        asr asrVar2 = asrVar;
                        nk0 nk0Var2 = nk0Var;
                        mmd mmdVar2 = mmdVar;
                        f8i.a aVar3 = aVar;
                        Trace.beginSection("BackgroundTextMeasurement");
                        try {
                            c5a0.e.getClass();
                            wtw wtwVarG = c5a0.a.g(null, null);
                            try {
                                c5a0 c5a0VarJ = wtwVarG.j();
                                try {
                                    imf0 imf0VarC = ib30.c(imf0Var2, asrVar2);
                                    List list2 = list;
                                    if (list2 == null) {
                                        list2 = m2g.a;
                                    }
                                    new ckw(nk0Var2, imf0VarC, list2, mmdVar2, aVar3).b();
                                    Unit unit = Unit.a;
                                    c5a0.q(c5a0VarJ);
                                    wtwVarG.w().a();
                                    wtwVarG.c();
                                    Trace.endSection();
                                } catch (Throwable th) {
                                    c5a0.q(c5a0VarJ);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    wtwVarG.c();
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            Trace.endSection();
                            throw th4;
                        }
                    }
                };
                aVar2.r(obj2);
                objY = obj2;
            } else {
                Object obj3 = new Runnable() { // from class: tb2
                    @Override // java.lang.Runnable
                    public final void run() {
                        imf0 imf0Var2 = imf0Var;
                        asr asrVar2 = asrVar;
                        nk0 nk0Var2 = nk0Var;
                        mmd mmdVar2 = mmdVar;
                        f8i.a aVar3 = aVar;
                        Trace.beginSection("BackgroundTextMeasurement");
                        try {
                            c5a0.e.getClass();
                            wtw wtwVarG = c5a0.a.g(null, null);
                            try {
                                c5a0 c5a0VarJ = wtwVarG.j();
                                try {
                                    imf0 imf0VarC = ib30.c(imf0Var2, asrVar2);
                                    List list2 = list;
                                    if (list2 == null) {
                                        list2 = m2g.a;
                                    }
                                    new ckw(nk0Var2, imf0VarC, list2, mmdVar2, aVar3).b();
                                    Unit unit = Unit.a;
                                    c5a0.q(c5a0VarJ);
                                    wtwVarG.w().a();
                                    wtwVarG.c();
                                    Trace.endSection();
                                } catch (Throwable th) {
                                    c5a0.q(c5a0VarJ);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    wtwVarG.c();
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            Trace.endSection();
                            throw th4;
                        }
                    }
                };
                aVar2.r(obj3);
                objY = obj3;
            }
            executor.execute((Runnable) objY);
        }
        aVar2.H();
    }

    public static final boolean b(int i) {
        if (Build.VERSION.SDK_INT >= 28 && i >= 8 && i < 1000) {
            Boolean boolValueOf = b;
            if (boolValueOf == null) {
                boolValueOf = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                b = boolValueOf;
            }
            if (boolValueOf.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
