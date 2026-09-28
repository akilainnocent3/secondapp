package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class je80<T> implements n3i<T>, bee0 {
    public final zde0<? super T> a;
    public bee0 b;
    public boolean c;
    public ou0<Object> d;
    public volatile boolean e;

    public je80(zde0<? super T> zde0Var) {
        this.a = zde0Var;
    }

    @Override // defpackage.zde0
    public final void a(bee0 bee0Var) {
        if (gee0.f(this.b, bee0Var)) {
            this.b = bee0Var;
            this.a.a(this);
        }
    }

    @Override // defpackage.bee0
    public final void cancel() {
        this.b.cancel();
    }

    @Override // defpackage.zde0
    public final void onComplete() {
        if (this.e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                if (!this.c) {
                    this.e = true;
                    this.c = true;
                    this.a.onComplete();
                } else {
                    ou0<Object> ou0Var = this.d;
                    if (ou0Var == null) {
                        ou0Var = new ou0<>();
                        this.d = ou0Var;
                    }
                    ou0Var.a(s2y.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zde0
    public final void onError(Throwable th) {
        if (this.e) {
            o760.b(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.e) {
                    if (this.c) {
                        this.e = true;
                        ou0<Object> ou0Var = this.d;
                        if (ou0Var == null) {
                            ou0Var = new ou0<>();
                            this.d = ou0Var;
                        }
                        ou0Var.a[0] = new s2y.b(th);
                        return;
                    }
                    this.e = true;
                    this.c = true;
                    z = false;
                }
                if (z) {
                    o760.b(th);
                } else {
                    this.a.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.zde0
    public final void onNext(T t) {
        Object obj;
        if (this.e) {
            return;
        }
        if (t == null) {
            this.b.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                if (this.c) {
                    ou0<Object> ou0Var = this.d;
                    if (ou0Var == null) {
                        ou0Var = new ou0<>();
                        this.d = ou0Var;
                    }
                    ou0Var.a(t);
                    return;
                }
                this.c = true;
                this.a.onNext(t);
                while (true) {
                    synchronized (this) {
                        try {
                            ou0<Object> ou0Var2 = this.d;
                            if (ou0Var2 == null) {
                                this.c = false;
                                return;
                            }
                            this.d = null;
                            zde0<? super T> zde0Var = this.a;
                            for (Object[] objArr = ou0Var2.a; objArr != null; objArr = (Object[]) objArr[4]) {
                                for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                                    if (obj == s2y.a) {
                                        zde0Var.onComplete();
                                        return;
                                    } else {
                                        if (obj instanceof s2y.b) {
                                            zde0Var.onError(((s2y.b) obj).a);
                                            return;
                                        }
                                        if (obj instanceof s2y.c) {
                                            zde0Var.a(null);
                                        } else {
                                            zde0Var.onNext(obj);
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.bee0
    public final void request(long j) {
        this.b.request(j);
    }
}
