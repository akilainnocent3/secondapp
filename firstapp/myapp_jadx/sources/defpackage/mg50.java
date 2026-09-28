package defpackage;

import java.util.Objects;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class mg50 implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        e21 e21Var = (e21) obj;
        boolean z = false;
        if (!e21Var.getKey().isEmpty()) {
            String key = e21Var.getKey();
            if (key.length() <= 255) {
                for (int i = 0; i < key.length(); i++) {
                    char cCharAt = key.charAt(i);
                    if (cCharAt >= ' ' && cCharAt <= '~') {
                    }
                }
                z = true;
            }
        }
        r910.a("Attribute key should be a ASCII string with a length greater than 0 and not exceed 255 characters.", z);
        Objects.requireNonNull(obj2, "Attribute value should be a ASCII string with a length not exceed 255 characters.");
    }
}
