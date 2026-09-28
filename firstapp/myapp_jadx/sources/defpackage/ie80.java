package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class ie80<T> implements kfy<T>, pse {
    public final kfy<? super T> a;
    public pse b;
    public boolean c;
    public ou0<Object> d;
    public volatile boolean e;

    public ie80(kfy<? super T> kfyVar) {
        this.a = kfyVar;
    }

    @Override // defpackage.pse
    public final void dispose() {
        this.b.dispose();
    }

    @Override // defpackage.pse
    public final boolean isDisposed() {
        return this.b.isDisposed();
    }

    @Override // defpackage.kfy
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

    @Override // defpackage.kfy
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

    @Override // defpackage.kfy
    public final void onNext(T t) {
        Object obj;
        if (this.e) {
            return;
        }
        if (t == null) {
            this.b.dispose();
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
                            kfy<? super T> kfyVar = this.a;
                            for (Object[] objArr = ou0Var2.a; objArr != null; objArr = (Object[]) objArr[4]) {
                                for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                                    if (obj == s2y.a) {
                                        kfyVar.onComplete();
                                        return;
                                    } else {
                                        if (obj instanceof s2y.b) {
                                            kfyVar.onError(((s2y.b) obj).a);
                                            return;
                                        }
                                        if (obj instanceof s2y.a) {
                                            kfyVar.onSubscribe(null);
                                        } else {
                                            kfyVar.onNext(obj);
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

    @Override // defpackage.kfy
    public final void onSubscribe(pse pseVar) {
        if (xse.e(this.b, pseVar)) {
            this.b = pseVar;
            this.a.onSubscribe(this);
        }
    }
}
