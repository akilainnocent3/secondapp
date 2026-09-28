package defpackage;

import defpackage.wnv;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class kmp<PrimitiveT, KeyProtoT extends wnv> {
    public final gnp<KeyProtoT> a;
    public final Class<PrimitiveT> b;

    public kmp(gnp<KeyProtoT> gnpVar, Class<PrimitiveT> cls) {
        if (!gnpVar.b.keySet().contains(cls) && !Void.class.equals(cls)) {
            hb5.a(lx5.a("Given internalKeyMananger ", gnpVar.toString(), " does not support primitive class ", cls.getName()));
            throw null;
        }
        this.a = gnpVar;
        this.b = cls;
    }

    public final bmp a(ql5 ql5Var) throws GeneralSecurityException {
        gnp<KeyProtoT> gnpVar = this.a;
        try {
            gnp.a<?, KeyProtoT> aVarC = gnpVar.c();
            wnv wnvVarC = aVarC.c(ql5Var);
            aVarC.d(wnvVarC);
            wnv wnvVarA = aVarC.a(wnvVarC);
            bmp.a aVarA = bmp.A();
            String strB = gnpVar.b();
            aVarA.e();
            ((bmp) aVarA.b).C(strB);
            ql5.f fVarF = ((d4) wnvVarA).f();
            aVarA.e();
            ((bmp) aVarA.b).D(fVarF);
            bmp.b bVarD = gnpVar.d();
            aVarA.e();
            ((bmp) aVarA.b).B(bVarD);
            return aVarA.b();
        } catch (f0p e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }
}
