package qu;

import kotlin.jvm.internal.x;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'q' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class j {
    public static final j F0;
    public static final j G;
    public static final j O;
    public static final j W;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final j f122905h0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final j f122921p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final j f122922q;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final j f122937x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final j f122938y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f122942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f122943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f122896d = new j("UNRESOLVED_TYPE", 0, "Unresolved type for %s", true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f122898e = new j("UNRESOLVED_TYPE_PARAMETER_TYPE", 1, "Unresolved type parameter type", true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f122900f = new j("UNRESOLVED_CLASS_TYPE", 2, "Unresolved class %s", true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f122902g = new j("UNRESOLVED_JAVA_CLASS", 3, "Unresolved java class %s", true);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j f122904h = new j("UNRESOLVED_DECLARATION", 4, "Unresolved declaration %s", true);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j f122906i = new j("UNRESOLVED_KCLASS_CONSTANT_VALUE", 5, "Unresolved type for %s (arrayDimensions=%s)", true);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j f122908j = new j("UNRESOLVED_TYPE_ALIAS", 6, "Unresolved type alias %s", false, 2, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final j f122910k = new j("RETURN_TYPE", 7, "Return type for %s cannot be resolved", false, 2, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final j f122912l = new j("RETURN_TYPE_FOR_FUNCTION", 8, "Return type for function cannot be resolved", false, 2, null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final j f122914m = new j("RETURN_TYPE_FOR_PROPERTY", 9, "Return type for property %s cannot be resolved", false, 2, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f122916n = new j("RETURN_TYPE_FOR_CONSTRUCTOR", 10, "Return type for constructor %s cannot be resolved", false, 2, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j f122918o = new j("IMPLICIT_RETURN_TYPE_FOR_FUNCTION", 11, "Implicit return type for function %s cannot be resolved", false, 2, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final j f122920p = new j("IMPLICIT_RETURN_TYPE_FOR_PROPERTY", 12, "Implicit return type for property %s cannot be resolved", false, 2, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f122924r = new j("ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT", 14, "%s() return type", false, 2, null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final j f122926s = new j("RECURSIVE_TYPE", 15, "Recursive type", false, 2, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f122928t = new j("RECURSIVE_TYPE_ALIAS", 16, "Recursive type alias %s", false, 2, null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final j f122930u = new j("RECURSIVE_ANNOTATION_TYPE", 17, "Recursive annotation's type", false, 2, null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final j f122932v = new j("CYCLIC_UPPER_BOUNDS", 18, "Cyclic upper bounds", false, 2, null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final j f122934w = new j("CYCLIC_SUPERTYPES", 19, "Cyclic supertypes", false, 2, null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final j f122936x = new j("UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE", 20, "Cannot infer a lambda context receiver type", false, 2, null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final j f122940z = new j("UNINFERRED_TYPE_VARIABLE", 22, "Cannot infer a type variable %s", false, 2, null);
    public static final j A = new j("RESOLUTION_ERROR_TYPE", 23, "Resolution error type (%s)", false, 2, null);
    public static final j B = new j("ERROR_EXPECTED_TYPE", 24, "Error expected type", false, 2, null);
    public static final j C = new j("ERROR_DATA_FLOW_TYPE", 25, "Error type for data flow", false, 2, null);
    public static final j D = new j("ERROR_WHILE_RECONSTRUCTING_BARE_TYPE", 26, "Failed to reconstruct type %s", false, 2, null);
    public static final j E = new j("UNABLE_TO_SUBSTITUTE_TYPE", 27, "Unable to substitute type (%s)", false, 2, null);
    public static final j F = new j("DONT_CARE", 28, "Special DONT_CARE type", false, 2, null);
    public static final j H = new j("FUNCTION_PLACEHOLDER_TYPE", 30, "Function placeholder type (arguments: %s)", false, 2, null);
    public static final j I = new j("TYPE_FOR_RESULT", 31, "Stubbed 'Result' type", false, 2, null);
    public static final j J = new j("TYPE_FOR_COMPILER_EXCEPTION", 32, "Error type for a compiler exception while analyzing %s", false, 2, null);
    public static final j K = new j("ERROR_FLEXIBLE_TYPE", 33, "Error java flexible type with id %s. (%s..%s)", false, 2, null);
    public static final j L = new j("ERROR_RAW_TYPE", 34, "Error raw type %s", false, 2, null);
    public static final j M = new j("TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS", 35, "Inconsistent type %s (parameters.size = %s, arguments.size = %s)", false, 2, null);
    public static final j N = new j("ILLEGAL_TYPE_RANGE_FOR_DYNAMIC", 36, "Illegal type range for dynamic type %s..%s", false, 2, null);
    public static final j P = new j("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME", 38, "Couldn't deserialize type parameter %s in %s", false, 2, null);
    public static final j Q = new j("INCONSISTENT_SUSPEND_FUNCTION", 39, "Inconsistent suspend function type in metadata with constructor %s", false, 2, null);
    public static final j R = new j("UNEXPECTED_FLEXIBLE_TYPE_ID", 40, "Unexpected id of a flexible type %s. (%s..%s)", false, 2, null);
    public static final j S = new j("UNKNOWN_TYPE", 41, "Unknown type", false, 2, null);
    public static final j T = new j("NO_TYPE_SPECIFIED", 42, "No type specified for %s", false, 2, null);
    public static final j U = new j("NO_TYPE_FOR_LOOP_RANGE", 43, "Loop range has no type", false, 2, null);
    public static final j V = new j("NO_TYPE_FOR_LOOP_PARAMETER", 44, "Loop parameter has no type", false, 2, null);
    public static final j X = new j("MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER", 46, "Missed a type argument for a type parameter %s", false, 2, null);
    public static final j Y = new j("PARSE_ERROR_ARGUMENT", 47, "Error type for parse error argument %s", false, 2, null);
    public static final j Z = new j("STAR_PROJECTION_IN_CALL", 48, "Error type for star projection directly passing as a call type argument", false, 2, null);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final j f122893a0 = new j("PROHIBITED_DYNAMIC_TYPE", 49, "Dynamic type in a not allowed context", false, 2, null);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final j f122894b0 = new j("NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT", 50, "Not an annotation type %s in the annotation context", false, 2, null);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final j f122895c0 = new j("UNIT_RETURN_TYPE_FOR_INC_DEC", 51, "Unit type returned by inc or dec", false, 2, null);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final j f122897d0 = new j("RETURN_NOT_ALLOWED", 52, "Return not allowed", false, 2, null);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final j f122899e0 = new j("UNRESOLVED_PARCEL_TYPE", 53, "Unresolved 'Parcel' type", true);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final j f122901f0 = new j("KAPT_ERROR_TYPE", 54, "Kapt error type", false, 2, null);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final j f122903g0 = new j("SYNTHETIC_ELEMENT_ERROR_TYPE", 55, "Error type for synthetic element", false, 2, null);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final j f122907i0 = new j("ERROR_EXPRESSION_TYPE", 57, "Error expression type", false, 2, null);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final j f122909j0 = new j("ERROR_RECEIVER_TYPE", 58, "Error receiver type for %s", false, 2, null);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final j f122911k0 = new j("ERROR_CONSTANT_VALUE", 59, "Error constant value %s", false, 2, null);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final j f122913l0 = new j("EMPTY_CALLABLE_REFERENCE", 60, "Empty callable reference", false, 2, null);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final j f122915m0 = new j("UNSUPPORTED_CALLABLE_REFERENCE_TYPE", 61, "Unsupported callable reference type %s", false, 2, null);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final j f122917n0 = new j("TYPE_FOR_DELEGATION", 62, "Error delegation type for %s", false, 2, null);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final j f122919o0 = new j("UNAVAILABLE_TYPE_FOR_DECLARATION", 63, "Type is unavailable for declaration %s", false, 2, null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final j f122923q0 = new j("ERROR_TYPE_PROJECTION", 65, "Error type projection", false, 2, null);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final j f122925r0 = new j("ERROR_SUPER_TYPE", 66, "Error super type", false, 2, null);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final j f122927s0 = new j("SUPER_TYPE_FOR_ERROR_TYPE", 67, "Supertype of error type %s", false, 2, null);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final j f122929t0 = new j("ERROR_PROPERTY_TYPE", 68, "Error property type", false, 2, null);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final j f122931u0 = new j("ERROR_CLASS", 69, "Error class", false, 2, null);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final j f122933v0 = new j("TYPE_FOR_ERROR_TYPE_CONSTRUCTOR", 70, "Type for error type constructor (%s)", false, 2, null);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final j f122935w0 = new j("INTERSECTION_OF_ERROR_TYPES", 71, "Intersection of error types %s", false, 2, null);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final j f122939y0 = new j("NOT_FOUND_UNSIGNED_TYPE", 73, "Unsigned type %s not found", false, 2, null);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final j f122941z0 = new j("ERROR_ENUM_TYPE", 74, "Not found the corresponding enum class for given enum entry %s.%s", false, 2, null);
    public static final j A0 = new j("NO_RECORDED_TYPE", 75, "Not found recorded type for %s", false, 2, null);
    public static final j B0 = new j("NOT_FOUND_DESCRIPTOR_FOR_FUNCTION", 76, "Descriptor not found for function %s", false, 2, null);
    public static final j C0 = new j("NOT_FOUND_DESCRIPTOR_FOR_CLASS", 77, "Cannot build class type, descriptor not found for builder %s", false, 2, null);
    public static final j D0 = new j("NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER", 78, "Cannot build type parameter type, descriptor not found for builder %s", false, 2, null);
    public static final j E0 = new j("UNMAPPED_ANNOTATION_TARGET_TYPE", 79, "Type for unmapped Java annotation target to Kotlin one", false, 2, null);
    public static final j G0 = new j("NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION", 81, "No fqName for annotation %s", false, 2, null);
    public static final j H0 = new j("NOT_FOUND_FQNAME", 82, "No fqName for %s", false, 2, null);
    public static final j I0 = new j("TYPE_FOR_GENERATED_ERROR_EXPRESSION", 83, "Type for generated error expression", false, 2, null);
    public static final /* synthetic */ j[] J0 = d();

    static {
        x xVar = null;
        f122922q = new j("IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR", 13, "Implicit return type for property accessor %s cannot be resolved", false, 2, xVar);
        f122938y = new j("UNINFERRED_LAMBDA_PARAMETER_TYPE", 21, "Cannot infer a lambda parameter type", false, 2, xVar);
        G = new j("STUB_TYPE", 29, "Stub type %s", false, 2, xVar);
        O = new j("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER", 37, "Unknown type parameter %s. Please try recompiling module containing \"%s\"", false, 2, xVar);
        W = new j("MISSED_TYPE_FOR_PARAMETER", 45, "Missed a type for a value parameter %s", false, 2, xVar);
        x xVar2 = null;
        f122905h0 = new j("AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE", 56, "Error type in ad hoc resolve for lighter classes", false, 2, xVar2);
        f122921p0 = new j("ERROR_TYPE_PARAMETER", 64, "Error type parameter", false, 2, xVar2);
        f122937x0 = new j("CANNOT_COMPUTE_ERASED_BOUND", 72, "Cannot compute erased upper bound of a type parameter %s", false, 2, xVar2);
        F0 = new j("UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT", 80, "Unknown type for an array element of a java annotation argument", false, 2, xVar2);
    }

    public j(String str, int i10, String str2, boolean z10) {
        super(str, i10);
        this.f122942b = str2;
        this.f122943c = z10;
    }

    public static final /* synthetic */ j[] d() {
        return new j[]{f122896d, f122898e, f122900f, f122902g, f122904h, f122906i, f122908j, f122910k, f122912l, f122914m, f122916n, f122918o, f122920p, f122922q, f122924r, f122926s, f122928t, f122930u, f122932v, f122934w, f122936x, f122938y, f122940z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, f122893a0, f122894b0, f122895c0, f122897d0, f122899e0, f122901f0, f122903g0, f122905h0, f122907i0, f122909j0, f122911k0, f122913l0, f122915m0, f122917n0, f122919o0, f122921p0, f122923q0, f122925r0, f122927s0, f122929t0, f122931u0, f122933v0, f122935w0, f122937x0, f122939y0, f122941z0, A0, B0, C0, D0, E0, F0, G0, H0, I0};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) J0.clone();
    }

    @oy.l
    public final String g() {
        return this.f122942b;
    }

    public final boolean h() {
        return this.f122943c;
    }

    public /* synthetic */ j(String str, int i10, String str2, boolean z10, int i11, x xVar) {
        this(str, i10, str2, (i11 & 2) != 0 ? false : z10);
    }
}
