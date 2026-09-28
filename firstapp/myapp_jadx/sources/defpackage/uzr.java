package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class uzr implements jyr, tp70 {
    public final /* synthetic */ tp70 a;
    public final /* synthetic */ zzr b;

    public uzr(tp70 tp70Var, zzr zzrVar) {
        this.b = zzrVar;
        this.a = tp70Var;
    }

    @Override // defpackage.jyr
    public final int a() {
        return this.b.j().i();
    }

    @Override // defpackage.jyr
    public final int b() {
        zyr zyrVar = (zyr) CollectionsKt.d0(this.b.j().k());
        if (zyrVar != null) {
            return zyrVar.getIndex();
        }
        return 0;
    }

    @Override // defpackage.jyr
    public final void c(int i, int i2) {
        this.b.l(i, i2);
    }

    @Override // defpackage.jyr
    public final int d(int i) {
        zyr zyrVar;
        zzr zzrVar = this.b;
        kzr kzrVarJ = zzrVar.j();
        if (!kzrVarJ.k().isEmpty()) {
            int iH = zzrVar.h();
            if (i > b() || iH > i) {
                return ((i - zzrVar.h()) * j8d.a(kzrVarJ)) - zzrVar.i();
            }
            List<zyr> listK = kzrVarJ.k();
            int size = listK.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    zyrVar = null;
                    break;
                }
                zyrVar = listK.get(i2);
                if (zyrVar.getIndex() == i) {
                    break;
                }
                i2++;
            }
            zyr zyrVar2 = zyrVar;
            if (zyrVar2 != null) {
                return zyrVar2.getOffset();
            }
        }
        return 0;
    }

    @Override // defpackage.tp70
    public final float e(float f) {
        return this.a.e(f);
    }

    @Override // defpackage.jyr
    public final int f() {
        return this.b.i();
    }

    @Override // defpackage.jyr
    public final int g() {
        return this.b.h();
    }
}
