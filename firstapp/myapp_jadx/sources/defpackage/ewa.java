package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ewa {
    public int b;
    public boolean c;
    public final ixa d;
    public final a e;
    public ewa f;
    public uoa0 i;
    public HashSet<ewa> a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a i;
        public static final a v;
        public static final /* synthetic */ a[] w;

        /* JADX INFO: Fake field, exist only in values array */
        a EF0;

        static {
            a aVar = new a("NONE", 0);
            a aVar2 = new a("LEFT", 1);
            a = aVar2;
            a aVar3 = new a("TOP", 2);
            b = aVar3;
            a aVar4 = new a("RIGHT", 3);
            c = aVar4;
            a aVar5 = new a("BOTTOM", 4);
            d = aVar5;
            a aVar6 = new a("BASELINE", 5);
            e = aVar6;
            a aVar7 = new a("CENTER", 6);
            f = aVar7;
            a aVar8 = new a("CENTER_X", 7);
            i = aVar8;
            a aVar9 = new a("CENTER_Y", 8);
            v = aVar9;
            w = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) w.clone();
        }
    }

    public ewa(ixa ixaVar, a aVar) {
        this.d = ixaVar;
        this.e = aVar;
    }

    public final void a(ewa ewaVar, int i) {
        b(ewaVar, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(ewa ewaVar, int i, int i2, boolean z) {
        if (ewaVar == null) {
            j();
            return true;
        }
        if (!z && !i(ewaVar)) {
            return false;
        }
        this.f = ewaVar;
        if (ewaVar.a == null) {
            ewaVar.a = new HashSet<>();
        }
        HashSet<ewa> hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, v6j0 v6j0Var, ArrayList arrayList) {
        HashSet<ewa> hashSet = this.a;
        if (hashSet != null) {
            Iterator<ewa> it = hashSet.iterator();
            while (it.hasNext()) {
                d9l.a(it.next().d, i, arrayList, v6j0Var);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int e() {
        ewa ewaVar;
        if (this.d.j0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (ewaVar = this.f) == null || ewaVar.d.j0 != 8) ? this.g : i;
    }

    public final ewa f() {
        a aVar = this.e;
        int iOrdinal = aVar.ordinal();
        ixa ixaVar = this.d;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return ixaVar.M;
            case 2:
                return ixaVar.N;
            case 3:
                return ixaVar.K;
            case 4:
                return ixaVar.L;
            default:
                jb5.a(aVar.name());
                return null;
        }
    }

    public final boolean g() {
        HashSet<ewa> hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator<ewa> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x0066 A[RETURN] */
    public final boolean i(ewa ewaVar) {
        if (ewaVar != null) {
            ixa ixaVar = ewaVar.d;
            a aVar = ewaVar.e;
            a aVar2 = a.e;
            a aVar3 = this.e;
            if (aVar != aVar3) {
                int iOrdinal = aVar3.ordinal();
                a aVar4 = a.c;
                a aVar5 = a.a;
                a aVar6 = a.v;
                a aVar7 = a.i;
                switch (iOrdinal) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z = aVar == aVar5 || aVar == aVar4;
                        if (!(ixaVar instanceof qal)) {
                            return z;
                        }
                        if (z || aVar == aVar7) {
                            return true;
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z2 = aVar == a.b || aVar == a.d;
                        if (!(ixaVar instanceof qal)) {
                            return z2;
                        }
                        if (z2 || aVar == aVar6) {
                            return true;
                        }
                        break;
                    case 5:
                        if (aVar != aVar5 && aVar != aVar4) {
                            return true;
                        }
                        break;
                    case 6:
                        if (aVar != aVar2 && aVar != aVar7 && aVar != aVar6) {
                            return true;
                        }
                        break;
                    default:
                        jb5.a(aVar3.name());
                        return false;
                }
            } else if (aVar3 != aVar2 || (ixaVar.F && this.d.F)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet<ewa> hashSet;
        ewa ewaVar = this.f;
        if (ewaVar != null && (hashSet = ewaVar.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        uoa0 uoa0Var = this.i;
        if (uoa0Var == null) {
            this.i = new uoa0(uoa0.a.a);
        } else {
            uoa0Var.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.l0 + ":" + this.e.toString();
    }
}
