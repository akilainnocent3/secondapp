package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.z4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC4621z4 {
    IADS("iads"),
    UADS("uads"),
    SHARED("shared"),
    NONE("none");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final a f64550b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String f64556a;

    /* JADX INFO: renamed from: com.ironsource.z4$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @kotlin.jvm.internal.s1({"SMAP\nDSSharedSignalSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DSSharedSignalSource.kt\ncom/unity3d/sdk/signals/ds/DSSharedSignalSource$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n1282#2,2:23\n*S KotlinDebug\n*F\n+ 1 DSSharedSignalSource.kt\ncom/unity3d/sdk/signals/ds/DSSharedSignalSource$Companion\n*L\n18#1:23,2\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001b  */
        /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
        @oy.l
        @cs.o
        public final EnumC4621z4 a(@oy.m String str) {
            for (EnumC4621z4 enumC4621z4 : EnumC4621z4.values()) {
                if (kotlin.jvm.internal.m0.g(enumC4621z4.b(), str)) {
                    if (enumC4621z4 == null) {
                        return EnumC4621z4.NONE;
                    }
                    return enumC4621z4;
                }
            }
            enumC4621z4 = null;
            if (enumC4621z4 == null) {
                return EnumC4621z4.NONE;
            }
            return enumC4621z4;
        }

        private a() {
        }
    }

    EnumC4621z4(String str) {
        this.f64556a = str;
    }

    @oy.l
    public final String b() {
        return this.f64556a;
    }

    @oy.l
    @cs.o
    public static final EnumC4621z4 a(@oy.m String str) {
        return f64550b.a(str);
    }
}
