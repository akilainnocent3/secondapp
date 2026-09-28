package defpackage;

import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public class ysy {
    public final sqc<zn20> a;
    public final zn20.a<Set<String>> b;
    public final tuw c = uuw.a();

    public ysy(sqc<zn20> sqcVar, zn20.a<Set<String>> aVar) {
        this.a = sqcVar;
        this.b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [ysy] */
    /* JADX WARN: Type inference failed for: r7v1, types: [quw] */
    /* JADX WARN: Type inference failed for: r7v3 */
    public final Object a(x1b x1bVar) throws Throwable {
        ssy ssyVar;
        quw quwVar;
        quw quwVar2;
        if (x1bVar instanceof ssy) {
            ssyVar = (ssy) x1bVar;
            int i = ssyVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ssyVar.d = i - Integer.MIN_VALUE;
            } else {
                ssyVar = new ssy(this, x1bVar);
            }
        } else {
            ssyVar = new ssy(this, x1bVar);
        }
        Object obj = ssyVar.b;
        y5b y5bVar = y5b.a;
        int i2 = ssyVar.d;
        try {
            try {
                if (i2 == 0) {
                    uj50.b(obj);
                    quwVar = this.c;
                    ssyVar.a = quwVar;
                    ssyVar.d = 1;
                    if (quwVar.d(ssyVar) != y5bVar) {
                    }
                    return y5bVar;
                }
                if (i2 == 1) {
                    quw quwVar3 = ssyVar.a;
                    uj50.b(obj);
                    quwVar = quwVar3;
                } else {
                    if (i2 != 2) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    quwVar2 = ssyVar.a;
                    try {
                        uj50.b(obj);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception unused) {
                        itf0.a.d("Failed to clear 1UP attribution", new Object[0]);
                        obj = Unit.a;
                    }
                }
                quwVar2.f(null);
                return obj;
                sqc<zn20> sqcVar = this.a;
                tsy tsyVar = new tsy(this, null);
                ssyVar.a = quwVar;
                ssyVar.d = 2;
                Object objA = do20.a(sqcVar, tsyVar, ssyVar);
                if (objA != y5bVar) {
                    quw quwVar4 = quwVar;
                    obj = objA;
                    quwVar2 = quwVar4;
                    quwVar2.f(null);
                    return obj;
                }
                return y5bVar;
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception unused2) {
                quwVar2 = quwVar;
                itf0.a.d("Failed to clear 1UP attribution", new Object[0]);
                obj = Unit.a;
            } catch (Throwable th) {
                quw quwVar5 = quwVar;
                th = th;
                this = quwVar5;
                this.f(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v1, types: [quw] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public final Object b(Set set, x1b x1bVar) throws Throwable {
        usy usyVar;
        quw quwVar;
        ?? r9;
        quw quwVar2;
        yp40 yp40Var;
        if (x1bVar instanceof usy) {
            usyVar = (usy) x1bVar;
            int i = usyVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                usyVar.f = i - Integer.MIN_VALUE;
            } else {
                usyVar = new usy(this, x1bVar);
            }
        } else {
            usyVar = new usy(this, x1bVar);
        }
        Object obj = usyVar.d;
        y5b y5bVar = y5b.a;
        int i2 = usyVar.f;
        boolean z = false;
        try {
            try {
                if (i2 == 0) {
                    uj50.b(obj);
                    usyVar.a = (Set) set;
                    quwVar = this.c;
                    usyVar.b = quwVar;
                    usyVar.f = 1;
                    if (quwVar.d(usyVar) != y5bVar) {
                    }
                    r9 = set;
                    return y5bVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yp40Var = usyVar.c;
                    quwVar2 = usyVar.b;
                    Set set2 = usyVar.a;
                    try {
                        uj50.b(obj);
                        z = yp40Var.a;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception unused) {
                        itf0.a.d("Failed to consume 1UP attribution", new Object[0]);
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    quwVar2.f(null);
                    return boolValueOf;
                }
                quw quwVar3 = usyVar.b;
                Set set3 = usyVar.a;
                uj50.b(obj);
                quwVar = quwVar3;
                r9 = set3;
                r9 = set;
                if (r9.isEmpty()) {
                    quwVar2 = quwVar;
                } else {
                    try {
                        yp40 yp40Var2 = new yp40();
                        sqc<zn20> sqcVar = this.a;
                        vsy vsyVar = new vsy(this, yp40Var2, r9, null);
                        usyVar.a = null;
                        usyVar.b = quwVar;
                        usyVar.c = yp40Var2;
                        usyVar.f = 2;
                        if (do20.a(sqcVar, vsyVar, usyVar) != y5bVar) {
                            quwVar2 = quwVar;
                            yp40Var = yp40Var2;
                            z = yp40Var.a;
                        }
                        r9 = set;
                        return y5bVar;
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                        quwVar2 = quwVar;
                        itf0.a.d("Failed to consume 1UP attribution", new Object[0]);
                    }
                }
                Boolean boolValueOf2 = Boolean.valueOf(z);
                quwVar2.f(null);
                return boolValueOf2;
            } catch (Throwable th) {
                th = th;
                set = quwVar;
                set.f(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [ysy] */
    /* JADX WARN: Type inference failed for: r7v1, types: [quw] */
    /* JADX WARN: Type inference failed for: r7v3 */
    public final Object c(String str, boolean z, x1b x1bVar) throws Throwable {
        wsy wsyVar;
        String str2;
        quw quwVar;
        quw quwVar2;
        if (x1bVar instanceof wsy) {
            wsyVar = (wsy) x1bVar;
            int i = wsyVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                wsyVar.f = i - Integer.MIN_VALUE;
            } else {
                wsyVar = new wsy(this, x1bVar);
            }
        } else {
            wsyVar = new wsy(this, x1bVar);
        }
        Object objA = wsyVar.d;
        y5b y5bVar = y5b.a;
        int i2 = wsyVar.f;
        try {
            try {
                if (i2 == 0) {
                    uj50.b(objA);
                    wsyVar.a = str;
                    tuw tuwVar = this.c;
                    wsyVar.b = tuwVar;
                    wsyVar.c = z;
                    wsyVar.f = 1;
                    if (tuwVar.d(wsyVar) != y5bVar) {
                        str2 = str;
                        quwVar = tuwVar;
                    }
                    return y5bVar;
                }
                if (i2 == 1) {
                    z = wsyVar.c;
                    quwVar = wsyVar.b;
                    str2 = wsyVar.a;
                    uj50.b(objA);
                } else {
                    if (i2 != 2) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    quwVar2 = wsyVar.b;
                    try {
                        uj50.b(objA);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception unused) {
                        itf0.a.d("Failed to update 1UP attribution", new Object[0]);
                        objA = Unit.a;
                    }
                }
                quwVar2.f(null);
                return objA;
                sqc<zn20> sqcVar = this.a;
                xsy xsyVar = new xsy(this, z, str2, null);
                wsyVar.a = null;
                wsyVar.b = quwVar;
                wsyVar.c = z;
                wsyVar.f = 2;
                objA = do20.a(sqcVar, xsyVar, wsyVar);
                if (objA != y5bVar) {
                    quwVar2 = quwVar;
                    quwVar2.f(null);
                    return objA;
                }
                return y5bVar;
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception unused2) {
                quwVar2 = quwVar;
                itf0.a.d("Failed to update 1UP attribution", new Object[0]);
                objA = Unit.a;
            } catch (Throwable th) {
                quw quwVar3 = quwVar;
                th = th;
                this = quwVar3;
                this.f(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
