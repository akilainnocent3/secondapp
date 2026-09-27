package yads;

import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class so1 {
    public static Map a(fo1 fo1Var) {
        MediatedAdapterInfo mediatedAdapterInfoB = fo1Var.b();
        String adapterVersion = mediatedAdapterInfoB.getAdapterVersion();
        String str = fw.b.f85379f;
        if (adapterVersion == null) {
            adapterVersion = fw.b.f85379f;
        }
        dr.z0 z0VarA = dr.v1.a("mediation_adapter_version", adapterVersion);
        String networkName = mediatedAdapterInfoB.getNetworkName();
        if (networkName == null) {
            networkName = fw.b.f85379f;
        }
        dr.z0 z0VarA2 = dr.v1.a("mediation_network_name", networkName);
        String networkSdkVersion = mediatedAdapterInfoB.getNetworkSdkVersion();
        if (networkSdkVersion != null) {
            str = networkSdkVersion;
        }
        return fr.n1.W(z0VarA, z0VarA2, dr.v1.a("mediation_network_sdk_version", str));
    }
}
