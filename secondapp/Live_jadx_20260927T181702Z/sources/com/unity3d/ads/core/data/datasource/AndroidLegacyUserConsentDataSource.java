package com.unity3d.ads.core.data.datasource;

import androidx.media3.session.fe;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.services.core.misc.JsonFlattener;
import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.m0;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class AndroidLegacyUserConsentDataSource implements LegacyUserConsentDataSource {

    @l
    private final FlattenerRulesUseCase flattenerRulesUseCase;

    @l
    private final JsonStorage privateStorage;

    public AndroidLegacyUserConsentDataSource(@l FlattenerRulesUseCase flattenerRulesUseCase, @l JsonStorage privateStorage) {
        m0.p(flattenerRulesUseCase, "flattenerRulesUseCase");
        m0.p(privateStorage, "privateStorage");
        this.flattenerRulesUseCase = flattenerRulesUseCase;
        this.privateStorage = privateStorage;
    }

    @Override // com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource
    @m
    public String getPrivacyData() {
        JSONObject jSONObjectFlattenJson;
        JSONObject data = this.privateStorage.getData();
        if (data == null || (jSONObjectFlattenJson = new JsonFlattener(data).flattenJson(fe.F, this.flattenerRulesUseCase.invoke())) == null) {
            return null;
        }
        return jSONObjectFlattenJson.toString();
    }
}
