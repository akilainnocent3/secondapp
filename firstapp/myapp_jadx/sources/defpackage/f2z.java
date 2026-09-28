package defpackage;

import androidx.compose.runtime.h;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class f2z extends b3 {
    public r1z[] c;
    public int d;
    public int[] e;
    public int f;
    public Object[] i;
    public int v;

    public final class a {
        public int a;
        public int b;
        public int c;

        public a() {
        }

        public final int a(int i) {
            return f2z.this.e[this.b + i];
        }

        public final <T> T b(int i) {
            return (T) f2z.this.i[this.c + i];
        }
    }

    public static final class b {
        public static final <T> void a(f2z f2zVar, int i, T t) {
            f2zVar.i[(f2zVar.v - f2zVar.c[f2zVar.d - 1].b) + i] = t;
        }

        public static final <T, U> void b(f2z f2zVar, int i, T t, int i2, U u) {
            int i3 = f2zVar.v - f2zVar.c[f2zVar.d - 1].b;
            Object[] objArr = f2zVar.i;
            objArr[i + i3] = t;
            objArr[i3 + i2] = u;
        }

        public static final void c(f2z f2zVar, Object obj, Object obj2, Object obj3) {
            int i = f2zVar.v - f2zVar.c[f2zVar.d - 1].b;
            Object[] objArr = f2zVar.i;
            objArr[i] = obj;
            objArr[i + 1] = obj2;
            objArr[i + 2] = obj3;
        }
    }

    public f2z() {
        super(10);
        this.c = new r1z[16];
        this.e = new int[16];
        this.i = new Object[16];
    }

    public final void X(fv0<?> fv0Var, h hVar, a350 a350Var, u1z u1zVar) {
        if (Y()) {
            a aVar = new a();
            while (true) {
                f2z f2zVar = f2z.this;
                r1z r1zVar = f2zVar.c[aVar.a];
                final l00 l00VarB = r1zVar.b(aVar);
                fv0<?> fv0Var2 = fv0Var;
                final h hVar2 = hVar;
                a350 a350Var2 = a350Var;
                final u1z u1zVar2 = u1zVar;
                try {
                    r1zVar.a(aVar, fv0Var2, hVar2, a350Var2, u1zVar2);
                    int i = aVar.a;
                    int i2 = f2zVar.d;
                    if (i < i2) {
                        r1z r1zVar2 = f2zVar.c[i];
                        aVar.b += r1zVar2.a;
                        aVar.c += r1zVar2.b;
                        int i3 = i + 1;
                        aVar.a = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        fv0Var = fv0Var2;
                        hVar = hVar2;
                        a350Var = a350Var2;
                        u1zVar = u1zVar2;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    if (u1zVar2 == null) {
                        throw th;
                    }
                    nka.b(th, new Function0() { // from class: x1z
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            l00 l00Var = l00VarB;
                            h hVar3 = hVar2;
                            if (l00Var != null) {
                                hVar3.a(hVar3.c(l00Var) - hVar3.t);
                            }
                            List listA = lka.a(hVar3, null, hVar3.t, null);
                            mka mkaVar = (mka) CollectionsKt.d0(listA);
                            Integer num = mkaVar != null ? mkaVar.a : null;
                            List<mka> listB = u1zVar2.b(num);
                            if (num != null && !listB.isEmpty()) {
                                mka mkaVar2 = (mka) CollectionsKt.T(listB);
                                List listO = CollectionsKt.O(listB, 1);
                                mkaVar2.getClass();
                                listB = CollectionsKt.i0(listO, a.c(new mka(null, num)));
                            }
                            return CollectionsKt.i0(listB, listA);
                        }
                    });
                    throw th;
                }
            }
        }
        clear();
    }

    public final boolean Y() {
        return this.d != 0;
    }

    public final void Z(r1z r1zVar) {
        int i = this.d;
        r1z[] r1zVarArr = this.c;
        if (i == r1zVarArr.length) {
            r1z[] r1zVarArr2 = new r1z[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(r1zVarArr, 0, r1zVarArr2, 0, i);
            this.c = r1zVarArr2;
        }
        int i2 = this.f;
        int i3 = r1zVar.a;
        int i4 = r1zVar.b;
        int i5 = i2 + i3;
        int[] iArr = this.e;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            xx0.d(0, 0, length, iArr, iArr2);
            this.e = iArr2;
        }
        int i7 = this.v + i4;
        Object[] objArr = this.i;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.i = objArr2;
        }
        r1z[] r1zVarArr3 = this.c;
        int i9 = this.d;
        this.d = i9 + 1;
        r1zVarArr3[i9] = r1zVar;
        this.f += r1zVar.a;
        this.v += i4;
    }

    public final void clear() {
        this.d = 0;
        this.f = 0;
        Arrays.fill(this.i, 0, this.v, (Object) null);
        this.v = 0;
    }

    public final boolean isEmpty() {
        return this.d == 0;
    }
}
