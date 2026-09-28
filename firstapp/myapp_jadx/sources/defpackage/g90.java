package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g90 implements iaj {
    public final /* synthetic */ h90 a;

    @Override // defpackage.iaj
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        h90 h90Var = this.a;
        z9h0 z9h0VarB = h90Var.e.b((f8i) obj, (t9i) obj2, ((n9i) obj3).a, ((o9i) obj4).a);
        if (z9h0VarB instanceof z9h0.b) {
            Object obj5 = ((z9h0.b) z9h0VarB).a;
            obj5.getClass();
            return (Typeface) obj5;
        }
        s9h0 s9h0Var = new s9h0(z9h0VarB, h90Var.j);
        h90Var.j = s9h0Var;
        Object obj6 = s9h0Var.c;
        obj6.getClass();
        return (Typeface) obj6;
    }
}
