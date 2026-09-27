package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class i<C, T, A> implements Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f9504g = "CallbackRegistry";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<C> f9505b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f9506c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f9507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a<C, T, A> f9509f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class a<C, T, A> {
        public abstract void a(C callback, T sender, int arg, A arg2);
    }

    public i(a<C, T, A> notifier) {
        this.f9509f = notifier;
    }

    public synchronized void a(C callback) {
        try {
            if (callback == null) {
                throw new IllegalArgumentException("callback cannot be null");
            }
            int iLastIndexOf = this.f9505b.lastIndexOf(callback);
            if (iLastIndexOf < 0 || i(iLastIndexOf)) {
                this.f9505b.add(callback);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b() {
        try {
            if (this.f9508e == 0) {
                this.f9505b.clear();
            } else if (!this.f9505b.isEmpty()) {
                for (int size = this.f9505b.size() - 1; size >= 0; size--) {
                    q(size);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public synchronized i<C, T, A> clone() {
        i<C, T, A> iVar;
        CloneNotSupportedException e10;
        try {
            iVar = (i) super.clone();
            try {
                iVar.f9506c = 0L;
                iVar.f9507d = null;
                iVar.f9508e = 0;
                iVar.f9505b = new ArrayList();
                int size = this.f9505b.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (!i(i10)) {
                        iVar.f9505b.add(this.f9505b.get(i10));
                    }
                }
            } catch (CloneNotSupportedException e11) {
                e10 = e11;
                e10.printStackTrace();
            }
        } catch (CloneNotSupportedException e12) {
            iVar = null;
            e10 = e12;
        }
        return iVar;
    }

    public synchronized ArrayList<C> e() {
        ArrayList<C> arrayList;
        arrayList = new ArrayList<>(this.f9505b.size());
        int size = this.f9505b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!i(i10)) {
                arrayList.add(this.f9505b.get(i10));
            }
        }
        return arrayList;
    }

    public synchronized void f(List<C> callbacks) {
        callbacks.clear();
        int size = this.f9505b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!i(i10)) {
                callbacks.add(this.f9505b.get(i10));
            }
        }
    }

    public synchronized boolean g() {
        if (this.f9505b.isEmpty()) {
            return true;
        }
        if (this.f9508e == 0) {
            return false;
        }
        int size = this.f9505b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!i(i10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean i(int index) {
        int i10;
        if (index < 64) {
            return ((1 << index) & this.f9506c) != 0;
        }
        long[] jArr = this.f9507d;
        if (jArr != null && (i10 = (index / 64) - 1) < jArr.length) {
            return ((1 << (index % 64)) & jArr[i10]) != 0;
        }
        return false;
    }

    public synchronized void j(T sender, int arg, A arg2) {
        try {
            this.f9508e++;
            m(sender, arg, arg2);
            int i10 = this.f9508e - 1;
            this.f9508e = i10;
            if (i10 == 0) {
                long[] jArr = this.f9507d;
                if (jArr != null) {
                    for (int length = jArr.length - 1; length >= 0; length--) {
                        long j10 = this.f9507d[length];
                        if (j10 != 0) {
                            p((length + 1) * 64, j10);
                            this.f9507d[length] = 0;
                        }
                    }
                }
                long j11 = this.f9506c;
                if (j11 != 0) {
                    p(0, j11);
                    this.f9506c = 0L;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void k(T t10, int i10, A a10, int i11, int i12, long j10) {
        long j11 = 1;
        while (i11 < i12) {
            if ((j10 & j11) == 0) {
                this.f9509f.a(this.f9505b.get(i11), t10, i10, a10);
            }
            j11 <<= 1;
            i11++;
        }
    }

    public final void l(T sender, int arg, A arg2) {
        k(sender, arg, arg2, 0, Math.min(64, this.f9505b.size()), this.f9506c);
    }

    public final void m(T sender, int arg, A arg2) {
        int size = this.f9505b.size();
        long[] jArr = this.f9507d;
        int length = jArr == null ? -1 : jArr.length - 1;
        n(sender, arg, arg2, length);
        k(sender, arg, arg2, (length + 2) * 64, size, 0L);
    }

    public final void n(T sender, int arg, A arg2, int remainderIndex) {
        if (remainderIndex < 0) {
            l(sender, arg, arg2);
            return;
        }
        long j10 = this.f9507d[remainderIndex];
        int i10 = (remainderIndex + 1) * 64;
        int iMin = Math.min(this.f9505b.size(), i10 + 64);
        n(sender, arg, arg2, remainderIndex - 1);
        k(sender, arg, arg2, i10, iMin, j10);
    }

    public synchronized void o(C callback) {
        try {
            if (this.f9508e == 0) {
                this.f9505b.remove(callback);
            } else {
                int iLastIndexOf = this.f9505b.lastIndexOf(callback);
                if (iLastIndexOf >= 0) {
                    q(iLastIndexOf);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void p(int startIndex, long removed) {
        long j10 = Long.MIN_VALUE;
        for (int i10 = startIndex + 63; i10 >= startIndex; i10--) {
            if ((removed & j10) != 0) {
                this.f9505b.remove(i10);
            }
            j10 >>>= 1;
        }
    }

    public final void q(int index) {
        if (index < 64) {
            this.f9506c = (1 << index) | this.f9506c;
            return;
        }
        int i10 = (index / 64) - 1;
        long[] jArr = this.f9507d;
        if (jArr == null) {
            this.f9507d = new long[this.f9505b.size() / 64];
        } else if (jArr.length <= i10) {
            long[] jArr2 = new long[this.f9505b.size() / 64];
            long[] jArr3 = this.f9507d;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f9507d = jArr2;
        }
        long j10 = 1 << (index % 64);
        long[] jArr4 = this.f9507d;
        jArr4[i10] = j10 | jArr4[i10];
    }
}
