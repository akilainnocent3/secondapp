package defpackage;

import com.sportybet.android.widget.OneUpTwoUpCheckbox;
import com.sportybet.android.widget.OneUpTwoUpSwitch;

/* JADX INFO: loaded from: classes7.dex */
public final class hih0 {
    public static final void a(OneUpTwoUpSwitch oneUpTwoUpSwitch, zuy zuyVar) {
        oneUpTwoUpSwitch.getClass();
        int iOrdinal = zuyVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                oneUpTwoUpSwitch.setMode(OneUpTwoUpSwitch.c.a);
                return;
            }
            if (iOrdinal == 2) {
                oneUpTwoUpSwitch.setMode(OneUpTwoUpSwitch.c.b);
            } else if (iOrdinal == 3) {
                oneUpTwoUpSwitch.setMode(OneUpTwoUpSwitch.c.c);
            } else {
                uhc.a();
            }
        }
    }

    public static final void b(OneUpTwoUpSwitch oneUpTwoUpSwitch, avy avyVar) {
        oneUpTwoUpSwitch.getClass();
        avyVar.getClass();
        c(oneUpTwoUpSwitch, avyVar, false, true);
    }

    public static final void c(OneUpTwoUpSwitch oneUpTwoUpSwitch, avy avyVar, boolean z, boolean z2) {
        OneUpTwoUpSwitch.f fVar;
        OneUpTwoUpSwitch.f fVar2;
        OneUpTwoUpSwitch.f fVar3;
        oneUpTwoUpSwitch.getClass();
        avyVar.getClass();
        int iOrdinal = oneUpTwoUpSwitch.getA().ordinal();
        if (iOrdinal == 0) {
            int iOrdinal2 = avyVar.ordinal();
            if (iOrdinal2 == 0) {
                fVar = OneUpTwoUpSwitch.f.b.C0357b.a;
            } else if (iOrdinal2 == 1) {
                fVar = OneUpTwoUpSwitch.f.b.c.a;
            } else {
                if (iOrdinal2 != 2) {
                    uhc.a();
                    return;
                }
                fVar = OneUpTwoUpSwitch.f.b.a.a;
            }
            oneUpTwoUpSwitch.setState(fVar, z, z2);
            return;
        }
        if (iOrdinal == 1) {
            int iOrdinal3 = avyVar.ordinal();
            if (iOrdinal3 != 0) {
                fVar2 = iOrdinal3 != 2 ? OneUpTwoUpSwitch.f.a.C0356a.a : OneUpTwoUpSwitch.f.a.C0356a.a;
            } else {
                fVar2 = OneUpTwoUpSwitch.f.a.b.a;
            }
            oneUpTwoUpSwitch.setState(fVar2, z, z2);
            return;
        }
        if (iOrdinal != 2) {
            uhc.a();
            return;
        }
        int iOrdinal4 = avyVar.ordinal();
        if (iOrdinal4 != 1) {
            fVar3 = iOrdinal4 != 2 ? OneUpTwoUpSwitch.f.c.a.a : OneUpTwoUpSwitch.f.c.a.a;
        } else {
            fVar3 = OneUpTwoUpSwitch.f.c.b.a;
        }
        oneUpTwoUpSwitch.setState(fVar3, z, z2);
    }

    public static final zuy e(OneUpTwoUpSwitch.c cVar) {
        cVar.getClass();
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            return zuy.b;
        }
        if (iOrdinal == 1) {
            return zuy.c;
        }
        if (iOrdinal == 2) {
            return zuy.d;
        }
        uhc.a();
        return null;
    }

    public static final avy f(OneUpTwoUpCheckbox.a aVar, boolean z) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            return z ? avy.a : avy.c;
        }
        if (iOrdinal == 1) {
            return z ? avy.b : avy.c;
        }
        uhc.a();
        return null;
    }

    public static final avy g(OneUpTwoUpSwitch.f fVar) {
        fVar.getClass();
        if (fVar instanceof OneUpTwoUpSwitch.f.a) {
            return fVar.equals(OneUpTwoUpSwitch.f.a.b.a) ? avy.a : avy.c;
        }
        if (fVar instanceof OneUpTwoUpSwitch.f.c) {
            return fVar.equals(OneUpTwoUpSwitch.f.c.b.a) ? avy.b : avy.c;
        }
        if (!(fVar instanceof OneUpTwoUpSwitch.f.b)) {
            uhc.a();
            return null;
        }
        OneUpTwoUpSwitch.f.b bVar = (OneUpTwoUpSwitch.f.b) fVar;
        if (bVar.equals(OneUpTwoUpSwitch.f.b.C0357b.a)) {
            return avy.a;
        }
        return bVar.equals(OneUpTwoUpSwitch.f.b.c.a) ? avy.b : avy.c;
    }
}
