package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.ConstantExpressionList;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.MutableExpressionList;
import ds.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.m0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class JsonParser {

    @NonNull
    private static final ValueValidator<?> ALWAYS_VALID = new ValueValidator() { // from class: com.yandex.div.internal.parser.b
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return JsonParser.b(obj);
        }
    };

    @NonNull
    private static final ValueValidator<String> ALWAYS_VALID_STRING = new ValueValidator() { // from class: com.yandex.div.internal.parser.c
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return JsonParser.d((String) obj);
        }
    };

    @NonNull
    private static final ListValidator<?> ALWAYS_VALID_LIST = new ListValidator() { // from class: com.yandex.div.internal.parser.d
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            return JsonParser.c(list);
        }
    };

    @NonNull
    private static final ds.l<?, ?> AS_IS = new ds.l() { // from class: com.yandex.div.internal.parser.e
        @Override // ds.l
        public final Object invoke(Object obj) {
            return JsonParser.a(obj);
        }
    };
    private static final ExpressionList<?> EMPTY_EXPRESSION_LIST = new ConstantExpressionList(Collections.EMPTY_LIST);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface ErrorHandler {
        public static final ErrorHandler FAIL_FAST = new ErrorHandler() { // from class: com.yandex.div.internal.parser.f
            @Override // com.yandex.div.internal.parser.JsonParser.ErrorHandler
            public final void process(ParsingException parsingException) {
                h.a(parsingException);
            }
        };
        public static final ErrorHandler IGNORE = new ErrorHandler() { // from class: com.yandex.div.internal.parser.g
            @Override // com.yandex.div.internal.parser.JsonParser.ErrorHandler
            public final void process(ParsingException parsingException) {
                h.b(parsingException);
            }
        };

        void process(ParsingException parsingException);
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

    public static /* synthetic */ boolean b(Object obj) {
        return true;
    }

    public static /* synthetic */ boolean c(List list) {
        return true;
    }

    public static /* synthetic */ boolean d(String str) {
        return true;
    }

    @NonNull
    public static <T> ds.l<T, T> doNotConvert() {
        return (ds.l<T, T>) AS_IS;
    }

    @Nullable
    private static <T> T optSafe(@Nullable T t10) {
        if (t10 == null || t10 == JSONObject.NULL) {
            return null;
        }
        return t10;
    }

    @NonNull
    public static <T> T read(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return (T) read(jSONObject, str, doNotConvert(), valueValidator, parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <T> Expression<T> readExpression(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readExpression(jSONObject, str, doNotConvert(), alwaysValid(), parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @NonNull
    public static ExpressionList<String> readExpressionList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ListValidator<String> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<String> typeHelper) {
        return readExpressionList(jSONObject, str, doNotConvert(), listValidator, ALWAYS_VALID_STRING, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @NonNull
    public static <T> List<T> readList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull p<ParsingEnvironment, JSONObject, T> pVar, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readList(jSONObject, str, pVar, alwaysValidList(), alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @Nullable
    public static <T> T readOptional(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return (T) readOptional(jSONObject, str, doNotConvert(), valueValidator, parsingErrorLogger, parsingEnvironment);
    }

    @Nullable
    public static <T> Expression<T> readOptionalExpression(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readOptionalExpression(jSONObject, str, doNotConvert(), valueValidator, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @Nullable
    public static <T> ExpressionList<T> readOptionalExpressionList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readOptionalExpressionList(jSONObject, str, doNotConvert(), listValidator, valueValidator, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @Nullable
    public static <R, T> List<T> readOptionalList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull p<ParsingEnvironment, R, T> pVar, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readOptionalList(jSONObject, str, pVar, alwaysValidList(), alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @Nullable
    private static Object optSafe(JSONObject jSONObject, String str) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt == null || objOpt == JSONObject.NULL) {
            return null;
        }
        return objOpt;
    }

    @NonNull
    public static <T> T read(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return (T) read(jSONObject, str, doNotConvert(), alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <T> Expression<T> readExpression(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readExpression(jSONObject, str, doNotConvert(), valueValidator, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @NonNull
    public static ExpressionList<String> readExpressionList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ListValidator<String> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readExpressionList(jSONObject, str, doNotConvert(), listValidator, ALWAYS_VALID_STRING, parsingErrorLogger, parsingEnvironment, TypeHelpersKt.TYPE_HELPER_STRING);
    }

    @NonNull
    public static <T> List<T> readList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull p<ParsingEnvironment, JSONObject, T> pVar, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readList(jSONObject, str, pVar, listValidator, alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @Nullable
    public static <T> T readOptional(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return (T) readOptional(jSONObject, str, doNotConvert(), alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @Nullable
    public static <T> Expression<T> readOptionalExpression(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @Nullable Expression<T> expression, @NonNull TypeHelper<T> typeHelper) {
        return readOptionalExpression(jSONObject, str, doNotConvert(), alwaysValid(), parsingErrorLogger, parsingEnvironment, expression, typeHelper);
    }

    @Nullable
    public static <R, T> ExpressionList<T> readOptionalExpressionList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ds.l<R, T> lVar, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readExpressionList(jSONObject, str, lVar, listValidator, valueValidator, parsingErrorLogger, parsingEnvironment, typeHelper, ErrorHandler.IGNORE);
    }

    @Nullable
    public static <R, T> List<T> readOptionalList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull p<ParsingEnvironment, R, T> pVar, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readOptionalList(jSONObject, str, pVar, listValidator, alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <R, T> T read(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ds.l<R, T> lVar, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return (T) read(jSONObject, str, lVar, alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <R, T> Expression<T> readExpression(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ds.l<R, T> lVar, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readExpression(jSONObject, str, lVar, alwaysValid(), parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @NonNull
    public static <R, T> ExpressionList<T> readExpressionList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ds.l<R, T> lVar, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readExpressionList(jSONObject, str, lVar, listValidator, alwaysValid(), parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @NonNull
    public static <T> List<T> readList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull p<ParsingEnvironment, JSONObject, T> pVar, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            if (length == 0) {
                List<T> list = Collections.EMPTY_LIST;
                try {
                    if (!listValidator.isValid(list)) {
                        parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, list));
                    }
                    return list;
                } catch (ClassCastException unused) {
                    parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, list));
                    return list;
                }
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = (JSONObject) optSafe(jSONArrayOptJSONArray.optJSONObject(i10));
                if (jSONObject2 != null) {
                    try {
                        T tInvoke = pVar.invoke(parsingEnvironment, jSONObject2);
                        if (tInvoke != null) {
                            try {
                                if (!valueValidator.isValid(tInvoke)) {
                                    parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONArrayOptJSONArray, str, i10, tInvoke));
                                } else {
                                    arrayList.add(tInvoke);
                                }
                            } catch (ClassCastException unused2) {
                                parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONArrayOptJSONArray, str, i10, tInvoke));
                            }
                        }
                    } catch (ClassCastException unused3) {
                        parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONArrayOptJSONArray, str, i10, jSONObject2));
                    } catch (Exception e10) {
                        parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONArrayOptJSONArray, str, i10, jSONObject2, e10));
                    }
                }
            }
            try {
                if (listValidator.isValid(arrayList)) {
                    return arrayList;
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, arrayList);
            } catch (ClassCastException unused4) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList);
            }
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    @Nullable
    public static <R, T> T readOptional(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ds.l<R, T> lVar, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return (T) readOptional(jSONObject, str, lVar, alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @Nullable
    public static Expression<String> readOptionalExpression(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<String> typeHelper) {
        return readOptionalExpression(jSONObject, str, doNotConvert(), ALWAYS_VALID_STRING, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @Nullable
    public static <R, T> List<T> readOptionalList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ds.l<R, T> lVar, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readOptionalList(jSONObject, str, lVar, alwaysValidList(), alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <T> T read(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull p<ParsingEnvironment, JSONObject, T> pVar, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return (T) read(jSONObject, str, pVar, alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static <R, T> Expression<T> readExpression(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ds.l<R, T> lVar, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        Object objOptSafe = optSafe(jSONObject, str);
        if (objOptSafe != null) {
            if (Expression.mayBeExpression(objOptSafe)) {
                return new Expression.MutableExpression(str, objOptSafe.toString(), lVar, valueValidator, parsingErrorLogger, typeHelper, null);
            }
            try {
                T tInvoke = lVar.invoke(objOptSafe);
                if (tInvoke != null) {
                    if (typeHelper.isTypeValid(tInvoke)) {
                        try {
                            if (valueValidator.isValid(tInvoke)) {
                                return Expression.constant(tInvoke, parsingErrorLogger);
                            }
                            throw ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe);
                        } catch (ClassCastException unused) {
                            throw ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe);
                        }
                    }
                    throw ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe);
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe);
            } catch (ClassCastException unused2) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe);
            } catch (Exception e10) {
                throw ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe, e10);
            }
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    @NonNull
    public static <T> ExpressionList<T> readExpressionList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readExpressionList(jSONObject, str, doNotConvert(), listValidator, valueValidator, parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @Nullable
    public static <T extends JSONSerializable> T readOptional(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull p<ParsingEnvironment, JSONObject, T> pVar, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        try {
            return pVar.invoke(parsingEnvironment, jSONObjectOptJSONObject);
        } catch (ParsingException e10) {
            parsingErrorLogger.logError(e10);
            return null;
        }
    }

    @Nullable
    public static <R, T> Expression<T> readOptionalExpression(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ds.l<R, T> lVar, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readOptionalExpression(jSONObject, str, lVar, alwaysValid(), parsingErrorLogger, parsingEnvironment, typeHelper);
    }

    @Nullable
    public static <R, T> List<T> readOptionalList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ds.l<R, T> lVar, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readOptionalList(jSONObject, str, lVar, listValidator, alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <T> T read(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull p<ParsingEnvironment, JSONObject, T> pVar, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            try {
                T tInvoke = pVar.invoke(parsingEnvironment, jSONObjectOptJSONObject);
                if (tInvoke != null) {
                    try {
                        if (valueValidator.isValid(tInvoke)) {
                            return tInvoke;
                        }
                        throw ParsingExceptionKt.invalidValue(jSONObject, str, tInvoke);
                    } catch (ClassCastException unused) {
                        throw ParsingExceptionKt.typeMismatch(jSONObject, str, tInvoke);
                    }
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, (Object) null);
            } catch (ParsingException e10) {
                throw ParsingExceptionKt.dependencyFailed(jSONObject, str, e10);
            }
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    @NonNull
    public static <R, T> ExpressionList<T> readExpressionList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ds.l<R, T> lVar, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        ExpressionList<T> expressionList = readExpressionList(jSONObject, str, lVar, listValidator, valueValidator, parsingErrorLogger, parsingEnvironment, typeHelper, ErrorHandler.FAIL_FAST);
        if (expressionList != null) {
            return expressionList;
        }
        throw ParsingExceptionKt.invalidValue(str, jSONObject);
    }

    @Nullable
    public static <R, T> Expression<T> readOptionalExpression(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ds.l<R, T> lVar, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper) {
        return readOptionalExpression(jSONObject, str, lVar, valueValidator, parsingErrorLogger, parsingEnvironment, null, typeHelper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, T> List<T> readOptionalList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ds.l<R, T> lVar, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            List<T> list = Collections.EMPTY_LIST;
            try {
                if (listValidator.isValid(list)) {
                    return list;
                }
                parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, list));
                return null;
            } catch (ClassCastException unused) {
                parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, list));
                return null;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            Object objOpt = jSONArrayOptJSONArray.opt(i10);
            if (m0.g(objOpt, JSONObject.NULL)) {
                objOpt = null;
            }
            if (objOpt != null) {
                try {
                    T tInvoke = lVar.invoke(objOpt);
                    if (tInvoke != null) {
                        try {
                            if (!valueValidator.isValid(tInvoke)) {
                                parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONArrayOptJSONArray, str, i10, tInvoke));
                            } else {
                                arrayList.add(tInvoke);
                            }
                        } catch (ClassCastException unused2) {
                            parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONArrayOptJSONArray, str, i10, tInvoke));
                        }
                    }
                } catch (ClassCastException unused3) {
                    parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONArrayOptJSONArray, str, i10, objOpt));
                } catch (Exception e10) {
                    parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONArrayOptJSONArray, str, i10, objOpt, e10));
                }
            }
        }
        try {
            if (listValidator.isValid(arrayList)) {
                return arrayList;
            }
            parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList));
            return null;
        } catch (ClassCastException unused4) {
            parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList));
            return null;
        }
    }

    @Nullable
    public static <R, T> Expression<T> readOptionalExpression(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ds.l<R, T> lVar, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @Nullable Expression<T> expression, @NonNull TypeHelper<T> typeHelper) {
        return readOptionalExpression(jSONObject, str, lVar, alwaysValid(), parsingErrorLogger, parsingEnvironment, expression, typeHelper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    private static <R, T> ExpressionList readExpressionList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ds.l<R, T> lVar, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @NonNull TypeHelper<T> typeHelper, @NonNull ErrorHandler errorHandler) {
        ArrayList arrayList;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        ExpressionList expressionList = null;
        if (jSONArrayOptJSONArray == null) {
            errorHandler.process(ParsingExceptionKt.missingValue(jSONObject, str));
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            List<? extends T> list = Collections.EMPTY_LIST;
            try {
                if (!listValidator.isValid(list)) {
                    parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, list));
                    return EMPTY_EXPRESSION_LIST;
                }
                return EMPTY_EXPRESSION_LIST;
            } catch (ClassCastException unused) {
                parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, list));
                return EMPTY_EXPRESSION_LIST;
            }
        }
        ArrayList arrayList2 = new ArrayList(length);
        int i10 = 0;
        boolean z10 = false;
        while (i10 < length) {
            Object objOptSafe = optSafe(jSONArrayOptJSONArray.opt(i10));
            if (objOptSafe == null) {
                arrayList = arrayList2;
            } else {
                if (Expression.mayBeExpression(objOptSafe)) {
                    arrayList = arrayList2;
                    arrayList.add(new Expression.MutableExpression(str + C4235d4.j.f61460d + i10 + C4235d4.j.f61462e, objOptSafe.toString(), lVar, valueValidator, parsingErrorLogger, typeHelper, null));
                    z10 = true;
                } else {
                    expressionList = expressionList;
                    length = length;
                    arrayList = arrayList2;
                    i10 = i10;
                    try {
                        T tInvoke = lVar.invoke(objOptSafe);
                        if (tInvoke != null) {
                            if (!typeHelper.isTypeValid(tInvoke)) {
                                parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONArrayOptJSONArray, str, i10, objOptSafe));
                            } else {
                                try {
                                    if (!valueValidator.isValid(tInvoke)) {
                                        parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONArrayOptJSONArray, str, i10, tInvoke));
                                    } else {
                                        arrayList.add(tInvoke);
                                    }
                                } catch (ClassCastException unused2) {
                                    parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONArrayOptJSONArray, str, i10, tInvoke));
                                }
                            }
                        }
                    } catch (ClassCastException unused3) {
                        parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONArrayOptJSONArray, str, i10, objOptSafe));
                    } catch (Exception e10) {
                        parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONArrayOptJSONArray, str, i10, objOptSafe, e10));
                    }
                }
                i10++;
                arrayList2 = arrayList;
                expressionList = expressionList;
                length = length;
            }
            i10++;
            arrayList2 = arrayList;
            expressionList = expressionList;
            length = length;
        }
        ExpressionList expressionList2 = expressionList;
        ArrayList arrayList3 = arrayList2;
        if (z10) {
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                Object obj = arrayList3.get(i11);
                if (!(obj instanceof Expression)) {
                    arrayList3.set(i11, Expression.constant(obj, parsingErrorLogger));
                }
            }
            return new MutableExpressionList(str, arrayList3, listValidator, parsingEnvironment.getLogger());
        }
        try {
            if (!listValidator.isValid(arrayList3)) {
                errorHandler.process(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList3));
                return expressionList2;
            }
            return new ConstantExpressionList(arrayList3);
        } catch (ClassCastException unused4) {
            errorHandler.process(ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList3));
            return expressionList2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, T> T readOptional(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ds.l<R, T> lVar, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        Object objOptSafe = optSafe(jSONObject, str);
        if (objOptSafe == null) {
            return null;
        }
        try {
            T t10 = (T) lVar.invoke(objOptSafe);
            if (t10 == null) {
                parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe));
                return null;
            }
            try {
                if (valueValidator.isValid(t10)) {
                    return t10;
                }
                parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe));
                return null;
            } catch (ClassCastException unused) {
                parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe));
                return null;
            }
        } catch (ClassCastException unused2) {
            parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe));
            return null;
        } catch (Exception e10) {
            parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe, e10));
            return null;
        }
    }

    @Nullable
    public static <T> Expression<T> readOptionalExpression(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @Nullable Expression<T> expression, @NonNull TypeHelper<T> typeHelper) {
        return readOptionalExpression(jSONObject, str, doNotConvert(), valueValidator, parsingErrorLogger, parsingEnvironment, expression, typeHelper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, T> Expression<T> readOptionalExpression(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ds.l<R, T> lVar, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment, @Nullable Expression<T> expression, @NonNull TypeHelper<T> typeHelper) {
        Object objOptSafe = optSafe(jSONObject, str);
        if (objOptSafe == null) {
            return null;
        }
        if (Expression.mayBeExpression(objOptSafe)) {
            return new Expression.MutableExpression(str, objOptSafe.toString(), lVar, valueValidator, parsingErrorLogger, typeHelper, expression);
        }
        try {
            T tInvoke = lVar.invoke(objOptSafe);
            if (tInvoke == null) {
                parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe));
                return null;
            }
            if (!typeHelper.isTypeValid(tInvoke)) {
                parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe));
                return null;
            }
            try {
                if (!valueValidator.isValid(tInvoke)) {
                    parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe));
                    return null;
                }
                return Expression.constant(tInvoke, parsingErrorLogger);
            } catch (ClassCastException unused) {
                parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe));
                return null;
            }
        } catch (ClassCastException unused2) {
            parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe));
            return null;
        } catch (Exception e10) {
            parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe, e10));
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static <R, T> T read(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ds.l<R, T> lVar, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        Object objOptSafe = optSafe(jSONObject, str);
        if (objOptSafe != null) {
            try {
                T t10 = (T) lVar.invoke(objOptSafe);
                if (t10 != null) {
                    try {
                        if (valueValidator.isValid(t10)) {
                            return t10;
                        }
                        throw ParsingExceptionKt.invalidValue(jSONObject, str, t10);
                    } catch (ClassCastException unused) {
                        throw ParsingExceptionKt.typeMismatch(jSONObject, str, t10);
                    }
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe);
            } catch (ClassCastException unused2) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe);
            } catch (Exception e10) {
                throw ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe, e10);
            }
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    @Nullable
    public static <T> T readOptional(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull p<ParsingEnvironment, JSONObject, T> pVar, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        try {
            T tInvoke = pVar.invoke(parsingEnvironment, jSONObjectOptJSONObject);
            if (tInvoke == null) {
                parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, jSONObjectOptJSONObject));
                return null;
            }
            try {
                if (valueValidator.isValid(tInvoke)) {
                    return tInvoke;
                }
                parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, jSONObjectOptJSONObject));
                return null;
            } catch (ClassCastException unused) {
                parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, jSONObjectOptJSONObject));
                return null;
            }
        } catch (ClassCastException unused2) {
            parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, jSONObjectOptJSONObject));
            return null;
        } catch (Exception e10) {
            parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, jSONObjectOptJSONObject, e10));
            return null;
        }
    }

    @NonNull
    public static List<String> readList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ListValidator<String> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readList(jSONObject, str, doNotConvert(), listValidator, ALWAYS_VALID_STRING, parsingErrorLogger, parsingEnvironment);
    }

    @NonNull
    public static <R, T> List<T> readList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ds.l<R, T> lVar, @NonNull ListValidator<T> listValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        return readList(jSONObject, str, lVar, listValidator, alwaysValid(), parsingErrorLogger, parsingEnvironment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static <R, T> List<T> readList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull ds.l<R, T> lVar, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            if (length == 0) {
                List<T> list = Collections.EMPTY_LIST;
                try {
                    if (!listValidator.isValid(list)) {
                        parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, list));
                    }
                    return list;
                } catch (ClassCastException unused) {
                    parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, list));
                    return list;
                }
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                Object objOptSafe = optSafe(jSONArrayOptJSONArray.opt(i10));
                if (objOptSafe != null) {
                    try {
                        T tInvoke = lVar.invoke(objOptSafe);
                        if (tInvoke != null) {
                            try {
                                if (!valueValidator.isValid(tInvoke)) {
                                    parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONArrayOptJSONArray, str, i10, tInvoke));
                                } else {
                                    arrayList.add(tInvoke);
                                }
                            } catch (ClassCastException unused2) {
                                parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONArrayOptJSONArray, str, i10, tInvoke));
                            }
                        }
                    } catch (ClassCastException unused3) {
                        parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONArrayOptJSONArray, str, i10, objOptSafe));
                    } catch (Exception e10) {
                        parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONArrayOptJSONArray, str, i10, objOptSafe, e10));
                    }
                }
            }
            try {
                if (listValidator.isValid(arrayList)) {
                    return arrayList;
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, arrayList);
            } catch (ClassCastException unused4) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList);
            }
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, T> List<T> readOptionalList(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull p<ParsingEnvironment, R, T> pVar, @NonNull ListValidator<T> listValidator, @NonNull ValueValidator<T> valueValidator, @NonNull ParsingErrorLogger parsingErrorLogger, @NonNull ParsingEnvironment parsingEnvironment) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            List<T> list = Collections.EMPTY_LIST;
            try {
                if (listValidator.isValid(list)) {
                    return list;
                }
                parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, list));
                return null;
            } catch (ClassCastException unused) {
                parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, list));
                return null;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            Object objOptSafe = optSafe(jSONArrayOptJSONArray.optJSONObject(i10));
            if (objOptSafe != null) {
                try {
                    T tInvoke = pVar.invoke(parsingEnvironment, objOptSafe);
                    if (tInvoke != null) {
                        try {
                            if (!valueValidator.isValid(tInvoke)) {
                                parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONArrayOptJSONArray, str, i10, tInvoke));
                            } else {
                                arrayList.add(tInvoke);
                            }
                        } catch (ClassCastException unused2) {
                            parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONArrayOptJSONArray, str, i10, tInvoke));
                        }
                    }
                } catch (ClassCastException unused3) {
                    parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONArrayOptJSONArray, str, i10, objOptSafe));
                } catch (Exception e10) {
                    parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONArrayOptJSONArray, str, i10, objOptSafe, e10));
                }
            }
        }
        try {
            if (listValidator.isValid(arrayList)) {
                return arrayList;
            }
            parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList));
            return null;
        } catch (ClassCastException unused4) {
            parsingErrorLogger.logError(ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList));
            return null;
        }
    }

    public static /* synthetic */ Object a(Object obj) {
        return obj;
    }
}
