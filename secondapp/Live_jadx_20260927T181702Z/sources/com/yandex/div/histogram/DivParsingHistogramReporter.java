package com.yandex.div.histogram;

import com.yandex.div.core.annotations.PublicApi;
import dr.i0;
import dr.k0;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@PublicApi
public interface DivParsingHistogramReporter {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @l
        private static final i0<DefaultDivParsingHistogramReporter> DEFAULT$delegate = k0.b(DivParsingHistogramReporter$Companion$DEFAULT$2.INSTANCE);

        private Companion() {
        }

        @l
        public final DivParsingHistogramReporter getDEFAULT() {
            return DEFAULT$delegate.getValue();
        }
    }

    <D> D measureDataParsing(@l JSONObject jSONObject, @m String str, @l ds.a<? extends D> aVar);

    @l
    JSONObject measureJsonParsing(@m String str, @l ds.a<? extends JSONObject> aVar);

    <T> T measureTemplatesParsing(@l JSONObject jSONObject, @m String str, @l ds.a<? extends T> aVar);
}
