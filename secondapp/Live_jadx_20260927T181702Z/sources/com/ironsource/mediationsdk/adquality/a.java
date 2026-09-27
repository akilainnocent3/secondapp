package com.ironsource.mediationsdk.adquality;

import com.ironsource.C4276f9;
import com.ironsource.EnumC4512se;
import com.ironsource.Q6;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import org.json.JSONArray;
import org.json.JSONException;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@s1({"SMAP\nAdQualityConfigurations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdQualityConfigurations.kt\ncom/ironsource/mediationsdk/adquality/AdQualityConfigurations\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public static final b f62398a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    private static EnumC0584a f62399b = EnumC0584a.DONT_INITIALIZE;

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.adquality.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum EnumC0584a {
        DONT_INITIALIZE(0),
        LEVELPLAY_ONLY(1),
        ALL_MEDIATIONS(2),
        OTHER_ONLY(3);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @l
        public static final C0585a f62400b = new C0585a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f62406a;

        /* JADX INFO: renamed from: com.ironsource.mediationsdk.adquality.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @s1({"SMAP\nAdQualityConfigurations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdQualityConfigurations.kt\ncom/ironsource/mediationsdk/adquality/AdQualityConfigurations$AdQualitySdkInitMode$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"})
        public static final class C0585a {
            public /* synthetic */ C0585a(x xVar) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0017  */
            /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
            @l
            public final EnumC0584a a(int i10) {
                for (EnumC0584a enumC0584a : EnumC0584a.values()) {
                    if (enumC0584a.b() == i10) {
                        if (enumC0584a == null) {
                            return EnumC0584a.DONT_INITIALIZE;
                        }
                        return enumC0584a;
                    }
                }
                enumC0584a = null;
                if (enumC0584a == null) {
                    return EnumC0584a.DONT_INITIALIZE;
                }
                return enumC0584a;
            }

            private C0585a() {
            }
        }

        EnumC0584a(int i10) {
            this.f62406a = i10;
        }

        public final int b() {
            return this.f62406a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {
        public /* synthetic */ b(x xVar) {
            this();
        }

        @l
        public final EnumC0584a a() {
            return a.f62399b;
        }

        private b() {
        }

        public final void a(@l EnumC0584a enumC0584a) {
            m0.p(enumC0584a, "<set-?>");
            a.f62399b = enumC0584a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62407a;

        static {
            int[] iArr = new int[EnumC0584a.values().length];
            try {
                iArr[EnumC0584a.LEVELPLAY_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0584a.ALL_MEDIATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0584a.OTHER_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f62407a = iArr;
        }
    }

    public final boolean b() throws JSONException {
        EnumC4512se enumC4512se;
        JSONArray jSONArrayOptJSONArray = new C4276f9().a().optJSONArray(Q6.f59870g0);
        if (jSONArrayOptJSONArray == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArrayOptJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = jSONArrayOptJSONArray.getInt(i10);
            EnumC4512se[] enumC4512seArrValues = EnumC4512se.values();
            int length2 = enumC4512seArrValues.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    enumC4512se = null;
                    break;
                }
                enumC4512se = enumC4512seArrValues[i12];
                if (enumC4512se.b() == i11) {
                    break;
                }
                i12++;
            }
            if (enumC4512se != null) {
                linkedHashSet.add(enumC4512se);
            }
        }
        int i13 = c.f62407a[f62399b.ordinal()];
        if (i13 == 1) {
            return linkedHashSet.contains(EnumC4512se.LEVEL_PLAY_INIT);
        }
        if (i13 != 2) {
            if (i13 == 3) {
                return linkedHashSet.contains(EnumC4512se.EXTERNAL_MEDIATION_INIT);
            }
        } else if (linkedHashSet.contains(EnumC4512se.LEVEL_PLAY_INIT) || linkedHashSet.contains(EnumC4512se.EXTERNAL_MEDIATION_INIT)) {
            return true;
        }
        return false;
    }

    public final void a(int i10) {
        f62399b = EnumC0584a.f62400b.a(i10);
    }
}
