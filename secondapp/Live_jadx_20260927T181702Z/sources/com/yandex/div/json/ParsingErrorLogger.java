package com.yandex.div.json;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface ParsingErrorLogger {
    public static final ParsingErrorLogger LOG = new ParsingErrorLogger() { // from class: com.yandex.div.json.a
        @Override // com.yandex.div.json.ParsingErrorLogger
        public final void logError(Exception exc) {
            c.b(exc);
        }

        @Override // com.yandex.div.json.ParsingErrorLogger
        public /* synthetic */ void logTemplateError(Exception exc, String str) {
            c.a(this, exc, str);
        }
    };
    public static final ParsingErrorLogger ASSERT = new ParsingErrorLogger() { // from class: com.yandex.div.json.b
        @Override // com.yandex.div.json.ParsingErrorLogger
        public final void logError(Exception exc) {
            c.c(exc);
        }

        @Override // com.yandex.div.json.ParsingErrorLogger
        public /* synthetic */ void logTemplateError(Exception exc, String str) {
            c.a(this, exc, str);
        }
    };

    void logError(@NonNull Exception exc);

    void logTemplateError(@NonNull Exception exc, @NonNull String str);
}
