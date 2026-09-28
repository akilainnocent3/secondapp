package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class zmd implements smd {
    public final x6j0 d;
    public int f;
    public int g;
    public x6j0 a = null;
    public boolean b = false;
    public boolean c = false;
    public a e = a.a;
    public int h = 1;
    public fqe i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

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

        static {
            a aVar = new a("UNKNOWN", 0);
            a = aVar;
            a aVar2 = new a("HORIZONTAL_DIMENSION", 1);
            b = aVar2;
            a aVar3 = new a("VERTICAL_DIMENSION", 2);
            c = aVar3;
            a aVar4 = new a("LEFT", 3);
            d = aVar4;
            a aVar5 = new a("RIGHT", 4);
            e = aVar5;
            a aVar6 = new a("TOP", 5);
            f = aVar6;
            a aVar7 = new a("BOTTOM", 6);
            i = aVar7;
            a aVar8 = new a("BASELINE", 7);
            v = aVar8;
            w = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
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

    public zmd(x6j0 x6j0Var) {
        this.d = x6j0Var;
    }

    @Override // defpackage.smd
    public final void a(smd smdVar) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((zmd) obj).j) {
                return;
            }
        }
        this.c = true;
        x6j0 x6j0Var = this.a;
        if (x6j0Var != null) {
            x6j0Var.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        int size2 = arrayList.size();
        zmd zmdVar = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            zmd zmdVar2 = (zmd) obj2;
            if (!(zmdVar2 instanceof fqe)) {
                i++;
                zmdVar = zmdVar2;
            }
        }
        if (zmdVar != null && i == 1 && zmdVar.j) {
            fqe fqeVar = this.i;
            if (fqeVar != null) {
                if (!fqeVar.j) {
                    return;
                } else {
                    this.f = this.h * fqeVar.g;
                }
            }
            d(zmdVar.g + this.f);
        }
        x6j0 x6j0Var2 = this.a;
        if (x6j0Var2 != null) {
            x6j0Var2.a(this);
        }
    }

    public final void b(x6j0 x6j0Var) {
        this.k.add(x6j0Var);
        if (this.j) {
            x6j0Var.a(x6j0Var);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            smd smdVar = (smd) obj;
            smdVar.a(smdVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.l0);
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
