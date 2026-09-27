package com.yandex.div.evaluable;

import com.yandex.div.evaluable.internal.Token;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.DateTime;
import com.yandex.div.evaluable.types.Url;
import dr.e0;
import fr.r0;
import gi.j;
import java.util.List;
import kj.e;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s1;
import org.json.JSONArray;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@s1({"SMAP\nEvaluableException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EvaluableException.kt\ncom/yandex/div/evaluable/EvaluableExceptionKt\n+ 2 EvaluableType.kt\ncom/yandex/div/evaluable/EvaluableType$Companion\n*L\n1#1,108:1\n30#2,12:109\n30#2,12:121\n*S KotlinDebug\n*F\n+ 1 EvaluableException.kt\ncom/yandex/div/evaluable/EvaluableExceptionKt\n*L\n84#1:109,12\n86#1:121,12\n*E\n"})
public final class EvaluableExceptionKt {

    @l
    public static final String REASON_CONVERT_TO_BOOLEAN = "Unable to convert value to Boolean.";

    @l
    public static final String REASON_CONVERT_TO_COLOR = "Unable to convert value to Color, expected format #AARRGGBB.";

    @l
    public static final String REASON_CONVERT_TO_INTEGER = "Unable to convert value to Integer.";

    @l
    public static final String REASON_CONVERT_TO_NUMBER = "Unable to convert value to Number.";

    @l
    public static final String REASON_CONVERT_TO_URL = "Unable to convert value to Url.";

    @l
    public static final String REASON_DIVISION_BY_ZERO = "Division by zero is not supported.";

    @l
    public static final String REASON_EMPTY_ARGUMENT_LIST = "Function requires non empty argument list.";

    @l
    public static final String REASON_INDEXES_ORDER = "Indexes should be in ascending order.";

    @l
    public static final String REASON_INTEGER_OVERFLOW = "Integer overflow.";

    @l
    public static final String REASON_OUT_OF_BOUNDS = "Indexes are out of bounds.";

    @l
    public static final String REASON_OUT_OF_RANGE = "Value out of range 0..1.";

