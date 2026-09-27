package ac;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Queue;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class n<A, B> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f4741b = 250;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc.j<b<A>, B> f4742a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends pc.j<b<A>, B> {
        public a(long j10) {
            super(j10);
        }

        @Override // pc.j
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void m(@NonNull b<A> bVar, @Nullable B b10) {
            bVar.c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @h1
    public static final class b<A> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Queue<b<?>> f4744d = pc.o.g(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public A f4747c;

        public static <A> b<A> a(A a10, int i10, int i11) {
            b<A> bVar;
            Queue<b<?>> queue = f4744d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a10, i10, i11);
            return bVar;
        }

        public final void b(A a10, int i10, int i11) {
            this.f4747c = a10;
            this.f4746b = i10;
            this.f4745a = i11;
        }

        public void c() {
            Queue<b<?>> queue = f4744d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f4746b == bVar.f4746b && this.f4745a == bVar.f4745a && this.f4747c.equals(bVar.f4747c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f4745a * 31) + this.f4746b) * 31) + this.f4747c.hashCode();
        }
    }

    public n() {
        this(250L);
    }

    public void a() {
        this.f4742a.b();
    }

    @Nullable
    public B b(A a10, int i10, int i11) {
        b<A> bVarA = b.a(a10, i10, i11);
        B bJ = this.f4742a.j(bVarA);
        bVarA.c();
        return bJ;
    }

    public void c(A a10, int i10, int i11, B b10) {
        this.f4742a.n(b.a(a10, i10, i11), b10);
    }

    public n(long j10) {
        this.f4742a = new a(j10);
    }
}
