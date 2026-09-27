package com.yandex.div.storage.templates;

import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.TemplateParsingEnvironment;
import dr.i0;
import dr.k0;
import ds.a;
import kotlin.jvm.internal.o0;
import mq.m7;
import mq.rm;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class DivParsingHistogramProxy {

    @l
    private final i0 reporter$delegate;

    /* JADX INFO: renamed from: com.yandex.div.storage.templates.DivParsingHistogramProxy$createDivData$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class AnonymousClass1 extends o0 implements a<m7> {
        final /* synthetic */ ParsingEnvironment $env;
        final /* synthetic */ JSONObject $json;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            super(0);
            this.$env = parsingEnvironment;
            this.$json = jSONObject;
        }

        @Override // ds.a
        @l
        public final m7 invoke() {
            return m7.f111782j.a(this.$env, this.$json);
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.storage.templates.DivParsingHistogramProxy$parseTemplatesWithResultsAndDependencies$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C48971 extends o0 implements a<TemplateParsingEnvironment.TemplateParsingResult<rm>> {
        final /* synthetic */ DivParsingEnvironment $env;
        final /* synthetic */ JSONObject $templates;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48971(DivParsingEnvironment divParsingEnvironment, JSONObject jSONObject) {
            super(0);
            this.$env = divParsingEnvironment;
            this.$templates = jSONObject;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // ds.a
        @l
        public final TemplateParsingEnvironment.TemplateParsingResult<rm> invoke() {
            return this.$env.parseTemplatesWithResultAndDependencies(this.$templates);
        }
    }

    public DivParsingHistogramProxy(@l a<? extends DivParsingHistogramReporter> aVar) {
        this.reporter$delegate = k0.b(aVar);
    }

    private DivParsingHistogramReporter getReporter() {
        return (DivParsingHistogramReporter) this.reporter$delegate.getValue();
    }

    @l
    public m7 createDivData(@l ParsingEnvironment parsingEnvironment, @l JSONObject jSONObject, @m String str) {
        return (m7) getReporter().measureDataParsing(jSONObject, str, new AnonymousClass1(parsingEnvironment, jSONObject));
    }

    @l
    public TemplateParsingEnvironment.TemplateParsingResult<rm> parseTemplatesWithResultsAndDependencies(@l DivParsingEnvironment divParsingEnvironment, @l JSONObject jSONObject, @m String str) {
        return (TemplateParsingEnvironment.TemplateParsingResult) getReporter().measureTemplatesParsing(jSONObject, str, new C48971(divParsingEnvironment, jSONObject));
    }
}
