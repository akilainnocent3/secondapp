package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.d7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC4238d7 {
    SendEvent(0),
    NativeController(1);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final a f61529b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f61533a;

    /* JADX INFO: renamed from: com.ironsource.d7$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @kotlin.jvm.internal.s1({"SMAP\nHealthCheckRecoveryStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthCheckRecoveryStrategy.kt\ncom/ironsource/sdk/controller/communication/HealthCheckRecoveryStrategy$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,13:1\n1282#2,2:14\n*S KotlinDebug\n*F\n+ 1 HealthCheckRecoveryStrategy.kt\ncom/ironsource/sdk/controller/communication/HealthCheckRecoveryStrategy$Companion\n*L\n9#1:14,2\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        @oy.l
        public final EnumC4238d7 a(int i10) {
            for (EnumC4238d7 enumC4238d7 : EnumC4238d7.values()) {
                if (enumC4238d7.b() == i10) {
                    if (enumC4238d7 == null) {
                        return EnumC4238d7.SendEvent;
                    }
                    return enumC4238d7;
                }
            }
            enumC4238d7 = null;
            if (enumC4238d7 == null) {
                return EnumC4238d7.SendEvent;
            }
            return enumC4238d7;
        }

        private a() {
        }
    }

    EnumC4238d7(int i10) {
        this.f61533a = i10;
    }

    public final int b() {
        return this.f61533a;
    }
}
