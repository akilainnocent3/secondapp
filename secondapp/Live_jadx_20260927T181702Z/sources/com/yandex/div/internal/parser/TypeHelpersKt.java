package com.yandex.div.internal.parser;

import android.net.Uri;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class TypeHelpersKt {

    @oy.l
    @cs.g
    public static final TypeHelper<Boolean> TYPE_HELPER_BOOLEAN = new TypeHelper<Boolean>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_BOOLEAN$1
        private final boolean typeDefault;

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@oy.l Object obj) {
            return obj instanceof Boolean;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.yandex.div.internal.parser.TypeHelper
        @oy.l
        public Boolean getTypeDefault() {
            return Boolean.valueOf(this.typeDefault);
        }
    };

    @oy.l
    @cs.g
    public static final TypeHelper<Long> TYPE_HELPER_INT = new TypeHelper<Long>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_INT$1
        private final long typeDefault;

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@oy.l Object obj) {
            return obj instanceof Long;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.yandex.div.internal.parser.TypeHelper
        @oy.l
        public Long getTypeDefault() {
            return Long.valueOf(this.typeDefault);
        }
    };

    @oy.l
    @cs.g
    public static final TypeHelper<String> TYPE_HELPER_STRING = new TypeHelper<String>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_STRING$1

        @oy.l
        private final String typeDefault = "";

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@oy.l Object obj) {
            return obj instanceof String;
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        @oy.l
        public String getTypeDefault() {
            return this.typeDefault;
        }
    };

    @oy.l
    @cs.g
    public static final TypeHelper<Double> TYPE_HELPER_DOUBLE = new TypeHelper<Double>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_DOUBLE$1
        private final double typeDefault;

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@oy.l Object obj) {
            return obj instanceof Double;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.yandex.div.internal.parser.TypeHelper
        @oy.l
        public Double getTypeDefault() {
            return Double.valueOf(this.typeDefault);
        }
    };

    @oy.l
    @cs.g
    public static final TypeHelper<Uri> TYPE_HELPER_URI = new TypeHelper<Uri>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_URI$1
        private final Uri typeDefault = Uri.EMPTY;

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@oy.l Object obj) {
            return obj instanceof Uri;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.yandex.div.internal.parser.TypeHelper
        public Uri getTypeDefault() {
            return this.typeDefault;
        }
    };

    @oy.l
    @cs.g
    public static final TypeHelper<Integer> TYPE_HELPER_COLOR = new TypeHelper<Integer>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_COLOR$1
        private final int typeDefault = -16777216;

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@oy.l Object obj) {
            return obj instanceof Integer;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.yandex.div.internal.parser.TypeHelper
        @oy.l
        public Integer getTypeDefault() {
            return Integer.valueOf(this.typeDefault);
        }
    };

    @oy.l
    @cs.g
    public static final TypeHelper<JSONArray> TYPE_HELPER_JSON_ARRAY = new TypeHelper<JSONArray>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_JSON_ARRAY$1

        @oy.l
        private final JSONArray typeDefault = new JSONArray();

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@oy.l Object obj) {
            return obj instanceof JSONArray;
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        @oy.l
        public JSONArray getTypeDefault() {
            return this.typeDefault;
        }
    };

    @oy.l
    @cs.g
    public static final TypeHelper<JSONObject> TYPE_HELPER_DICT = new TypeHelper<JSONObject>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_DICT$1

        @oy.l
        private final JSONObject typeDefault = new JSONObject();

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@oy.l Object obj) {
            return obj instanceof JSONObject;
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        @oy.l
        public JSONObject getTypeDefault() {
            return this.typeDefault;
        }
    };
}
