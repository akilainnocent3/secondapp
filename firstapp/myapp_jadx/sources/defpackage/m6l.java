package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m6l implements a0b {
    public final String a;
    public final p6l b;
    public final ce0 c;
    public final de0 d;
    public final he0 e;
    public final he0 f;
    public final be0 g;
    public final ly80.a h;
    public final ly80.b i;
    public final float j;
    public final ArrayList k;
    public final be0 l;
    public final boolean m;

    public m6l(String str, p6l p6lVar, ce0 ce0Var, de0 de0Var, he0 he0Var, he0 he0Var2, be0 be0Var, ly80.a aVar, ly80.b bVar, float f, ArrayList arrayList, be0 be0Var2, boolean z) {
        this.a = str;
        this.b = p6lVar;
        this.c = ce0Var;
        this.d = de0Var;
        this.e = he0Var;
        this.f = he0Var2;
        this.g = be0Var;
        this.h = aVar;
        this.i = bVar;
        this.j = f;
        this.k = arrayList;
        this.l = be0Var2;
        this.m = z;
    }

    @Override // defpackage.a0b
    public final cza a(iot iotVar, xmt xmtVar, w12 w12Var) {
        return new n6l(iotVar, w12Var, this);
    }
}
