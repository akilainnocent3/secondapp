package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public interface m9n {

    public static final class a {
        public final Context a;
        public final nan.b b = nan.b.o;
        public ap8 c = null;
        public b0d d = null;
        public final p4h.a e = new p4h.a();

        public a(Context context) {
            this.a = context.getApplicationContext();
        }

        public final a840 a() {
            p4h p4hVar = new p4h(h58.b(this.e.a));
            nan.b bVar = this.b;
            nan.b bVar2 = new nan.b(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, bVar.g, bVar.h, bVar.i, bVar.j, bVar.k, bVar.l, bVar.m, p4hVar);
            mpe0 mpe0VarB = hwr.b(new j9n());
            mpe0 mpe0VarB2 = hwr.b(new k9n(this, 0));
            mpe0 mpe0VarB3 = hwr.b(new l9n());
            ap8 ap8Var = this.c;
            if (ap8Var == null) {
                ap8Var = new ap8();
            }
            return new a840(new a840.a(this.a, bVar2, mpe0VarB, mpe0VarB2, mpe0VarB3, ap8Var, this.d));
        }
    }

    qse a(nan nanVar);

    Object b(nan nanVar, v1b<? super dbn> v1bVar);
}
