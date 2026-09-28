package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class fhf extends l8l {
    public static final /* synthetic */ int c = 0;
    public final dhf a = dhf.e;
    public final kch b = kch.a;

    @Override // defpackage.l8l
    public final kch a() {
        return this.b;
    }

    @Override // defpackage.l8l
    public final boolean b(m26 m26Var, e6s e6sVar) {
        m26Var.getClass();
        Set<dhf> setA = m26Var.a();
        setA.getClass();
        pgt.a("DynamicRangeFeature", "isSupportedIndividually: cameraInfoSupportedDynamicRanges = " + setA + ", this = " + this);
        dhf dhfVar = this.a;
        if (!setA.contains(dhfVar)) {
            return false;
        }
        for (pnh0 pnh0Var : e6sVar.e) {
            Set<dhf> setJ = pnh0Var.j(m26Var);
            pgt.a("DynamicRangeFeature", "isSupportedIndividually: useCaseSupportedDynamicRanges = " + setJ + ", this = " + this + ", useCases = " + pnh0Var);
            if (setJ != null && !setJ.contains(dhfVar)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "DynamicRangeFeature(dynamicRange=" + this.a + ')';
    }
}
