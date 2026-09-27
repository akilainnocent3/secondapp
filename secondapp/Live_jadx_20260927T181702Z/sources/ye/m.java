package ye;

import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import ye.h;
import ye.i;
import ye.j;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class m<I extends i, O extends j, E extends h> implements f<I, O, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Thread f159233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f159234b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque<I> f159235c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque<O> f159236d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I[] f159237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final O[] f159238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f159239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f159240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public I f159241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public E f159242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f159243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f159244l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f159245m;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m.this.p();
        }
    }

    public m(I[] iArr, O[] oArr) {
        this.f159237e = iArr;
        this.f159239g = iArr.length;
        for (int i10 = 0; i10 < this.f159239g; i10++) {
            ((I[]) this.f159237e)[i10] = c();
        }
        this.f159238f = oArr;
        this.f159240h = oArr.length;
        for (int i11 = 0; i11 < this.f159240h; i11++) {
            ((O[]) this.f159238f)[i11] = d();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f159233a = aVar;
        aVar.start();
    }

    public final boolean b() {
        return !this.f159235c.isEmpty() && this.f159240h > 0;
    }

    public abstract I c();

    public abstract O d();

    public abstract E e(Throwable th2);

    @Nullable
    public abstract E f(I i10, O o10, boolean z10);

    @Override // ye.f
    public final void flush() {
        synchronized (this.f159234b) {
            try {
                this.f159243k = true;
                this.f159245m = 0;
                I i10 = this.f159241i;
                if (i10 != null) {
                    m(i10);
                    this.f159241i = null;
                }
                while (!this.f159235c.isEmpty()) {
                    m(this.f159235c.removeFirst());
                }
                while (!this.f159236d.isEmpty()) {
                    this.f159236d.removeFirst().l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean g() throws InterruptedException {
        E e10;
        synchronized (this.f159234b) {
            while (!this.f159244l && !b()) {
                try {
                    this.f159234b.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f159244l) {
                return false;
            }
            I iRemoveFirst = this.f159235c.removeFirst();
            O[] oArr = this.f159238f;
            int i10 = this.f159240h - 1;
            this.f159240h = i10;
            O o10 = oArr[i10];
            boolean z10 = this.f159243k;
            this.f159243k = false;
            if (iRemoveFirst.g()) {
                o10.a(4);
            } else {
                if (iRemoveFirst.f()) {
                    o10.a(Integer.MIN_VALUE);
                }
                if (iRemoveFirst.h()) {
                    o10.a(134217728);
                }
                try {
                    e10 = (E) f(iRemoveFirst, o10, z10);
                } catch (OutOfMemoryError e11) {
                    e10 = (E) e(e11);
                } catch (RuntimeException e12) {
                    e10 = (E) e(e12);
                }
                if (e10 != null) {
                    synchronized (this.f159234b) {
                        this.f159242j = e10;
                    }
                    return false;
                }
            }
            synchronized (this.f159234b) {
                try {
                    if (this.f159243k) {
                        o10.l();
                    } else if (o10.f()) {
                        this.f159245m++;
                        o10.l();
                    } else {
                        o10.f159207d = this.f159245m;
                        this.f159245m = 0;
                        this.f159236d.addLast(o10);
                    }
                    m(iRemoveFirst);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return true;
        }
    }

    @Override // ye.f
    @Nullable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final I dequeueInputBuffer() throws h {
        I i10;
        synchronized (this.f159234b) {
            k();
            eh.a.i(this.f159241i == null);
            int i11 = this.f159239g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f159237e;
                int i12 = i11 - 1;
                this.f159239g = i12;
                i10 = iArr[i12];
            }
            this.f159241i = i10;
        }
        return i10;
    }

    @Override // ye.f
    @Nullable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final O dequeueOutputBuffer() throws h {
        synchronized (this.f159234b) {
            try {
                k();
                if (this.f159236d.isEmpty()) {
                    return null;
                }
                return this.f159236d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j() {
        if (b()) {
            this.f159234b.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends ye.h */
    public final void k() throws E, h {
        E e10 = this.f159242j;
        if (e10 != null) {
            throw e10;
        }
    }

    @Override // ye.f
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void queueInputBuffer(I i10) throws h {
        synchronized (this.f159234b) {
            k();
            eh.a.a(i10 == this.f159241i);
            this.f159235c.addLast(i10);
            j();
            this.f159241i = null;
        }
    }

    public final void m(I i10) {
        i10.b();
        I[] iArr = this.f159237e;
        int i11 = this.f159239g;
        this.f159239g = i11 + 1;
        iArr[i11] = i10;
    }

    @k.i
    public void n(O o10) {
        synchronized (this.f159234b) {
            o(o10);
            j();
        }
    }

    public final void o(O o10) {
        o10.b();
        O[] oArr = this.f159238f;
        int i10 = this.f159240h;
        this.f159240h = i10 + 1;
        oArr[i10] = o10;
    }

    public final void p() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (g());
    }

    public final void q(int i10) {
        eh.a.i(this.f159239g == this.f159237e.length);
        for (I i11 : this.f159237e) {
            i11.m(i10);
        }
    }

    @Override // ye.f
    @k.i
    public void release() {
        synchronized (this.f159234b) {
            this.f159244l = true;
            this.f159234b.notify();
        }
        try {
            this.f159233a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
