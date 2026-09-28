package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class fur implements mwr {
    public final zvr a;

    public fur(zvr zvrVar) {
        this.a = zvrVar;
    }

    @Override // defpackage.mwr
    public final int a() {
        return this.a.g().i();
    }

    @Override // defpackage.mwr
    public final int b() {
        int i;
        zvr zvrVar = this.a;
        if (zvrVar.g().k().isEmpty()) {
            return 0;
        }
        cvr cvrVarG = zvrVar.g();
        i3z i3zVarA = cvrVarG.a();
        i3z i3zVar = i3z.a;
        int iD = (int) (i3zVarA == i3zVar ? cvrVarG.d() & 4294967295L : cvrVarG.d() >> 32);
        cvr cvrVarG2 = zvrVar.g();
        boolean z = cvrVarG2.a() == i3zVar;
        List<nur> listK = cvrVarG2.k();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < listK.size()) {
            nur nurVar = cvrVarG2.k().get(i2);
            int iG = z ? nurVar.g() : nurVar.i();
            if (iG == -1) {
                i2++;
            } else {
                int iMax = 0;
                while (i2 < listK.size()) {
                    nur nurVar2 = cvrVarG2.k().get(i2);
                    if ((z ? nurVar2.g() : nurVar2.i()) != iG) {
                        break;
                    }
                    iMax = Math.max(iMax, (int) (z ? listK.get(i2).a() & 4294967295L : listK.get(i2).a() >> 32));
                    i2++;
                }
                i3 += iMax;
                i4++;
            }
        }
        int iJ = cvrVarG2.j() + (i3 / i4);
        if (iJ != 0 && (i = iD / iJ) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.mwr
    public final boolean c() {
        return !this.a.g().k().isEmpty();
    }

    @Override // defpackage.mwr
    public final int d() {
        return ((u5a0) this.a.d.a).D();
    }

    @Override // defpackage.mwr
    public final int e() {
        return ((nur) CollectionsKt.b0(this.a.g().k())).getIndex();
    }
}
