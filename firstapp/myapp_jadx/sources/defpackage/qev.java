package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class qev {
    public static final /* synthetic */ int g = 0;
    public final uy0 a;
    public final u2u b;
    public final uo1 c;
    public final ffy d;
    public final glh0 e;
    public final vxt f;

    static {
        ohp<Object>[] ohpVarArr = vxt.h;
        int i = glh0.d;
    }

    public qev(uy0 uy0Var, u2u u2uVar, uo1 uo1Var, ffy ffyVar, glh0 glh0Var, vxt vxtVar) {
        uy0Var.getClass();
        uo1Var.getClass();
        ffyVar.getClass();
        glh0Var.getClass();
        this.a = uy0Var;
        this.b = u2uVar;
        this.c = uo1Var;
        this.d = ffyVar;
        this.e = glh0Var;
        this.f = vxtVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        pev pevVar;
        if (x1bVar instanceof pev) {
            pevVar = (pev) x1bVar;
            int i = pevVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pevVar.c = i - Integer.MIN_VALUE;
            } else {
                pevVar = new pev(this, x1bVar);
            }
        } else {
            pevVar = new pev(this, x1bVar);
        }
        Object obj = pevVar.a;
        y5b y5bVar = y5b.a;
        int i2 = pevVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            pevVar.c = 1;
            if (this.e.a(pevVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
