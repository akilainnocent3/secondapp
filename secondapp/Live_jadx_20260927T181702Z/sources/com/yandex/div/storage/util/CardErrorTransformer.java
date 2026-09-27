package com.yandex.div.storage.util;

import fr.n1;
import java.util.Map;
import kotlin.jvm.internal.x;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface CardErrorTransformer {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Composite implements CardErrorTransformer {

        @l
        private final CardErrorTransformer[] transformers;

        public Composite(@l CardErrorTransformer... cardErrorTransformerArr) {
            this.transformers = cardErrorTransformerArr;
        }

        @Override // com.yandex.div.storage.util.CardErrorTransformer
        public boolean tryTransformAndLog(@l CardDetailedErrorException cardDetailedErrorException) {
            for (CardErrorTransformer cardErrorTransformer : this.transformers) {
                if (cardErrorTransformer.tryTransformAndLog(cardDetailedErrorException)) {
                    return true;
                }
            }
            return false;
        }
    }

    boolean tryTransformAndLog(@l CardDetailedErrorException cardDetailedErrorException);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class CardDetailedErrorException extends Exception {

        @l
        private final String cardId;

        @l
        private final Map<String, String> details;

        @l
        private final String groupId;

        @m
        private final JSONObject metadata;

        @m
        private final String templateId;

        public /* synthetic */ CardDetailedErrorException(String str, String str2, Throwable th2, String str3, Map map, String str4, JSONObject jSONObject, int i10, x xVar) {
            this(str, str2, (i10 & 4) != 0 ? null : th2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? n1.z() : map, str4, jSONObject);
        }

        @l
        public final String getCardId() {
            return this.cardId;
        }

        @l
        public final Map<String, String> getDetails() {
            return this.details;
        }

        @l
        public final String getGroupId$div_storage_release() {
            return this.groupId;
        }

        @m
        public final JSONObject getMetadata() {
            return this.metadata;
        }

        @m
        public final String getTemplateId() {
            return this.templateId;
        }

        public CardDetailedErrorException(@l String str, @m String str2, @m Throwable th2, @m String str3, @l Map<String, String> map, @l String str4, @m JSONObject jSONObject) {
            super(str2, th2);
            this.cardId = str;
            this.templateId = str3;
            this.details = map;
            this.groupId = str4;
            this.metadata = jSONObject;
        }
    }
}
