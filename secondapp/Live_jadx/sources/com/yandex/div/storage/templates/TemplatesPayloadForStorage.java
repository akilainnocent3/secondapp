package com.yandex.div.storage.templates;

import java.util.Map;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface TemplatesPayloadForStorage {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class AllCardsInvalid implements TemplatesPayloadForStorage {

        @l
        public static final AllCardsInvalid INSTANCE = new AllCardsInvalid();

        private AllCardsInvalid() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Empty implements TemplatesPayloadForStorage {

        @l
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Filled implements TemplatesPayloadForStorage {
        private final boolean extendExistingTemplates;

        @l
        private final String source;

        @l
        private final Map<String, byte[]> templates;

        public Filled(@l String str, boolean z10, @l Map<String, byte[]> map) {
            this.source = str;
            this.extendExistingTemplates = z10;
            this.templates = map;
        }

        public final boolean getExtendExistingTemplates() {
            return this.extendExistingTemplates;
        }

        @l
        public final String getSource() {
            return this.source;
        }

        @l
        public final Map<String, byte[]> getTemplates() {
            return this.templates;
        }
    }
}