    /* JADX INFO: renamed from: com.yandex.div.evaluable.EvaluableExceptionKt$functionToMessageFormat$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class AnonymousClass1 extends o0 implements ds.l<Object, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // ds.l
        @l
        public final CharSequence invoke(@l Object it) {
            m0.p(it, "it");
            return EvaluableExceptionKt.toMessageFormat(it);
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.evaluable.EvaluableExceptionKt$toMessageFormat$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C48491 extends o0 implements ds.l<Object, CharSequence> {
        public static final C48491 INSTANCE = new C48491();

        public C48491() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // ds.l
        @l
        public final CharSequence invoke(@l Object it) {
            m0.p(it, "it");
            return EvaluableExceptionKt.toMessageFormat(it);
        }
    }

    @l
    public static final String functionToMessageFormat(@l String name, @l List<? extends Object> args) {
        m0.p(name, "name");
        m0.p(args, "args");
        return r0.r3(args, null, name + '(', j.f86771d, 0, null, AnonymousClass1.INSTANCE, 25, null);
    }

    @l
    public static final String methodToMessageFormat(@l String name, @l List<? extends Object> args) {
        m0.p(name, "name");
        m0.p(args, "args");
        if (args.size() <= 1) {
            return name + "()";
        }
        return r0.r3(args.subList(1, args.size()), ",", name + '(', j.f86771d, 0, null, null, 56, null);
    }

    @l
    public static final Void throwExceptionOnEvaluationFailed(@l String expression, @l String reason, @m Exception exc) {
        m0.p(expression, "expression");
        m0.p(reason, "reason");
        throw new EvaluableException("Failed to evaluate [" + expression + "]. " + reason, exc);
    }

    public static /* synthetic */ Void throwExceptionOnEvaluationFailed$default(String str, String str2, Exception exc, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            exc = null;
        }
        return throwExceptionOnEvaluationFailed(str, str2, exc);
    }

    @l
    public static final Void throwExceptionOnFunctionEvaluationFailed(@l String name, @l List<? extends Object> args, @l String reason, @m Exception exc) {
        m0.p(name, "name");
        m0.p(args, "args");
        m0.p(reason, "reason");
        throwExceptionOnEvaluationFailed(functionToMessageFormat(name, args), reason, exc);
        throw new e0();
    }

    public static /* synthetic */ Void throwExceptionOnFunctionEvaluationFailed$default(String str, List list, String str2, Exception exc, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            exc = null;
        }
        return throwExceptionOnFunctionEvaluationFailed(str, list, str2, exc);
    }

    @l
    public static final Void throwExceptionOnMethodEvaluationFailed(@l String name, @l List<? extends Object> args, @l String reason, @m Exception exc) {
        m0.p(name, "name");
        m0.p(args, "args");
        m0.p(reason, "reason");
        throwExceptionOnEvaluationFailed(methodToMessageFormat(name, args), reason, exc);
        throw new e0();
    }

    public static /* synthetic */ Void throwExceptionOnMethodEvaluationFailed$default(String str, List list, String str2, Exception exc, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            exc = null;
        }
        return throwExceptionOnMethodEvaluationFailed(str, list, str2, exc);
    }

    @l
    public static final String toMessageFormat(@l List<? extends Object> list) {
        m0.p(list, "<this>");
        return r0.r3(list, ", ", null, null, 0, null, C48491.INSTANCE, 30, null);
    }

    @l
    public static final Void throwExceptionOnEvaluationFailed(@l Token.Operator.Binary operator, @l Object left, @l Object right) {
        EvaluableType evaluableType;
        String string;
        EvaluableType evaluableType2;
        EvaluableType evaluableType3;
        m0.p(operator, "operator");
        m0.p(left, "left");
        m0.p(right, "right");
        String str = toMessageFormat(left) + ' ' + operator + ' ' + toMessageFormat(right);
        if (m0.g(left.getClass(), right.getClass())) {
            StringBuilder sb2 = new StringBuilder();
            EvaluableType.Companion companion = EvaluableType.Companion;
            if (left instanceof Long) {
                evaluableType = EvaluableType.INTEGER;
            } else if (left instanceof Double) {
                evaluableType = EvaluableType.NUMBER;
            } else if (left instanceof Boolean) {
                evaluableType = EvaluableType.BOOLEAN;
            } else if (left instanceof String) {
                evaluableType = EvaluableType.STRING;
            } else if (left instanceof DateTime) {
                evaluableType = EvaluableType.DATETIME;
            } else if (left instanceof Color) {
                evaluableType = EvaluableType.COLOR;
            } else if (left instanceof Url) {
                evaluableType = EvaluableType.URL;
            } else if (left instanceof JSONObject) {
                evaluableType = EvaluableType.DICT;
            } else {
                if (!(left instanceof JSONArray)) {
                    throw new EvaluableException("Unable to find type for " + left.getClass().getName(), null, 2, null);
                }
                evaluableType = EvaluableType.ARRAY;
            }
            sb2.append(evaluableType.getTypeName$div_evaluable());
            sb2.append(" type");
            string = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("different types: ");
            EvaluableType.Companion companion2 = EvaluableType.Companion;
            if (left instanceof Long) {
                evaluableType2 = EvaluableType.INTEGER;
            } else if (left instanceof Double) {
                evaluableType2 = EvaluableType.NUMBER;
            } else if (left instanceof Boolean) {
                evaluableType2 = EvaluableType.BOOLEAN;
            } else if (left instanceof String) {
                evaluableType2 = EvaluableType.STRING;
            } else if (left instanceof DateTime) {
                evaluableType2 = EvaluableType.DATETIME;
            } else if (left instanceof Color) {
                evaluableType2 = EvaluableType.COLOR;
            } else if (left instanceof Url) {
                evaluableType2 = EvaluableType.URL;
            } else if (left instanceof JSONObject) {
                evaluableType2 = EvaluableType.DICT;
            } else {
                if (!(left instanceof JSONArray)) {
                    throw new EvaluableException("Unable to find type for " + left.getClass().getName(), null, 2, null);
                }
                evaluableType2 = EvaluableType.ARRAY;
            }
            sb3.append(evaluableType2.getTypeName$div_evaluable());
            sb3.append(" and ");
            if (right instanceof Long) {
                evaluableType3 = EvaluableType.INTEGER;
            } else if (right instanceof Double) {
                evaluableType3 = EvaluableType.NUMBER;
            } else if (right instanceof Boolean) {
                evaluableType3 = EvaluableType.BOOLEAN;
            } else if (right instanceof String) {
                evaluableType3 = EvaluableType.STRING;
            } else if (right instanceof DateTime) {
                evaluableType3 = EvaluableType.DATETIME;
            } else if (right instanceof Color) {
                evaluableType3 = EvaluableType.COLOR;
            } else if (right instanceof Url) {
                evaluableType3 = EvaluableType.URL;
            } else if (right instanceof JSONObject) {
                evaluableType3 = EvaluableType.DICT;
            } else {
                if (!(right instanceof JSONArray)) {
                    throw new EvaluableException("Unable to find type for " + right.getClass().getName(), null, 2, null);
                }
                evaluableType3 = EvaluableType.ARRAY;
            }
            sb3.append(evaluableType3.getTypeName$div_evaluable());
            string = sb3.toString();
        }
        throwExceptionOnEvaluationFailed$default(str, "Operator '" + operator + "' cannot be applied to " + string + e.f102543c, null, 4, null);
        throw new e0();
    }

    @l
    public static final String toMessageFormat(@l Object obj) {
        m0.p(obj, "<this>");
        if (obj instanceof JSONArray) {
            return "<array>";
        }
        if (obj instanceof JSONObject) {
            return "<dict>";
        }
        if (!(obj instanceof String)) {
            return obj.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('\'');
        sb2.append(obj);
        sb2.append('\'');
        return sb2.toString();
    }
}
