package com.yandex.div.histogram;

import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
final class DefaultDivParsingHistogramReporter implements DivParsingHistogramReporter {
    @Override // com.yandex.div.histogram.DivParsingHistogramReporter
    public <D> D measureDataParsing(@l JSONObject jSONObject, @m String str, @l ds.a<? extends D> aVar) {
        return aVar.invoke();
    }

    @Override // com.yandex.div.histogram.DivParsingHistogramReporter
    @l
    public JSONObject measureJsonParsing(@m String str, @l ds.a<? extends JSONObject> aVar) {
        return aVar.invoke();
    }

    @Override // com.yandex.div.histogram.DivParsingHistogramReporter
    public <T> T measureTemplatesParsing(@l JSONObject jSONObject, @m String str, @l ds.a<? extends T> aVar) {
        return aVar.invoke();
    }
}
