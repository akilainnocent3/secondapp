package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class lx20 {
    public final yqm a;
    public final ksy b;
    public final jsy c;
    public final fuy d;
    public final tuw e;

    public static final class a {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "AttributionClaims(experiment=" + this.a + ", tag=" + this.b + ")";
        }
    }

    public static final class b {
        public final boolean a;
        public final CancellationException b;

        public b(boolean z, CancellationException cancellationException) {
            this.a = z;
            this.b = cancellationException;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && Intrinsics.g(this.b, bVar.b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.a) * 31;
            CancellationException cancellationException = this.b;
            return iHashCode + (cancellationException == null ? 0 : cancellationException.hashCode());
        }

        public final String toString() {
            return "Claim(matched=" + this.a + ", cancellation=" + this.b + ")";
        }
    }

    public static final class c {
        public final b a;
        public final b b;

        public c(b bVar, b bVar2) {
            bVar.getClass();
            bVar2.getClass();
            this.a = bVar;
            this.b = bVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "RawAttributionClaims(experiment=" + this.a + ", tag=" + this.b + ")";
        }
    }

    public lx20(yqm yqmVar, ksy ksyVar, jsy jsyVar, fuy fuyVar) {
        yqmVar.getClass();
        ksyVar.getClass();
        jsyVar.getClass();
        fuyVar.getClass();
        this.a = yqmVar;
        this.b = ksyVar;
        this.c = jsyVar;
        this.d = fuyVar;
        this.e = uuw.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ysy ysyVar, Set set, x1b x1bVar) {
        mx20 mx20Var;
        if (x1bVar instanceof mx20) {
            mx20Var = (mx20) x1bVar;
            int i = mx20Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mx20Var.c = i - Integer.MIN_VALUE;
            } else {
                mx20Var = new mx20(this, x1bVar);
            }
        } else {
            mx20Var = new mx20(this, x1bVar);
        }
        Object objB = mx20Var.a;
        Object obj = y5b.a;
        int i2 = mx20Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objB);
                mx20Var.c = 1;
                objB = ysyVar.b(set, mx20Var);
                if (objB == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objB);
            }
            return new b(((Boolean) objB).booleanValue(), null);
        } catch (CancellationException e) {
            return new b(false, e);
        } catch (Exception unused) {
            itf0.a.d("Failed to claim 1UP bet attribution", new Object[0]);
            return new b(false, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Set set, x1b x1bVar) {
        nx20 nx20Var;
        c9p c9pVar;
        if (x1bVar instanceof nx20) {
            nx20Var = (nx20) x1bVar;
            int i = nx20Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nx20Var.d = i - Integer.MIN_VALUE;
            } else {
                nx20Var = new nx20(this, x1bVar);
            }
        } else {
            nx20Var = new nx20(this, x1bVar);
        }
        Object obj = nx20Var.b;
        y5b y5bVar = y5b.a;
        int i2 = nx20Var.d;
        CancellationException cancellationException = null;
        if (i2 == 0) {
            uj50.b(obj);
            c9p c9pVar2 = (c9p) nx20Var.getContext().get(c9p.b.a);
            kxx kxxVar = kxx.a;
            ox20 ox20Var = new ox20(this, set, null);
            nx20Var.a = c9pVar2;
            nx20Var.d = 1;
            Object objD = ej5.d(kxxVar, ox20Var, nx20Var);
            if (objD == y5bVar) {
                return y5bVar;
            }
            obj = objD;
            c9pVar = c9pVar2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c9pVar = nx20Var.a;
            uj50.b(obj);
        }
        c cVar = (c) obj;
        if (c9pVar != null) {
            try {
                if (!c9pVar.isActive()) {
                    throw c9pVar.getCancellationException();
                }
            } catch (CancellationException e) {
                e = e;
            }
        }
        e = null;
        b bVar = cVar.a;
        b bVar2 = cVar.b;
        ArrayList arrayListV = ay0.v(new CancellationException[]{e, bVar.b, bVar2.b});
        CancellationException cancellationException2 = (CancellationException) CollectionsKt.firstOrNull(arrayListV);
        if (cancellationException2 != null) {
            List listO = CollectionsKt.O(arrayListV, 1);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listO) {
                if (((CancellationException) obj2) != cancellationException2) {
                    arrayList.add(obj2);
                }
            }
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj3 = arrayList.get(i3);
                i3++;
                cancellationException2.addSuppressed((Throwable) obj3);
            }
            cancellationException = cancellationException2;
        }
        if (cancellationException == null) {
            return new a(cVar.a.a, bVar2.a);
        }
        throw cancellationException;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ad A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:21:0x004d, B:38:0x00a5, B:40:0x00ad, B:41:0x00b4, B:43:0x00b8, B:47:0x00c4, B:48:0x00da, B:49:0x00df, B:50:0x00e0), top: B:67:0x004d }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b4 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:21:0x004d, B:38:0x00a5, B:40:0x00ad, B:41:0x00b4, B:43:0x00b8, B:47:0x00c4, B:48:0x00da, B:49:0x00df, B:50:0x00e0), top: B:67:0x004d }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:21:0x004d, B:38:0x00a5, B:40:0x00ad, B:41:0x00b4, B:43:0x00b8, B:47:0x00c4, B:48:0x00da, B:49:0x00df, B:50:0x00e0), top: B:67:0x004d }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00da A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:21:0x004d, B:38:0x00a5, B:40:0x00ad, B:41:0x00b4, B:43:0x00b8, B:47:0x00c4, B:48:0x00da, B:49:0x00df, B:50:0x00e0), top: B:67:0x004d }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e0 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:21:0x004d, B:38:0x00a5, B:40:0x00ad, B:41:0x00b4, B:43:0x00b8, B:47:0x00c4, B:48:0x00da, B:49:0x00df, B:50:0x00e0), top: B:67:0x004d }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fe A[Catch: all -> 0x003c, TryCatch #2 {all -> 0x003c, blocks: (B:14:0x0037, B:54:0x00f5, B:56:0x00fa, B:58:0x00fe, B:61:0x0105), top: B:69:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Set set, x1b x1bVar) throws Throwable {
        px20 px20Var;
        quw quwVar;
        quw quwVar2;
        qsy qsyVar;
        quw quwVar3;
        aty atyVar;
        a aVar;
        int iOrdinal;
        Object objD;
        a aVar2;
        if (x1bVar instanceof px20) {
            px20Var = (px20) x1bVar;
            int i = px20Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                px20Var.i = i - Integer.MIN_VALUE;
            } else {
                px20Var = new px20(this, x1bVar);
            }
        } else {
            px20Var = new px20(this, x1bVar);
        }
        Object obj = px20Var.e;
        Object obj2 = y5b.a;
        int i2 = px20Var.i;
        ksy ksyVar = this.b;
        int i3 = 0;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                px20Var.a = set;
                quwVar = this.e;
                px20Var.b = quwVar;
                px20Var.i = 1;
                if (quwVar.d(px20Var) != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar2 = px20Var.d;
                    qsyVar = px20Var.c;
                    quwVar2 = px20Var.b;
                    Set set2 = px20Var.a;
                    try {
                        uj50.b(obj);
                        aVar = aVar2;
                        if (aVar.b && ksyVar.c(qsyVar)) {
                            i3 = 1;
                        }
                        atyVar = new aty(i3);
                        quwVar = quwVar2;
                        quwVar.f(null);
                        return atyVar;
                    } catch (Throwable th) {
                        th = th;
                        quwVar2.f(null);
                        throw th;
                    }
                }
                qsyVar = px20Var.c;
                quwVar3 = px20Var.b;
                Set set3 = px20Var.a;
                try {
                    uj50.b(obj);
                    aVar = (a) obj;
                    if (ksyVar.c(qsyVar)) {
                        if (aVar.a && (iOrdinal = qsyVar.c.ordinal()) != 0) {
                            if (iOrdinal != 1) {
                                px20Var.a = null;
                                px20Var.b = quwVar3;
                                px20Var.c = qsyVar;
                                px20Var.d = aVar;
                                px20Var.i = 3;
                                objD = d(px20Var);
                                if (objD != obj2) {
                                    obj = objD;
                                    aVar2 = aVar;
                                    quwVar2 = quwVar3;
                                    aVar = aVar2;
                                    if (aVar.b) {
                                        i3 = 1;
                                    }
                                    atyVar = new aty(i3);
                                    quwVar = quwVar2;
                                }
                                return obj2;
                            }
                            if (iOrdinal == 2) {
                                throw new uwx();
                            }
                            x66<rsy> x66Var = z76.s;
                            itf0.a.a("Simulated 1UP conversion decision: campaign=%s, event=%s", x66Var.a, CollectionsKt.n0(x66Var.b));
                        }
                        quwVar2 = quwVar3;
                        if (aVar.b) {
                            i3 = 1;
                        }
                        atyVar = new aty(i3);
                        quwVar = quwVar2;
                    } else {
                        atyVar = new aty(0);
                        quwVar = quwVar3;
                    }
                    quwVar.f(null);
                    return atyVar;
                } catch (Throwable th2) {
                    th = th2;
                    quwVar2 = quwVar3;
                    quwVar2.f(null);
                    throw th;
                }
            }
            quw quwVar4 = px20Var.b;
            Set set4 = px20Var.a;
            uj50.b(obj);
            quwVar = quwVar4;
            set = set4;
            if (!set.isEmpty()) {
                qsy qsyVar2 = (qsy) ksyVar.f.a.getValue();
                px20Var.a = null;
                px20Var.b = quwVar;
                px20Var.c = qsyVar2;
                px20Var.i = 2;
                Object objB = b(set, px20Var);
                if (objB != obj2) {
                    quw quwVar5 = quwVar;
                    obj = objB;
                    qsyVar = qsyVar2;
                    quwVar3 = quwVar5;
                    aVar = (a) obj;
                    if (ksyVar.c(qsyVar)) {
                        atyVar = new aty(0);
                        quwVar = quwVar3;
                    } else {
                        if (aVar.a) {
                            if (iOrdinal != 1) {
                                px20Var.a = null;
                                px20Var.b = quwVar3;
                                px20Var.c = qsyVar;
                                px20Var.d = aVar;
                                px20Var.i = 3;
                                objD = d(px20Var);
                                if (objD != obj2) {
                                    obj = objD;
                                    aVar2 = aVar;
                                    quwVar2 = quwVar3;
                                    aVar = aVar2;
                                    if (aVar.b) {
                                        i3 = 1;
                                    }
                                    atyVar = new aty(i3);
                                    quwVar = quwVar2;
                                }
                            } else {
                                if (iOrdinal == 2) {
                                    throw new uwx();
                                }
                                x66<rsy> x66Var2 = z76.s;
                                itf0.a.a("Simulated 1UP conversion decision: campaign=%s, event=%s", x66Var2.a, CollectionsKt.n0(x66Var2.b));
                            }
                        }
                        quwVar2 = quwVar3;
                        if (aVar.b) {
                            i3 = 1;
                        }
                        atyVar = new aty(i3);
                        quwVar = quwVar2;
                    }
                }
                return obj2;
            }
            atyVar = new aty(0);
            quwVar.f(null);
            return atyVar;
        } catch (Throwable th3) {
            th = th3;
            quwVar2 = quwVar;
            quwVar2.f(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(x1b x1bVar) {
        qx20 qx20Var;
        if (x1bVar instanceof qx20) {
            qx20Var = (qx20) x1bVar;
            int i = qx20Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qx20Var.c = i - Integer.MIN_VALUE;
            } else {
                qx20Var = new qx20(this, x1bVar);
            }
        } else {
            qx20Var = new qx20(this, x1bVar);
        }
        Object obj = qx20Var.a;
        y5b y5bVar = y5b.a;
        int i2 = qx20Var.c;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                x66<rsy> x66Var = z76.s;
                yqm yqmVar = this.a;
                String str = x66Var.a;
                String str2 = (String) CollectionsKt.n0(x66Var.b);
                qx20Var.c = 1;
                if (yqmVar.c(str, str2, null, qx20Var) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            itf0.a.d("Failed to report 1UP bet conversion", new Object[0]);
        }
        return Unit.a;
    }
}
