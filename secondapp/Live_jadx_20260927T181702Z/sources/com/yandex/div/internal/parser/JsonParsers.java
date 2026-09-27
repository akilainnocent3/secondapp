package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class JsonParsers {

    @NonNull
    private static final ValueValidator<?> ALWAYS_VALID = new ValueValidator() { // from class: com.yandex.div.internal.parser.i
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return JsonParsers.d(obj);
        }
    };

    @NonNull
    private static final ValueValidator<String> ALWAYS_VALID_STRING = new ValueValidator() { // from class: com.yandex.div.internal.parser.j
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return JsonParsers.a((String) obj);
        }
    };

    @NonNull
    private static final ListValidator<?> ALWAYS_VALID_LIST = new ListValidator() { // from class: com.yandex.div.internal.parser.k
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            return JsonParsers.c(list);
        }
    };

    @NonNull
    private static final ds.l<?, ?> AS_IS = new ds.l() { // from class: com.yandex.div.internal.parser.l
        @Override // ds.l
        public final Object invoke(Object obj) {
            return JsonParsers.b(obj);
        }
    };

    private JsonParsers() {
    }

    public static /* synthetic */ boolean a(String str) {
        return true;
    }

    @NonNull
    public static <T> ValueValidator<T> alwaysValid() {
        return (ValueValidator<T>) ALWAYS_VALID;
    }

    @NonNull
    public static <T> ListValidator<T> alwaysValidList() {
        return (ListValidator<T>) ALWAYS_VALID_LIST;
    }

    @NonNull
    public static ValueValidator<String> alwaysValidString() {
        return ALWAYS_VALID_STRING;
    }

    public static /* synthetic */ boolean c(List list) {
        return true;
    }

    public static /* synthetic */ boolean d(Object obj) {
        return true;
    }

    @NonNull
    public static <T> ds.l<T, T> doNotConvert() {
        return (ds.l<T, T>) AS_IS;
    }

    public static /* synthetic */ Object b(Object obj) {
        return obj;
    }
}
