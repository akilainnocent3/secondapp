package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class u2i<T> extends e3<T, T> {
    public final taj.e c;
    public final pya<? super Throwable> d;
    public final taj.d e;
    public final taj.d f;

    public static final class a<T> extends i92<T, T> {
        public final pya<? super T> e;
        public final pya<? super Throwable> f;
        public final ib i;
        public final ib v;

        public a(foa foaVar, taj.e eVar, pya pyaVar, taj.d dVar, taj.d dVar2) {
            super(foaVar);
            this.e = eVar;
            this.f = pyaVar;
            this.i = dVar;
            this.v = dVar2;
        }

        @Override // defpackage.mb30
        public final int b(int i) {
            return 0;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.foa
        public final boolean d(T t) {
            if (this.d) {
                return false;
            }
            try {
                this.e.accept(t);
                return this.a.d((Object) t);
            } catch (Throwable th) {
                c(th);
                return false;
            }
        }

        @Override // defpackage.i92, defpackage.zde0
        public final void onComplete() {
            if (this.d) {
                return;
            }
            try {
                this.i.run();
                this.d = true;
                this.a.onComplete();
                try {
                    this.v.run();
                } catch (Throwable th) {
                    qtg.a(th);
                    o760.b(th);
                }
            } catch (Throwable th2) {
                c(th2);
            }
        }

        @Override // defpackage.i92, defpackage.zde0
        public final void onError(Throwable th) {
            n3i n3iVar = this.a;
            if (this.d) {
                o760.b(th);
                return;
            }
            this.d = true;
            try {
                this.f.accept(th);
                n3iVar.onError(th);
            } catch (Throwable th2) {
                qtg.a(th2);
                n3iVar.onError(new gma(th, th2));
            }
            try {
                this.v.run();
            } catch (Throwable th3) {
                qtg.a(th3);
                o760.b(th3);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.zde0
        public final void onNext(T t) {
            if (this.d) {
                return;
            }
            try {
                this.e.accept(t);
                this.a.onNext((Object) t);
            } catch (Throwable th) {
                c(th);
            }
        }

        @Override // defpackage.lk90
        public final T poll() throws Exception {
            pya<? super Throwable> pyaVar = this.f;
            ib ibVar = this.v;
            try {
                T tPoll = this.c.poll();
                if (tPoll == null) {
                    return tPoll;
                }
                try {
                    this.e.accept(tPoll);
                    ibVar.run();
                    return tPoll;
                } catch (Throwable th) {
                    try {
                        qtg.a(th);
                        try {
                            pyaVar.accept(th);
                            otg.a aVar = otg.a;
                            if (th instanceof Exception) {
                                throw th;
                            }
                            throw th;
                        } catch (Throwable th2) {
                            throw new gma(th, th2);
                        }
                    } catch (Throwable th3) {
                        ibVar.run();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                qtg.a(th4);
                try {
                    pyaVar.accept(th4);
                    otg.a aVar2 = otg.a;
                    if (th4 instanceof Exception) {
                        throw th4;
                    }
                    throw th4;
                } catch (Throwable th5) {
                    throw new gma(th4, th5);
                }
            }
        }
    }

    public static final class b<T> extends k92<T, T> {
        public final pya<? super T> e;
        public final pya<? super Throwable> f;
        public final ib i;
        public final ib v;

        public b(zde0 zde0Var, taj.e eVar, pya pyaVar, taj.d dVar, taj.d dVar2) {
            super(zde0Var);
            this.e = eVar;
            this.f = pyaVar;
            this.i = dVar;
            this.v = dVar2;
        }

        @Override // defpackage.mb30
        public final int b(int i) {
            return 0;
        }

        @Override // defpackage.k92, defpackage.zde0
        public final void onComplete() {
            if (this.d) {
                return;
            }
            try {
                this.i.run();
                this.d = true;
                this.a.onComplete();
                try {
                    this.v.run();
                } catch (Throwable th) {
                    qtg.a(th);
                    o760.b(th);
                }
            } catch (Throwable th2) {
                qtg.a(th2);
                this.b.cancel();
                onError(th2);
            }
        }

        @Override // defpackage.k92, defpackage.zde0
        public final void onError(Throwable th) {
            zde0<? super R> zde0Var = this.a;
            if (this.d) {
                o760.b(th);
                return;
            }
            this.d = true;
            try {
                this.f.accept(th);
                zde0Var.onError(th);
            } catch (Throwable th2) {
                qtg.a(th2);
                zde0Var.onError(new gma(th, th2));
            }
            try {
                this.v.run();
            } catch (Throwable th3) {
                qtg.a(th3);
                o760.b(th3);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.zde0
        public final void onNext(T t) {
            if (this.d) {
                return;
            }
            try {
                this.e.accept(t);
                this.a.onNext((Object) t);
            } catch (Throwable th) {
                qtg.a(th);
                this.b.cancel();
                onError(th);
            }
        }

        @Override // defpackage.lk90
        public final T poll() throws Exception {
            pya<? super Throwable> pyaVar = this.f;
            ib ibVar = this.v;
            try {
                T tPoll = this.c.poll();
                if (tPoll == null) {
                    return tPoll;
                }
                try {
                    this.e.accept(tPoll);
                    ibVar.run();
                    return tPoll;
                } catch (Throwable th) {
                    try {
                        qtg.a(th);
                        try {
                            pyaVar.accept(th);
                            otg.a aVar = otg.a;
                            if (th instanceof Exception) {
                                throw th;
                            }
                            throw th;
                        } catch (Throwable th2) {
                            throw new gma(th, th2);
                        }
                    } catch (Throwable th3) {
                        ibVar.run();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                qtg.a(th4);
                try {
                    pyaVar.accept(th4);
                    otg.a aVar2 = otg.a;
                    if (th4 instanceof Exception) {
                        throw th4;
                    }
                    throw th4;
                } catch (Throwable th5) {
                    throw new gma(th4, th5);
                }
            }
        }
    }

    public u2i(r2i r2iVar, pya pyaVar) {
        super(r2iVar);
        this.c = taj.d;
        this.d = pyaVar;
        taj.d dVar = taj.c;
        this.e = dVar;
        this.f = dVar;
    }

    @Override // defpackage.r2i
    public final void i(zde0<? super T> zde0Var) {
        boolean z = zde0Var instanceof foa;
        r2i<T> r2iVar = this.b;
        taj.e eVar = this.c;
        if (z) {
            r2iVar.h(new a((foa) zde0Var, eVar, this.d, this.e, this.f));
        } else {
            r2iVar.h(new b(zde0Var, eVar, this.d, this.e, this.f));
        }
    }
}
