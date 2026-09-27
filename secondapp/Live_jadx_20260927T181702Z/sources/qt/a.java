package qt;

import cs.o;
import fr.h0;
import fr.m1;
import fr.q;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import ms.u;
import oy.l;
import oy.m;
import vt.e;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nKotlinClassHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public final EnumC1194a f122813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public final e f122814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @m
    public final String[] f122815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @m
    public final String[] f122816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @m
    public final String[] f122817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @m
    public final String f122818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f122819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @m
    public final String f122820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @m
    public final byte[] f122821i;

    /* JADX INFO: renamed from: qt.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nKotlinClassHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader$Kind\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,78:1\n8811#2,2:79\n9071#2,4:81\n*S KotlinDebug\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader$Kind\n*L\n34#1:79,2\n34#1:81,4\n*E\n"})
    public enum EnumC1194a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @l
        public static final C1195a f122822c = new C1195a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @l
        public static final Map<Integer, EnumC1194a> f122823d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f122831b;

        /* JADX INFO: renamed from: qt.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C1195a {
            public /* synthetic */ C1195a(x xVar) {
                this();
            }

            @l
            @o
            public final EnumC1194a a(int i10) {
                EnumC1194a enumC1194a = (EnumC1194a) EnumC1194a.f122823d.get(Integer.valueOf(i10));
                return enumC1194a == null ? EnumC1194a.UNKNOWN : enumC1194a;
            }

            public C1195a() {
            }
        }

        static {
            EnumC1194a[] enumC1194aArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(m1.j(enumC1194aArrValues.length), 16));
            for (EnumC1194a enumC1194a : enumC1194aArrValues) {
                linkedHashMap.put(Integer.valueOf(enumC1194a.f122831b), enumC1194a);
            }
            f122823d = linkedHashMap;
        }

        EnumC1194a(int i10) {
            this.f122831b = i10;
        }

        @l
        @o
        public static final EnumC1194a h(int i10) {
            return f122822c.a(i10);
        }
    }

    public a(@l EnumC1194a kind, @l e metadataVersion, @m String[] strArr, @m String[] strArr2, @m String[] strArr3, @m String str, int i10, @m String str2, @m byte[] bArr) {
        m0.p(kind, "kind");
        m0.p(metadataVersion, "metadataVersion");
        this.f122813a = kind;
        this.f122814b = metadataVersion;
        this.f122815c = strArr;
        this.f122816d = strArr2;
        this.f122817e = strArr3;
        this.f122818f = str;
        this.f122819g = i10;
        this.f122820h = str2;
        this.f122821i = bArr;
    }

    @m
    public final String[] a() {
        return this.f122815c;
    }

    @m
    public final String[] b() {
        return this.f122816d;
    }

    @l
    public final EnumC1194a c() {
        return this.f122813a;
    }

    @l
    public final e d() {
        return this.f122814b;
    }

    @m
    public final String e() {
        String str = this.f122818f;
        if (this.f122813a == EnumC1194a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    @l
    public final List<String> f() {
        String[] strArr = this.f122815c;
        if (this.f122813a != EnumC1194a.MULTIFILE_CLASS) {
            strArr = null;
        }
        List<String> listT = strArr != null ? q.t(strArr) : null;
        return listT == null ? h0.J() : listT;
    }

    @m
    public final String[] g() {
        return this.f122817e;
    }

    public final boolean h(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public final boolean i() {
        return h(this.f122819g, 2);
    }

    public final boolean j() {
        return h(this.f122819g, 64) && !h(this.f122819g, 32);
    }

    public final boolean k() {
        return h(this.f122819g, 16) && !h(this.f122819g, 32);
    }

    @l
    public String toString() {
        return this.f122813a + " version=" + this.f122814b;
    }
}
