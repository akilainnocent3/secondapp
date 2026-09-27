package ew;

import cv.w0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@zv.g
public interface f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final a f81750a = a.f81751a;

    @oy.l
    String a(@oy.l bw.f fVar, int i10, @oy.l String str);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nJsonNamingStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonNamingStrategy.kt\nkotlinx/serialization/json/JsonNamingStrategy$Builtins\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1179#2:179\n1180#2:181\n1#3:180\n*S KotlinDebug\n*F\n+ 1 JsonNamingStrategy.kt\nkotlinx/serialization/json/JsonNamingStrategy$Builtins\n*L\n149#1:179\n149#1:181\n*E\n"})
    @zv.g
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f81751a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final f0 f81752b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public static final f0 f81753c = new C0802a();

        /* JADX INFO: renamed from: ew.f0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0802a implements f0 {
            @Override // ew.f0
            public String a(bw.f descriptor, int i10, String serialName) {
                kotlin.jvm.internal.m0.p(descriptor, "descriptor");
                kotlin.jvm.internal.m0.p(serialName, "serialName");
                return a.f81751a.b(serialName, '-');
            }

            public String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.KebabCase";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class b implements f0 {
            @Override // ew.f0
            public String a(bw.f descriptor, int i10, String serialName) {
                kotlin.jvm.internal.m0.p(descriptor, "descriptor");
                kotlin.jvm.internal.m0.p(serialName, "serialName");
                return a.f81751a.b(serialName, '_');
            }

            public String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.SnakeCase";
            }
        }

        public final String b(String str, char c10) {
            StringBuilder sb2 = new StringBuilder(str.length() * 2);
            Character chValueOf = null;
            int i10 = 0;
            for (int i11 = 0; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    if (i10 == 0 && sb2.length() > 0 && w0.W7(sb2) != c10) {
                        sb2.append(c10);
                    }
                    if (chValueOf != null) {
                        sb2.append(chValueOf.charValue());
                    }
                    i10++;
                    chValueOf = Character.valueOf(Character.toLowerCase(cCharAt));
                } else {
                    if (chValueOf != null) {
                        if (i10 > 1 && Character.isLetter(cCharAt)) {
                            sb2.append(c10);
                        }
                        sb2.append(chValueOf.charValue());
                        chValueOf = null;
                        i10 = 0;
                    }
                    sb2.append(cCharAt);
                }
            }
            if (chValueOf != null) {
                sb2.append(chValueOf.charValue());
            }
            String string = sb2.toString();
            kotlin.jvm.internal.m0.o(string, "toString(...)");
            return string;
        }

        @oy.l
        public final f0 c() {
            return f81753c;
        }

        @oy.l
        public final f0 e() {
            return f81752b;
        }

        @zv.g
        public static /* synthetic */ void d() {
        }

        @zv.g
        public static /* synthetic */ void f() {
        }
    }
}
