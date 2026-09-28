package defpackage;

import com.sporty.android.core.model.patron.KycSource;

/* JADX INFO: loaded from: classes4.dex */
public final class ggm {
    public static final fgm a(zsp zspVar) {
        zspVar.getClass();
        switch (zspVar.a.ordinal()) {
            case 0:
                return new fgm(KycSource.VERIFY, (osp) null, (osp.l) null, 14);
            case 1:
            case 3:
                return new fgm(KycSource.VERIFY, new osp.m(false), new osp.l(false), 8);
            case 2:
            case 7:
                return new fgm(KycSource.VERIFY, new osp.q(0), new osp.l(false), 8);
            case 4:
                KycSource kycSource = KycSource.HOME_RESUBMIT;
                eup eupVar = eup.HOME;
                return new fgm(kycSource, new osp.o(eupVar), new osp.n(eupVar), new osp.p(eupVar));
            case 5:
                return new fgm(KycSource.VERIFY, new osp.m(true), new osp.l(true), 8);
            case 6:
                KycSource kycSource2 = KycSource.HOME_310_RESUBMIT;
                eup eupVar2 = eup.HOME_310;
                return new fgm(kycSource2, new osp.o(eupVar2), new osp.n(eupVar2), new osp.p(eupVar2));
            default:
                uhc.a();
                return null;
        }
    }
}
