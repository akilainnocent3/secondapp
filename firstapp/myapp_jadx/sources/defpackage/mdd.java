package defpackage;

import androidx.compose.runtime.m;
import androidx.emoji2.text.d;

/* JADX INFO: loaded from: classes.dex */
public final class mdd {
    public twd0<Boolean> a;

    public static final class a extends d.f {
        public final /* synthetic */ ytw<Boolean> a;
        public final /* synthetic */ mdd b;

        public a(ytw<Boolean> ytwVar, mdd mddVar) {
            this.a = ytwVar;
            this.b = mddVar;
        }

        @Override // androidx.emoji2.text.d.f
        public final void a() {
            this.b.a = b1g.a;
        }

        @Override // androidx.emoji2.text.d.f
        public final void b() {
            ((x5a0) this.a).setValue(Boolean.TRUE);
            this.b.a = new hcn(true);
        }
    }

    public final twd0<Boolean> a() {
        d dVarA = d.a();
        if (dVarA.c() == 1) {
            return new hcn(true);
        }
        ytw ytwVarB = m.b(Boolean.FALSE);
        dVarA.h(new a(ytwVarB, this));
        return ytwVarB;
    }
}
