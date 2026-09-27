package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class rw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mw0 f155169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hx0 f155170b;

    public /* synthetic */ rw0(Context context) {
        this(new mw0(context), new hx0(context));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:35:0x0098 A[Catch: Exception -> 0x00a2, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a2, blocks: (B:13:0x002d, B:32:0x008a, B:35:0x0098, B:18:0x003d, B:28:0x0069, B:24:0x0055), top: B:40:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(dn2 dn2Var, or.f fVar) {
        nw0 nw0Var;
        rw0 rw0Var;
        rw0 rw0Var2;
        if (fVar instanceof nw0) {
            nw0Var = (nw0) fVar;
            int i10 = nw0Var.f153236f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nw0Var.f153236f = i10 - Integer.MIN_VALUE;
            } else {
                nw0Var = new nw0(this, fVar);
            }
        } else {
            nw0Var = new nw0(this, fVar);
        }
        Object objA = nw0Var.f153234d;
        Object objL = qr.d.l();
        int i11 = nw0Var.f153236f;
        boolean z10 = false;
        try {
            if (i11 == 0) {
                dr.j1.n(objA);
                if (this.f155170b.a(dn2Var.a()) != null) {
                    return rr.b.a(true);
                }
                mw0 mw0Var = this.f155169a;
                String strB = dn2Var.b();
                nw0Var.f153232b = this;
                nw0Var.f153233c = dn2Var;
                nw0Var.f153236f = 1;
                objA = mw0Var.a(strB, nw0Var);
                if (objA != objL) {
                    rw0Var = this;
                }
                return objL;
            }
            if (i11 == 1) {
                dn2Var = nw0Var.f153233c;
                rw0Var = nw0Var.f153232b;
                dr.j1.n(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dn2Var = nw0Var.f153233c;
                rw0Var2 = nw0Var.f153232b;
                dr.j1.n(objA);
            }
            if (rw0Var2.f155170b.a(dn2Var.a()) != null) {
                z10 = true;
            } else {
                dn2Var.a().name();
                boolean z11 = ad1.f146762a;
            }
            return rr.b.a(z10);
            sw0 sw0VarA = dn2Var.a();
            nw0Var.f153232b = rw0Var;
            nw0Var.f153233c = dn2Var;
            nw0Var.f153236f = 2;
            rw0Var.getClass();
            if (jv.i.h(jv.l1.c(), new qw0((byte[]) objA, rw0Var, sw0VarA, null), nw0Var) != objL) {
                rw0Var2 = rw0Var;
                if (rw0Var2.f155170b.a(dn2Var.a()) != null) {
                    z10 = true;
                } else {
                    dn2Var.a().name();
                    boolean z12 = ad1.f146762a;
                }
                return rr.b.a(z10);
            }
            return objL;
        } catch (Exception unused) {
            boolean z13 = ad1.f146762a;
        }
    }

    public rw0(mw0 mw0Var, hx0 hx0Var) {
        this.f155169a = mw0Var;
        this.f155170b = hx0Var;
    }
}
