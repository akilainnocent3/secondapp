package defpackage;

import java.util.Random;

/* JADX INFO: loaded from: classes8.dex */
public final class huz extends kni0 {
    public final x0g b;
    public final float c;
    public final Random d;
    public float e;
    public float f;

    public huz(x0g x0gVar, float f) {
        Random random = new Random();
        x0gVar.getClass();
        this.b = x0gVar;
        this.c = f;
        this.d = random;
    }

    public final i620.a p(i620 i620Var, f3b f3bVar) {
        if (i620Var instanceof i620.a) {
            i620.a aVar = (i620.a) i620Var;
            return new i620.a(aVar.a, aVar.b);
        }
        if (i620Var instanceof i620.c) {
            i620.c cVar = (i620.c) i620Var;
            return new i620.a(f3bVar.a * ((float) cVar.a), f3bVar.b * ((float) cVar.b));
        }
        if (!(i620Var instanceof i620.b)) {
            uhc.a();
            return null;
        }
        i620.b bVar = (i620.b) i620Var;
        i620.a aVarP = p(bVar.a, f3bVar);
        i620.a aVarP2 = p(bVar.b, f3bVar);
        Random random = this.d;
        float fNextFloat = random.nextFloat();
        float f = aVarP2.a;
        float f2 = aVarP.a;
        float fA = hxa.a(f, f2, fNextFloat, f2);
        float fNextFloat2 = random.nextFloat();
        float f3 = aVarP2.b;
        float f4 = aVarP.b;
        return new i620.a(fA, hxa.a(f3, f4, fNextFloat2, f4));
    }

    public final float q(mw50 mw50Var) {
        if (!mw50Var.a) {
            return 0.0f;
        }
        float fNextFloat = (this.d.nextFloat() * 2.0f) - 1.0f;
        float f = mw50Var.b;
        return (mw50Var.c * f * fNextFloat) + f;
    }
}
