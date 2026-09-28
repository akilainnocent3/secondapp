package defpackage;

import com.twilio.voice.VoiceURLConnection;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import kotlin.Unit;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ef80<T> {
    /* JADX WARN: Code duplicated, block: B:386:0x08d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:387:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:588:0x08f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:0x08db A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static zpm b(on50 on50Var, Class cls, Method method) {
        x7u x7uVar;
        Type genericReturnType;
        boolean z;
        boolean z2;
        urz<?> urzVar;
        int i;
        int i2;
        urz<?>[] urzVarArr;
        int i3;
        int i4;
        urz<?> oVar;
        urz<?> gVar;
        urz<?> trzVar;
        urz<?> trzVar2;
        ra50.a aVar = new ra50.a(on50Var, cls, method);
        Annotation[] annotationArr = aVar.d;
        int length = annotationArr.length;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String str = "HEAD";
            boolean z3 = true;
            urz<?> urzVar2 = null;
            if (i6 >= length) {
                if (aVar.o == null) {
                    throw urh0.i(method, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!aVar.p) {
                    if (aVar.r) {
                        throw urh0.i(method, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (aVar.q) {
                        throw urh0.i(method, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr2 = aVar.e;
                int length2 = annotationArr2.length;
                aVar.w = new urz[length2];
                int i7 = length2 - 1;
                int i8 = 0;
                while (i8 < length2) {
                    urz<?>[] urzVarArr2 = aVar.w;
                    Type type = aVar.f[i8];
                    Annotation[] annotationArr3 = annotationArr2[i8];
                    int i9 = i8 == i7 ? 1 : i5;
                    if (annotationArr3 != null) {
                        int length3 = annotationArr3.length;
                        urzVar = urzVar2;
                        int i10 = i5;
                        while (i10 < length3) {
                            Annotation annotation = annotationArr3[i10];
                            Annotation[][] annotationArr4 = annotationArr2;
                            int i11 = length2;
                            if (annotation instanceof qmh0) {
                                aVar.c(i8, type);
                                if (aVar.n) {
                                    throw urh0.j(method, i8, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (aVar.j) {
                                    throw urh0.j(method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (aVar.k) {
                                    throw urh0.j(method, i8, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (aVar.l) {
                                    throw urh0.j(method, i8, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (aVar.m) {
                                    throw urh0.j(method, i8, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (aVar.s != null) {
                                    throw urh0.j(method, i8, "@Url cannot be used with @%s URL", aVar.o);
                                }
                                aVar.n = true;
                                if (type != HttpUrl.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw urh0.j(method, i8, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                oVar = new urz.n(i8, method);
                                i = i7;
                            } else {
                                i = i7;
                                boolean z4 = annotation instanceof dxz;
                                on50 on50Var2 = aVar.a;
                                if (z4) {
                                    aVar.c(i8, type);
                                    if (aVar.k) {
                                        throw urh0.j(method, i8, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (aVar.l) {
                                        throw urh0.j(method, i8, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (aVar.m) {
                                        throw urh0.j(method, i8, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (aVar.n) {
                                        throw urh0.j(method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (aVar.s == null) {
                                        throw urh0.j(method, i8, "@Path can only be used with relative url on @%s", aVar.o);
                                    }
                                    aVar.j = true;
                                    dxz dxzVar = (dxz) annotation;
                                    String strValue = dxzVar.value();
                                    if (!ra50.a.z.matcher(strValue).matches()) {
                                        throw urh0.j(method, i8, "@Path parameter name must match %s. Found: %s", ra50.a.y.pattern(), strValue);
                                    }
                                    if (!aVar.v.contains(strValue)) {
                                        throw urh0.j(method, i8, "URL \"%s\" does not contain \"{%s}\".", aVar.s, strValue);
                                    }
                                    on50Var2.e(type, annotationArr3);
                                    oVar = new urz.i(aVar.c, i8, strValue, dxzVar.encoded());
                                } else {
                                    i2 = i10;
                                    urzVarArr = urzVarArr2;
                                    if (annotation instanceof db30) {
                                        aVar.c(i8, type);
                                        db30 db30Var = (db30) annotation;
                                        String strValue2 = db30Var.value();
                                        boolean zEncoded = db30Var.encoded();
                                        i3 = i9;
                                        Class<?> clsE = urh0.e(type);
                                        i4 = length3;
                                        aVar.k = true;
                                        if (!Iterable.class.isAssignableFrom(clsE)) {
                                            if (clsE.isArray()) {
                                                on50Var2.e(ra50.a.a(clsE.getComponentType()), annotationArr3);
                                                trzVar2 = new trz(new urz.j(strValue2, zEncoded));
                                            } else {
                                                on50Var2.e(type, annotationArr3);
                                                oVar = new urz.j<>(strValue2, zEncoded);
                                            }
                                            str = str;
                                        } else {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw urh0.j(method, i8, clsE.getSimpleName() + " must include generic type (e.g., " + clsE.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            on50Var2.e(urh0.d(0, (ParameterizedType) type), annotationArr3);
                                            trzVar2 = new srz(new urz.j(strValue2, zEncoded));
                                        }
                                        oVar = trzVar2;
                                        str = str;
                                    } else {
                                        i3 = i9;
                                        i4 = length3;
                                        if (annotation instanceof fb30) {
                                            aVar.c(i8, type);
                                            boolean zEncoded2 = ((fb30) annotation).encoded();
                                            Class<?> clsE2 = urh0.e(type);
                                            aVar.l = true;
                                            if (Iterable.class.isAssignableFrom(clsE2)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw urh0.j(method, i8, clsE2.getSimpleName() + " must include generic type (e.g., " + clsE2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                on50Var2.e(urh0.d(0, (ParameterizedType) type), annotationArr3);
                                                trzVar2 = new srz(new urz.l(zEncoded2));
                                            } else if (clsE2.isArray()) {
                                                on50Var2.e(ra50.a.a(clsE2.getComponentType()), annotationArr3);
                                                trzVar2 = new trz(new urz.l(zEncoded2));
                                            } else {
                                                on50Var2.e(type, annotationArr3);
                                                oVar = new urz.l<>(zEncoded2);
                                            }
                                            oVar = trzVar2;
                                        } else if (annotation instanceof eb30) {
                                            aVar.c(i8, type);
                                            Class<?> clsE3 = urh0.e(type);
                                            aVar.m = true;
                                            if (!Map.class.isAssignableFrom(clsE3)) {
                                                throw urh0.j(method, i8, "@QueryMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type typeF = urh0.f(type, clsE3);
                                            if (!(typeF instanceof ParameterizedType)) {
                                                throw urh0.j(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType = (ParameterizedType) typeF;
                                            Type typeD = urh0.d(0, parameterizedType);
                                            if (String.class != typeD) {
                                                throw urh0.j(method, i8, "@QueryMap keys must be of type String: " + typeD, new Object[0]);
                                            }
                                            on50Var2.e(urh0.d(1, parameterizedType), annotationArr3);
                                            oVar = new urz.k<>(method, i8, ((eb30) annotation).encoded());
                                        } else {
                                            str = str;
                                            if (annotation instanceof rhl) {
                                                aVar.c(i8, type);
                                                rhl rhlVar = (rhl) annotation;
                                                String strValue3 = rhlVar.value();
                                                Class<?> clsE4 = urh0.e(type);
                                                if (Iterable.class.isAssignableFrom(clsE4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw urh0.j(method, i8, clsE4.getSimpleName() + " must include generic type (e.g., " + clsE4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    on50Var2.e(urh0.d(0, (ParameterizedType) type), annotationArr3);
                                                    gVar = new srz(new urz.d(strValue3, rhlVar.allowUnsafeNonAsciiValues()));
                                                } else if (clsE4.isArray()) {
                                                    on50Var2.e(ra50.a.a(clsE4.getComponentType()), annotationArr3);
                                                    gVar = new trz(new urz.d(strValue3, rhlVar.allowUnsafeNonAsciiValues()));
                                                } else {
                                                    on50Var2.e(type, annotationArr3);
                                                    oVar = new urz.d<>(strValue3, rhlVar.allowUnsafeNonAsciiValues());
                                                }
                                                oVar = gVar;
                                            } else if (annotation instanceof zhl) {
                                                if (type == Headers.class) {
                                                    oVar = new urz.f(i8, method);
                                                } else {
                                                    aVar.c(i8, type);
                                                    Class<?> clsE5 = urh0.e(type);
                                                    if (!Map.class.isAssignableFrom(clsE5)) {
                                                        throw urh0.j(method, i8, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                    Type typeF2 = urh0.f(type, clsE5);
                                                    if (!(typeF2 instanceof ParameterizedType)) {
                                                        throw urh0.j(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeF2;
                                                    Type typeD2 = urh0.d(0, parameterizedType2);
                                                    if (String.class != typeD2) {
                                                        throw urh0.j(method, i8, "@HeaderMap keys must be of type String: " + typeD2, new Object[0]);
                                                    }
                                                    on50Var2.e(urh0.d(1, parameterizedType2), annotationArr3);
                                                    oVar = new urz.e<>(method, i8, ((zhl) annotation).allowUnsafeNonAsciiValues());
                                                }
                                            } else if (annotation instanceof gjh) {
                                                aVar.c(i8, type);
                                                if (!aVar.q) {
                                                    throw urh0.j(method, i8, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                gjh gjhVar = (gjh) annotation;
                                                String strValue4 = gjhVar.value();
                                                boolean zEncoded3 = gjhVar.encoded();
                                                aVar.g = true;
                                                Class<?> clsE6 = urh0.e(type);
                                                if (Iterable.class.isAssignableFrom(clsE6)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw urh0.j(method, i8, clsE6.getSimpleName() + " must include generic type (e.g., " + clsE6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    on50Var2.e(urh0.d(0, (ParameterizedType) type), annotationArr3);
                                                    gVar = new srz(new urz.b(strValue4, zEncoded3));
                                                } else if (clsE6.isArray()) {
                                                    on50Var2.e(ra50.a.a(clsE6.getComponentType()), annotationArr3);
                                                    gVar = new trz(new urz.b(strValue4, zEncoded3));
                                                } else {
                                                    on50Var2.e(type, annotationArr3);
                                                    oVar = new urz.b<>(strValue4, zEncoded3);
                                                }
                                                oVar = gVar;
                                            } else if (annotation instanceof ijh) {
                                                aVar.c(i8, type);
                                                if (!aVar.q) {
                                                    throw urh0.j(method, i8, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class<?> clsE7 = urh0.e(type);
                                                if (!Map.class.isAssignableFrom(clsE7)) {
                                                    throw urh0.j(method, i8, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeF3 = urh0.f(type, clsE7);
                                                if (!(typeF3 instanceof ParameterizedType)) {
                                                    throw urh0.j(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeF3;
                                                Type typeD3 = urh0.d(0, parameterizedType3);
                                                if (String.class != typeD3) {
                                                    throw urh0.j(method, i8, "@FieldMap keys must be of type String: " + typeD3, new Object[0]);
                                                }
                                                on50Var2.e(urh0.d(1, parameterizedType3), annotationArr3);
                                                aVar.g = true;
                                                oVar = new urz.c<>(method, i8, ((ijh) annotation).encoded());
                                            } else if (annotation instanceof usz) {
                                                aVar.c(i8, type);
                                                if (!aVar.r) {
                                                    throw urh0.j(method, i8, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                usz uszVar = (usz) annotation;
                                                aVar.h = true;
                                                String strValue5 = uszVar.value();
                                                Class<?> clsE8 = urh0.e(type);
                                                if (strValue5.isEmpty()) {
                                                    boolean zIsAssignableFrom = Iterable.class.isAssignableFrom(clsE8);
                                                    urz.m mVar = urz.m.a;
                                                    if (zIsAssignableFrom) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw urh0.j(method, i8, clsE8.getSimpleName() + " must include generic type (e.g., " + clsE8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        if (!MultipartBody.Part.class.isAssignableFrom(urh0.e(urh0.d(0, (ParameterizedType) type)))) {
                                                            throw urh0.j(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        oVar = new srz(mVar);
                                                    } else if (clsE8.isArray()) {
                                                        if (!MultipartBody.Part.class.isAssignableFrom(clsE8.getComponentType())) {
                                                            throw urh0.j(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        oVar = new trz(mVar);
                                                    } else {
                                                        if (!MultipartBody.Part.class.isAssignableFrom(clsE8)) {
                                                            throw urh0.j(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        oVar = mVar;
                                                    }
                                                } else {
                                                    Headers headersOf = Headers.of("Content-Disposition", tug.a("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", uszVar.encoding());
                                                    if (Iterable.class.isAssignableFrom(clsE8)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw urh0.j(method, i8, clsE8.getSimpleName() + " must include generic type (e.g., " + clsE8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        Type typeD4 = urh0.d(0, (ParameterizedType) type);
                                                        if (MultipartBody.Part.class.isAssignableFrom(urh0.e(typeD4))) {
                                                            throw urh0.j(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        trzVar = new srz(new urz.g(method, i8, headersOf, on50Var2.c(typeD4, annotationArr3, annotationArr)));
                                                    } else if (clsE8.isArray()) {
                                                        Class<?> clsA = ra50.a.a(clsE8.getComponentType());
                                                        if (MultipartBody.Part.class.isAssignableFrom(clsA)) {
                                                            throw urh0.j(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        trzVar = new trz(new urz.g(method, i8, headersOf, on50Var2.c(clsA, annotationArr3, annotationArr)));
                                                    } else {
                                                        if (MultipartBody.Part.class.isAssignableFrom(clsE8)) {
                                                            throw urh0.j(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        gVar = new urz.g<>(method, i8, headersOf, on50Var2.c(type, annotationArr3, annotationArr));
                                                        oVar = gVar;
                                                    }
                                                    oVar = trzVar;
                                                }
                                            } else if (annotation instanceof vsz) {
                                                aVar.c(i8, type);
                                                if (!aVar.r) {
                                                    throw urh0.j(method, i8, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                aVar.h = true;
                                                Class<?> clsE9 = urh0.e(type);
                                                if (!Map.class.isAssignableFrom(clsE9)) {
                                                    throw urh0.j(method, i8, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeF4 = urh0.f(type, clsE9);
                                                if (!(typeF4 instanceof ParameterizedType)) {
                                                    throw urh0.j(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) typeF4;
                                                Type typeD5 = urh0.d(0, parameterizedType4);
                                                if (String.class != typeD5) {
                                                    throw urh0.j(method, i8, "@PartMap keys must be of type String: " + typeD5, new Object[0]);
                                                }
                                                Type typeD6 = urh0.d(1, parameterizedType4);
                                                if (MultipartBody.Part.class.isAssignableFrom(urh0.e(typeD6))) {
                                                    throw urh0.j(method, i8, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                oVar = new urz.h<>(method, i8, on50Var2.c(typeD6, annotationArr3, annotationArr), ((vsz) annotation).encoding());
                                            } else if (annotation instanceof jh4) {
                                                aVar.c(i8, type);
                                                if (aVar.q || aVar.r) {
                                                    throw urh0.j(method, i8, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (aVar.i) {
                                                    throw urh0.j(method, i8, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    y2b<T, RequestBody> y2bVarC = on50Var2.c(type, annotationArr3, annotationArr);
                                                    aVar.i = true;
                                                    oVar = new urz.a<>(method, i8, y2bVarC);
                                                } catch (RuntimeException e) {
                                                    throw urh0.k(method, e, i8, "Unable to create @Body converter for %s", type);
                                                }
                                            } else if (annotation instanceof b4f0) {
                                                aVar.c(i8, type);
                                                Class<?> clsA2 = ra50.a.a(urh0.e(type));
                                                for (int i12 = i8 - 1; i12 >= 0; i12--) {
                                                    urz<?> urzVar3 = aVar.w[i12];
                                                    if ((urzVar3 instanceof urz.o) && ((urz.o) urzVar3).a.equals(clsA2)) {
                                                        throw urh0.j(method, i8, "@Tag type " + clsA2.getName() + " is duplicate of " + qi10.b.a(i12, method) + " and would always overwrite its value.", new Object[0]);
                                                    }
                                                }
                                                oVar = new urz.o<>(clsA2);
                                            } else {
                                                oVar = null;
                                            }
                                        }
                                        str = str;
                                    }
                                }
                                if (oVar != null) {
                                    if (urzVar == null) {
                                        throw urh0.j(method, i8, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                    }
                                    urzVar = oVar;
                                }
                                i10 = i2 + 1;
                                annotationArr2 = annotationArr4;
                                i7 = i;
                                length2 = i11;
                                i9 = i3;
                                urzVarArr2 = urzVarArr;
                                length3 = i4;
                                str = str;
                            }
                            i2 = i10;
                            urzVarArr = urzVarArr2;
                            i3 = i9;
                            i4 = length3;
                            if (oVar != null) {
                                if (urzVar == null) {
                                    throw urh0.j(method, i8, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                urzVar = oVar;
                            }
                            i10 = i2 + 1;
                            annotationArr2 = annotationArr4;
                            i7 = i;
                            length2 = i11;
                            i9 = i3;
                            urzVarArr2 = urzVarArr;
                            length3 = i4;
                            str = str;
                        }
                    } else {
                        urzVar = null;
                    }
                    Annotation[][] annotationArr5 = annotationArr2;
                    int i13 = length2;
                    String str2 = str;
                    int i14 = i7;
                    urz<?>[] urzVarArr3 = urzVarArr2;
                    int i15 = i9;
                    if (urzVar == null) {
                        if (i15 != 0) {
                            try {
                                if (urh0.e(type) == v1b.class) {
                                    aVar.x = true;
                                    urzVar = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw urh0.j(method, i8, "No Retrofit annotation found.", new Object[0]);
                    }
                    urzVarArr3[i8] = urzVar;
                    i8++;
                    annotationArr2 = annotationArr5;
                    i7 = i14;
                    length2 = i13;
                    str = str2;
                    i5 = 0;
                    urzVar2 = null;
                }
                String str3 = str;
                if (aVar.s == null && !aVar.n) {
                    throw urh0.i(method, null, "Missing either @%s URL or @Url parameter.", aVar.o);
                }
                boolean z5 = aVar.q;
                if (!z5 && !aVar.r && !aVar.p && aVar.i) {
                    throw urh0.i(method, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z5 && !aVar.g) {
                    throw urh0.i(method, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (aVar.r && !aVar.h) {
                    throw urh0.i(method, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                ra50 ra50Var = new ra50(aVar);
                Type genericReturnType2 = method.getGenericReturnType();
                if (urh0.g(genericReturnType2)) {
                    throw urh0.i(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw urh0.i(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z6 = ra50Var.l;
                if (z6) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type typeD7 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (typeD7 instanceof WildcardType) {
                        typeD7 = ((WildcardType) typeD7).getLowerBounds()[0];
                    }
                    if (urh0.e(typeD7) == bi50.class && (typeD7 instanceof ParameterizedType)) {
                        typeD7 = urh0.d(0, (ParameterizedType) typeD7);
                        z = true;
                        z2 = false;
                    } else {
                        if (urh0.e(typeD7) == su5.class) {
                            throw urh0.i(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", urh0.d(0, (ParameterizedType) typeD7));
                        }
                        z2 = urh0.b && typeD7 == Unit.class;
                        z = false;
                    }
                    genericReturnType = new urh0.b(null, su5.class, typeD7);
                    if (!urh0.h(annotations, ny90.class)) {
                        Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                        annotationArr6[0] = oy90.a;
                        System.arraycopy(annotations, 0, annotationArr6, 1, annotations.length);
                        annotations = annotationArr6;
                    }
                    x7uVar = null;
                } else {
                    x7uVar = null;
                    genericReturnType = method.getGenericReturnType();
                    z = false;
                    z2 = false;
                }
                try {
                    tu5 tu5VarB = on50Var.b(x7uVar, genericReturnType, annotations);
                    Type typeA = tu5VarB.a();
                    if (typeA == Response.class) {
                        throw urh0.i(method, null, "'" + urh0.e(typeA).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeA == bi50.class) {
                        throw urh0.i(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (ra50Var.d.equals(str3) && !Void.class.equals(typeA) && (!urh0.b || typeA != Unit.class)) {
                        throw urh0.i(method, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        y2b<ResponseBody, T> y2bVarD = on50Var.d(typeA, method.getAnnotations());
                        Call.Factory factory = on50Var.b;
                        if (z6) {
                            return z ? new zpm.c(ra50Var, factory, y2bVarD, tu5VarB) : new zpm.b(ra50Var, factory, y2bVarD, tu5VarB, z2);
                        }
                        return new zpm.a(ra50Var, factory, y2bVarD, tu5VarB);
                    } catch (RuntimeException e2) {
                        throw urh0.i(method, e2, "Unable to create converter for %s", typeA);
                    }
                } catch (RuntimeException e3) {
                    throw urh0.i(method, e3, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr[i6];
            if (annotation2 instanceof amc) {
                aVar.b(VoiceURLConnection.METHOD_TYPE_DELETE, ((amc) annotation2).value(), false);
            } else if (annotation2 instanceof sbj) {
                aVar.b("GET", ((sbj) annotation2).value(), false);
            } else if (annotation2 instanceof ebl) {
                aVar.b("HEAD", ((ebl) annotation2).value(), false);
            } else if (annotation2 instanceof ljz) {
                aVar.b("PATCH", ((ljz) annotation2).value(), true);
            } else if (annotation2 instanceof flz) {
                aVar.b(VoiceURLConnection.METHOD_TYPE_POST, ((flz) annotation2).value(), true);
            } else if (annotation2 instanceof gmz) {
                aVar.b("PUT", ((gmz) annotation2).value(), true);
            } else if (annotation2 instanceof bay) {
                aVar.b("OPTIONS", ((bay) annotation2).value(), false);
            } else if (annotation2 instanceof fbl) {
                fbl fblVar = (fbl) annotation2;
                aVar.b(fblVar.method(), fblVar.path(), fblVar.hasBody());
            } else if (annotation2 instanceof gil) {
                gil gilVar = (gil) annotation2;
                String[] strArrValue = gilVar.value();
                if (strArrValue.length == 0) {
                    throw urh0.i(method, null, "@Headers annotation is empty.", new Object[0]);
                }
                boolean zAllowUnsafeNonAsciiValues = gilVar.allowUnsafeNonAsciiValues();
                Headers.Builder builder = new Headers.Builder();
                int length4 = strArrValue.length;
                int i16 = 0;
                while (i16 < length4) {
                    String str4 = strArrValue[i16];
                    int iIndexOf = str4.indexOf(58);
                    boolean z7 = z3;
                    if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str4.length() - 1) {
                        throw urh0.i(method, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str4);
                    }
                    String strSubstring = str4.substring(0, iIndexOf);
                    String strTrim = str4.substring(iIndexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                        try {
                            aVar.u = MediaType.get(strTrim);
                        } catch (IllegalArgumentException e4) {
                            throw urh0.i(method, e4, "Malformed content type: %s", strTrim);
                        }
                    } else if (zAllowUnsafeNonAsciiValues) {
                        builder.addUnsafeNonAscii(strSubstring, strTrim);
                    } else {
                        builder.add(strSubstring, strTrim);
                    }
                    i16++;
                    z3 = z7;
                }
                aVar.t = builder.build();
            } else if (annotation2 instanceof jmw) {
                if (aVar.q) {
                    throw urh0.i(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                aVar.r = true;
            } else if (!(annotation2 instanceof tti)) {
                continue;
            } else {
                if (aVar.r) {
                    throw urh0.i(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                aVar.q = true;
            }
            i6++;
        }
    }

    public abstract T a(Object obj, Object[] objArr);
}
