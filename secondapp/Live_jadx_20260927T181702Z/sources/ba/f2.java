package ba;

import androidx.annotation.NonNull;
import java.util.Set;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebSettingsBoundaryInterface f20918a;

    public f2(@NonNull WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f20918a = webSettingsBoundaryInterface;
    }

    public void A(int i10) {
        this.f20918a.setWebauthnSupport(i10);
    }

    public void B(@NonNull aa.z zVar) {
        this.f20918a.setWebViewMediaIntegrityApiStatus(zVar.a(), zVar.b());
    }

    public int a() {
        return this.f20918a.getAttributionBehavior();
    }

    public boolean b() {
        return this.f20918a.getBackForwardCacheEnabled();
    }

    public int c() {
        return this.f20918a.getDisabledActionModeMenuItems();
    }

    public boolean d() {
        return this.f20918a.getEnterpriseAuthenticationAppLinkPolicyEnabled();
    }

    public int e() {
        return this.f20918a.getForceDark();
    }

    public int f() {
        return this.f20918a.getForceDarkBehavior();
    }

    public boolean g() {
        return this.f20918a.getOffscreenPreRaster();
    }

    @NonNull
    public Set<String> h() {
        return this.f20918a.getRequestedWithHeaderOriginAllowList();
    }

    public boolean i() {
        return this.f20918a.getSafeBrowsingEnabled();
    }

    public int j() {
        return this.f20918a.getSpeculativeLoadingStatus();
    }

    @NonNull
    public aa.q k() {
        return w1.c(this.f20918a.getUserAgentMetadataMap());
    }

    public int l() {
        return this.f20918a.getWebauthnSupport();
    }

    @NonNull
    public aa.z m() {
        return new aa.z.a(this.f20918a.getWebViewMediaIntegrityApiDefaultStatus()).e(this.f20918a.getWebViewMediaIntegrityApiOverrideRules()).d();
    }

    public boolean n() {
        return this.f20918a.isAlgorithmicDarkeningAllowed();
    }

    public void o(boolean z10) {
        this.f20918a.setAlgorithmicDarkeningAllowed(z10);
    }

    public void p(int i10) {
        this.f20918a.setAttributionBehavior(i10);
    }

    public void q(boolean z10) {
        this.f20918a.setBackForwardCacheEnabled(z10);
    }

    public void r(int i10) {
        this.f20918a.setDisabledActionModeMenuItems(i10);
    }

    public void s(boolean z10) {
        this.f20918a.setEnterpriseAuthenticationAppLinkPolicyEnabled(z10);
    }

    public void t(int i10) {
        this.f20918a.setForceDark(i10);
    }

    public void u(int i10) {
        this.f20918a.setForceDarkBehavior(i10);
    }

    public void v(boolean z10) {
        this.f20918a.setOffscreenPreRaster(z10);
    }

    public void w(@NonNull Set<String> set) {
        this.f20918a.setRequestedWithHeaderOriginAllowList(set);
    }

    public void x(boolean z10) {
        this.f20918a.setSafeBrowsingEnabled(z10);
    }

    public void y(int i10) {
        this.f20918a.setSpeculativeLoadingStatus(i10);
    }

    public void z(@NonNull aa.q qVar) {
        this.f20918a.setUserAgentMetadataFromMap(w1.a(qVar));
    }
}
