package defpackage;

import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;

/* JADX INFO: loaded from: classes8.dex */
public abstract class q4<T> implements php<T> {
    public tae<T> a(dma dmaVar, String str) {
        return dmaVar.d().j(c(), str);
    }

    public he80<T> b(f4g f4gVar, T t) {
        t.getClass();
        return f4gVar.d().k(c(), t);
    }

    public abstract ygp<T> c();

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, T t) {
        t.getClass();
        he80<? super T> he80VarE = byx.e(this, f4gVar, t);
        pd80 descriptor = getDescriptor();
        fma fmaVarC = f4gVar.c(descriptor);
        fmaVarC.o(getDescriptor(), 0, he80VarE.getDescriptor().h());
        fmaVarC.q(getDescriptor(), 1, he80VarE, t);
        fmaVarC.b(descriptor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tae
    public final T deserialize(b5d b5dVar) {
        pd80 descriptor = getDescriptor();
        dma dmaVarC = b5dVar.c(descriptor);
        dq40 dq40Var = new dq40();
        T t = null;
        while (true) {
            int iV = dmaVarC.v(getDescriptor());
            if (iV != -1) {
                if (iV != 0) {
                    T t2 = dq40Var.a;
                    if (iV != 1) {
                        StringBuilder sb = new StringBuilder(tYcQsJyaojE.nzzSSjaLgBT);
                        String str = (String) t2;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb.append(str);
                        sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb.append(iV);
                        throw new ee80(sb.toString());
                    }
                    if (t2 != 0) {
                        dq40Var.a = t2;
                        t = (T) dmaVarC.y(getDescriptor(), iV, byx.d(this, dmaVarC, (String) t2), null);
                    } else {
                        hb5.a("Cannot read polymorphic value before its type token");
                        return null;
                    }
                } else {
                    dq40Var.a = (T) dmaVarC.j(getDescriptor(), iV);
                }
            } else {
                if (t != null) {
                    dmaVarC.b(descriptor);
                    return t;
                }
                r2z.a((String) dq40Var.a, "Polymorphic value has not been read for class ");
                return null;
            }
        }
    }
}
