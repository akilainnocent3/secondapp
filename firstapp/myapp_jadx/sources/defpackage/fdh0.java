package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class fdh0<T1, T2> {
    public final dnz.b.a a;
    public final dm8 b = em8.a();
    public final tuw c = uuw.a();
    public final cm8<Unit>[] d;
    public final Object[] e;

    public fdh0(dnz.b.a aVar) {
        this.a = aVar;
        cm8<Unit>[] cm8VarArr = new cm8[2];
        for (int i = 0; i < 2; i++) {
            cm8VarArr[i] = em8.a();
        }
        this.d = cm8VarArr;
        Object[] objArr = new Object[2];
        for (int i2 = 0; i2 < 2; i2++) {
            objArr[i2] = xyh.a;
        }
        this.e = objArr;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0099 A[Catch: all -> 0x00a2, TRY_ENTER, TryCatch #0 {all -> 0x00a2, blocks: (B:32:0x0090, B:36:0x0099, B:43:0x00a8, B:45:0x00ae, B:48:0x00b4, B:50:0x00b9, B:54:0x00c3, B:52:0x00be, B:53:0x00c1, B:39:0x009f), top: B:64:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x009f A[Catch: all -> 0x00a2, LOOP:0: B:34:0x0095->B:39:0x009f, LOOP_END, TryCatch #0 {all -> 0x00a2, blocks: (B:32:0x0090, B:36:0x0099, B:43:0x00a8, B:45:0x00ae, B:48:0x00b4, B:50:0x00b9, B:54:0x00c3, B:52:0x00be, B:53:0x00c1, B:39:0x009f), top: B:64:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:32:0x0090, B:36:0x0099, B:43:0x00a8, B:45:0x00ae, B:48:0x00b4, B:50:0x00b9, B:54:0x00c3, B:52:0x00be, B:53:0x00c1, B:39:0x009f), top: B:64:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4 A[Catch: all -> 0x00a2, LOOP:1: B:44:0x00ac->B:48:0x00b4, LOOP_END, TryCatch #0 {all -> 0x00a2, blocks: (B:32:0x0090, B:36:0x0099, B:43:0x00a8, B:45:0x00ae, B:48:0x00b4, B:50:0x00b9, B:54:0x00c3, B:52:0x00be, B:53:0x00c1, B:39:0x009f), top: B:64:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:32:0x0090, B:36:0x0099, B:43:0x00a8, B:45:0x00ae, B:48:0x00b4, B:50:0x00b9, B:54:0x00c3, B:52:0x00be, B:53:0x00c1, B:39:0x009f), top: B:64:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00be A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:32:0x0090, B:36:0x0099, B:43:0x00a8, B:45:0x00ae, B:48:0x00b4, B:50:0x00b9, B:54:0x00c3, B:52:0x00be, B:53:0x00c1, B:39:0x009f), top: B:64:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c1 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:32:0x0090, B:36:0x0099, B:43:0x00a8, B:45:0x00ae, B:48:0x00b4, B:50:0x00b9, B:54:0x00c3, B:52:0x00be, B:53:0x00c1, B:39:0x009f), top: B:64:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(int i, Object obj, x1b x1bVar) throws Throwable {
        edh0 edh0Var;
        fdh0<T1, T2> fdh0Var;
        int i2;
        tuw tuwVar;
        Throwable th;
        quw quwVar;
        Object[] objArr;
        int length;
        int i3;
        Object obj2;
        boolean z;
        int length2;
        int i4;
        v78 v78Var;
        dnz.b.a aVar;
        Object obj3;
        Object obj4;
        fdh0<T1, T2> fdh0Var2;
        if (x1bVar instanceof edh0) {
            edh0Var = (edh0) x1bVar;
            int i5 = edh0Var.i;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                edh0Var.i = i5 - Integer.MIN_VALUE;
            } else {
                edh0Var = new edh0(this, x1bVar);
            }
        } else {
            edh0Var = new edh0(this, x1bVar);
        }
        Object obj5 = edh0Var.e;
        y5b y5bVar = y5b.a;
        int i6 = edh0Var.i;
        if (i6 == 0) {
            uj50.b(obj5);
            cm8<Unit>[] cm8VarArr = this.d;
            if (cm8VarArr[i].isCompleted()) {
                edh0Var.a = this;
                edh0Var.b = obj;
                edh0Var.d = i;
                edh0Var.i = 1;
                if (this.b.q(edh0Var) != y5bVar) {
                }
                return y5bVar;
            }
            cm8VarArr[i].G(Unit.a);
        } else {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    quwVar = (quw) edh0Var.b;
                    fdh0Var2 = edh0Var.a;
                    try {
                        uj50.b(obj5);
                        fdh0Var2.b.R(Unit.a);
                        Unit unit = Unit.a;
                        quwVar.f(null);
                        return Unit.a;
                    } catch (Throwable th2) {
                        th = th2;
                        quwVar.f(null);
                        throw th;
                    }
                }
                i2 = edh0Var.d;
                tuwVar = edh0Var.c;
                obj = edh0Var.b;
                fdh0Var = edh0Var.a;
                uj50.b(obj5);
                try {
                    objArr = fdh0Var.e;
                    length = objArr.length;
                    i3 = 0;
                    while (true) {
                        obj2 = xyh.a;
                        if (i3 < length) {
                            z = false;
                            break;
                        }
                        if (objArr[i3] == obj2) {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    objArr[i2] = obj;
                    length2 = objArr.length;
                    i4 = 0;
                    while (true) {
                        if (i4 < length2) {
                            if (z) {
                                v78Var = v78.a;
                            } else if (i2 == 0) {
                                v78Var = v78.b;
                            } else {
                                v78Var = v78.c;
                            }
                            aVar = fdh0Var.a;
                            obj3 = objArr[0];
                            obj4 = objArr[1];
                            edh0Var.a = fdh0Var;
                            edh0Var.b = tuwVar;
                            edh0Var.c = null;
                            edh0Var.i = 3;
                            if (aVar.d(obj3, obj4, v78Var, edh0Var) != y5bVar) {
                                quwVar = tuwVar;
                                fdh0Var2 = fdh0Var;
                                fdh0Var2.b.R(Unit.a);
                                break;
                            }
                            return y5bVar;
                        }
                        if (objArr[i4] == obj2) {
                            quwVar = tuwVar;
                            break;
                        }
                        i4++;
                    }
                    Unit unit2 = Unit.a;
                    quwVar.f(null);
                    return Unit.a;
                } catch (Throwable th3) {
                    tuw tuwVar2 = tuwVar;
                    th = th3;
                    quwVar = tuwVar2;
                    quwVar.f(null);
                    throw th;
                }
            }
            i = edh0Var.d;
            obj = edh0Var.b;
            this = edh0Var.a;
            uj50.b(obj5);
        }
        tuw tuwVar3 = this.c;
        edh0Var.a = this;
        edh0Var.b = obj;
        edh0Var.c = tuwVar3;
        edh0Var.d = i;
        edh0Var.i = 2;
        if (tuwVar3.d(edh0Var) != y5bVar) {
            fdh0Var = this;
            i2 = i;
            tuwVar = tuwVar3;
            objArr = fdh0Var.e;
            length = objArr.length;
            i3 = 0;
            while (true) {
                obj2 = xyh.a;
                if (i3 < length) {
                    z = false;
                    break;
                }
                if (objArr[i3] == obj2) {
                    z = true;
                    break;
                }
                i3++;
            }
            objArr[i2] = obj;
            length2 = objArr.length;
            i4 = 0;
            while (true) {
                if (i4 < length2) {
                    if (z) {
                        v78Var = v78.a;
                    } else if (i2 == 0) {
                        v78Var = v78.b;
                    } else {
                        v78Var = v78.c;
                    }
                    aVar = fdh0Var.a;
                    obj3 = objArr[0];
                    obj4 = objArr[1];
                    edh0Var.a = fdh0Var;
                    edh0Var.b = tuwVar;
                    edh0Var.c = null;
                    edh0Var.i = 3;
                    if (aVar.d(obj3, obj4, v78Var, edh0Var) != y5bVar) {
                        quwVar = tuwVar;
                        fdh0Var2 = fdh0Var;
                        fdh0Var2.b.R(Unit.a);
                        break;
                    }
                } else {
                    if (objArr[i4] == obj2) {
                        quwVar = tuwVar;
                        break;
                    }
                    i4++;
                }
            }
            Unit unit3 = Unit.a;
            quwVar.f(null);
            return Unit.a;
        }
        return y5bVar;
    }
}
