package defpackage;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final class cxg0<A, B, C> implements php<bxg0<? extends A, ? extends B, ? extends C>> {
    public final php<A> a;
    public final php<B> b;
    public final php<C> c;
    public final sd80 d;

    public cxg0(php<A> phpVar, php<B> phpVar2, php<C> phpVar3) {
        sd80 sd80Var;
        this.a = phpVar;
        this.b = phpVar2;
        this.c = phpVar3;
        pd80[] pd80VarArr = new pd80[0];
        uvc uvcVar = new uvc(this, 2);
        if (StringsKt.U("kotlin.Triple")) {
            hb5.a("Blank serial names are prohibited");
            sd80Var = null;
        } else {
            eq7 eq7Var = new eq7("kotlin.Triple");
            uvcVar.invoke(eq7Var);
            sd80Var = new sd80("kotlin.Triple", ebe0.a.a, eq7Var.c.size(), ay0.S(pd80VarArr), eq7Var);
        }
        this.d = sd80Var;
    }

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        sd80 sd80Var = this.d;
        dma dmaVarC = b5dVar.c(sd80Var);
        Object obj = fyg0.a;
        Object objY = obj;
        Object objY2 = objY;
        Object objY3 = objY2;
        while (true) {
            int iV = dmaVarC.v(sd80Var);
            if (iV == -1) {
                dmaVarC.b(sd80Var);
                if (objY == obj) {
                    throw new ee80("Element 'first' is missing");
                }
                if (objY2 == obj) {
                    throw new ee80("Element 'second' is missing");
                }
                if (objY3 != obj) {
                    return new bxg0(objY, objY2, objY3);
                }
                throw new ee80("Element 'third' is missing");
            }
            if (iV == 0) {
                objY = dmaVarC.y(sd80Var, 0, this.a, null);
            } else if (iV == 1) {
                objY2 = dmaVarC.y(sd80Var, 1, this.b, null);
            } else {
                if (iV != 2) {
                    throw new ee80(hce0.a(iV, "Unexpected index "));
                }
                objY3 = dmaVarC.y(sd80Var, 2, this.c, null);
            }
        }
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return this.d;
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        bxg0 bxg0Var = (bxg0) obj;
        bxg0Var.getClass();
        sd80 sd80Var = this.d;
        fma fmaVarC = f4gVar.c(sd80Var);
        fmaVarC.q(sd80Var, 0, this.a, bxg0Var.a);
        fmaVarC.q(sd80Var, 1, this.b, bxg0Var.b);
        fmaVarC.q(sd80Var, 2, this.c, bxg0Var.c);
        fmaVarC.b(sd80Var);
    }
}
