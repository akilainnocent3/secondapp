package com.facebook.ads.redexgen.core;

import java.util.Collection;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3106kJ implements InterfaceC2155Mw {
    public final /* synthetic */ C2900gi A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C3106kJ(JSONObject jSONObject, C2900gi c2900gi, String str) {
        this.A02 = jSONObject;
        this.A00 = c2900gi;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2155Mw
    public final String A7O() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2155Mw
    public final Collection<String> A7p() {
        return AbstractC2156Mx.A03(this.A00, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2155Mw
    public final EnumC2154Mv A8K() {
        return AbstractC2156Mx.A00(this.A02);
    }
}
